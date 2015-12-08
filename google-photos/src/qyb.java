// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.wifi.WifiManager;

public final class qyb
{

    public final Context a;
    public final WifiManager b;
    public final boolean c;

    qyb()
    {
        a = null;
        b = null;
        c = false;
    }

    public qyb(Context context)
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
