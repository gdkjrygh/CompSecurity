// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.ui.IProgressController;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideAcceptView

class this._cls0
    implements Action1
{

    final DriverRideAcceptView this$0;

    public void call(Long long1)
    {
        if (progressController.isUIEnabled())
        {
            DriverRideAcceptView.access$900(DriverRideAcceptView.this, long1);
        }
    }

    public volatile void call(Object obj)
    {
        call((Long)obj);
    }

    ()
    {
        this$0 = DriverRideAcceptView.this;
        super();
    }
}
