// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.json;


public final class JsonToken extends Enum
{

    private static final JsonToken $VALUES[];
    public static final JsonToken END_ARRAY;
    public static final JsonToken END_OBJECT;
    public static final JsonToken FIELD_NAME;
    public static final JsonToken NOT_AVAILABLE;
    public static final JsonToken START_ARRAY;
    public static final JsonToken START_OBJECT;
    public static final JsonToken VALUE_FALSE;
    public static final JsonToken VALUE_NULL;
    public static final JsonToken VALUE_NUMBER_FLOAT;
    public static final JsonToken VALUE_NUMBER_INT;
    public static final JsonToken VALUE_STRING;
    public static final JsonToken VALUE_TRUE;

    private JsonToken(String s, int i)
    {
        super(s, i);
    }

    public static JsonToken valueOf(String s)
    {
        return (JsonToken)Enum.valueOf(com/google/api/client/json/JsonToken, s);
    }

    public static JsonToken[] values()
    {
        return (JsonToken[])$VALUES.clone();
    }

    static 
    {
        START_ARRAY = new JsonToken("START_ARRAY", 0);
        END_ARRAY = new JsonToken("END_ARRAY", 1);
        START_OBJECT = new JsonToken("START_OBJECT", 2);
        END_OBJECT = new JsonToken("END_OBJECT", 3);
        FIELD_NAME = new JsonToken("FIELD_NAME", 4);
        VALUE_STRING = new JsonToken("VALUE_STRING", 5);
        VALUE_NUMBER_INT = new JsonToken("VALUE_NUMBER_INT", 6);
        VALUE_NUMBER_FLOAT = new JsonToken("VALUE_NUMBER_FLOAT", 7);
        VALUE_TRUE = new JsonToken("VALUE_TRUE", 8);
        VALUE_FALSE = new JsonToken("VALUE_FALSE", 9);
        VALUE_NULL = new JsonToken("VALUE_NULL", 10);
        NOT_AVAILABLE = new JsonToken("NOT_AVAILABLE", 11);
        $VALUES = (new JsonToken[] {
            START_ARRAY, END_ARRAY, START_OBJECT, END_OBJECT, FIELD_NAME, VALUE_STRING, VALUE_NUMBER_INT, VALUE_NUMBER_FLOAT, VALUE_TRUE, VALUE_FALSE, 
            VALUE_NULL, NOT_AVAILABLE
        });
    }
}
