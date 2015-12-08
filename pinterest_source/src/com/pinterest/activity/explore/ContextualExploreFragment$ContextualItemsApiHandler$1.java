// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore;

import com.pinterest.api.model.ContextualItem;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.kit.data.DiskCache;
import com.pinterest.network.json.PinterestJsonArray;
import java.util.ArrayList;

// Referenced classes of package com.pinterest.activity.explore:
//            ContextualExploreFragment

class result extends BackgroundTask
{

    private ArrayList result;
    final val.dataArray this$1;
    final PinterestJsonArray val$dataArray;

    public void onFinish()
    {
        super.onFinish();
        ContextualExploreFragment.access$000(_fld0, result);
    }

    public void run()
    {
        result = ContextualItem.parseContextualItemList(val$dataArray);
        DiskCache.setJsonArray("CONTEXTUAL_EXPLORE", val$dataArray);
    }

    ()
    {
        this$1 = final_;
        val$dataArray = PinterestJsonArray.this;
        super();
        result = null;
    }
}
