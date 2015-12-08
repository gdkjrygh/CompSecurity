// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import ds;
import org.chromium.base.ApplicationStatus;
import qxy;
import qxz;
import qya;
import qyb;

// Referenced classes of package org.chromium.net:
//            NetworkChangeNotifier

public class NetworkChangeNotifierAutoDetect extends BroadcastReceiver
    implements ds
{

    qxy a;
    final boolean b;
    private final qxz c;
    private final Observer d;
    private final Context e;
    private qyb f;
    private boolean g;
    private int h;
    private String i;
    private double j;

    public NetworkChangeNotifierAutoDetect(Observer observer, Context context, boolean flag)
    {
        int l;
        d = observer;
        e = context.getApplicationContext();
        a = new qxy(context);
        f = new qyb(context);
        observer = a.a();
        h = a(observer);
        i = c(observer);
        j = b(observer);
        c = new qxz(f.c);
        if (flag)
        {
            k();
            b = false;
            return;
        }
        ApplicationStatus.a(this);
        l = ApplicationStatus.c();
        observer = a.a();
        if (l != 1) goto _L2; else goto _L1
_L1:
        d(observer);
        e(observer);
        k();
_L4:
        b = true;
        return;
_L2:
        if (l == 2)
        {
            j();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static int a(qya qya1)
    {
        byte byte1 = 5;
        if (qya1.a) goto _L2; else goto _L1
_L1:
        byte byte0 = 6;
_L4:
        return byte0;
_L2:
        byte0 = byte1;
        switch (qya1.b)
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
        switch (qya1.c)
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

    private String c(qya qya1)
    {
        if (a(qya1) == 2) goto _L2; else goto _L1
_L1:
        qya1 = "";
_L4:
        return qya1;
_L2:
        String s;
        qya1 = f.a.registerReceiver(null, new IntentFilter("android.net.wifi.STATE_CHANGE"));
        if (qya1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        qya1 = (WifiInfo)qya1.getParcelableExtra("wifiInfo");
        if (qya1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        s = qya1.getSSID();
        qya1 = s;
        if (s != null) goto _L4; else goto _L3
_L3:
        return "";
    }

    private void d(qya qya1)
    {
        int l = a(qya1);
        qya1 = c(qya1);
        if (l == h && qya1.equals(i))
        {
            return;
        } else
        {
            h = l;
            i = qya1;
            (new StringBuilder("Network connectivity changed, type is: ")).append(h);
            d.a(l);
            return;
        }
    }

    private void e(qya qya1)
    {
        double d1 = b(qya1);
        if (d1 == j)
        {
            return;
        } else
        {
            j = d1;
            d.a(d1);
            return;
        }
    }

    private void k()
    {
        if (!g)
        {
            g = true;
            e.registerReceiver(this, c);
        }
    }

    public final double b(qya qya1)
    {
        byte byte1;
        byte1 = 30;
        if (a(qya1) == 2)
        {
            Object obj = f;
            int l;
            if (!((qyb) (obj)).c || ((qyb) (obj)).b == null)
            {
                l = -1;
            } else
            {
                obj = ((qyb) (obj)).b.getConnectionInfo();
                if (obj == null)
                {
                    l = -1;
                } else
                {
                    l = ((WifiInfo) (obj)).getLinkSpeed();
                }
            }
            if (l != -1)
            {
                return (double)l;
            }
        }
        if (qya1.a) goto _L2; else goto _L1
_L1:
        byte byte0 = 31;
_L4:
        return NetworkChangeNotifier.a(byte0);
_L2:
        byte0 = byte1;
        switch (qya1.b)
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
            switch (qya1.c)
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

    void j()
    {
        if (g)
        {
            g = false;
            e.unregisterReceiver(this);
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

    private class Observer
    {

        public abstract void a(double d1);

        public abstract void a(int l);
    }

}
