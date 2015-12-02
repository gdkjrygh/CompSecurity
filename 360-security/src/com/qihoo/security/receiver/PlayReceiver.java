// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.qihoo.security.env.a;
import com.qihoo360.mobilesafe.b.h;
import com.qihoo360.mobilesafe.share.SharedPref;

public class PlayReceiver extends BroadcastReceiver
{

    public PlayReceiver()
    {
    }

    private String a(String s, String s1)
    {
        if (TextUtils.isEmpty(s1) || TextUtils.isEmpty(s) || !s.contains(s1))
        {
            return null;
        }
        s = s.split("&");
        if (s != null && s.length > 0)
        {
            for (int i = 0; i < s.length; i++)
            {
                String s2 = s[i];
                if (s2 == null || !s2.startsWith(s1))
                {
                    continue;
                }
                String as[] = s2.split("=");
                if (as != null && as.length > 1)
                {
                    return as[1];
                }
            }

        }
        return null;
    }

    public void onReceive(Context context, Intent intent)
    {
        SharedPref.a(context.getApplicationContext(), "package_source", "google play");
        if (intent != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s = h.a(intent, "referrer", null);
        try
        {
            com.qihoo.security.env.a.a(context, Integer.valueOf(s).intValue());
            return;
        }
        catch (NumberFormatException numberformatexception) { }
        if (s != null && s.startsWith("qihoo_id"))
        {
            try
            {
                com.qihoo.security.env.a.a(context, Integer.valueOf(a(s, "qihoo_id")).intValue());
                SharedPref.a(context.getApplicationContext(), "gp_url", s);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
            try
            {
                com.qihoo.security.env.a.a(context, a(s, "qihoo_subid"));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
        }
        if (s == null || !s.startsWith("af_tranid"))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (SharedPref.b(context, "reg", false)) goto _L1; else goto _L3
_L3:
        com.qihoo.security.env.a.a(context, 0x497eb);
        SharedPref.a(context.getApplicationContext(), "gp_url", s);
        AppsFlyerProperties.getInstance().disableLogOutput(true);
        (new AppsFlyerLib()).onReceive(context, intent);
        return;
        context;
        return;
        if (s != null && s.startsWith("AppFlyer_TEST") || s == null || !s.startsWith("AppsFlyer_Test")) goto _L1; else goto _L4
_L4:
    }
}
