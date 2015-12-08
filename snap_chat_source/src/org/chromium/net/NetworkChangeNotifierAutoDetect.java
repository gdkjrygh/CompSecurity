// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import org.chromium.base.ThreadUtils;

// Referenced classes of package org.chromium.net:
//            NetworkChangeNotifier

public class NetworkChangeNotifierAutoDetect extends BroadcastReceiver
{
    static class NetworkConnectivityIntentFilter extends IntentFilter
    {

        NetworkConnectivityIntentFilter(boolean flag)
        {
            addAction("android.net.conn.CONNECTIVITY_CHANGE");
            if (flag)
            {
                addAction("android.net.wifi.RSSI_CHANGED");
            }
        }
    }

    public static interface Observer
    {

        public abstract void a(double d1);

        public abstract void a(int i1);

        public abstract void a(int i1, int j1);

        public abstract void a(int ai[]);

        public abstract void b(int i1);

        public abstract void c(int i1);
    }

    public static abstract class RegistrationPolicy
    {

        static final boolean b;
        NetworkChangeNotifierAutoDetect a;

        protected final void a()
        {
            if (!b && a == null)
            {
                throw new AssertionError();
            } else
            {
                a.b();
                return;
            }
        }

        protected void a(NetworkChangeNotifierAutoDetect networkchangenotifierautodetect)
        {
            a = networkchangenotifierautodetect;
        }

        protected abstract void b();

        static 
        {
            boolean flag;
            if (!org/chromium/net/NetworkChangeNotifierAutoDetect.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b = flag;
        }

        public RegistrationPolicy()
        {
        }
    }

    static final class a
    {

        static final boolean b;
        final ConnectivityManager a;

        private static c a(NetworkInfo networkinfo)
        {
            if (networkinfo == null || !networkinfo.isConnected())
            {
                return new c(false, -1, -1);
            } else
            {
                return new c(true, networkinfo.getType(), networkinfo.getSubtype());
            }
        }

        final c a()
        {
            return a(a.getActiveNetworkInfo());
        }

        final c a(Network network)
        {
            return a(a.getNetworkInfo(network));
        }

        final boolean b(Network network)
        {
            network = a.getNetworkCapabilities(network);
            return network != null && network.hasCapability(12);
        }

        static 
        {
            boolean flag;
            if (!org/chromium/net/NetworkChangeNotifierAutoDetect.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b = flag;
        }

        a()
        {
            a = null;
        }

        a(Context context)
        {
            a = (ConnectivityManager)context.getSystemService("connectivity");
        }
    }

    final class b extends android.net.ConnectivityManager.NetworkCallback
    {

        final NetworkChangeNotifierAutoDetect a;

        public final void onAvailable(Network network)
        {
            ThreadUtils.b(new Runnable(this, NetworkChangeNotifierAutoDetect.b(network), NetworkChangeNotifierAutoDetect.a(NetworkChangeNotifierAutoDetect.a(a).a(network))) {

                private int a;
                private int b;
                private b c;

                public final void run()
                {
                    NetworkChangeNotifierAutoDetect.b(c.a).a(a, b);
                }

            
            {
                c = b1;
                a = i1;
                b = j1;
                super();
            }
            });
        }

        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkcapabilities)
        {
            ThreadUtils.b(new Runnable(this, NetworkChangeNotifierAutoDetect.b(network), NetworkChangeNotifierAutoDetect.a(NetworkChangeNotifierAutoDetect.a(a).a(network))) {

                private int a;
                private int b;
                private b c;

                public final void run()
                {
                    NetworkChangeNotifierAutoDetect.b(c.a).a(a, b);
                }

            
            {
                c = b1;
                a = i1;
                b = j1;
                super();
            }
            });
        }

        public final void onLosing(Network network, int i1)
        {
            ThreadUtils.b(new Runnable(this, NetworkChangeNotifierAutoDetect.b(network)) {

                private int a;
                private b b;

                public final void run()
                {
                    NetworkChangeNotifierAutoDetect.b(b.a).b(a);
                }

            
            {
                b = b1;
                a = i1;
                super();
            }
            });
        }

