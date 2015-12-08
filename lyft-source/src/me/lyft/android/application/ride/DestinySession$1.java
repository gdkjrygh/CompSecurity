// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import me.lyft.android.domain.location.Location;
import me.lyft.android.rx.ReactiveProperty;
import me.lyft.android.rx.SimpleSubscriber;

// Referenced classes of package me.lyft.android.application.ride:
//            DestinySession

class this._cls0 extends SimpleSubscriber
{

    final DestinySession this$0;

    public volatile void onNext(Object obj)
    {
        onNext((Location)obj);
    }

    public void onNext(Location location)
    {
        super.onNext(location);
        DestinySession.access$000(DestinySession.this).onNext(location);
    }

    ()
    {
        this$0 = DestinySession.this;
        super();
    }
}
