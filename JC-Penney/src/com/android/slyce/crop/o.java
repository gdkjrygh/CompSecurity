// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.crop;


final class o extends Enum
{

    public static final o a;
    public static final o b;
    public static final o c;
    private static final o d[];

    private o(String s, int i)
    {
        super(s, i);
    }

    public static o valueOf(String s)
    {
        return (o)Enum.valueOf(com/android/slyce/crop/o, s);
    }

    public static o[] values()
    {
        return (o[])d.clone();
    }

    static 
    {
        a = new o("None", 0);
        b = new o("Move", 1);
        c = new o("Grow", 2);
        d = (new o[] {
            a, b, c
        });
    }
}
