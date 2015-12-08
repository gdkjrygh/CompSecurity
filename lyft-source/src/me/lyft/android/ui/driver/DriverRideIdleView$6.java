// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.res.Resources;
import android.widget.LinearLayout;
import android.widget.TextView;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.infrastructure.lyft.ride.HeatmapMetaDTO;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideIdleView

class this._cls0
    implements Action1
{

    final DriverRideIdleView this$0;

    public volatile void call(Object obj)
    {
        call((HeatmapMetaDTO)obj);
    }

    public void call(HeatmapMetaDTO heatmapmetadto)
    {
        LinearLayout linearlayout;
        int i;
        if (!Strings.isNullOrEmpty((String)Objects.firstNonNull(heatmapmetadto.getPrimeTimeRange(), "")))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        linearlayout = heatmapHeader;
        if (i != 0)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        linearlayout.setVisibility(i);
        heatmapPrimeTimeRate.setText(getResources().getString(0x7f070190, new Object[] {
            Objects.firstNonNull(heatmapmetadto.getPrimeTimeRange(), "")
        }));
    }

    pMetaDTO()
    {
        this$0 = DriverRideIdleView.this;
        super();
    }
}