        public final void onLost(Network network)
        {
            ThreadUtils.b(new Runnable(this, NetworkChangeNotifierAutoDetect.b(network)) {

                private int a;
                private b b;

                public final void run()
                {
                    NetworkChangeNotifierAutoDetect.b(b.a).c(a);
                }

            
            {
                b = b1;
                a = i1;
                super();
            }
            });
        }

        private b()
        {
            a = NetworkChangeNotifierAutoDetect.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }

    static final class c
    {

        final boolean a;
        final int b;
        final int c;

        public c(boolean flag, int i1, int j1)
        {
            a = flag;
            b = i1;
            c = j1;
        }
    }

    static final class d
    {

        final Context a;
        final WifiManager b;
        final boolean c;

        d()
        {
            a = null;
            b = null;
            c = false;
        }

        d(Context context)
        {
            a = context;
            boolean flag;
            if (a.getPackageManager().checkPermission("android.permission.ACCESS_WIFI_STATE", a.getPackageName()) == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            c = flag;
            if (c)
            {
                context = (WifiManager)a.getSystemService("wifi");
            } else
            {
                context = null;
            }
            b = context;
        }
    }


    a a;
    private final NetworkConnectivityIntentFilter b;
    private final Observer c;
    private final Context d;
    private final RegistrationPolicy e;
    private d f;
    private final android.net.ConnectivityManager.NetworkCallback g;
    private final NetworkRequest h;
    private boolean i;
    private int j;
    private String k;
    private double l;

    public NetworkChangeNotifierAutoDetect(Observer observer, Context context, RegistrationPolicy registrationpolicy)
    {
        ThreadUtils.a();
        c = observer;
        d = context.getApplicationContext();
        a = new a(context);
        f = new d(context);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            g = new b((byte)0);
            h = (new android.net.NetworkRequest.Builder()).addCapability(12).build();
        } else
        {
            g = null;
            h = null;
        }
        observer = a.a();
        j = a(observer);
        k = c(observer);
        l = b(observer);
        b = new NetworkConnectivityIntentFilter(f.c);
        e = registrationpolicy;
        e.a(this);
    }

    static int a(Network network)
    {
        return Integer.parseInt(network.toString());
    }

