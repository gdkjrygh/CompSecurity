// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import android.view.View;
import android.widget.TextView;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Device;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ViewType;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinPlaceFragment

class ViewListener extends com.pinterest.ui.scrollview.w.ScrollViewListener
{

    final PinPlaceFragment this$0;

    public void onScroll(View view, int i, int j, int k, int l)
    {
        if (!PinPlaceFragment.access$400(PinPlaceFragment.this) && _relatedTitle.getVisibility() == 0)
        {
            _relatedTitle.getLocationOnScreen(PinPlaceFragment.access$500(PinPlaceFragment.this));
            i = PinPlaceFragment.access$500(PinPlaceFragment.this)[1];
            j = _relatedTitle.getMeasuredHeight() + i;
            k = (int)Device.getScreenHeight();
            if (i >= 0 && i <= k || j >= 0 && j <= k || i <= 0 && j >= k)
            {
                PinPlaceFragment.access$402(PinPlaceFragment.this, true);
                Pinalytics.a(ViewType.PLACE, ComponentType.PLACE_VIEW);
            }
        }
    }

    ViewListener()
    {
        this$0 = PinPlaceFragment.this;
        super();
    }
}
