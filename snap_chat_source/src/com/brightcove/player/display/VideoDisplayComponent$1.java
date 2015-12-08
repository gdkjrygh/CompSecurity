// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import android.media.MediaPlayer;
import com.brightcove.player.event.EventEmitter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.brightcove.player.display:
//            VideoDisplayComponent

final class a
    implements Runnable
{

    private VideoDisplayComponent a;

    public final void run()
    {
        try
        {
            if (VideoDisplayComponent.a(a) != null && VideoDisplayComponent.b(a) && a.c && VideoDisplayComponent.a(a).isPlaying() && VideoDisplayComponent.a(a).getCurrentPosition() >= 0)
            {
                HashMap hashmap = new HashMap(4);
                hashmap.put("video", a.i);
                hashmap.put("source", a.j);
                a.g = VideoDisplayComponent.a(a).getCurrentPosition();
                hashmap.put("playheadPosition", Integer.valueOf(a.g));
                a.h = VideoDisplayComponent.a(a).getDuration();
                hashmap.put("duration", Integer.valueOf(a.h));
                if (a.g > 0 && !VideoDisplayComponent.c(a))
                {
                    VideoDisplayComponent.d(a).emit("didPlay", hashmap);
                    VideoDisplayComponent.a(a, true);
                }
                VideoDisplayComponent.e(a).emit("progress", hashmap);
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            a.a();
            VideoDisplayComponent.b();
            (new StringBuilder("Media player position sampled when it was in an invalid state: ")).append(illegalstateexception.getMessage());
            VideoDisplayComponent.f(a).emit("error", Collections.singletonMap("error", illegalstateexception));
            return;
        }
        catch (Exception exception)
        {
            a.a();
            VideoDisplayComponent.b();
            (new StringBuilder("Error monitoring playback progress")).append(exception.getMessage());
            VideoDisplayComponent.g(a).emit("error", Collections.singletonMap("error", exception));
            return;
        }
    }

    (VideoDisplayComponent videodisplaycomponent)
    {
        a = videodisplaycomponent;
        super();
    }
}
