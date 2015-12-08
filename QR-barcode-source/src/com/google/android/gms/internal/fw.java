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
//            gr, gj

public final class fw
{

    public final int uS;
    public final boolean uT;
    public final boolean uU;
    public final String uV;
    public final String uW;
    public final boolean uX = gr.dr();
    public final boolean uY;
    public final boolean uZ;
    public final String va;
    public final String vb;
    public final int vc;
    public final int vd;
    public final int ve;
    public final int vf;
    public final int vg;
    public final int vh;
    public final float vi;
    public final int vj;
    public final int vk;
    public final double vl;
    public final boolean vm;
    public final boolean vn;
    public final int vo;

    public fw(Context context)
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
        uS = audiomanager.getMode();
        boolean flag;
        if (a(packagemanager, "geo:0,0?q=donuts") != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        uT = flag;
        if (a(packagemanager, "http://www.google.com") != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        uU = flag;
        uV = telephonymanager.getNetworkOperator();
        uW = locale.getCountry();
        uY = audiomanager.isMusicActive();
        uZ = audiomanager.isSpeakerphoneOn();
        va = locale.getLanguage();
        vb = a(packagemanager);
        vc = audiomanager.getStreamVolume(3);
        vd = a(context, connectivitymanager, packagemanager);
        ve = telephonymanager.getNetworkType();
        vf = telephonymanager.getPhoneType();
        vg = audiomanager.getRingerMode();
        vh = audiomanager.getStreamVolume(2);
        vi = displaymetrics.density;
        vj = displaymetrics.widthPixels;
        vk = displaymetrics.heightPixels;
        if (intent != null)
        {
            int i = intent.getIntExtra("status", -1);
            int j = intent.getIntExtra("level", -1);
            int k = intent.getIntExtra("scale", -1);
            vl = (float)j / (float)k;
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
            vm = flag;
        } else
        {
            vl = -1D;
            vm = false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            vn = connectivitymanager.isActiveNetworkMetered();
            if (connectivitymanager.getActiveNetworkInfo() != null)
            {
                vo = connectivitymanager.getActiveNetworkInfo().getDetailedState().ordinal();
                return;
            } else
            {
                vo = -1;
                return;
            }
        } else
        {
            vn = false;
            vo = -1;
            return;
        }
    }

    private static int a(Context context, ConnectivityManager connectivitymanager, PackageManager packagemanager)
    {
label0:
        {
            int i = -2;
            if (gj.a(packagemanager, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE"))
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
