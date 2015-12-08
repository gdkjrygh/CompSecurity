// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.ConfigFeature;

public final class DeserializationFeature extends Enum
    implements ConfigFeature
{

    private static final DeserializationFeature $VALUES[];
    public static final DeserializationFeature ACCEPT_EMPTY_STRING_AS_NULL_OBJECT;
    public static final DeserializationFeature ACCEPT_SINGLE_VALUE_AS_ARRAY;
    public static final DeserializationFeature ADJUST_DATES_TO_CONTEXT_TIME_ZONE;
    public static final DeserializationFeature EAGER_DESERIALIZER_FETCH;
    public static final DeserializationFeature FAIL_ON_IGNORED_PROPERTIES;
    public static final DeserializationFeature FAIL_ON_INVALID_SUBTYPE;
    public static final DeserializationFeature FAIL_ON_NULL_FOR_PRIMITIVES;
    public static final DeserializationFeature FAIL_ON_NUMBERS_FOR_ENUMS;
    public static final DeserializationFeature FAIL_ON_READING_DUP_TREE_KEY;
    public static final DeserializationFeature FAIL_ON_UNKNOWN_PROPERTIES;
    public static final DeserializationFeature READ_DATE_TIMESTAMPS_AS_NANOSECONDS;
    public static final DeserializationFeature READ_ENUMS_USING_TO_STRING;
    public static final DeserializationFeature READ_UNKNOWN_ENUM_VALUES_AS_NULL;
    public static final DeserializationFeature UNWRAP_ROOT_VALUE;
    public static final DeserializationFeature UNWRAP_SINGLE_VALUE_ARRAYS;
    public static final DeserializationFeature USE_BIG_DECIMAL_FOR_FLOATS;
    public static final DeserializationFeature USE_BIG_INTEGER_FOR_INTS;
    public static final DeserializationFeature USE_JAVA_ARRAY_FOR_JSON_ARRAY;
    public static final DeserializationFeature WRAP_EXCEPTIONS;
    private final boolean _defaultState;

    private DeserializationFeature(String s, int i, boolean flag)
    {
        super(s, i);
        _defaultState = flag;
    }

    public static DeserializationFeature valueOf(String s)
    {
        return (DeserializationFeature)Enum.valueOf(com/fasterxml/jackson/databind/DeserializationFeature, s);
    }

    public static DeserializationFeature[] values()
    {
        return (DeserializationFeature[])$VALUES.clone();
    }

    public final boolean enabledByDefault()
    {
        return _defaultState;
    }

    public final int getMask()
    {
        return 1 << ordinal();
    }

    static 
    {
        USE_BIG_DECIMAL_FOR_FLOATS = new DeserializationFeature("USE_BIG_DECIMAL_FOR_FLOATS", 0, false);
        USE_BIG_INTEGER_FOR_INTS = new DeserializationFeature("USE_BIG_INTEGER_FOR_INTS", 1, false);
        USE_JAVA_ARRAY_FOR_JSON_ARRAY = new DeserializationFeature("USE_JAVA_ARRAY_FOR_JSON_ARRAY", 2, false);
        READ_ENUMS_USING_TO_STRING = new DeserializationFeature("READ_ENUMS_USING_TO_STRING", 3, false);
        FAIL_ON_UNKNOWN_PROPERTIES = new DeserializationFeature("FAIL_ON_UNKNOWN_PROPERTIES", 4, true);
        FAIL_ON_NULL_FOR_PRIMITIVES = new DeserializationFeature("FAIL_ON_NULL_FOR_PRIMITIVES", 5, false);
        FAIL_ON_NUMBERS_FOR_ENUMS = new DeserializationFeature("FAIL_ON_NUMBERS_FOR_ENUMS", 6, false);
        FAIL_ON_INVALID_SUBTYPE = new DeserializationFeature("FAIL_ON_INVALID_SUBTYPE", 7, true);
        FAIL_ON_READING_DUP_TREE_KEY = new DeserializationFeature("FAIL_ON_READING_DUP_TREE_KEY", 8, false);
        FAIL_ON_IGNORED_PROPERTIES = new DeserializationFeature("FAIL_ON_IGNORED_PROPERTIES", 9, false);
        WRAP_EXCEPTIONS = new DeserializationFeature("WRAP_EXCEPTIONS", 10, true);
        ACCEPT_SINGLE_VALUE_AS_ARRAY = new DeserializationFeature("ACCEPT_SINGLE_VALUE_AS_ARRAY", 11, false);
        UNWRAP_SINGLE_VALUE_ARRAYS = new DeserializationFeature("UNWRAP_SINGLE_VALUE_ARRAYS", 12, false);
        UNWRAP_ROOT_VALUE = new DeserializationFeature("UNWRAP_ROOT_VALUE", 13, false);
        ACCEPT_EMPTY_STRING_AS_NULL_OBJECT = new DeserializationFeature("ACCEPT_EMPTY_STRING_AS_NULL_OBJECT", 14, false);
        READ_UNKNOWN_ENUM_VALUES_AS_NULL = new DeserializationFeature("READ_UNKNOWN_ENUM_VALUES_AS_NULL", 15, false);
        READ_DATE_TIMESTAMPS_AS_NANOSECONDS = new DeserializationFeature("READ_DATE_TIMESTAMPS_AS_NANOSECONDS", 16, true);
        ADJUST_DATES_TO_CONTEXT_TIME_ZONE = new DeserializationFeature("ADJUST_DATES_TO_CONTEXT_TIME_ZONE", 17, true);
        EAGER_DESERIALIZER_FETCH = new DeserializationFeature("EAGER_DESERIALIZER_FETCH", 18, true);
        $VALUES = (new DeserializationFeature[] {
            USE_BIG_DECIMAL_FOR_FLOATS, USE_BIG_INTEGER_FOR_INTS, USE_JAVA_ARRAY_FOR_JSON_ARRAY, READ_ENUMS_USING_TO_STRING, FAIL_ON_UNKNOWN_PROPERTIES, FAIL_ON_NULL_FOR_PRIMITIVES, FAIL_ON_NUMBERS_FOR_ENUMS, FAIL_ON_INVALID_SUBTYPE, FAIL_ON_READING_DUP_TREE_KEY, FAIL_ON_IGNORED_PROPERTIES, 
            WRAP_EXCEPTIONS, ACCEPT_SINGLE_VALUE_AS_ARRAY, UNWRAP_SINGLE_VALUE_ARRAYS, UNWRAP_ROOT_VALUE, ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, READ_UNKNOWN_ENUM_VALUES_AS_NULL, READ_DATE_TIMESTAMPS_AS_NANOSECONDS, ADJUST_DATES_TO_CONTEXT_TIME_ZONE, EAGER_DESERIALIZER_FETCH
        });
    }
}
