// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.wifi.WifiManager;

// Referenced classes of package org.chromium.net:
//            NetworkChangeNotifierAutoDetect

static final class b
{

    final Context a;
    final WifiManager b;
    final boolean c;

    ()
    {
        a = null;
        b = null;
        c = false;
    }

    c(Context context)
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
