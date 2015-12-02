// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import android.content.Context;
import com.facebook.analytics.c.a;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.analytics:
//            ay, az

class ba extends d
{

    final ay a;

    private ba(ay ay)
    {
        a = ay;
        super();
    }

    ba(ay ay, az az)
    {
        this(ay);
    }

    public a a()
    {
        return new a((Context)e().a(android/content/Context), (com.facebook.common.executors.a)a(com/facebook/common/executors/a), (com.facebook.d.b.a)a(com/facebook/d/b/a), (com.facebook.analytics.c.d)a(com/facebook/analytics/c/d));
    }

    public Object b()
    {
        return a();
    }
}
