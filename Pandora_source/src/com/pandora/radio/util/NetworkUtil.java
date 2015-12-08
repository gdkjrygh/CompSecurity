// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import p.cw.c;
import p.dd.y;
import p.df.a;

// Referenced classes of package com.pandora.radio.util:
//            l

public class NetworkUtil
{
    public class ConnectionChangeReceiver extends BroadcastReceiver
    {

        final NetworkUtil a;

        public void onReceive(Context context, Intent intent)
        {
            context = ((ConnectivityManager)com.pandora.radio.util.l.a(context, "connectivity")).getActiveNetworkInfo();
            if (context == null)
            {
                break MISSING_BLOCK_LABEL_65;
            }
            if (!context.isConnected())
            {
                break MISSING_BLOCK_LABEL_65;
            }
            boolean flag = true;
_L1:
            try
            {
                if (com.pandora.radio.util.NetworkUtil.a(a) != flag)
                {
                    com.pandora.radio.util.NetworkUtil.a(a, flag);
                    NetworkUtil.b(a).a(new y(flag));
                }
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                p.df.a.c("NetworkUtil", "ConnectionChangeReceiver", context);
            }
            break MISSING_BLOCK_LABEL_79;
            flag = false;
              goto _L1
        }

        public ConnectionChangeReceiver()
        {
            a = NetworkUtil.this;
            super();
        }
    }


    private final c a;
    private final ConnectivityManager b;
    private final ConnectionChangeReceiver c;
    private boolean d;

    public NetworkUtil(c c1)
    {
        d = false;
        a = c1;
        c1.b(this);
        c1 = c1.s();
        b = (ConnectivityManager)com.pandora.radio.util.l.a(c1, "connectivity");
        if (b == null)
        {
            throw new UnsupportedOperationException("NetworkUtil can't get ConnectivityManager");
        } else
        {
            d = b();
            c = new ConnectionChangeReceiver();
            c1.registerReceiver(c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
    }

    public static int a(Reader reader, Writer writer)
        throws IOException
    {
        long l1 = b(reader, writer);
        if (l1 > 0x7fffffffL)
        {
            return -1;
        } else
        {
            return (int)l1;
        }
    }

    public static String a(int i)
    {
        switch (i)
        {
        default:
            return Integer.toString(i);

        case 0: // '\0'
            return "MOBILE";

        case 1: // '\001'
            return "WIFI";

        case 2: // '\002'
            return "MOBILE_MMS";

        case 3: // '\003'
            return "MOBILE_SUPL";

        case 4: // '\004'
            return "MOBILE_DUN";

        case 5: // '\005'
            return "MOBILE_HIPRI";

        case 6: // '\006'
            return "WIMAX";

        case 7: // '\007'
            return "BLUETOOTH";

        case 8: // '\b'
            return "DUMMY";

        case 9: // '\t'
            return "ETHERNET";

        case 10: // '\n'
            return "MOBILE_FOTA";

        case 11: // '\013'
            return "MOBILE_IMS";

        case 12: // '\f'
            return "MOBILE_CBS";

        case 13: // '\r'
            return "WIFI_P2P";

        case 14: // '\016'
            return "TYPE_MOBILE_IA";
        }
    }

    public static void a(InputStream inputstream)
    {
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        inputstream.close();
        return;
        inputstream;
    }

    public static void a(InputStream inputstream, Writer writer)
        throws IOException
    {
        a(((Reader) (new InputStreamReader(inputstream))), writer);
    }

    public static void a(OutputStream outputstream)
    {
        if (outputstream == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        outputstream.close();
        return;
        outputstream;
    }

    public static void a(Writer writer)
    {
        if (writer == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        writer.close();
        return;
        writer;
    }

    static boolean a(NetworkUtil networkutil)
    {
        return networkutil.d;
    }

    static boolean a(NetworkUtil networkutil, boolean flag)
    {
        networkutil.d = flag;
        return flag;
    }

    public static long b(Reader reader, Writer writer)
        throws IOException
    {
        char ac[] = new char[4096];
        long l1 = 0L;
        do
        {
            int i = reader.read(ac);
            if (-1 != i)
            {
                writer.write(ac, 0, i);
                l1 += i;
            } else
            {
                return l1;
            }
        } while (true);
    }

    static c b(NetworkUtil networkutil)
    {
        return networkutil.a;
    }

    public static boolean b(int i)
    {
        switch (i)
        {
        case 1: // '\001'
        default:
            return false;

        case 0: // '\0'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            return true;
        }
    }

    public static String c(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
            return "GPRS";

        case 2: // '\002'
            return "EDGE";

        case 3: // '\003'
            return "UMTS";

        case 4: // '\004'
            return "CDMA";

        case 5: // '\005'
            return "EVDO_0";

        case 6: // '\006'
            return "EVDO_A";

        case 7: // '\007'
            return "1xRTT";

        case 8: // '\b'
            return "HSDPA";

        case 9: // '\t'
            return "HSUPA";

        case 10: // '\n'
            return "HSPA";

        case 11: // '\013'
            return "IDEN";

        case 12: // '\f'
            return "EVDO_B";

        case 13: // '\r'
            return "LTE";

        case 14: // '\016'
            return "EHRPD";

        case 15: // '\017'
            return "HSPAP";
        }
    }

    public void a()
    {
        a.s().unregisterReceiver(c);
        a.c(this);
    }

    public boolean b()
    {
        NetworkInfo networkinfo = b.getActiveNetworkInfo();
        if (networkinfo == null)
        {
            return false;
        } else
        {
            return networkinfo.isConnected();
        }
    }

    public boolean c()
    {
        boolean flag = true;
        NetworkInfo networkinfo = b.getActiveNetworkInfo();
        if (networkinfo == null)
        {
            return false;
        }
        if (networkinfo.getType() != 1)
        {
            flag = false;
        }
        return flag;
    }

    public String d()
    {
        NetworkInfo networkinfo = b.getActiveNetworkInfo();
        if (networkinfo == null)
        {
            return a(-1);
        } else
        {
            return a(networkinfo.getType());
        }
    }

    public y produceNetworkConnectedEvent()
    {
        return new y(d);
    }
}
