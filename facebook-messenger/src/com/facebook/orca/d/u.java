// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.content.Context;
import com.facebook.analytics.av;
import com.facebook.analytics.cache.IsAccessPatternLoggingEnabled;
import com.facebook.analytics.cache.h;
import com.facebook.cache.j;
import com.facebook.common.time.a;
import com.facebook.common.w.q;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.orca.d:
//            a, s, t

class u extends d
{

    final s a;

    private u(s s)
    {
        a = s;
        super();
    }

    u(s s, t t)
    {
        this(s);
    }

    public com.facebook.orca.d.a a()
    {
        return new com.facebook.orca.d.a((Context)e().a(android/content/Context), (a)a(com/facebook/common/time/a), (com.facebook.ui.c.d)a(com/facebook/ui/c/d), (h)a(com/facebook/analytics/cache/h), (com.facebook.analytics.j.a)a(com/facebook/analytics/j/a), (com.facebook.common.e.h)a(com/facebook/common/e/h), (av)a(com/facebook/analytics/av), (j)a(com/facebook/cache/j), b(com/facebook/common/w/q, com/facebook/analytics/cache/IsAccessPatternLoggingEnabled));
    }

    public Object b()
    {
        return a();
    }
}
