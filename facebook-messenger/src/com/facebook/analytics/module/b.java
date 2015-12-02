// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.module;

import com.facebook.base.c;
import com.facebook.common.e.h;
import com.facebook.device_id.a;
import com.facebook.device_id.i;
import com.facebook.device_id.l;

public class b
    implements c, a
{

    private final Class a = com/facebook/analytics/module/b;
    private final l b;
    private final h c;

    public b(h h1, l l1)
    {
        b = l1;
        c = h1;
    }

    private void a(String s)
    {
        if (s != null)
        {
            c.c("marauder_device_id", s);
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("ErrorReporter DEVICE_ID_KEY set to: ").append(s).toString());
        }
    }

    public void a()
    {
        a(b.b());
    }

    public void a(i j, i k)
    {
        a(k.a());
    }
}
