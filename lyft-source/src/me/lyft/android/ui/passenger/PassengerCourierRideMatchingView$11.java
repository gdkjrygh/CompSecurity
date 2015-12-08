// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.controls.SwitcherSelection;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerCourierRideMatchingView

class this._cls0
    implements Func1
{

    final PassengerCourierRideMatchingView this$0;

    public volatile Object call(Object obj)
    {
        return call((SwitcherSelection)obj);
    }

    public me.lyft.android.controls.._cls11 call(SwitcherSelection switcherselection)
    {
        return (me.lyft.android.controls.._cls11)switcherselection.getSwitcherItem();
    }

    ()
    {
        this$0 = PassengerCourierRideMatchingView.this;
        super();
    }
}
