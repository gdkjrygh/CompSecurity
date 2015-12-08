// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore.util;

import com.pinterest.api.model.Interest;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.kit.data.DiskCache;
import com.pinterest.network.json.PinterestJsonArray;
import java.util.ArrayList;

class val.data extends BackgroundTask
{

    ArrayList interests;
    final val.data this$0;
    final Object val$data;

    public void onFinish()
    {
        super.onFinish();
        Success(interests);
    }

    public void run()
    {
        interests = Interest.makeAllFromExploreData((PinterestJsonArray)val$data, false);
        DiskCache.setJsonArray("EXPLORE_TOPIC_DATA", (PinterestJsonArray)val$data);
    }

    ()
    {
        this$0 = final_;
        val$data = Object.this;
        super();
    }
}
