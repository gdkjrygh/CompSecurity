// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient, BatchResultToken, Batch, PendingResult

public final class t.getLooper
{

    private List JE;
    private Looper JF;

    public final BatchResultToken add(PendingResult pendingresult)
    {
        BatchResultToken batchresulttoken = new BatchResultToken(JE.size());
        JE.add(pendingresult);
        return batchresulttoken;
    }

    public final Batch build()
    {
        return new Batch(JE, JF, null);
    }

    public t(GoogleApiClient googleapiclient)
    {
        JE = new ArrayList();
        JF = googleapiclient.getLooper();
    }
}
