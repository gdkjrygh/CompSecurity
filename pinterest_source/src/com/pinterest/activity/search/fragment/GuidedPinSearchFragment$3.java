// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.fragment;

import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Interest;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.schemas.event.EventType;
import com.pinterest.ui.actionbar.MetadataBar;
import java.util.HashMap;

// Referenced classes of package com.pinterest.activity.search.fragment:
//            GuidedPinSearchFragment

class this._cls0
    implements com.pinterest.base.PinSearchFragment._cls3
{

    final GuidedPinSearchFragment this$0;

    public void onEventMainThread(com.pinterest.api.model.archFragment._cls3 _pcls3)
    {
        _pcls3 = _pcls3.terest();
        if (_pcls3 != null && GuidedPinSearchFragment.access$300(GuidedPinSearchFragment.this) != null && _pcls3.getUid() == GuidedPinSearchFragment.access$300(GuidedPinSearchFragment.this).getUid())
        {
            GuidedPinSearchFragment.access$302(GuidedPinSearchFragment.this, _pcls3);
            HashMap hashmap;
            if (GuidedPinSearchFragment.access$300(GuidedPinSearchFragment.this).getFollowing().booleanValue())
            {
                _pcls3 = EventType.TOPIC_IN_SEARCH_INTEREST_FOLLOW;
            } else
            {
                _pcls3 = EventType.TOPIC_IN_SEARCH_INTEREST_UNFOLLOW;
            }
            hashmap = new HashMap();
            hashmap.put("interest", GuidedPinSearchFragment.access$300(GuidedPinSearchFragment.this).getUrlName());
            Pinalytics.a(_pcls3, null, null, hashmap);
            if (_metadataBar != null)
            {
                _metadataBar.setModel(GuidedPinSearchFragment.access$300(GuidedPinSearchFragment.this));
                return;
            }
        }
    }

    public void onEventMainThread(com.pinterest.ui.grid. )
    {
        StopWatch.get().complete("search_ttrfp");
        Events.unregister(GuidedPinSearchFragment.access$200(GuidedPinSearchFragment.this), new Class[] {
            com/pinterest/ui/grid/PinGridCell$ImageLoadEvent
        });
    }

    ()
    {
        this$0 = GuidedPinSearchFragment.this;
        super();
    }
}
