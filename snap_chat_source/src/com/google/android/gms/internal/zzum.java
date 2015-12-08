// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafetyNetApi;

// Referenced classes of package com.google.android.gms.internal:
//            zzuj, zzuk, zzui, zzun

public class zzum
    implements SafetyNetApi
{
    static class zza
        implements com.google.android.gms.safetynet.SafetyNetApi.AttestationResult
    {

        private final Status zzHb;
        private final com.google.android.gms.safetynet.zza zzawJ;

        public String getJwsResult()
        {
            if (zzawJ == null)
            {
                return null;
            } else
            {
                return zzawJ.getJwsResult();
            }
        }

        public Status getStatus()
        {
            return zzHb;
        }

        public zza(Status status, com.google.android.gms.safetynet.zza zza1)
        {
            zzHb = status;
            zzawJ = zza1;
        }
    }

    static abstract class zzb extends zzuj
    {

        protected zzuk zzawK;

        protected Result createFailedResult(Status status)
        {
            return zzaL(status);
        }

        protected com.google.android.gms.safetynet.SafetyNetApi.AttestationResult zzaL(Status status)
        {
            return new zza(status, null);
        }

        public zzb(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
            zzawK = new _cls1(this);
        }
    }


    public zzum()
    {
    }

    public PendingResult attest(GoogleApiClient googleapiclient, byte abyte0[])
    {
        return googleapiclient.zza(new zzb(googleapiclient, abyte0) {

            final byte zzawH[];
            final zzum zzawI;

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            {
                zza((zzun)zza1);
            }

            protected void zza(zzun zzun1)
            {
                zzun1.zza(zzawK, zzawH);
            }

            
            {
                zzawI = zzum.this;
                zzawH = abyte0;
                super(googleapiclient);
            }
        });
    }

    // Unreferenced inner class com/google/android/gms/internal/zzum$zzb$1

/* anonymous class */
    class zzb._cls1 extends zzui
    {

        final zzb zzawL;

        public void zza(Status status, com.google.android.gms.safetynet.zza zza1)
        {
            zzawL.setResult(new zza(status, zza1));
        }

            
            {
                zzawL = zzb1;
                super();
            }
    }

}
