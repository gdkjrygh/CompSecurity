// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzgv

private static abstract class eApiClient extends eApiClient
{

    protected Status a(Status status)
    {
        return status;
    }

    protected Result createFailedResult(Status status)
    {
        return a(status);
    }

    eApiClient(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }
}
