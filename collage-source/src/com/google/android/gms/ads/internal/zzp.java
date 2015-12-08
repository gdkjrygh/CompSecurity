// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.zze;
import com.google.android.gms.ads.internal.purchase.zzi;
import com.google.android.gms.ads.internal.request.zza;
import com.google.android.gms.internal.av;
import com.google.android.gms.internal.aw;
import com.google.android.gms.internal.ax;
import com.google.android.gms.internal.bb;
import com.google.android.gms.internal.cr;
import com.google.android.gms.internal.dg;
import com.google.android.gms.internal.fb;
import com.google.android.gms.internal.ft;
import com.google.android.gms.internal.gn;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.gx;
import com.google.android.gms.internal.hb;
import com.google.android.gms.internal.hu;
import com.google.android.gms.internal.ix;
import com.google.android.gms.internal.iy;

public class zzp
{

    private static zzp zzpF;
    private static final Object zzpm = new Object();
    private final zza zzpG = new zza();
    private final com.google.android.gms.ads.internal.overlay.zza zzpH = new com.google.android.gms.ads.internal.overlay.zza();
    private final zze zzpI = new zze();
    private final fb zzpJ = new fb();
    private final gw zzpK = new gw();
    private final hu zzpL = new hu();
    private final gx zzpM;
    private final gn zzpN;
    private final ix zzpO = new iy();
    private final bb zzpP = new bb();
    private final ft zzpQ = new ft();
    private final aw zzpR = new aw();
    private final av zzpS = new av();
    private final ax zzpT = new ax();
    private final zzi zzpU = new zzi();
    private final hb zzpV = new hb();
    private final dg zzpW = new dg();
    private final cr zzpX = new cr();

    protected zzp()
    {
        zzpM = gx.a(android.os.Build.VERSION.SDK_INT);
        zzpN = new gn(zzpK);
    }

    protected static void zza(zzp zzp1)
    {
        synchronized (zzpm)
        {
            zzpF = zzp1;
        }
        return;
        zzp1;
        obj;
        JVM INSTR monitorexit ;
        throw zzp1;
    }

    public static gn zzbA()
    {
        return zzbs().zzpN;
    }

    public static ix zzbB()
    {
        return zzbs().zzpO;
    }

    public static bb zzbC()
    {
        return zzbs().zzpP;
    }

    public static ft zzbD()
    {
        return zzbs().zzpQ;
    }

    public static aw zzbE()
    {
        return zzbs().zzpR;
    }

    public static av zzbF()
    {
        return zzbs().zzpS;
    }

    public static ax zzbG()
    {
        return zzbs().zzpT;
    }

    public static zzi zzbH()
    {
        return zzbs().zzpU;
    }

    public static hb zzbI()
    {
        return zzbs().zzpV;
    }

    public static dg zzbJ()
    {
        return zzbs().zzpW;
    }

    public static cr zzbK()
    {
        return zzbs().zzpX;
    }

    private static zzp zzbs()
    {
        zzp zzp1;
        synchronized (zzpm)
        {
            zzp1 = zzpF;
        }
        return zzp1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static zza zzbt()
    {
        return zzbs().zzpG;
    }

    public static com.google.android.gms.ads.internal.overlay.zza zzbu()
    {
        return zzbs().zzpH;
    }

    public static zze zzbv()
    {
        return zzbs().zzpI;
    }

    public static fb zzbw()
    {
        return zzbs().zzpJ;
    }

    public static gw zzbx()
    {
        return zzbs().zzpK;
    }

    public static hu zzby()
    {
        return zzbs().zzpL;
    }

    public static gx zzbz()
    {
        return zzbs().zzpM;
    }

    static 
    {
        zza(new zzp());
    }
}
