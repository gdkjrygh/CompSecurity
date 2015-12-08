// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import android.view.View;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.Place;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.pin.view:
//            PinPlaceInfoView

class this._cls0
    implements android.view.r
{

    final PinPlaceInfoView this$0;

    public void onClick(View view)
    {
        Pinalytics.a(ElementType.PLACE_VIEW_SITE_BUTTON, ComponentType.PLACE_VIEW, PinPlaceInfoView.access$000(PinPlaceInfoView.this).getUid());
        Events.post(new Navigation(Location.BROWSER, PinPlaceInfoView.access$100(PinPlaceInfoView.this).getUrl()));
    }

    ()
    {
        this$0 = PinPlaceInfoView.this;
        super();
    }
}
