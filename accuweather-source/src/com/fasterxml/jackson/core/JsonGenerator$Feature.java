// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;


// Referenced classes of package com.fasterxml.jackson.core:
//            JsonGenerator

public static final class _defaultState extends Enum
{

    private static final ESCAPE_NON_ASCII $VALUES[];
    public static final ESCAPE_NON_ASCII AUTO_CLOSE_JSON_CONTENT;
    public static final ESCAPE_NON_ASCII AUTO_CLOSE_TARGET;
    public static final ESCAPE_NON_ASCII ESCAPE_NON_ASCII;
    public static final ESCAPE_NON_ASCII FLUSH_PASSED_TO_STREAM;
    public static final ESCAPE_NON_ASCII QUOTE_FIELD_NAMES;
    public static final ESCAPE_NON_ASCII QUOTE_NON_NUMERIC_NUMBERS;
    public static final ESCAPE_NON_ASCII WRITE_NUMBERS_AS_STRINGS;
    private final boolean _defaultState;
    private final int _mask = 1 << ordinal();

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
        return (getMask)Enum.valueOf(com/fasterxml/jackson/core/JsonGenerator$Feature, s);
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
        AUTO_CLOSE_TARGET = new <init>("AUTO_CLOSE_TARGET", 0, true);
        AUTO_CLOSE_JSON_CONTENT = new <init>("AUTO_CLOSE_JSON_CONTENT", 1, true);
        QUOTE_FIELD_NAMES = new <init>("QUOTE_FIELD_NAMES", 2, true);
        QUOTE_NON_NUMERIC_NUMBERS = new <init>("QUOTE_NON_NUMERIC_NUMBERS", 3, true);
        WRITE_NUMBERS_AS_STRINGS = new <init>("WRITE_NUMBERS_AS_STRINGS", 4, false);
        FLUSH_PASSED_TO_STREAM = new <init>("FLUSH_PASSED_TO_STREAM", 5, true);
        ESCAPE_NON_ASCII = new <init>("ESCAPE_NON_ASCII", 6, false);
        $VALUES = (new .VALUES[] {
            AUTO_CLOSE_TARGET, AUTO_CLOSE_JSON_CONTENT, QUOTE_FIELD_NAMES, QUOTE_NON_NUMERIC_NUMBERS, WRITE_NUMBERS_AS_STRINGS, FLUSH_PASSED_TO_STREAM, ESCAPE_NON_ASCII
        });
    }

    private (String s, int i, boolean flag)
    {
        super(s, i);
        _defaultState = flag;
    }
}
