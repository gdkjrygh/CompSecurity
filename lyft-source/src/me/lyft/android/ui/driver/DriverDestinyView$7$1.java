// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.application.ride.IDestinyService;
import me.lyft.android.common.Unit;
import me.lyft.android.errorhandling.IDefaultErrorHandler;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.dialogs.DialogResult;
import me.lyft.android.ui.ride.RideMap;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverDestinyView

class this._cls1 extends AsyncCall
{

    final Map this$1;

    public void onFail(Throwable throwable)
    {
        super.onFail(throwable);
        defaultErrorHandler.handle(throwable);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Unit)obj);
    }

    public void onSuccess(Unit unit)
    {
        super.onSuccess(unit);
        rideMap.clearDestinationMarker();
        rideMap.clearPickupMarker();
        rideMap.clearRoutes();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class me/lyft/android/ui/driver/DriverDestinyView$7

/* anonymous class */
    class DriverDestinyView._cls7
        implements Action1
    {

        final DriverDestinyView this$0;

        public volatile void call(Object obj)
        {
            call((DialogResult)obj);
        }

        public void call(DialogResult dialogresult)
        {
            if (dialogresult.getButtonId() == 0x7f0d000b)
            {
                destinyService.exitDestiny().observeOn(AndroidSchedulers.mainThread()).subscribe(new DriverDestinyView._cls7._cls1());
            }
        }

            
            {
                this$0 = DriverDestinyView.this;
                super();
            }
    }

}
