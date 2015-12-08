// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;


public final class wallaby extends Enum
{

    public static final wallaby a;
    public static final wallaby b;
    public static final wallaby c;
    public static final wallaby d;
    private static final wallaby e[];

    private wallaby(String s, int i)
    {
        super(s, i);
    }

    public static wallaby valueOf(String s)
    {
        return (wallaby)Enum.valueOf(com/taplytics/wallaby, s);
    }

    public static wallaby[] values()
    {
        return (wallaby[])e.clone();
    }

    static 
    {
        a = new wallaby("finished", 0);
        b = new wallaby("failed", 1);
        c = new wallaby("cancelled", 2);
        d = new wallaby("notDone", 3);
        e = (new wallaby[] {
            a, b, c, d
        });
    }
}
