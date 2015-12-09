// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Field;
import java.security.MessageDigest;

public class a
{

    public static String a = null;
    public static String b = null;
    public static String c = null;
    public static String d = null;
    public static String e = null;
    public static String f = null;
    public static String g = null;
    public static String h = null;
    public static final String i = "HockeyApp";
    public static final String j = "https://sdk.hockeyapp.net/";
    public static final String k = "HockeySDK";
    public static final String l = "3.5.0";

    public a()
    {
    }

    private static int a(Context context, PackageManager packagemanager)
    {
        int i1 = 0;
        try
        {
            context = packagemanager.getApplicationInfo(context.getPackageName(), 128).metaData;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("HockeyApp", "Exception thrown when accessing the application info:");
            context.printStackTrace();
            return 0;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        i1 = context.getInt("buildNumber", 0);
        return i1;
    }

    public static File a()
    {
        File file = Environment.getExternalStorageDirectory();
        file = new File((new StringBuilder()).append(file.getAbsolutePath()).append("/").append("HockeyApp").toString());
        file.mkdirs();
        return file;
    }

    private static String a(byte abyte0[])
    {
        char ac[] = "0123456789ABCDEF".toCharArray();
        char ac1[] = new char[abyte0.length * 2];
        for (int i1 = 0; i1 < abyte0.length; i1++)
        {
            int j1 = abyte0[i1] & 0xff;
            ac1[i1 * 2] = ac[j1 >>> 4];
            ac1[i1 * 2 + 1] = ac[j1 & 0xf];
        }

        return (new String(ac1)).replaceAll("(\\w{8})(\\w{4})(\\w{4})(\\w{4})(\\w{12})", "$1-$2-$3-$4-$5");
    }

    public static void a(Context context)
    {
        e = android.os.Build.VERSION.RELEASE;
        f = Build.MODEL;
        g = Build.MANUFACTURER;
        b(context);
        c(context);
        d(context);
    }

    private static void b(Context context)
    {
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        try
        {
            context = context.getFilesDir();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("HockeyApp", "Exception thrown when accessing the files dir:");
            context.printStackTrace();
            return;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        a = context.getAbsolutePath();
    }

    private static void c(Context context)
    {
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        PackageInfo packageinfo;
        int i1;
        try
        {
            PackageManager packagemanager = context.getPackageManager();
            packageinfo = packagemanager.getPackageInfo(context.getPackageName(), 0);
            d = packageinfo.packageName;
            b = (new StringBuilder()).append("").append(packageinfo.versionCode).toString();
            c = packageinfo.versionName;
            i1 = a(context, packagemanager);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("HockeyApp", "Exception thrown when accessing the package info:");
            context.printStackTrace();
            return;
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        if (i1 > packageinfo.versionCode)
        {
            b = (new StringBuilder()).append("").append(i1).toString();
        }
    }

    private static void d(Context context)
    {
        String s;
        s = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (d == null || s == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        s = (new StringBuilder()).append(d).append(":").append(s).append(":").append(e(context)).toString();
        context = MessageDigest.getInstance("SHA-1");
        byte abyte0[] = s.getBytes("UTF-8");
        context.update(abyte0, 0, abyte0.length);
        h = a(context.digest());
        return;
        context;
    }

    private static String e(Context context)
    {
        String s1 = (new StringBuilder()).append("HA").append(Build.BOARD.length() % 10).append(Build.BRAND.length() % 10).append(Build.CPU_ABI.length() % 10).append(Build.PRODUCT.length() % 10).toString();
        String s = "";
        context = s;
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            try
            {
                context = android/os/Build.getField("SERIAL").get(null).toString();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context = s;
            }
        }
        return (new StringBuilder()).append(s1).append(":").append(context).toString();
    }

}
