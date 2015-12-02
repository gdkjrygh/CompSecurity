// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.b;

import com.facebook.common.w.q;
import com.facebook.f.n;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import com.facebook.user.User;

public class a
    implements javax.inject.a
{

    private static final ae a = n.a("messenger_client_analytics_android");
    private final javax.inject.a b;
    private final d c;

    public a(javax.inject.a a1, d d1)
    {
        b = a1;
        c = d1;
    }

    public q a()
    {
        if ((User)b.b() == null)
        {
            return q.UNSET;
        }
        if (c.a(a, false))
        {
            return q.YES;
        } else
        {
            return q.NO;
        }
    }

    public Object b()
    {
        return a();
    }

}
