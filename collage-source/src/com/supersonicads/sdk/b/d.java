// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.supersonicads.sdk.b;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.StatFs;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.supersonicads.sdk.b:
//            c

public class d
{

    private static final String a = com/supersonicads/sdk/b/d.getSimpleName();
    private static String b;
    private static boolean c = true;

    public d()
    {
    }

    public static int a()
    {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static int a(long l)
    {
        DisplayMetrics displaymetrics = Resources.getSystem().getDisplayMetrics();
        float f1 = l;
        return (int)(displaymetrics.density * f1 + 0.5F);
    }

    public static int a(Context context)
    {
        return ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    public static long a(Context context, String s)
    {
        context = new StatFs(s);
        long l = context.getAvailableBlocks();
        return ((long)context.getBlockSize() * l) / 0x100000L;
    }

    public static String a(String s)
    {
        s = s.split(File.separator);
        s = s[s.length - 1].split("\\?")[0];
        try
        {
            s = URLEncoder.encode(s, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }

    public static String a(String s, String s1)
    {
        return String.format("%s Failure occurred during initiation at: %s", new Object[] {
            s, s1
        });
    }

    public static int b()
    {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static int b(Context context)
    {
        WindowManager windowmanager = (WindowManager)context.getSystemService("window");
        context = context.getResources().getConfiguration();
        int i = windowmanager.getDefaultDisplay().getRotation();
        return (i != 0 && i != 2 || ((Configuration) (context)).orientation != 2) && (i != 1 && i != 3 || ((Configuration) (context)).orientation != 1) ? 1 : 2;
    }

    public static String b(String s)
    {
        try
        {
            s = URLEncoder.encode(s, "UTF-8").replace("+", "%20");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "";
        }
        return s;
    }

    public static Long c()
    {
        return Long.valueOf(System.currentTimeMillis());
    }

    public static String c(String s)
    {
        try
        {
            for (s = (new BigInteger(1, MessageDigest.getInstance("MD5").digest(s.getBytes()))).toString(16); s.length() < 32; s = (new StringBuilder()).append("0").append(s).toString()) { }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return s;
    }

    public static JSONObject c(Context context)
    {
        int i = context.getResources().getConfiguration().orientation;
        context = "portrait";
        if (i == 2)
        {
            context = "landscape";
        }
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("orientation", context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return jsonobject;
        }
        return jsonobject;
    }

    public static float d()
    {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static int d(Context context)
    {
        return ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    public static String e()
    {
        return b;
    }

    public static String e(Context context)
    {
        return context.getPackageName();
    }

    public static boolean f()
    {
        return c;
    }

    public static boolean f(Context context)
    {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        return context != null && context.isConnected();
    }

    public static String g()
    {
        return "5.17";
    }

    public static String g(Context context)
    {
        StringBuilder stringbuilder = new StringBuilder();
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (context != null && context.isConnected())
        {
            String s = context.getTypeName();
            context.getSubtypeName();
            int i = context.getType();
            if (i == 0)
            {
                stringbuilder.append("3g");
            } else
            if (i == 1)
            {
                stringbuilder.append("wifi");
            } else
            {
                stringbuilder.append(s);
            }
        }
        return stringbuilder.toString();
    }

    public static void h(Context context)
    {
        Object obj = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", new Class[] {
            android/content/Context
        }).invoke(null, new Object[] {
            context
        });
        context = obj.getClass().getMethod("getId", new Class[0]);
        Method method = obj.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]);
        b = context.invoke(obj, new Object[0]).toString();
        c = ((Boolean)method.invoke(obj, new Object[0])).booleanValue();
        if (false)
        {
            throw new NullPointerException();
        }
_L2:
        return;
        context;
        if (context == null) goto _L2; else goto _L1
_L1:
        if (context.getMessage() != null)
        {
            com.supersonicads.sdk.b.c.a(a, (new StringBuilder()).append(context.getClass().getSimpleName()).append(": ").append(context.getMessage()).toString());
        }
        if (context.getCause() == null) goto _L2; else goto _L3
_L3:
        com.supersonicads.sdk.b.c.a(a, (new StringBuilder()).append(context.getClass().getSimpleName()).append(": ").append(context.getCause()).toString());
        return;
        context;
        if (context == null) goto _L2; else goto _L4
_L4:
        if (context.getMessage() != null)
        {
            com.supersonicads.sdk.b.c.a(a, (new StringBuilder()).append(context.getClass().getSimpleName()).append(": ").append(context.getMessage()).toString());
        }
        if (context.getCause() == null) goto _L2; else goto _L5
_L5:
        com.supersonicads.sdk.b.c.a(a, (new StringBuilder()).append(context.getClass().getSimpleName()).append(": ").append(context.getCause()).toString());
        return;
        context;
        if (context == null) goto _L2; else goto _L6
_L6:
        if (context.getMessage() != null)
        {
            com.supersonicads.sdk.b.c.a(a, (new StringBuilder()).append(context.getClass().getSimpleName()).append(": ").append(context.getMessage()).toString());
        }
        if (context.getCause() == null) goto _L2; else goto _L7
_L7:
        com.supersonicads.sdk.b.c.a(a, (new StringBuilder()).append(context.getClass().getSimpleName()).append(": ").append(context.getCause()).toString());
        return;
        context;
        if (context == null) goto _L2; else goto _L8
_L8:
        if (context.getMessage() != null)
        {
            com.supersonicads.sdk.b.c.a(a, (new StringBuilder()).append(context.getClass().getSimpleName()).append(": ").append(context.getMessage()).toString());
        }
        if (context.getCause() == null) goto _L2; else goto _L9
_L9:
        com.supersonicads.sdk.b.c.a(a, (new StringBuilder()).append(context.getClass().getSimpleName()).append(": ").append(context.getCause()).toString());
        return;
        context;
        if (context == null) goto _L2; else goto _L10
_L10:
        if (context.getMessage() != null)
        {
            com.supersonicads.sdk.b.c.a(a, (new StringBuilder()).append(context.getClass().getSimpleName()).append(": ").append(context.getMessage()).toString());
        }
        if (context.getCause() == null) goto _L2; else goto _L11
_L11:
        com.supersonicads.sdk.b.c.a(a, (new StringBuilder()).append(context.getClass().getSimpleName()).append(": ").append(context.getCause()).toString());
        return;
        context;
        if (false)
        {
            throw new NullPointerException();
        } else
        {
            throw context;
        }
    }

}
