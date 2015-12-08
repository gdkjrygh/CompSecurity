// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.view.View;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.AndroidUtils;
import java.nio.ByteBuffer;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            CurrentTime, PlayerActivity, PlayScreen, BottomPanel, 
//            LastTime

public class CurrentTimePhone extends CurrentTime
{

    CurrentTimePhone(PlayerActivity playeractivity)
    {
        super(playeractivity);
    }

    public void move(boolean flag, boolean flag1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!currentTimeAnimationInProgress) goto _L2; else goto _L1
_L1:
        Log.d("screen", "Current time animation in progress. Ignore!");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        PlayerActivity playeractivity = context;
        if (playeractivity == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        android.widget.RelativeLayout.LayoutParams layoutparams;
        if (currentTime == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (Log.isLoggable("screen", 3))
        {
            Log.d("screen", (new StringBuilder()).append("moveCurrentTimeWithTimeline start by margin: ").append(10).toString());
        }
        BottomPanel bottompanel = context.getScreen().getBottomPanel();
        layoutparams = (android.widget.RelativeLayout.LayoutParams)currentTime.getLayoutParams();
        int i = AndroidUtils.dipToPixels(playeractivity, 10);
        layoutparams.setMargins(bottompanel.getTimeX(currentTime), 0, 0, i);
        if (currentTime.getVisibility() != 0)
        {
            currentTime.setVisibility(0);
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        updateCurrentTime();
        Log.d("screen", "moveCurrentTimeWithTimeline set layout parameter!");
        currentTime.setLayoutParams(layoutparams);
        currentTime.clearAnimation();
        context.getScreen().getBottomPanel().getLastTime().validateTimeOverlap(currentTimeLabel);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void start(ByteBuffer bytebuffer)
    {
        this;
        JVM INSTR monitorenter ;
        context.getScreen().startBif(bytebuffer);
        Log.d("screen", "Movie current time from startCurrentTime");
        move(false, true);
        this;
        JVM INSTR monitorexit ;
        return;
        bytebuffer;
        throw bytebuffer;
    }

    public void stop(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable("screen", 3))
        {
            Log.d("screen", (new StringBuilder()).append("Movie current time from stopCurrentTime, phone: ").append(flag).toString());
        }
        move(false, flag);
        restorePlaybackIfSnapOnExit();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
