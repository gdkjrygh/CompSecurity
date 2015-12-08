// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;


public final class JsonNodeType extends Enum
{

    private static final JsonNodeType $VALUES[];
    public static final JsonNodeType ARRAY;
    public static final JsonNodeType BINARY;
    public static final JsonNodeType BOOLEAN;
    public static final JsonNodeType MISSING;
    public static final JsonNodeType NULL;
    public static final JsonNodeType NUMBER;
    public static final JsonNodeType OBJECT;
    public static final JsonNodeType POJO;
    public static final JsonNodeType STRING;

    private JsonNodeType(String s, int i)
    {
        super(s, i);
    }

    public static JsonNodeType valueOf(String s)
    {
        return (JsonNodeType)Enum.valueOf(com/fasterxml/jackson/databind/node/JsonNodeType, s);
    }

    public static JsonNodeType[] values()
    {
        return (JsonNodeType[])$VALUES.clone();
    }

    static 
    {
        ARRAY = new JsonNodeType("ARRAY", 0);
        BINARY = new JsonNodeType("BINARY", 1);
        BOOLEAN = new JsonNodeType("BOOLEAN", 2);
        MISSING = new JsonNodeType("MISSING", 3);
        NULL = new JsonNodeType("NULL", 4);
        NUMBER = new JsonNodeType("NUMBER", 5);
        OBJECT = new JsonNodeType("OBJECT", 6);
        POJO = new JsonNodeType("POJO", 7);
        STRING = new JsonNodeType("STRING", 8);
        $VALUES = (new JsonNodeType[] {
            ARRAY, BINARY, BOOLEAN, MISSING, NULL, NUMBER, OBJECT, POJO, STRING
        });
    }
}
