// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.config.a;


public final class d extends Enum
{

    private static final d $VALUES[];
    public static final d FB4A;
    public static final d GIFTS;
    public static final d MESSENGER;
    public static final d NATIVEMSITE;
    public static final d PAA;
    public static final d POKE;
    public static final d SAMPLE;
    public static final d UNKNOWN;

    private d(String s, int i)
    {
        super(s, i);
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/facebook/config/a/d, s);
    }

    public static d[] values()
    {
        return (d[])$VALUES.clone();
    }

    static 
    {
        MESSENGER = new d("MESSENGER", 0);
        FB4A = new d("FB4A", 1);
        PAA = new d("PAA", 2);
        POKE = new d("POKE", 3);
        SAMPLE = new d("SAMPLE", 4);
        GIFTS = new d("GIFTS", 5);
        NATIVEMSITE = new d("NATIVEMSITE", 6);
        UNKNOWN = new d("UNKNOWN", 7);
        $VALUES = (new d[] {
            MESSENGER, FB4A, PAA, POKE, SAMPLE, GIFTS, NATIVEMSITE, UNKNOWN
        });
    }
}
