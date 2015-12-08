// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;

// Referenced classes of package com.millennialmedia.android:
//            AdCache, MMLog

static final class val.context
    implements Runnable
{

    final Context val$context;

    public void run()
    {
        MMLog.d("AdCache", "AdCache");
        AdCache.cleanUpExpiredAds(val$context);
        AdCache.cleanupCache(val$context);
    }

    (Context context1)
    {
        val$context = context1;
        super();
    }
}
