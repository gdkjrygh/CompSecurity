// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.analytics;

import android.os.Handler;

// Referenced classes of package com.brightcove.player.analytics:
//            Analytics

final class a
    implements Runnable
{

    private Analytics a;

    public final void run()
    {
        if (Analytics.x(a) != null)
        {
            Analytics.a(a, Analytics.x(a), Analytics.h(a), Analytics.i(a));
            Analytics.k(a);
            if (Analytics.y(a))
            {
                Analytics.d(a, System.currentTimeMillis());
            } else
            {
                Analytics.d(a, 0L);
            }
            Analytics.j(a);
        }
        Analytics.z(a).postDelayed(this, 10000L);
    }

    (Analytics analytics)
    {
        a = analytics;
        super();
    }
}
