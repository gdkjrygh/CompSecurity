// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.analytics.ak;
import com.facebook.analytics.al;
import com.facebook.base.a.d;
import com.facebook.f.n;
import com.facebook.prefs.shared.ae;
import com.facebook.user.User;
import javax.inject.a;

public class fe
    implements ak
{

    private static final ae a = n.a("messenger_client_analytics_android");
    private static final ae b = n.a("messenger_client_core_analytics_android");
    private final a c;
    private final com.facebook.prefs.shared.d d;
    private final d e;

    public fe(a a1, com.facebook.prefs.shared.d d1, d d2)
    {
        c = a1;
        d = d1;
        e = d2;
    }

    public al a()
    {
        User user = (User)c.b();
        if (!e.c() || user == null)
        {
            return al.UNSET;
        }
        if (d.a(a, false))
        {
            return al.CORE_AND_SAMPLED;
        }
        if (d.a(b, true))
        {
            return al.CORE;
        } else
        {
            return al.NONE;
        }
    }

    public boolean b()
    {
        User user = (User)c.b();
        return user != null && user.y();
    }

}
