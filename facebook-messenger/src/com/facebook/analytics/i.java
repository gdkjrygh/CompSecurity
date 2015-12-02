// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import com.facebook.analytics.b.b;
import com.facebook.analytics.i.a;
import com.facebook.common.hardware.k;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.analytics:
//            a, f, g

class i extends d
{

    final f a;

    private i(f f)
    {
        a = f;
        super();
    }

    i(f f, g g)
    {
        this(f);
    }

    public a a()
    {
        return new a((k)a(com/facebook/common/hardware/k), (com.facebook.analytics.a)a(com/facebook/analytics/a), (com.facebook.analytics.cache.d)a(com/facebook/analytics/cache/d), (com.facebook.analytics.j.a)a(com/facebook/analytics/j/a), c(com/facebook/analytics/d/a), (b)a(com/facebook/analytics/b/b));
    }

    public Object b()
    {
        return a();
    }
}
