// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzdn, zzhx, zzdk, zzdj, 
//            zzdo, zzgo, zzhw, zzdr, 
//            zzds

public final class zzdi
{

    private final Context mContext;
    private final zzdr zzlD;
    private final Object zznh = new Object();
    private final zzgo zzse;
    private final zzdk zzsf;
    private boolean zzsg;
    private zzdn zzsh;

    public zzdi(Context context, zzgo zzgo1, zzdr zzdr, zzdk zzdk1)
    {
        zzsg = false;
        mContext = context;
        zzse = zzgo1;
        zzlD = zzdr;
        zzsf = zzdk1;
    }

    public final void cancel()
    {
        synchronized (zznh)
        {
            zzsg = true;
            if (zzsh != null)
            {
                zzsh.cancel();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final zzdo zza(long l, long l1)
    {
        Iterator iterator;
        zzhx.zzY("Starting mediation.");
        iterator = zzsf.zzsr.iterator();
_L4:
        zzdj zzdj1;
        Iterator iterator1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_244;
        }
        zzdj1 = (zzdj)iterator.next();
        zzhx.zzaa((new StringBuilder("Trying mediation network: ")).append(zzdj1.zzsl).toString());
        iterator1 = zzdj1.zzsm.iterator();
_L2:
        String s;
label0:
        {
            if (!iterator1.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            s = (String)iterator1.next();
            zzdo zzdo1;
            synchronized (zznh)
            {
                if (!zzsg)
                {
                    break label0;
                }
                zzdo1 = new zzdo(-1);
            }
            return zzdo1;
        }
        zzsh = new zzdn(mContext, s, zzlD, zzsf, zzdj1, zzse.zzwn, zzse.zzlV, zzse.zzlP);
        obj;
        JVM INSTR monitorexit ;
        obj = zzsh.zzb(l, l1);
        if (((zzdo) (obj)).zzsK == 0)
        {
            zzhx.zzY("Adapter succeeded.");
            return ((zzdo) (obj));
        }
        break MISSING_BLOCK_LABEL_216;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (((zzdo) (obj)).zzsM != null)
        {
            zzhw.zzzG.post(new Runnable(((zzdo) (obj))) {

                final zzdo zzsi;
                final zzdi zzsj;

                public void run()
                {
                    try
                    {
                        zzsi.zzsM.destroy();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzhx.zzd("Could not destroy mediation adapter.", remoteexception);
                    }
                }

            
            {
                zzsj = zzdi.this;
                zzsi = zzdo1;
                super();
            }
            });
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
        return new zzdo(1);
    }
}
