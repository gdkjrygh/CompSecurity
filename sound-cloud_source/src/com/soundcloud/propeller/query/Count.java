// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller.query;


// Referenced classes of package com.soundcloud.propeller.query:
//            ColumnFunction, ColumnFunctions

public class Count
    implements ColumnFunction
{

    private final String column;
    private String columnAlias;

    Count(String s)
    {
        column = s;
    }

    public volatile ColumnFunction as(String s)
    {
        return as(s);
    }

    public Count as(String s)
    {
        columnAlias = s;
        return this;
    }

    public String build()
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        stringbuilder.append("count(").append(column).append(')');
        ColumnFunctions.aliasColumn(stringbuilder, columnAlias);
        return stringbuilder.toString();
    }
}
