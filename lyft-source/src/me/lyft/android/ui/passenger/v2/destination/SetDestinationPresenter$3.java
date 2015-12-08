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
        ((tDestinationAndConfirmView)SetDestinationPresenter.access$000(SetDestinationPresenter.this)).setDestinationAddressLoading();
        bind(reverseGeocode(location), new AsyncCall() {

            final SetDestinationPresenter._cls3 this$1;

            public void onFail(Throwable throwable)
            {
                ((SetDestinationPresenter.SetDestinationAndConfirmView)SetDestinationPresenter.access$200(this$0)).setDestinationAddressUnavailable();
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((String)obj);
            }

            public void onSuccess(String s)
            {
                ((SetDestinationPresenter.SetDestinationAndConfirmView)SetDestinationPresenter.access$100(this$0)).setDestinationAddress(s);
            }

            
            {
                this$1 = SetDestinationPresenter._cls3.this;
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
