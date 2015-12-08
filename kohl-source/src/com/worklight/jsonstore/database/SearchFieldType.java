// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.database;


public final class SearchFieldType extends Enum
{

    private static final SearchFieldType $VALUES[];
    public static final SearchFieldType BOOLEAN;
    public static final SearchFieldType INTEGER;
    public static final SearchFieldType NUMBER;
    public static final SearchFieldType STRING;
    private String mappedType;
    private String name;

    private SearchFieldType(String s, int i, String s1, String s2)
    {
        super(s, i);
        name = s1;
        mappedType = s2;
    }

    public static SearchFieldType fromString(String s)
    {
        if (s.equals(BOOLEAN.name))
        {
            return BOOLEAN;
        }
        if (s.equals(INTEGER.name))
        {
            return INTEGER;
        }
        if (s.equals(NUMBER.name))
        {
            return NUMBER;
        }
        if (s.equals(STRING.name))
        {
            return STRING;
        } else
        {
            return null;
        }
    }

    public static SearchFieldType valueOf(String s)
    {
        return (SearchFieldType)Enum.valueOf(com/worklight/jsonstore/database/SearchFieldType, s);
    }

    public static SearchFieldType[] values()
    {
        return (SearchFieldType[])$VALUES.clone();
    }

    public String getMappedType()
    {
        return mappedType;
    }

    public String getName()
    {
        return name;
    }

    static 
    {
        BOOLEAN = new SearchFieldType("BOOLEAN", 0, "boolean", "INTEGER");
        INTEGER = new SearchFieldType("INTEGER", 1, "integer", "INTEGER");
        NUMBER = new SearchFieldType("NUMBER", 2, "number", "REAL");
        STRING = new SearchFieldType("STRING", 3, "string", "TEXT");
        $VALUES = (new SearchFieldType[] {
            BOOLEAN, INTEGER, NUMBER, STRING
        });
    }
}
