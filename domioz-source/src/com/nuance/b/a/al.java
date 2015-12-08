// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.a;


public final class al extends Enum
{

    public static final al a;
    public static final al b;
    public static final al c;
    private static final al d[];

    private al(String s, int i)
    {
        super(s, i);
    }

    public static al valueOf(String s)
    {
        return (al)Enum.valueOf(com/nuance/b/a/al, s);
    }

    public static al[] values()
    {
        return (al[])d.clone();
    }

    static 
    {
        a = new al("UNPREDICTABLE", 0);
        b = new al("IMMEDIATE", 1);
        c = new al("LOCAL", 2);
        d = (new al[] {
            a, b, c
        });
    }
}
