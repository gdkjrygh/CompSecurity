// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.brightcove.player.view.BaseVideoView;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            LiveButtonController, h

class k
    implements android.view.View.OnClickListener
{

    final LiveButtonController a;

    private k(LiveButtonController livebuttoncontroller)
    {
        a = livebuttoncontroller;
        super();
    }

    k(LiveButtonController livebuttoncontroller, h h)
    {
        this(livebuttoncontroller);
    }

    public void onClick(View view)
    {
        Log.d(LiveButtonController.a(), "Returning to live video...");
        a.c.seekToLive();
        a.getButton().setTextColor(LiveButtonController.e(a));
        if (!a.c.isPlaying())
        {
            a.c.start();
        }
    }
}
