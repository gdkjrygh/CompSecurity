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
    public static final SerializationFeature EAGER_SERIALIZER_FETCH;
    public static final SerializationFeature FAIL_ON_EMPTY_BEANS;
    public static final SerializationFeature FAIL_ON_SELF_REFERENCES;
    public static final SerializationFeature FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS;
    public static final SerializationFeature FLUSH_AFTER_WRITE_VALUE;
    public static final SerializationFeature INDENT_OUTPUT;
    public static final SerializationFeature ORDER_MAP_ENTRIES_BY_KEYS;
    public static final SerializationFeature USE_EQUALITY_FOR_OBJECT_ID;
    public static final SerializationFeature WRAP_EXCEPTIONS;
    public static final SerializationFeature WRAP_ROOT_VALUE;
    public static final SerializationFeature WRITE_BIGDECIMAL_AS_PLAIN;
    public static final SerializationFeature WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS;
    public static final SerializationFeature WRITE_DATES_AS_TIMESTAMPS;
    public static final SerializationFeature WRITE_DATE_KEYS_AS_TIMESTAMPS;
    public static final SerializationFeature WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS;
    public static final SerializationFeature WRITE_DURATIONS_AS_TIMESTAMPS;
    public static final SerializationFeature WRITE_EMPTY_JSON_ARRAYS;
    public static final SerializationFeature WRITE_ENUMS_USING_INDEX;
    public static final SerializationFeature WRITE_ENUMS_USING_TO_STRING;
    public static final SerializationFeature WRITE_NULL_MAP_VALUES;
    public static final SerializationFeature WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED;
    private final boolean _defaultState;
    private final int _mask = 1 << ordinal();

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
        return _mask;
    }

    static 
    {
        WRAP_ROOT_VALUE = new SerializationFeature("WRAP_ROOT_VALUE", 0, false);
        INDENT_OUTPUT = new SerializationFeature("INDENT_OUTPUT", 1, false);
        FAIL_ON_EMPTY_BEANS = new SerializationFeature("FAIL_ON_EMPTY_BEANS", 2, true);
        FAIL_ON_SELF_REFERENCES = new SerializationFeature("FAIL_ON_SELF_REFERENCES", 3, true);
        WRAP_EXCEPTIONS = new SerializationFeature("WRAP_EXCEPTIONS", 4, true);
        FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS = new SerializationFeature("FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS", 5, true);
        CLOSE_CLOSEABLE = new SerializationFeature("CLOSE_CLOSEABLE", 6, false);
        FLUSH_AFTER_WRITE_VALUE = new SerializationFeature("FLUSH_AFTER_WRITE_VALUE", 7, true);
        WRITE_DATES_AS_TIMESTAMPS = new SerializationFeature("WRITE_DATES_AS_TIMESTAMPS", 8, true);
        WRITE_DURATIONS_AS_TIMESTAMPS = new SerializationFeature("WRITE_DURATIONS_AS_TIMESTAMPS", 9, true);
        WRITE_DATE_KEYS_AS_TIMESTAMPS = new SerializationFeature("WRITE_DATE_KEYS_AS_TIMESTAMPS", 10, false);
        WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS = new SerializationFeature("WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS", 11, false);
        WRITE_ENUMS_USING_TO_STRING = new SerializationFeature("WRITE_ENUMS_USING_TO_STRING", 12, false);
        WRITE_ENUMS_USING_INDEX = new SerializationFeature("WRITE_ENUMS_USING_INDEX", 13, false);
        WRITE_NULL_MAP_VALUES = new SerializationFeature("WRITE_NULL_MAP_VALUES", 14, true);
        WRITE_EMPTY_JSON_ARRAYS = new SerializationFeature("WRITE_EMPTY_JSON_ARRAYS", 15, true);
        WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED = new SerializationFeature("WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED", 16, false);
        WRITE_BIGDECIMAL_AS_PLAIN = new SerializationFeature("WRITE_BIGDECIMAL_AS_PLAIN", 17, false);
        WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS = new SerializationFeature("WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS", 18, true);
        ORDER_MAP_ENTRIES_BY_KEYS = new SerializationFeature("ORDER_MAP_ENTRIES_BY_KEYS", 19, false);
        EAGER_SERIALIZER_FETCH = new SerializationFeature("EAGER_SERIALIZER_FETCH", 20, true);
        USE_EQUALITY_FOR_OBJECT_ID = new SerializationFeature("USE_EQUALITY_FOR_OBJECT_ID", 21, false);
        $VALUES = (new SerializationFeature[] {
            WRAP_ROOT_VALUE, INDENT_OUTPUT, FAIL_ON_EMPTY_BEANS, FAIL_ON_SELF_REFERENCES, WRAP_EXCEPTIONS, FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS, CLOSE_CLOSEABLE, FLUSH_AFTER_WRITE_VALUE, WRITE_DATES_AS_TIMESTAMPS, WRITE_DURATIONS_AS_TIMESTAMPS, 
            WRITE_DATE_KEYS_AS_TIMESTAMPS, WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS, WRITE_ENUMS_USING_TO_STRING, WRITE_ENUMS_USING_INDEX, WRITE_NULL_MAP_VALUES, WRITE_EMPTY_JSON_ARRAYS, WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED, WRITE_BIGDECIMAL_AS_PLAIN, WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS, ORDER_MAP_ENTRIES_BY_KEYS, 
            EAGER_SERIALIZER_FETCH, USE_EQUALITY_FOR_OBJECT_ID
        });
    }
}
