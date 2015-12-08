// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.utils;

import android.app.Application;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.pinterest.kit.application.CommonApplication;
import com.pinterest.kit.log.PLog;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

public class AppUtils
{

    public static final String AL_ANDROID_APP_NAME = "al:android:app_name";
    public static final String AL_ANDROID_CLASS = "al:android:class";
    public static final String AL_ANDROID_PACKAGE = "al:android:package";
    public static final String AL_ANDROID_URL = "al:android:url";

    public AppUtils()
    {
    }

    public static Intent getAppLinkIntent(HashMap hashmap)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        if (hashmap.containsKey("al:android:package"))
        {
            intent.setPackage((String)hashmap.get("al:android:package"));
            if (hashmap.containsKey("al:android:class"))
            {
                intent.setClassName((String)hashmap.get("al:android:package"), (String)hashmap.get("al:android:class"));
            }
        }
        if (hashmap.containsKey("al:android:url"))
        {
            intent.setData(Uri.parse((String)hashmap.get("al:android:url")));
        }
        intent.addFlags(0x10000000);
        return intent;
    }

    public static ApplicationInfo getApplicationInfo(String s, int i)
    {
        try
        {
            s = getPackageManager().getApplicationInfo(s, i);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static String getApplicationMetadata(String s, String s1)
    {
        try
        {
            s = getApplicationInfo(s, 128).metaData.getString(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static String getApplicationName(String s)
    {
        s = getApplicationInfo(s, 0);
        if (s != null)
        {
            return (String)CommonApplication.context().getPackageManager().getApplicationLabel(s);
        } else
        {
            return null;
        }
    }

    public static String getMaxHeapSize()
    {
        int i = (int)Math.round(Runtime.getRuntime().maxMemory() / 0x100000L);
        return (new StringBuilder("{\"java_heap_space\":\"")).append(i).append("MB\"}").toString();
    }

    public static PackageInfo getPackageInfo(String s, int i)
    {
        try
        {
            s = getPackageManager().getPackageInfo(s, i);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static PackageManager getPackageManager()
    {
        return CommonApplication.context().getPackageManager();
    }

    public static String getPackageSignature(String s)
    {
        Signature asignature[];
        MessageDigest messagedigest;
        int j;
        asignature = getPackageManager().getPackageInfo(s, 64).signatures;
        messagedigest = MessageDigest.getInstance("SHA");
        j = asignature.length;
        int i;
        s = null;
        i = 0;
_L2:
        Object obj;
        obj = s;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        messagedigest.update(asignature[i].toByteArray());
        obj = new String(Base64.encode(messagedigest.digest(), 0));
        i++;
        s = ((String) (obj));
        if (true) goto _L2; else goto _L1
        obj;
        s = null;
_L8:
        PLog.error(((Throwable) (obj)), "NameNotFoundException", new Object[0]);
        obj = s;
_L1:
        return ((String) (obj));
        Object obj1;
        obj1;
        s = null;
_L6:
        PLog.error(((Throwable) (obj1)), "No such an algorithm", new Object[0]);
        return s;
        obj1;
        s = null;
_L4:
        PLog.error(((Throwable) (obj1)), "Exception", new Object[0]);
        return s;
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
        if (true) goto _L6; else goto _L5
_L5:
        obj1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static boolean hasEnoughHeapSpace()
    {
        double d = Runtime.getRuntime().totalMemory() / 0x100000L;
        double d1 = Runtime.getRuntime().maxMemory() / 0x100000L;
        Runtime.getRuntime().freeMemory();
        return d1 - d >= 25D && d1 >= 80D;
    }
}
