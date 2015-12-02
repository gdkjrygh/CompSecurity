// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.module;

import com.facebook.f.n;
import com.facebook.prefs.shared.ae;
import javax.inject.a;

public class d
    implements a
{

    private static final ae a = n.a("android_analytics_periodic_device_status");
    private final com.facebook.prefs.shared.d b;

    public d(com.facebook.prefs.shared.d d1)
    {
        b = d1;
    }

    public Boolean a()
    {
        return Boolean.valueOf(b.a(a, false));
    }

    public Object b()
    {
        return a();
    }

}
