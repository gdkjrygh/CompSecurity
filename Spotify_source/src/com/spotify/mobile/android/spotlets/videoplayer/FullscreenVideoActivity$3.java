// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.videoplayer;

import flq;

// Referenced classes of package com.spotify.mobile.android.spotlets.videoplayer:
//            FullscreenVideoActivity

final class a
    implements Runnable
{

    private FullscreenVideoActivity a;

    public final void run()
    {
        FullscreenVideoActivity.c(a).b();
    }

    (FullscreenVideoActivity fullscreenvideoactivity)
    {
        a = fullscreenvideoactivity;
        super();
    }
}
