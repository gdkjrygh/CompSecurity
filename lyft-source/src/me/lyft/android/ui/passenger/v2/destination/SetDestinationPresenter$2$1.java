// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.destination;

import me.lyft.android.common.Unit;
import me.lyft.android.domain.location.Location;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger.v2.destination:
//            SetDestinationPresenter

class this._cls1
    implements Action1
{

    final NextStep this$1;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        showNextStep();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class me/lyft/android/ui/passenger/v2/destination/SetDestinationPresenter$2

/* anonymous class */
    class SetDestinationPresenter._cls2
        implements Action1
    {

        final SetDestinationPresenter this$0;

        public volatile void call(Object obj)
        {
            call((Location)obj);
        }

        public void call(Location location)
        {
            bind(centerMapToLocation(location), new SetDestinationPresenter._cls2._cls1());
        }

            
            {
                this$0 = SetDestinationPresenter.this;
                super();
            }
    }

}
