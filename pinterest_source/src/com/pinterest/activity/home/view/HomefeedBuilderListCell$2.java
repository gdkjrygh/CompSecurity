// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home.view;

import com.pinterest.activity.home.util.HomefeedBuilderData;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.schemas.event.EventType;
import org.lucasr.twowayview.TwoWayView;

// Referenced classes of package com.pinterest.activity.home.view:
//            HomefeedBuilderListCell

class this._cls0
    implements org.lucasr.twowayview.r
{

    final HomefeedBuilderListCell this$0;

    public void onScroll(TwoWayView twowayview, int i, int j, int k)
    {
    }

    public void onScrollStateChanged(TwoWayView twowayview, int i)
    {
        if (i != 0)
        {
            Pinalytics.a(EventType.HOMEFEED_BUILDER_PIN_GRID_SCROLL, null, null, HomefeedBuilderData.getAuxData(HomefeedBuilderListCell.access$000(HomefeedBuilderListCell.this), HomefeedBuilderListCell.access$100(HomefeedBuilderListCell.this)));
        }
    }

    ()
    {
        this$0 = HomefeedBuilderListCell.this;
        super();
    }
}
