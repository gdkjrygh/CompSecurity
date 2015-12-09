// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.cache;

import com.google.android.gms.common.internal.Objects;
import java.util.Arrays;

public final class GameCompareCacheKey
{

    private final String mCollection;
    private final String mTargetPlayerId;

    public GameCompareCacheKey(String s, String s1)
    {
        mTargetPlayerId = s;
        mCollection = s1;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof GameCompareCacheKey)
        {
            obj = (GameCompareCacheKey)obj;
            flag = flag1;
            if (Objects.equal(mTargetPlayerId, ((GameCompareCacheKey) (obj)).mTargetPlayerId))
            {
                flag = flag1;
                if (Objects.equal(mCollection, ((GameCompareCacheKey) (obj)).mCollection))
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
            mTargetPlayerId, mCollection
        });
    }
}
