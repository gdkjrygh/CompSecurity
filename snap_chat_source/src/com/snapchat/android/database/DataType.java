// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database;


public final class DataType extends Enum
{

    private static final DataType $VALUES[];
    public static final DataType BLOB;
    public static final DataType BOOLEAN;
    public static final DataType INTEGER;
    public static final DataType LONG;
    public static final DataType MAP;
    public static final DataType REAL;
    public static final DataType TEXT;
    private String a;

    private DataType(String s, int i, String s1)
    {
        super(s, i);
        a = s1;
    }

    public static DataType valueOf(String s)
    {
        return (DataType)Enum.valueOf(com/snapchat/android/database/DataType, s);
    }

    public static DataType[] values()
    {
        return (DataType[])$VALUES.clone();
    }

    public final String toString()
    {
        return a;
    }

    static 
    {
        BLOB = new DataType("BLOB", 0, "BLOB");
        TEXT = new DataType("TEXT", 1, "TEXT");
        MAP = new DataType("MAP", 2, "TEXT");
        INTEGER = new DataType("INTEGER", 3, "INTEGER");
        LONG = new DataType("LONG", 4, "INTEGER");
        BOOLEAN = new DataType("BOOLEAN", 5, "INTEGER");
        REAL = new DataType("REAL", 6, "REAL");
        $VALUES = (new DataType[] {
            BLOB, TEXT, MAP, INTEGER, LONG, BOOLEAN, REAL
        });
    }
}
