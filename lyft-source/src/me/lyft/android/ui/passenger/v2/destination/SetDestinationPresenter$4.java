// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.destination;

import me.lyft.android.domain.location.Location;
import me.lyft.android.rx.AsyncCall;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger.v2.destination:
//            SetDestinationPresenter

class this._cls0
    implements Action1
{

    final SetDestinationPresenter this$0;

    public volatile void call(Object obj)
    {
        call((Location)obj);
    }

    public void call(Location location)
    {
        ((tDestinationAndConfirmView)SetDestinationPresenter.access$300(SetDestinationPresenter.this)).setPickupAddressLoading();
        bind(reverseGeocode(location), new AsyncCall() {

            final SetDestinationPresenter._cls4 this$1;

            public void onFail(Throwable throwable)
            {
                ((SetDestinationPresenter.SetDestinationAndConfirmView)SetDestinationPresenter.access$500(this$0)).setPickupAddressUnavailable();
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((String)obj);
            }

            public void onSuccess(String s)
            {
                ((SetDestinationPresenter.SetDestinationAndConfirmView)SetDestinationPresenter.access$400(this$0)).setPickupAddress(s);
            }

            
            {
                this$1 = SetDestinationPresenter._cls4.this;
                super();
            }
        });
    }

    _cls1.this._cls1()
    {
        this$0 = SetDestinationPresenter.this;
        super();
    }
}
