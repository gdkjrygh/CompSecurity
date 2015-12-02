// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.qihoo.security.SecurityApplication;
import java.io.File;

public class i
{

    public static boolean a()
    {
        return a(SecurityApplication.a(), "com.qihoo.security");
    }

    public static boolean a(Context context, String s)
    {
        boolean flag;
        try
        {
            flag = (new File(context.getPackageManager().getPackageInfo(s, 0).applicationInfo.publicSourceDir)).exists();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return flag;
    }

    public static String b(Context context, String s)
    {
        Object obj;
        String s1;
        s1 = "";
        obj = s1;
        context = context.getPackageManager();
        obj = s1;
        context = context.getPackageInfo(s, 64).applicationInfo.loadLabel(context).toString();
        obj = context;
        boolean flag = TextUtils.isEmpty(context);
        if (flag)
        {
            context = s;
        }
        s = context;
        if (TextUtils.isEmpty(context))
        {
            break MISSING_BLOCK_LABEL_75;
        }
        s = context;
        if (context.length() > 64)
        {
            s = context.substring(0, 64);
        }
        return s;
        s;
        context = ((Context) (obj));
_L2:
        s.printStackTrace();
        return context;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static PackageInfo c(Context context, String s)
    {
        try
        {
            context = context.getPackageManager().getPackageInfo(s, 64);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        return context;
    }

    public static String d(Context context, String s)
    {
        Object obj;
        String s1;
        s1 = "";
        obj = s1;
        context = context.getPackageManager();
        obj = s1;
        ApplicationInfo applicationinfo = context.getPackageArchiveInfo(s, 1).applicationInfo;
        obj = s1;
        applicationinfo.sourceDir = s;
        obj = s1;
        applicationinfo.publicSourceDir = s;
        obj = s1;
        context = context.getApplicationLabel(applicationinfo).toString();
        obj = context;
        if (!TextUtils.isEmpty(context))
        {
            break MISSING_BLOCK_LABEL_70;
        }
        obj = context;
        context = applicationinfo.packageName;
        s = context;
        if (TextUtils.isEmpty(context))
        {
            break MISSING_BLOCK_LABEL_98;
        }
        s = context;
        if (context.length() > 64)
        {
            s = context.substring(0, 64);
        }
        return s;
        s;
        context = ((Context) (obj));
_L2:
        s.printStackTrace();
        return context;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static int e(Context context, String s)
    {
        int j = 1;
        context = c(context, s);
        if (context != null)
        {
            j = ((PackageInfo) (context)).versionCode;
        }
        return j;
    }

    public static void f(Context context, String s)
    {
        Intent intent;
        Intent intent1;
        try
        {
            intent1 = context.getPackageManager().getLaunchIntentForPackage(s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return;
        }
        intent = intent1;
        if (intent1 != null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(s);
        intent.setFlags(0x10000000);
        context.startActivity(intent);
        return;
    }
}
