// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.a;

import android.util.Log;

public final class w extends Enum
{

    public static final w a;
    public static final w b;
    public static final w c;
    public static final w d;
    public static final w e;
    private static final w g[];
    private final String f;

    private w(String s, int i, String s1)
    {
        super(s, i);
        f = s1;
    }

    static w a(String s)
    {
        if (s == null)
        {
            return e;
        }
        if ("COLLECTED".equals(s))
        {
            return a;
        }
        if ("CORRECTED".equals(s))
        {
            return b;
        }
        if ("REJECTED".equals(s))
        {
            return c;
        }
        if ("CONFIRMED".equals(s))
        {
            return d;
        }
        if ("UNSPECIFIED".equals(s))
        {
            return e;
        } else
        {
            Log.i("ConceptValue", (new StringBuilder("No ConceptValue.InputMode for string '")).append(s).append("'").toString());
            return e;
        }
    }

    public static w valueOf(String s)
    {
        return (w)Enum.valueOf(com/nuance/b/a/w, s);
    }

    public static w[] values()
    {
        return (w[])g.clone();
    }

    public final String toString()
    {
        return f;
    }

    static 
    {
        a = new w("COLLECTED", 0, "COLLECTED");
        b = new w("CORRECTED", 1, "CORRECTED");
        c = new w("REJECTED", 2, "REJECTED");
        d = new w("CONFIRMED", 3, "CONFIRMED");
        e = new w("UNSPECIFIED", 4, "UNSPECIFIED");
        g = (new w[] {
            a, b, c, d, e
        });
    }
}
