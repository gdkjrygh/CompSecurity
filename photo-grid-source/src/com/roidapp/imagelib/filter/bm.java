// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import java.math.BigDecimal;

final class bm extends Enum
{

    public static final bm a;
    public static final bm b;
    public static final bm c;
    public static final bm d;
    public static final bm e;
    public static final bm f;
    public static final bm g;
    private static final bm h[];

    private bm(String s, int i)
    {
        super(s, i);
    }

    public static bm a(Number number)
    {
        if (number instanceof Long)
        {
            return a;
        }
        if (number instanceof Double)
        {
            return b;
        }
        if (number instanceof Integer)
        {
            return c;
        }
        if (number instanceof Float)
        {
            return d;
        }
        if (number instanceof Short)
        {
            return e;
        }
        if (number instanceof Byte)
        {
            return f;
        }
        if (number instanceof BigDecimal)
        {
            return g;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Number class '")).append(number.getClass().getName()).append("' is not supported").toString());
        }
    }

    public static bm valueOf(String s)
    {
        return (bm)Enum.valueOf(com/roidapp/imagelib/filter/bm, s);
    }

    public static bm[] values()
    {
        return (bm[])h.clone();
    }

    static 
    {
        a = new bm("LONG", 0);
        b = new bm("DOUBLE", 1);
        c = new bm("INTEGER", 2);
        d = new bm("FLOAT", 3);
        e = new bm("SHORT", 4);
        f = new bm("BYTE", 5);
        g = new bm("BIG_DECIMAL", 6);
        h = (new bm[] {
            a, b, c, d, e, f, g
        });
    }
}
