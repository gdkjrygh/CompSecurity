// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzx;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.common.api:
//            AbstractPendingResult, GoogleApiClient, Status

public class com.google.android.gms.common.api.zza
{
    public static abstract class zza extends AbstractPendingResult
        implements zzd.zzg
    {

        private final Api.zzc zzLT;
        private AtomicReference zzLV;

        private void zza(RemoteException remoteexception)
        {
            zzk(new Status(8, remoteexception.getLocalizedMessage(), null));
        }

        protected void onResultConsumed()
        {
            zzd.zze zze = (zzd.zze)zzLV.getAndSet(null);
            if (zze != null)
            {
                zze.zzb(this);
            }
        }

        public abstract void zza(Api.zza zza1);

        public void zza(zzd.zze zze)
        {
            zzLV.set(zze);
        }

        public final void zzb(Api.zza zza1)
        {
            try
            {
                zza(zza1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Api.zza zza1)
            {
                zza(zza1);
                throw zza1;
            }
            // Misplaced declaration of an exception variable
            catch (Api.zza zza1)
            {
                zza(zza1);
            }
        }

        public final Api.zzc zzhV()
        {
            return zzLT;
        }

        public int zzhW()
        {
            return 0;
        }

        public final void zzk(Status status)
        {
            boolean flag;
            if (!status.isSuccess())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzx.zzb(flag, "Failed result must not be success");
            setResult(createFailedResult(status));
        }

        public zza(Api.zzc zzc, GoogleApiClient googleapiclient)
        {
            super(((GoogleApiClient)zzx.zzb(googleapiclient, "GoogleApiClient must not be null")).getLooper());
            zzLV = new AtomicReference();
            zzLT = (Api.zzc)zzx.zzl(zzc);
        }
    }

}
