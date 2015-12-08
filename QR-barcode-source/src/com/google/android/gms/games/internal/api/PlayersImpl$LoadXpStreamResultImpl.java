// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            PlayersImpl

private static abstract class _cls1.CW extends com.google.android.gms.games.amResultImpl
{

    public com.google.android.gms.games.amResultImpl ag(Status status)
    {
        return new com.google.android.gms.games.Players.LoadXpStreamResult(status) {

            final Status CW;
            final PlayersImpl.LoadXpStreamResultImpl Zp;

            public Status getStatus()
            {
                return CW;
            }

            
            {
                Zp = PlayersImpl.LoadXpStreamResultImpl.this;
                CW = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return ag(status);
    }

    private _cls1.CW()
    {
    }
}
