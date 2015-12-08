// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.purchase.zzi;
import com.google.android.gms.ads.internal.request.zza;
import com.google.android.gms.internal.zzaq;
import com.google.android.gms.internal.zzar;
import com.google.android.gms.internal.zzas;
import com.google.android.gms.internal.zzaw;
import com.google.android.gms.internal.zzcc;
import com.google.android.gms.internal.zzcp;
import com.google.android.gms.internal.zzef;
import com.google.android.gms.internal.zzfc;
import com.google.android.gms.internal.zzfl;
import com.google.android.gms.internal.zzfm;
import com.google.android.gms.internal.zzgf;
import com.google.android.gms.internal.zzht;
import com.google.android.gms.internal.zzhv;

public class zzh
{

    private static zzh zznI;
    private static final Object zznu = new Object();
    private final zza zznJ = new zza();
    private final com.google.android.gms.ads.internal.overlay.zza zznK = new com.google.android.gms.ads.internal.overlay.zza();
    private final zzd zznL = new zzd();
    private final zzef zznM = new zzef();
    private final zzfl zznN = new zzfl();
    private final zzgf zznO = new zzgf();
    private final zzfm zznP;
    private final zzfc zznQ;
    private final zzht zznR = new zzhv();
    private final zzaw zznS = new zzaw();
    private final zzar zznT = new zzar();
    private final zzaq zznU = new zzaq();
    private final zzas zznV = new zzas();
    private final zzi zznW = new zzi();
    private final zzcp zznX = new zzcp();
    private final zzcc zznY = new zzcc();

    protected zzh()
    {
        zznP = zzfm.zzB(android.os.Build.VERSION.SDK_INT);
        zznQ = new zzfc(zznN);
    }

    protected static void zza(zzh zzh1)
    {
        synchronized (zznu)
        {
            zznI = zzh1;
        }
        return;
        zzh1;
        obj;
        JVM INSTR monitorexit ;
        throw zzh1;
    }

    private static zzh zzaL()
    {
        zzh zzh1;
        synchronized (zznu)
        {
            zzh1 = zznI;
        }
        return zzh1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static zza zzaM()
    {
        return zzaL().zznJ;
    }

    public static com.google.android.gms.ads.internal.overlay.zza zzaN()
    {
        return zzaL().zznK;
    }

    public static zzd zzaO()
    {
        return zzaL().zznL;
    }

    public static zzef zzaP()
    {
        return zzaL().zznM;
    }

    public static zzfl zzaQ()
    {
        return zzaL().zznN;
    }

    public static zzgf zzaR()
    {
        return zzaL().zznO;
    }

    public static zzfm zzaS()
    {
        return zzaL().zznP;
    }

    public static zzfc zzaT()
    {
        return zzaL().zznQ;
    }

    public static zzht zzaU()
    {
        return zzaL().zznR;
    }

    public static zzaw zzaV()
    {
        return zzaL().zznS;
    }

    public static zzar zzaW()
    {
        return zzaL().zznT;
    }

    public static zzaq zzaX()
    {
        return zzaL().zznU;
    }

    public static zzas zzaY()
    {
        return zzaL().zznV;
    }

    public static zzi zzaZ()
    {
        return zzaL().zznW;
    }

    public static zzcp zzba()
    {
        return zzaL().zznX;
    }

    public static zzcc zzbb()
    {
        return zzaL().zznY;
    }

    static 
    {
        zza(new zzh());
    }
}
