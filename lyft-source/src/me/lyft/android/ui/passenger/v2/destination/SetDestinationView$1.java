// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.destination;

import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger.v2.destination:
//            SetDestinationView, SetDestinationPresenter

class this._cls0
    implements Action1
{

    final SetDestinationView this$0;

    public void call(Integer integer)
    {
        if (integer.intValue() == 0x7f0d0005)
        {
            setDestinationPresenter.showPickupStep();
        }
    }

    public volatile void call(Object obj)
    {
        call((Integer)obj);
    }

    er()
    {
        this$0 = SetDestinationView.this;
        super();
    }
}
