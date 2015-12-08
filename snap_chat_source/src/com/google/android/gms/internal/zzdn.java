// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.dynamic.zze;

// Referenced classes of package com.google.android.gms.internal:
//            zzdk, zzhy, zzba, zzdj, 
//            zzds, zzhx, zzdr, zzdm, 
//            zzhw, zzdo, zzax

public final class zzdn
    implements zzdo.zza
{

    private final Context mContext;
    private final zzdr zzlD;
    private final zzax zzmH;
    private final Object zznh = new Object();
    private final zzhy zznl;
    private final String zzsC;
    private final long zzsD;
    private final zzdj zzsE;
    private final zzba zzsF;
    private zzds zzsG;
    private int zzsH;

    public zzdn(Context context, String s, zzdr zzdr1, zzdk zzdk1, zzdj zzdj1, zzax zzax, zzba zzba1, 
            zzhy zzhy1)
    {
        zzsH = -2;
        mContext = context;
        zzlD = zzdr1;
        zzsE = zzdj1;
        long l;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(s))
        {
            zzsC = zzcK();
        } else
        {
            zzsC = s;
        }
        if (zzdk1.zzss != -1L)
        {
            l = zzdk1.zzss;
        } else
        {
            l = 10000L;
        }
        zzsD = l;
        zzmH = zzax;
        zzsF = zzba1;
        zznl = zzhy1;
    }

    static zzds zza(zzdn zzdn1, zzds zzds1)
    {
        zzdn1.zzsG = zzds1;
        return zzds1;
    }

    static Object zza(zzdn zzdn1)
    {
        return zzdn1.zznh;
    }

    private void zza(long l, long l1, long l2, long l3)
    {
        do
        {
            if (zzsH != -2)
            {
                return;
            }
            zzb(l, l1, l2, l3);
        } while (true);
    }

    private void zza(zzdm zzdm1)
    {
        if (zznl.zzzJ >= 0x3e8fa0)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        if (zzsF.zzpb)
        {
            zzsG.zza(zze.zzn(mContext), zzmH, zzsE.zzsq, zzdm1);
            return;
        }
        try
        {
            zzsG.zza(zze.zzn(mContext), zzsF, zzmH, zzsE.zzsq, zzdm1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzdm zzdm1)
        {
            zzhx.zzd("Could not request ad from mediation adapter.", zzdm1);
        }
        zzm(5);
        return;
        if (zzsF.zzpb)
        {
            zzsG.zza(zze.zzn(mContext), zzmH, zzsE.zzsq, zzsE.zzsk, zzdm1);
            return;
        }
        zzsG.zza(zze.zzn(mContext), zzsF, zzmH, zzsE.zzsq, zzsE.zzsk, zzdm1);
        return;
    }

    static void zza(zzdn zzdn1, zzdm zzdm1)
    {
        zzdn1.zza(zzdm1);
    }

    static int zzb(zzdn zzdn1)
    {
        return zzdn1.zzsH;
    }

    private void zzb(long l, long l1, long l2, long l3)
    {
        long l4 = SystemClock.elapsedRealtime();
        l = l1 - (l4 - l);
        l1 = l3 - (l4 - l2);
        if (l <= 0L || l1 <= 0L)
        {
            zzhx.zzaa("Timed out waiting for adapter.");
            zzsH = 3;
            return;
        }
        try
        {
            zznh.wait(Math.min(l, l1));
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            zzsH = -1;
        }
    }

    static zzds zzc(zzdn zzdn1)
    {
        return zzdn1.zzcL();
    }

    private String zzcK()
    {
        if (!TextUtils.isEmpty(zzsE.zzso))
        {
            if (zzlD.zzC(zzsE.zzso))
            {
                return "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
            } else
            {
                return "com.google.ads.mediation.customevent.CustomEventAdapter";
            }
        }
        break MISSING_BLOCK_LABEL_44;
        RemoteException remoteexception;
        remoteexception;
        zzhx.zzac("Fail to determine the custom event's version, assuming the old one.");
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
    }

    private zzds zzcL()
    {
        zzhx.zzaa((new StringBuilder("Instantiating mediation adapter: ")).append(zzsC).toString());
        zzds zzds1;
        try
        {
            zzds1 = zzlD.zzB(zzsC);
        }
        catch (RemoteException remoteexception)
        {
            zzhx.zza((new StringBuilder("Could not instantiate mediation adapter: ")).append(zzsC).toString(), remoteexception);
            return null;
        }
        return zzds1;
    }

    static zzds zzd(zzdn zzdn1)
    {
        return zzdn1.zzsG;
    }

    public final void cancel()
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        if (zzsG != null)
        {
            zzsG.destroy();
        }
_L1:
        zzsH = -1;
        zznh.notify();
        return;
        Object obj1;
        obj1;
        zzhx.zzd("Could not destroy mediation adapter.", ((Throwable) (obj1)));
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public final zzdo zzb(long l, long l1)
    {
        Object obj1;
        synchronized (zznh)
        {
            long l2 = SystemClock.elapsedRealtime();
            obj1 = new zzdm();
            zzhw.zzzG.post(new Runnable(((zzdm) (obj1))) {

                final zzdm zzsI;
                final zzdn zzsJ;

                public void run()
                {
label0:
                    {
                        synchronized (zzdn.zza(zzsJ))
                        {
                            if (zzdn.zzb(zzsJ) == -2)
                            {
                                break label0;
                            }
                        }
                        return;
                    }
                    zzdn.zza(zzsJ, zzdn.zzc(zzsJ));
                    if (zzdn.zzd(zzsJ) != null)
                    {
                        break MISSING_BLOCK_LABEL_66;
                    }
                    zzsJ.zzm(4);
                    obj2;
                    JVM INSTR monitorexit ;
                    return;
                    exception1;
                    obj2;
                    JVM INSTR monitorexit ;
                    throw exception1;
                    zzsI.zza(zzsJ);
                    zzdn.zza(zzsJ, zzsI);
                    obj2;
                    JVM INSTR monitorexit ;
                }

            
            {
                zzsJ = zzdn.this;
                zzsI = zzdm1;
                super();
            }
            });
            zza(l2, zzsD, l, l1);
            obj1 = new zzdo(zzsE, zzsG, zzsC, ((zzdm) (obj1)), zzsH);
        }
        return ((zzdo) (obj1));
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void zzm(int i)
    {
        synchronized (zznh)
        {
            zzsH = i;
            zznh.notify();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
