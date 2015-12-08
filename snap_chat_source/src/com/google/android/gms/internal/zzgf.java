// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import di;

// Referenced classes of package com.google.android.gms.internal:
//            zzgb, zzdi, zzdo, zzgo, 
//            zzgq, zzhe, zzdr, zzdk, 
//            zzic

public class zzgf extends zzgb
{

    private zzdr zzlD;
    private zzdk zzsf;
    private zzdi zzvW;
    protected zzdo zzvX;

    zzgf(Context context, zzhe.zza zza, zzic zzic, zzdr zzdr, zzgc.zza zza1)
    {
        super(context, zza, zzic, zza1);
        zzlD = zzdr;
        zzsf = zza.zzyt;
    }

    public void onStop()
    {
        synchronized (zzvM)
        {
            super.onStop();
            if (zzvW != null)
            {
                zzvW.cancel();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void zzg(long l)
    {
        synchronized (zzvM)
        {
            zzvW = new zzdi(mContext, zzvN.zzyy, zzlD, zzsf);
        }
        zzvX = zzvW.zza(l, 60000L);
        switch (zzvX.zzsK)
        {
        default:
            throw new zzgb.zza((new StringBuilder("Unexpected mediation result: ")).append(zzvX.zzsK).toString(), 0);

        case 1: // '\001'
            throw new zzgb.zza("No fill from any mediation ad networks.", 3);

        case 0: // '\0'
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected zzhe zzt(int i)
    {
        zzgo zzgo1 = zzvN.zzyy;
        zzax zzax = zzgo1.zzwn;
        zzic zzic = zzmu;
        java.util.List list = zzvO.zzst;
        java.util.List list1 = zzvO.zzsu;
        java.util.List list2 = zzvO.zzwK;
        int j = zzvO.orientation;
        long l = zzvO.zzsx;
        String s1 = zzgo1.zzwq;
        boolean flag = zzvO.zzwI;
        zzdj zzdj;
        zzds zzds;
        String s;
        zzdm zzdm;
        zzdk zzdk;
        if (zzvX != null)
        {
            zzdj = zzvX.zzsL;
        } else
        {
            zzdj = null;
        }
        if (zzvX != null)
        {
            zzds = zzvX.zzsM;
        } else
        {
            zzds = null;
        }
        if (zzvX != null)
        {
            s = zzvX.zzsN;
        } else
        {
            s = di.getName();
        }
        zzdk = zzsf;
        if (zzvX != null)
        {
            zzdm = zzvX.zzsO;
        } else
        {
            zzdm = null;
        }
        return new zzhe(zzax, zzic, list, i, list1, list2, j, l, s1, flag, zzdj, zzds, s, zzdk, zzdm, zzvO.zzwJ, zzvN.zzlV, zzvO.zzwH, zzvN.zzyv, zzvO.zzwM, zzvO.zzwN, zzvN.zzys, null, zzgo1.zzwD);
    }
}
