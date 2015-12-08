// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import com.pinterest.analytics.Pinalytics;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinPlaceFragment

class this._cls0
    implements com.pinterest.kit.view.wGroupListener
{

    final PinPlaceFragment this$0;

    public void onLargeMapDragged()
    {
        Pinalytics.a(EventType.DRAG, ElementType.PLACE_VIEW_LARGE_MAP, ComponentType.PLACE_VIEW_MAP, null);
    }

    public void onSmallMapSwiped()
    {
        Pinalytics.a(EventType.SWIPE, ElementType.PLACE_VIEW_SMALL_MAP, ComponentType.PLACE_VIEW, null);
    }

    public void onSmallMapTapped()
    {
        Pinalytics.a(ElementType.PLACE_VIEW_SMALL_MAP, ComponentType.PLACE_VIEW);
    }

    r()
    {
        this$0 = PinPlaceFragment.this;
        super();
    }
}
