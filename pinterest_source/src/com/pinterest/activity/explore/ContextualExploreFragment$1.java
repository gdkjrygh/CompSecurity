// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore;

import com.pinterest.api.model.ContextualItem;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.kit.data.DiskCache;
import java.util.ArrayList;

// Referenced classes of package com.pinterest.activity.explore:
//            ContextualExploreFragment

class result extends BackgroundTask
{

    private ArrayList result;
    final ContextualExploreFragment this$0;

    public void onFinish()
    {
        ContextualExploreFragment.access$000(ContextualExploreFragment.this, result);
    }

    public void run()
    {
        com.pinterest.network.json.PinterestJsonArray pinterestjsonarray = DiskCache.getJsonArray("CONTEXTUAL_EXPLORE");
        if (pinterestjsonarray != null)
        {
            result = ContextualItem.parseContextualItemList(pinterestjsonarray);
        }
    }

    ()
    {
        this$0 = ContextualExploreFragment.this;
        super();
        result = null;
    }
}
