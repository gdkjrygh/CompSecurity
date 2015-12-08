// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import android.media.MediaPlayer;
import android.util.Log;

// Referenced classes of package com.arist.service:
//            MusicPlayService, p

final class f
    implements android.media.MediaPlayer.OnCompletionListener
{

    final MusicPlayService a;

    f(MusicPlayService musicplayservice)
    {
        a = musicplayservice;
        super();
    }

    public final void onCompletion(MediaPlayer mediaplayer)
    {
        Log.i("complete", (new StringBuilder("complete")).append(MusicPlayService.g(a)).toString());
        if (MusicPlayService.h(a) != null)
        {
            MusicPlayService.h(a).a(false);
        }
        MusicPlayService.i(a);
        if (MusicPlayService.g(a))
        {
            MusicPlayService.j(a);
        }
    }
}
