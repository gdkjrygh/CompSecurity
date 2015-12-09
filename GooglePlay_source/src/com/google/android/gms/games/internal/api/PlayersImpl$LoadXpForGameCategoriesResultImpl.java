// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            PlayersImpl

private static abstract class <init> extends com.google.android.gms.games.esResultImpl
{

    public final volatile Result createFailedResult(final Status status)
    {
        return new com.google.android.gms.games.Players.LoadXpForGameCategoriesResult() {

            final PlayersImpl.LoadXpForGameCategoriesResultImpl this$0;
            final Status val$status;

            public final List getGameCategories()
            {
                return null;
            }

            public final Status getStatus()
            {
                return status;
            }

            public final long getXpForCategory(String s)
            {
                return -1L;
            }

            
            {
                this$0 = PlayersImpl.LoadXpForGameCategoriesResultImpl.this;
                status = status1;
                super();
            }
        };
    }

    private _cls1.val.status(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }

    _cls1.val.status(GoogleApiClient googleapiclient, byte byte0)
    {
        this(googleapiclient);
    }
}
