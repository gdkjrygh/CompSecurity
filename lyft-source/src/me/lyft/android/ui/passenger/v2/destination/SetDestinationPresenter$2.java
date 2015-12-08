// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.destination;

import me.lyft.android.common.Unit;
import me.lyft.android.domain.location.Location;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger.v2.destination:
//            SetDestinationPresenter

class this._cls0
    implements Action1
{

    final SetDestinationPresenter this$0;

    public volatile void call(Object obj)
    {
        call((Location)obj);
    }

    public void call(Location location)
    {
        bind(centerMapToLocation(location), new Action1() {

            final SetDestinationPresenter._cls2 this$1;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                showNextStep();
            }

            
            {
                this$1 = SetDestinationPresenter._cls2.this;
                super();
            }
        });
    }

    _cls1.this._cls1()
    {
        this$0 = SetDestinationPresenter.this;
        super();
    }
}
