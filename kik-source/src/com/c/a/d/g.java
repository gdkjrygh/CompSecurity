// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.d;


public final class g extends Enum
{

    public static final g a;
    private static final g b[];

    private g(String s)
    {
        super(s, 0);
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/c/a/d/g, s);
    }

    public static g[] values()
    {
        return (g[])b.clone();
    }

    static 
    {
        a = new g("APPEND");
        b = (new g[] {
            a
        });
    }
}
