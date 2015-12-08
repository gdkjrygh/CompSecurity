// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.media.MediaPlayer;

// Referenced classes of package com.mopub.mobileads:
//            VastVideoViewController

final class ay
    implements android.media.MediaPlayer.OnErrorListener
{

    final VastVideoViewController a;

    ay(VastVideoViewController vastvideoviewcontroller)
    {
        a = vastvideoviewcontroller;
        super();
    }

    public final boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        if (a.a(mediaplayer, i, j))
        {
            return true;
        } else
        {
            VastVideoViewController.n(a);
            VastVideoViewController.i(a);
            a.h();
            VastVideoViewController.u(a);
            return false;
        }
    }
}
