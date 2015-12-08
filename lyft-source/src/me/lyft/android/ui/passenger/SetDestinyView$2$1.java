// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import me.lyft.android.application.ride.IDestinySession;
import me.lyft.android.domain.location.Location;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.ride.RideMap;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            SetDestinyView

class this._cls1
    implements Action1
{

    final .setLocation this$1;

    public volatile void call(Object obj)
    {
        call((Location)obj);
    }

    public void call(Location location)
    {
        rideMap.centerToLocationWithoutPadding(location);
        destinySession.setLocation(location);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class me/lyft/android/ui/passenger/SetDestinyView$2

/* anonymous class */
    class SetDestinyView._cls2
        implements android.view.View.OnClickListener
    {

        final SetDestinyView this$0;

        public void onClick(View view)
        {
            SetDestinyView.access$000(SetDestinyView.this).bind(locationService.getLastLocation(), new SetDestinyView._cls2._cls1());
        }

            
            {
                this$0 = SetDestinyView.this;
                super();
            }
    }

}
