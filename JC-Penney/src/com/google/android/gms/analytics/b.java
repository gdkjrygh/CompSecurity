// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import com.google.android.gms.analytics.internal.ab;
import com.google.android.gms.analytics.internal.bb;
import com.google.android.gms.analytics.internal.j;

// Referenced classes of package com.google.android.gms.analytics:
//            a, AnalyticsService

class b
    implements Runnable
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public void run()
    {
label0:
        {
            if (a.d.stopSelfResult(a.a))
            {
                if (!a.b.e().a())
                {
                    break label0;
                }
                a.c.b("Device AnalyticsService processed last dispatch request");
            }
            return;
        }
        a.c.b("Local AnalyticsService processed last dispatch request");
    }
}
