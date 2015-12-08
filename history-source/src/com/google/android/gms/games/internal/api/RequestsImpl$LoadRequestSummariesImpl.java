// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            RequestsImpl

private static abstract class _cls1.DS extends com.google.android.gms.games.ummariesImpl
{

    public com.google.android.gms.games.request.Impl ak(Status status)
    {
        return new com.google.android.gms.games.request.Requests.LoadRequestSummariesResult(status) {

            final Status DS;
            final RequestsImpl.LoadRequestSummariesImpl abB;

            public Status getStatus()
            {
                return DS;
            }

            public void release()
            {
            }

            
            {
                abB = RequestsImpl.LoadRequestSummariesImpl.this;
                DS = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return ak(status);
    }
}
