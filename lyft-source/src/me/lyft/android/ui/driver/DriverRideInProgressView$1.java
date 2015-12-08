// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.domain.location.Location;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideInProgressView

class this._cls0
    implements Func1
{

    final DriverRideInProgressView this$0;

    public Boolean call(Location location)
    {
        return Boolean.valueOf(location.isNull());
    }

    public volatile Object call(Object obj)
    {
        return call((Location)obj);
    }

    ()
    {
        this$0 = DriverRideInProgressView.this;
        super();
    }
}
