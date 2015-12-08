// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c.a;


public final class f extends Enum
{

    public static final f a;
    public static final f b;
    private static final f c[];

    private f(String s, int i)
    {
        super(s, i);
    }

    public static f a(String s)
    {
        return valueOf(s);
    }

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/ford/syncV4/e/c/a/f, s);
    }

    public static f[] values()
    {
        return (f[])c.clone();
    }

    static 
    {
        a = new f("FRONT", 0);
        b = new f("BACK", 1);
        c = (new f[] {
            a, b
        });
    }
}
