// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRequestRideView

class this._cls0
    implements Action1
{

    final PassengerRequestRideView this$0;

    public volatile void call(Object obj)
    {
        call((ew.RequestType)obj);
    }

    public void call(ew.RequestType requesttype)
    {
        if (ew.RequestType.LYFT == requesttype)
        {
            PassengerRequestRideView.access$4700(PassengerRequestRideView.this, false);
        } else
        if (requesttype == ew.RequestType.COURIER)
        {
            PassengerRequestRideView.access$6500(PassengerRequestRideView.this);
            return;
        }
    }

    ew.RequestType()
    {
        this$0 = PassengerRequestRideView.this;
        super();
    }
}
