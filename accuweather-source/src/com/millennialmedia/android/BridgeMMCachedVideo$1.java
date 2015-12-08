// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;
import org.json.JSONArray;

// Referenced classes of package com.millennialmedia.android:
//            BridgeMMCachedVideo, VideoAd, CachedAd

class > extends >
{

    final BridgeMMCachedVideo this$0;
    final JSONArray val$array;
    final Context val$context;

    boolean callback(CachedAd cachedad)
    {
        if ((cachedad instanceof VideoAd) && cachedad.isOnDisk(val$context) && !cachedad.isExpired())
        {
            val$array.put(cachedad.getId());
        }
        return true;
    }

    ()
    {
        this$0 = final_bridgemmcachedvideo;
        val$context = context1;
        val$array = JSONArray.this;
        super();
    }
}
