// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;


// Referenced classes of package com.fasterxml.jackson.core:
//            JsonFactory

public static final class _defaultState extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];
    private final boolean _defaultState;

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
        return (c)Enum.valueOf(com/fasterxml/jackson/core/JsonFactory$Feature, s);
    }

    public static c[] values()
    {
        return (c[])c.clone();
    }

    public boolean a(int i)
    {
        return (c() & i) != 0;
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
        a = new <init>("INTERN_FIELD_NAMES", 0, true);
        b = new <init>("CANONICALIZE_FIELD_NAMES", 1, true);
        c = (new c[] {
            a, b
        });
    }

    private (String s, int i, boolean flag)
    {
        super(s, i);
        _defaultState = flag;
    }
}
