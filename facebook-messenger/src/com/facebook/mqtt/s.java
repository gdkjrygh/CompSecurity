// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.mqtt;

import android.net.ConnectivityManager;
import com.facebook.analytics.cj;
import com.facebook.inject.d;
import com.facebook.k.a;

// Referenced classes of package com.facebook.mqtt:
//            p, y, r

class s extends d
{

    private s()
    {
    }

    s(r r)
    {
        this();
    }

    public p a()
    {
        return new p((ConnectivityManager)a(android/net/ConnectivityManager), (y)a(com/facebook/mqtt/y), (cj)a(com/facebook/analytics/cj), (a)a(com/facebook/k/a), (com.facebook.common.time.a)a(com/facebook/common/time/a));
    }

    public Object b()
    {
        return a();
    }
}
