// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.ui.page.DebugFlag;
import ctz;
import dmx;
import geu;
import java.util.List;
import java.util.Properties;

public class ClientInfo
    implements dmx
{

    public PackageInfo a;
    private Context b;
    private String c;
    private geu d;

    public ClientInfo(Context context)
    {
        b = context;
        d = geu.a();
        context = b.getPackageName();
        try
        {
            a = b.getPackageManager().getPackageInfo(context, 0);
            ctz.a(b.getPackageManager().getApplicationInfo(context, 128));
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            throw new UnableToGetVersionException((new StringBuilder("Could not load package or application info for package ")).append(context).toString(), namenotfoundexception);
        }
        c = b.getPackageManager().getInstallerPackageName(context);
    }

    public static Intent a(Context context)
    {
        String s = context.getPackageName();
        context = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder("market://details?id=")).append(s).toString()));
        if (!context.queryIntentActivities(intent, 0).isEmpty())
        {
            return intent;
        } else
        {
            return new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder("https://play.google.com/store/apps/details?id=")).append(s).toString()));
        }
    }

    public final boolean a()
    {
label0:
        {
            boolean flag1 = false;
            DebugFlag debugflag = DebugFlag.f;
            if (!"com.android.vending".equals(c) && !"com.google.android.feedback".equals(c))
            {
                Object obj = d;
                ((geu) (obj)).b();
                obj = ((geu) (obj)).a.getProperty("allow_get_premium");
                boolean flag;
                if (!TextUtils.isEmpty(((CharSequence) (obj))) && !"false".equalsIgnoreCase(((String) (obj))))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    break label0;
                }
            }
            flag1 = true;
        }
        return flag1;
    }

    public final Uri b()
    {
        Uri uri = null;
        if ("com.android.vending".equals(c))
        {
            uri = Uri.parse((new StringBuilder("market://details?id=")).append(a.packageName).toString());
        } else
        if ("com.amazon.venezia".equals(c))
        {
            return Uri.parse((new StringBuilder("http://www.amazon.com/gp/mas/dl/android?p=")).append(a.packageName).toString());
        }
        return uri;
    }

    private class UnableToGetVersionException extends RuntimeException
    {

        private static final long serialVersionUID = 0x919fc9ca1bd6e224L;

        public UnableToGetVersionException()
        {
        }

        public UnableToGetVersionException(String s, Throwable throwable)
        {
            super(s, throwable);
        }
    }

}
