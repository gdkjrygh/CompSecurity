// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import me.lyft.android.rx.ReactiveProperty;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            CourierBeReadyOutsideDialogView

class this._cls0
    implements Action1
{

    final CourierBeReadyOutsideDialogView this$0;

    public volatile void call(Object obj)
    {
        call((RideDTO)obj);
    }

    public void call(RideDTO ridedto)
    {
        ReactiveProperty reactiveproperty = CourierBeReadyOutsideDialogView.access$000(CourierBeReadyOutsideDialogView.this);
        boolean flag;
        if ("accepted".equalsIgnoreCase(ridedto.getStatus()) || "approaching".equalsIgnoreCase(ridedto.getStatus()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        reactiveproperty.onNext(Boolean.valueOf(flag));
    }

    ()
    {
        this$0 = CourierBeReadyOutsideDialogView.this;
        super();
    }
}
