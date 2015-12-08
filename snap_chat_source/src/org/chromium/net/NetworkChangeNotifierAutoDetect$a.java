// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

// Referenced classes of package org.chromium.net:
//            NetworkChangeNotifierAutoDetect

static final class a
{

    static final boolean b;
    final ConnectivityManager a;

    private static a a(NetworkInfo networkinfo)
    {
        if (networkinfo == null || !networkinfo.isConnected())
        {
            return new <init>(false, -1, -1);
        } else
        {
            return new <init>(true, networkinfo.getType(), networkinfo.getSubtype());
        }
    }

    final <init> a()
    {
        return a(a.getActiveNetworkInfo());
    }

    final o a(Network network)
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

    ()
    {
        a = null;
    }

    a(Context context)
    {
        a = (ConnectivityManager)context.getSystemService("connectivity");
    }
}
