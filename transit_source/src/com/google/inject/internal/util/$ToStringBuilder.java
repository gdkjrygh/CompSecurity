// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.LinkedHashMap;
import java.util.Map;

public class $ToStringBuilder
{

    final Map map = new LinkedHashMap();
    final String name;

    public $ToStringBuilder(Class class1)
    {
        name = class1.getSimpleName();
    }

    public $ToStringBuilder add(String s, Object obj)
    {
        if (map.put(s, obj) != null)
        {
            throw new RuntimeException((new StringBuilder()).append("Duplicate names: ").append(s).toString());
        } else
        {
            return this;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append(name).append(map.toString().replace('{', '[').replace('}', ']')).toString();
    }
}
