// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;


public final class cheetah extends Enum
{

    public static final cheetah a;
    public static final cheetah b;
    private static final cheetah d[];
    final String c;

    private cheetah(String s, int i, String s1)
    {
        super(s, i);
        c = s1;
    }

    public static cheetah valueOf(String s)
    {
        return (cheetah)Enum.valueOf(com/taplytics/cheetah, s);
    }

    public static cheetah[] values()
    {
        return (cheetah[])d.clone();
    }

    static 
    {
        a = new cheetah("EVENTS", 0, "events");
        b = new cheetah("PEOPLE", 1, "people");
        d = (new cheetah[] {
            a, b
        });
    }
}
