// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.internal.hn;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.api:
//            Result, BatchResultToken, PendingResult, Status

public final class BatchResult
    implements Result
{

    private final PendingResult Dz[];
    private final Status yw;

    BatchResult(Status status, PendingResult apendingresult[])
    {
        yw = status;
        Dz = apendingresult;
    }

    public Status getStatus()
    {
        return yw;
    }

    public Result take(BatchResultToken batchresulttoken)
    {
        boolean flag;
        if (batchresulttoken.mId < Dz.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hn.b(flag, "The result token does not belong to this batch");
        return Dz[batchresulttoken.mId].await(0L, TimeUnit.MILLISECONDS);
    }
}
