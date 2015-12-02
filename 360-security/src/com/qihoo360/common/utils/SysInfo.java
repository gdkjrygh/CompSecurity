// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// Referenced classes of package com.qihoo360.common.utils:
//            ContextHelper

public class SysInfo
{

    public static final String LIBART_SO = "libart.so";
    public static final String LIBDVM_SO = "libdvm.so";

    public SysInfo()
    {
    }

    public static String getAndroidId(Context context)
    {
        Object obj;
        Context context1;
        Object obj1;
        obj1 = null;
        obj = null;
        context1 = obj1;
        if (android.os.Build.VERSION.SDK_INT < 8)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        context1 = obj1;
        try
        {
            context = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return context1;
        }
        obj = context;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        context1 = context;
        obj = context.toLowerCase();
        return ((String) (obj));
    }

    public static String getCPUSerial()
    {
        int i;
        String s1 = null;
        String s = s1;
        LineNumberReader linenumberreader;
        String s2;
        int j;
        int k;
        try
        {
            linenumberreader = new LineNumberReader(new InputStreamReader(Runtime.getRuntime().exec("cat /proc/cpuinfo").getInputStream()));
        }
        catch (IOException ioexception)
        {
            return s;
        }
        i = 1;
          goto _L1
_L3:
        s = s1;
        s2 = linenumberreader.readLine();
        if (s2 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        s = s1;
        s2 = s2.toLowerCase();
        s = s1;
        j = s2.indexOf("serial");
        s = s1;
        k = s2.indexOf(":");
        if (j <= -1 || k <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        s = s1;
        s1 = s2.substring(k + 1);
        s = s1;
        s1 = s1.trim();
        return s1;
        i++;
_L1:
        if (i < 100) goto _L3; else goto _L2
_L2:
        return null;
    }

    public static String getIMEI(Context context)
    {
        try
        {
            context = ((TelephonyManager)ContextHelper.getSystemService(context, "phone")).getDeviceId();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static String getMacAddress(Context context)
    {
        try
        {
            context = ((WifiManager)ContextHelper.getSystemService(context, "wifi")).getConnectionInfo();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        context = context.getMacAddress();
        return context;
        return null;
    }

    public static String getSerial()
    {
        String s;
        if (android.os.Build.VERSION.SDK_INT < 9)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        s = (String)android/os/Build.getField("SERIAL").get(null);
        String s1;
        s1 = s;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        s1 = s.toLowerCase();
        return s1;
        Exception exception;
        exception;
        s = null;
_L2:
        exception.printStackTrace();
        return s;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
        return null;
    }

    public static String getVMLib()
    {
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        Object obj;
        try
        {
            obj = Class.forName("android.os.SystemProperties");
        }
        catch (Exception exception)
        {
            return null;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        obj = ((Class) (obj)).getDeclaredMethod("get", new Class[] {
            java/lang/String
        });
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        ((Method) (obj)).setAccessible(true);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            return (String)((Method) (obj)).invoke(null, new Object[] {
                "persist.sys.dalvik.vm.lib.2"
            });
        }
        obj = (String)((Method) (obj)).invoke(null, new Object[] {
            "persist.sys.dalvik.vm.lib"
        });
        return ((String) (obj));
        return null;
    }

    public static boolean isRunningART()
    {
        return android.os.Build.VERSION.SDK_INT >= 19 && "libart.so".equals(getVMLib());
    }
}
