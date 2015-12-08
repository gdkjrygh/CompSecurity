// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.fragment;

import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.search.adapter.SearchCategoryAdapter;
import com.pinterest.activity.search.event.GuidedSearchEvent;
import com.pinterest.activity.search.model.RelatedQueryItem;
import com.pinterest.base.Events;
import org.lucasr.twowayview.TwoWayView;

// Referenced classes of package com.pinterest.activity.search.fragment:
//            GuidedBoardSearchFragment

class this._cls0
    implements android.widget.ner
{

    final GuidedBoardSearchFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (RelatedQueryItem)GuidedBoardSearchFragment.access$000(GuidedBoardSearchFragment.this).getItem(i);
        boolean flag;
        if (adapterview.getPosition() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = new GuidedSearchEvent(adapterview.getTerm(), com.pinterest.activity.search.event..BOARD);
        view.setTokenFilter(true);
        view.setTokenFront(flag);
        view.setDominantColor(adapterview.getDominantColor());
        Events.post(view);
        _categoryListView.setEnabled(false);
    }

    ()
    {
        this$0 = GuidedBoardSearchFragment.this;
        super();
    }
}
