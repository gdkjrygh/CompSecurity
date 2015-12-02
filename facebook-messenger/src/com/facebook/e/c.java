// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.e;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.facebook.c.k;
import com.facebook.common.time.a;
import com.facebook.prefs.shared.aj;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.f;
import java.util.HashMap;

// Referenced classes of package com.facebook.e:
//            g, d, e, f

public class c
    implements com.facebook.base.c
{

    private final Context a;
    private final ConnectivityManager b;
    private final a c;
    private final d d;
    private k e;
    private g f;
    private long g;
    private f h;
    private boolean i;

    public c(Context context, ConnectivityManager connectivitymanager, a a1, d d1)
    {
        f = g.WIFI_UNKNOWN;
        a = context;
        b = connectivitymanager;
        c = a1;
        g = 0L;
        d = d1;
    }

    static void a(c c1)
    {
        c1.e();
    }

    static void a(c c1, g g1)
    {
        c1.a(g1);
    }

    private void a(g g1)
    {
        this;
        JVM INSTR monitorenter ;
        f = g1;
        this;
        JVM INSTR monitorexit ;
        return;
        g1;
        throw g1;
    }

    private void d()
    {
        NetworkInfo networkinfo = c();
        if (networkinfo != null && networkinfo.getType() == 1)
        {
            a(g.WIFI_ON);
            return;
        } else
        {
            a(g.WIFI_OFF);
            return;
        }
    }

    private void e()
    {
        i = d.a(aj.K, false);
    }

    public void a()
    {
        HashMap hashmap = new HashMap(2);
        hashmap.put("android.net.wifi.supplicant.CONNECTION_CHANGE", new com.facebook.e.d(this));
        hashmap.put("android.net.wifi.STATE_CHANGE", new e(this));
        e = new k(hashmap);
        a.registerReceiver(e, new IntentFilter("android.net.wifi.supplicant.CONNECTION_CHANGE"));
        a.registerReceiver(e, new IntentFilter("android.net.wifi.STATE_CHANGE"));
        h = new com.facebook.e.f(this);
        d.a(h);
        e();
    }

    public boolean a(boolean flag)
    {
        if (!i)
        {
            if (flag || f == g.WIFI_UNKNOWN)
            {
                d();
            }
            if (f == g.WIFI_ON)
            {
                return true;
            }
        }
        return false;
    }

    public boolean b()
    {
        return a(false);
    }

    public NetworkInfo c()
    {
        NetworkInfo networkinfo;
        try
        {
            networkinfo = b.getActiveNetworkInfo();
        }
        catch (SecurityException securityexception)
        {
            return null;
        }
        return networkinfo;
    }
}
