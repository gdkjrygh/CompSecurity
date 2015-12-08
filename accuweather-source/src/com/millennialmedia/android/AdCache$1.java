// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;
import java.util.Set;

// Referenced classes of package com.millennialmedia.android:
//            AdCache, CachedAd

static final class erator extends erator
{

    final Context val$context;
    final Set val$hashSet;

    boolean callback(CachedAd cachedad)
    {
        if (cachedad.acid != null && cachedad.getType() == 1 && cachedad.isOnDisk(val$context))
        {
            val$hashSet.add(cachedad.acid);
        }
        return true;
    }

    erator(Context context1, Set set)
    {
        val$context = context1;
        val$hashSet = set;
        super();
    }
}
