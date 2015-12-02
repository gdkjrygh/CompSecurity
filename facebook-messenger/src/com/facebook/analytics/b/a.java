// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.b;

import com.facebook.common.w.n;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.aj;
import com.google.common.base.Preconditions;

public class a
{

    public static ae a;
    static String b = "data";
    static String c = "last_update_time";
    private static String d = "/";

    public a()
    {
    }

    private ae a(String s)
    {
        boolean flag;
        if (!n.a(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Cannot handle null process name");
        return (ae)a.c((new StringBuilder()).append(s).append(d).toString());
    }

    ae a(String s, String s1)
    {
        boolean flag;
        if (!n.a(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Should specify counters name");
        return (ae)a(s).c((new StringBuilder()).append(s1).append(d).toString());
    }

    String[] a(ae ae1)
    {
        Preconditions.checkArgument(ae1.a(a), "Invalid counters prefkey");
        return ae1.b(a).split(d, 3);
    }

    ae b(String s, String s1)
    {
        return (ae)a(s, s1).c(c);
    }

    boolean b(ae ae1)
    {
        return ae1.a(a) && ae1.a().endsWith(b);
    }

    ae c(String s, String s1)
    {
        return (ae)a(s, s1).c(b);
    }

    static 
    {
        a = (ae)aj.a.c("analytics_counters/");
    }
}
