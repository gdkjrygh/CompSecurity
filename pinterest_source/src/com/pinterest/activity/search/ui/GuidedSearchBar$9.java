// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.ui;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.pinterest.activity.search.event.GuidedSearchEvent;
import com.pinterest.activity.search.event.SearchSuggestionEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.SearchFilter;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.pinterest.activity.search.ui:
//            GuidedSearchTokenView, GuidedSearchBar

class val.searchFilter
    implements android.view.er
{

    final GuidedSearchBar this$0;
    final SearchFilter val$searchFilter;
    final GuidedSearchTokenView val$tokenView;

    public void onClick(View view)
    {
        view = new HashMap();
        view.put("label", val$tokenView.getQuery());
        if (val$searchFilter != null)
        {
            view.put("filter_type", val$searchFilter.getType());
        }
        Pinalytics.a(ElementType.SEARCH_TOKEN, ComponentType.SEARCH_BOX, view);
        _searchEt.removeView(val$tokenView);
        GuidedSearchBar.access$600(GuidedSearchBar.this, val$tokenView.getQuery());
        view = val$tokenView.getSearchFilter();
        if (searchHintEnabled())
        {
            GuidedSearchBar.access$702(GuidedSearchBar.this, 0);
            if (view != null)
            {
                GuidedSearchBar.access$800(GuidedSearchBar.this).clear();
                if (_queryText.getText().toString().isEmpty())
                {
                    clearAllQueryTokens();
                }
                return;
            } else
            {
                setSearchBarRightDrawable(true);
                alignUserIcon(true);
                Events.post(new SearchSuggestionEvent(getCurrentTokenQuery(false), com.pinterest.activity.search.event.ent.SuggestionType.RECENT_QUERY));
                _queryText.setHint(GuidedSearchBar.access$400(GuidedSearchBar.this));
                _queryText.requestFocus();
                Device.showSoftKeyboard(_queryText);
                return;
            }
        }
        if (view != null)
        {
            if (view.getType().equals(com.pinterest.api.model.rType.MODE.getValue()))
            {
                view = new GuidedSearchEvent(getCurrentTokenQuery(true), GuidedSearchBar.access$300(GuidedSearchBar.this));
                GuidedSearchBar.access$802(GuidedSearchBar.this, new ArrayList());
                for (int i = 0; i < _searchEt.getChildCount() - 1; i++)
                {
                    ((GuidedSearchTokenView)_searchEt.getChildAt(i)).setSearchFilter(null);
                }

            } else
            {
                view = new GuidedSearchEvent(null, GuidedSearchBar.access$300(GuidedSearchBar.this));
                GuidedSearchBar.access$800(GuidedSearchBar.this).remove(val$tokenView.getSearchFilter());
            }
            view.setForceRefresh(true);
            if (GuidedSearchBar.access$300(GuidedSearchBar.this) == com.pinterest.activity.search.event.SearchType.PIN)
            {
                StopWatch.get().start("search_ttrfp");
            }
            Events.post(view);
            return;
        }
        view = new GuidedSearchEvent(getCurrentTokenQuery(false), GuidedSearchBar.access$300(GuidedSearchBar.this));
        if (GuidedSearchBar.access$800(GuidedSearchBar.this).size() > 0)
        {
            view.setForceRefresh(true);
        }
        if (GuidedSearchBar.access$300(GuidedSearchBar.this) == com.pinterest.activity.search.event.SearchType.PIN)
        {
            StopWatch.get().start("search_ttrfp");
        }
        Events.post(view);
    }

    iew()
    {
        this$0 = final_guidedsearchbar;
        val$tokenView = guidedsearchtokenview;
        val$searchFilter = SearchFilter.this;
        super();
    }
}
