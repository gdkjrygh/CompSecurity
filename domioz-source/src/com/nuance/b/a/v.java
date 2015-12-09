// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.a;

import android.util.Log;

public final class v extends Enum
{

    public static final v a;
    public static final v b;
    public static final v c;
    public static final v d;
    public static final v e;
    public static final v f;
    public static final v g;
    public static final v h;
    public static final v i;
    public static final v j;
    private static final v l[];
    private final String k;

    private v(String s, int i1, String s1)
    {
        super(s, i1);
        k = s1;
    }

    static v a(String s)
    {
        if (s == null)
        {
            return j;
        }
        if ("USERINPUT".equals(s))
        {
            return a;
        }
        if ("USERINPUT_SPEECH".equals(s))
        {
            return b;
        }
        if ("USERINPUT_TEXT".equals(s))
        {
            return c;
        }
        if ("USERINPUT_TOUCH".equals(s))
        {
            return d;
        }
        if ("PREDICTION".equals(s))
        {
            return e;
        }
        if ("PREDICTION_PRIORS".equals(s))
        {
            return f;
        }
        if ("DEFAULT".equals(s))
        {
            return g;
        }
        if ("BACKEND".equals(s))
        {
            return h;
        }
        if ("CONTEXT".equals(s))
        {
            return i;
        }
        if ("UNSPECIFIED".equals(s))
        {
            return j;
        } else
        {
            Log.i("ConceptValue", (new StringBuilder("No ConceptValue.Source for string '")).append(s).append("'").toString());
            return j;
        }
    }

    public static v valueOf(String s)
    {
        return (v)Enum.valueOf(com/nuance/b/a/v, s);
    }

    public static v[] values()
    {
        return (v[])l.clone();
    }

    public final String toString()
    {
        return k;
    }

    static 
    {
        a = new v("USER_INPUT", 0, "USERINPUT");
        b = new v("USER_INPUT_SPEECH", 1, "USERINPUT_SPEECH");
        c = new v("USER_INPUT_TEXT", 2, "USERINPUT_TEXT");
        d = new v("USER_INPUT_TOUCH", 3, "USERINPUT_TOUCH");
        e = new v("PREDICTION", 4, "PREDICTION");
        f = new v("PREDICTION_PRIORS", 5, "PREDICTION_PRIORS");
        g = new v("DEFAULT", 6, "DEFAULT");
        h = new v("BACKEND", 7, "BACKEND");
        i = new v("CONTEXT", 8, "CONTEXT");
        j = new v("UNSPECIFIED", 9, "UNSPECIFIED");
        l = (new v[] {
            a, b, c, d, e, f, g, h, i, j
        });
    }
}
