// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller.schema;


// Referenced classes of package com.soundcloud.propeller.schema:
//            Table

public class BaseTable
    implements Table
{

    private final String name;
    private final Table.PrimaryKey primaryKey;

    public BaseTable(String s, Table.PrimaryKey primarykey)
    {
        name = s;
        primaryKey = primarykey;
    }

    public static Table create(String s, Table.PrimaryKey primarykey)
    {
        return new BaseTable(s, primarykey);
    }

    public String name()
    {
        return name;
    }

    public Table.PrimaryKey primaryKey()
    {
        return primaryKey;
    }
}
