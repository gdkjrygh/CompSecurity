// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import android.media.MediaPlayer;
import android.widget.ImageButton;

// Referenced classes of package com.mopub.mraid:
//            MraidVideoViewController

final class aj
    implements android.media.MediaPlayer.OnErrorListener
{

    final MraidVideoViewController a;

    aj(MraidVideoViewController mraidvideoviewcontroller)
    {
        a = mraidvideoviewcontroller;
        super();
    }

    public final boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        MraidVideoViewController.a(a).setVisibility(0);
        MraidVideoViewController.c(a);
        return false;
    }
}
