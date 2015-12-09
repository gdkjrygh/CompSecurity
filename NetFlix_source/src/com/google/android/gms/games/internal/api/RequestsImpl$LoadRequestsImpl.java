// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.request.GameRequestBuffer;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            RequestsImpl

private static abstract class <init> extends com.google.android.gms.games.RequestsImpl
{

    public com.google.android.gms.games.request.Impl O(Status status)
    {
        return new com.google.android.gms.games.request.Requests.LoadRequestsResult(status) {

            final RequestsImpl.LoadRequestsImpl KY;
            final Status wz;

            public GameRequestBuffer getRequests(int i)
            {
                return null;
            }

            public Status getStatus()
            {
                return wz;
            }

            public void release()
            {
            }

            
            {
                KY = RequestsImpl.LoadRequestsImpl.this;
                wz = status;
                super();
            }
        };
    }

    public Result d(Status status)
    {
        return O(status);
    }

    private _cls1.wz()
    {
    }

    _cls1.wz(_cls1.wz wz)
    {
        this();
    }
}
