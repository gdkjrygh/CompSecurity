// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.common.AppFlow;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverDestinyView

class this._cls0
    implements Action1
{

    final DriverDestinyView this$0;

    public void call(Integer integer)
    {
        switch (integer.intValue())
        {
        case 2131558415: 
        default:
            return;

        case 2131558416: 
            appFlow.goTo(new tatsScreen());
            return;

        case 2131558414: 
            DriverDestinyView.access$700(DriverDestinyView.this);
            return;
        }
    }

    public volatile void call(Object obj)
    {
        call((Integer)obj);
    }

    tatsScreen()
    {
        this$0 = DriverDestinyView.this;
        super();
    }
}
