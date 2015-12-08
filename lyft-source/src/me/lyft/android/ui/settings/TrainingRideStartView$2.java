// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import me.lyft.android.application.settings.ITrainingRideService;
import me.lyft.android.domain.location.Location;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.settings:
//            TrainingRideStartView

class this._cls0
    implements Func1
{

    final TrainingRideStartView this$0;

    public volatile Object call(Object obj)
    {
        return call((Location)obj);
    }

    public Observable call(Location location)
    {
        return trainingRideService.startTrainingRide(location);
    }

    rvice()
    {
        this$0 = TrainingRideStartView.this;
        super();
    }
}
