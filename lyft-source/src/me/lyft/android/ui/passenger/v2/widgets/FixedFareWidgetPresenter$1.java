// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.widgets;

import me.lyft.android.common.Strings;
import me.lyft.android.domain.payment.NullMoney;
import me.lyft.android.domain.ride.FixedFare;
import me.lyft.android.domain.ride.PreRideInfo;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger.v2.widgets:
//            FixedFareWidgetPresenter

class this._cls0
    implements Action1
{

    final FixedFareWidgetPresenter this$0;

    public volatile void call(Object obj)
    {
        call((PreRideInfo)obj);
    }

    public void call(PreRideInfo prerideinfo)
    {
        Object obj = FixedFare.findFareByPartySize(prerideinfo.getFares(), 1);
        ((xedFareView)FixedFareWidgetPresenter.access$000(FixedFareWidgetPresenter.this)).setFarePrice(((FixedFare) (obj)).getTotalMoney());
        prerideinfo = ((FixedFare) (obj)).getComparisonMoney();
        obj = ((FixedFare) (obj)).getComparisonText();
        if (NullMoney.isNull(prerideinfo) || Strings.isNullOrEmpty(((String) (obj))))
        {
            ((xedFareView)FixedFareWidgetPresenter.access$100(FixedFareWidgetPresenter.this)).showComparisonLabel(false);
            return;
        } else
        {
            ((xedFareView)FixedFareWidgetPresenter.access$200(FixedFareWidgetPresenter.this)).setComparisonLabel(prerideinfo, ((String) (obj)));
            ((xedFareView)FixedFareWidgetPresenter.access$300(FixedFareWidgetPresenter.this)).showComparisonLabel(true);
            return;
        }
    }

    xedFareView()
    {
        this$0 = FixedFareWidgetPresenter.this;
        super();
    }
}
