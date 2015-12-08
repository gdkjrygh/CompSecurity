// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import android.util.Log;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.view.BaseVideoView;

// Referenced classes of package com.brightcove.player.mediacontroller:
//            n, BrightcoveSeekBar, o, k, 
//            m, p, l

public class BrightcoveSeekBarController extends AbstractComponent
{

    private static final String a = com/brightcove/player/mediacontroller/BrightcoveSeekBarController.getSimpleName();
    private boolean b;
    private int c;
    private BrightcoveSeekBar d;

    public BrightcoveSeekBarController(BrightcoveSeekBar brightcoveseekbar, BaseVideoView basevideoview)
    {
        super(basevideoview.getEventEmitter());
        d = brightcoveseekbar;
        brightcoveseekbar.setOnSeekBarChangeListener(new n(this, basevideoview));
        addListener("setMarkers", new o(this, null));
        addListener("bufferedUpdate", new k(this, null));
        addListener("hideSeekControls", new m(this, null));
        addListener("showSeekControls", new p(this, null));
        addListener("videoDurationChanged", new l(this, null));
    }

    static BrightcoveSeekBar a(BrightcoveSeekBarController brightcoveseekbarcontroller)
    {
        return brightcoveseekbarcontroller.d;
    }

    static String a()
    {
        return a;
    }

    private void a(int i)
    {
        if (i != -1)
        {
            Log.d(a, String.format("Setting seekbar progress to %s.", new Object[] {
                Integer.valueOf(i)
            }));
            d.setProgress(i);
        }
        d.setSecondaryProgress(getBufferedPercent());
    }

    static void a(BrightcoveSeekBarController brightcoveseekbarcontroller, int i)
    {
        brightcoveseekbarcontroller.a(i);
    }

    static EventEmitter b(BrightcoveSeekBarController brightcoveseekbarcontroller)
    {
        return brightcoveseekbarcontroller.F;
    }

    static EventEmitter c(BrightcoveSeekBarController brightcoveseekbarcontroller)
    {
        return brightcoveseekbarcontroller.F;
    }

    static EventEmitter d(BrightcoveSeekBarController brightcoveseekbarcontroller)
    {
        return brightcoveseekbarcontroller.F;
    }

    public int getBufferedPercent()
    {
        return c;
    }

    public boolean isDragging()
    {
        return b;
    }

    public void setBufferedPercent(int i)
    {
        c = i;
    }

    public void setDragging(boolean flag)
    {
        b = flag;
    }

}
