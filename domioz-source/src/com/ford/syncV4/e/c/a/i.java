// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c.a;


public final class i extends Enum
{

    public static final i a;
    public static final i b;
    public static final i c;
    public static final i d;
    private static final i e[];

    private i(String s, int j)
    {
        super(s, j);
    }

    public static i a(String s)
    {
        return valueOf(s);
    }

    public static i valueOf(String s)
    {
        return (i)Enum.valueOf(com/ford/syncV4/e/c/a/i, s);
    }

    public static i[] values()
    {
        return (i[])e.clone();
    }

    static 
    {
        a = new i("KEYPRESS", 0);
        b = new i("ENTRY_SUBMITTED", 1);
        c = new i("ENTRY_CANCELLED", 2);
        d = new i("ENTRY_ABORTED", 3);
        e = (new i[] {
            a, b, c, d
        });
    }
}
