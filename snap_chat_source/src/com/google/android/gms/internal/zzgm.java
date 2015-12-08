// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.internal:
//            zzhl, zzgs, zzhx, zzab, 
//            zzhg, zzgq, zzgo, zzbv, 
//            zzca, zzbx, zzdh, zzhd, 
//            zzgw, zzgn, zzhy

public abstract class zzgm extends zzhl
{
    public static final class zza extends zzgm
    {

        private final Context mContext;

        public final void zzdJ()
        {
        }

        public final zzgs zzdK()
        {
            zzbv zzbv1 = new zzbv((String)zzca.zzql.get(), zzca.zzcb());
            return zzgw.zza(mContext, zzbv1, new zzdh(), new zzhd());
        }

        public zza(Context context, zzgo zzgo, zzgl.zza zza1)
        {
            super(zzgo, zza1);
            mContext = context;
        }
    }

    public static class zzb extends zzgm
        implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    {

        private final Object zznh = new Object();
        private final zzgl.zza zzwk;
        protected zzgn zzwl;

        protected void connect()
        {
            zzwl.connect();
        }

        public void onConnected(Bundle bundle)
        {
            start();
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            zzwk.zzb(new zzgq(0));
        }

        public void onConnectionSuspended(int i)
        {
            zzhx.zzY("Disconnected from remote ad request service.");
        }

        public void zzdJ()
        {
            synchronized (zznh)
            {
                if (zzwl.isConnected() || zzwl.isConnecting())
                {
                    zzwl.disconnect();
                }
                Binder.flushPendingCommands();
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public zzgs zzdK()
        {
            obj;
            JVM INSTR monitorenter ;
            zzgs zzgs1;
            synchronized (zznh)
            {
                zzgs1 = zzwl.zzdL();
            }
            return zzgs1;
_L2:
            obj;
            JVM INSTR monitorexit ;
            return null;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            Object obj1;
            obj1;
            continue; /* Loop/switch isn't completed */
            obj1;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public zzb(Context context, zzgo zzgo1, zzgl.zza zza1)
        {
            super(zzgo1, zza1);
            zzwk = zza1;
            zzwl = new zzgn(context, this, this, zzgo1.zzlP.zzzJ);
            connect();
        }
    }


    private final zzgo zzse;
    private final zzgl.zza zzwk;

    public zzgm(zzgo zzgo, zzgl.zza zza1)
    {
        zzse = zzgo;
        zzwk = zza1;
    }

    static zzgq zza(zzgs zzgs1, zzgo zzgo)
    {
        try
        {
            zzgs1 = zzgs1.zzd(zzgo);
        }
        // Misplaced declaration of an exception variable
        catch (zzgs zzgs1)
        {
            zzhx.zzd("Could not fetch ad response from ad request service.", zzgs1);
            zzab.zzaP().zze(zzgs1);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (zzgs zzgs1)
        {
            zzhx.zzd("Could not fetch ad response from ad request service due to an Exception.", zzgs1);
            zzab.zzaP().zze(zzgs1);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (zzgs zzgs1)
        {
            zzhx.zzd("Could not fetch ad response from ad request service due to an Exception.", zzgs1);
            zzab.zzaP().zze(zzgs1);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (zzgs zzgs1)
        {
            zzab.zzaP().zze(zzgs1);
            return null;
        }
        return zzgs1;
    }

    public final void onStop()
    {
        zzdJ();
    }

    public abstract void zzdJ();

    public abstract zzgs zzdK();

    public void zzdw()
    {
        Object obj = zzdK();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = new zzgq(0);
_L4:
        zzdJ();
        zzwk.zzb(((zzgq) (obj)));
        return;
_L2:
        zzgq zzgq1 = zza(((zzgs) (obj)), zzse);
        obj = zzgq1;
        if (zzgq1 != null) goto _L4; else goto _L3
_L3:
        obj = new zzgq(0);
          goto _L4
        Exception exception;
        exception;
        zzdJ();
        throw exception;
    }
}
