// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.widget.ImageButton;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.animators.FadeAnimator;
import me.lyft.android.domain.passenger.PassengerRide;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerActiveRideZoomingController

class this._cls0
    implements Action1
{

    final PassengerActiveRideZoomingController this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        if (!PassengerActiveRideZoomingController.access$200(PassengerActiveRideZoomingController.this).getPassengerRide().isPickedUp().booleanValue()) goto _L2; else goto _L1
_L1:
        if (!isFollowing()) goto _L4; else goto _L3
_L3:
        FadeAnimator.fadeOut(PassengerActiveRideZoomingController.access$300(PassengerActiveRideZoomingController.this));
_L6:
        return;
_L4:
        PassengerActiveRideZoomingController.access$300(PassengerActiveRideZoomingController.this).setImageResource(0x7f020136);
        FadeAnimator.fadeIn(PassengerActiveRideZoomingController.access$300(PassengerActiveRideZoomingController.this));
        return;
_L2:
        FadeAnimator.fadeIn(PassengerActiveRideZoomingController.access$300(PassengerActiveRideZoomingController.this));
        if (isFollowing())
        {
            PassengerActiveRideZoomingController.access$300(PassengerActiveRideZoomingController.this).setImageResource(0x7f0201d0);
            return;
        }
        if (isRouteView())
        {
            PassengerActiveRideZoomingController.access$300(PassengerActiveRideZoomingController.this).setImageResource(0x7f020136);
            return;
        }
        if (isUserInteraction())
        {
            PassengerActiveRideZoomingController.access$300(PassengerActiveRideZoomingController.this).setImageResource(0x7f020136);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    I()
    {
        this$0 = PassengerActiveRideZoomingController.this;
        super();
    }
}
