// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;


// Referenced classes of package com.fasterxml.jackson.core:
//            JsonParser

public static final class _defaultState extends Enum
{

    public static final h a;
    public static final h b;
    public static final h c;
    public static final h d;
    public static final h e;
    public static final h f;
    public static final h g;
    public static final h h;
    private static final h i[];
    private final boolean _defaultState;

    public static int a()
    {
        int k = 0;
        _defaultState a_ldefaultstate[] = values();
        int i1 = a_ldefaultstate.length;
        for (int j = 0; j < i1;)
        {
            _defaultState _ldefaultstate = a_ldefaultstate[j];
            int l = k;
            if (_ldefaultstate.b())
            {
                l = k | _ldefaultstate.c();
            }
            j++;
            k = l;
        }

        return k;
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/fasterxml/jackson/core/JsonParser$Feature, s);
    }

    public static c[] values()
    {
        return (c[])i.clone();
    }

    public boolean b()
    {
        return _defaultState;
    }

    public int c()
    {
        return 1 << ordinal();
    }

    static 
    {
        a = new <init>("AUTO_CLOSE_SOURCE", 0, true);
        b = new <init>("ALLOW_COMMENTS", 1, false);
        c = new <init>("ALLOW_UNQUOTED_FIELD_NAMES", 2, false);
        d = new <init>("ALLOW_SINGLE_QUOTES", 3, false);
        e = new <init>("ALLOW_UNQUOTED_CONTROL_CHARS", 4, false);
        f = new <init>("ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER", 5, false);
        g = new <init>("ALLOW_NUMERIC_LEADING_ZEROS", 6, false);
        h = new <init>("ALLOW_NON_NUMERIC_NUMBERS", 7, false);
        i = (new i[] {
            a, b, c, d, e, f, g, h
        });
    }

    private (String s, int j, boolean flag)
    {
        super(s, j);
        _defaultState = flag;
    }
}
