// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v4.util.LruCache;

// Referenced classes of package android.support.v7.internal.widget:
//            TintManager

private static final class  extends LruCache
{

    static int generateCacheKey(int i, android.graphics.lorFilterLruCache lorfilterlrucache)
    {
        return (i + 31) * 31 + lorfilterlrucache.lorFilterLruCache();
    }

    public ()
    {
        super(6);
    }
}
