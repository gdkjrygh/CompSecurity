// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller.schema;


// Referenced classes of package com.soundcloud.propeller.schema:
//            Table

public class Column
{

    private final String fullName;
    private final String name;
    private final String qualifiedName;

    protected Column(Table table, String s)
    {
        name = s;
        qualifiedName = (new StringBuilder()).append(table.name()).append(".").append(s).toString();
        fullName = (new StringBuilder()).append(table.name()).append("_").append(s).toString();
    }

    public static Column create(Table table, String s)
    {
        return new Column(table, s);
    }

    public String as(String s)
    {
        return (new StringBuilder()).append(qualifiedName).append(" AS ").append(s).toString();
    }

    public String asFullName()
    {
        return as(fullName);
    }

    public String fullName()
    {
        return fullName;
    }

    public String name()
    {
        return name;
    }

    public String qualifiedName()
    {
        return qualifiedName;
    }

    public String toString()
    {
        return qualifiedName;
    }
}
