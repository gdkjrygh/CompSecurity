// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings;


public class Country
    implements Comparable
{

    public String code;
    public String name;

    public Country(String s, String s1)
    {
        code = s;
        name = s1;
    }

    public int compareTo(Object obj)
    {
        if (!(obj instanceof Country))
        {
            return -1;
        } else
        {
            obj = (Country)obj;
            return name.compareTo(((Country) (obj)).name);
        }
    }
}
