// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.adapter;

import com.pinterest.activity.search.model.GuidedSearchTypeAheadItem;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import java.util.Collections;

// Referenced classes of package com.pinterest.activity.search.adapter:
//            MultiObjectSearchTypeAheadAdapter

public class searchTerm extends BaseApiResponseHandler
{

    private String searchTerm;
    final MultiObjectSearchTypeAheadAdapter this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        throwable = Collections.emptyList();
        MultiObjectSearchTypeAheadAdapter.access$700(MultiObjectSearchTypeAheadAdapter.this, searchTerm, throwable);
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        apiresponse = GuidedSearchTypeAheadItem.parseJsonData(apiresponse.getData());
        MultiObjectSearchTypeAheadAdapter.access$700(MultiObjectSearchTypeAheadAdapter.this, searchTerm, apiresponse);
    }

    public (String s)
    {
        this$0 = MultiObjectSearchTypeAheadAdapter.this;
        super();
        searchTerm = s;
        MultiObjectSearchTypeAheadAdapter.access$202(MultiObjectSearchTypeAheadAdapter.this, s);
    }
}
