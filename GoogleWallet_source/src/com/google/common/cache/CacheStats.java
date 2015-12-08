// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

public final class CacheStats
{

    private final long evictionCount;
    private final long hitCount;
    private final long loadExceptionCount;
    private final long loadSuccessCount;
    private final long missCount;
    private final long totalLoadTime;

    public CacheStats(long l, long l1, long l2, long l3, long l4, long l5)
    {
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (l1 >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (l2 >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (l3 >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (l4 >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (l5 >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        hitCount = l;
        missCount = l1;
        loadSuccessCount = l2;
        loadExceptionCount = l3;
        totalLoadTime = l4;
        evictionCount = l5;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof CacheStats)
        {
            obj = (CacheStats)obj;
            flag = flag1;
            if (hitCount == ((CacheStats) (obj)).hitCount)
            {
                flag = flag1;
                if (missCount == ((CacheStats) (obj)).missCount)
                {
                    flag = flag1;
                    if (loadSuccessCount == ((CacheStats) (obj)).loadSuccessCount)
                    {
                        flag = flag1;
                        if (loadExceptionCount == ((CacheStats) (obj)).loadExceptionCount)
                        {
                            flag = flag1;
                            if (totalLoadTime == ((CacheStats) (obj)).totalLoadTime)
                            {
                                flag = flag1;
                                if (evictionCount == ((CacheStats) (obj)).evictionCount)
                                {
                                    flag = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return Objects.hashCode(new Object[] {
            Long.valueOf(hitCount), Long.valueOf(missCount), Long.valueOf(loadSuccessCount), Long.valueOf(loadExceptionCount), Long.valueOf(totalLoadTime), Long.valueOf(evictionCount)
        });
    }

    public final String toString()
    {
        return Objects.toStringHelper(this).add("hitCount", hitCount).add("missCount", missCount).add("loadSuccessCount", loadSuccessCount).add("loadExceptionCount", loadExceptionCount).add("totalLoadTime", totalLoadTime).add("evictionCount", evictionCount).toString();
    }
}
