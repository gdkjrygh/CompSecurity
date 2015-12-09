// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import android.media.MediaPlayer;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.model.Source;
import com.brightcove.player.util.EventUtil;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.brightcove.player.display:
//            VideoDisplayComponent

class h
    implements android.media.MediaPlayer.OnPreparedListener
{

    final VideoDisplayComponent a;

    h(VideoDisplayComponent videodisplaycomponent)
    {
        a = videodisplaycomponent;
        super();
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        if (!VideoDisplayComponent.v(a))
        {
            VideoDisplayComponent.b(a, true);
            if (a.l.getProperties().get("emittedDidSetSource") == null)
            {
                EventUtil.emit(VideoDisplayComponent.y(a), "didSetSource", a.k, a.l);
            }
            a.a(mediaplayer.getVideoWidth(), mediaplayer.getVideoHeight());
            HashMap hashmap = new HashMap();
            hashmap.put("video", a.k);
            hashmap.put("source", a.l);
            hashmap.put("duration", Integer.valueOf(mediaplayer.getDuration()));
            VideoDisplayComponent.z(a).emit("videoDurationChanged", hashmap);
        }
    }
}
