// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.installtracker;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.admarvel.android.util.Base64;
import com.admarvel.android.util.Logging;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Utils
{

    public Utils()
    {
    }

    static String decodeString(String s)
    {
        try
        {
            s = new String(Base64.decode(URLDecoder.decode(s, "UTF-8"), 8), "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logging.log(Log.getStackTraceString(s));
            return "";
        }
        return s;
    }

    static String encodeString(String s)
    {
        try
        {
            s = URLEncoder.encode(Base64.encodeToString(s.getBytes(), 8), "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logging.log(Log.getStackTraceString(s));
            return "";
        }
        return s;
    }

    static boolean isAppInstalled(Context context, String s)
    {
        try
        {
            context.getPackageManager().getApplicationInfo(s, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return true;
    }
}
