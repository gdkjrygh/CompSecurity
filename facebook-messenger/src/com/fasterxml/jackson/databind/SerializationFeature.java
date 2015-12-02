// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.ConfigFeature;

public final class SerializationFeature extends Enum
    implements ConfigFeature
{

    private static final SerializationFeature $VALUES[];
    public static final SerializationFeature CLOSE_CLOSEABLE;
    public static final SerializationFeature FAIL_ON_EMPTY_BEANS;
    public static final SerializationFeature FLUSH_AFTER_WRITE_VALUE;
    public static final SerializationFeature INDENT_OUTPUT;
    public static final SerializationFeature ORDER_MAP_ENTRIES_BY_KEYS;
    public static final SerializationFeature WRAP_EXCEPTIONS;
    public static final SerializationFeature WRAP_ROOT_VALUE;
    public static final SerializationFeature WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS;
    public static final SerializationFeature WRITE_DATES_AS_TIMESTAMPS;
    public static final SerializationFeature WRITE_DATE_KEYS_AS_TIMESTAMPS;
    public static final SerializationFeature WRITE_EMPTY_JSON_ARRAYS;
    public static final SerializationFeature WRITE_ENUMS_USING_INDEX;
    public static final SerializationFeature WRITE_ENUMS_USING_TO_STRING;
    public static final SerializationFeature WRITE_NULL_MAP_VALUES;
    public static final SerializationFeature WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED;
    private final boolean _defaultState;

    private SerializationFeature(String s, int i, boolean flag)
    {
        super(s, i);
        _defaultState = flag;
    }

    public static SerializationFeature valueOf(String s)
    {
        return (SerializationFeature)Enum.valueOf(com/fasterxml/jackson/databind/SerializationFeature, s);
    }

    public static SerializationFeature[] values()
    {
        return (SerializationFeature[])$VALUES.clone();
    }

    public boolean enabledByDefault()
    {
        return _defaultState;
    }

    public int getMask()
    {
        return 1 << ordinal();
    }

    static 
    {
        WRAP_ROOT_VALUE = new SerializationFeature("WRAP_ROOT_VALUE", 0, false);
        INDENT_OUTPUT = new SerializationFeature("INDENT_OUTPUT", 1, false);
        FAIL_ON_EMPTY_BEANS = new SerializationFeature("FAIL_ON_EMPTY_BEANS", 2, true);
        WRAP_EXCEPTIONS = new SerializationFeature("WRAP_EXCEPTIONS", 3, true);
        CLOSE_CLOSEABLE = new SerializationFeature("CLOSE_CLOSEABLE", 4, false);
        FLUSH_AFTER_WRITE_VALUE = new SerializationFeature("FLUSH_AFTER_WRITE_VALUE", 5, true);
        WRITE_DATES_AS_TIMESTAMPS = new SerializationFeature("WRITE_DATES_AS_TIMESTAMPS", 6, true);
        WRITE_DATE_KEYS_AS_TIMESTAMPS = new SerializationFeature("WRITE_DATE_KEYS_AS_TIMESTAMPS", 7, false);
        WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS = new SerializationFeature("WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS", 8, false);
        WRITE_ENUMS_USING_TO_STRING = new SerializationFeature("WRITE_ENUMS_USING_TO_STRING", 9, false);
        WRITE_ENUMS_USING_INDEX = new SerializationFeature("WRITE_ENUMS_USING_INDEX", 10, false);
        WRITE_NULL_MAP_VALUES = new SerializationFeature("WRITE_NULL_MAP_VALUES", 11, true);
        WRITE_EMPTY_JSON_ARRAYS = new SerializationFeature("WRITE_EMPTY_JSON_ARRAYS", 12, true);
        WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED = new SerializationFeature("WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED", 13, false);
        ORDER_MAP_ENTRIES_BY_KEYS = new SerializationFeature("ORDER_MAP_ENTRIES_BY_KEYS", 14, false);
        $VALUES = (new SerializationFeature[] {
            WRAP_ROOT_VALUE, INDENT_OUTPUT, FAIL_ON_EMPTY_BEANS, WRAP_EXCEPTIONS, CLOSE_CLOSEABLE, FLUSH_AFTER_WRITE_VALUE, WRITE_DATES_AS_TIMESTAMPS, WRITE_DATE_KEYS_AS_TIMESTAMPS, WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS, WRITE_ENUMS_USING_TO_STRING, 
            WRITE_ENUMS_USING_INDEX, WRITE_NULL_MAP_VALUES, WRITE_EMPTY_JSON_ARRAYS, WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED, ORDER_MAP_ENTRIES_BY_KEYS
        });
    }
}
