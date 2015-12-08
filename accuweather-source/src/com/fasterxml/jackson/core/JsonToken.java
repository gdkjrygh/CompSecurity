// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;


public final class JsonToken extends Enum
{

    private static final JsonToken $VALUES[];
    public static final JsonToken END_ARRAY;
    public static final JsonToken END_OBJECT;
    public static final JsonToken FIELD_NAME;
    public static final JsonToken NOT_AVAILABLE;
    public static final JsonToken START_ARRAY;
    public static final JsonToken START_OBJECT;
    public static final JsonToken VALUE_EMBEDDED_OBJECT;
    public static final JsonToken VALUE_FALSE;
    public static final JsonToken VALUE_NULL;
    public static final JsonToken VALUE_NUMBER_FLOAT;
    public static final JsonToken VALUE_NUMBER_INT;
    public static final JsonToken VALUE_STRING;
    public static final JsonToken VALUE_TRUE;
    final String _serialized;
    final byte _serializedBytes[];
    final char _serializedChars[];

    private JsonToken(String s, int i, String s1)
    {
        super(s, i);
        if (s1 == null)
        {
            _serialized = null;
            _serializedChars = null;
            _serializedBytes = null;
        } else
        {
            _serialized = s1;
            _serializedChars = s1.toCharArray();
            int j = _serializedChars.length;
            _serializedBytes = new byte[j];
            i = 0;
            while (i < j) 
            {
                _serializedBytes[i] = (byte)_serializedChars[i];
                i++;
            }
        }
    }

    public static JsonToken valueOf(String s)
    {
        return (JsonToken)Enum.valueOf(com/fasterxml/jackson/core/JsonToken, s);
    }

    public static JsonToken[] values()
    {
        return (JsonToken[])$VALUES.clone();
    }

    public byte[] asByteArray()
    {
        return _serializedBytes;
    }

    public char[] asCharArray()
    {
        return _serializedChars;
    }

    public String asString()
    {
        return _serialized;
    }

    public boolean isNumeric()
    {
        return this == VALUE_NUMBER_INT || this == VALUE_NUMBER_FLOAT;
    }

    public boolean isScalarValue()
    {
        return ordinal() >= VALUE_EMBEDDED_OBJECT.ordinal();
    }

    static 
    {
        NOT_AVAILABLE = new JsonToken("NOT_AVAILABLE", 0, null);
        START_OBJECT = new JsonToken("START_OBJECT", 1, "{");
        END_OBJECT = new JsonToken("END_OBJECT", 2, "}");
        START_ARRAY = new JsonToken("START_ARRAY", 3, "[");
        END_ARRAY = new JsonToken("END_ARRAY", 4, "]");
        FIELD_NAME = new JsonToken("FIELD_NAME", 5, null);
        VALUE_EMBEDDED_OBJECT = new JsonToken("VALUE_EMBEDDED_OBJECT", 6, null);
        VALUE_STRING = new JsonToken("VALUE_STRING", 7, null);
        VALUE_NUMBER_INT = new JsonToken("VALUE_NUMBER_INT", 8, null);
        VALUE_NUMBER_FLOAT = new JsonToken("VALUE_NUMBER_FLOAT", 9, null);
        VALUE_TRUE = new JsonToken("VALUE_TRUE", 10, "true");
        VALUE_FALSE = new JsonToken("VALUE_FALSE", 11, "false");
        VALUE_NULL = new JsonToken("VALUE_NULL", 12, "null");
        $VALUES = (new JsonToken[] {
            NOT_AVAILABLE, START_OBJECT, END_OBJECT, START_ARRAY, END_ARRAY, FIELD_NAME, VALUE_EMBEDDED_OBJECT, VALUE_STRING, VALUE_NUMBER_INT, VALUE_NUMBER_FLOAT, 
            VALUE_TRUE, VALUE_FALSE, VALUE_NULL
        });
    }
}
