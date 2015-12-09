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
import com.google.android.gms.internal.zzht;
import com.google.android.gms.internal.zzhv;
import com.google.android.gms.internal.zzml;
import com.google.android.gms.internal.zzmp;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bj, bi, ad, cn, 
//            ax, zzbg, Container, TagManager, 
//            zzo, az, ContainerHolder, zzbf

public class zzp extends AbstractPendingResult
{
    static interface a
    {

        public abstract boolean a(Container container);
    }

    private class b
        implements zzbf
    {

        final zzp a;

        public void a()
        {
        }

        public void a(com.google.android.gms.internal.zzmi.zza zza1)
        {
            com.google.android.gms.internal.zzc.zzj zzj1;
            if (zza1.zzaGM != null)
            {
                zzj1 = zza1.zzaGM;
            } else
            {
                com.google.android.gms.internal.zzc.zzf zzf1 = zza1.zzhh;
                zzj1 = new com.google.android.gms.internal.zzc.zzj();
                zzj1.zzhh = zzf1;
                zzj1.zzhg = null;
                zzj1.zzhi = zzf1.version;
            }
            zzp.zza(a, zzj1, zza1.zzaGL, true);
        }

        public void a(zzbf.zza zza1)
        {
            if (!zzp.zzh(a))
            {
                zzp.zza(a, 0L);
            }
        }

        public void a(Object obj)
        {
            a((com.google.android.gms.internal.zzmi.zza)obj);
        }

        private b()
        {
            a = zzp.this;
            super();
        }

    }

    private class c
        implements zzbf
    {

        final zzp a;

        public void a()
        {
        }

        public void a(com.google.android.gms.internal.zzc.zzj zzj1)
        {
label0:
            {
                synchronized (a)
                {
                    if (zzj1.zzhh != null)
                    {
                        break MISSING_BLOCK_LABEL_59;
                    }
                    if (zzp.zzi(a).zzhh != null)
                    {
                        break label0;
                    }
                    zzbg.zzak("Current resource is null; network resource is also null");
                    zzp.zza(a, 0x36ee80L);
                }
                return;
            }
            zzj1.zzhh = zzp.zzi(a).zzhh;
            zzp.zza(a, zzj1, zzp.zzg(a).currentTimeMillis(), false);
            zzbg.zzam((new StringBuilder()).append("setting refresh time to current time: ").append(zzp.zzj(a)).toString());
            if (!zzp.zzk(a))
            {
                zzp.zza(a, zzj1);
            }
            zzp1;
            JVM INSTR monitorexit ;
            return;
            zzj1;
            zzp1;
            JVM INSTR monitorexit ;
            throw zzj1;
        }

        public void a(zzbf.zza zza1)
        {
            zza1 = a;
            zza1;
            JVM INSTR monitorenter ;
            if (!a.isReady())
            {
                if (zzp.zzf(a) == null)
                {
                    break MISSING_BLOCK_LABEL_54;
                }
                a.setResult(zzp.zzf(a));
            }
_L2:
            zzp.zza(a, 0x36ee80L);
            return;
            a.setResult(a.zzaO(Status.zzQX));
            if (true) goto _L2; else goto _L1
_L1:
            Exception exception;
            exception;
            zza1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void a(Object obj)
        {
            a((com.google.android.gms.internal.zzc.zzj)obj);
        }

        private c()
        {
            a = zzp.this;
            super();
        }

    }

    private class d
        implements zzo.zza
    {

        final zzp a;

        public void zzdB(String s)
        {
            a.zzdB(s);
        }

        public String zzwu()
        {
            return a.zzwu();
        }

        public void zzww()
        {
            if (zzp.zze(a).a())
            {
                zzp.zza(a, 0L);
            }
        }

        private d()
        {
            a = zzp.this;
            super();
        }

    }

    static interface e
        extends Releasable
    {

        public abstract void a(long l, String s);

        public abstract void a(zzbf zzbf);

        public abstract void a(String s);
    }

    static interface f
        extends Releasable
    {

        public abstract com.google.android.gms.internal.zzmq.zzc a(int i);

        public abstract void a();

        public abstract void a(com.google.android.gms.internal.zzmi.zza zza1);

        public abstract void a(zzbf zzbf);
    }


    private final Context mContext;
    private final Looper zzPx;
    private final az zzaCA;
    private final int zzaCB;
    private f zzaCC;
    private zzml zzaCD;
    private volatile zzo zzaCE;
    private volatile boolean zzaCF;
    private com.google.android.gms.internal.zzc.zzj zzaCG;
    private String zzaCH;
    private e zzaCI;
    private a zzaCJ;
    private final String zzaCk;
    private long zzaCp;
    private final TagManager zzaCw;
    private final d zzaCz;
    private final zzht zznR;

    public zzp(Context context, TagManager tagmanager, Looper looper, String s, int i, cn cn1)
    {
        this(context, tagmanager, looper, s, i, ((f) (new bj(context, s))), ((e) (new bi(context, s, cn1))), new zzml(context), zzhv.zznd(), ((az) (new ad(30, 0xdbba0L, 5000L, "refreshing", zzhv.zznd()))));
        zzaCD.zzem(cn1.a());
    }

    zzp(Context context, TagManager tagmanager, Looper looper, String s, int i, f f1, e e1, 
            zzml zzml1, zzht zzht1, az az)
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
        zzaCw = tagmanager;
        context = looper;
        if (looper == null)
        {
            context = Looper.getMainLooper();
        }
        zzPx = context;
        zzaCk = s;
        zzaCB = i;
        zzaCC = f1;
        zzaCI = e1;
        zzaCD = zzml1;
        zzaCz = new d();
        zzaCG = new com.google.android.gms.internal.zzc.zzj();
        zznR = zzht1;
        zzaCA = az;
        if (zzwA())
        {
            zzdB(ax.a().c());
        }
    }

