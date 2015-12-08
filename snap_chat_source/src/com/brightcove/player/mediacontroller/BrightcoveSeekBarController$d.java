// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import android.widget.SeekBar;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.view.BaseVideoView;

// Referenced classes of package com.brightcove.player.mediacontroller:
//            BrightcoveSeekBarController

final class c
    implements android.widget.r
{

    private int a;
    private int b;
    private BaseVideoView c;
    private BrightcoveSeekBarController d;

    public final void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        int j = Math.abs(i - a);
        if (!flag || j < b)
        {
            return;
        } else
        {
            a = i;
            BrightcoveSeekBarController.a(d, i);
            BrightcoveSeekBarController.c(d).emit("showMediaControls");
            return;
        }
    }

    public final void onStartTrackingTouch(SeekBar seekbar)
    {
        BrightcoveSeekBarController.b(d).emit("showMediaControls");
        d.setDragging(true);
        b = Math.round((float)seekbar.getMax() * 0.01F);
    }

    public final void onStopTrackingTouch(SeekBar seekbar)
    {
        int i = seekbar.getProgress();
        c.seekTo(i);
        BrightcoveSeekBarController.a(d, i);
        BrightcoveSeekBarController.d(d).emit("showMediaControls");
        d.setDragging(false);
    }

    public I(BrightcoveSeekBarController brightcoveseekbarcontroller, BaseVideoView basevideoview)
    {
        d = brightcoveseekbarcontroller;
        super();
        a = -1;
        b = 10;
        c = basevideoview;
    }
}
