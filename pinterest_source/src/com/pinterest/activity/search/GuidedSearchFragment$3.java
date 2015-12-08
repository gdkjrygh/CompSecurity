// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search;

import com.pinterest.activity.commerce.view.PricePickerIcon;
import com.pinterest.activity.search.event.GuidedSearchEvent;
import com.pinterest.activity.search.event.SearchSuggestionEvent;

// Referenced classes of package com.pinterest.activity.search:
//            GuidedSearchFragment

class this._cls0
    implements com.pinterest.base.
{

    final GuidedSearchFragment this$0;

    public void onEventMainThread(com.pinterest.activity.commerce.ceUpdatedEvent ceupdatedevent)
    {
        if (GuidedSearchFragment.access$600(GuidedSearchFragment.this))
        {
            if ((ceupdatedevent = ceupdatedevent.getPrice()) == null || !ceupdatedevent.equals(_pricePicker.getPrice()))
            {
                _pricePicker.setPrice(ceupdatedevent);
                if (GuidedSearchFragment.access$800(GuidedSearchFragment.this) != null)
                {
                    GuidedSearchFragment.access$900(GuidedSearchFragment.this, GuidedSearchFragment.access$800(GuidedSearchFragment.this));
                    return;
                }
            }
        }
    }

    public void onEventMainThread(GuidedSearchEvent guidedsearchevent)
    {
        GuidedSearchFragment.access$500(GuidedSearchFragment.this, guidedsearchevent);
    }

    public void onEventMainThread(SearchSuggestionEvent searchsuggestionevent)
    {
        com.pinterest.api.remote.nt nt = com.pinterest.api.remote.nt;
        if (searchsuggestionevent.getType() == com.pinterest.activity.search.event.uggestionType.RECENT_QUERY)
        {
            if (GuidedSearchFragment.access$100(GuidedSearchFragment.this))
            {
                nt = com.pinterest.api.remote.nt;
            } else
            {
                nt = com.pinterest.api.remote.nt;
            }
        } else
        if (GuidedSearchFragment.access$100(GuidedSearchFragment.this))
        {
            nt = com.pinterest.api.remote.nt;
        } else
        {
            nt = com.pinterest.api.remote.nt;
        }
        GuidedSearchFragment.access$200(GuidedSearchFragment.this, searchsuggestionevent.getQuery(), nt);
        GuidedSearchFragment.access$300(GuidedSearchFragment.this);
        GuidedSearchFragment.access$400(GuidedSearchFragment.this, false);
    }

    public void onEventMainThread(com.pinterest.fragment.eedLoadedEvent eedloadedevent)
    {
        if (GuidedSearchFragment.access$600(GuidedSearchFragment.this) && eedloadedevent.getCount() > 0)
        {
            GuidedSearchFragment.access$700(GuidedSearchFragment.this);
        }
    }

    edEvent()
    {
        this$0 = GuidedSearchFragment.this;
        super();
    }
}