    public static int a(c c1)
    {
        byte byte1 = 5;
        if (c1.a) goto _L2; else goto _L1
_L1:
        byte byte0 = 6;
_L4:
        return byte0;
_L2:
        byte0 = byte1;
        switch (c1.b)
        {
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 8: // '\b'
        default:
            return 0;

        case 6: // '\006'
            continue; /* Loop/switch isn't completed */

        case 9: // '\t'
            return 1;

        case 1: // '\001'
            return 2;

        case 7: // '\007'
            return 7;

        case 0: // '\0'
            byte0 = byte1;
            break;
        }
        switch (c1.c)
        {
        default:
            return 0;

        case 1: // '\001'
        case 2: // '\002'
        case 4: // '\004'
        case 7: // '\007'
        case 11: // '\013'
            return 3;

        case 3: // '\003'
        case 5: // '\005'
        case 6: // '\006'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 12: // '\f'
        case 14: // '\016'
        case 15: // '\017'
            return 4;

        case 13: // '\r'
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static a a(NetworkChangeNotifierAutoDetect networkchangenotifierautodetect)
    {
        return networkchangenotifierautodetect.a;
    }

    static int b(Network network)
    {
        return Integer.parseInt(network.toString());
    }

    static Observer b(NetworkChangeNotifierAutoDetect networkchangenotifierautodetect)
    {
        return networkchangenotifierautodetect.c;
    }

    private String c(c c1)
    {
        if (a(c1) == 2) goto _L2; else goto _L1
_L1:
        c1 = "";
_L4:
        return c1;
_L2:
        String s;
        c1 = f.a.registerReceiver(null, new IntentFilter("android.net.wifi.STATE_CHANGE"));
        if (c1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        c1 = (WifiInfo)c1.getParcelableExtra("wifiInfo");
        if (c1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        s = c1.getSSID();
        c1 = s;
        if (s != null) goto _L4; else goto _L3
_L3:
        return "";
    }

    private void d(c c1)
    {
        int i1 = a(c1);
        c1 = c(c1);
        if (i1 == j && c1.equals(k))
        {
            return;
        } else
        {
            j = i1;
            k = c1;
            (new StringBuilder("Network connectivity changed, type is: ")).append(j);
            c.a(i1);
            return;
        }
    }

    private void e(c c1)
    {
        double d1 = b(c1);
        if (d1 == l)
        {
            return;
        } else
        {
            l = d1;
            c.a(d1);
            return;
        }
    }

    public final void a()
    {
        e.b();
        c();
    }

    public final double b(c c1)
    {
        byte byte1;
        byte1 = 30;
        if (a(c1) == 2)
        {
            Object obj = f;
            int i1;
            if (!((d) (obj)).c || ((d) (obj)).b == null)
            {
                i1 = -1;
            } else
            {
                obj = ((d) (obj)).b.getConnectionInfo();
                if (obj == null)
                {
                    i1 = -1;
                } else
                {
                    i1 = ((WifiInfo) (obj)).getLinkSpeed();
                }
            }
            if (i1 != -1)
            {
                return (double)i1;
            }
        }
        if (c1.a) goto _L2; else goto _L1
_L1:
        byte byte0 = 31;
_L4:
        return NetworkChangeNotifier.a(byte0);
_L2:
        byte0 = byte1;
        switch (c1.b)
        {
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 8: // '\b'
        default:
            byte0 = byte1;
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
        case 6: // '\006'
        case 7: // '\007'
        case 9: // '\t'
            break;

        case 0: // '\0'
            switch (c1.c)
            {
            default:
                byte0 = byte1;
                break;

            case 1: // '\001'
                byte0 = 4;
                break;

            case 2: // '\002'
                byte0 = 5;
                break;

            case 4: // '\004'
                byte0 = 2;
                break;

            case 7: // '\007'
                byte0 = 3;
                break;

            case 11: // '\013'
                byte0 = 1;
                break;

            case 3: // '\003'
                byte0 = 6;
                break;

            case 5: // '\005'
                byte0 = 7;
                break;

            case 6: // '\006'
                byte0 = 8;
                break;

            case 8: // '\b'
                byte0 = 11;
                break;

            case 9: // '\t'
                byte0 = 12;
                break;

            case 10: // '\n'
                byte0 = 9;
                break;

            case 12: // '\f'
                byte0 = 10;
                break;

            case 14: // '\016'
                byte0 = 13;
                break;

            case 15: // '\017'
                byte0 = 14;
                break;

            case 13: // '\r'
                byte0 = 15;
                break;
            }
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void b()
    {
        if (!i)
        {
            c c1 = a.a();
            d(c1);
            e(c1);
            d.registerReceiver(this, b);
            i = true;
            if (g != null)
            {
                a a1 = a;
                NetworkRequest networkrequest = h;
                android.net.ConnectivityManager.NetworkCallback networkcallback = g;
                a1.a.registerNetworkCallback(networkrequest, networkcallback);
                Network anetwork[] = a.a.getAllNetworks();
                int ai[] = new int[anetwork.length];
                for (int i1 = 0; i1 < anetwork.length; i1++)
                {
                    ai[i1] = Integer.parseInt(anetwork[i1].toString());
                }

                c.a(ai);
                return;
            }
        }
    }

    public final void c()
    {
        if (i)
        {
            d.unregisterReceiver(this);
            i = false;
            if (g != null)
            {
                a a1 = a;
                android.net.ConnectivityManager.NetworkCallback networkcallback = g;
                a1.a.unregisterNetworkCallback(networkcallback);
                return;
            }
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        context = a.a();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()))
        {
            d(context);
            e(context);
        } else
        if ("android.net.wifi.RSSI_CHANGED".equals(intent.getAction()))
        {
            e(context);
            return;
        }
    }
}
