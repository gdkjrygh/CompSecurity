// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.ApplicationStatus;
import qwn;
import qxx;
import qxy;

// Referenced classes of package org.chromium.net:
//            NetworkChangeNotifierAutoDetect

public class NetworkChangeNotifier
{

    private static NetworkChangeNotifier g;
    private final Context a;
    private final ArrayList b = new ArrayList();
    private final qwn c = new qwn();
    private NetworkChangeNotifierAutoDetect d;
    private int e;
    private double f;

    private NetworkChangeNotifier(Context context)
    {
        e = 0;
        f = (1.0D / 0.0D);
        a = context.getApplicationContext();
    }

    public static double a(int i)
    {
        return nativeGetMaxBandwidthForConnectionSubtype(i);
    }

    public static void a()
    {
        g.a(true, true);
    }

    private void a(double d1)
    {
        if (d1 != f)
        {
            f = d1;
            Iterator iterator = b.iterator();
            while (iterator.hasNext()) 
            {
                nativeNotifyMaxBandwidthChanged(((Long)iterator.next()).longValue(), d1);
            }
        }
    }

    public static void a(NetworkChangeNotifier networkchangenotifier, double d1)
    {
        networkchangenotifier.a(d1);
    }

    public static void a(NetworkChangeNotifier networkchangenotifier, int i)
    {
        networkchangenotifier.b(i);
    }

    private void a(boolean flag, boolean flag1)
    {
        if (flag)
        {
            if (d == null)
            {
                d = new NetworkChangeNotifierAutoDetect(new qxx(this), a, flag1);
                qya qya = d.a.a();
                b(NetworkChangeNotifierAutoDetect.a(qya));
                a(d.b(qya));
            }
        } else
        if (d != null)
        {
            NetworkChangeNotifierAutoDetect networkchangenotifierautodetect = d;
            if (networkchangenotifierautodetect.b)
            {
                ApplicationStatus.b(networkchangenotifierautodetect);
            }
            networkchangenotifierautodetect.j();
            d = null;
            return;
        }
    }

    private void b(int i)
    {
        e = i;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); nativeNotifyConnectionTypeChanged(((Long)iterator.next()).longValue(), i)) { }
        for (Iterator iterator1 = c.iterator(); iterator1.hasNext(); iterator1.next()) { }
    }

    public static void forceConnectivityState(boolean flag)
    {
        int i = 0;
        g.a(false, false);
        NetworkChangeNotifier networkchangenotifier = g;
        boolean flag1;
        if (networkchangenotifier.e != 6)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 != flag)
        {
            double d1;
            if (!flag)
            {
                i = 6;
            }
            networkchangenotifier.b(i);
            if (flag)
            {
                d1 = (1.0D / 0.0D);
            } else
            {
                d1 = 0.0D;
            }
            networkchangenotifier.a(d1);
        }
    }

    public static NetworkChangeNotifier init(Context context)
    {
        if (g == null)
        {
            g = new NetworkChangeNotifier(context);
        }
        return g;
    }

    private static native double nativeGetMaxBandwidthForConnectionSubtype(int i);

    private native void nativeNotifyConnectionTypeChanged(long l, int i);

    private native void nativeNotifyMaxBandwidthChanged(long l, double d1);

    public void addNativeObserver(long l)
    {
        b.add(Long.valueOf(l));
    }

    public int getCurrentConnectionType()
    {
        return e;
    }

    public double getCurrentMaxBandwidthInMbps()
    {
        return f;
    }

    public void removeNativeObserver(long l)
    {
        b.remove(Long.valueOf(l));
    }
}
