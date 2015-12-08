// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home.view;

import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.home.adapter.HomefeedBuilderPinGridAdapter;
import com.pinterest.activity.home.util.HomefeedBuilderData;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.home.view:
//            HomefeedBuilderListCell

class this._cls0
    implements android.widget.tener
{

    final HomefeedBuilderListCell this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = ((HomefeedBuilderPinGridAdapter)adapterview.getAdapter()).getItem(i);
        if (adapterview instanceof Pin)
        {
            Pinalytics.a(ElementType.HOMEFEED_BUILDER_PIN, ComponentType.INTEREST_GRID, HomefeedBuilderData.getAuxData(HomefeedBuilderListCell.access$000(HomefeedBuilderListCell.this), HomefeedBuilderListCell.access$100(HomefeedBuilderListCell.this)));
            Events.post(new Navigation(Location.PIN, adapterview));
        } else
        if (adapterview instanceof Interest)
        {
            Pinalytics.a(ElementType.HOMEFEED_BUILDER_SEE_MORE_BUTTON, ComponentType.INTEREST_GRID, HomefeedBuilderData.getAuxData(HomefeedBuilderListCell.access$000(HomefeedBuilderListCell.this), HomefeedBuilderListCell.access$100(HomefeedBuilderListCell.this)));
            Events.post(new Navigation(Location.INTEREST, adapterview));
            return;
        }
    }

    dapter()
    {
        this$0 = HomefeedBuilderListCell.this;
        super();
    }
}
