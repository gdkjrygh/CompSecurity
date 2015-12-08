// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.adapter;

import com.pinterest.activity.search.model.GuidedSearchTypeAheadItem;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;

// Referenced classes of package com.pinterest.activity.search.adapter:
//            MultiObjectSearchTypeAheadAdapter

public class this._cls0 extends BaseApiResponseHandler
{

    final MultiObjectSearchTypeAheadAdapter this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        throwable = GuidedSearchTypeAheadItem.parseTrendingQueryData(new Object());
        MultiObjectSearchTypeAheadAdapter.access$800(MultiObjectSearchTypeAheadAdapter.this, throwable);
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        apiresponse = GuidedSearchTypeAheadItem.parseTrendingQueryData(apiresponse.getData());
        MultiObjectSearchTypeAheadAdapter.access$800(MultiObjectSearchTypeAheadAdapter.this, apiresponse);
    }

    public ()
    {
        this$0 = MultiObjectSearchTypeAheadAdapter.this;
        super();
    }
}
