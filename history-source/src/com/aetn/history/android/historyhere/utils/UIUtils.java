// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.http.util.ByteArrayBuffer;

public class UIUtils
{

    public UIUtils()
    {
    }

    public static byte[] convertStreamToByteArray(InputStream inputstream)
        throws Exception
    {
        ByteArrayBuffer bytearraybuffer = new ByteArrayBuffer(5000);
        inputstream = new BufferedInputStream(inputstream);
        do
        {
            int i = inputstream.read();
            if (i != -1)
            {
                bytearraybuffer.append((byte)i);
            } else
            {
                return bytearraybuffer.toByteArray();
            }
        } while (true);
    }

    public static String convertStreamToString(InputStream inputstream)
        throws Exception
    {
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(inputstream));
        StringBuilder stringbuilder = new StringBuilder();
        do
        {
            String s = bufferedreader.readLine();
            if (s != null)
            {
                stringbuilder.append(s);
            } else
            {
                inputstream.close();
                return stringbuilder.toString();
            }
        } while (true);
    }

    public static boolean getAndSetAppDidRunFlag(Context context)
    {
        boolean flag = false;
        com/aetn/history/android/historyhere/utils/UIUtils;
        JVM INSTR monitorenter ;
        String s;
        s = context.getPackageName();
        Log.i("UIUtils", (new StringBuilder()).append("Package name = [").append(s).append("]").toString());
        context = context.getSharedPreferences((new StringBuilder()).append(s).append("_APP_DID_RUN").toString(), 0);
        if (context.getBoolean((new StringBuilder()).append(s).append("_APP_DID_RUN").toString(), false)) goto _L2; else goto _L1
_L1:
        context = context.edit();
        context.putBoolean((new StringBuilder()).append(s).append("_APP_DID_RUN").toString(), true);
        context.commit();
_L4:
        com/aetn/history/android/historyhere/utils/UIUtils;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        context;
        throw context;
    }

    public static float getDeviceIndependentFloat(Context context, float f)
    {
        return f * context.getResources().getDisplayMetrics().density + 0.5F;
    }

    public static int getDeviceIndependentPixels(Context context, int i)
    {
        float f = context.getResources().getDisplayMetrics().density;
        return (int)((float)i * f + 0.5F);
    }

    public static String getDeviceType()
    {
        return (new StringBuilder()).append(Build.BRAND).append(" ").append(Build.MODEL).toString();
    }

    public static int getRealDeviceWidth(Context context)
    {
        Object obj;
        int j;
        int k;
        int l;
        k = 0;
        l = 0;
        j = 0;
        obj = new DisplayMetrics();
        context = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        int i;
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        context.getRealMetrics(((DisplayMetrics) (obj)));
        i = ((DisplayMetrics) (obj)).widthPixels;
        j = ((DisplayMetrics) (obj)).heightPixels;
        return i;
        Method method;
        obj = android/view/Display.getMethod("getRawHeight", new Class[0]);
        method = android/view/Display.getMethod("getRawWidth", new Class[0]);
        i = ((Integer)method.invoke(context, new Object[0])).intValue();
        j = i;
        k = i;
        l = i;
        ((Integer)((Method) (obj)).invoke(context, new Object[0])).intValue();
_L2:
        return i;
        context;
        try
        {
            context.printStackTrace();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return 0;
        }
        i = j;
        continue; /* Loop/switch isn't completed */
        context;
        context.printStackTrace();
        i = k;
        continue; /* Loop/switch isn't completed */
        context;
        context.printStackTrace();
        i = l;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static int getTopPositionOfView(View view)
    {
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        return ai[1];
    }

    public static boolean hasFroyo()
    {
        return android.os.Build.VERSION.SDK_INT >= 8;
    }

    public static boolean hasGingerbread()
    {
        return android.os.Build.VERSION.SDK_INT >= 9;
    }

    public static boolean hasHoneycomb()
    {
        return android.os.Build.VERSION.SDK_INT >= 11;
    }

    public static boolean hasHoneycombMR1()
    {
        return android.os.Build.VERSION.SDK_INT >= 12;
    }

    public static boolean hasICS()
    {
        return android.os.Build.VERSION.SDK_INT >= 14;
    }

    public static boolean hasJellyBean()
    {
        return android.os.Build.VERSION.SDK_INT >= 16;
    }

    public static boolean isGoogleTV(Context context)
    {
        return context.getPackageManager().hasSystemFeature("com.google.android.tv");
    }

    public static boolean isHoneycombTablet(Context context)
    {
        return hasHoneycomb() && isTablet(context);
    }

    public static boolean isLargeTablet(Context context)
    {
        return (context.getResources().getConfiguration().screenLayout & 0xf) >= 4;
    }

    public static boolean isSmallScreen(Context context)
    {
        return getRealDeviceWidth(context) >= 480;
    }

    public static boolean isTablet(Context context)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (context != null)
        {
            flag = flag1;
            if (context.getResources() != null)
            {
                flag = flag1;
                if (context.getResources().getConfiguration() != null)
                {
                    flag = flag1;
                    if ((context.getResources().getConfiguration().screenLayout & 0xf) >= 3)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }
}
