// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.cache;

import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.games.config.G;

// Referenced classes of package com.google.android.gms.games.cache:
//            TransientDataHolderCache

public abstract class AppContentBaseCache extends TransientDataHolderCache
{

    private static final long DATA_LIFETIME_MS;

    public AppContentBaseCache(String as[], String s)
    {
        super(as, DATA_LIFETIME_MS, null, s);
    }

    protected final String getDebugColumn()
    {
        return mUniquenessColumn;
    }

    protected final int getMaxCacheKeys()
    {
        return 3;
    }

    static 
    {
        DATA_LIFETIME_MS = ((Long)G.appContentInMemoryCacheTimeout.get()).longValue();
    }
}
