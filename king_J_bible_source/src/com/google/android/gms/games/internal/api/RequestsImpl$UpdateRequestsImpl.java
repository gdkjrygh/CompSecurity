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

    public com.google.android.gms.games.request.Impl Q(Status status)
    {
        return new com.google.android.gms.games.request.Requests.UpdateRequestsResult(status) {

            final RequestsImpl.UpdateRequestsImpl La;
            final Status wz;

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
                return wz;
            }

            public void release()
            {
            }

            
            {
                La = RequestsImpl.UpdateRequestsImpl.this;
                wz = status;
                super();
            }
        };
    }

    public Result d(Status status)
    {
        return Q(status);
    }

    private _cls1.wz()
    {
    }

    _cls1.wz(_cls1.wz wz)
    {
        this();
    }
}
