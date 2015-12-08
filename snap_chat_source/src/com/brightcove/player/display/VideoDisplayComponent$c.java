// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import android.media.MediaPlayer;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import java.util.Map;

// Referenced classes of package com.brightcove.player.display:
//            VideoDisplayComponent

final class <init>
    implements EventListener
{

    final VideoDisplayComponent a;

    public final void processEvent(Event event)
    {
        VideoDisplayComponent.b();
        (new StringBuilder("OnPlayListener: mediaPlayer = ")).append(VideoDisplayComponent.a(a)).append(", hasPrepared = ").append(VideoDisplayComponent.b(a)).append(", hasSurface = ").append(a.c);
        VideoDisplayComponent.a(a, false);
        if (a.j != null)
        {
            int i;
            if (event.properties.containsKey("playheadPosition"))
            {
                i = event.getIntegerProperty("playheadPosition");
            } else
            {
                VideoDisplayComponent.b();
                (new StringBuilder("OnPlayListener: playheadPosition = ")).append(a.g);
                i = a.g;
            }
            if (VideoDisplayComponent.a(a) != null)
            {
                if (VideoDisplayComponent.b(a))
                {
                    if (a.c)
                    {
                        if (!VideoDisplayComponent.a(a).isPlaying())
                        {
                            VideoDisplayComponent.a(a, i);
                            return;
                        } else
                        {
                            VideoDisplayComponent.b();
                            return;
                        }
                    } else
                    {
                        VideoDisplayComponent.b();
                        VideoDisplayComponent.i(a).once("readyToPlay", new EventListener(i) {

                            private int a;
                            private VideoDisplayComponent.c b;

                            public final void processEvent(Event event1)
                            {
                                VideoDisplayComponent.a(b.a, a);
                            }

            
            {
                b = VideoDisplayComponent.c.this;
                a = i;
                super();
            }
                        });
                        return;
                    }
                } else
                {
                    VideoDisplayComponent.b();
                    VideoDisplayComponent.j(a).once("didSetSource", new EventListener(i) {

                        private int a;
                        private VideoDisplayComponent.c b;

                        public final void processEvent(Event event1)
                        {
                            VideoDisplayComponent.a(b.a, a);
                        }

            
            {
                b = VideoDisplayComponent.c.this;
                a = i;
                super();
            }
                    });
                    return;
                }
            } else
            {
                a.g = 0;
                VideoDisplayComponent.b();
                VideoDisplayComponent.k(a).once("videoDurationChanged", new EventListener(i) {

                    private int a;
                    private VideoDisplayComponent.c b;

                    public final void processEvent(Event event1)
                    {
                        VideoDisplayComponent.a(b.a, a);
                    }

            
            {
                b = VideoDisplayComponent.c.this;
                a = i;
                super();
            }
                });
                a.a(a.i, a.j);
                return;
            }
        } else
        {
            VideoDisplayComponent.b();
            return;
        }
    }

    private _cls3.a(VideoDisplayComponent videodisplaycomponent)
    {
        a = videodisplaycomponent;
        super();
    }

    a(VideoDisplayComponent videodisplaycomponent, byte byte0)
    {
        this(videodisplaycomponent);
    }
}
