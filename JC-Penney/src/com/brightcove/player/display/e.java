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

class e
    implements android.media.MediaPlayer.OnBufferingUpdateListener
{

    final VideoDisplayComponent a;

    e(VideoDisplayComponent videodisplaycomponent)
    {
        a = videodisplaycomponent;
        super();
    }

    public void onBufferingUpdate(MediaPlayer mediaplayer, int i)
    {
        mediaplayer = new HashMap();
        mediaplayer.put("percentComplete", Integer.valueOf(i));
        VideoDisplayComponent.u(a).emit("bufferedUpdate", mediaplayer);
    }
}
