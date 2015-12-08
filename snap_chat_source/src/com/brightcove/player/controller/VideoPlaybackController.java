// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Component;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.model.CuePoint;
import com.brightcove.player.model.Source;
import com.brightcove.player.model.Video;
import com.brightcove.player.util.EventUtil;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class VideoPlaybackController extends AbstractComponent
    implements Component
{
    public class OnDidSeekToListener
        implements EventListener
    {

        private VideoPlaybackController a;

        public void processEvent(Event event)
        {
            int i1 = VideoPlaybackController.a(a);
            VideoPlaybackController.a(a, event.getIntegerProperty("seekPosition"));
            if (i1 < VideoPlaybackController.a(a))
            {
                VideoPlaybackController.a(a, i1, VideoPlaybackController.a(a));
                return;
            } else
            {
                VideoPlaybackController.a(a, VideoPlaybackController.a(a), i1);
                return;
            }
        }

        protected OnDidSeekToListener()
        {
            a = VideoPlaybackController.this;
            super();
        }
    }

    public class OnDidSetSourceListener
        implements EventListener
    {

        private VideoPlaybackController a;

        public void processEvent(Event event)
        {
            Video video = (Video)event.properties.get("video");
            event = (Source)event.properties.get("source");
            if (video != null && event != null)
            {
                EventUtil.emit(VideoPlaybackController.m(a), "didSetVideo", video);
            }
        }

        protected OnDidSetSourceListener()
        {
            a = VideoPlaybackController.this;
            super();
        }
    }

    public class OnPlayListener
        implements EventListener
    {

        final VideoPlaybackController a;

        public void processEvent(Event event)
        {
            String s = VideoPlaybackController.TAG;
            (new StringBuilder("OnPlayListener: playEvent = ")).append(event).append(", currentTime = ").append(VideoPlaybackController.a(a));
            if (VideoPlaybackController.a(a) == 0 && !event.properties.containsKey("skipCuePoints"))
            {
                Object obj = VideoPlaybackController.TAG;
                (new StringBuilder("cuePoints = ")).append(VideoPlaybackController.b(a));
                obj = new ArrayList();
                Iterator iterator = VideoPlaybackController.b(a).iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    CuePoint cuepoint = (CuePoint)iterator.next();
                    if (cuepoint.getPositionType().equals(com.brightcove.player.model.CuePoint.PositionType.BEFORE) || cuepoint.getPositionType().equals(com.brightcove.player.model.CuePoint.PositionType.POINT_IN_TIME) && cuepoint.getPosition() == 0)
                    {
                        ((ArrayList) (obj)).add(cuepoint);
                    }
                } while (true);
                if (!((ArrayList) (obj)).isEmpty())
                {
                    Object obj1 = VideoPlaybackController.TAG;
                    (new StringBuilder("batch = ")).append(obj);
                    event.preventDefault();
                    event.stopPropagation();
                    event.properties.put("skipCuePoints", Boolean.valueOf(true));
                    obj1 = UUID.randomUUID();
                    VideoPlaybackController.d(a).once("cuePoint", new EventListener(this, ((UUID) (obj1)), event) {

                        private UUID a;
                        private Event b;
                        private OnPlayListener c;

                        public final void processEvent(Event event)
                        {
                            if (a.equals(event.properties.get("uuid")))
                            {
                                VideoPlaybackController.c(c.a).emit(b.getType(), b.properties);
                            }
                        }

            
            {
                c = onplaylistener;
                a = uuid;
                b = event;
                super();
            }
                    });
                    HashMap hashmap = new HashMap();
                    hashmap.put("cue_points", obj);
                    hashmap.put("endTime", Integer.valueOf(0));
                    hashmap.put("startTime", Integer.valueOf(0));
                    hashmap.put("original", event);
                    hashmap.put("uuid", obj1);
                    VideoPlaybackController.e(a).emit("cuePoint", hashmap);
                    return;
                }
            }
        }

        protected OnPlayListener()
        {
            a = VideoPlaybackController.this;
            super();
        }
    }

    public class OnPlayerReadyListener
        implements EventListener
    {

        private VideoPlaybackController a;

        public void processEvent(Event event)
        {
            if (!VideoPlaybackController.j(a))
            {
                VideoPlaybackController.n(a);
                if (VideoPlaybackController.l(a).size() > 0)
                {
                    Video video;
                    for (; VideoPlaybackController.l(a).size() > 0; EventUtil.emit(VideoPlaybackController.o(a), "setSource", video, event))
                    {
                        event = (Source)VideoPlaybackController.l(a).remove(0);
                        video = (Video)VideoPlaybackController.h(a).remove(event);
                    }

                }
            }
        }

        protected OnPlayerReadyListener()
        {
            a = VideoPlaybackController.this;
            super();
        }
    }

    public class OnRemoveCuePointListener
        implements EventListener
    {

        private VideoPlaybackController a;

        public void processEvent(Event event)
        {
            event = ((Event) (event.properties.get("cue_point")));
            if (event != null && (event instanceof CuePoint))
            {
                event = (CuePoint)event;
                VideoPlaybackController.b(a).remove(event);
                return;
            } else
            {
                event = VideoPlaybackController.TAG;
                return;
            }
        }

        protected OnRemoveCuePointListener()
        {
            a = VideoPlaybackController.this;
            super();
        }
    }

    public class OnSetCuePointListener
        implements EventListener
    {

        private VideoPlaybackController a;

        public void processEvent(Event event)
        {
            event = ((Event) (event.properties.get("cue_point")));
            if (event != null && (event instanceof CuePoint))
            {
                event = (CuePoint)event;
                VideoPlaybackController.b(a).add(event);
                return;
            } else
            {
                event = VideoPlaybackController.TAG;
                return;
            }
        }

        protected OnSetCuePointListener()
        {
            a = VideoPlaybackController.this;
            super();
        }
    }

    public class OnSetCuePointsListener
        implements EventListener
    {

        private VideoPlaybackController a;

        public void processEvent(Event event)
        {
            event = ((Event) (event.properties.get("cue_points")));
            if (event != null && (event instanceof List))
            {
                event = (List)event;
                VideoPlaybackController.b(a).clear();
                VideoPlaybackController.b(a).addAll(event);
                return;
            } else
            {
                event = VideoPlaybackController.TAG;
                return;
            }
        }

        protected OnSetCuePointsListener()
        {
            a = VideoPlaybackController.this;
            super();
        }
    }

    public class OnSetVideoListener
        implements EventListener
    {

        private VideoPlaybackController a;

        public void processEvent(Event event)
        {
            event = (Video)event.properties.get("video");
            Object obj = VideoPlaybackController.TAG;
            (new StringBuilder("OnSetVideoListener: ")).append(event);
            obj = event.getProperties().get("stillImageUri");
            if (obj != null && (obj instanceof URI))
            {
                obj = (URI)obj;
                HashMap hashmap = new HashMap();
                hashmap.put("video_still", obj);
                VideoPlaybackController.f(a).emit("setVideoStill", hashmap);
            }
            obj = event.getCuePoints();
            if (obj != null)
            {
                VideoPlaybackController.b(a).addAll(((java.util.Collection) (obj)));
            }
            obj = new HashMap();
            ((Map) (obj)).put("video", event);
            OnSourceSelectedListener onsourceselectedlistener = a. new OnSourceSelectedListener();
            onsourceselectedlistener.currentVideo = event;
            VideoPlaybackController.g(a).request("selectSource", ((Map) (obj)), onsourceselectedlistener);
        }

        protected OnSetVideoListener()
        {
            a = VideoPlaybackController.this;
            super();
        }
    }

    public class OnSourceSelectedListener
        implements EventListener
    {

        private VideoPlaybackController a;
        public Video currentVideo;

        public void processEvent(Event event)
        {
            String s = VideoPlaybackController.TAG;
            event = (Source)event.properties.get("source");
            VideoPlaybackController.h(a).put(event, currentVideo);
            EventUtil.emit(VideoPlaybackController.i(a), "didSelectSource", currentVideo, event);
            if (VideoPlaybackController.j(a))
            {
                EventUtil.emit(VideoPlaybackController.k(a), "setSource", currentVideo, event);
                return;
            } else
            {
                VideoPlaybackController.l(a).add(event);
                return;
            }
        }

        protected OnSourceSelectedListener()
        {
            a = VideoPlaybackController.this;
            super();
        }
    }

    public class OnVideoCompletedListener
        implements EventListener
    {

        private VideoPlaybackController a;

        public void processEvent(Event event)
        {
            String s = VideoPlaybackController.TAG;
            (new StringBuilder("OnVideoCompletedListener: ")).append(event);
            VideoPlaybackController.a(a, 0);
            if (!event.properties.containsKey("skipCuePoints"))
            {
                ArrayList arraylist = new ArrayList();
                Iterator iterator = VideoPlaybackController.b(a).iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    CuePoint cuepoint = (CuePoint)iterator.next();
                    if (cuepoint.getPositionType().equals(com.brightcove.player.model.CuePoint.PositionType.AFTER))
                    {
                        arraylist.add(cuepoint);
                    }
                } while (true);
                if (!arraylist.isEmpty())
                {
                    event.preventDefault();
                    event.stopPropagation();
                    event.properties.put("skipCuePoints", Boolean.valueOf(true));
                    HashMap hashmap = new HashMap();
                    hashmap.put("cue_points", arraylist);
                    hashmap.put("endTime", Integer.valueOf(0));
                    hashmap.put("startTime", Integer.valueOf(0));
                    hashmap.put("original", event);
                    VideoPlaybackController.p(a).emit("cuePoint", hashmap);
                    return;
                }
            }
        }

        protected OnVideoCompletedListener()
        {
            a = VideoPlaybackController.this;
            super();
        }
    }

    public class OnWillChangeVideoListener
        implements EventListener
    {

        private VideoPlaybackController a;

        public void processEvent(Event event)
        {
            VideoPlaybackController.b(a).clear();
            VideoPlaybackController.a(a, 0);
        }

        protected OnWillChangeVideoListener()
        {
            a = VideoPlaybackController.this;
            super();
        }
    }

    final class a
        implements EventListener
    {

        private VideoPlaybackController a;

        public final void processEvent(Event event)
        {
            int i1 = event.getIntegerProperty("playheadPosition");
            if (VideoPlaybackController.a(a) != -1 && VideoPlaybackController.a(a) < i1)
            {
                int j1 = VideoPlaybackController.a(a);
                VideoPlaybackController.a(a, i1);
                VideoPlaybackController.a(a, j1, VideoPlaybackController.a(a));
            }
        }

        private a()
        {
            a = VideoPlaybackController.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    public static final String TAG = com/brightcove/player/controller/VideoPlaybackController.getSimpleName();
    private boolean a;
    private List b;
    private Map c;
    private List d;
    private int e;
    private OnPlayListener f;
    private OnSetVideoListener g;
    private OnDidSetSourceListener h;
    private OnPlayerReadyListener i;
    private a j;
    private OnVideoCompletedListener k;
    private OnDidSeekToListener l;
    private OnRemoveCuePointListener m;
    private OnSetCuePointListener n;
    private OnSetCuePointsListener o;
    private OnWillChangeVideoListener p;

    public VideoPlaybackController(EventEmitter eventemitter)
    {
        super(eventemitter, com/brightcove/player/controller/VideoPlaybackController);
        initialize();
    }

    static int a(VideoPlaybackController videoplaybackcontroller)
    {
        return videoplaybackcontroller.e;
    }

    static int a(VideoPlaybackController videoplaybackcontroller, int i1)
    {
        videoplaybackcontroller.e = i1;
        return i1;
    }

    static void a(VideoPlaybackController videoplaybackcontroller, int i1, int j1)
    {
        (new StringBuilder("emitCuePoints: beginning = ")).append(i1).append(", end = ").append(j1);
        ArrayList arraylist = new ArrayList();
        Iterator iterator = videoplaybackcontroller.d.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            CuePoint cuepoint = (CuePoint)iterator.next();
            if (cuepoint.getPositionType().equals(com.brightcove.player.model.CuePoint.PositionType.POINT_IN_TIME))
            {
                int k1 = cuepoint.getPosition();
                if (i1 < k1 && k1 <= j1)
                {
                    arraylist.add(cuepoint);
                }
            }
        } while (true);
        if (!arraylist.isEmpty())
        {
            (new StringBuilder("emitCuePoints: batch = ")).append(arraylist);
            Collections.sort(arraylist);
            HashMap hashmap = new HashMap();
            hashmap.put("startTime", Integer.valueOf(i1));
            hashmap.put("endTime", Integer.valueOf(j1));
            hashmap.put("cue_points", arraylist);
            videoplaybackcontroller.eventEmitter.emit("cuePoint", hashmap);
        }
    }

    static List b(VideoPlaybackController videoplaybackcontroller)
    {
        return videoplaybackcontroller.d;
    }

    static EventEmitter c(VideoPlaybackController videoplaybackcontroller)
    {
        return videoplaybackcontroller.eventEmitter;
    }

    static EventEmitter d(VideoPlaybackController videoplaybackcontroller)
    {
        return videoplaybackcontroller.eventEmitter;
    }

    static EventEmitter e(VideoPlaybackController videoplaybackcontroller)
    {
        return videoplaybackcontroller.eventEmitter;
    }

    static EventEmitter f(VideoPlaybackController videoplaybackcontroller)
    {
        return videoplaybackcontroller.eventEmitter;
    }

    static EventEmitter g(VideoPlaybackController videoplaybackcontroller)
    {
        return videoplaybackcontroller.eventEmitter;
    }

    static Map h(VideoPlaybackController videoplaybackcontroller)
    {
        return videoplaybackcontroller.c;
    }

    static EventEmitter i(VideoPlaybackController videoplaybackcontroller)
    {
        return videoplaybackcontroller.eventEmitter;
    }

    static boolean j(VideoPlaybackController videoplaybackcontroller)
    {
        return videoplaybackcontroller.a;
    }

    static EventEmitter k(VideoPlaybackController videoplaybackcontroller)
    {
        return videoplaybackcontroller.eventEmitter;
    }

    static List l(VideoPlaybackController videoplaybackcontroller)
    {
        return videoplaybackcontroller.b;
    }

    static EventEmitter m(VideoPlaybackController videoplaybackcontroller)
    {
        return videoplaybackcontroller.eventEmitter;
    }

    static boolean n(VideoPlaybackController videoplaybackcontroller)
    {
        videoplaybackcontroller.a = true;
        return true;
    }

    static EventEmitter o(VideoPlaybackController videoplaybackcontroller)
    {
        return videoplaybackcontroller.eventEmitter;
    }

    static EventEmitter p(VideoPlaybackController videoplaybackcontroller)
    {
        return videoplaybackcontroller.eventEmitter;
    }

    public boolean hasPendingSourcesToLoad()
    {
        return b.size() > 0;
    }

    public void initialize()
    {
        a = false;
        b = new ArrayList();
        c = new HashMap();
        d = new ArrayList();
        g = new OnSetVideoListener();
        i = new OnPlayerReadyListener();
        h = new OnDidSetSourceListener();
        f = new OnPlayListener();
        j = new a((byte)0);
        k = new OnVideoCompletedListener();
        m = new OnRemoveCuePointListener();
        n = new OnSetCuePointListener();
        o = new OnSetCuePointsListener();
        l = new OnDidSeekToListener();
        p = new OnWillChangeVideoListener();
        addListener("readyToPlay", i);
        addListener("setVideo", g);
        addListener("didSetSource", h);
        addListener("play", f);
        addListener("progress", j);
        addListener("completed", k);
        addListener("removeCuePoint", m);
        addListener("setCuePoint", n);
        addListener("setCuePoints", o);
        addListener("didSeekTo", l);
        addListener("willChangeVideo", p);
    }

}
