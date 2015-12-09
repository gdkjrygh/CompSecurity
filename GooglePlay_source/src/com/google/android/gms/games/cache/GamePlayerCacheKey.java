// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.cache;

import com.google.android.gms.common.internal.Objects;
import java.util.Arrays;

public final class GamePlayerCacheKey
{

    private final String mExternalGameId;
    private final String mExternalPlayerId;

    public GamePlayerCacheKey(String s, String s1)
    {
        mExternalGameId = s;
        mExternalPlayerId = s1;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof GamePlayerCacheKey)
        {
            obj = (GamePlayerCacheKey)obj;
            flag = flag1;
            if (Objects.equal(mExternalPlayerId, ((GamePlayerCacheKey) (obj)).mExternalPlayerId))
            {
                flag = flag1;
                if (Objects.equal(mExternalGameId, ((GamePlayerCacheKey) (obj)).mExternalGameId))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mExternalPlayerId, mExternalGameId
        });
    }
}