    private void zzQ(long l)
    {
        this;
        JVM INSTR monitorenter ;
        if (zzaCI != null) goto _L2; else goto _L1
_L1:
        zzbg.zzan("Refresh requested, but no network load scheduler.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzaCI.a(l, zzaCG.zzhi);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    static zzo zza(zzp zzp1, zzo zzo1)
    {
        zzp1.zzaCE = zzo1;
        return zzo1;
    }

    static String zza(zzp zzp1)
    {
        return zzp1.zzaCk;
    }

    private void zza(com.google.android.gms.internal.zzc.zzj zzj1)
    {
        this;
        JVM INSTR monitorenter ;
        if (zzaCC != null)
        {
            com.google.android.gms.internal.zzmi.zza zza1 = new com.google.android.gms.internal.zzmi.zza();
            zza1.zzaGL = zzaCp;
            zza1.zzhh = new com.google.android.gms.internal.zzc.zzf();
            zza1.zzaGM = zzj1;
            zzaCC.a(zza1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        zzj1;
        throw zzj1;
    }

    private void zza(com.google.android.gms.internal.zzc.zzj zzj1, long l, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!flag) goto _L2; else goto _L1
_L1:
        flag = zzaCF;
        if (!flag) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (isReady())
        {
            if (zzaCE != null);
        }
        zzaCG = zzj1;
        zzaCp = l;
        zzQ(Math.max(0L, Math.min(0x2932e00L, (zzaCp + 0x2932e00L) - zznR.currentTimeMillis())));
        zzj1 = new Container(mContext, zzaCw.getDataLayer(), zzaCk, l, zzj1);
        if (zzaCE != null)
        {
            break; /* Loop/switch isn't completed */
        }
        zzaCE = new zzo(zzaCw, zzPx, zzj1, zzaCz);
_L5:
        if (!isReady() && zzaCJ.a(zzj1))
        {
            setResult(zzaCE);
        }
        if (true) goto _L3; else goto _L4
        zzj1;
        throw zzj1;
_L4:
        zzaCE.a(zzj1);
          goto _L5
    }

    static void zza(zzp zzp1, long l)
    {
        zzp1.zzQ(l);
    }

    static void zza(zzp zzp1, com.google.android.gms.internal.zzc.zzj zzj1)
    {
        zzp1.zza(zzj1);
    }

    static void zza(zzp zzp1, com.google.android.gms.internal.zzc.zzj zzj1, long l, boolean flag)
    {
        zzp1.zza(zzj1, l, flag);
    }

    private void zzah(boolean flag)
    {
        zzaCC.a(new b());
        zzaCI.a(new c());
        com.google.android.gms.internal.zzmq.zzc zzc1 = zzaCC.a(zzaCB);
        if (zzc1 != null)
        {
            zzaCE = new zzo(zzaCw, zzPx, new Container(mContext, zzaCw.getDataLayer(), zzaCk, 0L, zzc1), zzaCz);
        }
        zzaCJ = new a(flag) {

            final boolean a;
            final zzp b;

            public boolean a(Container container)
            {
                if (!a) goto _L2; else goto _L1
_L1:
                if (container.getLastRefreshTime() + 0x2932e00L < zzp.zzg(b).currentTimeMillis()) goto _L4; else goto _L3
_L3:
                return true;
_L4:
                return false;
_L2:
                if (container.isDefault())
                {
                    return false;
                }
                if (true) goto _L3; else goto _L5
_L5:
            }

            
            {
                b = zzp.this;
                a = flag;
                super();
            }
        };
        if (zzwA())
        {
            zzaCI.a(0L, "");
            return;
        } else
        {
            zzaCC.a();
            return;
        }
    }

    static TagManager zzb(zzp zzp1)
    {
        return zzp1.zzaCw;
    }

    static Looper zzc(zzp zzp1)
    {
        return zzp1.zzPx;
    }

    static Context zzd(zzp zzp1)
    {
        return zzp1.mContext;
    }

    static az zze(zzp zzp1)
    {
        return zzp1.zzaCA;
    }

    static zzo zzf(zzp zzp1)
    {
        return zzp1.zzaCE;
    }

    static zzht zzg(zzp zzp1)
    {
        return zzp1.zznR;
    }

    static boolean zzh(zzp zzp1)
    {
        return zzp1.zzaCF;
    }

    static com.google.android.gms.internal.zzc.zzj zzi(zzp zzp1)
    {
        return zzp1.zzaCG;
    }

    static long zzj(zzp zzp1)
    {
        return zzp1.zzaCp;
    }

    static boolean zzk(zzp zzp1)
    {
        return zzp1.zzwA();
    }

    private boolean zzwA()
    {
        ax ax1 = ax.a();
        return (ax1.b() == ax.a.b || ax1.b() == ax.a.c) && zzaCk.equals(ax1.d());
    }

    protected Result createFailedResult(Status status)
    {
        return zzaO(status);
    }

    public void load(String s)
    {
        Integer integer;
        if (zzaCB != -1)
        {
            integer = Integer.valueOf(zzaCB);
        } else
        {
            integer = null;
        }
        zzaCD.zza(zzaCk, integer, s, new com.google.android.gms.internal.zzml.zza(s) {

            final String a;
            final zzp b;

            public void zza(zzmp zzmp1)
            {
                if (zzmp1.getStatus() != Status.zzQU)
                {
                    zzbg.zzak((new StringBuilder()).append("Load request failed for the container ").append(zzp.zza(b)).toString());
                    b.setResult(b.zzaO(Status.zzQW));
                    return;
                }
                com.google.android.gms.internal.zzmq.zzc zzc1 = zzmp1.zzym().zzyq();
                if (zzc1 == null)
                {
                    zzbg.zzak("Response doesn't have the requested container");
                    b.setResult(b.zzaO(new Status(8, "Response doesn't have the requested container", null)));
                    return;
                } else
                {
                    long l = zzmp1.zzym().zzyr();
                    zzp.zza(b, new zzo(zzp.zzb(b), zzp.zzc(b), new Container(zzp.zzd(b), zzp.zzb(b).getDataLayer(), zzp.zza(b), l, zzc1), new zzo.zza(this) {

                        final _cls1 a;

                        public void zzdB(String s)
                        {
                            a.b.zzdB(s);
                        }

                        public String zzwu()
                        {
                            return a.b.zzwu();
                        }

                        public void zzww()
                        {
                            if (zzp.zze(a.b).a())
                            {
                                a.b.load(a.a);
                            }
                        }

            
            {
                a = _pcls1;
                super();
            }
                    }));
                    b.setResult(zzp.zzf(b));
                    return;
                }
            }

            
            {
                b = zzp.this;
                a = s;
                super();
            }
        });
    }

    protected ContainerHolder zzaO(Status status)
    {
        if (zzaCE != null)
        {
            return zzaCE;
        }
        if (status == Status.zzQX)
        {
            zzbg.zzak("timer expired: setting result to failure");
        }
        return new zzo(status);
    }

    void zzdB(String s)
    {
        this;
        JVM INSTR monitorenter ;
        zzaCH = s;
        if (zzaCI != null)
        {
            zzaCI.a(s);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    String zzwu()
    {
        this;
        JVM INSTR monitorenter ;
        String s = zzaCH;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public void zzwx()
    {
        Object obj = zzaCC.a(zzaCB);
        if (obj != null)
        {
            obj = new Container(mContext, zzaCw.getDataLayer(), zzaCk, 0L, ((com.google.android.gms.internal.zzmq.zzc) (obj)));
            setResult(new zzo(zzaCw, zzPx, ((Container) (obj)), new zzo.zza() {

                final zzp a;

                public void zzdB(String s)
                {
                    a.zzdB(s);
                }

                public String zzwu()
                {
                    return a.zzwu();
                }

                public void zzww()
                {
                    zzbg.zzan("Refresh ignored: container loaded as default only.");
                }

            
            {
                a = zzp.this;
                super();
            }
            }));
        } else
        {
            zzbg.zzak("Default was requested, but no default container was found");
            setResult(zzaO(new Status(10, "Default was requested, but no default container was found", null)));
        }
        zzaCI = null;
        zzaCC = null;
    }

    public void zzwy()
    {
        zzah(false);
    }

    public void zzwz()
    {
        zzah(true);
    }
}
