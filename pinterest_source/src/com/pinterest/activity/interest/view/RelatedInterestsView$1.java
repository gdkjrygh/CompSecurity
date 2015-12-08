// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.interest.view;

import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Interest;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import java.util.HashMap;

// Referenced classes of package com.pinterest.activity.interest.view:
//            RelatedInterestsView

class this._cls0
    implements android.widget.Listener
{

    final RelatedInterestsView this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = new HashMap();
        view = (Interest)RelatedInterestsView.access$000(RelatedInterestsView.this).getItem(i);
        if (view == null)
        {
            return;
        } else
        {
            adapterview.put("interest", view.getUrlName());
            Pinalytics.a(ElementType.FLOWED_INTEREST, ComponentType.INTEREST_RELATED_CAROUSEL, adapterview);
            StopWatch.get().start("interest_ttrfp");
            Events.post(new Navigation(Location.INTEREST, view));
            return;
        }
    }

    A()
    {
        this$0 = RelatedInterestsView.this;
        super();
    }
}
