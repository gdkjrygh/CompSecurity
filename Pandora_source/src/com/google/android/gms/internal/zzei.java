// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import p.br.a;

// Referenced classes of package com.google.android.gms.internal:
//            zzee, zzci, zzco, zzfa, 
//            zzcr, zzck, zzgd

public class zzei extends zzee
{

    private zzcr zzmv;
    private zzck zzum;
    private zzci zzyq;
    protected zzco zzyr;

    zzei(Context context, zzfa.zza zza, zzgd zzgd, zzcr zzcr, zzef.zza zza1)
    {
        super(context, zza, zzgd, zza1);
        zzmv = zzcr;
        zzum = zza.zzBt;
    }

    public void onStop()
    {
        synchronized (zzyg)
        {
            super.onStop();
            if (zzyq != null)
            {
                zzyq.cancel();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void zzg(long l)
        throws zzee.zza
    {
        synchronized (zzyg)
        {
            zzyq = new zzci(mContext, zzyh.zzBy, zzmv, zzum);
        }
        zzyr = zzyq.zza(l, 60000L);
        switch (zzyr.zzuT)
        {
        default:
            throw new zzee.zza((new StringBuilder()).append("Unexpected mediation result: ").append(zzyr.zzuT).toString(), 0);

        case 1: // '\001'
            throw new zzee.zza("No fill from any mediation ad networks.", 3);

        case 0: // '\0'
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected zzfa zzt(int i)
    {
        AdRequestInfoParcel adrequestinfoparcel = zzyh.zzBy;
        com.google.android.gms.ads.internal.client.AdRequestParcel adrequestparcel = adrequestinfoparcel.zzyW;
        zzgd zzgd = zznp;
        java.util.List list = zzyi.zzuC;
        java.util.List list1 = zzyi.zzuD;
        java.util.List list2 = zzyi.zzzv;
        int j = zzyi.orientation;
        long l = zzyi.zzuG;
        String s1 = adrequestinfoparcel.zzyZ;
        boolean flag = zzyi.zzzt;
        zzcj zzcj;
        zzcs zzcs;
        String s;
        zzcm zzcm;
        zzck zzck;
        if (zzyr != null)
        {
            zzcj = zzyr.zzuU;
        } else
        {
            zzcj = null;
        }
        if (zzyr != null)
        {
            zzcs = zzyr.zzuV;
        } else
        {
            zzcs = null;
        }
        if (zzyr != null)
        {
            s = zzyr.zzuW;
        } else
        {
            s = p/br/a.getName();
        }
        zzck = zzum;
        if (zzyr != null)
        {
            zzcm = zzyr.zzuX;
        } else
        {
            zzcm = null;
        }
        return new zzfa(adrequestparcel, zzgd, list, i, list1, list2, j, l, s1, flag, zzcj, zzcs, s, zzck, zzcm, zzyi.zzzu, zzyh.zzmP, zzyi.zzzs, zzyh.zzBv, zzyi.zzzx, zzyi.zzzy, zzyh.zzBs, null, adrequestinfoparcel.zzzm);
    }
}
