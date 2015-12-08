// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideCompletedView

class this._cls0
    implements Action1
{

    final DriverRideCompletedView this$0;

    public void call(Integer integer)
    {
        switch (integer.intValue())
        {
        default:
            return;

        case 2131558433: 
            dialogFlow.show(new owMenuScreen());
            return;

        case 2131558400: 
            dialogFlow.show(new rInfoDialog());
            return;

        case 2131558422: 
            appFlow.goTo(new me.lyft.android.ui.help.it>());
            return;
        }
    }

    public volatile void call(Object obj)
    {
        call((Integer)obj);
    }

    rInfoDialog()
    {
        this$0 = DriverRideCompletedView.this;
        super();
    }
}
