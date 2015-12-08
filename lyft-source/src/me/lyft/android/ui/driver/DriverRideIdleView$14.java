// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideIdleView

class this._cls0
    implements android.view.eIdleView._cls14
{

    final DriverRideIdleView this$0;

    public void onClick(View view)
    {
        if (!view.isSelected())
        {
            DriverRideIdleView.access$1800(DriverRideIdleView.this);
            return;
        } else
        {
            DriverRideIdleView.access$1700(DriverRideIdleView.this);
            return;
        }
    }

    ()
    {
        this$0 = DriverRideIdleView.this;
        super();
    }
}
