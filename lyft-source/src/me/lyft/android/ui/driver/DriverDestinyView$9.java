// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.common.DialogFlow;
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
        default:
            return;

        case 2131558433: 
            dialogFlow.show(new OverflowMenuScreen());
            break;
        }
    }

    public volatile void call(Object obj)
    {
        call((Integer)obj);
    }

    OverflowMenuScreen()
    {
        this$0 = DriverDestinyView.this;
        super();
    }
}
