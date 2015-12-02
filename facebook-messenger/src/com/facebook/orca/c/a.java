// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.c;

import com.facebook.appconfig.m;
import com.facebook.debug.log.b;
import com.facebook.orca.common.a.d;
import com.google.common.base.Objects;

public class a
{

    private static Class a = com/facebook/orca/c/a;
    private final m b;
    private final d c;
    private final com.facebook.config.b.a d;

    public a(m m1, d d1, com.facebook.config.b.a a1)
    {
        b = m1;
        c = d1;
        d = a1;
    }

    private boolean a(boolean flag)
    {
        com.facebook.debug.log.b.a(a, c());
        String s = d.a();
        String s1 = b(flag);
        if (s1 != null)
        {
            if (c.a(s, s1) < 0)
            {
                return true;
            }
            if (d.b() < c(flag))
            {
                return true;
            }
        }
        return false;
    }

    private String b(boolean flag)
    {
        if (flag)
        {
            return b.a();
        } else
        {
            return b.b();
        }
    }

    private int c(boolean flag)
    {
        if (flag)
        {
            return b.c();
        } else
        {
            return b.d();
        }
    }

    private String c()
    {
        return Objects.toStringHelper("AppConfig").add("minVersion", b.a()).add("minVersionCode", Integer.valueOf(b.c())).add("currentVersion", b.b()).add("currentVersionCode", Integer.valueOf(b.d())).toString();
    }

    public boolean a()
    {
        return a(true);
    }

    public boolean b()
    {
        return a(false);
    }

}
