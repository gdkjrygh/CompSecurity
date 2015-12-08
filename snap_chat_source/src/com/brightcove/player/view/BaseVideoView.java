// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import android.content.Context;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.MediaController;
import com.brightcove.player.analytics.Analytics;
import com.brightcove.player.captioning.BrightcoveCaptionFormat;
import com.brightcove.player.captioning.LoadCaptionsService;
import com.brightcove.player.controller.BrightcoveClosedCaptioningController;
import com.brightcove.player.controller.DefaultSourceSelectionController;
import com.brightcove.player.controller.FullScreenController;
import com.brightcove.player.controller.MediaControlsVisibilityManager;
import com.brightcove.player.controller.VideoPlaybackController;
import com.brightcove.player.display.VideoDisplayComponent;
import com.brightcove.player.display.VideoStillDisplayComponent;
import com.brightcove.player.event.Component;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventEmitterImpl;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.RegisteringEventEmitter;
import com.brightcove.player.management.BrightcovePluginManager;
import com.brightcove.player.mediacontroller.BrightcoveMediaController;
import com.brightcove.player.model.Source;
import com.brightcove.player.model.Video;
import com.brightcove.player.util.EventUtil;
import com.brightcove.player.util.LayoutUtil;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

// Referenced classes of package com.brightcove.player.view:
//            BrightcoveClosedCaptioningView, RenderView

