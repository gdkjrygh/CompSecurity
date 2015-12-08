// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;


public final class wildebeast extends Enum
{

    public static final wildebeast a;
    public static final wildebeast b;
    public static final wildebeast c;
    private static final wildebeast d[];

    private wildebeast(String s, int i)
    {
        super(s, i);
    }

    public static wildebeast valueOf(String s)
    {
        return (wildebeast)Enum.valueOf(com/taplytics/wildebeast, s);
    }

    public static wildebeast[] values()
    {
        return (wildebeast[])d.clone();
    }

    static 
    {
        a = new wildebeast("STRICT", 0);
        b = new wildebeast("BROWSER_COMPATIBLE", 1);
        c = new wildebeast("RFC6532", 2);
        d = (new wildebeast[] {
            a, b, c
        });
    }
}
