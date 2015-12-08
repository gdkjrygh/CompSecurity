// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;

// Referenced classes of package com.millennialmedia.android:
//            AdCache, CachedAd, MMLog

static final class erator extends erator
{

    final Context val$context;

    boolean callback(CachedAd cachedad)
    {
        MMLog.d("AdCache", String.format("Deleting ad %s.", new Object[] {
            cachedad.getId()
        }));
        cachedad.delete(val$context);
        return true;
    }

    erator(Context context1)
    {
        val$context = context1;
        super();
    }
}
