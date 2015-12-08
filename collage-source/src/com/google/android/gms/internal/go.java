// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.client.zzb;

public class go
{

    long a;
    long b;
    int c;
    final String d;
    int e;
    int f;
    private final Object g = new Object();

    public go(String s)
    {
        a = -1L;
        b = -1L;
        c = -1;
        e = 0;
        f = 0;
        d = s;
    }

    public static boolean a(Context context)
    {
        ComponentName componentname;
        int i;
        i = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (i == 0)
        {
            zzb.zzaD("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        componentname = new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity");
        if (i == context.getPackageManager().getActivityInfo(componentname, 0).theme)
        {
            return true;
        }
        try
        {
            zzb.zzaD("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzb.zzaE("Fail to fetch AdActivity theme");
            zzb.zzaD("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        return false;
    }

    public long a()
    {
        return b;
    }

    public Bundle a(Context context, String s)
    {
        Bundle bundle;
        synchronized (g)
        {
            bundle = new Bundle();
            bundle.putString("session_id", d);
            bundle.putLong("basets", b);
            bundle.putLong("currts", a);
            bundle.putString("seq_num", s);
            bundle.putInt("preqs", c);
            bundle.putInt("pclick", e);
            bundle.putInt("pimp", f);
            bundle.putBoolean("support_transparent_background", a(context));
        }
        return bundle;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void a(AdRequestParcel adrequestparcel, long l)
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        if (b != -1L)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        b = l;
        a = b;
_L2:
        if (adrequestparcel.extras == null || adrequestparcel.extras.getInt("gw", 2) != 1)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        return;
        a = l;
        if (true) goto _L2; else goto _L1
_L1:
        adrequestparcel;
        obj;
        JVM INSTR monitorexit ;
        throw adrequestparcel;
        c = c + 1;
        obj;
        JVM INSTR monitorexit ;
    }

    public void b()
    {
        synchronized (g)
        {
            e = e + 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void c()
    {
        synchronized (g)
        {
            f = f + 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
