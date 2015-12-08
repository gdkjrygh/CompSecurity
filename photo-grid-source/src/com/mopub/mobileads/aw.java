// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.media.MediaPlayer;

// Referenced classes of package com.mopub.mobileads:
//            VastVideoViewController

final class aw
    implements android.media.MediaPlayer.OnPreparedListener
{

    final VastVideoViewController a;

    aw(VastVideoViewController vastvideoviewcontroller)
    {
        a = vastvideoviewcontroller;
        super();
    }

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        VastVideoViewController.m(a);
    }
}
