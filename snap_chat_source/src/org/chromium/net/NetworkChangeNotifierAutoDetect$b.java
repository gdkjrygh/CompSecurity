// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.net.Network;
import android.net.NetworkCapabilities;
import org.chromium.base.ThreadUtils;

// Referenced classes of package org.chromium.net:
//            NetworkChangeNotifierAutoDetect

final class <init> extends android.net.k
{

    final NetworkChangeNotifierAutoDetect a;

    public final void onAvailable(Network network)
    {
        ThreadUtils.b(new Runnable(NetworkChangeNotifierAutoDetect.b(network), NetworkChangeNotifierAutoDetect.a(NetworkChangeNotifierAutoDetect.a(a).a(network))) {

            private int a;
            private int b;
            private NetworkChangeNotifierAutoDetect.b c;

            public final void run()
            {
                NetworkChangeNotifierAutoDetect.b(c.a).a(a, b);
            }

            
            {
                c = NetworkChangeNotifierAutoDetect.b.this;
                a = i;
                b = j;
                super();
            }
        });
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkcapabilities)
    {
        ThreadUtils.b(new Runnable(NetworkChangeNotifierAutoDetect.b(network), NetworkChangeNotifierAutoDetect.a(NetworkChangeNotifierAutoDetect.a(a).a(network))) {

            private int a;
            private int b;
            private NetworkChangeNotifierAutoDetect.b c;

            public final void run()
            {
                NetworkChangeNotifierAutoDetect.b(c.a).a(a, b);
            }

            
            {
                c = NetworkChangeNotifierAutoDetect.b.this;
                a = i;
                b = j;
                super();
            }
        });
    }

    public final void onLosing(Network network, int i)
    {
        ThreadUtils.b(new Runnable(NetworkChangeNotifierAutoDetect.b(network)) {

            private int a;
            private NetworkChangeNotifierAutoDetect.b b;

            public final void run()
            {
                NetworkChangeNotifierAutoDetect.b(b.a).b(a);
            }

            
            {
                b = NetworkChangeNotifierAutoDetect.b.this;
                a = i;
                super();
            }
        });
    }

    public final void onLost(Network network)
    {
        ThreadUtils.b(new Runnable(NetworkChangeNotifierAutoDetect.b(network)) {

            private int a;
            private NetworkChangeNotifierAutoDetect.b b;

            public final void run()
            {
                NetworkChangeNotifierAutoDetect.b(b.a).c(a);
            }

            
            {
                b = NetworkChangeNotifierAutoDetect.b.this;
                a = i;
                super();
            }
        });
    }

    private _cls4.a(NetworkChangeNotifierAutoDetect networkchangenotifierautodetect)
    {
        a = networkchangenotifierautodetect;
        super();
    }

    it>(NetworkChangeNotifierAutoDetect networkchangenotifierautodetect, byte byte0)
    {
        this(networkchangenotifierautodetect);
    }
}
