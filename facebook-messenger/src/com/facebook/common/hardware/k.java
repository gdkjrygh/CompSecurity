// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.hardware;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.facebook.base.broadcast.a;
import com.facebook.base.c;

// Referenced classes of package com.facebook.common.hardware:
//            m

public class k
    implements c
{

    private static final Class a = com/facebook/common/hardware/k;
    private final Context b;
    private final ConnectivityManager c;
    private final WifiManager d;
    private final a e;
    private m f;

    public k(Context context, ConnectivityManager connectivitymanager, WifiManager wifimanager, a a1)
    {
        b = context;
        c = connectivitymanager;
        d = wifimanager;
        e = a1;
    }

    static ConnectivityManager a(k k1)
    {
        return k1.c;
    }

    static a b(k k1)
    {
        return k1.e;
    }

    static Class e()
    {
        return a;
    }

    public void a()
    {
        f = new m(this, null);
        b.registerReceiver(f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public boolean b()
    {
        NetworkInfo networkinfo = c.getActiveNetworkInfo();
        return networkinfo != null && networkinfo.isConnected();
    }

    public NetworkInfo c()
    {
        if (b())
        {
            return c.getActiveNetworkInfo();
        } else
        {
            return null;
        }
    }

    public int d()
    {
        WifiInfo wifiinfo = d.getConnectionInfo();
        if (wifiinfo != null)
        {
            return wifiinfo.getRssi();
        } else
        {
            return 0x80000000;
        }
    }

}
