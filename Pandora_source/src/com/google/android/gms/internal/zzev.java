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
import com.google.android.gms.ads.internal.client.zzj;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zzh;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//            zzfl

public final class zzev
{

    public final int zzAY;
    public final boolean zzAZ;
    public final boolean zzBa;
    public final String zzBb;
    public final String zzBc;
    public final boolean zzBd = zzj.zzbJ().zzfj();
    public final boolean zzBe;
    public final boolean zzBf;
    public final String zzBg;
    public final String zzBh;
    public final int zzBi;
    public final int zzBj;
    public final int zzBk;
    public final int zzBl;
    public final int zzBm;
    public final int zzBn;
    public final double zzBo;
    public final boolean zzBp;
    public final boolean zzBq;
    public final int zzBr;
    public final int zzzg;
    public final int zzzh;
    public final float zzzi;

    public zzev(Context context)
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
        zzAY = audiomanager.getMode();
        boolean flag;
        if (zza(packagemanager, "geo:0,0?q=donuts") != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzAZ = flag;
        if (zza(packagemanager, "http://www.google.com") != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzBa = flag;
        zzBb = telephonymanager.getNetworkOperator();
        zzBc = locale.getCountry();
        zzBe = audiomanager.isMusicActive();
        zzBf = audiomanager.isSpeakerphoneOn();
        zzBg = locale.getLanguage();
        zzBh = zza(packagemanager);
        zzBi = audiomanager.getStreamVolume(3);
        zzBj = zza(context, connectivitymanager, packagemanager);
        zzBk = telephonymanager.getNetworkType();
        zzBl = telephonymanager.getPhoneType();
        zzBm = audiomanager.getRingerMode();
        zzBn = audiomanager.getStreamVolume(2);
        zzzi = displaymetrics.density;
        zzzg = displaymetrics.widthPixels;
        zzzh = displaymetrics.heightPixels;
        if (intent != null)
        {
            int i = intent.getIntExtra("status", -1);
            int j = intent.getIntExtra("level", -1);
            int k = intent.getIntExtra("scale", -1);
            zzBo = (float)j / (float)k;
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
            zzBp = flag;
        } else
        {
            zzBo = -1D;
            zzBp = false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            zzBq = connectivitymanager.isActiveNetworkMetered();
            if (connectivitymanager.getActiveNetworkInfo() != null)
            {
                zzBr = connectivitymanager.getActiveNetworkInfo().getDetailedState().ordinal();
                return;
            } else
            {
                zzBr = -1;
                return;
            }
        } else
        {
            zzBq = false;
            zzBr = -1;
            return;
        }
    }

    private static int zza(Context context, ConnectivityManager connectivitymanager, PackageManager packagemanager)
    {
label0:
        {
            int i = -2;
            if (zzh.zzaQ().zza(packagemanager, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE"))
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
