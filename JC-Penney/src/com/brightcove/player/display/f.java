// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import android.media.MediaPlayer;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.media.DeliveryType;
import com.brightcove.player.model.Source;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.brightcove.player.display:
//            VideoDisplayComponent

class f
    implements android.media.MediaPlayer.OnCompletionListener
{

    final VideoDisplayComponent a;

    f(VideoDisplayComponent videodisplaycomponent)
    {
        a = videodisplaycomponent;
        super();
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        if (!VideoDisplayComponent.v(a))
        {
            HashMap hashmap = new HashMap();
            if (mediaplayer != null && VideoDisplayComponent.b(a) && a.e)
            {
                hashmap.put("playheadPosition", Integer.valueOf(mediaplayer.getDuration()));
                hashmap.put("duration", Integer.valueOf(mediaplayer.getDuration()));
            }
            hashmap.put("video", a.k);
            VideoDisplayComponent.w(a).emit("completed", hashmap);
        }
        if (a.l != null && a.l.getDeliveryType() == DeliveryType.HLS)
        {
            a.d();
        }
    }
}
