// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import android.support.v4.app.FixedFragmentStatePagerAdapter;
import android.support.v4.view.ModifiedViewPager;
import com.pinterest.activity.commerce.util.BuyableProductHelper;
import com.pinterest.activity.task.education.model.Education;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.education.EducationHelper;
import com.pinterest.schemas.experiences.Placement;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinSwipeFragment

class this._cls0
    implements com.pinterest.base.iber
{

    final PinSwipeFragment this$0;

    public void onEventMainThread(com.pinterest.activity.flashlight.agment.FlashlightCloseButtonEvent flashlightclosebuttonevent)
    {
        PinSwipeFragment.access$1100(PinSwipeFragment.this).setDragEnabled(true);
    }

    public void onEventMainThread(nSwipeProfXEvent nswipeprofxevent)
    {
label0:
        {
            if (EducationHelper.k() && BuyableProductHelper.isPinAvailable(nswipeprofxevent.getPin()))
            {
                PinSwipeFragment.access$602(PinSwipeFragment.this, EducationHelper.a(Placement.ANDROID_PIN_CLOSEUP_COMMERCE_TAKEOVER, PinSwipeFragment.this));
            } else
            {
                PinSwipeFragment.access$602(PinSwipeFragment.this, EducationHelper.a(Placement.ANDROID_PIN_CLOSEUP_TAKEOVER, PinSwipeFragment.this));
            }
            if (PinSwipeFragment.access$700(PinSwipeFragment.this, nswipeprofxevent.getPin()) && EducationHelper.i())
            {
                if (!PinSwipeFragment.access$800(PinSwipeFragment.this))
                {
                    break label0;
                }
                Education.showDelayed(PinSwipeFragment.access$600(PinSwipeFragment.this), 0);
            }
            return;
        }
        PinSwipeFragment.access$902(PinSwipeFragment.this, true);
    }

    public void onEventMainThread(com.pinterest.activity.pin.view..FlashlightSearchButtonDisplayedEvent flashlightsearchbuttondisplayedevent)
    {
        if (PinSwipeFragment.access$700(PinSwipeFragment.this, flashlightsearchbuttondisplayedevent.getPin()))
        {
            if (EducationHelper.i() && PinSwipeFragment.access$900(PinSwipeFragment.this))
            {
                Education.showDelayed(PinSwipeFragment.access$600(PinSwipeFragment.this), 0);
            }
            PinSwipeFragment.access$802(PinSwipeFragment.this, true);
            Events.unregister(PinSwipeFragment.access$500(PinSwipeFragment.this), new Class[] {
                com/pinterest/activity/pin/view/PinCloseupImageView$FlashlightSearchButtonDisplayedEvent
            });
        }
    }

    public void onEventMainThread(com.pinterest.activity.pin.view..FlashlightSearchButtonEvent flashlightsearchbuttonevent)
    {
        PinSwipeFragment.access$1000(PinSwipeFragment.this).setDragEnabled(false);
    }

    public void onEventMainThread(com.pinterest.activity.pin.view..ImageLoadEvent imageloadevent)
    {
        if (imageloadevent.getPin() == null || imageloadevent.getPin().equals(PinSwipeFragment.access$400(PinSwipeFragment.this).get(PinSwipeFragment.access$300(PinSwipeFragment.this))))
        {
            StopWatch.get().complete("pin_closeup");
            Events.unregister(PinSwipeFragment.access$500(PinSwipeFragment.this), new Class[] {
                com/pinterest/activity/pin/view/PinCloseupImageView$ImageLoadEvent
            });
        }
    }

    public void onEventMainThread(com.pinterest.api.model.eFragment._cls4 _pcls4)
    {
        if (_pcls4.Deleted() && PinSwipeFragment.access$100(PinSwipeFragment.this) != null)
        {
            PinSwipeFragment.access$200(PinSwipeFragment.this).notifyDataSetChanged();
        }
        Events.removeStickyEvent(_pcls4);
    }

    geLoadEvent()
    {
        this$0 = PinSwipeFragment.this;
        super();
    }
}
