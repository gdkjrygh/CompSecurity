// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractPendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzlb;
import com.google.android.gms.internal.zzld;
import com.google.android.gms.internal.zzqa;
import com.google.android.gms.internal.zzqe;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcb, zzcn, zzcm, zzbe, 
//            zzs, zzbg, zzo, TagManager, 
//            zzcd, ContainerHolder, Container

public class zzp extends AbstractPendingResult
{
    private class zzd
        implements zzo.zza
    {

        final zzp zzaKZ;

        private zzd()
        {
            zzaKZ = zzp.this;
            super();
        }

    }

    static interface zze
        extends Releasable
    {

        public abstract void zzem(String s);
    }

    static interface zzf
        extends Releasable
    {
    }


    private final Context mContext;
    private final Looper zzWt;
    private final TagManager zzaKK;
    private final zzd zzaKN;
    private final zzcd zzaKO;
    private final int zzaKP;
    private zzf zzaKQ;
    private zzqa zzaKR;
    private volatile zzo zzaKS;
    private com.google.android.gms.internal.zzaf.zzj zzaKU;
    private String zzaKV;
    private zze zzaKW;
    private final String zzaKy;
    private final zzlb zzpw;

    zzp(Context context, TagManager tagmanager, Looper looper, String s, int i, zzf zzf1, zze zze1, 
            zzqa zzqa1, zzlb zzlb, zzcd zzcd)
    {
        Looper looper1;
        if (looper == null)
        {
            looper1 = Looper.getMainLooper();
        } else
        {
            looper1 = looper;
        }
        super(looper1);
        mContext = context;
        zzaKK = tagmanager;
        context = looper;
        if (looper == null)
        {
            context = Looper.getMainLooper();
        }
        zzWt = context;
        zzaKy = s;
        zzaKP = i;
        zzaKQ = zzf1;
        zzaKW = zze1;
        zzaKR = zzqa1;
        zzaKN = new zzd();
        zzaKU = new com.google.android.gms.internal.zzaf.zzj();
        zzpw = zzlb;
        zzaKO = zzcd;
        if (zzyu())
        {
            zzej(zzcb.zzzf().zzzh());
        }
    }

    public zzp(Context context, TagManager tagmanager, Looper looper, String s, int i, zzs zzs1)
    {
        this(context, tagmanager, looper, s, i, ((zzf) (new zzcn(context, s))), ((zze) (new zzcm(context, s, zzs1))), new zzqa(context), zzld.zzoQ(), ((zzcd) (new zzbe(30, 0xdbba0L, 5000L, "refreshing", zzld.zzoQ()))));
        zzaKR.zzeU(zzs1.zzyx());
    }

    static zzo zza(zzp zzp1, zzo zzo1)
    {
        zzp1.zzaKS = zzo1;
        return zzo1;
    }

    static String zza(zzp zzp1)
    {
        return zzp1.zzaKy;
    }

    static TagManager zzb(zzp zzp1)
    {
        return zzp1.zzaKK;
    }

    static Looper zzc(zzp zzp1)
    {
        return zzp1.zzWt;
    }

    static Context zzd(zzp zzp1)
    {
        return zzp1.mContext;
    }

    static zzo zzf(zzp zzp1)
    {
        return zzp1.zzaKS;
    }

    private boolean zzyu()
    {
        zzcb zzcb1 = zzcb.zzzf();
        return (zzcb1.zzzg() == zzcb.zza.zzaMJ || zzcb1.zzzg() == zzcb.zza.zzaMK) && zzaKy.equals(zzcb1.getContainerId());
    }

    protected Result createFailedResult(Status status)
    {
        return zzaU(status);
    }

    public void load(String s)
    {
        Integer integer;
        if (zzaKP != -1)
        {
            integer = Integer.valueOf(zzaKP);
        } else
        {
            integer = null;
        }
        zzaKR.zza(zzaKy, integer, s, new com.google.android.gms.internal.zzqa.zza(s) {

            final String zzaKY;
            final zzp zzaKZ;

            public void zza(zzqe zzqe1)
            {
                if (zzqe1.getStatus() != Status.zzXP)
                {
                    zzbg.zzaz((new StringBuilder()).append("Load request failed for the container ").append(zzp.zza(zzaKZ)).toString());
                    zzaKZ.setResult(zzaKZ.zzaU(Status.zzXR));
                    return;
                }
                com.google.android.gms.internal.zzqf.zzc zzc1 = zzqe1.zzAg().zzAk();
                if (zzc1 == null)
                {
                    zzbg.zzaz("Response doesn't have the requested container");
                    zzaKZ.setResult(zzaKZ.zzaU(new Status(8, "Response doesn't have the requested container", null)));
                    return;
                } else
                {
                    long l = zzqe1.zzAg().zzAl();
                    zzp.zza(zzaKZ, new zzo(zzp.zzb(zzaKZ), zzp.zzc(zzaKZ), new Container(zzp.zzd(zzaKZ), zzp.zzb(zzaKZ).getDataLayer(), zzp.zza(zzaKZ), l, zzc1), new zzo.zza(this) {

                        final _cls1 zzaLa;

            
            {
                zzaLa = _pcls1;
                super();
            }
                    }));
                    zzaKZ.setResult(zzp.zzf(zzaKZ));
                    return;
                }
            }

            
            {
                zzaKZ = zzp.this;
                zzaKY = s;
                super();
            }
        });
    }

    protected ContainerHolder zzaU(Status status)
    {
        if (zzaKS != null)
        {
            return zzaKS;
        }
        if (status == Status.zzXS)
        {
            zzbg.zzaz("timer expired: setting result to failure");
        }
        return new zzo(status);
    }

    void zzej(String s)
    {
        this;
        JVM INSTR monitorenter ;
        zzaKV = s;
        if (zzaKW != null)
        {
            zzaKW.zzem(s);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }
}
