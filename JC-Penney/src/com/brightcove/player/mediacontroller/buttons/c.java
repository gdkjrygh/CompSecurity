// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.util.Log;
import android.view.View;
import com.brightcove.player.controller.BrightcoveClosedCaptioningController;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.view.BaseVideoView;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            CaptionsButtonController, d, b

class c
    implements android.view.View.OnClickListener
{

    final CaptionsButtonController a;

    private c(CaptionsButtonController captionsbuttoncontroller)
    {
        a = captionsbuttoncontroller;
        super();
    }

    c(CaptionsButtonController captionsbuttoncontroller, b b)
    {
        this(captionsbuttoncontroller);
    }

    public void onClick(View view)
    {
        Log.d(CaptionsButtonController.a(), "Showing the captions dialog.");
        if (a.c.isPlaying())
        {
            a.c.pause();
            CaptionsButtonController.a(a).once("captionsDialogOk", new d(this));
        }
        a.c.getClosedCaptioningController().showCaptionsDialog();
    }
}
