// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.cache;

import com.google.android.gms.common.data.TransientDataHolder;

// Referenced classes of package com.google.android.gms.games.cache:
//            TransientDataHolderCache

protected static final class expandedPrev
{

    public final TransientDataHolder data;
    public long dataLifetimeMillis;
    public boolean expandedNext;
    public boolean expandedPrev;
    public long lastUpdatedTimeMillis;
    public int statusCode;
    public int totalCount;
    public String totalCountKey;

    (TransientDataHolder transientdataholder, Integer integer, long l, long l1)
    {
        data = transientdataholder;
        statusCode = integer.intValue();
        totalCountKey = null;
        totalCount = -1;
        lastUpdatedTimeMillis = l;
        dataLifetimeMillis = l1;
        expandedNext = false;
        expandedPrev = false;
    }
}
