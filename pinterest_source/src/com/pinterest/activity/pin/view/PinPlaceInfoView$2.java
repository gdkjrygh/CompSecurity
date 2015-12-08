// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import android.view.View;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.Place;
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
        Pinalytics.a(ElementType.PLACE_VIEW_PHONE_BUTTON, ComponentType.PLACE_VIEW, PinPlaceInfoView.access$000(PinPlaceInfoView.this).getUid());
        ActivityHelper.goIntentView(getContext(), (new StringBuilder("tel:")).append(PinPlaceInfoView.access$100(PinPlaceInfoView.this).getPhone()).toString());
    }

    ()
    {
        this$0 = PinPlaceInfoView.this;
        super();
    }
}
