// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import android.util.Log;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Component;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.model.CuePoint;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.brightcove.player.controller:
//            q

public class VideoPlaybackController extends AbstractComponent
    implements Component
{

    public static final String TAG = com/brightcove/player/controller/VideoPlaybackController.getSimpleName();
    OnPlayListener a;
    OnSetVideoListener b;
    OnDidSetSourceListener c;
    OnPlayerReadyListener d;
    q e;
    OnVideoCompletedListener f;
    OnDidSeekToListener g;
    OnRemoveCuePointListener h;
    OnSetCuePointListener i;
    OnSetCuePointsListener j;
    OnWillChangeVideoListener k;
    private boolean l;
    private List m;
    private Map n;
    private List o;
    private int p;

    public VideoPlaybackController(EventEmitter eventemitter)
    {
        super(eventemitter, com/brightcove/player/controller/VideoPlaybackController);
        initialize();
    }

    static int a(VideoPlaybackController videoplaybackcontroller)
    {
        return videoplaybackcontroller.p;
    }

    static int a(VideoPlaybackController videoplaybackcontroller, int i1)
    {
        videoplaybackcontroller.p = i1;
        return i1;
    }

    private void a(int i1, int j1)
    {
        Log.v(TAG, (new StringBuilder()).append("emitCuePoints: beginning = ").append(i1).append(", end = ").append(j1).toString());
        ArrayList arraylist = new ArrayList();
        Iterator iterator = o.iterator();
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
            Log.v(TAG, (new StringBuilder()).append("emitCuePoints: batch = ").append(arraylist).toString());
            Collections.sort(arraylist);
            HashMap hashmap = new HashMap();
            hashmap.put("startTime", Integer.valueOf(i1));
            hashmap.put("endTime", Integer.valueOf(j1));
            hashmap.put("cue_points", arraylist);
            F.emit("cuePoint", hashmap);
        }
    }

    static void a(VideoPlaybackController videoplaybackcontroller, int i1, int j1)
    {
        videoplaybackcontroller.a(i1, j1);
    }

    static boolean a(VideoPlaybackController videoplaybackcontroller, boolean flag)
    {
        videoplaybackcontroller.l = flag;
        return flag;
    }

    static List b(VideoPlaybackController videoplaybackcontroller)
    {
        return videoplaybackcontroller.o;
    }

    static EventEmitter c(VideoPlaybackController videoplaybackcontroller)
    {
        return videoplaybackcontroller.F;
    }

    static EventEmitter d(VideoPlaybackController videoplaybackcontroller)
    {
        return videoplaybackcontroller.F;
    }

    static EventEmitter e(VideoPlaybackController videoplaybackcontroller)
    {
        return videoplaybackcontroller.F;
    }

    static EventEmitter f(VideoPlaybackController videoplaybackcontroller)
    {
        return videoplaybackcontroller.F;
    }

    static EventEmitter g(VideoPlaybackController videoplaybackcontroller)
    {
        return videoplaybackcontroller.F;
    }

    static Map h(VideoPlaybackController videoplaybackcontroller)
    {
        return videoplaybackcontroller.n;
    }

    static EventEmitter i(VideoPlaybackController videoplaybackcontroller)
    {
        return videoplaybackcontroller.F;
    }

    static boolean j(VideoPlaybackController videoplaybackcontroller)
    {
        return videoplaybackcontroller.l;
    }

    static EventEmitter k(VideoPlaybackController videoplaybackcontroller)
    {
        return videoplaybackcontroller.F;
    }

    static List l(VideoPlaybackController videoplaybackcontroller)
    {
        return videoplaybackcontroller.m;
    }

    static EventEmitter m(VideoPlaybackController videoplaybackcontroller)
    {
        return videoplaybackcontroller.F;
    }

    static EventEmitter n(VideoPlaybackController videoplaybackcontroller)
    {
        return videoplaybackcontroller.F;
    }

    static EventEmitter o(VideoPlaybackController videoplaybackcontroller)
    {
        return videoplaybackcontroller.F;
    }

    protected void a()
    {
        b = new OnSetVideoListener();
        d = new OnPlayerReadyListener();
        c = new OnDidSetSourceListener();
        a = new OnPlayListener();
        e = new q(this, null);
        f = new OnVideoCompletedListener();
        h = new OnRemoveCuePointListener();
        i = new OnSetCuePointListener();
        j = new OnSetCuePointsListener();
        g = new OnDidSeekToListener();
        k = new OnWillChangeVideoListener();
        addListener("readyToPlay", d);
        addListener("setVideo", b);
        addListener("didSetSource", c);
        addListener("play", a);
        addListener("progress", e);
        addListener("completed", f);
        addListener("removeCuePoint", h);
        addListener("setCuePoint", i);
        addListener("setCuePoints", j);
        addListener("didSeekTo", g);
        addListener("willChangeVideo", k);
    }

    public boolean hasPendingSourcesToLoad()
    {
        return m.size() > 0;
    }

    public void initialize()
    {
        Log.i(TAG, "Initializing VideoPlaybackController");
        l = false;
        m = new ArrayList();
        n = new HashMap();
        o = new ArrayList();
        a();
    }


    private class OnSetVideoListener
        implements EventListener
    {

        final VideoPlaybackController a;

        public void processEvent(Event event)
        {
            event = (Video)event.properties.get("video");
            Log.v(VideoPlaybackController.TAG, (new StringBuilder()).append("OnSetVideoListener: ").append(event).toString());
            Object obj = event.getProperties().get("stillImageUri");
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

        private class OnSourceSelectedListener
            implements EventListener
        {

            final VideoPlaybackController a;
            public Video currentVideo;

            public void processEvent(Event event)
            {
                Log.v(VideoPlaybackController.TAG, "OnSourceSelectedListener");
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

    }


    private class OnPlayerReadyListener
        implements EventListener
    {

        final VideoPlaybackController a;

        public void processEvent(Event event)
        {
            if (!VideoPlaybackController.j(a))
            {
                VideoPlaybackController.a(a, true);
                if (VideoPlaybackController.l(a).size() > 0)
                {
                    Video video;
                    for (; VideoPlaybackController.l(a).size() > 0; EventUtil.emit(VideoPlaybackController.n(a), "setSource", video, event))
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


    private class OnDidSetSourceListener
        implements EventListener
    {

        final VideoPlaybackController a;

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


    private class OnPlayListener
        implements EventListener
    {

        final VideoPlaybackController a;

        public void processEvent(Event event)
        {
            Log.v(VideoPlaybackController.TAG, (new StringBuilder()).append("OnPlayListener: playEvent = ").append(event).append(", currentTime = ").append(VideoPlaybackController.a(a)).toString());
            if (VideoPlaybackController.a(a) == 0 && !event.properties.containsKey("skipCuePoints"))
            {
                Log.i(VideoPlaybackController.TAG, (new StringBuilder()).append("cuePoints = ").append(VideoPlaybackController.b(a)).toString());
                ArrayList arraylist = new ArrayList();
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
                        arraylist.add(cuepoint);
                    }
                } while (true);
                if (!arraylist.isEmpty())
                {
                    Log.i(VideoPlaybackController.TAG, (new StringBuilder()).append("batch = ").append(arraylist).toString());
                    event.preventDefault();
                    event.stopPropagation();
                    event.properties.put("skipCuePoints", Boolean.valueOf(true));
                    UUID uuid = UUID.randomUUID();
                    VideoPlaybackController.d(a).once("cuePoint", new p(this, uuid, event));
                    HashMap hashmap = new HashMap();
                    hashmap.put("cue_points", arraylist);
                    hashmap.put("endTime", Integer.valueOf(0));
                    hashmap.put("startTime", Integer.valueOf(0));
                    hashmap.put("original", event);
                    hashmap.put("uuid", uuid);
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


    private class OnVideoCompletedListener
        implements EventListener
    {

        final VideoPlaybackController a;

        public void processEvent(Event event)
        {
            Log.v(VideoPlaybackController.TAG, (new StringBuilder()).append("OnVideoCompletedListener: ").append(event).toString());
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
                    VideoPlaybackController.o(a).emit("cuePoint", hashmap);
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


    private class OnRemoveCuePointListener
        implements EventListener
    {

        final VideoPlaybackController a;

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
                Log.e(VideoPlaybackController.TAG, "could not remove CuePoint");
                return;
            }
        }

        protected OnRemoveCuePointListener()
        {
            a = VideoPlaybackController.this;
            super();
        }
    }


    private class OnSetCuePointListener
        implements EventListener
    {

        final VideoPlaybackController a;

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
                Log.e(VideoPlaybackController.TAG, "could not find CuePoint in given Event");
                return;
            }
        }

        protected OnSetCuePointListener()
        {
            a = VideoPlaybackController.this;
            super();
        }
    }


    private class OnSetCuePointsListener
        implements EventListener
    {

        final VideoPlaybackController a;

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
                Log.e(VideoPlaybackController.TAG, "could not find List of CuePoints in given Event");
                return;
            }
        }

        protected OnSetCuePointsListener()
        {
            a = VideoPlaybackController.this;
            super();
        }
    }


    private class OnDidSeekToListener
        implements EventListener
    {

        final VideoPlaybackController a;

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


    private class OnWillChangeVideoListener
        implements EventListener
    {

        final VideoPlaybackController a;

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

}
