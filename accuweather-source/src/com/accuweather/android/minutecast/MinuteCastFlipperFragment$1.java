// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.minutecast;

import android.view.View;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.accuweather.android.utilities.AccuAnalytics;
import com.accuweather.android.utilities.PreferenceUtils;

// Referenced classes of package com.accuweather.android.minutecast:
//            MinuteCastFlipperFragment

class val.viewFlipper
    implements android.view.CastFlipperFragment._cls1
{

    final MinuteCastFlipperFragment this$0;
    final ViewFlipper val$viewFlipper;

    public void onClick(View view)
    {
        AccuAnalytics.logStateEvent(getActivity(), "Clicks on trigger to switch between MinuteCast circle view and list view");
        int i = MinuteCastFlipperFragment.access$000(MinuteCastFlipperFragment.this);
        val$viewFlipper.showNext();
        int j = val$viewFlipper.getDisplayedChild();
        nuteCastViewType _tmp = MinuteCastFlipperFragment.access$102(nuteCastViewType.List);
        if (j == MinuteCastFlipperFragment.access$200(MinuteCastFlipperFragment.this))
        {
            nuteCastViewType _tmp1 = MinuteCastFlipperFragment.access$102(nuteCastViewType.Circle);
        }
        PreferenceUtils.save(MinuteCastFlipperFragment.access$300(MinuteCastFlipperFragment.this).getContext(), "last_selected_minutecast_page", MinuteCastFlipperFragment.access$100().viewName);
        MinuteCastFlipperFragment.access$400(MinuteCastFlipperFragment.this, MinuteCastFlipperFragment.access$100());
        updateCircleAndListProgress(i);
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        if (MinuteCastFlipperFragment.access$100().equals(nuteCastViewType.Circle))
        {
            view = "Views on MinuteCast Circle view";
        } else
        {
            view = "Views on MinuteCast List view";
        }
        AccuAnalytics.logStateEvent(fragmentactivity, view);
    }

    nuteCastViewType()
    {
        this$0 = final_minutecastflipperfragment;
        val$viewFlipper = ViewFlipper.this;
        super();
    }
}
