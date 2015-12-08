// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.util.client;

import android.util.Log;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.internal.cx;
import com.google.android.gms.internal.cy;

public final class zzb
{

    public static void e(String s)
    {
        if (zzN(6))
        {
            Log.e("Ads", s);
        }
    }

    public static void v(String s)
    {
        zzN(2);
    }

    public static boolean zzN(int i)
    {
        return (i >= 5 || Log.isLoggable("Ads", i)) && (i != 2 || zzgU());
    }

    public static void zza(String s, Throwable throwable)
    {
        zzN(3);
    }

    public static void zzaF(String s)
    {
        zzN(3);
    }

    public static void zzaG(String s)
    {
        if (zzN(4))
        {
            Log.i("Ads", s);
        }
    }

    public static void zzaH(String s)
    {
        if (zzN(5))
        {
            Log.w("Ads", s);
        }
    }

    public static void zzb(String s, Throwable throwable)
    {
        if (zzN(6))
        {
            Log.e("Ads", s, throwable);
        }
    }

    public static void zzc(String s, Throwable throwable)
    {
        if (zzN(4))
        {
            Log.i("Ads", s, throwable);
        }
    }

    public static void zzd(String s, Throwable throwable)
    {
        if (zzN(5))
        {
            Log.w("Ads", s, throwable);
        }
    }

    public static boolean zzgU()
    {
        com.google.android.gms.internal.cq cq = cy.ab;
        return ((Boolean)zzp.zzbE().a(cq)).booleanValue();
    }
}
