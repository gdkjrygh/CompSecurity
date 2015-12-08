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
//            gq, gi

public final class fv
{

    public final boolean vA;
    public final boolean vB;
    public final int vC;
    public final int vg;
    public final boolean vh;
    public final boolean vi;
    public final String vj;
    public final String vk;
    public final boolean vl = gq.dA();
    public final boolean vm;
    public final boolean vn;
    public final String vo;
    public final String vp;
    public final int vq;
    public final int vr;
    public final int vs;
    public final int vt;
    public final int vu;
    public final int vv;
    public final float vw;
    public final int vx;
    public final int vy;
    public final double vz;

    public fv(Context context)
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
        vg = audiomanager.getMode();
        boolean flag;
        if (a(packagemanager, "geo:0,0?q=donuts") != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        vh = flag;
        if (a(packagemanager, "http://www.google.com") != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        vi = flag;
        vj = telephonymanager.getNetworkOperator();
        vk = locale.getCountry();
        vm = audiomanager.isMusicActive();
        vn = audiomanager.isSpeakerphoneOn();
        vo = locale.getLanguage();
        vp = a(packagemanager);
        vq = audiomanager.getStreamVolume(3);
        vr = a(context, connectivitymanager, packagemanager);
        vs = telephonymanager.getNetworkType();
        vt = telephonymanager.getPhoneType();
        vu = audiomanager.getRingerMode();
        vv = audiomanager.getStreamVolume(2);
        vw = displaymetrics.density;
        vx = displaymetrics.widthPixels;
        vy = displaymetrics.heightPixels;
        if (intent != null)
        {
            int i = intent.getIntExtra("status", -1);
            int j = intent.getIntExtra("level", -1);
            int k = intent.getIntExtra("scale", -1);
            vz = (float)j / (float)k;
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
            vA = flag;
        } else
        {
            vz = -1D;
            vA = false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            vB = connectivitymanager.isActiveNetworkMetered();
            if (connectivitymanager.getActiveNetworkInfo() != null)
            {
                vC = connectivitymanager.getActiveNetworkInfo().getDetailedState().ordinal();
                return;
            } else
            {
                vC = -1;
                return;
            }
        } else
        {
            vB = false;
            vC = -1;
            return;
        }
    }

    private static int a(Context context, ConnectivityManager connectivitymanager, PackageManager packagemanager)
    {
label0:
        {
            int i = -2;
            if (gi.a(packagemanager, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE"))
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
