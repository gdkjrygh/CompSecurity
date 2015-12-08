// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.fragment;

import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.search.adapter.SearchCategoryAdapter;
import com.pinterest.activity.search.dialog.FilterDialog;
import com.pinterest.activity.search.event.GuidedSearchEvent;
import com.pinterest.activity.search.model.RelatedQueryItem;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.SearchFilter;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.schemas.event.ElementType;
import java.util.HashMap;
import org.lucasr.twowayview.TwoWayView;

// Referenced classes of package com.pinterest.activity.search.fragment:
//            GuidedPinSearchFragment

class this._cls0
    implements android.widget.tener
{

    final GuidedPinSearchFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        int j = GuidedPinSearchFragment.access$000(GuidedPinSearchFragment.this).getItemViewType(i);
        adapterview = new HashMap();
        if (j == 1)
        {
            view = (SearchFilter)GuidedPinSearchFragment.access$000(GuidedPinSearchFragment.this).getItem(i);
            GuidedSearchEvent guidedsearchevent = new GuidedSearchEvent(null, com.pinterest.activity.search.event.pe.PIN);
            guidedsearchevent.setActionFilter(view);
            guidedsearchevent.setDominantColor(view.getDominantColorWithDefault());
            guidedsearchevent.setForceRefresh(true);
            adapterview.put("filter_type", view.getType());
            adapterview.put("label", view.getTypeValue());
            Pinalytics.a(ElementType.SEARCH_ACTION_SUGGESTION, adapterview);
            StopWatch.get().start("search_ttrfp");
            Events.post(guidedsearchevent);
        } else
        {
            if (j == 2)
            {
                SearchFilter searchfilter = (SearchFilter)GuidedPinSearchFragment.access$000(GuidedPinSearchFragment.this).getItem(i);
                view = FilterDialog.newInstance(searchfilter, i, _categoryListView.getMeasuredHeight(), GuidedPinSearchFragment.access$100(GuidedPinSearchFragment.this, view));
                view.setForceFullWidthOnTablet(true);
                adapterview.put("filter_type", searchfilter.getType());
                adapterview.put("label", searchfilter.getTypeValue());
                Pinalytics.a(ElementType.SEARCH_FILTER_DROPDOWNBUTTON, adapterview);
                Events.post(new DialogEvent(view));
                return;
            }
            view = (RelatedQueryItem)GuidedPinSearchFragment.access$000(GuidedPinSearchFragment.this).getItem(i);
            if (view != null)
            {
                adapterview.put("result_index", String.valueOf(i));
                adapterview.put("label", view.getTerm());
                Pinalytics.a(ElementType.SEARCH_GUIDE_SUGGESTION, adapterview);
                boolean flag;
                if (view.getPosition() == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                adapterview = new GuidedSearchEvent(view.getTerm(), com.pinterest.activity.search.event.pe.PIN);
                adapterview.setTokenFilter(true);
                adapterview.setTokenFront(flag);
                adapterview.setDominantColor(view.getDominantColor());
                adapterview.setFilterIndex(i);
                StopWatch.get().start("search_ttrfp");
                Events.post(adapterview);
                return;
            }
        }
    }

    ()
    {
        this$0 = GuidedPinSearchFragment.this;
        super();
    }
}
