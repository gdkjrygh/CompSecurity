// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideInProgressView

class this._cls0
    implements Action1
{

    final DriverRideInProgressView this$0;

    public void call(Boolean boolean1)
    {
        View view = addressView;
        if (boolean1.booleanValue())
        {
            boolean1 = DriverRideInProgressView.access$3700(DriverRideInProgressView.this);
        } else
        {
            boolean1 = DriverRideInProgressView.access$3800(DriverRideInProgressView.this);
        }
        view.setOnClickListener(boolean1);
    }

    public volatile void call(Object obj)
    {
        call((Boolean)obj);
    }

    ()
    {
        this$0 = DriverRideInProgressView.this;
        super();
    }
}
