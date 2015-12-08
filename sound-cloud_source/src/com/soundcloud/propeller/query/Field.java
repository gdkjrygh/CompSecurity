// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller.query;


// Referenced classes of package com.soundcloud.propeller.query:
//            ColumnFunction, ColumnFunctions

public class Field
    implements ColumnFunction
{

    private String columnAlias;
    private final String columnName;

    public Field(String s)
    {
        columnName = s;
    }

    public static Field field(String s)
    {
        return new Field(s);
    }

    public volatile ColumnFunction as(String s)
    {
        return as(s);
    }

    public Field as(String s)
    {
        columnAlias = s;
        return this;
    }

    public String build()
    {
        StringBuilder stringbuilder = new StringBuilder(columnName);
        ColumnFunctions.aliasColumn(stringbuilder, columnAlias);
        return stringbuilder.toString();
    }
}
