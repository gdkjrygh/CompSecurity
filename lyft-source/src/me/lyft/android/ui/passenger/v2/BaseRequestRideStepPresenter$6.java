// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2;

import me.lyft.android.ui.ride.RideMap;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger.v2:
//            BaseRequestRideStepPresenter

class this._cls0
    implements Action1
{

    final BaseRequestRideStepPresenter this$0;

    public void call(Integer integer)
    {
        BaseRequestRideStepPresenter.access$000(BaseRequestRideStepPresenter.this).setBottomPadding(integer.intValue());
    }

    public volatile void call(Object obj)
    {
        call((Integer)obj);
    }

    ()
    {
        this$0 = BaseRequestRideStepPresenter.this;
        super();
    }
}
