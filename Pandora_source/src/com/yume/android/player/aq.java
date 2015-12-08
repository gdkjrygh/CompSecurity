// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;


final class aq extends Enum
{

    public static final aq a;
    public static final aq b;
    public static final aq c;
    public static final aq d;
    public static final aq e;
    public static final aq f;
    private static final aq g[];

    private aq(String s, int i)
    {
        super(s, i);
    }

    public static aq valueOf(String s)
    {
        return (aq)Enum.valueOf(com/yume/android/player/aq, s);
    }

    public static aq[] values()
    {
        aq aaq[] = g;
        int i = aaq.length;
        aq aaq1[] = new aq[i];
        System.arraycopy(aaq, 0, aaq1, 0, i);
        return aaq1;
    }

    static 
    {
        a = new aq("NONE", 0);
        b = new aq("PLAYING", 1);
        c = new aq("PAUSED", 2);
        d = new aq("FAILED", 3);
        e = new aq("COMPLETED", 4);
        f = new aq("TIMED_OUT", 5);
        g = (new aq[] {
            a, b, c, d, e, f
        });
    }
}
