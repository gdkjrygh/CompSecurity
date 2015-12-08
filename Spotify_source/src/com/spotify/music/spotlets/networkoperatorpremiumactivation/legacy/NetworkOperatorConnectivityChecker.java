// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.networkoperatorpremiumactivation.legacy;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import dmz;
import gcg;
import gnw;
import gof;
import gog;
import java.util.Arrays;
import java.util.List;

public final class NetworkOperatorConnectivityChecker
{

    private static final String b[] = {
        "51502"
    };
    gof a;
    private final Context c;
    private final ConnectivityManager d;
    private State e;
    private gog f;

    public NetworkOperatorConnectivityChecker(Context context)
    {
        e = State.a;
        c = context;
        d = (ConnectivityManager)context.getSystemService("connectivity");
    }

    public static void a(NetworkOperatorConnectivityChecker networkoperatorconnectivitychecker)
    {
        String s = ((gnw)dmz.a(gnw)).c.getSimOperator();
        if (!Arrays.asList(b).contains(s)) goto _L2; else goto _L1
_L1:
        NetworkInfo networkinfo = networkoperatorconnectivitychecker.d.getActiveNetworkInfo();
        if (networkinfo == null) goto _L4; else goto _L3
_L3:
        if (networkinfo.isConnected()) goto _L6; else goto _L5
_L5:
        networkinfo.getTypeName();
_L4:
        networkoperatorconnectivitychecker.a(State.c);
_L9:
        return;
_L6:
        boolean flag;
        if (!s.equals(((gnw)dmz.a(gnw)).c.getNetworkOperator()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        networkinfo.getType();
        JVM INSTR tableswitch 0 1: default 112
    //                   0 115
    //                   1 156;
           goto _L4 _L7 _L8
_L7:
        if (flag)
        {
            networkoperatorconnectivitychecker.a(State.c);
            return;
        }
        networkoperatorconnectivitychecker.a(State.d);
        if (networkoperatorconnectivitychecker.a != null)
        {
            networkoperatorconnectivitychecker.a.a();
            return;
        }
          goto _L9
_L8:
        if (!flag);
        networkoperatorconnectivitychecker.a(State.e);
        if (networkoperatorconnectivitychecker.a == null) goto _L9; else goto _L10
_L10:
        networkoperatorconnectivitychecker.a.c();
        return;
_L2:
        if (TextUtils.isEmpty(s))
        {
            if (gcg.a(networkoperatorconnectivitychecker.d).isEmpty())
            {
                networkoperatorconnectivitychecker.a(State.e);
                if (networkoperatorconnectivitychecker.a != null)
                {
                    networkoperatorconnectivitychecker.a.b();
                    return;
                }
            } else
            {
                networkoperatorconnectivitychecker.a(State.b);
                return;
            }
        } else
        {
            networkoperatorconnectivitychecker.a(State.f);
            if (networkoperatorconnectivitychecker.a != null)
            {
                networkoperatorconnectivitychecker.a.b();
                return;
            }
        }
          goto _L9
    }

    public static State b(NetworkOperatorConnectivityChecker networkoperatorconnectivitychecker)
    {
        return networkoperatorconnectivitychecker.e;
    }

    final void a(State state)
    {
        boolean flag1 = false;
        if (state != e) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag;
        State state1 = e;
        e = state;
        flag = flag1;
        public final class _cls2
        {

            public static final int a[];

            static 
            {
                a = new int[State.values().length];
                try
                {
                    a[State.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[State.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[State.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[State.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[State.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[State.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[State.g.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2.a[e.ordinal()])
        {
        default:
            flag = flag1;
            break;

        case 1: // '\001'
            break;

        case 2: // '\002'
            break; /* Loop/switch isn't completed */

        case 3: // '\003'
            break MISSING_BLOCK_LABEL_144;
        }
_L4:
        if (flag && f == null)
        {
            f = new gog(this);
            c.registerReceiver(f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        if (!flag && f != null)
        {
            c.unregisterReceiver(f);
            f = null;
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        flag = true;
          goto _L4
        flag = true;
          goto _L4
    }


    // Unreferenced inner class com/spotify/music/spotlets/networkoperatorpremiumactivation/legacy/NetworkOperatorConnectivityChecker$1

/* anonymous class */
    final class _cls1
        implements Runnable
    {

        private NetworkOperatorConnectivityChecker a;

        public final void run()
        {
            NetworkOperatorConnectivityChecker.a(a);
        }

            
            {
                a = NetworkOperatorConnectivityChecker.this;
                super();
            }
    }


    private class State extends Enum
    {

        public static final State a;
        public static final State b;
        public static final State c;
        public static final State d;
        public static final State e;
        public static final State f;
        public static final State g;
        private static final State h[];

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/spotify/music/spotlets/networkoperatorpremiumactivation/legacy/NetworkOperatorConnectivityChecker$State, s);
        }

        public static State[] values()
        {
            return (State[])h.clone();
        }

        static 
        {
            a = new State("INITIALIZED", 0);
            b = new State("WAITING_FOR_OPERATOR", 1);
            c = new State("WAITING_FOR_MOBILE_CONNECTION", 2);
            d = new State("RESULT_CONNECTED_TO_OPERATOR", 3);
            e = new State("RESULT_NO_MOBILE", 4);
            f = new State("RESULT_WRONG_OPERATOR", 5);
            g = new State("STOPPED", 6);
            h = (new State[] {
                a, b, c, d, e, f, g
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }

}
