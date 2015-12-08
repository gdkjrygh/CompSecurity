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
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//            ny, qa

public final class nz
{

    private int a;
    private boolean b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private String g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private int l;
    private double m;
    private boolean n;
    private String o;
    private boolean p;
    private boolean q;
    private String r;
    private boolean s;
    private boolean t;
    private String u;
    private String v;
    private float w;
    private int x;
    private int y;

    public nz(Context context)
    {
        boolean flag1 = true;
        super();
        PackageManager packagemanager = context.getPackageManager();
        a(context);
        a(context, packagemanager);
        b(context);
        Locale locale = Locale.getDefault();
        boolean flag;
        if (a(packagemanager, "geo:0,0?q=donuts") != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p = flag;
        if (a(packagemanager, "http://www.google.com") != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        q = flag;
        r = locale.getCountry();
        s = zzl.zzcF().zzgS();
        t = GooglePlayServicesUtil.zzag(context);
        u = locale.getLanguage();
        v = a(packagemanager);
        context = context.getResources();
        if (context != null)
        {
            if ((context = context.getDisplayMetrics()) != null)
            {
                w = ((DisplayMetrics) (context)).density;
                x = ((DisplayMetrics) (context)).widthPixels;
                y = ((DisplayMetrics) (context)).heightPixels;
                return;
            }
        }
    }

    public nz(Context context, ny ny1)
    {
        PackageManager packagemanager = context.getPackageManager();
        a(context);
        a(context, packagemanager);
        b(context);
        o = Build.FINGERPRINT;
        p = ny1.b;
        q = ny1.c;
        r = ny1.e;
        s = ny1.f;
        t = ny1.g;
        u = ny1.j;
        v = ny1.k;
        w = ny1.r;
        x = ny1.s;
        y = ny1.t;
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

    private void a(Context context)
    {
        context = (AudioManager)context.getSystemService("audio");
        a = context.getMode();
        b = context.isMusicActive();
        c = context.isSpeakerphoneOn();
        d = context.getStreamVolume(3);
        e = context.getRingerMode();
        f = context.getStreamVolume(2);
    }

    private void a(Context context, PackageManager packagemanager)
    {
        TelephonyManager telephonymanager = (TelephonyManager)context.getSystemService("phone");
        ConnectivityManager connectivitymanager = (ConnectivityManager)context.getSystemService("connectivity");
        g = telephonymanager.getNetworkOperator();
        i = telephonymanager.getNetworkType();
        j = telephonymanager.getPhoneType();
        h = -2;
        k = false;
        l = -1;
        zzp.zzbv();
        if (qa.a(packagemanager, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE"))
        {
            context = connectivitymanager.getActiveNetworkInfo();
            if (context != null)
            {
                h = context.getType();
                l = context.getDetailedState().ordinal();
            } else
            {
                h = -1;
            }
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                k = connectivitymanager.isActiveNetworkMetered();
            }
        }
    }

    private void b(Context context)
    {
        boolean flag = false;
        context = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (context != null)
        {
            int i1 = context.getIntExtra("status", -1);
            int j1 = context.getIntExtra("level", -1);
            int k1 = context.getIntExtra("scale", -1);
            m = (float)j1 / (float)k1;
            if (i1 == 2 || i1 == 5)
            {
                flag = true;
            }
            n = flag;
            return;
        } else
        {
            m = -1D;
            n = false;
            return;
        }
    }

    public final ny a()
    {
        return new ny(a, p, q, g, r, s, t, b, c, u, v, d, h, i, j, e, f, w, x, y, m, n, k, l, o);
    }
}
