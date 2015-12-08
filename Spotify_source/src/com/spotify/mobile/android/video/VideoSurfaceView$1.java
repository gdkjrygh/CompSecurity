// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.video;

import android.widget.ProgressBar;

// Referenced classes of package com.spotify.mobile.android.video:
//            VideoSurfaceView

final class a
    implements Runnable
{

    private VideoSurfaceView a;

    public final void run()
    {
        if (VideoSurfaceView.a(a) != null)
        {
            VideoSurfaceView.a(a).setVisibility(0);
        }
    }

    _cls9(VideoSurfaceView videosurfaceview)
    {
        a = videosurfaceview;
        super();
    }
}
