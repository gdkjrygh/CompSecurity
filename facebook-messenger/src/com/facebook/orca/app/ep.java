// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.Context;
import com.facebook.analytics.av;
import com.facebook.auth.annotations.IsMeUserAnEmployee;
import com.facebook.bugreporter.g;
import com.facebook.c.s;
import com.facebook.common.w.q;
import com.facebook.inject.d;
import com.facebook.orca.annotations.IsMessengerBugReporterEnabled;
import com.facebook.orca.h.a;
import com.facebook.orca.h.b;

// Referenced classes of package com.facebook.orca.app:
//            fd, dv, dw

class ep extends d
{

    final dv a;

    private ep(dv dv)
    {
        a = dv;
        super();
    }

    ep(dv dv, dw dw)
    {
        this(dv);
    }

    public fd a()
    {
        return new fd((Context)a(android/content/Context), (g)a(com/facebook/bugreporter/g), b(java/lang/Boolean, com/facebook/orca/annotations/IsMessengerBugReporterEnabled), (av)a(com/facebook/analytics/av), (b)a(com/facebook/orca/h/b), b(com/facebook/common/w/q, com/facebook/auth/annotations/IsMeUserAnEmployee), (com.facebook.auth.b.b)a(com/facebook/auth/b/b), (s)a(com/facebook/c/s), (a)a(com/facebook/orca/h/a));
    }

    public Object b()
    {
        return a();
    }
}
