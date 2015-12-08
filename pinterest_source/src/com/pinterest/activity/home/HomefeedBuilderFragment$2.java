// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home;

import com.pinterest.activity.search.event.GuidedSearchEvent;
import com.pinterest.activity.search.event.SearchSuggestionEvent;

// Referenced classes of package com.pinterest.activity.home:
//            HomefeedBuilderFragment

class this._cls0
    implements com.pinterest.base.agment._cls2
{

    final HomefeedBuilderFragment this$0;

    public void onEventMainThread(com.pinterest.activity.home.view.lowButton.InterestFollowEvent interestfollowevent)
    {
        onHomefeedInterestButtonFollow(interestfollowevent.getInterest());
    }

    public void onEventMainThread(GuidedSearchEvent guidedsearchevent)
    {
        if (guidedsearchevent.getQuery() != null && guidedsearchevent.getQuery().length() > 0)
        {
            enterSubmittedSearchMode();
            loadSubmittedSearchInterests(guidedsearchevent.getQuery());
            return;
        } else
        {
            enterBrowseMode();
            return;
        }
    }

    public void onEventMainThread(SearchSuggestionEvent searchsuggestionevent)
    {
        if (searchsuggestionevent.getType() == com.pinterest.activity.search.event.estionType.AUTO_COMPLETE)
        {
            enterSearchMode();
            loadSearchInterests(searchsuggestionevent.getQuery());
        } else
        if (searchsuggestionevent.getType() == com.pinterest.activity.search.event.estionType.RECENT_QUERY)
        {
            enterBrowseMode();
            return;
        }
    }

    ent()
    {
        this$0 = HomefeedBuilderFragment.this;
        super();
    }
}
