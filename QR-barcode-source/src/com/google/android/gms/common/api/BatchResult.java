// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.o;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.api:
//            Result, BatchResultToken, PendingResult, Status

public final class BatchResult
    implements Result
{

    private final Status CM;
    private final PendingResult IE[];

    BatchResult(Status status, PendingResult apendingresult[])
    {
        CM = status;
        IE = apendingresult;
    }

    public Status getStatus()
    {
        return CM;
    }

    public Result take(BatchResultToken batchresulttoken)
    {
        boolean flag;
        if (batchresulttoken.mId < IE.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "The result token does not belong to this batch");
        return IE[batchresulttoken.mId].await(0L, TimeUnit.MILLISECONDS);
    }
}
