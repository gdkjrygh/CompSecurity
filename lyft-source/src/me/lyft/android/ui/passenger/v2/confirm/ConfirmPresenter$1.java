// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.confirm;

import me.lyft.android.domain.location.Location;
import me.lyft.android.rx.AsyncCall;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger.v2.confirm:
//            ConfirmPresenter

class this._cls0
    implements Action1
{

    final ConfirmPresenter this$0;

    public volatile void call(Object obj)
    {
        call((Location)obj);
    }

    public void call(Location location)
    {
        ((nfirmView)ConfirmPresenter.access$000(ConfirmPresenter.this)).setDestinationAddressLoading();
        bind(reverseGeocode(location), new AsyncCall() {

            final ConfirmPresenter._cls1 this$1;

            public void onFail(Throwable throwable)
            {
                ((ConfirmPresenter.ConfirmView)ConfirmPresenter.access$200(this$0)).setDestinationAddressUnavailable();
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((String)obj);
            }

            public void onSuccess(String s)
            {
                ((ConfirmPresenter.ConfirmView)ConfirmPresenter.access$100(this$0)).setDestinationAddress(s);
            }

            
            {
                this$1 = ConfirmPresenter._cls1.this;
                super();
            }
        });
    }

    _cls1.this._cls1()
    {
        this$0 = ConfirmPresenter.this;
        super();
    }
}
