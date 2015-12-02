// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.m;


final class d extends Enum
{

    private static final d $VALUES[];
    public static final d AboveThreshold;
    public static final d BelowThreshold;
    public static final d Insignificant;

    private d(String s, int i)
    {
        super(s, i);
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/facebook/m/d, s);
    }

    public static d[] values()
    {
        return (d[])$VALUES.clone();
    }

    static 
    {
        Insignificant = new d("Insignificant", 0);
        AboveThreshold = new d("AboveThreshold", 1);
        BelowThreshold = new d("BelowThreshold", 2);
        $VALUES = (new d[] {
            Insignificant, AboveThreshold, BelowThreshold
        });
    }
}
