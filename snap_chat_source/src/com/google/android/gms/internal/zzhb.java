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
//            zzbe, zzhw, zzab, zzho

public final class zzhb
{

    public final int zzwx;
    public final int zzwy;
    public final float zzwz;
    public final int zzxY;
    public final boolean zzxZ;
    public final boolean zzya;
    public final String zzyb;
    public final String zzyc;
    public final boolean zzyd = zzbe.zzbD().zzeB();
    public final boolean zzye;
    public final boolean zzyf;
    public final String zzyg;
    public final String zzyh;
    public final int zzyi;
    public final int zzyj;
    public final int zzyk;
    public final int zzyl;
    public final int zzym;
    public final int zzyn;
    public final double zzyo;
    public final boolean zzyp;
    public final boolean zzyq;
    public final int zzyr;

    public zzhb(Context context)
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
        zzxY = audiomanager.getMode();
        boolean flag;
        if (zza(packagemanager, "geo:0,0?q=donuts") != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzxZ = flag;
        if (zza(packagemanager, "http://www.google.com") != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzya = flag;
        zzyb = telephonymanager.getNetworkOperator();
        zzyc = locale.getCountry();
        zzye = audiomanager.isMusicActive();
        zzyf = audiomanager.isSpeakerphoneOn();
        zzyg = locale.getLanguage();
        zzyh = zza(packagemanager);
        zzyi = audiomanager.getStreamVolume(3);
        zzyj = zza(context, connectivitymanager, packagemanager);
        zzyk = telephonymanager.getNetworkType();
        zzyl = telephonymanager.getPhoneType();
        zzym = audiomanager.getRingerMode();
        zzyn = audiomanager.getStreamVolume(2);
        zzwz = displaymetrics.density;
        zzwx = displaymetrics.widthPixels;
        zzwy = displaymetrics.heightPixels;
        if (intent != null)
        {
            int i = intent.getIntExtra("status", -1);
            int j = intent.getIntExtra("level", -1);
            int k = intent.getIntExtra("scale", -1);
            zzyo = (float)j / (float)k;
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
            zzyp = flag;
        } else
        {
            zzyo = -1D;
            zzyp = false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            zzyq = connectivitymanager.isActiveNetworkMetered();
            if (connectivitymanager.getActiveNetworkInfo() != null)
            {
                zzyr = connectivitymanager.getActiveNetworkInfo().getDetailedState().ordinal();
                return;
            } else
            {
                zzyr = -1;
                return;
            }
        } else
        {
            zzyq = false;
            zzyr = -1;
            return;
        }
    }

    private static int zza(Context context, ConnectivityManager connectivitymanager, PackageManager packagemanager)
    {
label0:
        {
            int i = -2;
            if (zzab.zzaM().zza(packagemanager, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE"))
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

    private static ResolveInfo zza(PackageManager packagemanager, String s)
    {
        return packagemanager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)), 0x10000);
    }

    private static String zza(PackageManager packagemanager)
    {
        Object obj = zza(packagemanager, "market://details?id=com.google.android.gms.ads");
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
