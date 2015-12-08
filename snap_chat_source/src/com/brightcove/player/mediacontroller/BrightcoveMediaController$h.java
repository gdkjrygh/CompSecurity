// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import android.view.MotionEvent;
import android.view.View;
import com.brightcove.player.event.EventEmitter;

// Referenced classes of package com.brightcove.player.mediacontroller:
//            BrightcoveMediaController

final class <init>
    implements android.view.ghtcoveMediaController.h
{

    private BrightcoveMediaController a;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
label0:
        {
            BrightcoveMediaController.a();
            String.format("Processing onTouch for view: %s, with event: %s.", new Object[] {
                view, motionevent
            });
            if (motionevent.getAction() == 0)
            {
                if (!a.isShowing())
                {
                    break label0;
                }
                BrightcoveMediaController.a();
                BrightcoveMediaController.k(a).emit("hideMediaControls");
            }
            return false;
        }
        BrightcoveMediaController.a();
        BrightcoveMediaController.l(a).emit("showMediaControls");
        return false;
    }

    private (BrightcoveMediaController brightcovemediacontroller)
    {
        a = brightcovemediacontroller;
        super();
    }

    a(BrightcoveMediaController brightcovemediacontroller, byte byte0)
    {
        this(brightcovemediacontroller);
    }
}
