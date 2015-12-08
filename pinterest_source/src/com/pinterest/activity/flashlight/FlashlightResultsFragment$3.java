// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.flashlight;

import org.lucasr.twowayview.TwoWayView;

// Referenced classes of package com.pinterest.activity.flashlight:
//            FlashlightResultsFragment

class this._cls0
    implements Runnable
{

    final FlashlightResultsFragment this$0;

    public void run()
    {
        if (_annotationsView != null && _annotationsView.getVisibility() == 0)
        {
            _annotationsView.smoothScrollToPositionFromOffset(0, 0, 700);
        }
    }

    ()
    {
        this$0 = FlashlightResultsFragment.this;
        super();
    }
}
