// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
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
//            et, eo

public final class ec
{

    public final int rb;
    public final boolean rc;
    public final boolean rd;
    public final String re;
    public final String rf;
    public final boolean rg = et.bV();
    public final boolean rh;
    public final boolean ri;
    public final String rj;
    public final String rk;
    public final int rl;
    public final int rm;
    public final int rn;
    public final int ro;
    public final int rp;
    public final int rq;
    public final float rr;
    public final int rs;
    public final int rt;
    public final double ru;
    public final boolean rv;
    public final boolean rw;
    public final int rx;

    public ec(Context context)
    {
        boolean flag1 = true;
        super();
        AudioManager audiomanager = (AudioManager)context.getSystemService("audio");
        ConnectivityManager connectivitymanager = (ConnectivityManager)context.getSystemService("connectivity");
        DisplayMetrics displaymetrics = context.getResources().getDisplayMetrics();
        Locale locale = Locale.getDefault();
        PackageManager packagemanager = context.getPackageManager();
        TelephonyManager telephonymanager = (TelephonyManager)context.getSystemService("phone");
        Intent intent = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        rb = audiomanager.getMode();
        boolean flag;
        if (a(packagemanager, "geo:0,0?q=donuts") != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        rc = flag;
        if (a(packagemanager, "http://www.google.com") != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        rd = flag;
        re = telephonymanager.getNetworkOperator();
        rf = locale.getCountry();
        rh = audiomanager.isMusicActive();
        ri = audiomanager.isSpeakerphoneOn();
        rj = locale.getLanguage();
        rk = a(packagemanager);
        rl = audiomanager.getStreamVolume(3);
        rm = a(context, connectivitymanager, packagemanager);
        rn = telephonymanager.getNetworkType();
        ro = telephonymanager.getPhoneType();
        rp = audiomanager.getRingerMode();
        rq = audiomanager.getStreamVolume(2);
        rr = displaymetrics.density;
        rs = displaymetrics.widthPixels;
        rt = displaymetrics.heightPixels;
        if (intent != null)
        {
            int i = intent.getIntExtra("status", -1);
            int j = intent.getIntExtra("level", -1);
            int k = intent.getIntExtra("scale", -1);
            ru = (float)j / (float)k;
            flag = flag1;
            if (i != 2)
            {
                if (i == 5)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
            }
            rv = flag;
        } else
        {
            ru = -1D;
            rv = false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            rw = connectivitymanager.isActiveNetworkMetered();
            if (connectivitymanager.getActiveNetworkInfo() != null)
            {
                rx = connectivitymanager.getActiveNetworkInfo().getDetailedState().ordinal();
                return;
            } else
            {
                rx = -1;
                return;
            }
        } else
        {
            rw = false;
            rx = -1;
            return;
        }
    }

    private static int a(Context context, ConnectivityManager connectivitymanager, PackageManager packagemanager)
    {
label0:
        {
            int i = -2;
            if (eo.a(packagemanager, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE"))
            {
                context = connectivitymanager.getActiveNetworkInfo();
                if (context == null)
                {
                    break label0;
                }
                i = context.getType();
            }
            return i;
        }
        return -1;
    }

    private static ResolveInfo a(PackageManager packagemanager, String s)
    {
        return packagemanager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)), 0x10000);
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
