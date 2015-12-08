// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.internal.jx;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.api:
//            Result, BatchResultToken, PendingResult, Status

public final class BatchResult
    implements Result
{

    private final Status Eb;
    private final PendingResult JC[];

    BatchResult(Status status, PendingResult apendingresult[])
    {
        Eb = status;
        JC = apendingresult;
    }

    public Status getStatus()
    {
        return Eb;
    }

    public Result take(BatchResultToken batchresulttoken)
    {
        boolean flag;
        if (batchresulttoken.mId < JC.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "The result token does not belong to this batch");
        return JC[batchresulttoken.mId].await(0L, TimeUnit.MILLISECONDS);
    }
}
