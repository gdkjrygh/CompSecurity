// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.adapter;

import android.view.View;
import com.pinterest.activity.search.model.GuidedSearchTypeAheadItem;
import com.pinterest.api.remote.SearchApi;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.pinterest.activity.search.adapter:
//            GuidedSearchTypeAheadAdapter

class this._cls0
    implements android.view.SearchTypeAheadAdapter._cls5
{

    final GuidedSearchTypeAheadAdapter this$0;

    public void onClick(View view)
    {
        GuidedSearchTypeAheadItem guidedsearchtypeaheaditem = (GuidedSearchTypeAheadItem)view.getTag();
        .SwitchMap.com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType[guidedsearchtypeaheaditem.getItemType().ordinal()];
        JVM INSTR tableswitch 1 4: default 48
    //                   1 194
    //                   2 204
    //                   3 214
    //                   4 224;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        com.pinterest.activity.search.event._cls1 _lcls1;
        _lcls1 = com.pinterest.activity.search.event.N;
        view = "PIN";
_L7:
        SearchApi.d(guidedsearchtypeaheaditem.getTitle(), view, new leteRecentQueryApiResponse(GuidedSearchTypeAheadAdapter.this, null), GuidedSearchTypeAheadAdapter.access$800(GuidedSearchTypeAheadAdapter.this));
        if (GuidedSearchTypeAheadAdapter.access$100(GuidedSearchTypeAheadAdapter.this).get(_lcls1) != null && ((List)GuidedSearchTypeAheadAdapter.access$100(GuidedSearchTypeAheadAdapter.this).get(_lcls1)).remove(guidedsearchtypeaheaditem))
        {
            GuidedSearchTypeAheadAdapter.access$502(GuidedSearchTypeAheadAdapter.this, GuidedSearchTypeAheadAdapter.access$100(GuidedSearchTypeAheadAdapter.this));
            notifyDataSetChanged();
        }
        if (((List)GuidedSearchTypeAheadAdapter.access$100(GuidedSearchTypeAheadAdapter.this).get(_lcls1)).size() == 1)
        {
            ((List)GuidedSearchTypeAheadAdapter.access$100(GuidedSearchTypeAheadAdapter.this).get(com.pinterest.activity.search.event.N)).clear();
        }
        return;
_L2:
        _lcls1 = com.pinterest.activity.search.event.N;
        view = "PIN";
        continue; /* Loop/switch isn't completed */
_L3:
        _lcls1 = com.pinterest.activity.search.event.ARD;
        view = "BOARD";
        continue; /* Loop/switch isn't completed */
_L4:
        _lcls1 = com.pinterest.activity.search.event.NNER;
        view = "USER";
        continue; /* Loop/switch isn't completed */
_L5:
        _lcls1 = com.pinterest.activity.search.event.N;
        view = "PERSONAL";
        if (true) goto _L7; else goto _L6
_L6:
    }

    leteRecentQueryApiResponse()
    {
        this$0 = GuidedSearchTypeAheadAdapter.this;
        super();
    }
}
