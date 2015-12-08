// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.pickup;

import me.lyft.android.domain.location.Location;
import me.lyft.android.rx.AsyncCall;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger.v2.pickup:
//            SetPickupPresenter

class this._cls0
    implements Action1
{

    final SetPickupPresenter this$0;

    public volatile void call(Object obj)
    {
        call((Location)obj);
    }

    public void call(Location location)
    {
        ((ckupView)SetPickupPresenter.access$000(SetPickupPresenter.this)).setPickupAddressLoading();
        bind(reverseGeocode(location), new AsyncCall() {

            final SetPickupPresenter._cls1 this$1;

            public void onFail(Throwable throwable)
            {
                ((SetPickupPresenter.PickupView)SetPickupPresenter.access$200(this$0)).setPickupAddressUnavailable();
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((String)obj);
            }

            public void onSuccess(String s)
            {
                ((SetPickupPresenter.PickupView)SetPickupPresenter.access$100(this$0)).setPickupAddress(s);
            }

            
            {
                this$1 = SetPickupPresenter._cls1.this;
                super();
            }
        });
    }

    _cls1.this._cls1()
    {
        this$0 = SetPickupPresenter.this;
        super();
    }
}
