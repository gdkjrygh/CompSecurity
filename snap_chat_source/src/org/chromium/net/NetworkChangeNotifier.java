// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import akV;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package org.chromium.net:
//            RegistrationPolicyAlwaysRegister, NetworkChangeNotifierAutoDetect, RegistrationPolicyApplicationStatus

public class NetworkChangeNotifier
{
    public static interface ConnectionTypeObserver
    {
    }


    private static NetworkChangeNotifier g;
    private static boolean h;
    private final Context a;
    private final ArrayList b = new ArrayList();
    private final akV c = new akV();
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
        b().a(true, ((NetworkChangeNotifierAutoDetect.RegistrationPolicy) (new RegistrationPolicyAlwaysRegister())));
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

    static void a(NetworkChangeNotifier networkchangenotifier, double d1)
    {
        networkchangenotifier.a(d1);
    }

    static void a(NetworkChangeNotifier networkchangenotifier, int i)
    {
        networkchangenotifier.d(i);
    }

    private void a(boolean flag, NetworkChangeNotifierAutoDetect.RegistrationPolicy registrationpolicy)
    {
        if (flag)
        {
            if (d == null)
            {
                d = new NetworkChangeNotifierAutoDetect(new NetworkChangeNotifierAutoDetect.Observer() {

                    private NetworkChangeNotifier a;

                    public final void a(double d1)
                    {
                        NetworkChangeNotifier.a(a, d1);
                    }

                    public final void a(int i)
                    {
                        NetworkChangeNotifier.a(a, i);
                    }

                    public final void a(int i, int j)
                    {
                        a.a(i, j);
                    }

                    public final void a(int ai[])
                    {
                        a.a(ai);
                    }

                    public final void b(int i)
                    {
                        a.b(i);
                    }

                    public final void c(int i)
                    {
                        a.c(i);
                    }

            
            {
                a = NetworkChangeNotifier.this;
                super();
            }
                }, a, registrationpolicy);
                registrationpolicy = d.a.a();
                d(NetworkChangeNotifierAutoDetect.a(registrationpolicy));
                a(d.b(registrationpolicy));
            }
        } else
        if (d != null)
        {
            d.a();
            d = null;
            return;
        }
    }

    private static NetworkChangeNotifier b()
    {
        if (!h && g == null)
        {
            throw new AssertionError();
        } else
        {
            return g;
        }
    }

    private void b(int i, int j)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); nativeNotifyConnectionTypeChanged(((Long)iterator.next()).longValue(), i, j)) { }
        for (Iterator iterator1 = c.iterator(); iterator1.hasNext(); iterator1.next()) { }
    }

    private static void c()
    {
        b().a(false, new RegistrationPolicyApplicationStatus());
    }

    private void d(int i)
    {
        e = i;
        b(i, getCurrentDefaultNetId());
    }

    public static void fakeDefaultNetwork(int i, int j)
    {
        c();
        b().b(j, i);
    }

    public static void fakeNetworkConnected(int i, int j)
    {
        c();
        b().a(i, j);
    }

    public static void fakeNetworkDisconnected(int i)
    {
        c();
        b().c(i);
    }

    public static void fakeNetworkSoonToBeDisconnected(int i)
    {
        c();
        b().b(i);
    }

    public static void fakeUpdateActiveNetworkList(int ai[])
    {
        c();
        b().a(ai);
    }

    public static void forceConnectivityState(boolean flag)
    {
        int i = 0;
        c();
        NetworkChangeNotifier networkchangenotifier = b();
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
            networkchangenotifier.d(i);
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

    private native void nativeNotifyConnectionTypeChanged(long l, int i, int j);

    private native void nativeNotifyMaxBandwidthChanged(long l, double d1);

    private native void nativeNotifyOfNetworkConnect(long l, int i, int j);

    private native void nativeNotifyOfNetworkDisconnect(long l, int i);

    private native void nativeNotifyOfNetworkSoonToDisconnect(long l, int i);

    private native void nativeNotifyUpdateActiveNetworkList(long l, int ai[]);

    final void a(int i, int j)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); nativeNotifyOfNetworkConnect(((Long)iterator.next()).longValue(), i, j)) { }
    }

    final void a(int ai[])
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); nativeNotifyUpdateActiveNetworkList(((Long)iterator.next()).longValue(), ai)) { }
    }

    public void addNativeObserver(long l)
    {
        b.add(Long.valueOf(l));
    }

    final void b(int i)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); nativeNotifyOfNetworkSoonToDisconnect(((Long)iterator.next()).longValue(), i)) { }
    }

    final void c(int i)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); nativeNotifyOfNetworkDisconnect(((Long)iterator.next()).longValue(), i)) { }
    }

    public int getCurrentConnectionType()
    {
        return e;
    }

    public int getCurrentDefaultNetId()
    {
        if (d != null) goto _L2; else goto _L1
_L1:
        int k = -1;
_L4:
        return k;
_L2:
        Object obj = d;
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            return -1;
        }
        obj = ((NetworkChangeNotifierAutoDetect) (obj)).a;
        NetworkInfo networkinfo = ((NetworkChangeNotifierAutoDetect.a) (obj)).a.getActiveNetworkInfo();
        if (networkinfo == null)
        {
            return -1;
        }
        android.net.Network anetwork[] = ((NetworkChangeNotifierAutoDetect.a) (obj)).a.getAllNetworks();
        int l = anetwork.length;
        int j = 0;
        int i = -1;
        do
        {
            k = i;
            if (j >= l)
            {
                continue;
            }
            android.net.Network network = anetwork[j];
            k = i;
            if (((NetworkChangeNotifierAutoDetect.a) (obj)).b(network))
            {
                NetworkInfo networkinfo1 = ((NetworkChangeNotifierAutoDetect.a) (obj)).a.getNetworkInfo(network);
                k = i;
                if (networkinfo1 != null)
                {
                    k = i;
                    if (networkinfo1.getType() == networkinfo.getType())
                    {
                        if (!NetworkChangeNotifierAutoDetect.a.b && i != -1)
                        {
                            throw new AssertionError();
                        }
                        k = NetworkChangeNotifierAutoDetect.b(network);
                    }
                }
            }
            j++;
            i = k;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public double getCurrentMaxBandwidthInMbps()
    {
        return f;
    }

    public int[] getCurrentNetworksAndTypes()
    {
        if (d == null)
        {
            return new int[0];
        }
        NetworkChangeNotifierAutoDetect networkchangenotifierautodetect = d;
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            return new int[0];
        }
        android.net.Network anetwork[] = networkchangenotifierautodetect.a.a.getAllNetworks();
        int ai[] = new int[anetwork.length << 1];
        int l = anetwork.length;
        int i = 0;
        int j;
        int k;
        for (j = 0; i < l; j = k)
        {
            android.net.Network network = anetwork[i];
            k = j;
            if (networkchangenotifierautodetect.a.b(network))
            {
                int i1 = j + 1;
                ai[j] = NetworkChangeNotifierAutoDetect.a(network);
                k = i1 + 1;
                ai[i1] = NetworkChangeNotifierAutoDetect.a(networkchangenotifierautodetect.a.a(network));
            }
            i++;
        }

        int ai1[] = new int[j];
        System.arraycopy(ai, 0, ai1, 0, j);
        return ai1;
    }

    public void removeNativeObserver(long l)
    {
        b.remove(Long.valueOf(l));
    }

    static 
    {
        boolean flag;
        if (!org/chromium/net/NetworkChangeNotifier.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
    }
}
