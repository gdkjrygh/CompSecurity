// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.common.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class g
{

    public static final String a = System.getProperty("line.separator");
    private static final String b = "helper";

    public g()
    {
    }

    public static String a()
    {
        return a(new Date());
    }

    public static String a(Context context, long l)
    {
        if (l < 1000L)
        {
            return (new StringBuilder(String.valueOf((int)l))).append("B").toString();
        }
        if (l < 0xf4240L)
        {
            return (new StringBuilder(String.valueOf(Math.round((double)(float)l / 1000D)))).append("K").toString();
        }
        if (l < 0x3b9aca00L)
        {
            return (new StringBuilder(String.valueOf((new DecimalFormat("#0.0")).format((double)(float)l / 1000000D)))).append("M").toString();
        } else
        {
            return (new StringBuilder(String.valueOf((new DecimalFormat("#0.00")).format((double)(float)l / 1000000000D)))).append("G").toString();
        }
    }

    public static String a(String s)
    {
        int i;
        i = 0;
        if (s == null)
        {
            return null;
        }
        byte abyte0[];
        Object obj;
        abyte0 = s.getBytes();
        obj = MessageDigest.getInstance("MD5");
        ((MessageDigest) (obj)).reset();
        ((MessageDigest) (obj)).update(abyte0);
        abyte0 = ((MessageDigest) (obj)).digest();
        obj = new StringBuffer();
_L1:
        if (i >= abyte0.length)
        {
            return ((StringBuffer) (obj)).toString();
        }
        ((StringBuffer) (obj)).append(String.format("%02X", new Object[] {
            Byte.valueOf(abyte0[i])
        }));
        i++;
          goto _L1
        Exception exception;
        exception;
        return s.replaceAll("[^[a-z][A-Z][0-9][.][_]]", "");
    }

    public static String a(Date date)
    {
        if (date == null)
        {
            return "";
        } else
        {
            return (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(date);
        }
    }

    public static void a(Context context, String s)
    {
        context.startActivity(context.getPackageManager().getLaunchIntentForPackage(s));
    }

    public static String b(String s)
    {
        Object obj;
        int i;
        try
        {
            obj = MessageDigest.getInstance("MD5");
            ((MessageDigest) (obj)).update(s.getBytes());
            s = ((MessageDigest) (obj)).digest();
            obj = new StringBuffer();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.i("helper", "getMD5 error", s);
            return "";
        }
        i = 0;
        if (i >= s.length)
        {
            return ((StringBuffer) (obj)).toString();
        }
        ((StringBuffer) (obj)).append(Integer.toHexString(s[i] & 0xff));
        i++;
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_29;
        }
    }

    public static boolean b(Context context, String s)
    {
        try
        {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return false;
        }
        return true;
    }

    public static boolean c(String s)
    {
        return s == null || s.length() == 0;
    }

    public static boolean d(String s)
    {
        if (!c(s))
        {
            if ((s = s.trim().toLowerCase()).startsWith("http://") || s.startsWith("https://"))
            {
                return true;
            }
        }
        return false;
    }

}
