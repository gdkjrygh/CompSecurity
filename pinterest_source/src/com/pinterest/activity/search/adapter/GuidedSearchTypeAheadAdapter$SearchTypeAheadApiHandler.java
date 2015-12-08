// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.adapter;

import com.pinterest.activity.search.model.GuidedSearchTypeAheadItem;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import java.util.Collections;

// Referenced classes of package com.pinterest.activity.search.adapter:
//            GuidedSearchTypeAheadAdapter

public class searchTerm extends BaseApiResponseHandler
{

    private String searchTerm;
    final GuidedSearchTypeAheadAdapter this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        throwable = Collections.emptyList();
        GuidedSearchTypeAheadAdapter.access$600(GuidedSearchTypeAheadAdapter.this, searchTerm, throwable);
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        apiresponse = GuidedSearchTypeAheadItem.parseJsonData(apiresponse.getData());
        GuidedSearchTypeAheadAdapter.access$600(GuidedSearchTypeAheadAdapter.this, searchTerm, apiresponse);
    }

    public (String s)
    {
        this$0 = GuidedSearchTypeAheadAdapter.this;
        super();
        searchTerm = s;
        GuidedSearchTypeAheadAdapter.access$202(GuidedSearchTypeAheadAdapter.this, s);
    }
}
