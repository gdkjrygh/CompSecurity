// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import com.facebook.inject.d;

// Referenced classes of package com.facebook.analytics:
//            bq, ay, az

class bi extends d
{

    final ay a;

    private bi(ay ay)
    {
        a = ay;
        super();
    }

    bi(ay ay, az az)
    {
        this(ay);
    }

    public com.facebook.analytics.periodicreporters.d a()
    {
        return new com.facebook.analytics.periodicreporters.d((com.facebook.base.a.d)a(com/facebook/base/a/d), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (bq)a(com/facebook/analytics/bq));
    }

    public Object b()
    {
        return a();
    }
}
