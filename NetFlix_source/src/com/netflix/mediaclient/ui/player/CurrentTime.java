// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.widget.NetflixSeekBar;
import com.netflix.mediaclient.util.TimeFormatterHelper;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PlayerSection, PlayerActivity, CurrentTimeTablet, CurrentTimePhone, 
//            PlayerWorkflowState, PlayScreen, BottomPanel

public abstract class CurrentTime extends PlayerSection
{

    static final int CURRENT_TIME_BOTTOM_MARGIN_REGULAR = 18;
    static final int CURRENT_TIME_BOTTOM_MARGIN_REGULAR_PHONE = 10;
    static final int CURRENT_TIME_BOTTOM_MARGIN_TABLET_PRESSED = 40;
    protected static final String TAG = "screen";
    protected ImageView bifs;
    protected View currentTime;
    protected boolean currentTimeAnimationInProgress;
    protected View currentTimeExp;
    protected TextView currentTimeLabel;
    protected AtomicBoolean mBifDownloaded;

    CurrentTime(PlayerActivity playeractivity)
    {
        super(playeractivity);
        mBifDownloaded = new AtomicBoolean(false);
        currentTime = playeractivity.findViewById(0x7f070162);
        currentTimeExp = playeractivity.findViewById(0x7f07016a);
        currentTimeLabel = (TextView)playeractivity.findViewById(0x7f070163);
        bifs = (ImageView)playeractivity.findViewById(0x7f070148);
    }

    static CurrentTime newInstance(PlayerActivity playeractivity)
    {
        if (playeractivity.isTablet())
        {
            return new CurrentTimeTablet(playeractivity);
        } else
        {
            return new CurrentTimePhone(playeractivity);
        }
    }

    public void changeActionState(boolean flag)
    {
    }

    public void destroy()
    {
    }

    public TextView getCurrentTimeLabel()
    {
        return currentTimeLabel;
    }

    public void hide()
    {
        if (currentTime != null)
        {
            Log.d("SP", "Hide");
            currentTime.clearAnimation();
            currentTime.setVisibility(8);
        }
    }

    public boolean isBifDownloaded()
    {
        return mBifDownloaded.get();
    }

    public abstract void move(boolean flag, boolean flag1);

    protected void restorePlaybackIfSnapOnExit()
    {
        if (context.getState().getTimelineExitOnSnap())
        {
            context.restorePlaybackAfterSnap();
            context.getState().setDraggingInProgress(false);
            if (!context.isTablet())
            {
                context.getScreen().stopBif();
            }
        }
        context.getState().setTimelineExitOnSnap(false);
    }

    public void setBifDownloaded(boolean flag)
    {
        mBifDownloaded.set(flag);
    }

    public void show()
    {
        if (currentTime != null)
        {
            currentTime.setVisibility(0);
        }
    }

    public abstract void start(ByteBuffer bytebuffer);

    public abstract void stop(boolean flag);

    protected void updateCurrentTime()
    {
        Object obj = context.getScreen().getBottomPanel();
        TimeFormatterHelper timeformatterhelper = ((BottomPanel) (obj)).getFormatter();
        if (context.getState().getTimelineExitOnSnap())
        {
            Log.d("screen", "Exit on snap, use snap position");
            obj = timeformatterhelper.getStringForMs(context.getState().getTimelineStartSeekPosition());
            Log.d("screen", (new StringBuilder()).append("Exit on snap, use snap position ").append(((String) (obj))).toString());
        } else
        {
            obj = timeformatterhelper.getStringForMs(((BottomPanel) (obj)).getTimeline().getProgress());
            Log.d("screen", "No snap position");
        }
        updateText("screen", currentTimeLabel, "currentTimeLabel", ((String) (obj)));
    }
}
