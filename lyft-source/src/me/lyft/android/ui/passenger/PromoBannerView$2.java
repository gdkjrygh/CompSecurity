// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import java.util.List;
import me.lyft.android.IUserSession;
import me.lyft.android.analytics.studies.RideAnalytics;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.domain.ride.RequestRideType;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.ride.BannerItemDTO;
import me.lyft.android.rx.ReactiveProperty;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PromoBannerView

class this._cls0
    implements Action1
{

    final PromoBannerView this$0;

    private void setBanner(BannerItemDTO banneritemdto, String s)
    {
        PromoBannerView.access$100(PromoBannerView.this).onNext(banneritemdto.getText());
        PromoBannerView.access$200(PromoBannerView.this).onNext(banneritemdto.getUrl());
        PromoBannerView.access$300(PromoBannerView.this).onNext(banneritemdto.getDeeplink());
        if (getVisibility() != 0)
        {
            setVisibility(0);
            RideAnalytics.trackPromoBannerShown(banneritemdto, s);
        }
    }

    public volatile void call(Object obj)
    {
        call((AppStateDTO)obj);
    }

    public void call(AppStateDTO appstatedto)
    {
        appstatedto = rideRequestSession.getCurrentRideType().getId();
        Object obj = userSession.getAppState().getBanners();
        if (obj == null || ((List) (obj)).isEmpty())
        {
            setVisibility(8);
            return;
        }
        obj = PromoBannerView.access$000(PromoBannerView.this, ((List) (obj)), appstatedto);
        if (obj == null)
        {
            setVisibility(8);
            return;
        } else
        {
            setBanner(((BannerItemDTO) (obj)), appstatedto);
            return;
        }
    }

    ()
    {
        this$0 = PromoBannerView.this;
        super();
    }
}
