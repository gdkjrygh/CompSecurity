// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import android.widget.SeekBar;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.view.BaseVideoView;

// Referenced classes of package com.brightcove.player.mediacontroller:
//            BrightcoveSeekBarController

class n
    implements android.widget.SeekBar.OnSeekBarChangeListener
{

    final BrightcoveSeekBarController a;
    private int b;
    private int c;
    private BaseVideoView d;

    public n(BrightcoveSeekBarController brightcoveseekbarcontroller, BaseVideoView basevideoview)
    {
        a = brightcoveseekbarcontroller;
        super();
        b = -1;
        c = 10;
        d = basevideoview;
    }

    public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        int j = Math.abs(i - b);
        if (!flag || j < c)
        {
            return;
        } else
        {
            b = i;
            BrightcoveSeekBarController.a(a, i);
            BrightcoveSeekBarController.c(a).emit("showMediaControls");
            return;
        }
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
        BrightcoveSeekBarController.b(a).emit("showMediaControls");
        a.setDragging(true);
        c = Math.round((float)seekbar.getMax() * 0.01F);
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
        int i = seekbar.getProgress();
        d.seekTo(i);
        BrightcoveSeekBarController.a(a, i);
        BrightcoveSeekBarController.d(a).emit("showMediaControls");
        a.setDragging(false);
    }
}
