// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.profile:
//            DriverRideProfileView, ProfileToolBarView

class this._cls0
    implements Action1
{

    final DriverRideProfileView this$0;

    public void call(Boolean boolean1)
    {
        if (DriverRideProfileView.access$000(DriverRideProfileView.this) != boolean1.booleanValue())
        {
            profileToolBarView.setFade(boolean1.booleanValue());
            DriverRideProfileView.access$002(DriverRideProfileView.this, boolean1.booleanValue());
        }
    }

    public volatile void call(Object obj)
    {
        call((Boolean)obj);
    }

    ()
    {
        this$0 = DriverRideProfileView.this;
        super();
    }
}
