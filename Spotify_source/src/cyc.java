// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class cyc
{

    final Context a;
    final Boolean b;
    final Boolean c;
    final DisplayMetrics d;
    final String e;

    public cyc(Context context)
    {
        PackageManager packagemanager;
        a = context;
        packagemanager = a.getPackageManager();
        Object obj;
        obj = packagemanager.getPackageInfo(a.getPackageName(), 0);
        context = ((PackageInfo) (obj)).versionName;
        int i = ((PackageInfo) (obj)).versionCode;
_L1:
        e = context;
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
            break MISSING_BLOCK_LABEL_217;
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
        Log.w("MixpanelAPI.SysInfo", "System information constructed with a context that apparently doesn't exist.");
          goto _L1
        context;
        context = null;
_L4:
        Log.w("MixpanelAPI.SysInfo", "System version appeared to support PackageManager.hasSystemFeature, but we were unable to call it.");
        obj = null;
          goto _L2
        context;
        context = null;
_L3:
        Log.w("MixpanelAPI.SysInfo", "System version appeared to support PackageManager.hasSystemFeature, but we were unable to call it.");
        obj = null;
          goto _L2
        obj;
          goto _L3
        obj;
          goto _L4
        obj;
          goto _L5
        obj = null;
        context = null;
          goto _L2
    }

    public static Boolean a()
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
}
