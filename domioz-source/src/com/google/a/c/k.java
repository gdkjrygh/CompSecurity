// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.c;


public final class k extends Enum
{

    public static final k a;
    private static final k b[];

    private k(String s)
    {
        super(s, 0);
    }

    public static k valueOf(String s)
    {
        return (k)Enum.valueOf(com/google/a/c/k, s);
    }

    public static k[] values()
    {
        return (k[])b.clone();
    }

    static 
    {
        a = new k("APPEND");
        b = (new k[] {
            a
        });
    }
}
