// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.widgets;

import me.lyft.android.domain.ride.FareEstimate;
import me.lyft.android.domain.ride.PreRideInfo;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger.v2.widgets:
//            PriceEstimatePresenter

class this._cls0
    implements Action1
{

    final PriceEstimatePresenter this$0;

    public volatile void call(Object obj)
    {
        call((PreRideInfo)obj);
    }

    public void call(PreRideInfo prerideinfo)
    {
        prerideinfo = prerideinfo.getFareEstimate();
        if (prerideinfo.isNull())
        {
            ((iceEstimateView)PriceEstimatePresenter.access$000(PriceEstimatePresenter.this)).showNeedsEstimate(true);
            return;
        } else
        {
            ((iceEstimateView)PriceEstimatePresenter.access$100(PriceEstimatePresenter.this)).showNeedsEstimate(false);
            ((iceEstimateView)PriceEstimatePresenter.access$200(PriceEstimatePresenter.this)).setEstimate(prerideinfo.getHighMoney(), prerideinfo.getLowMoney());
            return;
        }
    }

    iceEstimateView()
    {
        this$0 = PriceEstimatePresenter.this;
        super();
    }
}
