// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.minutecast;

import android.widget.ViewFlipper;

// Referenced classes of package com.accuweather.android.minutecast:
//            MinuteCastFlipperFragment

class val.viewFlipper
    implements Runnable
{

    final MinuteCastFlipperFragment this$0;
    final String val$lastSelectedViewName;
    final ViewFlipper val$viewFlipper;

    public void run()
    {
        if (nuteCastViewType.Circle.viewName.equals(val$lastSelectedViewName))
        {
            val$viewFlipper.setDisplayedChild(MinuteCastFlipperFragment.access$200(MinuteCastFlipperFragment.this));
            return;
        } else
        {
            val$viewFlipper.setDisplayedChild(MinuteCastFlipperFragment.access$900(MinuteCastFlipperFragment.this));
            return;
        }
    }

    nuteCastViewType()
    {
        this$0 = final_minutecastflipperfragment;
        val$lastSelectedViewName = s;
        val$viewFlipper = ViewFlipper.this;
        super();
    }
}
