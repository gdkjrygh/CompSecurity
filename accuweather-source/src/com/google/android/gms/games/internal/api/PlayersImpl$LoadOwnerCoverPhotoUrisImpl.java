// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            PlayersImpl

private static abstract class _cls1.yG extends com.google.android.gms.games.hotoUrisImpl
{

    public com.google.android.gms.games.hotoUrisImpl O(Status status)
    {
        return new com.google.android.gms.games.Players.LoadOwnerCoverPhotoUrisResult(status) {

            final PlayersImpl.LoadOwnerCoverPhotoUrisImpl Qg;
            final Status yG;

            public Status getStatus()
            {
                return yG;
            }

            
            {
                Qg = PlayersImpl.LoadOwnerCoverPhotoUrisImpl.this;
                yG = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return O(status);
    }

    private _cls1.yG()
    {
    }
}