public abstract class BaseVideoView extends FrameLayout
    implements android.widget.MediaController.MediaPlayerControl, Component
{
    public class OnProgressListener
        implements EventListener
    {

        private BaseVideoView a;

        public void processEvent(Event event)
        {
            if (a.isPlaying())
            {
                int i1 = event.getIntegerProperty("duration");
                if (i1 >= 0 && i1 != a.c)
                {
                    BaseVideoView.e();
                    String.format("Changing duration to %d.", new Object[] {
                        Integer.valueOf(i1)
                    });
                    a.c = i1;
                    if (BaseVideoView.a(a) instanceof b)
                    {
                        BaseVideoView.b(a);
                    }
                }
                i1 = event.getIntegerProperty("playheadPosition");
                if (i1 >= 0 && i1 != a.d)
                {
                    BaseVideoView.e();
                    String.format("Changing playheadPosition to %d.", new Object[] {
                        Integer.valueOf(i1)
                    });
                    a.d = i1;
                }
            }
        }

        protected OnProgressListener()
        {
            a = BaseVideoView.this;
            super();
        }
    }

    final class a
        implements c
    {

        private BrightcoveMediaController a;

        public final MediaController a()
        {
            return null;
        }

        public final BrightcoveMediaController b()
        {
            return a;
        }

        public final void c()
        {
            a.hide();
        }

        public final void d()
        {
            a.show();
        }

        public final void e()
        {
            if (a.isShowing())
            {
                a.hide();
                return;
            } else
            {
                a.show();
                return;
            }
        }

        public final void f()
        {
        }

        public a(BrightcoveMediaController brightcovemediacontroller)
        {
            a = brightcovemediacontroller;
        }
    }

    final class b
        implements c
    {

        private MediaController a;
        private BaseVideoView b;

        public final MediaController a()
        {
            return a;
        }

        public final BrightcoveMediaController b()
        {
            return null;
        }

        public final void c()
        {
            if (b.c() && a != null)
            {
                a.hide();
            }
        }

        public final void d()
        {
            if (b.c() && a != null)
            {
                a.show();
            }
        }

        public final void e()
        {
label0:
            {
                if (a != null && b.c())
                {
                    if (!a.isShowing())
                    {
                        break label0;
                    }
                    a.hide();
                }
                return;
            }
            a.show();
        }

        public final void f()
        {
            if (a != null)
            {
                a.setMediaPlayer(b);
            }
        }

        public b(MediaController mediacontroller)
        {
            b = BaseVideoView.this;
            super();
            a = mediacontroller;
            BaseVideoView.e();
            if (a != null)
            {
                a.setMediaPlayer(b);
                mediacontroller = a;
                if (b.getParent() instanceof View)
                {
                    basevideoview = (View)b.getParent();
                } else
                {
                    basevideoview = b;
                }
                mediacontroller.setAnchorView(BaseVideoView.this);
                if (b.d())
                {
                    a.setEnabled(true);
                    BaseVideoView.k(b).setVisibilityState();
                    d();
                    if (b.d > 0)
                    {
                        BaseVideoView.e();
                    }
                }
            }
        }
    }

    static interface c
    {

        public abstract MediaController a();

        public abstract BrightcoveMediaController b();

        public abstract void c();

        public abstract void d();

        public abstract void e();

        public abstract void f();
    }

    final class d
        implements c
    {

        public final MediaController a()
        {
            return null;
        }

        public final BrightcoveMediaController b()
        {
            return null;
        }

        public final void c()
        {
        }

        public final void d()
        {
        }

        public final void e()
        {
        }

        public final void f()
        {
        }

        public d()
        {
        }
    }


    private static final String f = com/brightcove/player/view/BaseVideoView.getSimpleName();
    protected EventEmitter a;
    protected VideoDisplayComponent b;
    protected int c;
    protected int d;
    BrightcoveClosedCaptioningController e;
    private VideoPlaybackController g;
    private DefaultSourceSelectionController h;
    private VideoStillDisplayComponent i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private ArrayList n;
    private Map o;
    private int p;
    private c q;
    private android.media.MediaPlayer.OnCompletionListener r;
    private android.media.MediaPlayer.OnInfoListener s;
    private android.media.MediaPlayer.OnPreparedListener t;
    private ImageView u;
    private Map v;
    private BrightcoveClosedCaptioningView w;
    private MediaControlsVisibilityManager x;
    private FullScreenController y;

    public BaseVideoView(Context context)
    {
        super(context);
        n = new ArrayList();
        o = new HashMap();
        p = -1;
        v = new HashMap();
        a(context);
    }

    public BaseVideoView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public BaseVideoView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        n = new ArrayList();
        o = new HashMap();
        p = -1;
        v = new HashMap();
        a(context);
    }

    static int a(BaseVideoView basevideoview, int i1)
    {
        basevideoview.j = i1;
        return i1;
    }

    static c a(BaseVideoView basevideoview)
    {
        return basevideoview.q;
    }

    private void a(int i1)
    {
        if (i1 == -1)
        {
            l = false;
            if (p == -1)
            {
                return;
            }
        }
        UUID uuid = UUID.randomUUID();
        a.once("willChangeVideo", new EventListener(uuid, i1) {

            private UUID a;
            private int b;
            private BaseVideoView c;

            public final void processEvent(Event event)
            {
label0:
                {
                    if (event.properties.get("uuid").equals(a))
                    {
                        c.a();
                        BaseVideoView.b(c, b);
                        event = (Video)event.properties.get("nextVideo");
                        if (event == null)
                        {
                            break label0;
                        }
                        EventUtil.emit(c.a, "setVideo", event);
                    }
                    return;
                }
                c.a.emit("setSource");
            }

            
            {
                c = BaseVideoView.this;
                a = uuid;
                b = i1;
                super();
            }
        });
        HashMap hashmap = new HashMap();
        hashmap.put("index", Integer.valueOf(p));
        hashmap.put("currentVideo", getCurrentVideo());
        Object obj = null;
        Video video = obj;
        if (i1 >= 0)
        {
            video = obj;
            if (i1 < n.size())
            {
                video = (Video)n.get(i1);
            }
        }
        hashmap.put("nextVideo", video);
        hashmap.put("uuid", uuid);
        a.emit("willChangeVideo", hashmap);
    }

    private void a(int i1, int j1)
    {
        if (p == -1 || p == i1)
        {
            a(i1);
        } else
        {
            if (i1 < p)
            {
                p = p + j1;
                return;
            }
            if (p >= 0 && p + 1 == i1 && k)
            {
                h();
                return;
            }
        }
    }

    static void a(Video video, Pair pair)
    {
        b(video, pair);
    }

    static void a(BaseVideoView basevideoview, boolean flag)
    {
        basevideoview.a(flag);
    }

    private void a(boolean flag)
    {
        k = flag;
        if (q != null)
        {
            q.f();
        }
    }

    static int b(BaseVideoView basevideoview, int i1)
    {
        basevideoview.p = i1;
        return i1;
    }

    private static void b(Video video, Pair pair)
    {
        List list = (List)video.getProperties().get("captionSources");
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            video.getProperties().put("captionSources", obj);
        }
        ((List) (obj)).add(pair);
    }

    static void b(BaseVideoView basevideoview)
    {
        basevideoview.f();
    }

    static ArrayList c(BaseVideoView basevideoview)
    {
        return basevideoview.n;
    }

    static int d(BaseVideoView basevideoview)
    {
        int i1 = basevideoview.p;
        basevideoview.p = i1 + 1;
        return i1;
    }

    static String e()
    {
        return f;
    }

    static boolean e(BaseVideoView basevideoview)
    {
        basevideoview.l = true;
        return true;
    }

    private void f()
    {
        if (q == null)
        {
            q = new a(new BrightcoveMediaController(this));
        }
        q.d();
    }

    static boolean f(BaseVideoView basevideoview)
    {
        return basevideoview.m;
    }

    private void g()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("list", n);
        a.emit("didChangeList", hashmap);
    }

    static boolean g(BaseVideoView basevideoview)
    {
        basevideoview.m = false;
        return false;
    }

    static android.media.MediaPlayer.OnCompletionListener h(BaseVideoView basevideoview)
    {
        return basevideoview.r;
    }

    private void h()
    {
        if (i())
        {
            Video video = (Video)n.get(p + 1);
            Source source = (Source)o.get(video);
            if (source != null)
            {
                EventUtil.emit(a, "prebufferNextVideo", video, source);
                return;
            } else
            {
                HashMap hashmap = new HashMap();
                hashmap.put("video", video);
                a.request("selectSource", hashmap, new EventListener(video) {

                    private Video a;
                    private BaseVideoView b;

                    public final void processEvent(Event event)
                    {
                        event = (Source)event.properties.get("source");
                        BaseVideoView.l(b).put(a, event);
                        EventUtil.emit(b.a, "didSelectSource", a, event);
                        EventUtil.emit(b.a, "prebufferNextVideo", a, event);
                    }

            
            {
                b = BaseVideoView.this;
                a = video;
                super();
            }
                });
                return;
            }
        } else
        {
            a.emit("prebufferNextVideo");
            return;
        }
    }

    static void i(BaseVideoView basevideoview)
    {
        basevideoview.h();
    }

    private boolean i()
    {
        return n.size() > 1 && p + 1 < n.size();
    }

    static BrightcoveClosedCaptioningView j(BaseVideoView basevideoview)
    {
        return basevideoview.w;
    }

    static MediaControlsVisibilityManager k(BaseVideoView basevideoview)
    {
        return basevideoview.x;
    }

    static Map l(BaseVideoView basevideoview)
    {
        return basevideoview.o;
    }

    protected abstract VideoDisplayComponent a(EventEmitter eventemitter);

    protected void a()
    {
        j = 0;
        d = 0;
        c = -1;
        a(false);
    }

    protected void a(Context context)
    {
        a();
        d = -1;
        setClickable(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        u = new ImageView(context);
        addView(u);
    }

    protected void a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (u.getVisibility() == 0)
        {
            layoutparams = new android.widget.FrameLayout.LayoutParams(layoutparams.width, layoutparams.height);
            layoutparams.gravity = 17;
            u.setLayoutParams(layoutparams);
        }
    }

    public void add(int i1, Video video)
    {
        n.add(i1, video);
        g();
        a(i1, 1);
    }

    public void add(Video video)
    {
        add(n.size(), video);
    }

    public void addAll(int i1, Collection collection)
    {
        n.addAll(i1, collection);
        g();
        a(i1, collection.size());
    }

    public void addAll(Collection collection)
    {
        addAll(n.size(), collection);
    }

    public void addListener(String s1, EventListener eventlistener)
    {
        v.put(s1, Integer.valueOf(a.on(s1, eventlistener)));
    }

    public void addSubtitleSource(Uri uri, BrightcoveCaptionFormat brightcovecaptionformat)
    {
        Video video = getCurrentVideo();
        uri = Pair.create(uri, brightcovecaptionformat);
        if (video != null)
        {
            b(video, uri);
            return;
        } else
        {
            a.once("willChangeVideo", new EventListener(uri) {

                private Pair a;

                public final void processEvent(Event event)
                {
                    event = (Video)event.properties.get("nextVideo");
                    if (event != null)
                    {
                        BaseVideoView.a(event, a);
                    }
                }

            
            {
                a = pair;
                super();
            }
            });
            return;
        }
    }

    public void addSubtitleSource(InputStream inputstream, MediaFormat mediaformat)
    {
    }

    protected final void b()
    {
        if (t != null)
        {
            t.onPrepared(b.getMediaPlayer());
        }
        if (s != null)
        {
            b.getMediaPlayer().setOnInfoListener(s);
        }
    }

    protected abstract boolean c();

    public boolean canPause()
    {
        return true;
    }

    public boolean canSeekBackward()
    {
        return true;
    }

    public boolean canSeekForward()
    {
        return true;
    }

    public void clear()
    {
        boolean flag;
        if (n.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.clear();
        o.clear();
        a(-1);
        if (flag)
        {
            g();
        }
    }

    public void clearOnCompletionListener()
    {
        r = null;
    }

    public void clearOnPreparedListener()
    {
        t = null;
    }

    protected final boolean d()
    {
        return b.getMediaPlayer() != null;
    }

    public void disableClosedCaptioningRendering()
    {
        if (w != null)
        {
            w.clear();
            w.prepareLayout();
            removeView(w);
            w = null;
        }
    }

    public Video get(int i1)
    {
        return (Video)n.get(i1);
    }

    public Analytics getAnalytics()
    {
        Analytics analytics = null;
        if (b != null)
        {
            analytics = b.getAnalytics();
        }
        return analytics;
    }

    public int getAudioSessionId()
    {
        return 0;
    }

    public BrightcoveMediaController getBrightcoveMediaController()
    {
        if (q != null)
        {
            return q.b();
        } else
        {
            return null;
        }
    }

    public int getBufferPercentage()
    {
        return j;
    }

    public BrightcoveClosedCaptioningController getClosedCaptioningController()
    {
        return e;
    }

    public BrightcoveClosedCaptioningView getClosedCaptioningView()
    {
        return w;
    }

    public int getCurrentIndex()
    {
        return p;
    }

    public int getCurrentPosition()
    {
        return d;
    }

    public Video getCurrentVideo()
    {
        Object obj = null;
        Video video = obj;
        if (p >= 0)
        {
            video = obj;
            if (p < n.size())
            {
                video = (Video)n.get(p);
            }
        }
        return video;
    }

    public int getDuration()
    {
        return c;
    }

    public EventEmitter getEventEmitter()
    {
        if (a == null)
        {
            return null;
        } else
        {
            return ((RegisteringEventEmitter)a).getRootEmitter();
        }
    }

    public List getList()
    {
        return Collections.unmodifiableList(n);
    }

    public int getMeasuredVideoHeight()
    {
        return getRenderView().getMeasuredVideoHeight();
    }

    public int getMeasuredVideoWidth()
    {
        return getRenderView().getMeasuredVideoWidth();
    }

    public MediaController getMediaController()
    {
        if (q != null)
        {
            return q.a();
        } else
        {
            return null;
        }
    }

    public VideoPlaybackController getPlaybackController()
    {
        return g;
    }

    public abstract RenderView getRenderView();

    public DefaultSourceSelectionController getSourceController()
    {
        return h;
    }

    public VideoDisplayComponent getVideoDisplay()
    {
        return b;
    }

    public abstract int getVideoHeight();

    public VideoStillDisplayComponent getVideoStillDisplay()
    {
        return i;
    }

    public abstract int getVideoWidth();

    public boolean isFullScreen()
    {
        return y.isFullScreen();
    }

    public boolean isHlsRecommended()
    {
        return false;
    }

    public boolean isPlaying()
    {
        return k;
    }

    public void onControllerHide()
    {
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (a == null)
        {
            setEventEmitter(new EventEmitterImpl());
        }
        x = new MediaControlsVisibilityManager(this);
        x.initListeners(a);
        y = new FullScreenController(this);
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        (new StringBuilder("onLayout: changed = ")).append(flag).append(", left = ").append(i1).append(", top = ").append(j1).append(", right = ").append(k1).append(", bottom = ").append(l1);
        super.onLayout(flag, i1, j1, k1, l1);
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1 = android.view.View.MeasureSpec.getSize(i1);
        int l1 = android.view.View.MeasureSpec.getMode(i1);
        int i2 = android.view.View.MeasureSpec.getSize(j1);
        int j2 = android.view.View.MeasureSpec.getMode(j1);
        (new StringBuilder("onMeasure: width = ")).append(k1).append(", height = ").append(i2).append(", videoWidth = ").append(getVideoWidth()).append(", videoHeight = ").append(getVideoHeight()).append(", widthMode = ").append(LayoutUtil.getSpecMode(l1)).append(", heightMode = ").append(LayoutUtil.getSpecMode(j2));
        super.onMeasure(i1, j1);
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        (new StringBuilder("onSizeChanged: width = ")).append(i1).append(", height = ").append(j1).append(", oldw = ").append(k1).append(", oldh = ").append(l1);
        super.onSizeChanged(i1, j1, k1, l1);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (q == null)
        {
            f();
        } else
        {
            q.e();
        }
        return false;
    }

    public void pause()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("playheadPosition", Integer.valueOf(d));
        a.emit("pause", hashmap);
    }

    public void remove(int i1)
    {
        Video video = (Video)n.remove(i1);
        o.remove(video);
        if (p <= i1) goto _L2; else goto _L1
_L1:
        p = p - 1;
_L4:
        g();
        return;
_L2:
        if (n.isEmpty())
        {
            a(-1);
        } else
        if (p == i1)
        {
            if (i1 == n.size())
            {
                setCurrentIndex(i1 - 1);
            } else
            if (i1 < n.size())
            {
                a(i1);
            }
        } else
        if (p + 1 == i1 && k)
        {
            h();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void removeListener(String s1)
    {
        a.off(s1, ((Integer)v.get(s1)).intValue());
    }

    public void removeListeners()
    {
        String s1;
        for (Iterator iterator = v.keySet().iterator(); iterator.hasNext(); a.off(s1, ((Integer)v.get(s1)).intValue()))
        {
            s1 = (String)iterator.next();
        }

        v.clear();
    }

    public void seekTo(int i1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("seekPosition", Integer.valueOf(i1));
        d = i1;
        a.emit("seekTo", hashmap);
    }

    public void seekToLive()
    {
    }

    public void setCurrentIndex(int i1)
    {
        if (i1 == p)
        {
            return;
        }
        if (i1 < 0 || i1 >= n.size())
        {
            throw new IndexOutOfBoundsException();
        } else
        {
            a(i1);
            return;
        }
    }

    public void setEventEmitter(EventEmitter eventemitter)
    {
        a = RegisteringEventEmitter.build(eventemitter, getClass());
        g = new VideoPlaybackController(eventemitter);
        h = new DefaultSourceSelectionController(eventemitter);
        i = new VideoStillDisplayComponent(u, eventemitter);
        new BrightcovePluginManager(eventemitter);
        e = new BrightcoveClosedCaptioningController(this, getContext());
        b = a(eventemitter);
        addListener("sourceNotPlayable", new EventListener() {

            private BaseVideoView a;

            public final void processEvent(Event event)
            {
                a.a.emit("stop");
            }

            
            {
                a = BaseVideoView.this;
                super();
            }
        });
        addListener("videoDurationChanged", new EventListener() {

            private BaseVideoView a;

            public final void processEvent(Event event)
            {
                int i1 = event.getIntegerProperty("duration");
                if (i1 > 0)
                {
                    BaseVideoView.e();
                    String.format("videoDurationChanged: changing duration to %d.", new Object[] {
                        Integer.valueOf(i1)
                    });
                    a.c = i1;
                    BaseVideoView.b(a);
                }
            }

            
            {
                a = BaseVideoView.this;
                super();
            }
        });
        eventemitter = new OnProgressListener();
        addListener("progress", eventemitter);
        addListener("adProgress", eventemitter);
        addListener("didSetSource", new EventListener() {

            private BaseVideoView a;

            public final void processEvent(Event event)
            {
                a.b();
                event = (Video)event.properties.get("video");
                if (event != null && !event.equals(a.getCurrentVideo()) && BaseVideoView.c(a).indexOf(event) >= 0)
                {
                    BaseVideoView.d(a);
                }
                BaseVideoView.e(a);
                if (BaseVideoView.f(a))
                {
                    BaseVideoView.g(a);
                    a.a.emit("play");
                }
            }

            
            {
                a = BaseVideoView.this;
                super();
            }
        });
        addListener("didSetVideo", new EventListener() {

            private BaseVideoView a;

            public final void processEvent(Event event)
            {
                BaseVideoView basevideoview;
label0:
                {
                    event = (Video)event.properties.get("video");
                    basevideoview = a;
                    if (basevideoview.e != null)
                    {
                        if (!basevideoview.e.checkIfCaptionsExist(event))
                        {
                            break label0;
                        }
                        basevideoview.setupClosedCaptioningRendering();
                    }
                    return;
                }
                basevideoview.disableClosedCaptioningRendering();
            }

            
            {
                a = BaseVideoView.this;
                super();
            }
        });
        addListener("completed", new EventListener() {

            private BaseVideoView a;

            public final void processEvent(Event event)
            {
                if (BaseVideoView.h(a) != null)
                {
                    BaseVideoView.h(a).onCompletion(null);
                }
                a.d = 0;
                BaseVideoView.a(a, false);
            }

            
            {
                a = BaseVideoView.this;
                super();
            }
        });
        addListener("bufferedUpdate", new EventListener() {

            private BaseVideoView a;

            public final void processEvent(Event event)
            {
                BaseVideoView.a(a, event.getIntegerProperty("percentComplete"));
            }

            
            {
                a = BaseVideoView.this;
                super();
            }
        });
        addListener("seekTo", new EventListener() {

            private BaseVideoView a;

            public final void processEvent(Event event)
            {
                int i1 = event.getIntegerProperty("seekPosition");
                if (i1 >= 0)
                {
                    a.d = i1;
                }
            }

            
            {
                a = BaseVideoView.this;
                super();
            }
        });
        addListener("didSeekTo", new EventListener() {

            private BaseVideoView a;

            public final void processEvent(Event event)
            {
                int i1 = event.getIntegerProperty("playheadPosition");
                if (i1 >= 0)
                {
                    a.d = i1;
                }
            }

            
            {
                a = BaseVideoView.this;
                super();
            }
        });
        addListener("didPlay", new EventListener() {

            private BaseVideoView a;

            public final void processEvent(Event event)
            {
                BaseVideoView.a(a, true);
                BaseVideoView.b(a);
                BaseVideoView.i(a);
            }

            
            {
                a = BaseVideoView.this;
                super();
            }
        });
        addListener("didStop", new EventListener() {

            private BaseVideoView a;

            public final void processEvent(Event event)
            {
                a.a();
            }

            
            {
                a = BaseVideoView.this;
                super();
            }
        });
        addListener("didPause", new EventListener() {

            private BaseVideoView a;

            public final void processEvent(Event event)
            {
                BaseVideoView.a(a, false);
            }

            
            {
                a = BaseVideoView.this;
                super();
            }
        });
        addListener("willInterruptContent", new EventListener() {

            final BaseVideoView a;

            public final void processEvent(Event event)
            {
                if (BaseVideoView.a(a) != null)
                {
                    BaseVideoView.a(a).c();
                    a.a.once("progress", new EventListener(this) {

                        private _cls4 a;

                        public final void processEvent(Event event)
                        {
                            BaseVideoView.b(a.a);
                        }

            
            {
                a = _pcls4;
                super();
            }
                    });
                }
            }

            
            {
                a = BaseVideoView.this;
                super();
            }
        });
        addListener("didLoadClosedCaptions", new EventListener() {

            private BaseVideoView a;

            public final void processEvent(Event event)
            {
                if (BaseVideoView.j(a) != null)
                {
                    if (event.properties.containsKey("ttmlDocument") || event.properties.containsKey("webvttDocument"))
                    {
                        if (BaseVideoView.j(a).getParent() == null)
                        {
                            a.addView(BaseVideoView.j(a));
                        }
                    } else
                    if (BaseVideoView.j(a).getParent() != null)
                    {
                        a.removeView(BaseVideoView.j(a));
                        return;
                    }
                }
            }

            
            {
                a = BaseVideoView.this;
                super();
            }
        });
        addListener("captionsAvailable", new EventListener() {

            private BaseVideoView a;

            public final void processEvent(Event event)
            {
                if (((Boolean)event.properties.get("boolean")).booleanValue())
                {
                    a.setupClosedCaptioningRendering();
                    return;
                } else
                {
                    a.disableClosedCaptioningRendering();
                    return;
                }
            }

            
            {
                a = BaseVideoView.this;
                super();
            }
        });
    }

    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        (new StringBuilder("setLayoutParams: ")).append(layoutparams);
        super.setLayoutParams(layoutparams);
        if (layoutparams != null)
        {
            a(layoutparams);
        }
    }

    public void setMediaController(MediaController mediacontroller)
    {
        if (mediacontroller != null)
        {
            mediacontroller = new b(mediacontroller);
        } else
        {
            mediacontroller = new d();
        }
        q = mediacontroller;
    }

    public void setMediaController(MediaController mediacontroller, View view, android.widget.MediaController.MediaPlayerControl mediaplayercontrol)
    {
        setMediaController(mediacontroller);
    }

    public void setMediaController(BrightcoveMediaController brightcovemediacontroller)
    {
        if (brightcovemediacontroller != null)
        {
            brightcovemediacontroller = new a(brightcovemediacontroller);
        } else
        {
            brightcovemediacontroller = new d();
        }
        q = brightcovemediacontroller;
    }

    public void setOnCompletionListener(android.media.MediaPlayer.OnCompletionListener oncompletionlistener)
    {
        r = oncompletionlistener;
    }

    public void setOnInfoListener(android.media.MediaPlayer.OnInfoListener oninfolistener)
    {
        s = oninfolistener;
    }

    public void setOnPreparedListener(android.media.MediaPlayer.OnPreparedListener onpreparedlistener)
    {
        t = onpreparedlistener;
    }

    public void setSubtitleLocale(String s1)
    {
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 19)
            {
                break label0;
            }
            Iterator iterator = ((List)getCurrentVideo().getProperties().get("captionSources")).iterator();
            Pair pair;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                pair = (Pair)iterator.next();
            } while (!((BrightcoveCaptionFormat)pair.second).language().equals(s1));
            s1 = e.getLoadCaptionsService();
            if (s1 != null)
            {
                s1.loadCaptions((Uri)pair.first, ((BrightcoveCaptionFormat)pair.second).type());
            }
        }
    }

    public Video setVideoPath(String s1)
    {
        if (i())
        {
            a.emit("prebufferNextVideo");
        }
        n.clear();
        o.clear();
        s1 = Video.createVideo(s1);
        add(s1);
        return s1;
    }

    public Video setVideoPath(String s1, String s2)
    {
        return setVideoPath(s1, Collections.singletonMap("en", s2));
    }

    public Video setVideoPath(String s1, Map map)
    {
        if (i())
        {
            a.emit("prebufferNextVideo");
        }
        n.clear();
        o.clear();
        s1 = Video.createVideo(s1);
        ArrayList arraylist = new ArrayList();
        s1.getProperties().put("captionSources", arraylist);
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            if (entry != null && !entry.toString().isEmpty())
            {
                BrightcoveCaptionFormat brightcovecaptionformat = BrightcoveCaptionFormat.createCaptionFormat("text/unknown", (String)entry.getKey());
                arraylist.add(Pair.create(Uri.parse((String)entry.getValue()), brightcovecaptionformat));
            }
        } while (true);
        add(s1);
        return s1;
    }

    public Video setVideoURI(Uri uri)
    {
        return setVideoPath(uri.toString());
    }

    public void setupClosedCaptioningRendering()
    {
        if (w == null)
        {
            w = new BrightcoveClosedCaptioningView(getContext());
            w.initialize(a, this);
            addView(w);
        }
    }

    public void start()
    {
        if (l)
        {
            m = false;
            HashMap hashmap = new HashMap();
            hashmap.put("playheadPosition", Integer.valueOf(d));
            a.emit("play", hashmap);
        } else
        if (!n.isEmpty())
        {
            m = true;
            return;
        }
    }

    public void stopPlayback()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("playheadPosition", Integer.valueOf(d));
        a.emit("stop", hashmap);
    }

}
