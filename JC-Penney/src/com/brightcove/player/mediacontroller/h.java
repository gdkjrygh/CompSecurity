// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.brightcove.player.event.EventEmitter;

// Referenced classes of package com.brightcove.player.mediacontroller:
//            BrightcoveMediaController, a

class h
    implements android.view.View.OnTouchListener
{

    final BrightcoveMediaController a;

    private h(BrightcoveMediaController brightcovemediacontroller)
    {
        a = brightcovemediacontroller;
        super();
    }

    h(BrightcoveMediaController brightcovemediacontroller, a a1)
    {
        this(brightcovemediacontroller);
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
label0:
        {
            Log.d(BrightcoveMediaController.a(), String.format("Processing onTouch for view: %s, with event: %s.", new Object[] {
                view, motionevent
            }));
            if (motionevent.getAction() == 0)
            {
                if (!a.isShowing())
                {
                    break label0;
                }
                Log.d(BrightcoveMediaController.a(), "The control bar is showing, hide the media controls...");
                BrightcoveMediaController.j(a).emit("hideMediaControls");
            }
            return false;
        }
        Log.d(BrightcoveMediaController.a(), "The control bar is hidden, show the media controls...");
        BrightcoveMediaController.k(a).emit("showMediaControls");
        return false;
    }
}
