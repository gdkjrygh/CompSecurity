// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import com.facebook.inject.d;
import com.facebook.orca.login.b;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class do extends d
{

    final h a;

    private do(h h)
    {
        a = h;
        super();
    }

    do(h h, i i)
    {
        this(h);
    }

    public b a()
    {
        return new b((com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (TelephonyManager)a(android/telephony/TelephonyManager), (WifiManager)a(android/net/wifi/WifiManager));
    }

    public Object b()
    {
        return a();
    }
}
