// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.enums;


public final class SqlDataType extends Enum
{

    private static final SqlDataType $VALUES[];
    public static final SqlDataType BOOLEAN;
    public static final SqlDataType DATETIME;
    public static final SqlDataType INTEGER;
    public static final SqlDataType REAL;
    public static final SqlDataType TEXT;
    private final String mName;

    private SqlDataType(String s, int i, String s1)
    {
        super(s, i);
        mName = s1;
    }

    public static SqlDataType valueOf(String s)
    {
        return (SqlDataType)Enum.valueOf(com/tinder/enums/SqlDataType, s);
    }

    public static SqlDataType[] values()
    {
        return (SqlDataType[])$VALUES.clone();
    }

    public final String getName()
    {
        return mName;
    }

    static 
    {
        BOOLEAN = new SqlDataType("BOOLEAN", 0, "BOOLEAN");
        DATETIME = new SqlDataType("DATETIME", 1, "DATETIME");
        INTEGER = new SqlDataType("INTEGER", 2, "INTEGER");
        TEXT = new SqlDataType("TEXT", 3, "TEXT");
        REAL = new SqlDataType("REAL", 4, "REAL");
        $VALUES = (new SqlDataType[] {
            BOOLEAN, DATETIME, INTEGER, TEXT, REAL
        });
    }
}
