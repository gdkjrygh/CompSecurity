// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Enums;


public final class Alignment extends Enum
{

    public static final Alignment a;
    public static final Alignment b;
    public static final Alignment c;
    private static final Alignment d[];

    private Alignment(String s, int i)
    {
        super(s, i);
    }

    public static Alignment valueOf(String s)
    {
        return (Alignment)Enum.valueOf(com/artfulbits/aiCharts/Enums/Alignment, s);
    }

    public static Alignment[] values()
    {
        return (Alignment[])d.clone();
    }

    static 
    {
        a = new Alignment("Near", 0);
        b = new Alignment("Center", 1);
        c = new Alignment("Far", 2);
        d = (new Alignment[] {
            a, b, c
        });
    }
}
