// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.adapter;

import android.view.View;
import com.pinterest.api.remote.SearchApi;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.pinterest.activity.search.adapter:
//            MultiObjectSearchTypeAheadAdapter

class this._cls0
    implements android.view.SearchTypeAheadAdapter._cls7
{

    final MultiObjectSearchTypeAheadAdapter this$0;

    public void onClick(View view)
    {
        view = com.pinterest.activity.search.event._fld1;
        SearchApi.f("PIN", new leteRecentQueryApiResponse(MultiObjectSearchTypeAheadAdapter.this, null), MultiObjectSearchTypeAheadAdapter.access$1000(MultiObjectSearchTypeAheadAdapter.this));
        if (MultiObjectSearchTypeAheadAdapter.access$100(MultiObjectSearchTypeAheadAdapter.this).get(view) != null)
        {
            ((List)MultiObjectSearchTypeAheadAdapter.access$100(MultiObjectSearchTypeAheadAdapter.this).get(view)).clear();
            MultiObjectSearchTypeAheadAdapter.access$502(MultiObjectSearchTypeAheadAdapter.this, MultiObjectSearchTypeAheadAdapter.access$100(MultiObjectSearchTypeAheadAdapter.this));
            notifyDataSetChanged();
        }
    }

    leteRecentQueryApiResponse()
    {
        this$0 = MultiObjectSearchTypeAheadAdapter.this;
        super();
    }
}
