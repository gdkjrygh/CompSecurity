// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            RequestsImpl

private static abstract class _cls1.CW extends com.google.android.gms.games.dRequestImpl
{

    public com.google.android.gms.games.request.Impl am(Status status)
    {
        return new com.google.android.gms.games.request.Requests.SendRequestResult(status) {

            final Status CW;
            final RequestsImpl.SendRequestImpl ZJ;

            public Status getStatus()
            {
                return CW;
            }

            
            {
                ZJ = RequestsImpl.SendRequestImpl.this;
                CW = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return am(status);
    }

    private _cls1.CW()
    {
    }
}
