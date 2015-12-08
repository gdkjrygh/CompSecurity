// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller.query;


// Referenced classes of package com.soundcloud.propeller.query:
//            WhereDelegate, ColumnFunction, Where, Query, 
//            ColumnFunctions

public class Exists extends WhereDelegate
    implements ColumnFunction, Where
{

    private String columnAlias;
    private final Query subQuery;

    Exists(Query query)
    {
        super(query);
        subQuery = query.select(new Object[] {
            Character.valueOf('1')
        });
    }

    public volatile ColumnFunction as(String s)
    {
        return as(s);
    }

    public Exists as(String s)
    {
        columnAlias = s;
        return this;
    }

    public String build()
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        stringbuilder.append("exists(").append(subQuery.build()).append(')');
        ColumnFunctions.aliasColumn(stringbuilder, columnAlias);
        return stringbuilder.toString();
    }

    public volatile String[] getArguments()
    {
        return super.getArguments();
    }

    public volatile String getSelection()
    {
        return super.getSelection();
    }
}
