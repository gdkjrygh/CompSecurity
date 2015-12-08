// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import android.media.MediaPlayer;
import com.brightcove.player.event.EventEmitter;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.brightcove.player.display:
//            VideoDisplayComponent

final class a
    implements android.media.teListener
{

    private VideoDisplayComponent a;

    public final void onSeekComplete(MediaPlayer mediaplayer)
    {
        VideoDisplayComponent.b();
        (new StringBuilder("onSeekComplete: fromSeekPosition = ")).append(a.b).append(", seekPosition = ").append(a.d);
        if (a.c && mediaplayer.getCurrentPosition() < a.d && !a.f)
        {
            mediaplayer.seekTo(a.d);
            a.f = true;
        } else
        if (a.b != -1)
        {
            HashMap hashmap = new HashMap();
            if (a.c)
            {
                hashmap.put("playheadPosition", Integer.valueOf(mediaplayer.getCurrentPosition()));
            }
            hashmap.put("seekPosition", Integer.valueOf(a.d));
            hashmap.put("fromSeekPosition", Integer.valueOf(a.b));
            hashmap.put("video", a.i);
            VideoDisplayComponent.x(a).emit("didSeekTo", hashmap);
            a.b = -1;
            a.f = false;
            return;
        }
    }

    (VideoDisplayComponent videodisplaycomponent)
    {
        a = videodisplaycomponent;
        super();
    }
}
