// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import android.net.ConnectivityManager;
import com.facebook.analytics.g.e;
import com.facebook.analytics.g.g;
import com.facebook.http.b.ar;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.analytics:
//            au, av, g

class k extends d
{

    private k()
    {
    }

    k(com.facebook.analytics.g g1)
    {
        this();
    }

    public au a()
    {
        return new au((av)a(com/facebook/analytics/av), (ar)a(com/facebook/http/b/ar), (ConnectivityManager)a(android/net/ConnectivityManager), (e)a(com/facebook/analytics/g/g));
    }

    public Object b()
    {
        return a();
    }
}
