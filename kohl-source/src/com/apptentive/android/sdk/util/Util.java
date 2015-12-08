// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.util;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import com.apptentive.android.sdk.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

public class Util
{

    public static final String PSEUDO_ISO8601_DATE_FORMAT = "yyyy-MM-dd HH:mm:ssZ";
    public static final String PSEUDO_ISO8601_DATE_FORMAT_MILLIS = "yyyy-MM-dd HH:mm:ss.SSSZ";

    public Util()
    {
    }

    public static double currentTimeSeconds()
    {
        return (double)System.currentTimeMillis() / 1000D;
    }

    public static String dateToIso8601String(long l)
    {
        return dateToString(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ"), new Date(l));
    }

    public static String dateToString(DateFormat dateformat, Date date)
    {
        return dateformat.format(date);
    }

    public static int dipsToPixels(Context context, int i)
    {
        float f = context.getResources().getDisplayMetrics().density;
        return Math.round((float)i * f);
    }

    public static float dipsToPixelsFloat(Context context, int i)
    {
        float f = context.getResources().getDisplayMetrics().density;
        return (float)i * f;
    }

    public static void ensureClosed(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
    }

    private static Account getAccount(AccountManager accountmanager)
    {
        Object obj = null;
        Account aaccount[];
        try
        {
            aaccount = accountmanager.getAccountsByType("com.google");
        }
        // Misplaced declaration of an exception variable
        catch (AccountManager accountmanager)
        {
            return null;
        }
        accountmanager = obj;
        if (aaccount.length > 0)
        {
            accountmanager = aaccount[aaccount.length - 1];
        }
        return accountmanager;
    }

    public static String[] getAllUserAccountEmailAddresses(Context context)
    {
        ArrayList arraylist = new ArrayList();
        if (!packageHasPermission(context, "android.permission.GET_ACCOUNTS")) goto _L2; else goto _L1
_L1:
        context = AccountManager.get(context);
        int i;
        int j;
        try
        {
            context = context.getAccountsByType("com.google");
            j = context.length;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            break; /* Loop/switch isn't completed */
        }
        i = 0;
_L3:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(((Account) (context[i])).name);
        i++;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L3; else goto _L2
_L2:
        return (String[])arraylist.toArray(new String[arraylist.size()]);
    }

    public static int getAppVersionCode(Context context)
    {
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("Error getting app version code.", context, new Object[0]);
            return -1;
        }
        return i;
    }

    public static String getAppVersionName(Context context)
    {
        try
        {
            context = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("Error getting app version name.", context, new Object[0]);
            return null;
        }
        return context;
    }

    private static String getEmail(Context context)
    {
        context = getAccount(AccountManager.get(context));
        if (context == null)
        {
            return null;
        } else
        {
            return ((Account) (context)).name;
        }
    }

