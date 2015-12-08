// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.jsonstore.types;


public final class JSONStoreParameterType extends Enum
{

    private static final JSONStoreParameterType $VALUES[];
    public static final JSONStoreParameterType ARRAY;
    public static final JSONStoreParameterType BOOLEAN;
    public static final JSONStoreParameterType DOUBLE;
    public static final JSONStoreParameterType INTEGER;
    public static final JSONStoreParameterType LONG;
    public static final JSONStoreParameterType OBJECT;
    public static final JSONStoreParameterType STRING;

    private JSONStoreParameterType(String s, int i)
    {
        super(s, i);
    }

    public static JSONStoreParameterType valueOf(String s)
    {
        return (JSONStoreParameterType)Enum.valueOf(com/worklight/androidgap/jsonstore/types/JSONStoreParameterType, s);
    }

    public static JSONStoreParameterType[] values()
    {
        return (JSONStoreParameterType[])$VALUES.clone();
    }

    static 
    {
        ARRAY = new JSONStoreParameterType("ARRAY", 0);
        BOOLEAN = new JSONStoreParameterType("BOOLEAN", 1);
        DOUBLE = new JSONStoreParameterType("DOUBLE", 2);
        INTEGER = new JSONStoreParameterType("INTEGER", 3);
        LONG = new JSONStoreParameterType("LONG", 4);
        OBJECT = new JSONStoreParameterType("OBJECT", 5);
        STRING = new JSONStoreParameterType("STRING", 6);
        $VALUES = (new JSONStoreParameterType[] {
            ARRAY, BOOLEAN, DOUBLE, INTEGER, LONG, OBJECT, STRING
        });
    }
}
