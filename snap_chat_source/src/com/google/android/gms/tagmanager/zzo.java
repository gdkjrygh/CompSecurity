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
import com.google.android.gms.internal.zzlv;
import com.google.android.gms.internal.zzlx;
import com.google.android.gms.internal.zzvg;
import com.google.android.gms.internal.zzvk;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzca, zzcm, zzcl, zzbd, 
//            zzr, zzbf, zzn, TagManager, 
//            zzcc, ContainerHolder, Container

public class zzo extends AbstractPendingResult
{
    class zzd
        implements zzn.zza
    {

        final zzo zzaxX;

        public void zzcQ(String s)
        {
            zzaxX.zzcQ(s);
        }

        public String zzsK()
        {
            return zzaxX.zzsK();
        }

        public void zzsM()
        {
            if (zzo.zze(zzaxX).zzgv())
            {
                zzo.zza(zzaxX, 0L);
            }
        }

        private zzd()
        {
            zzaxX = zzo.this;
            super();
        }

    }

    static interface zze
        extends Releasable
    {

        public abstract void zzcT(String s);

        public abstract void zze(long l, String s);
    }

    static interface zzf
        extends Releasable
    {
    }


    private final Context mContext;
    private final Looper zzMc;
    private final TagManager zzaxI;
    private final zzd zzaxL;
    private final zzcc zzaxM;
    private final int zzaxN;
    private zzf zzaxO;
    private zzvg zzaxP;
    private volatile zzn zzaxQ;
    private com.google.android.gms.internal.zzc.zzj zzaxS;
    private String zzaxT;
    private zze zzaxU;
    private final String zzaxw;
    private final zzlv zzmW;

    zzo(Context context, TagManager tagmanager, Looper looper, String s, int i, zzf zzf1, zze zze1, 
            zzvg zzvg1, zzlv zzlv, zzcc zzcc)
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
        zzaxI = tagmanager;
        context = looper;
        if (looper == null)
        {
            context = Looper.getMainLooper();
        }
        zzMc = context;
        zzaxw = s;
        zzaxN = i;
        zzaxO = zzf1;
        zzaxU = zze1;
        zzaxP = zzvg1;
        zzaxL = new zzd();
        zzaxS = new com.google.android.gms.internal.zzc.zzj();
        zzmW = zzlv;
        zzaxM = zzcc;
        if (zzsQ())
        {
            zzcQ(zzca.zztx().zztz());
        }
    }

    public zzo(Context context, TagManager tagmanager, Looper looper, String s, int i, zzr zzr1)
    {
        this(context, tagmanager, looper, s, i, ((zzf) (new zzcm(context, s))), ((zze) (new zzcl(context, s, zzr1))), new zzvg(context), zzlx.zzkc(), ((zzcc) (new zzbd(30, 0xdbba0L, 5000L, "refreshing", zzlx.zzkc()))));
        zzaxP.zzdx(zzr1.zzsT());
    }

    private void zzF(long l)
    {
        this;
        JVM INSTR monitorenter ;
        if (zzaxU != null) goto _L2; else goto _L1
_L1:
        zzbf.zzac("Refresh requested, but no network load scheduler.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzaxU.zze(l, zzaxS.zzgt);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    static zzn zza(zzo zzo1, zzn zzn1)
    {
        zzo1.zzaxQ = zzn1;
        return zzn1;
    }

    static String zza(zzo zzo1)
    {
        return zzo1.zzaxw;
    }

    static void zza(zzo zzo1, long l)
    {
        zzo1.zzF(l);
    }

    static TagManager zzb(zzo zzo1)
    {
        return zzo1.zzaxI;
    }

    static Looper zzc(zzo zzo1)
    {
        return zzo1.zzMc;
    }

    static Context zzd(zzo zzo1)
    {
        return zzo1.mContext;
    }

    static zzcc zze(zzo zzo1)
    {
        return zzo1.zzaxM;
    }

    static zzn zzf(zzo zzo1)
    {
        return zzo1.zzaxQ;
    }

    private boolean zzsQ()
    {
        zzca zzca1 = zzca.zztx();
        return (zzca1.zzty() == zzca.zza.zzazC || zzca1.zzty() == zzca.zza.zzazD) && zzaxw.equals(zzca1.getContainerId());
    }

    protected Result createFailedResult(Status status)
    {
        return zzaN(status);
    }

    public void load(String s)
    {
        Integer integer;
        if (zzaxN != -1)
        {
            integer = Integer.valueOf(zzaxN);
        } else
        {
            integer = null;
        }
        zzaxP.zza(zzaxw, integer, s, new com.google.android.gms.internal.zzvg.zza(s) {

            final String zzaxW;
            final zzo zzaxX;

            public void zza(zzvk zzvk1)
            {
                if (zzvk1.getStatus() != Status.zzNo)
                {
                    zzbf.zzZ((new StringBuilder("Load request failed for the container ")).append(zzo.zza(zzaxX)).toString());
                    zzaxX.setResult(zzaxX.zzaN(Status.zzNq));
                    return;
                }
                com.google.android.gms.internal.zzvl.zzc zzc1 = zzvk1.zzuo().zzus();
                if (zzc1 == null)
                {
                    zzbf.zzZ("Response doesn't have the requested container");
                    zzaxX.setResult(zzaxX.zzaN(new Status(8, "Response doesn't have the requested container", null)));
                    return;
                } else
                {
                    long l = zzvk1.zzuo().zzut();
                    zzo.zza(zzaxX, new zzn(zzo.zzb(zzaxX), zzo.zzc(zzaxX), new Container(zzo.zzd(zzaxX), zzo.zzb(zzaxX).getDataLayer(), zzo.zza(zzaxX), l, zzc1), new zzn.zza(this) {

                        final _cls1 zzaxY;

                        public void zzcQ(String s)
                        {
                            zzaxY.zzaxX.zzcQ(s);
                        }

                        public String zzsK()
                        {
                            return zzaxY.zzaxX.zzsK();
                        }

                        public void zzsM()
                        {
                            if (zzo.zze(zzaxY.zzaxX).zzgv())
                            {
                                zzaxY.zzaxX.load(zzaxY.zzaxW);
                            }
                        }

            
            {
                zzaxY = _pcls1;
                super();
            }
                    }));
                    zzaxX.setResult(zzo.zzf(zzaxX));
                    return;
                }
            }

            
            {
                zzaxX = zzo.this;
                zzaxW = s;
                super();
            }
        });
    }

    protected ContainerHolder zzaN(Status status)
    {
        if (zzaxQ != null)
        {
            return zzaxQ;
        }
        if (status == Status.zzNr)
        {
            zzbf.zzZ("timer expired: setting result to failure");
        }
        return new zzn(status);
    }

    void zzcQ(String s)
    {
        this;
        JVM INSTR monitorenter ;
        zzaxT = s;
        if (zzaxU != null)
        {
            zzaxU.zzcT(s);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    String zzsK()
    {
        this;
        JVM INSTR monitorenter ;
        String s = zzaxT;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }
}
