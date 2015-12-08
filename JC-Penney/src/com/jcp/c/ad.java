// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.support.v4.f.a;
import java.util.Map;

public class ad
{

    private a a;

    public ad()
    {
        a = new a();
    }

    private ad a(String s, boolean flag)
    {
        String s1;
        if (flag)
        {
            s1 = "true";
        } else
        {
            s1 = "false";
        }
        return b(s, s1);
    }

    public static Map a(String s)
    {
        return (new ad()).f(s).a();
    }

    public static Map a(String s, String s1)
    {
        return (new ad()).b(s).c(s1).a();
    }

    private ad b(String s, String s1)
    {
        a.put(s, s1);
        return this;
    }

    public ad a(boolean flag)
    {
        return a("emailOptin", flag);
    }

    public Map a()
    {
        return a;
    }

    public ad b(String s)
    {
        return b("email", s);
    }

    public ad b(boolean flag)
    {
        return a("guest", flag);
    }

    public ad c(String s)
    {
        return b("password", s);
    }

    public ad d(String s)
    {
        return b("firstName", s);
    }

    public ad e(String s)
    {
        return b("lastName", s);
    }

    public ad f(String s)
    {
        return b("id", s);
    }
}
