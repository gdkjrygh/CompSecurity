// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.a;

import android.util.Log;

public final class u extends Enum
{

    public static final u a;
    public static final u b;
    public static final u c;
    public static final u d;
    public static final u e;
    public static final u f;
    private static final u h[];
    private final String g;

    private u(String s, int i, String s1)
    {
        super(s, i);
        g = s1;
    }

    static u a(String s)
    {
        if (s == null)
        {
            return f;
        }
        if ("VOICE".equals(s))
        {
            return a;
        }
        if ("TEXT".equals(s))
        {
            return b;
        }
        if ("TOUCH".equals(s))
        {
            return c;
        }
        if ("HINT".equals(s))
        {
            return d;
        }
        if ("API".equals(s))
        {
            return e;
        }
        if ("UNSPECIFIED".equals(s))
        {
            return f;
        } else
        {
            Log.i("ConceptValue", (new StringBuilder("No ConceptValue.InputMode for string '")).append(s).append("'").toString());
            return f;
        }
    }

    public static u valueOf(String s)
    {
        return (u)Enum.valueOf(com/nuance/b/a/u, s);
    }

    public static u[] values()
    {
        return (u[])h.clone();
    }

    public final String toString()
    {
        return g;
    }

    static 
    {
        a = new u("VOICE", 0, "VOICE");
        b = new u("TEXT", 1, "TEXT");
        c = new u("TOUCH", 2, "TOUCH");
        d = new u("HINT", 3, "HINT");
        e = new u("API", 4, "API");
        f = new u("UNSPECIFIED", 5, "UNSPECIFIED");
        h = (new u[] {
            a, b, c, d, e, f
        });
    }
}
