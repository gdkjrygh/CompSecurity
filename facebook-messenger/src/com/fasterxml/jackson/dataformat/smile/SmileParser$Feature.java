// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.dataformat.smile;


public final class _defaultState extends Enum
{

    private static final REQUIRE_HEADER $VALUES[];
    public static final REQUIRE_HEADER REQUIRE_HEADER;
    final boolean _defaultState;
    final int _mask = 1 << ordinal();

    public static int collectDefaults()
    {
        int j = 0;
        _defaultState a_ldefaultstate[] = values();
        int l = a_ldefaultstate.length;
        for (int i = 0; i < l;)
        {
            _defaultState _ldefaultstate = a_ldefaultstate[i];
            int k = j;
            if (_ldefaultstate.enabledByDefault())
            {
                k = j | _ldefaultstate.getMask();
            }
            i++;
            j = k;
        }

        return j;
    }

    public static getMask valueOf(String s)
    {
        return (getMask)Enum.valueOf(com/fasterxml/jackson/dataformat/smile/SmileParser$Feature, s);
    }

    public static getMask[] values()
    {
        return (getMask[])$VALUES.clone();
    }

    public boolean enabledByDefault()
    {
        return _defaultState;
    }

    public int getMask()
    {
        return _mask;
    }

    static 
    {
        REQUIRE_HEADER = new <init>("REQUIRE_HEADER", 0, true);
        $VALUES = (new .VALUES[] {
            REQUIRE_HEADER
        });
    }

    private (String s, int i, boolean flag)
    {
        super(s, i);
        _defaultState = flag;
    }
}
