// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            GamesMetadataImpl

private static abstract class _cls1.yG extends com.google.android.gms.games.dedGamesImpl
{

    public com.google.android.gms.games.dedGamesImpl B(Status status)
    {
        return new com.google.android.gms.games.GamesMetadata.LoadExtendedGamesResult(status) {

            final GamesMetadataImpl.LoadExtendedGamesImpl Px;
            final Status yG;

            public Status getStatus()
            {
                return yG;
            }

            public void release()
            {
            }

            
            {
                Px = GamesMetadataImpl.LoadExtendedGamesImpl.this;
                yG = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return B(status);
    }

    private _cls1.yG()
    {
    }
}
