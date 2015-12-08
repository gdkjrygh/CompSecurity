// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideIdleView

class this._cls0
    implements Action1
{

    private int previousZoom;
    final DriverRideIdleView this$0;

    public void call(Float float1)
    {
        if (Math.abs((float)previousZoom - float1.floatValue()) >= 1.0F)
        {
            previousZoom = float1.intValue();
            DriverRideIdleView.access$1100(DriverRideIdleView.this);
        }
    }

    public volatile void call(Object obj)
    {
        call((Float)obj);
    }

    ()
    {
        this$0 = DriverRideIdleView.this;
        super();
    }
}
