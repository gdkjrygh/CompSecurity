// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c.a;


public final class g extends Enum
{

    public static final g a;
    public static final g b;
    private static final g c[];

    private g(String s, int i)
    {
        super(s, i);
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/ford/syncV4/e/c/a/g, s);
    }

    public static g[] values()
    {
        return (g[])c.clone();
    }

    static 
    {
        a = new g("STATIC", 0);
        b = new g("DYNAMIC", 1);
        c = (new g[] {
            a, b
        });
    }
}
