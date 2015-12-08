// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.ui.animations.TransitionManagerCompat;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideRatingAndEarningsView

class this._cls0
    implements Action1
{

    final DriverRideRatingAndEarningsView this$0;

    public volatile void call(Object obj)
    {
        call((String)obj);
    }

    public void call(String s)
    {
        TransitionManagerCompat.beginDelayedTransition(DriverRideRatingAndEarningsView.this);
        DriverRideRatingAndEarningsView.access$000(DriverRideRatingAndEarningsView.this);
        DriverRideRatingAndEarningsView.access$100(DriverRideRatingAndEarningsView.this);
    }

    A()
    {
        this$0 = DriverRideRatingAndEarningsView.this;
        super();
    }
}
