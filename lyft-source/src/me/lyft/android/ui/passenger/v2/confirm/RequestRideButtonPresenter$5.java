// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.confirm;

import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger.v2.confirm:
//            RequestRideButtonPresenter

class this._cls0
    implements Action1
{

    final RequestRideButtonPresenter this$0;

    public void call(Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            requestRide(false);
        }
    }

    public volatile void call(Object obj)
    {
        call((Boolean)obj);
    }

    ()
    {
        this$0 = RequestRideButtonPresenter.this;
        super();
    }
}
