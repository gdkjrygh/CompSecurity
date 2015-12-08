// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;


public final class turkey extends Enum
{

    public static final turkey a;
    public static final turkey b;
    public static final turkey c;
    public static final turkey d;
    public static final turkey e;
    private static final turkey f[];

    private turkey(String s, int i)
    {
        super(s, i);
    }

    public static turkey valueOf(String s)
    {
        return (turkey)Enum.valueOf(com/taplytics/turkey, s);
    }

    public static turkey[] values()
    {
        return (turkey[])f.clone();
    }

    static 
    {
        a = new turkey("EXPERIMENT", 0);
        b = new turkey("TAP", 1);
        c = new turkey("ACTIVITY", 2);
        d = new turkey("BUTTON", 3);
        e = new turkey("DISCONNECT", 4);
        f = (new turkey[] {
            a, b, c, d, e
        });
    }
}
