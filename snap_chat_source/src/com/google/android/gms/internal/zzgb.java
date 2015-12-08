// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal:
//            zzhl, zzhx, zzhw, zzgq, 
//            zzhe, zzgo, zzic

public abstract class zzgb extends zzhl
{
    public static final class zza extends Exception
    {

        private final int zzvR;

        public final int getErrorCode()
        {
            return zzvR;
        }

        public zza(String s, int i)
        {
            super(s);
            zzvR = i;
        }
    }


    protected final Context mContext;
    protected final zzic zzmu;
    protected final Object zznh = new Object();
    protected final zzgc.zza zzvL;
    protected final Object zzvM = new Object();
    protected final zzhe.zza zzvN;
    protected zzgq zzvO;

    protected zzgb(Context context, zzhe.zza zza1, zzic zzic, zzgc.zza zza2)
    {
        mContext = context;
        zzvN = zza1;
        zzvO = zza1.zzyz;
        zzmu = zzic;
        zzvL = zza2;
    }

    public void onStop()
    {
    }

    public void zzdw()
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        int i;
        zzhx.zzY("AdRendererBackgroundTask started.");
        i = zzvN.errorCode;
        zzg(SystemClock.elapsedRealtime());
_L3:
        zzhe zzhe1 = zzt(i);
        zzhw.zzzG.post(new Runnable(zzhe1) {

            final zzgb zzvP;
            final zzhe zzvQ;

            public void run()
            {
                synchronized (zzvP.zznh)
                {
                    zzvP.zzh(zzvQ);
                }
                return;
                exception;
                obj2;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                zzvP = zzgb.this;
                zzvQ = zzhe1;
                super();
            }
        });
        return;
        Object obj1;
        obj1;
        i = ((zza) (obj1)).getErrorCode();
        if (i != 3 && i != -1) goto _L2; else goto _L1
_L1:
        zzhx.zzaa(((zza) (obj1)).getMessage());
_L4:
        if (zzvO != null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        zzvO = new zzgq(i);
_L5:
        zzhw.zzzG.post(new Runnable() {

            final zzgb zzvP;

            public void run()
            {
                zzvP.onStop();
            }

            
            {
                zzvP = zzgb.this;
                super();
            }
        });
          goto _L3
_L2:
        zzhx.zzac(((zza) (obj1)).getMessage());
          goto _L4
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        zzvO = new zzgq(i, zzvO.zzsx);
          goto _L5
    }

    protected abstract void zzg(long l);

    protected void zzh(zzhe zzhe1)
    {
        zzvL.zza(zzhe1);
    }

    protected zzhe zzt(int i)
    {
        zzgo zzgo1 = zzvN.zzyy;
        return new zzhe(zzgo1.zzwn, zzmu, zzvO.zzst, i, zzvO.zzsu, zzvO.zzwK, zzvO.orientation, zzvO.zzsx, zzgo1.zzwq, zzvO.zzwI, null, null, null, null, null, zzvO.zzwJ, zzvN.zzlV, zzvO.zzwH, zzvN.zzyv, zzvO.zzwM, zzvO.zzwN, zzvN.zzys, null, zzgo1.zzwD);
    }
}
