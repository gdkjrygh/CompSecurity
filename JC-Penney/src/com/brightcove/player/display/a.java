// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import android.media.MediaPlayer;
import android.util.Log;
import com.brightcove.player.event.EventEmitter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.brightcove.player.display:
//            VideoDisplayComponent

class a
    implements Runnable
{

    final VideoDisplayComponent a;

    a(VideoDisplayComponent videodisplaycomponent)
    {
        a = videodisplaycomponent;
        super();
    }

    public void run()
    {
        try
        {
            if (VideoDisplayComponent.a(a) != null && VideoDisplayComponent.b(a) && a.e && VideoDisplayComponent.a(a).isPlaying() && VideoDisplayComponent.a(a).getCurrentPosition() >= 0)
            {
                HashMap hashmap = new HashMap(4);
                hashmap.put("video", a.k);
                a.i = VideoDisplayComponent.a(a).getCurrentPosition();
                hashmap.put("playheadPosition", Integer.valueOf(a.i));
                a.j = VideoDisplayComponent.a(a).getDuration();
                hashmap.put("duration", Integer.valueOf(a.j));
                if (a.i > 0 && !VideoDisplayComponent.c(a))
                {
                    hashmap.put("source", a.l);
                    VideoDisplayComponent.d(a).emit("didPlay", hashmap);
                    VideoDisplayComponent.a(a, true);
                }
                VideoDisplayComponent.e(a).emit("progress", hashmap);
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            a.d();
            Log.e(VideoDisplayComponent.e(), (new StringBuilder()).append("Media player position sampled when it was in an invalid state: ").append(illegalstateexception.getMessage()).toString(), illegalstateexception);
            VideoDisplayComponent.f(a).emit("error", Collections.singletonMap("error", illegalstateexception));
            return;
        }
        catch (Exception exception)
        {
            a.d();
            Log.e(VideoDisplayComponent.e(), (new StringBuilder()).append("Error monitoring playback progress").append(exception.getMessage()).toString(), exception);
            VideoDisplayComponent.g(a).emit("error", Collections.singletonMap("error", exception));
            return;
        }
    }
}
