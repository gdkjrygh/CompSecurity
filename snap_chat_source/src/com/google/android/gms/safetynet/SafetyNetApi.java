// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.safetynet;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;

public interface SafetyNetApi
{
    public static interface AttestationResult
        extends Result
    {

        public abstract String getJwsResult();
    }


    public abstract PendingResult attest(GoogleApiClient googleapiclient, byte abyte0[]);
}
