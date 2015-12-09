// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            Batch, BatchResultToken, GoogleApiClient, PendingResult

public static final class mApiClient
{

    private GoogleApiClient mApiClient;
    private List mResultList;

    public final BatchResultToken add(PendingResult pendingresult)
    {
        BatchResultToken batchresulttoken = new BatchResultToken(mResultList.size());
        mResultList.add(pendingresult);
        return batchresulttoken;
    }

    public final Batch build()
    {
        return new Batch(mResultList, mApiClient, (byte)0);
    }

    public t(GoogleApiClient googleapiclient)
    {
        mResultList = new ArrayList();
        mApiClient = googleapiclient;
    }
}
