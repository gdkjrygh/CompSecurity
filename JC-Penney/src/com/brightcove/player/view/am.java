// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import android.util.Log;
import android.view.SurfaceHolder;
import com.brightcove.player.display.VideoDisplayComponent;
import com.brightcove.player.event.EventEmitter;

// Referenced classes of package com.brightcove.player.view:
//            BrightcoveVideoView, al

class am
    implements android.view.SurfaceHolder.Callback
{

    final BrightcoveVideoView a;

    private am(BrightcoveVideoView brightcovevideoview)
    {
        a = brightcovevideoview;
        super();
    }

    am(BrightcoveVideoView brightcovevideoview, al al)
    {
        this(brightcovevideoview);
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        Log.d(BrightcoveVideoView.h(), (new StringBuilder()).append("Surface changed to ").append(j).append(", ").append(k).toString());
        a.d.surfaceChanged(surfaceholder, i, j, k);
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        Log.d(BrightcoveVideoView.h(), "Surface created.");
        a.a.emit("readyToPlay");
        a.d.surfaceCreated(surfaceholder);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        Log.d(BrightcoveVideoView.h(), "Surface destroyed.");
        a.d.surfaceDestroyed(surfaceholder);
    }
}
