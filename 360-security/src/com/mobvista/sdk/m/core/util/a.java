// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.mobvista.sdk.m.a.f.g;
import com.mobvista.sdk.m.core.q;
import java.util.Iterator;
import java.util.List;

public final class a
{

    public static String a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return "";
        }
        if (s.lastIndexOf("/") == -1)
        {
            return (new StringBuilder()).append(s.hashCode()).toString();
        } else
        {
            return (new StringBuilder()).append(s.hashCode() + s.substring(s.lastIndexOf("/") + 1).hashCode()).toString();
        }
    }

    public static void a(Context context, Uri uri)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(uri, "application/vnd.android.package-archive");
        intent.addFlags(0x10000000);
        context.startActivity(intent);
    }

    public static void a(Context context, String s)
    {
        boolean flag = false;
        Intent intent;
        Object obj;
        Log.e("SDKUtil", (new StringBuilder("gotoGoogle = ")).append(s).toString());
        intent = new Intent("android.intent.action.VIEW", Uri.parse(s));
        intent.addFlags(0x10000000);
        obj = context.getPackageManager().queryIntentActivities(intent, 0);
        if (((List) (obj)).size() > 0)
        {
            flag = true;
        }
        if (!s.startsWith("market://"))
        {
            break MISSING_BLOCK_LABEL_253;
        }
        if (!flag)
        {
            Exception exception;
            try
            {
                s = s.replace("market://details?id=", "");
                s = (new StringBuilder("https://play.google.com/store/apps/details?id=")).append(s).toString();
                Log.e("SDKUtil", "gotoGoogle = openurl");
                b(context, s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.e("SDKUtil", "gotoGoogle = error");
            }
            break MISSING_BLOCK_LABEL_243;
        }
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            if (!((ResolveInfo)((Iterator) (obj)).next()).activityInfo.packageName.equals("com.android.vending"))
            {
                continue;
            }
            intent.setClassName("com.android.vending", "com.android.vending.AssetBrowserActivity");
            break;
        } while (true);
        Log.e("SDKUtil", "gotoGoogle = startActivity");
        context.startActivity(intent);
        return;
        exception;
        Log.e("SDKUtil", "start intent", exception);
        s = s.replace("market://details?id=", "");
        s = (new StringBuilder("https://play.google.com/store/apps/details?id=")).append(s).toString();
        Log.e("SDKUtil", "gotoGoogle = openurl");
        b(context, s);
        return;
        Log.e("SDKUtil", "Exception", context);
        return;
        if (s.startsWith("https://play.google.com/"))
        {
            s = s.replace("https://play.google.com/store/apps/details?id=", "");
            s = (new StringBuilder("market://details?id=")).append(s).toString();
            Log.e("SDKUtil", "gotoGoogle = replace url");
            a(context, s);
        }
        return;
    }

    public static String b(String s)
    {
        if (s == null)
        {
            return null;
        }
        if (g.a() && g.c() && g.d())
        {
            return (new StringBuilder()).append(q.c).append(a(s)).toString();
        } else
        {
            return (new StringBuilder()).append(g.b()).append(a(s)).toString();
        }
    }

    public static void b(Context context, String s)
    {
        if (s == null || context == null)
        {
            return;
        }
        Intent intent;
        ResolveInfo resolveinfo;
        try
        {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(s));
            intent.addFlags(0x10000000);
            resolveinfo = context.getPackageManager().resolveActivity(intent, 0x10000);
        }
        catch (Exception exception)
        {
            Log.e("SDKUtil", "openBrowserUrl = error");
            exception.printStackTrace();
            try
            {
                s = new Intent("android.intent.action.VIEW", Uri.parse(s));
                s.addFlags(0x10000000);
                context.startActivity(s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.e("SDKUtil", "openBrowserUrl = error2");
            }
            context.printStackTrace();
            return;
        }
        if (resolveinfo == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        intent.setClassName(resolveinfo.activityInfo.packageName, resolveinfo.activityInfo.name);
        context.startActivity(intent);
        return;
    }

    public static boolean c(Context context, String s)
    {
        if (s != null && !"".equals(s)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        boolean flag;
        try
        {
            context = context.getPackageManager().getPackageInfo(s, 8192);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        if (context == null) goto _L1; else goto _L3
_L3:
        flag = s.equals(((PackageInfo) (context)).packageName);
        return flag;
    }

    public static void d(Context context, String s)
    {
        if (TextUtils.isEmpty(s) || !c(context, s))
        {
            break MISSING_BLOCK_LABEL_118;
        }
        s = context.getPackageManager().getLaunchIntentForPackage(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        Intent intent;
        try
        {
            s = context.getPackageManager().queryIntentActivities(s, 0);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Toast.makeText(context, "\u8BE5\u5E94\u7528\u4E0D\u80FD\u6B63\u5E38\u542F\u52A8", 0).show();
            s.printStackTrace();
            return;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        if (s.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        s = (ResolveInfo)s.iterator().next();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        s = new ComponentName(((ResolveInfo) (s)).activityInfo.packageName, ((ResolveInfo) (s)).activityInfo.name);
        intent = new Intent();
        intent.setComponent(s);
        intent.addFlags(0x10000000);
        context.startActivity(intent);
    }
}
