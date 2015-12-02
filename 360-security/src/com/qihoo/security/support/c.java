// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.support;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import com.qihoo.security.d.a;
import com.qihoo.security.locale.d;
import com.qihoo360.mobilesafe.b.o;
import com.qihoo360.mobilesafe.share.SharedPref;
import com.qihoo360.mobilesafe.support.NativeManager;
import java.util.Locale;

public final class c
{

    private static final String a = "http://securityuninstall.data.360safe.com/?";
    private static Bundle b = null;

    public static Bundle a(Context context)
    {
        com/qihoo/security/support/c;
        JVM INSTR monitorenter ;
        String s1;
        if (b == null)
        {
            b = b(context);
        }
        s1 = d.a().f();
        String s = s1;
        if ("".equals(s1))
        {
            s = context.getResources().getConfiguration().locale.getLanguage();
        }
        b.putString("lang", s);
        context = b;
        com/qihoo/security/support/c;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private static Bundle b(Context context)
    {
        Bundle bundle = new Bundle();
        String s1 = (new a(context)).a("unistat", "host");
        String s = s1;
        if (s1 == null)
        {
            s = a;
        }
        bundle.putString("", s);
        bundle.putString("client", context.getPackageName());
        bundle.putString("version", "1.0.8.3742");
        bundle.putString("deviceModel", Build.MODEL);
        bundle.putString("sysVersion", android.os.Build.VERSION.RELEASE);
        if (com.qihoo360.mobilesafe.support.a.a())
        {
            s = "0";
        } else
        {
            s = "1";
        }
        bundle.putString("isRoot", s);
        if (o.a(context, "com.google.android.gms") && o.h(context))
        {
            s = "1";
        } else
        {
            s = "0";
        }
        bundle.putString("gp", s);
        bundle.putString("email", o.i(context));
        if (context != null)
        {
            bundle.putString("deviceId", o.b(context));
            bundle.putString("district", ((TelephonyManager)context.getApplicationContext().getSystemService("phone")).getNetworkOperator());
        }
        s = d.a().f();
        if ("".equals(s))
        {
            context.getResources().getConfiguration().locale.getLanguage();
        }
        s1 = SharedPref.b(context, "g_subcid", "");
        if (s1 != null && !"".equals(s1))
        {
            bundle.putString("subChannel", s1);
        }
        bundle.putString("lang", s);
        bundle.putString("channel", String.valueOf(com.qihoo.security.env.a.a(context)));
        try
        {
            context = NativeManager.getCodePS(System.currentTimeMillis());
            s = NativeManager.getCodePD(System.currentTimeMillis());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return bundle;
        }
        if (context == null || s == null)
        {
            break MISSING_BLOCK_LABEL_279;
        }
        bundle.putString("dk", s);
        bundle.putString("sk", context);
        return bundle;
    }

}
