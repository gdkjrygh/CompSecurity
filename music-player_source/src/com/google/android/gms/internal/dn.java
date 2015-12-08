// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//            eh, ea

public final class dn
{

    public final int a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final boolean f = eh.a();
    public final boolean g;
    public final boolean h;
    public final String i;
    public final String j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final float q;
    public final int r;
    public final int s;

    public dn(Context context)
    {
        boolean flag1 = true;
        super();
        AudioManager audiomanager = (AudioManager)context.getSystemService("audio");
        ConnectivityManager connectivitymanager = (ConnectivityManager)context.getSystemService("connectivity");
        DisplayMetrics displaymetrics = context.getResources().getDisplayMetrics();
        Locale locale = Locale.getDefault();
        PackageManager packagemanager = context.getPackageManager();
        TelephonyManager telephonymanager = (TelephonyManager)context.getSystemService("phone");
        a = audiomanager.getMode();
        int i1;
        boolean flag;
        if (a(packagemanager, "geo:0,0?q=donuts") != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        if (a(packagemanager, "http://www.google.com") != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        c = flag;
        d = telephonymanager.getNetworkOperator();
        e = locale.getCountry();
        g = audiomanager.isMusicActive();
        h = audiomanager.isSpeakerphoneOn();
        i = locale.getLanguage();
        j = a(packagemanager);
        k = audiomanager.getStreamVolume(3);
        if (ea.a(packagemanager, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE"))
        {
            context = connectivitymanager.getActiveNetworkInfo();
            if (context != null)
            {
                i1 = context.getType();
            } else
            {
                i1 = -1;
            }
        } else
        {
            i1 = -2;
        }
        l = i1;
        m = telephonymanager.getNetworkType();
        n = telephonymanager.getPhoneType();
        o = audiomanager.getRingerMode();
        p = audiomanager.getStreamVolume(2);
        q = displaymetrics.density;
        r = displaymetrics.widthPixels;
        s = displaymetrics.heightPixels;
    }

    private static ResolveInfo a(PackageManager packagemanager, String s1)
    {
        return packagemanager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(s1)), 0x10000);
    }

    private static String a(PackageManager packagemanager)
    {
        Object obj = a(packagemanager, "market://details?id=com.google.android.gms.ads");
        if (obj != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        if ((obj = ((ResolveInfo) (obj)).activityInfo) == null) goto _L1; else goto _L3
_L3:
        try
        {
            packagemanager = packagemanager.getPackageInfo(((ActivityInfo) (obj)).packageName, 0);
        }
        // Misplaced declaration of an exception variable
        catch (PackageManager packagemanager)
        {
            return null;
        }
        if (packagemanager == null) goto _L1; else goto _L4
_L4:
        packagemanager = (new StringBuilder()).append(((PackageInfo) (packagemanager)).versionCode).append(".").append(((ActivityInfo) (obj)).packageName).toString();
        return packagemanager;
    }
}
