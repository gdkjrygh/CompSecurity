// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.fragment;

import com.pinterest.activity.search.adapter.GuidedSearchTypeAheadAdapter;
import com.pinterest.activity.search.ui.GuidedSearchBar;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.tab.TabBar;

// Referenced classes of package com.pinterest.activity.search.fragment:
//            SearchTypeaheadFragment

class this._cls0
    implements com.pinterest.ui.tab.peaheadFragment._cls1
{

    final SearchTypeaheadFragment this$0;

    public void onTabReselected(int i)
    {
    }

    public void onTabSelected(int i)
    {
        String s;
        ElementType elementtype;
        elementtype = ElementType.SEARCH_PINS_BUTTON;
        s = SearchTypeaheadFragment.access$400();
        i;
        JVM INSTR tableswitch 0 2: default 36
    //                   0 146
    //                   1 190
    //                   2 168;
           goto _L1 _L2 _L3 _L4
_L1:
        if (_tabBar != null)
        {
            _tabBar.setCurrentIndex(i);
        }
        SearchTypeaheadFragment.access$702(SearchTypeaheadFragment.this, i);
        if (SearchTypeaheadFragment.access$100(SearchTypeaheadFragment.this) != null)
        {
            SearchTypeaheadFragment.access$100(SearchTypeaheadFragment.this).setSearchHint(s);
            SearchTypeaheadFragment.access$100(SearchTypeaheadFragment.this).setSearchType(SearchTypeaheadFragment.access$300(SearchTypeaheadFragment.this));
        }
        Pinalytics.a(elementtype);
        if (SearchTypeaheadFragment.access$000(SearchTypeaheadFragment.this) != null)
        {
            SearchTypeaheadFragment.access$000(SearchTypeaheadFragment.this).setSearchType(SearchTypeaheadFragment.access$300(SearchTypeaheadFragment.this));
            SearchTypeaheadFragment.access$000(SearchTypeaheadFragment.this).notifyDataSetChanged();
        }
        return;
_L2:
        elementtype = ElementType.SEARCH_PINS_BUTTON;
        SearchTypeaheadFragment.access$302(SearchTypeaheadFragment.this, com.pinterest.activity.search.event.pe.PIN);
        s = SearchTypeaheadFragment.access$400();
        continue; /* Loop/switch isn't completed */
_L4:
        elementtype = ElementType.SEARCH_BOARDS_BUTTON;
        SearchTypeaheadFragment.access$302(SearchTypeaheadFragment.this, com.pinterest.activity.search.event.pe.BOARD);
        s = SearchTypeaheadFragment.access$500();
        continue; /* Loop/switch isn't completed */
_L3:
        elementtype = ElementType.SEARCH_PINNERS_BUTTON;
        SearchTypeaheadFragment.access$302(SearchTypeaheadFragment.this, com.pinterest.activity.search.event.pe.PINNER);
        s = SearchTypeaheadFragment.access$600();
        if (true) goto _L1; else goto _L5
_L5:
    }

    r()
    {
        this$0 = SearchTypeaheadFragment.this;
        super();
    }
}
