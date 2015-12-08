// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import android.media.MediaPlayer;
import android.util.Log;
import com.brightcove.player.event.EventEmitter;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.brightcove.player.display:
//            VideoDisplayComponent

class g
    implements android.media.MediaPlayer.OnSeekCompleteListener
{

    final VideoDisplayComponent a;

    g(VideoDisplayComponent videodisplaycomponent)
    {
        a = videodisplaycomponent;
        super();
    }

    public void onSeekComplete(MediaPlayer mediaplayer)
    {
        Log.v(VideoDisplayComponent.e(), (new StringBuilder()).append("onSeekComplete: fromSeekPosition = ").append(a.b).append(", seekPosition = ").append(a.f).toString());
        if (a.e && mediaplayer.getCurrentPosition() < a.f && !a.h)
        {
            mediaplayer.seekTo(a.f);
            a.h = true;
        } else
        if (a.b != -1)
        {
            HashMap hashmap = new HashMap();
            if (a.e)
            {
                hashmap.put("playheadPosition", Integer.valueOf(mediaplayer.getCurrentPosition()));
            }
            hashmap.put("seekPosition", Integer.valueOf(a.f));
            hashmap.put("fromSeekPosition", Integer.valueOf(a.b));
            hashmap.put("video", a.k);
            VideoDisplayComponent.x(a).emit("didSeekTo", hashmap);
            a.b = -1;
            a.h = false;
            return;
        }
    }
}
