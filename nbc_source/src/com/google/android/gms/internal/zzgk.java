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
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.zzo;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//            zzhl

public final class zzgk
{
    public static final class zza
    {

        private int zzCw;
        private int zzCx;
        private float zzCy;
        private int zzEA;
        private int zzEB;
        private int zzEC;
        private double zzED;
        private boolean zzEE;
        private boolean zzEF;
        private int zzEG;
        private int zzEn;
        private boolean zzEo;
        private boolean zzEp;
        private String zzEq;
        private String zzEr;
        private boolean zzEs;
        private boolean zzEt;
        private boolean zzEu;
        private String zzEv;
        private String zzEw;
        private int zzEx;
        private int zzEy;
        private int zzEz;

        private void zzA(Context context)
        {
            context = (AudioManager)context.getSystemService("audio");
            zzEn = context.getMode();
            zzEt = context.isMusicActive();
            zzEu = context.isSpeakerphoneOn();
            zzEx = context.getStreamVolume(3);
            zzEB = context.getRingerMode();
            zzEC = context.getStreamVolume(2);
        }

        private void zzB(Context context)
        {
            boolean flag = false;
            context = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (context != null)
            {
                int i = context.getIntExtra("status", -1);
                int j = context.getIntExtra("level", -1);
                int k = context.getIntExtra("scale", -1);
                zzED = (float)j / (float)k;
                if (i == 2 || i == 5)
                {
                    flag = true;
                }
                zzEE = flag;
                return;
            } else
            {
                zzED = -1D;
                zzEE = false;
                return;
            }
        }

        private static int zza(Context context, ConnectivityManager connectivitymanager, PackageManager packagemanager)
        {
label0:
            {
                int i = -2;
                if (zzo.zzbv().zza(packagemanager, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE"))
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

        private void zza(Context context, PackageManager packagemanager)
        {
            TelephonyManager telephonymanager = (TelephonyManager)context.getSystemService("phone");
            ConnectivityManager connectivitymanager = (ConnectivityManager)context.getSystemService("connectivity");
            zzEq = telephonymanager.getNetworkOperator();
            zzEy = zza(context, connectivitymanager, packagemanager);
            zzEz = telephonymanager.getNetworkType();
            zzEA = telephonymanager.getPhoneType();
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                zzEF = connectivitymanager.isActiveNetworkMetered();
                if (connectivitymanager.getActiveNetworkInfo() != null)
                {
                    zzEG = connectivitymanager.getActiveNetworkInfo().getDetailedState().ordinal();
                    return;
                } else
                {
                    zzEG = -1;
                    return;
                }
            } else
            {
                zzEF = false;
                zzEG = -1;
                return;
            }
        }

        public zzgk zzfJ()
        {
            return new zzgk(zzEn, zzEo, zzEp, zzEq, zzEr, zzEs, zzEt, zzEu, zzEv, zzEw, zzEx, zzEy, zzEz, zzEA, zzEB, zzEC, zzCy, zzCw, zzCx, zzED, zzEE, zzEF, zzEG);
        }

        public zza(Context context)
        {
            boolean flag1 = true;
            super();
            PackageManager packagemanager = context.getPackageManager();
            zzA(context);
            zza(context, packagemanager);
            zzB(context);
            context = context.getResources().getDisplayMetrics();
            Locale locale = Locale.getDefault();
            boolean flag;
            if (zza(packagemanager, "geo:0,0?q=donuts") != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzEo = flag;
            if (zza(packagemanager, "http://www.google.com") != null)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            zzEp = flag;
            zzEr = locale.getCountry();
            zzEs = zzk.zzcA().zzgv();
            zzEv = locale.getLanguage();
            zzEw = zza(packagemanager);
            zzCy = ((DisplayMetrics) (context)).density;
            zzCw = ((DisplayMetrics) (context)).widthPixels;
            zzCx = ((DisplayMetrics) (context)).heightPixels;
        }

        public zza(Context context, zzgk zzgk1)
        {
            PackageManager packagemanager = context.getPackageManager();
            zzA(context);
            zza(context, packagemanager);
            zzB(context);
            zzEo = zzgk1.zzEo;
            zzEp = zzgk1.zzEp;
            zzEr = zzgk1.zzEr;
            zzEs = zzgk1.zzEs;
            zzEv = zzgk1.zzEv;
            zzEw = zzgk1.zzEw;
            zzCy = zzgk1.zzCy;
            zzCw = zzgk1.zzCw;
            zzCx = zzgk1.zzCx;
        }
    }


    public final int zzCw;
    public final int zzCx;
    public final float zzCy;
    public final int zzEA;
    public final int zzEB;
    public final int zzEC;
    public final double zzED;
    public final boolean zzEE;
    public final boolean zzEF;
    public final int zzEG;
    public final int zzEn;
    public final boolean zzEo;
    public final boolean zzEp;
    public final String zzEq;
    public final String zzEr;
    public final boolean zzEs;
    public final boolean zzEt;
    public final boolean zzEu;
    public final String zzEv;
    public final String zzEw;
    public final int zzEx;
    public final int zzEy;
    public final int zzEz;

    zzgk(int i, boolean flag, boolean flag1, String s, String s1, boolean flag2, boolean flag3, 
            boolean flag4, String s2, String s3, int j, int k, int l, int i1, 
            int j1, int k1, float f, int l1, int i2, double d, 
            boolean flag5, boolean flag6, int j2)
    {
        zzEn = i;
        zzEo = flag;
        zzEp = flag1;
        zzEq = s;
        zzEr = s1;
        zzEs = flag2;
        zzEt = flag3;
        zzEu = flag4;
        zzEv = s2;
        zzEw = s3;
        zzEx = j;
        zzEy = k;
        zzEz = l;
        zzEA = i1;
        zzEB = j1;
        zzEC = k1;
        zzCy = f;
        zzCw = l1;
        zzCx = i2;
        zzED = d;
        zzEE = flag5;
        zzEF = flag6;
        zzEG = j2;
    }
}