    public static String getInstallerPackageName(Context context)
    {
        try
        {
            context = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static Object getPackageMetaData(Context context, String s)
    {
        try
        {
            context = ((Context) (context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get(s)));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static boolean getPackageMetaDataBoolean(Context context, String s)
    {
        boolean flag;
        try
        {
            flag = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean(s, false);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return flag;
    }

    public static String getPackageMetaDataSingleQuotedString(Context context, String s)
    {
        context = ((Context) (getPackageMetaData(context, s)));
        if (context == null)
        {
            s = null;
        } else
        {
            s = context.toString();
            context = s;
            if (s.endsWith("'"))
            {
                context = s.substring(0, s.length() - 1);
            }
            s = context;
            if (context.startsWith("'"))
            {
                return context.substring(1, context.length());
            }
        }
        return s;
    }

    private static List getPermissions(Context context)
    {
        return context.getPackageManager().getInstalledPackages(4096);
    }

    public static Point getScreenSize(Context context)
    {
        Point point = new Point();
        context = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        point.set(context.getWidth(), context.getHeight());
        return point;
    }

    public static int getStatusBarHeight(Window window)
    {
        Rect rect = new Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }

    public static String getUserEmail(Context context)
    {
        if (packageHasPermission(context, "android.permission.GET_ACCOUNTS"))
        {
            context = getEmail(context);
            if (context != null)
            {
                return context;
            }
        }
        return null;
    }

    public static int getUtcOffset()
    {
        return TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000;
    }

    public static void hideSoftKeyboard(Activity activity, View view)
    {
        if (view != null)
        {
            ((InputMethodManager)activity.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static boolean isEmailValid(String s)
    {
        return s.matches("^[^\\s@]+@[^\\s@]+$");
    }

    public static boolean isEmpty(String s)
    {
        return s == null || s.length() == 0;
    }

    public static boolean isNetworkConnectionPresent(Context context)
    {
        context = (ConnectivityManager)context.getSystemService("connectivity");
        return context != null && context.getActiveNetworkInfo() != null;
    }

    public static boolean packageHasPermission(Context context, String s)
    {
        return packageHasPermission(context, context.getApplicationContext().getPackageName(), s);
    }

    public static boolean packageHasPermission(Context context, String s, String s1)
    {
        context = getPermissions(context).iterator();
        do
        {
            if (!context.hasNext())
            {
                break;
            }
            PackageInfo packageinfo = (PackageInfo)context.next();
            if (packageinfo.packageName.equals(s) && packageinfo.requestedPermissions != null)
            {
                String as[] = packageinfo.requestedPermissions;
                int j = as.length;
                int i = 0;
                while (i < j) 
                {
                    if (as[i].equals(s1))
                    {
                        return true;
                    }
                    i++;
                }
            }
        } while (true);
        return false;
    }

    public static Integer parseCacheControlHeader(String s)
    {
        int i;
        int j;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        s = s.split(",");
        j = s.length;
        i = 0;
_L3:
        if (i >= j) goto _L2; else goto _L1
_L1:
        String s1;
        s1 = s[i].trim();
        if (!s1.startsWith("max-age="))
        {
            continue; /* Loop/switch isn't completed */
        }
        String as[] = s1.split("=");
        if (as.length != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        as = as[1];
        int k = Integer.parseInt(as);
        return Integer.valueOf(k);
        NumberFormatException numberformatexception;
        numberformatexception;
        Log.e("Error parsing cache expiration as number: %s", numberformatexception, new Object[] {
            as
        });
        i++;
          goto _L3
_L2:
        return null;
    }

    public static Date parseIso8601Date(String s)
    {
        String s1;
        String s2;
        s2 = s.trim().replace("Z", "+00:00").replace("T", " ");
        s1 = s2;
        int k;
        if (s2.charAt(s2.length() - 3) == ':')
        {
            int i = s2.lastIndexOf(":");
            s1 = (new StringBuilder()).append(s2.substring(0, i)).append(s2.substring(i + 1)).toString();
        }
        k = s1.lastIndexOf('.');
        if (s1.lastIndexOf('+') == -1) goto _L2; else goto _L1
_L1:
        int j = s1.lastIndexOf('+');
_L4:
        String s3 = s1;
        if (k != -1)
        {
            try
            {
                s3 = s1.substring(0, k + 1);
                String s4 = s1.substring(k + 1, j);
                s1 = s1.substring(j);
                s4 = String.format("%-3s", new Object[] {
                    s4
                }).replace(" ", "0");
                s3 = (new StringBuilder()).append(s3).append(s4).append(s1).toString();
            }
            catch (Exception exception)
            {
                Log.e((new StringBuilder()).append("Error parsing date: ").append(s).toString(), exception, new Object[0]);
                return new Date();
            }
        }
        try
        {
            if (!s3.contains("."))
            {
                break; /* Loop/switch isn't completed */
            }
            s = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ")).parse(s3);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e((new StringBuilder()).append("Exception parsing date: ").append(s3).toString(), s, new Object[0]);
            return null;
        }
        return s;
_L2:
        j = s1.lastIndexOf('-');
        if (true) goto _L4; else goto _L3
_L3:
        s = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ")).parse(s3);
        return s;
    }

    public static int pixelsToDips(Context context, int i)
    {
        float f = context.getResources().getDisplayMetrics().density;
        return Math.round((float)i / f);
    }

    public static void printDebugInfo(Context context)
    {
        Point point = getScreenSize(context);
        Log.e("Screen size: PX=%dx%d DP=%dx%d", new Object[] {
            Integer.valueOf(point.x), Integer.valueOf(point.y), Integer.valueOf(pixelsToDips(context, point.x)), Integer.valueOf(pixelsToDips(context, point.y))
        });
    }

    public static String readStringFromInputStream(InputStream inputstream, String s)
    {
        Object obj;
        Object obj1;
        StringBuilder stringbuilder;
        char ac[];
        obj = null;
        obj1 = null;
        stringbuilder = new StringBuilder();
        ac = new char[8196];
        inputstream = new InputStreamReader(inputstream, s);
_L3:
        int i = inputstream.read(ac, 0, 8196);
        if (i >= 0) goto _L2; else goto _L1
_L1:
        ensureClosed(inputstream);
_L4:
        return stringbuilder.toString();
_L2:
        stringbuilder.append(ac, 0, i);
          goto _L3
        s;
_L7:
        ensureClosed(inputstream);
          goto _L4
        s;
        inputstream = obj;
_L6:
        ensureClosed(inputstream);
        throw s;
        s;
        if (true) goto _L6; else goto _L5
_L5:
        inputstream;
        inputstream = obj1;
          goto _L7
    }

    public static String secondsToDisplayString(String s, Double double1)
    {
        return dateToString(new SimpleDateFormat(s), new Date(Math.round(double1.doubleValue() * 1000D))).replace("PM", "pm").replace("AM", "am");
    }

    public static String stackTraceAsString(Throwable throwable)
    {
        StringWriter stringwriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringwriter));
        return stringwriter.toString();
    }
}
