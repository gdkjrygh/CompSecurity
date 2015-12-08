// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            RequestsImpl

private static abstract class <init> extends com.google.android.gms.games.RequestsImpl
{

    public com.google.android.gms.games.request.Impl Y(Status status)
    {
        return new com.google.android.gms.games.request.Requests.UpdateRequestsResult(status) {

            final RequestsImpl.UpdateRequestsImpl QE;
            final Status yG;

            public Set getRequestIds()
            {
                return null;
            }

            public int getRequestOutcome(String s)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unknown request ID ").append(s).toString());
            }

            public Status getStatus()
            {
                return yG;
            }

            public void release()
            {
            }

            
            {
                QE = RequestsImpl.UpdateRequestsImpl.this;
                yG = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return Y(status);
    }

    private _cls1.yG()
    {
    }

    _cls1.yG(_cls1.yG yg)
    {
        this();
    }
}
