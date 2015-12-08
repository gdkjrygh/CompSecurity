// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore;

import com.pinterest.activity.explore.adapter.ContextualExploreAdapter;
import com.pinterest.activity.explore.adapter.ExploreBaseAdapter;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.model.ContextualItem;
import com.pinterest.ui.grid.PinterestGridView;

// Referenced classes of package com.pinterest.activity.explore:
//            ContextualExploreFragment

public class _item extends BaseApiResponseHandler
{

    private ContextualItem _item;
    final ContextualExploreFragment this$0;

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        ContextualItem.updateRelatedObjects(apiresponse.getData(), _item);
        ((ExploreBaseAdapter)ContextualExploreFragment.access$100(ContextualExploreFragment.this)).resetCachedItemHeights();
        ((ContextualExploreAdapter)ContextualExploreFragment.access$200(ContextualExploreFragment.this)).updateContextualItem(_item);
        if (ContextualExploreFragment.access$300(ContextualExploreFragment.this) != null)
        {
            ContextualExploreFragment.access$400(ContextualExploreFragment.this).reset();
        }
    }

    public a(ContextualItem contextualitem)
    {
        this$0 = ContextualExploreFragment.this;
        super();
        _item = contextualitem;
    }
}
