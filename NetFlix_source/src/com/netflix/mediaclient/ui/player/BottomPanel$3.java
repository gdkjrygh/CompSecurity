// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.widget.SeekBar;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.ViewUtils;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            BottomPanel, CurrentTime

class val.fTimeline
    implements android.view.er.OnGlobalLayoutListener
{

    final BottomPanel this$0;
    final SeekBar val$fTimeline;

    public void onGlobalLayout()
    {
        Log.d("screen", "Timeline is visible now, its location is known, render current time now!!! <==");
        if (timelineWasPreviouslyRendered > 1)
        {
            ViewUtils.removeGlobalLayoutListener(val$fTimeline, this);
        }
        BottomPanel bottompanel = BottomPanel.this;
        bottompanel.timelineWasPreviouslyRendered = bottompanel.timelineWasPreviouslyRendered + 1;
        currentTime.move(true, true);
    }

    ener()
    {
        this$0 = final_bottompanel;
        val$fTimeline = SeekBar.this;
        super();
    }
}
