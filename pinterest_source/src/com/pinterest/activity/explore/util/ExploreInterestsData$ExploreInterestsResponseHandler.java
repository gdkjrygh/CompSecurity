// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore.util;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.network.json.PinterestJsonArray;
import java.util.ArrayList;

// Referenced classes of package com.pinterest.activity.explore.util:
//            ExploreInterestsData

public class _cls1 extends ApiResponseHandler
{

    public void onSuccess(final ApiResponse data)
    {
        super.onSuccess(data);
        data = ((ApiResponse) (data.getData()));
        class _cls1 extends BackgroundTask
        {

            ArrayList interests;
            final ExploreInterestsData.ExploreInterestsResponseHandler this$0;
            final Object val$data;

            public void onFinish()
            {
                super.onFinish();
                onSuccess(interests);
            }

            public void run()
            {
                interests = Interest.makeAllFromExploreData((PinterestJsonArray)data, false);
                DiskCache.setJsonArray("EXPLORE_TOPIC_DATA", (PinterestJsonArray)data);
            }

            _cls1()
            {
                this$0 = ExploreInterestsData.ExploreInterestsResponseHandler.this;
                data = obj;
                super();
            }
        }

        if (data instanceof PinterestJsonArray)
        {
            (new _cls1()).execute();
        }
    }

    public void onSuccess(ArrayList arraylist)
    {
        ExploreInterestsData.access$000(ExploreInterestsData.get()).clear();
        ExploreInterestsData.access$000(ExploreInterestsData.get()).addAll(arraylist);
    }

    public _cls1()
    {
    }
}
