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
    final int _id;
    final boolean _isBoolean;
    final boolean _isNumber;
    final boolean _isScalar;
    final boolean _isStructEnd;
    final boolean _isStructStart;
    final String _serialized;
    final byte _serializedBytes[];
    final char _serializedChars[];

    private JsonToken(String s, int i, String s1, int j)
    {
        boolean flag1 = true;
        super(s, i);
        boolean flag;
        if (s1 == null)
        {
            _serialized = null;
            _serializedChars = null;
            _serializedBytes = null;
        } else
        {
            _serialized = s1;
            _serializedChars = s1.toCharArray();
            int k = _serializedChars.length;
            _serializedBytes = new byte[k];
            i = 0;
            while (i < k) 
            {
                _serializedBytes[i] = (byte)_serializedChars[i];
                i++;
            }
        }
        _id = j;
        if (j == 10 || j == 9)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _isBoolean = flag;
        if (j == 7 || j == 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _isNumber = flag;
        if (j == 1 || j == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _isStructStart = flag;
        if (j == 2 || j == 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _isStructEnd = flag;
        if (!_isStructStart && !_isStructEnd && j != 5 && j != -1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        _isScalar = flag;
    }

    public static JsonToken valueOf(String s)
    {
        return (JsonToken)Enum.valueOf(com/fasterxml/jackson/core/JsonToken, s);
    }

    public static JsonToken[] values()
    {
        return (JsonToken[])$VALUES.clone();
    }

    public final char[] asCharArray()
    {
        return _serializedChars;
    }

    public final String asString()
    {
        return _serialized;
    }

    public final int id()
    {
        return _id;
    }

    public final boolean isNumeric()
    {
        return _isNumber;
    }

    public final boolean isScalarValue()
    {
        return _isScalar;
    }

    public final boolean isStructEnd()
    {
        return _isStructEnd;
    }

    public final boolean isStructStart()
    {
        return _isStructStart;
    }

    static 
    {
        NOT_AVAILABLE = new JsonToken("NOT_AVAILABLE", 0, null, -1);
        START_OBJECT = new JsonToken("START_OBJECT", 1, "{", 1);
        END_OBJECT = new JsonToken("END_OBJECT", 2, "}", 2);
        START_ARRAY = new JsonToken("START_ARRAY", 3, "[", 3);
        END_ARRAY = new JsonToken("END_ARRAY", 4, "]", 4);
        FIELD_NAME = new JsonToken("FIELD_NAME", 5, null, 5);
        VALUE_EMBEDDED_OBJECT = new JsonToken("VALUE_EMBEDDED_OBJECT", 6, null, 12);
        VALUE_STRING = new JsonToken("VALUE_STRING", 7, null, 6);
        VALUE_NUMBER_INT = new JsonToken("VALUE_NUMBER_INT", 8, null, 7);
        VALUE_NUMBER_FLOAT = new JsonToken("VALUE_NUMBER_FLOAT", 9, null, 8);
        VALUE_TRUE = new JsonToken("VALUE_TRUE", 10, "true", 9);
        VALUE_FALSE = new JsonToken("VALUE_FALSE", 11, "false", 10);
        VALUE_NULL = new JsonToken("VALUE_NULL", 12, "null", 11);
        $VALUES = (new JsonToken[] {
            NOT_AVAILABLE, START_OBJECT, END_OBJECT, START_ARRAY, END_ARRAY, FIELD_NAME, VALUE_EMBEDDED_OBJECT, VALUE_STRING, VALUE_NUMBER_INT, VALUE_NUMBER_FLOAT, 
            VALUE_TRUE, VALUE_FALSE, VALUE_NULL
        });
    }
}
