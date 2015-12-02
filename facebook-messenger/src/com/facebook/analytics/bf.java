// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import com.facebook.analytics.service.q;
import com.facebook.analytics.service.u;
import com.facebook.fbservice.service.e;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.analytics:
//            ay, az

class bf extends d
{

    final ay a;

    private bf(ay ay)
    {
        a = ay;
        super();
    }

    bf(ay ay, az az)
    {
        this(ay);
    }

    public e a()
    {
        return new q((u)a(com/facebook/analytics/service/u));
    }

    public Object b()
    {
        return a();
    }
}
