// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications.util;

import com.pinterest.common.async.BackgroundTask;
import com.pinterest.kit.data.DiskCache;
import com.pinterest.network.json.PinterestJsonArray;

class val.data extends BackgroundTask
{

    final val.data this$1;
    final Object val$data;

    public void run()
    {
        DiskCache.setJsonArray("RECENT_CONVERSATIONS", (PinterestJsonArray)val$data);
    }

    ()
    {
        this$1 = final_;
        val$data = Object.this;
        super();
    }
}
