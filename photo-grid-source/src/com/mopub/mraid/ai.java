// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import android.media.MediaPlayer;
import android.widget.ImageButton;

// Referenced classes of package com.mopub.mraid:
//            MraidVideoViewController

final class ai
    implements android.media.MediaPlayer.OnCompletionListener
{

    final MraidVideoViewController a;

    ai(MraidVideoViewController mraidvideoviewcontroller)
    {
        a = mraidvideoviewcontroller;
        super();
    }

    public final void onCompletion(MediaPlayer mediaplayer)
    {
        MraidVideoViewController.a(a).setVisibility(0);
        MraidVideoViewController.b(a);
    }
}
