// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.model;


public final class StJudesAmount extends Enum
{

    private static final StJudesAmount $VALUES[];
    public static final StJudesAmount FIVE;
    public static final StJudesAmount ONE;
    public static final StJudesAmount TEN;
    public static final StJudesAmount TWO;
    private final String amount;

    private StJudesAmount(String s, int i, String s1)
    {
        super(s, i);
        amount = s1;
    }

    public static StJudesAmount valueOf(String s)
    {
        return (StJudesAmount)Enum.valueOf(com/dominos/model/StJudesAmount, s);
    }

    public static StJudesAmount[] values()
    {
        return (StJudesAmount[])$VALUES.clone();
    }

    public final String toString()
    {
        return amount;
    }

    static 
    {
        ONE = new StJudesAmount("ONE", 0, "STJUDE");
        TWO = new StJudesAmount("TWO", 1, "STJUDE2");
        FIVE = new StJudesAmount("FIVE", 2, "STJUDE5");
        TEN = new StJudesAmount("TEN", 3, "STJUDE10");
        $VALUES = (new StJudesAmount[] {
            ONE, TWO, FIVE, TEN
        });
    }
}
