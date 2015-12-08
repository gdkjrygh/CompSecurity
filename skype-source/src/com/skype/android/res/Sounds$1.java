// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.res;

import android.media.MediaPlayer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.res:
//            Sounds

final class b
    implements android.media.er.OnCompletionListener
{

    final boolean a;
    final int b;
    final Sounds c;

    public final void onCompletion(MediaPlayer mediaplayer)
    {
        if (!a || !mediaplayer.isLooping())
        {
            Sounds.d().info((new StringBuilder("playThroughMediaPlayer() !loop || !player.isLooping() id:")).append(b).toString());
            mediaplayer.release();
            Sounds.a(c).remove(Integer.valueOf(b));
        }
    }

    HashMap(Sounds sounds, boolean flag, int i)
    {
        c = sounds;
        a = flag;
        b = i;
        super();
    }
}
