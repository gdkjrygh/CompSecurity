// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


public final class ao extends Enum
{

    public static final ao a;
    public static final ao b;
    public static final ao c;
    private static final ao d[];

    private ao(String s, int i)
    {
        super(s, i);
    }

    public static ao valueOf(String s)
    {
        return (ao)Enum.valueOf(com/facebook/ao, s);
    }

    public static ao[] values()
    {
        return (ao[])d.clone();
    }

    static 
    {
        a = new ao("GET", 0);
        b = new ao("POST", 1);
        c = new ao("DELETE", 2);
        d = (new ao[] {
            a, b, c
        });
    }
}
