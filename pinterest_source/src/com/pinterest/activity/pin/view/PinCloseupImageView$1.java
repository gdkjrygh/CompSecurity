// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import android.view.View;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.pin.view:
//            PinCloseupImageView

class this._cls0
    implements android.view.CloseupImageView._cls1
{

    final PinCloseupImageView this$0;

    public void onClick(View view)
    {
        Pinalytics.a(EventType.TAP, ElementType.FLASHLIGHT_SEARCH_ICON, ComponentType.PIN_CLOSEUP_GALLERY, null);
        Events.post(new ashlightSearchButtonEvent());
    }

    ashlightSearchButtonEvent()
    {
        this$0 = PinCloseupImageView.this;
        super();
    }
}
