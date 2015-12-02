// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.security.MessageDigest;

public class WID
{

    public static final String DEFAULT_IMEI = "360_DEFAULT_IMEI";
    public static final String EXTRA_ASSOCIATED_SYMBOL = "@@";
    private static String a;

    public WID()
    {
    }

    private static String a()
    {
        Object obj = Class.forName("android.os.SystemProperties");
        if (obj == null) goto _L2; else goto _L1
_L1:
        Object obj1 = ((Class) (obj)).getMethod("get", new Class[] {
            java/lang/String, java/lang/String
        });
        if (obj1 == null) goto _L2; else goto _L3
_L3:
        try
        {
            obj = (String)((Method) (obj1)).invoke(obj, new Object[] {
                "ro.serialno", ""
            });
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
        }
_L5:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = "";
        }
        return ((String) (obj1));
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private static final String a(Context context)
    {
        context = (TelephonyManager)context.getSystemService("phone");
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        if (TextUtils.isEmpty(context.getDeviceId()))
        {
            break MISSING_BLOCK_LABEL_32;
        }
        context = context.getDeviceId();
        return context;
        context;
        return "360_DEFAULT_IMEI";
    }

    public static String getWid(Context context)
    {
        if (!TextUtils.isEmpty(a))
        {
            return a;
        } else
        {
            String s = a(context);
            context = android.provider.Settings.System.getString(context.getContentResolver(), "android_id");
            String s1 = a();
            context = md5((new StringBuilder(String.valueOf(s))).append(context).append(s1).toString());
            a = context;
            return context;
        }
    }

    public static String md5(String s)
    {
        int i;
        int j;
        Object obj;
        try
        {
            obj = MessageDigest.getInstance("MD5");
            ((MessageDigest) (obj)).update(s.getBytes());
            s = ((MessageDigest) (obj)).digest();
            obj = new StringBuffer("");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        i = 0;
        if (i >= s.length)
        {
            return ((StringBuffer) (obj)).toString();
        }
        break MISSING_BLOCK_LABEL_74;
_L2:
        if (j >= 16)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        ((StringBuffer) (obj)).append("0");
        ((StringBuffer) (obj)).append(Integer.toHexString(j));
        i++;
        break MISSING_BLOCK_LABEL_31;
        byte byte0 = s[i];
        j = byte0;
        if (byte0 < 0)
        {
            j = byte0 + 256;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
