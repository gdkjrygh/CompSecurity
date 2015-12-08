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

final class a
    implements android.media.stener
{

    private VideoDisplayComponent a;

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        if (!VideoDisplayComponent.v(a))
        {
            VideoDisplayComponent.y(a);
            if (a.j.getProperties().get("emittedDidSetSource") == null)
            {
                EventUtil.emit(VideoDisplayComponent.z(a), "didSetSource", a.i, a.j);
            }
            a.a(mediaplayer.getVideoWidth(), mediaplayer.getVideoHeight());
            HashMap hashmap = new HashMap();
            hashmap.put("video", a.i);
            hashmap.put("source", a.j);
            hashmap.put("duration", Integer.valueOf(mediaplayer.getDuration()));
            VideoDisplayComponent.A(a).emit("videoDurationChanged", hashmap);
        }
    }

    (VideoDisplayComponent videodisplaycomponent)
    {
        a = videodisplaycomponent;
        super();
    }
}
