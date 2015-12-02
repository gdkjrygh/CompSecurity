// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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

public final class ahu
{

    public final int a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final boolean f = oe.a();
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
    public final double t;
    public final boolean u;
    public final boolean v;
    public final int w;

    public ahu(Context context)
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
        a = audiomanager.getMode();
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
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        d = telephonymanager.getNetworkOperator();
        e = locale.getCountry();
        kx.a();
        g = audiomanager.isMusicActive();
        h = audiomanager.isSpeakerphoneOn();
        i = locale.getLanguage();
        j = a(packagemanager);
        k = audiomanager.getStreamVolume(3);
        l = a(context, connectivitymanager, packagemanager);
        m = telephonymanager.getNetworkType();
        n = telephonymanager.getPhoneType();
        o = audiomanager.getRingerMode();
        p = audiomanager.getStreamVolume(2);
        q = displaymetrics.density;
        r = displaymetrics.widthPixels;
        s = displaymetrics.heightPixels;
        if (intent != null)
        {
            int i1 = intent.getIntExtra("status", -1);
            int j1 = intent.getIntExtra("level", -1);
            int k1 = intent.getIntExtra("scale", -1);
            t = (float)j1 / (float)k1;
            flag = flag1;
            if (i1 != 2)
            {
                if (i1 == 5)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
            }
            u = flag;
        } else
        {
            t = -1D;
            u = false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            v = connectivitymanager.isActiveNetworkMetered();
            if (connectivitymanager.getActiveNetworkInfo() != null)
            {
                w = connectivitymanager.getActiveNetworkInfo().getDetailedState().ordinal();
                return;
            } else
            {
                w = -1;
                return;
            }
        } else
        {
            v = false;
            w = -1;
            return;
        }
    }

    private static int a(Context context, ConnectivityManager connectivitymanager, PackageManager packagemanager)
    {
label0:
        {
            int i1 = -2;
            ot.e();
            if (ajc.a(packagemanager, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE"))
            {
                context = connectivitymanager.getActiveNetworkInfo();
                if (context == null)
                {
                    break label0;
                }
                i1 = context.getType();
            }
            return i1;
        }
        return -1;
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
