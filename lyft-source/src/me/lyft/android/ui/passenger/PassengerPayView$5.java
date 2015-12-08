// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.application.checkout.ICheckoutSession;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerPayView

class this._cls0
    implements Action1
{

    final PassengerPayView this$0;

    public void call(Integer integer)
    {
        checkoutSession.selectTip(integer.intValue());
    }

    public volatile void call(Object obj)
    {
        call((Integer)obj);
    }

    ssion()
    {
        this$0 = PassengerPayView.this;
        super();
    }
}
