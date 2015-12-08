// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import android.media.MediaPlayer;
import android.util.Log;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import java.util.Map;

// Referenced classes of package com.brightcove.player.display:
//            VideoDisplayComponent, p, q, r, 
//            a

class o
    implements EventListener
{

    final VideoDisplayComponent a;

    private o(VideoDisplayComponent videodisplaycomponent)
    {
        a = videodisplaycomponent;
        super();
    }

    o(VideoDisplayComponent videodisplaycomponent, a a1)
    {
        this(videodisplaycomponent);
    }

    public void processEvent(Event event)
    {
        Log.v(VideoDisplayComponent.e(), (new StringBuilder()).append("OnPlayListener: mediaPlayer = ").append(VideoDisplayComponent.a(a)).append(", hasPrepared = ").append(VideoDisplayComponent.b(a)).append(", hasSurface = ").append(a.e).toString());
        VideoDisplayComponent.a(a, false);
        if (a.l != null)
        {
            int i;
            if (event.properties.containsKey("playheadPosition"))
            {
                i = event.getIntegerProperty("playheadPosition");
            } else
            {
                Log.v(VideoDisplayComponent.e(), (new StringBuilder()).append("OnPlayListener: playheadPosition = ").append(a.i).toString());
                i = a.i;
            }
            if (VideoDisplayComponent.a(a) != null)
            {
                if (VideoDisplayComponent.b(a))
                {
                    if (a.e)
                    {
                        if (!VideoDisplayComponent.a(a).isPlaying())
                        {
                            VideoDisplayComponent.a(a, i);
                            return;
                        } else
                        {
                            Log.w(VideoDisplayComponent.e(), "Already playing.");
                            return;
                        }
                    } else
                    {
                        Log.v(VideoDisplayComponent.e(), "OnPlayListener: Surface is not available yet.");
                        VideoDisplayComponent.i(a).once("readyToPlay", new p(this, i));
                        return;
                    }
                } else
                {
                    Log.v(VideoDisplayComponent.e(), "OnPlayListener: MediaPlayer has not been prepared yet.");
                    VideoDisplayComponent.j(a).once("didSetSource", new q(this, i));
                    return;
                }
            } else
            {
                a.i = 0;
                Log.v(VideoDisplayComponent.e(), "OnPlayListener: MediaPlayer was null - creating a new one.");
                VideoDisplayComponent.k(a).once("videoDurationChanged", new r(this, i));
                a.a(a.k, a.l);
                return;
            }
        } else
        {
            Log.e(VideoDisplayComponent.e(), "Source has not been set yet.");
            return;
        }
    }
}
