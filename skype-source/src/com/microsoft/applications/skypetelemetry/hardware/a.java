// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.skypetelemetry.hardware;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.Log;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class a
{

    private static String a = "";
    private static String b = "";
    private static String c = "";
    private static String d = "";
    private static String e = "";
    private static String f = "";
    private static String g;
    private static String h = "";
    private static final String i;
    private static final String j = com/microsoft/applications/skypetelemetry/hardware/a.getSimpleName();

    public a()
    {
    }

    private static String a()
    {
        String.format("getOsVersion|value:%s", new Object[] {
            i
        });
        return i;
    }

    private static String a(Locale locale)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            return locale.toLanguageTag();
        } else
        {
            return locale.toString().replace('_', '-');
        }
    }

    public static void a(Context context)
    {
        try
        {
            d = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            e = a(context.getResources().getConfiguration().locale);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.wtf(j, (new StringBuilder("This should never happen ")).append(context.getMessage()).toString());
        }
    }

    static 
    {
        Object obj = TimeZone.getDefault();
        int k = ((TimeZone) (obj)).getOffset(GregorianCalendar.getInstance(((TimeZone) (obj))).getTimeInMillis());
        String s = String.format("%02d:%02d", new Object[] {
            Integer.valueOf(Math.abs(k / 0x36ee80)), Integer.valueOf(Math.abs((k / 60000) % 60))
        });
        StringBuilder stringbuilder = new StringBuilder();
        if (k >= 0)
        {
            obj = "+";
        } else
        {
            obj = "-";
        }
        g = stringbuilder.append(((String) (obj))).append(s).toString();
        i = android.os.Build.VERSION.RELEASE;
        a = a();
        b = (new StringBuilder()).append(a()).append(" ").append(android.os.Build.VERSION.RELEASE).append(" ").append(android.os.Build.VERSION.INCREMENTAL).toString();
        f = a(Locale.getDefault());
    }
}
