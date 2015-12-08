// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class bk
{

    private final Context a;
    private final Boolean b;
    private final Boolean c;
    private final DisplayMetrics d;
    private final String e;
    private final Integer f;

    public bk(Context context)
    {
        Object obj1;
        PackageManager packagemanager;
        obj1 = null;
        super();
        a = context;
        packagemanager = a.getPackageManager();
        Object obj;
        obj = packagemanager.getPackageInfo(a.getPackageName(), 0);
        context = ((PackageInfo) (obj)).versionName;
        int i = ((PackageInfo) (obj)).versionCode;
        Integer integer = Integer.valueOf(i);
        obj = context;
        context = integer;
_L1:
        e = ((String) (obj));
        f = context;
        context = packagemanager.getClass();
        try
        {
            obj = context.getMethod("hasSystemFeature", new Class[] {
                java/lang/String
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            obj = null;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_245;
        }
        context = (Boolean)((Method) (obj)).invoke(packagemanager, new Object[] {
            "android.hardware.nfc"
        });
        obj = (Boolean)((Method) (obj)).invoke(packagemanager, new Object[] {
            "android.hardware.telephony"
        });
_L2:
        b = context;
        c = ((Boolean) (obj));
        d = new DisplayMetrics();
        ((WindowManager)a.getSystemService("window")).getDefaultDisplay().getMetrics(d);
        return;
        context;
        context = null;
_L5:
        Log.w("MixpanelAPI.SystemInformation", "System information constructed with a context that apparently doesn't exist.");
        obj = context;
        context = null;
          goto _L1
        context;
        context = null;
_L4:
        Log.w("MixpanelAPI.SystemInformation", "System version appeared to support PackageManager.hasSystemFeature, but we were unable to call it.");
        obj = obj1;
          goto _L2
        context;
        context = null;
_L3:
        Log.w("MixpanelAPI.SystemInformation", "System version appeared to support PackageManager.hasSystemFeature, but we were unable to call it.");
        obj = obj1;
          goto _L2
        obj;
          goto _L3
        obj;
          goto _L4
        obj;
          goto _L5
        context = null;
        obj = obj1;
          goto _L2
    }

    public String a()
    {
        return e;
    }

    public boolean b()
    {
        return b.booleanValue();
    }

    public boolean c()
    {
        return c.booleanValue();
    }

    public DisplayMetrics d()
    {
        return d;
    }

    public String e()
    {
        TelephonyManager telephonymanager = (TelephonyManager)a.getSystemService("phone");
        if (telephonymanager != null)
        {
            return telephonymanager.getNetworkOperatorName();
        } else
        {
            return null;
        }
    }

    public Boolean f()
    {
        Boolean boolean1 = null;
        if (a.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0)
        {
            boolean1 = Boolean.valueOf(((ConnectivityManager)a.getSystemService("connectivity")).getNetworkInfo(1).isConnected());
        }
        return boolean1;
    }

    public Boolean g()
    {
        Boolean boolean1 = null;
        BluetoothAdapter bluetoothadapter;
        boolean flag;
        try
        {
            bluetoothadapter = BluetoothAdapter.getDefaultAdapter();
        }
        catch (SecurityException securityexception)
        {
            return null;
        }
        if (bluetoothadapter == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        flag = bluetoothadapter.isEnabled();
        boolean1 = Boolean.valueOf(flag);
        return boolean1;
    }

    public String h()
    {
        String s = null;
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            s = "none";
            if (android.os.Build.VERSION.SDK_INT >= 18 && a.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le"))
            {
                s = "ble";
            } else
            if (a.getPackageManager().hasSystemFeature("android.hardware.bluetooth"))
            {
                return "classic";
            }
        }
        return s;
    }
}
