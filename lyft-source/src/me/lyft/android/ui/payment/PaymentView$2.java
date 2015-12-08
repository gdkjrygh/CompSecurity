// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import me.lyft.android.common.AppFlow;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.payment:
//            PaymentView

class this._cls0
    implements Action1
{

    final PaymentView this$0;

    public void call(Integer integer)
    {
        switch (integer.intValue())
        {
        default:
            return;

        case 2131558419: 
            appFlow.goTo(new .PaymentEditScreen());
            return;

        case 2131558418: 
            appFlow.goTo(new .PaymentSelectScreen());
            return;
        }
    }

    public volatile void call(Object obj)
    {
        call((Integer)obj);
    }

    .PaymentSelectScreen()
    {
        this$0 = PaymentView.this;
        super();
    }
}
