// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.zzlv;
import com.google.android.gms.internal.zzlx;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.google.android.gms.analytics:
//            zzak, GoogleAnalytics, zzb, zzf, 
//            zzae, zzd, zzv, zzc

class zzw
    implements zzak, zzc.zzb, zzc.zzc
{
    static final class zza extends Enum
    {

        public static final zza zzCA;
        public static final zza zzCB;
        public static final zza zzCC;
        public static final zza zzCD;
        private static final zza zzCE[];
        public static final zza zzCx;
        public static final zza zzCy;
        public static final zza zzCz;

        public static zza valueOf(String s)
        {
            return (zza)Enum.valueOf(com/google/android/gms/analytics/zzw$zza, s);
        }

        public static zza[] values()
        {
            return (zza[])zzCE.clone();
        }

        static 
        {
            zzCx = new zza("CONNECTING", 0);
            zzCy = new zza("CONNECTED_SERVICE", 1);
            zzCz = new zza("CONNECTED_LOCAL", 2);
            zzCA = new zza("BLOCKED", 3);
            zzCB = new zza("PENDING_CONNECTION", 4);
            zzCC = new zza("PENDING_DISCONNECT", 5);
            zzCD = new zza("DISCONNECTED", 6);
            zzCE = (new zza[] {
                zzCx, zzCy, zzCz, zzCA, zzCB, zzCC, zzCD
            });
        }

        private zza(String s, int i)
        {
            super(s, i);
        }
    }

    class zzb extends TimerTask
    {

        final zzw zzCv;

        public void run()
        {
            if (zzw.zzb(zzCv) == zza.zzCy && zzw.zze(zzCv).isEmpty() && zzw.zzf(zzCv) + zzw.zzg(zzCv) < zzw.zzh(zzCv).elapsedRealtime())
            {
                zzae.zzab("Disconnecting due to inactivity");
                zzw.zzi(zzCv);
                return;
            } else
            {
                zzw.zzj(zzCv).schedule(zzCv. new zzb(), zzw.zzg(zzCv));
                return;
            }
        }

        private zzb()
        {
            zzCv = zzw.this;
            super();
        }

    }

    class zzc extends TimerTask
    {

        final zzw zzCv;

        public void run()
        {
            if (zzw.zzb(zzCv) == zza.zzCx)
            {
                zzw.zzc(zzCv);
            }
        }

        private zzc()
        {
            zzCv = zzw.this;
            super();
        }

    }

    static class zzd
    {

        private final Map zzCF;
        private final long zzCG;
        private final String zzCH;
        private final List zzCI;

        public String getPath()
        {
            return zzCH;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("PATH: ");
            stringbuilder.append(zzCH);
            if (zzCF != null)
            {
                stringbuilder.append("  PARAMS: ");
                for (Iterator iterator = zzCF.entrySet().iterator(); iterator.hasNext(); stringbuilder.append(",  "))
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                    stringbuilder.append((String)entry.getKey());
                    stringbuilder.append("=");
                    stringbuilder.append((String)entry.getValue());
                }

            }
            return stringbuilder.toString();
        }

        public Map zzfS()
        {
            return zzCF;
        }

        public long zzfT()
        {
            return zzCG;
        }

        public List zzfU()
        {
            return zzCI;
        }

        public zzd(Map map, long l, String s, List list)
        {
            zzCF = map;
            zzCG = l;
            zzCH = s;
            zzCI = list;
        }
    }

    class zze extends TimerTask
    {

        final zzw zzCv;

        public void run()
        {
            zzw.zzd(zzCv);
        }

        private zze()
        {
            zzCv = zzw.this;
            super();
        }

    }


    private final Context mContext;
    private com.google.android.gms.analytics.zzd zzBR;
    private final zzf zzBS;
    private boolean zzBV;
    private volatile long zzCh;
    private volatile zza zzCi;
    private volatile com.google.android.gms.analytics.zzb zzCj;
    private com.google.android.gms.analytics.zzd zzCk;
    private final GoogleAnalytics zzCl;
    private final Queue zzCm;
    private volatile int zzCn;
    private volatile Timer zzCo;
    private volatile Timer zzCp;
    private volatile Timer zzCq;
    private boolean zzCr;
    private boolean zzCs;
    private boolean zzCt;
    private long zzCu;
    private zzlv zzmW;

    zzw(Context context, zzf zzf1)
    {
        this(context, zzf1, null, GoogleAnalytics.getInstance(context));
    }

    zzw(Context context, zzf zzf1, com.google.android.gms.analytics.zzd zzd1, GoogleAnalytics googleanalytics)
    {
        zzCm = new ConcurrentLinkedQueue();
        zzCk = zzd1;
        mContext = context;
        zzBS = zzf1;
        zzCl = googleanalytics;
        zzCn = 0;
        zzCi = zza.zzCD;
        if (zzG(context))
        {
            zzCu = 10000L;
        } else
        {
            zzCu = 0x493e0L;
        }
        zzmW = zzlx.zzkc();
    }

    private static boolean zzG(Context context)
    {
        return context != null && "com.google.android.gms".equals(context.getPackageName());
    }

    private Timer zza(Timer timer)
    {
        if (timer != null)
        {
            timer.cancel();
        }
        return null;
    }

    static void zza(zzw zzw1)
    {
        zzw1.zzfN();
    }

    static zza zzb(zzw zzw1)
    {
        return zzw1.zzCi;
    }

    static void zzc(zzw zzw1)
    {
        zzw1.zzfP();
    }

    static void zzd(zzw zzw1)
    {
        zzw1.zzfQ();
    }

    private void zzdJ()
    {
        this;
        JVM INSTR monitorenter ;
        if (zzCj != null && zzCi == zza.zzCy)
        {
            zzCi = zza.zzCC;
            zzCj.disconnect();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static Queue zze(zzw zzw1)
    {
        return zzw1.zzCm;
    }

    static long zzf(zzw zzw1)
    {
        return zzw1.zzCh;
    }

    private void zzfL()
    {
        zzCo = zza(zzCo);
        zzCp = zza(zzCp);
        zzCq = zza(zzCq);
    }

    private void zzfN()
    {
        this;
        JVM INSTR monitorenter ;
        if (Thread.currentThread().equals(zzBS.getThread())) goto _L2; else goto _L1
_L1:
        zzBS.zzfi().add(new Runnable() {

            final zzw zzCv;

            public void run()
            {
                zzw.zza(zzCv);
            }

            
            {
                zzCv = zzw.this;
                super();
            }
        });
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (zzCr)
        {
            zzfa();
        }
        static class _cls2
        {

            static final int zzCw[];

            static 
            {
                zzCw = new int[zza.values().length];
                try
                {
                    zzCw[zza.zzCz.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    zzCw[zza.zzCy.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    zzCw[zza.zzCx.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    zzCw[zza.zzCB.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    zzCw[zza.zzCC.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    zzCw[zza.zzCD.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    zzCw[zza.zzCA.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2.zzCw[zzCi.ordinal()];
        JVM INSTR tableswitch 1 7: default 360
    //                   1 108
    //                   2 217
    //                   3 360
    //                   4 360
    //                   5 360
    //                   6 335
    //                   7 185;
           goto _L3 _L4 _L5 _L3 _L3 _L3 _L6 _L7
_L4:
        zzd zzd1;
        for (; !zzCm.isEmpty(); zzBR.zza(zzd1.zzfS(), zzd1.zzfT(), zzd1.getPath(), zzd1.zzfU()))
        {
            zzd1 = (zzd)zzCm.poll();
            zzae.zzab((new StringBuilder("Sending hit to store  ")).append(zzd1).toString());
        }

          goto _L8
        Exception exception;
        exception;
        throw exception;
_L7:
        zzae.zzab("Blocked. Dropping hits.");
        zzCm.clear();
          goto _L3
_L8:
        if (!zzBV) goto _L3; else goto _L9
_L9:
        zzfO();
          goto _L3
_L5:
        if (zzCm.isEmpty()) goto _L11; else goto _L10
_L10:
        zzd zzd2;
        zzd2 = (zzd)zzCm.peek();
        zzae.zzab((new StringBuilder("Sending hit to service   ")).append(zzd2).toString());
        if (zzCl.isDryRunEnabled()) goto _L13; else goto _L12
_L12:
        zzCj.zza(zzd2.zzfS(), zzd2.zzfT(), zzd2.getPath(), zzd2.zzfU());
_L14:
        zzCm.poll();
          goto _L5
_L13:
        zzae.zzab("Dry run enabled. Hit not actually sent to service.");
          goto _L14
_L11:
        zzCh = zzmW.elapsedRealtime();
          goto _L3
_L6:
        zzae.zzab("Need to reconnect");
        if (!zzCm.isEmpty())
        {
            zzfQ();
        }
          goto _L3
    }

    private void zzfO()
    {
        zzBR.dispatch();
        zzBV = false;
    }

    private void zzfP()
    {
        this;
        JVM INSTR monitorenter ;
        zza zza1;
        zza zza2;
        zza1 = zzCi;
        zza2 = zza.zzCz;
        if (zza1 != zza2) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!zzG(mContext))
        {
            break MISSING_BLOCK_LABEL_59;
        }
        zzCi = zza.zzCA;
        zzCj.disconnect();
        zzae.zzac("Attempted to fall back to local store from service.");
          goto _L1
        Exception exception;
        exception;
        throw exception;
        zzfL();
        zzae.zzab("falling back to local store");
        if (zzCk == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        zzBR = zzCk;
_L3:
        zzCi = zza.zzCz;
        zzfN();
          goto _L1
        zzv zzv1 = zzv.zzfE();
        zzv1.zza(mContext, zzBS);
        zzBR = zzv1.zzE(null);
          goto _L3
    }

    private void zzfQ()
    {
        this;
        JVM INSTR monitorenter ;
        zza zza1;
        zza zza2;
        if (zzCt || zzCj == null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        zza1 = zzCi;
        zza2 = zza.zzCz;
        if (zza1 == zza2)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        zzCn = zzCn + 1;
        zza(zzCp);
        zzCi = zza.zzCx;
        zzCp = new Timer("Failed Connect");
        zzCp.schedule(new zzc(), 3000L);
        zzae.zzab("connecting to Analytics service");
        zzCj.connect();
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        zzae.zzac("security exception on connectToService");
        zzfP();
          goto _L1
        obj;
        throw obj;
        zzae.zzac("client not initialized.");
        zzfP();
          goto _L1
    }

    private void zzfR()
    {
        zzCo = zza(zzCo);
        zzCo = new Timer("Service Reconnect");
        zzCo.schedule(new zze(), 5000L);
    }

    static long zzg(zzw zzw1)
    {
        return zzw1.zzCu;
    }

    static zzlv zzh(zzw zzw1)
    {
        return zzw1.zzmW;
    }

    static void zzi(zzw zzw1)
    {
        zzw1.zzdJ();
    }

    static Timer zzj(zzw zzw1)
    {
        return zzw1.zzCq;
    }

    public void dispatch()
    {
        switch (_cls2.zzCw[zzCi.ordinal()])
        {
        default:
            zzBV = true;
            // fall through

        case 2: // '\002'
            return;

        case 1: // '\001'
            zzfO();
            break;
        }
    }

    public void onConnected()
    {
        this;
        JVM INSTR monitorenter ;
        zzCp = zza(zzCp);
        zzCn = 0;
        zzae.zzab("Connected to service");
        zzCi = zza.zzCy;
        if (!zzCs) goto _L2; else goto _L1
_L1:
        zzdJ();
        zzCs = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzfN();
        zzCq = zza(zzCq);
        zzCq = new Timer("disconnect check");
        zzCq.schedule(new zzb(), zzCu);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void onDisconnected()
    {
        this;
        JVM INSTR monitorenter ;
        if (zzCi != zza.zzCA) goto _L2; else goto _L1
_L1:
        zzae.zzab("Service blocked.");
        zzfL();
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (zzCi != zza.zzCC)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        zzae.zzab("Disconnected from service");
        zzfL();
        zzCi = zza.zzCD;
          goto _L3
        Exception exception;
        exception;
        throw exception;
label0:
        {
            zzae.zzab("Unexpected disconnect.");
            zzCi = zza.zzCB;
            if (zzCn >= 2)
            {
                break label0;
            }
            zzfR();
        }
          goto _L3
        zzfP();
          goto _L3
    }

    public void zza(int i, Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        zzCi = zza.zzCB;
        if (zzCn >= 2) goto _L2; else goto _L1
_L1:
        zzae.zzac((new StringBuilder("Service unavailable (code=")).append(i).append("), will retry.").toString());
        zzfR();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzae.zzac((new StringBuilder("Service unavailable (code=")).append(i).append("), using local store.").toString());
        zzfP();
        if (true) goto _L4; else goto _L3
_L3:
        intent;
        throw intent;
    }

    public void zzb(Map map, long l, String s, List list)
    {
        zzae.zzab("putHit called");
        zzCm.add(new zzd(map, l, s, list));
        zzfN();
    }

    public void zzfM()
    {
        if (zzCj != null)
        {
            return;
        } else
        {
            zzCj = new com.google.android.gms.analytics.zzc(mContext, this, this);
            zzfQ();
            return;
        }
    }

    public void zzfa()
    {
        zzae.zzab("clearHits called");
        zzCm.clear();
        switch (_cls2.zzCw[zzCi.ordinal()])
        {
        default:
            zzCr = true;
            return;

        case 1: // '\001'
            zzBR.zzl(0L);
            zzCr = false;
            return;

        case 2: // '\002'
            zzCj.zzfa();
            break;
        }
        zzCr = false;
    }

    public void zzfh()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = zzCt;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzae.zzab("setForceLocalDispatch called.");
        zzCt = true;
        _cls2.zzCw[zzCi.ordinal()];
        JVM INSTR tableswitch 1 3: default 84
    //                   1 11
    //                   2 64
    //                   3 76;
           goto _L3 _L3 _L4 _L5
_L3:
        if (true) goto _L1; else goto _L6
_L6:
_L4:
        zzdJ();
          goto _L1
        Exception exception;
        exception;
        throw exception;
_L5:
        zzCs = true;
          goto _L1
    }
}
