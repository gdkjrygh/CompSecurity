// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.e;

import java.util.Locale;

public final class i extends Enum
{

    public static final i a;
    public static final i b;
    public static final i c;
    private static final i d[];

    private i(String s, int j)
    {
        super(s, j);
    }

    public static i valueOf(String s)
    {
        return (i)Enum.valueOf(com/roidapp/baselib/e/i, s);
    }

    public static i[] values()
    {
        return (i[])d.clone();
    }

    public final String toString()
    {
        return super.toString().toUpperCase(Locale.ENGLISH);
    }

    static 
    {
        a = new i("GET", 0);
        b = new i("POST", 1);
        c = new i("DELETE", 2);
        d = (new i[] {
            a, b, c
        });
    }
}
