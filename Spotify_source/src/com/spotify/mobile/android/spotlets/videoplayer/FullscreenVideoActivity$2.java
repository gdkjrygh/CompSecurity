// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.videoplayer;


// Referenced classes of package com.spotify.mobile.android.spotlets.videoplayer:
//            FullscreenVideoActivity, VideoActivityConfig

final class a
    implements Runnable
{

    private FullscreenVideoActivity a;

    public final void run()
    {
        VideoActivityConfig videoactivityconfig = FullscreenVideoActivity.a(a);
        FullscreenVideoActivity fullscreenvideoactivity = a;
        videoactivityconfig.a.a(fullscreenvideoactivity);
    }

    ateAction(FullscreenVideoActivity fullscreenvideoactivity)
    {
        a = fullscreenvideoactivity;
        super();
    }
}
