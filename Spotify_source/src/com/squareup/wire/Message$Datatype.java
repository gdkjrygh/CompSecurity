// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.wire;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class value extends Enum
{

    private static final DOUBLE $VALUES[];
    public static final DOUBLE BOOL;
    public static final DOUBLE BYTES;
    public static final DOUBLE DOUBLE;
    public static final DOUBLE ENUM;
    public static final DOUBLE FIXED32;
    public static final DOUBLE FIXED64;
    public static final DOUBLE FLOAT;
    public static final DOUBLE INT32;
    public static final DOUBLE INT64;
    public static final DOUBLE MESSAGE;
    public static final Comparator ORDER_BY_NAME = new Comparator() {

        public final int compare(Object obj, Object obj1)
        {
            obj = (Message.Datatype)obj;
            obj1 = (Message.Datatype)obj1;
            return ((Message.Datatype) (obj)).name().compareTo(((Message.Datatype) (obj1)).name());
        }

    };
    public static final name SFIXED32;
    public static final name SFIXED64;
    public static final name SINT32;
    public static final name SINT64;
    public static final name STRING;
    private static final Map TYPES_BY_NAME;
    public static final name UINT32;
    public static final name UINT64;
    public final int value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/squareup/wire/Message$Datatype, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    static 
    {
        INT32 = new <init>("INT32", 0, 1);
        INT64 = new <init>("INT64", 1, 2);
        UINT32 = new <init>("UINT32", 2, 3);
        UINT64 = new <init>("UINT64", 3, 4);
        SINT32 = new <init>("SINT32", 4, 5);
        SINT64 = new <init>("SINT64", 5, 6);
        BOOL = new <init>("BOOL", 6, 7);
        ENUM = new <init>("ENUM", 7, 8);
        STRING = new <init>("STRING", 8, 9);
        BYTES = new <init>("BYTES", 9, 10);
        MESSAGE = new <init>("MESSAGE", 10, 11);
        FIXED32 = new <init>("FIXED32", 11, 12);
        SFIXED32 = new <init>("SFIXED32", 12, 13);
        FIXED64 = new <init>("FIXED64", 13, 14);
        SFIXED64 = new <init>("SFIXED64", 14, 15);
        FLOAT = new <init>("FLOAT", 15, 16);
        DOUBLE = new <init>("DOUBLE", 16, 17);
        $VALUES = (new .VALUES[] {
            INT32, INT64, UINT32, UINT64, SINT32, SINT64, BOOL, ENUM, STRING, BYTES, 
            MESSAGE, FIXED32, SFIXED32, FIXED64, SFIXED64, FLOAT, DOUBLE
        });
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        TYPES_BY_NAME = linkedhashmap;
        linkedhashmap.put("int32", INT32);
        TYPES_BY_NAME.put("int64", INT64);
        TYPES_BY_NAME.put("uint32", UINT32);
        TYPES_BY_NAME.put("uint64", UINT64);
        TYPES_BY_NAME.put("sint32", SINT32);
        TYPES_BY_NAME.put("sint64", SINT64);
        TYPES_BY_NAME.put("bool", BOOL);
        TYPES_BY_NAME.put("enum", ENUM);
        TYPES_BY_NAME.put("string", STRING);
        TYPES_BY_NAME.put("bytes", BYTES);
        TYPES_BY_NAME.put("message", MESSAGE);
        TYPES_BY_NAME.put("fixed32", FIXED32);
        TYPES_BY_NAME.put("sfixed32", SFIXED32);
        TYPES_BY_NAME.put("fixed64", FIXED64);
        TYPES_BY_NAME.put("sfixed64", SFIXED64);
        TYPES_BY_NAME.put("float", FLOAT);
        TYPES_BY_NAME.put("double", DOUBLE);
    }

    private _cls1(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }
}
