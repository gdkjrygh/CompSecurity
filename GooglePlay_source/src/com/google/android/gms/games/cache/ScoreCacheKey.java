// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.cache;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;

public final class ScoreCacheKey
{

    private final long mInstanceId;
    private final int mPageType;

    public ScoreCacheKey(long l, int i)
    {
        boolean flag1 = true;
        super();
        mInstanceId = l;
        boolean flag = flag1;
        if (i != 0)
        {
            if (i == 1)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        Preconditions.checkState(flag);
        mPageType = i;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof ScoreCacheKey)
        {
            obj = (ScoreCacheKey)obj;
            flag = flag1;
            if (Objects.equal(Long.valueOf(mInstanceId), Long.valueOf(((ScoreCacheKey) (obj)).mInstanceId)))
            {
                flag = flag1;
                if (Objects.equal(Integer.valueOf(mPageType), Integer.valueOf(((ScoreCacheKey) (obj)).mPageType)))
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
            Long.valueOf(mInstanceId), Integer.valueOf(mPageType)
        });
    }
}
