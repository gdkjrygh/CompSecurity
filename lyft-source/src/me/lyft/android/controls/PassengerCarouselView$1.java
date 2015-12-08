// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import me.lyft.android.common.Unit;
import me.lyft.android.rx.SecureObserver;

// Referenced classes of package me.lyft.android.controls:
//            PassengerCarouselView

class this._cls0 extends SecureObserver
{

    final PassengerCarouselView this$0;

    public volatile void onSafeNext(Object obj)
    {
        onSafeNext((Unit)obj);
    }

    public void onSafeNext(Unit unit)
    {
        super.onSafeNext(unit);
        PassengerCarouselView.access$000(PassengerCarouselView.this);
    }

    ()
    {
        this$0 = PassengerCarouselView.this;
        super();
    }
}
