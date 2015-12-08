// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.adapter;

import android.view.View;
import com.pinterest.api.remote.SearchApi;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.pinterest.activity.search.adapter:
//            GuidedSearchTypeAheadAdapter

class this._cls0
    implements android.view.SearchTypeAheadAdapter._cls4
{

    final GuidedSearchTypeAheadAdapter this$0;

    public void onClick(View view)
    {
        view = com.pinterest.activity.search.event.N;
        SearchApi.f("PERSONAL", new leteRecentQueryApiResponse(GuidedSearchTypeAheadAdapter.this, null), GuidedSearchTypeAheadAdapter.access$800(GuidedSearchTypeAheadAdapter.this));
        if (GuidedSearchTypeAheadAdapter.access$100(GuidedSearchTypeAheadAdapter.this).get(view) != null)
        {
            ((List)GuidedSearchTypeAheadAdapter.access$100(GuidedSearchTypeAheadAdapter.this).get(view)).clear();
            GuidedSearchTypeAheadAdapter.access$502(GuidedSearchTypeAheadAdapter.this, GuidedSearchTypeAheadAdapter.access$100(GuidedSearchTypeAheadAdapter.this));
            notifyDataSetChanged();
        }
    }

    leteRecentQueryApiResponse()
    {
        this$0 = GuidedSearchTypeAheadAdapter.this;
        super();
    }
}
