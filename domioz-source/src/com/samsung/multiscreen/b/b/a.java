// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.b.b;

import java.util.Map;

public final class a
{

    private Map a;

    private a(Map map)
    {
        a = map;
    }

    public static a a(Map map)
    {
        return new a(map);
    }

    public final String a()
    {
        return (String)a.get("endpoint");
    }

    public final Boolean b()
    {
        Boolean boolean1 = (Boolean)a.get("hostConnected");
        if (boolean1 != null)
        {
            return boolean1;
        } else
        {
            return Boolean.FALSE;
        }
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[ChannelInfo] id: ").append((String)a.get("id")).append(", endpoint: ").append(a());
        return stringbuilder.toString();
    }
}
