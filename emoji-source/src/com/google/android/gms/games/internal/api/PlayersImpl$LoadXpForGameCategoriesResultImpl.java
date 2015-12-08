// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            PlayersImpl

private static abstract class _cls1.yJ extends com.google.android.gms.games.esResultImpl
{

    public com.google.android.gms.games.esResultImpl Q(Status status)
    {
        return new com.google.android.gms.games.Players.LoadXpForGameCategoriesResult(status) {

            final PlayersImpl.LoadXpForGameCategoriesResultImpl Ql;
            final Status yJ;

            public Status getStatus()
            {
                return yJ;
            }

            
            {
                Ql = PlayersImpl.LoadXpForGameCategoriesResultImpl.this;
                yJ = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return Q(status);
    }

    private _cls1.yJ()
    {
    }
}
