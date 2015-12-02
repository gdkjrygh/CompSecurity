// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.cache;

import com.facebook.analytics.f;
import com.facebook.common.e.d;
import com.facebook.common.w.q;
import com.facebook.e.h;
import com.facebook.inject.a.a;
import com.facebook.inject.a.c;
import com.facebook.inject.a.g;

// Referenced classes of package com.facebook.cache:
//            j, d, v, h, 
//            q, g, k, e, 
//            s, f, IsMemoryCacheManagerTrimmingEnabled

public class b extends com.facebook.inject.b
{

    public b()
    {
    }

    protected void a()
    {
        e(com/facebook/analytics/f);
        f(com/facebook/e/h);
        f(com/facebook/common/e/d);
        a(com/facebook/cache/j).a(new com.facebook.cache.d(this, null)).a();
        a(com/facebook/cache/v).a(new com.facebook.cache.h(this, null)).a();
        a(com/facebook/cache/q).a(new com.facebook.cache.g(null)).a();
        b(com/facebook/cache/k).a(new e(this, null)).a();
        b(com/facebook/cache/s).a(new com.facebook.cache.f(this, null)).a();
        b(com/facebook/common/w/q).a(com/facebook/cache/IsMemoryCacheManagerTrimmingEnabled).a(q.NO);
    }
}
