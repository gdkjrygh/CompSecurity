// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.google.android.gms.internal:
//            zzhl, zzgt, zzht, zzhe, 
//            zzgo, zzgq, zzhn, zzhw, 
//            zzhx, zzt, zzai

public class zzgg extends zzhl
{

    private final Object zznh;
    private final zzgc.zza zzvL;
    private final zzhe.zza zzvN;
    private final zzgq zzvO;
    private final zzgt zzvY;
    private Future zzvZ;

    public zzgg(Context context, zzt zzt, zzai zzai, zzhe.zza zza1, zzgc.zza zza2)
    {
        this(zza1, zza2, new zzgt(context, zzt, zzai, new zzht(), zza1));
    }

    zzgg(zzhe.zza zza1, zzgc.zza zza2, zzgt zzgt1)
    {
        zznh = new Object();
        zzvN = zza1;
        zzvO = zza1.zzyz;
        zzvL = zza2;
        zzvY = zzgt1;
    }

    static zzgc.zza zza(zzgg zzgg1)
    {
        return zzgg1.zzvL;
    }

    private zzhe zzu(int i)
    {
        return new zzhe(zzvN.zzyy.zzwn, null, null, i, null, null, zzvO.orientation, zzvO.zzsx, zzvN.zzyy.zzwq, false, null, null, null, null, null, zzvO.zzwJ, zzvN.zzlV, zzvO.zzwH, zzvN.zzyv, zzvO.zzwM, zzvO.zzwN, zzvN.zzys, null, zzvN.zzyy.zzwD);
    }

    public void onStop()
    {
        synchronized (zznh)
        {
            if (zzvZ != null)
            {
                zzvZ.cancel(true);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzdw()
    {
        synchronized (zznh)
        {
            zzvZ = zzhn.submit(zzvY);
        }
        obj = (zzhe)zzvZ.get(60000L, TimeUnit.MILLISECONDS);
        byte byte0 = -2;
_L1:
        if (obj == null)
        {
            obj = zzu(byte0);
        }
        zzhw.zzzG.post(new Runnable(((zzhe) (obj))) {

            final zzhe zzvQ;
            final zzgg zzwa;

            public void run()
            {
                zzgg.zza(zzwa).zza(zzvQ);
            }

            
            {
                zzwa = zzgg.this;
                zzvQ = zzhe1;
                super();
            }
        });
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzhx.zzac("Timed out waiting for native ad.");
            byte0 = 2;
            obj = null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            byte0 = 0;
            obj = null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
            byte0 = -1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
            byte0 = -1;
        }
          goto _L1
    }
}
