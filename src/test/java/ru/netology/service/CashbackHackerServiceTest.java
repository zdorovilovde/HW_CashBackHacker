package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashbackHackerServiceTest {

    @org.junit.Test
    public void testRemain() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainWithCashback() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(expected, actual);
    }

}
