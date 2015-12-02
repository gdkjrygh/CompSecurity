// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.cache;

import com.facebook.inject.d;

// Referenced classes of package com.facebook.cache:
//            v, b, c

class h extends d
{

    final b a;

    private h(b b1)
    {
        a = b1;
        super();
    }

    h(b b1, c c)
    {
        this(b1);
    }

    public v a()
    {
        return new v((com.facebook.analytics.cache.h)a(com/facebook/analytics/cache/h), (com.facebook.common.e.h)a(com/facebook/common/e/h));
    }

    public Object b()
    {
        return a();
    }
}
