// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

// Referenced classes of package org.chromium.net:
//            NetworkChangeNotifierAutoDetect

static class mConnectivityManager
{

    private final ConnectivityManager mConnectivityManager;

    boolean activeNetworkExists()
    {
        return mConnectivityManager.getActiveNetworkInfo() != null;
    }

    int getNetworkSubtype()
    {
        return mConnectivityManager.getActiveNetworkInfo().getSubtype();
    }

    int getNetworkType()
    {
        return mConnectivityManager.getActiveNetworkInfo().getType();
    }

    boolean isConnected()
    {
        return mConnectivityManager.getActiveNetworkInfo().isConnected();
    }

    ()
    {
        mConnectivityManager = null;
    }

    mConnectivityManager(Context context)
    {
        mConnectivityManager = (ConnectivityManager)context.getSystemService("connectivity");
    }
}
