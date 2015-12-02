// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import com.facebook.analytics.service.r;
import com.facebook.fbservice.ops.k;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.analytics:
//            ak, ay, az

class bj extends d
{

    final ay a;

    private bj(ay ay)
    {
        a = ay;
        super();
    }

    bj(ay ay, az az)
    {
        this(ay);
    }

    public r a()
    {
        return new r((k)a(com/facebook/fbservice/ops/k), (ak)a(com/facebook/analytics/ak));
    }

    public Object b()
    {
        return a();
    }
}
