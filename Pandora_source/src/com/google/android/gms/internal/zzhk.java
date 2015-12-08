// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzhj, zzhh, zzhm, zzho

public final class zzhk
    implements zzhj
{
    private static class a extends zzhh
    {

        private final com.google.android.gms.common.api.zza.zzb a;

        public void zzaW(int i)
            throws RemoteException
        {
            a.zzj(new Status(i));
        }

        public a(com.google.android.gms.common.api.zza.zzb zzb)
        {
            a = zzb;
        }
    }


    public zzhk()
    {
    }

    public PendingResult zzc(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new j.a(googleapiclient) {

            final zzhk a;

            protected void a(zzhm zzhm1)
                throws RemoteException
            {
                ((zzho)zzhm1.zzlX()).zza(new a(this));
            }

            protected void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                a((zzhm)zza1);
            }

            
            {
                a = zzhk.this;
                super(googleapiclient);
            }
        });
    }
}
