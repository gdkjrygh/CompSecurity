// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.cache;


// Referenced classes of package com.google.android.gms.games.cache:
//            TransientDataHolderCache

public abstract class BaseSearchCache extends TransientDataHolderCache
{

    public BaseSearchCache(String as[])
    {
        super(as, 60000L, null, null);
    }

    public BaseSearchCache(String as[], byte byte0)
    {
        this(as);
    }

    protected final int getMaxCacheKeys()
    {
        return 3;
    }
}
