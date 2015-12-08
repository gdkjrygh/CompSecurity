// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.network.json.PinterestJsonArray;

// Referenced classes of package com.pinterest.activity.explore:
//            ContextualExploreFragment

public class this._cls0 extends BaseApiResponseHandler
{

    final ContextualExploreFragment this$0;

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        class _cls1 extends BackgroundTask
        {

            private ArrayList result;
            final ContextualExploreFragment.ContextualItemsApiHandler this$1;
            final PinterestJsonArray val$dataArray;

            public void onFinish()
            {
                super.onFinish();
                ContextualExploreFragment.access$000(this$0, result);
            }

            public void run()
            {
                result = ContextualItem.parseContextualItemList(dataArray);
                DiskCache.setJsonArray("CONTEXTUAL_EXPLORE", dataArray);
            }

            _cls1()
            {
                this$1 = ContextualExploreFragment.ContextualItemsApiHandler.this;
                dataArray = pinterestjsonarray;
                super();
                result = null;
            }
        }

        (new _cls1()).execute();
    }

    public _cls1()
    {
        this$0 = ContextualExploreFragment.this;
        super();
    }
}
