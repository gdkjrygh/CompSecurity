// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.internal:
//            zzbe, zzhw, zzdd, zzde, 
//            zzhx

public final class zzdc
{
    public static final class zza
        implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    {

        private final Object zznh;
        private final zzb zzrO;
        private final zzdd zzrP;

        public final void onConnected(Bundle bundle)
        {
            bundle = new Bundle();
            Object obj1 = zznh;
            obj1;
            JVM INSTR monitorenter ;
            Object obj = zzrP.zzcH();
            if (obj == null) goto _L2; else goto _L1
_L1:
            obj = ((zzde) (obj)).zzcI();
_L6:
            if (zzrP.isConnected())
            {
                break MISSING_BLOCK_LABEL_56;
            }
            bundle = ((Bundle) (obj));
            if (!zzrP.isConnecting())
            {
                break MISSING_BLOCK_LABEL_65;
            }
            zzrP.disconnect();
            bundle = ((Bundle) (obj));
_L4:
            obj1;
            JVM INSTR monitorexit ;
            zzrO.zze(bundle);
            return;
            obj;
            zzhx.zzd("Error when get Gservice values", ((Throwable) (obj)));
            if (zzrP.isConnected() || zzrP.isConnecting())
            {
                zzrP.disconnect();
            }
            continue; /* Loop/switch isn't completed */
            obj;
            zzhx.zzd("Error when get Gservice values", ((Throwable) (obj)));
            if (zzrP.isConnected() || zzrP.isConnecting())
            {
                zzrP.disconnect();
            }
            if (true) goto _L4; else goto _L3
_L3:
            bundle;
            if (zzrP.isConnected() || zzrP.isConnecting())
            {
                zzrP.disconnect();
            }
            throw bundle;
            bundle;
            obj1;
            JVM INSTR monitorexit ;
            throw bundle;
_L2:
            obj = bundle;
            if (true) goto _L6; else goto _L5
_L5:
        }

        public final void onConnectionFailed(ConnectionResult connectionresult)
        {
            zzrO.zze(new Bundle());
        }

        public final void onConnectionSuspended(int i)
        {
            zzhx.zzY("Disconnected from remote ad request service.");
        }

        public zza(Context context, zzb zzb1)
        {
            this(context, zzb1, false);
        }

        zza(Context context, zzb zzb1, boolean flag)
        {
            zznh = new Object();
            zzrO = zzb1;
            zzrP = new zzdd(context, this, this, 0x6c42d8);
            if (!flag)
            {
                zzrP.connect();
            }
        }
    }

    public static interface zzb
    {

        public abstract void zze(Bundle bundle);
    }


    public static void zza(Context context, zzb zzb1)
    {
        if (!zzbe.zzbD().zzA(context))
        {
            zzb1.zze(new Bundle());
            return;
        } else
        {
            new zza(context, zzb1);
            return;
        }
    }
}
