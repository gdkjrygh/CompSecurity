// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.infrastructure.lyft.ride.HeatmapMetaDTO;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideIdleView

class this._cls0
    implements Func1
{

    final DriverRideIdleView this$0;

    public Boolean call(HeatmapMetaDTO heatmapmetadto)
    {
        boolean flag;
        if (!Strings.isNullOrEmpty((String)Objects.firstNonNull(heatmapmetadto.getPrimeTimeRange(), "")))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public volatile Object call(Object obj)
    {
        return call((HeatmapMetaDTO)obj);
    }

    pMetaDTO()
    {
        this$0 = DriverRideIdleView.this;
        super();
    }
}
