// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import com.facebook.base.broadcast.a;
import com.facebook.common.hardware.k;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.base.c:
//            a, b

class ap extends d
{

    final com.facebook.base.c.a a;

    private ap(com.facebook.base.c.a a1)
    {
        a = a1;
        super();
    }

    ap(com.facebook.base.c.a a1, b b1)
    {
        this(a1);
    }

    public k a()
    {
        return new k((Context)e().a(android/content/Context), (ConnectivityManager)e().a(android/net/ConnectivityManager), (WifiManager)e().a(android/net/wifi/WifiManager), (a)a(com/facebook/base/broadcast/a));
    }

    public Object b()
    {
        return a();
    }
}
