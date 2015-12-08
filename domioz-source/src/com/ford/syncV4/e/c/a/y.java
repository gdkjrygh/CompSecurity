// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c.a;


public final class y extends Enum
{

    public static final y a;
    private static final y b[];

    private y(String s)
    {
        super(s, 0);
    }

    public static y a(String s)
    {
        if (s.toUpperCase().equals(a.toString().toUpperCase()))
        {
            return a;
        } else
        {
            return null;
        }
    }

    public static y valueOf(String s)
    {
        return (y)Enum.valueOf(com/ford/syncV4/e/c/a/y, s);
    }

    public static y[] values()
    {
        return (y[])b.clone();
    }

    static 
    {
        a = new y("Text");
        b = (new y[] {
            a
        });
    }
}
