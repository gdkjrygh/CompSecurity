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
    implements android.media.pdateListener
{

    private VideoDisplayComponent a;

    public final void onBufferingUpdate(MediaPlayer mediaplayer, int i)
    {
        mediaplayer = new HashMap();
        mediaplayer.put("percentComplete", Integer.valueOf(i));
        VideoDisplayComponent.u(a).emit("bufferedUpdate", mediaplayer);
    }

    (VideoDisplayComponent videodisplaycomponent)
    {
        a = videodisplaycomponent;
        super();
    }
}
