// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.entity.mime;


public class MinimalField
{

    private final String name;
    private final String value;

    MinimalField(String s, String s1)
    {
        name = s;
        value = s1;
    }

    public String getBody()
    {
        return value;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(name);
        stringbuilder.append(": ");
        stringbuilder.append(value);
        return stringbuilder.toString();
    }
}
