// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import android.net.wifi.WifiManager;
import android.os.PowerManager;
import com.facebook.e.c;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            a, ai, aj

class ak extends d
{

    final ai a;

    private ak(ai ai)
    {
        a = ai;
        super();
    }

    ak(ai ai, aj aj)
    {
        this(ai);
    }

    public a a()
    {
        return new a((PowerManager)e().a(android/os/PowerManager), (WifiManager)e().a(android/net/wifi/WifiManager), (c)a(com/facebook/e/c));
    }

    public Object b()
    {
        return a();
    }
}
