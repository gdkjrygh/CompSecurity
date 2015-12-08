// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.adapter;

import com.pinterest.experiment.Experiments;
import java.util.List;

// Referenced classes of package com.pinterest.activity.search.adapter:
//            SearchCategoryAdapter

class val.filterItems
    implements Runnable
{

    final SearchCategoryAdapter this$0;
    final List val$categoryItems;
    final List val$filterItems;

    public void run()
    {
        _categoryItems = val$categoryItems;
        if (Experiments.a())
        {
            _filterItems = val$filterItems;
        }
        notifyDataSetChanged();
    }

    ()
    {
        this$0 = final_searchcategoryadapter;
        val$categoryItems = list;
        val$filterItems = List.this;
        super();
    }
}
