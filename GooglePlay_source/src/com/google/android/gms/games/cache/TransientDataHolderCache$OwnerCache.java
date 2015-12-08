// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.cache;

import android.support.v4.util.LruCache;

// Referenced classes of package com.google.android.gms.games.cache:
//            TransientDataHolderCache

private final class this._cls0 extends LruCache
{

    final TransientDataHolderCache this$0;

    protected final volatile Object create$7713a341()
    {
        return new LruCache(getMaxCacheKeys());
    }

    protected final volatile void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
    {
        obj = (LruCache)obj1;
        obj1 = (LruCache)obj2;
        if (flag && obj != null && obj1 == null)
        {
            ((LruCache) (obj)).trimToSize(-1);
        }
    }

    public (int i)
    {
        this$0 = TransientDataHolderCache.this;
        super(4);
    }
}
