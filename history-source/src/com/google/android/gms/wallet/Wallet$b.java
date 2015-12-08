// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wallet:
//            Wallet

public static abstract class eApiClient extends eApiClient
{

    protected Status b(Status status)
    {
        return status;
    }

    protected Result c(Status status)
    {
        return b(status);
    }

    public eApiClient(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }
}
