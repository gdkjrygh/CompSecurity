// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import android.view.SurfaceHolder;
import com.brightcove.player.display.VideoDisplayComponent;
import com.brightcove.player.event.EventEmitter;

// Referenced classes of package com.brightcove.player.view:
//            BrightcoveVideoView

final class <init>
    implements android.view.
{

    private BrightcoveVideoView a;

    public final void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        BrightcoveVideoView.f();
        (new StringBuilder("Surface changed to ")).append(j).append(", ").append(k);
        a.b.surfaceChanged(surfaceholder, i, j, k);
    }

    public final void surfaceCreated(SurfaceHolder surfaceholder)
    {
        BrightcoveVideoView.f();
        a.a.emit("readyToPlay");
        a.b.surfaceCreated(surfaceholder);
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        BrightcoveVideoView.f();
        a.b.surfaceDestroyed(surfaceholder);
    }

    private nt(BrightcoveVideoView brightcovevideoview)
    {
        a = brightcovevideoview;
        super();
    }

    a(BrightcoveVideoView brightcovevideoview, byte byte0)
    {
        this(brightcovevideoview);
    }
}
