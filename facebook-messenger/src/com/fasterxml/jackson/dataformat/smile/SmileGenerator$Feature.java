// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.dataformat.smile;


public final class _defaultState extends Enum
{

    private static final CHECK_SHARED_STRING_VALUES $VALUES[];
    public static final CHECK_SHARED_STRING_VALUES CHECK_SHARED_NAMES;
    public static final CHECK_SHARED_STRING_VALUES CHECK_SHARED_STRING_VALUES;
    public static final CHECK_SHARED_STRING_VALUES ENCODE_BINARY_AS_7BIT;
    public static final CHECK_SHARED_STRING_VALUES WRITE_END_MARKER;
    public static final CHECK_SHARED_STRING_VALUES WRITE_HEADER;
    protected final boolean _defaultState;
    protected final int _mask = 1 << ordinal();

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
        return (getMask)Enum.valueOf(com/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature, s);
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
        WRITE_HEADER = new <init>("WRITE_HEADER", 0, true);
        WRITE_END_MARKER = new <init>("WRITE_END_MARKER", 1, false);
        ENCODE_BINARY_AS_7BIT = new <init>("ENCODE_BINARY_AS_7BIT", 2, true);
        CHECK_SHARED_NAMES = new <init>("CHECK_SHARED_NAMES", 3, true);
        CHECK_SHARED_STRING_VALUES = new <init>("CHECK_SHARED_STRING_VALUES", 4, false);
        $VALUES = (new .VALUES[] {
            WRITE_HEADER, WRITE_END_MARKER, ENCODE_BINARY_AS_7BIT, CHECK_SHARED_NAMES, CHECK_SHARED_STRING_VALUES
        });
    }

    private (String s, int i, boolean flag)
    {
        super(s, i);
        _defaultState = flag;
    }
}
