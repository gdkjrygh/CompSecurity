// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.common.Objects;
import me.lyft.android.controls.SwitcherSelection;
import me.lyft.android.domain.ride.FixedFare;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerCourierRideMatchingView

class this._cls0
    implements Func1
{

    final PassengerCourierRideMatchingView this$0;

    public Boolean call(SwitcherSelection switcherselection)
    {
        String s = PassengerCourierRideMatchingView.access$300(PassengerCourierRideMatchingView.this).getFixedFareToken();
        boolean flag;
        if (switcherselection.isUserAction() && !Objects.equals(((me.lyft.android.controls.)switcherselection.getSwitcherItem()).getId(), s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public volatile Object call(Object obj)
    {
        return call((SwitcherSelection)obj);
    }

    ()
    {
        this$0 = PassengerCourierRideMatchingView.this;
        super();
    }
}
