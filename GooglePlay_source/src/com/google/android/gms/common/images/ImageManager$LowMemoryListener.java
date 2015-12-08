// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.support.v4.util.LruCache;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager

private static final class mBitmapMemoryCache
    implements ComponentCallbacks2
{

    private final size mBitmapMemoryCache;

    public final void onConfigurationChanged(Configuration configuration)
    {
    }

    public final void onLowMemory()
    {
        mBitmapMemoryCache.trimToSize(-1);
    }

    public final void onTrimMemory(int i)
    {
        if (i >= 60)
        {
            mBitmapMemoryCache.trimToSize(-1);
        } else
        if (i >= 20)
        {
            mBitmapMemoryCache.trimToSize(mBitmapMemoryCache.size() / 2);
            return;
        }
    }

    public I(I i)
    {
        mBitmapMemoryCache = i;
    }
}
