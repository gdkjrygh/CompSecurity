// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.net.b;

import java.util.Map;

public final class a
{

    private long a;
    private String b;

    public a()
    {
        a = -1L;
        b = "error";
    }

    public static a a(Map map)
    {
        a a1 = new a();
        try
        {
            a1.a = ((Long)map.get("code")).longValue();
            a1.b = (String)map.get("message");
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            map.printStackTrace();
            return a1;
        }
        return a1;
    }

    public final long a()
    {
        return a;
    }

    public final String b()
    {
        return b;
    }

    public final String toString()
    {
        String s = (new StringBuilder()).append("[JSONRPCError]").append(" code: ").append(a).toString();
        return (new StringBuilder()).append(s).append(", message: ").append(b).toString();
    }
}
