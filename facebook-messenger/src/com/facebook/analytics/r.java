// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import com.facebook.analytics.b.c;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.analytics:
//            f, g

class r extends d
{

    final f a;

    private r(f f)
    {
        a = f;
        super();
    }

    r(f f, g g)
    {
        this(f);
    }

    public com.facebook.analytics.cache.d a()
    {
        return new com.facebook.analytics.cache.d((c)a(com/facebook/analytics/b/c));
    }

    public Object b()
    {
        return a();
    }
}
