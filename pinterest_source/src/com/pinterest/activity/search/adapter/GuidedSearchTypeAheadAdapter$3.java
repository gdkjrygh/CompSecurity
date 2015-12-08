// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.adapter;

import android.text.TextUtils;
import java.util.List;

// Referenced classes of package com.pinterest.activity.search.adapter:
//            GuidedSearchTypeAheadAdapter

class val.newData
    implements Runnable
{

    final GuidedSearchTypeAheadAdapter this$0;
    final List val$newData;
    final String val$searchTerm;

    public void run()
    {
        if (TextUtils.equals(val$searchTerm, GuidedSearchTypeAheadAdapter.access$200(GuidedSearchTypeAheadAdapter.this)))
        {
            GuidedSearchTypeAheadAdapter.access$300(GuidedSearchTypeAheadAdapter.this, val$newData);
            if (GuidedSearchTypeAheadAdapter.access$400(GuidedSearchTypeAheadAdapter.this) == com.pinterest.api.remote.eadAdapter || GuidedSearchTypeAheadAdapter.access$400(GuidedSearchTypeAheadAdapter.this) == com.pinterest.api.remote.eadAdapter)
            {
                GuidedSearchTypeAheadAdapter.access$502(GuidedSearchTypeAheadAdapter.this, GuidedSearchTypeAheadAdapter.access$100(GuidedSearchTypeAheadAdapter.this));
            }
            notifyDataSetChanged();
        }
    }

    ()
    {
        this$0 = final_guidedsearchtypeaheadadapter;
        val$searchTerm = s;
        val$newData = List.this;
        super();
    }
}
