// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import android.content.Context;
import com.facebook.analytics.c.a;
import com.facebook.analytics.c.e;
import com.facebook.analytics.c.g;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.analytics:
//            ay, az

class bg extends d
{

    final ay a;

    private bg(ay ay)
    {
        a = ay;
        super();
    }

    bg(ay ay, az az)
    {
        this(ay);
    }

    public g a()
    {
        return new g((Context)e().a(android/content/Context), (a)a(com/facebook/analytics/c/a), (e)a(com/facebook/analytics/c/e), (com.facebook.common.time.a)a(com/facebook/common/time/a));
    }

    public Object b()
    {
        return a();
    }
}
