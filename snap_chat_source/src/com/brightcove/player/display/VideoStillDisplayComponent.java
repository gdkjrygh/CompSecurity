// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import com.brightcove.player.display.tasks.LoadImageTask;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Component;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.util.ErrorUtil;
import java.net.URI;
import java.util.Map;

public class VideoStillDisplayComponent extends AbstractComponent
    implements Component
{
    final class a
        implements EventListener
    {

        private VideoStillDisplayComponent a;

        public final void processEvent(Event event)
        {
            event = VideoStillDisplayComponent.TAG;
            VideoStillDisplayComponent.a(a).setVisibility(4);
            if (VideoStillDisplayComponent.b(a) != null)
            {
                VideoStillDisplayComponent.b(a).cancel(true);
                VideoStillDisplayComponent.a(a, null);
            }
            VideoStillDisplayComponent.c(a);
            VideoStillDisplayComponent.e(a).off("cuePoint", VideoStillDisplayComponent.d(a));
            VideoStillDisplayComponent.g(a).off("progress", VideoStillDisplayComponent.f(a));
            VideoStillDisplayComponent.i(a).off("didSeekTo", VideoStillDisplayComponent.h(a));
            VideoStillDisplayComponent.k(a).off("willInterruptContent", VideoStillDisplayComponent.j(a));
            VideoStillDisplayComponent.m(a).off("activityStopped", VideoStillDisplayComponent.l(a));
            VideoStillDisplayComponent.o(a).off("fragmentStopped", VideoStillDisplayComponent.n(a));
        }

        private a()
        {
            a = VideoStillDisplayComponent.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    final class b
        implements EventListener
    {

        private VideoStillDisplayComponent a;

        public final void processEvent(Event event)
        {
            Object obj = VideoStillDisplayComponent.TAG;
            VideoStillDisplayComponent.c(a);
            obj = a. new a((byte)0);
            VideoStillDisplayComponent.a(a, VideoStillDisplayComponent.p(a).once("cuePoint", ((EventListener) (obj))));
            VideoStillDisplayComponent.b(a, VideoStillDisplayComponent.q(a).once("progress", ((EventListener) (obj))));
            VideoStillDisplayComponent.c(a, VideoStillDisplayComponent.r(a).once("didSeekTo", ((EventListener) (obj))));
            VideoStillDisplayComponent.d(a, VideoStillDisplayComponent.s(a).once("willInterruptContent", ((EventListener) (obj))));
            VideoStillDisplayComponent.e(a, VideoStillDisplayComponent.t(a).once("activityStopped", ((EventListener) (obj))));
            VideoStillDisplayComponent.f(a, VideoStillDisplayComponent.u(a).once("fragmentStopped", ((EventListener) (obj))));
            event = (URI)event.properties.get("video_still");
            VideoStillDisplayComponent.a(a, new LoadImageTask(VideoStillDisplayComponent.a(a), VideoStillDisplayComponent.v(a)));
            VideoStillDisplayComponent.b(a).setSuccessEventType("didSetVideoStill");
            VideoStillDisplayComponent.b(a).execute(new URI[] {
                event
            });
        }

        private b()
        {
            a = VideoStillDisplayComponent.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }


    public static final String TAG = com/brightcove/player/display/VideoStillDisplayComponent.getSimpleName();
    private ImageView a;
    private LoadImageTask b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    public VideoStillDisplayComponent(ImageView imageview, EventEmitter eventemitter)
    {
        super(eventemitter, com/brightcove/player/display/VideoStillDisplayComponent);
        if (imageview == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("imageViewRequired"));
        } else
        {
            a = imageview;
            addListener("setVideoStill", new b((byte)0));
            return;
        }
    }

    static int a(VideoStillDisplayComponent videostilldisplaycomponent, int i1)
    {
        videostilldisplaycomponent.c = i1;
        return i1;
    }

    static ImageView a(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.a;
    }

    static LoadImageTask a(VideoStillDisplayComponent videostilldisplaycomponent, LoadImageTask loadimagetask)
    {
        videostilldisplaycomponent.b = loadimagetask;
        return loadimagetask;
    }

    static int b(VideoStillDisplayComponent videostilldisplaycomponent, int i1)
    {
        videostilldisplaycomponent.d = i1;
        return i1;
    }

    static LoadImageTask b(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.b;
    }

    static int c(VideoStillDisplayComponent videostilldisplaycomponent, int i1)
    {
        videostilldisplaycomponent.e = i1;
        return i1;
    }

    static void c(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        videostilldisplaycomponent = videostilldisplaycomponent.a.getDrawable();
        if (videostilldisplaycomponent != null && (videostilldisplaycomponent instanceof BitmapDrawable))
        {
            ((BitmapDrawable)videostilldisplaycomponent).getBitmap().recycle();
        }
    }

    static int d(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.c;
    }

    static int d(VideoStillDisplayComponent videostilldisplaycomponent, int i1)
    {
        videostilldisplaycomponent.f = i1;
        return i1;
    }

    static int e(VideoStillDisplayComponent videostilldisplaycomponent, int i1)
    {
        videostilldisplaycomponent.g = i1;
        return i1;
    }

    static EventEmitter e(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.eventEmitter;
    }

    static int f(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.d;
    }

    static int f(VideoStillDisplayComponent videostilldisplaycomponent, int i1)
    {
        videostilldisplaycomponent.h = i1;
        return i1;
    }

    static EventEmitter g(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.eventEmitter;
    }

    static int h(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.e;
    }

    static EventEmitter i(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.eventEmitter;
    }

    static int j(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.f;
    }

    static EventEmitter k(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.eventEmitter;
    }

    static int l(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.g;
    }

    static EventEmitter m(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.eventEmitter;
    }

    static int n(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.h;
    }

    static EventEmitter o(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.eventEmitter;
    }

    static EventEmitter p(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.eventEmitter;
    }

    static EventEmitter q(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.eventEmitter;
    }

    static EventEmitter r(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.eventEmitter;
    }

    static EventEmitter s(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.eventEmitter;
    }

    static EventEmitter t(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.eventEmitter;
    }

    static EventEmitter u(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.eventEmitter;
    }

    static EventEmitter v(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        return videostilldisplaycomponent.eventEmitter;
    }

}
