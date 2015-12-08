// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.zza;

// Referenced classes of package com.google.android.gms.internal:
//            zzuj, zzum, zzuk, zzui

static abstract class <init> extends zzuj
{

    protected zzuk zzawK;

    protected Result createFailedResult(Status status)
    {
        return zzaL(status);
    }

    protected com.google.android.gms.safetynet.Api.AttestationResult zzaL(Status status)
    {
        return new <init>(status, null);
    }

    public piClient(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
        zzawK = new zzui() {

            final zzum.zzb zzawL;

            public void zza(Status status, zza zza1)
            {
                zzawL.setResult(new zzum.zza(status, zza1));
            }

            
            {
                zzawL = zzum.zzb.this;
                super();
            }
        };
    }
}
