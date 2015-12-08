// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.cache;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.games.broker.Agents;
import java.util.Arrays;

public final class ScoreCacheOwner
{

    private ClientContext mClientContext;
    private String mExternalLeaderboardId;

    public ScoreCacheOwner(ClientContext clientcontext, String s)
    {
        mClientContext = clientcontext;
        mExternalLeaderboardId = s;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof ScoreCacheOwner)
        {
            if (Agents.areSameCaller(mClientContext, ((ScoreCacheOwner) (obj = (ScoreCacheOwner)obj)).mClientContext) && Objects.equal(mExternalLeaderboardId, ((ScoreCacheOwner) (obj)).mExternalLeaderboardId))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mClientContext.mAuthPackageName, mClientContext.mResolvedAccount, Integer.valueOf(mClientContext.mCallingUid), mExternalLeaderboardId
        });
    }
}
