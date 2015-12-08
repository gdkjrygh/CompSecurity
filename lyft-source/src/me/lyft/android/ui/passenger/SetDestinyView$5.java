// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.application.ride.IDestinySession;
import me.lyft.android.domain.location.Location;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            SetDestinyView

class this._cls0
    implements Action1
{

    final SetDestinyView this$0;

    public volatile void call(Object obj)
    {
        call((Location)obj);
    }

    public void call(Location location)
    {
        destinySession.setLocation(location);
        SetDestinyView.access$100(SetDestinyView.this);
    }

    on()
    {
        this$0 = SetDestinyView.this;
        super();
    }
}
