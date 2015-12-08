// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            PlayersImpl

private static abstract class _cls1.yG extends com.google.android.gms.games.amResultImpl
{

    public com.google.android.gms.games.amResultImpl R(Status status)
    {
        return new com.google.android.gms.games.Players.LoadXpStreamResult(status) {

            final PlayersImpl.LoadXpStreamResultImpl Qj;
            final Status yG;

            public Status getStatus()
            {
                return yG;
            }

            
            {
                Qj = PlayersImpl.LoadXpStreamResultImpl.this;
                yG = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return R(status);
    }

    private _cls1.yG()
    {
    }
}
