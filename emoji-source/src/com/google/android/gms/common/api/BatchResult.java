// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.internal.hm;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.api:
//            Result, BatchResultToken, PendingResult, Status

public final class BatchResult
    implements Result
{

    private final PendingResult DC[];
    private final Status yz;

    BatchResult(Status status, PendingResult apendingresult[])
    {
        yz = status;
        DC = apendingresult;
    }

    public Status getStatus()
    {
        return yz;
    }

    public Result take(BatchResultToken batchresulttoken)
    {
        boolean flag;
        if (batchresulttoken.mId < DC.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hm.b(flag, "The result token does not belong to this batch");
        return DC[batchresulttoken.mId].await(0L, TimeUnit.MILLISECONDS);
    }
}
