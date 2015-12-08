// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;


// Referenced classes of package com.fasterxml.jackson.core:
//            JsonGenerator

public static final class _defaultState extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    private static final g h[];
    private final boolean _defaultState;
    private final int _mask = 1 << ordinal();

    public static int a()
    {
        int j = 0;
        _defaultState a_ldefaultstate[] = values();
        int l = a_ldefaultstate.length;
        for (int i = 0; i < l;)
        {
            _defaultState _ldefaultstate = a_ldefaultstate[i];
            int k = j;
            if (_ldefaultstate.b())
            {
                k = j | _ldefaultstate.c();
            }
            i++;
            j = k;
        }

        return j;
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/fasterxml/jackson/core/JsonGenerator$Feature, s);
    }

    public static c[] values()
    {
        return (c[])h.clone();
    }

    public boolean b()
    {
        return _defaultState;
    }

    public int c()
    {
        return _mask;
    }

    static 
    {
        a = new <init>("AUTO_CLOSE_TARGET", 0, true);
        b = new <init>("AUTO_CLOSE_JSON_CONTENT", 1, true);
        c = new <init>("QUOTE_FIELD_NAMES", 2, true);
        d = new <init>("QUOTE_NON_NUMERIC_NUMBERS", 3, true);
        e = new <init>("WRITE_NUMBERS_AS_STRINGS", 4, false);
        f = new <init>("FLUSH_PASSED_TO_STREAM", 5, true);
        g = new <init>("ESCAPE_NON_ASCII", 6, false);
        h = (new h[] {
            a, b, c, d, e, f, g
        });
    }

    private (String s, int i, boolean flag)
    {
        super(s, i);
        _defaultState = flag;
    }
}
