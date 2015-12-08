// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import android.content.Context;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
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
//            r, t, h, g, 
//            i, a, j, k, 
//            l, m, n, o, 
//            p, q, b, c, 
//            d, f, s, u, 
//            BrightcoveClosedCaptioningView, RenderView

public abstract class BaseVideoView extends FrameLayout
    implements android.widget.MediaController.MediaPlayerControl, Component
{

    private static final String m = com/brightcove/player/view/BaseVideoView.getSimpleName();
    protected EventEmitter a;
    protected VideoPlaybackController b;
    protected DefaultSourceSelectionController c;
    protected VideoDisplayComponent d;
    protected VideoStillDisplayComponent e;
    protected BrightcovePluginManager f;
    protected int g;
    protected int h;
    protected android.media.MediaPlayer.OnPreparedListener i;
    protected ImageView j;
    protected Map k;
    protected BrightcoveClosedCaptioningController l;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;
    private ArrayList r;
    private Map s;
    private int t;
    private t u;
    private android.media.MediaPlayer.OnCompletionListener v;
    private android.media.MediaPlayer.OnInfoListener w;
    private BrightcoveClosedCaptioningView x;
    private MediaControlsVisibilityManager y;
    private FullScreenController z;

    public BaseVideoView(Context context)
    {
        super(context);
        r = new ArrayList();
        s = new HashMap();
        t = -1;
        k = new HashMap();
        a(context);
    }

    public BaseVideoView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public BaseVideoView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        r = new ArrayList();
        s = new HashMap();
        t = -1;
        k = new HashMap();
        a(context);
    }

    static int a(BaseVideoView basevideoview, int i1)
    {
        basevideoview.n = i1;
        return i1;
    }

    static t a(BaseVideoView basevideoview)
    {
        return basevideoview.u;
    }

    private void a(int i1, int j1)
    {
        if (t == -1 || t == i1)
        {
            setCurrentIndexPrivate(i1);
        } else
        {
            if (i1 < t)
            {
                t = t + j1;
                return;
            }
            if (t >= 0 && t + 1 == i1 && o)
            {
                j();
                return;
            }
        }
    }

    private void a(Video video, Pair pair)
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

    static void a(BaseVideoView basevideoview, Video video, Pair pair)
    {
        basevideoview.a(video, pair);
    }

    static boolean a(BaseVideoView basevideoview, boolean flag)
    {
        basevideoview.p = flag;
        return flag;
    }

    static int b(BaseVideoView basevideoview, int i1)
    {
        basevideoview.t = i1;
        return i1;
    }

    static void b(BaseVideoView basevideoview)
    {
        basevideoview.h();
    }

    static boolean b(BaseVideoView basevideoview, boolean flag)
    {
        basevideoview.q = flag;
        return flag;
    }

    static ArrayList c(BaseVideoView basevideoview)
    {
        return basevideoview.r;
    }

    static void c(BaseVideoView basevideoview, boolean flag)
    {
        basevideoview.setCurrentlyPlaying(flag);
    }

    static int d(BaseVideoView basevideoview)
    {
        int i1 = basevideoview.t;
        basevideoview.t = i1 + 1;
        return i1;
    }

    static boolean e(BaseVideoView basevideoview)
    {
        return basevideoview.q;
    }

    static android.media.MediaPlayer.OnCompletionListener f(BaseVideoView basevideoview)
    {
        return basevideoview.v;
    }

    static String g()
    {
        return m;
    }

    static void g(BaseVideoView basevideoview)
    {
        basevideoview.j();
    }

    static BrightcoveClosedCaptioningView h(BaseVideoView basevideoview)
    {
        return basevideoview.x;
    }

    private void h()
    {
        if (u == null)
        {
            u = new r(this, new BrightcoveMediaController(this));
        }
        u.e();
    }

    static MediaControlsVisibilityManager i(BaseVideoView basevideoview)
    {
        return basevideoview.y;
    }

    private void i()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("list", r);
        a.emit("didChangeList", hashmap);
    }

    static Map j(BaseVideoView basevideoview)
    {
        return basevideoview.s;
    }

    private void j()
    {
        if (k())
        {
            Video video = (Video)r.get(t + 1);
            Source source = (Source)s.get(video);
            if (source != null)
            {
                EventUtil.emit(a, "prebufferNextVideo", video, source);
                return;
            } else
            {
                HashMap hashmap = new HashMap();
                hashmap.put("video", video);
                a.request("selectSource", hashmap, new h(this, video));
                return;
            }
        } else
        {
            a.emit("prebufferNextVideo");
            return;
        }
    }

    private boolean k()
    {
        return r.size() > 1 && t + 1 < r.size();
    }

    private void setCurrentIndexPrivate(int i1)
    {
        if (i1 == -1)
        {
            p = false;
            if (t == -1)
            {
                return;
            }
        }
        UUID uuid = UUID.randomUUID();
        a.once("willChangeVideo", new g(this, uuid, i1));
        HashMap hashmap = new HashMap();
        hashmap.put("index", Integer.valueOf(t));
        hashmap.put("currentVideo", getCurrentVideo());
        Object obj = null;
        Video video = obj;
        if (i1 >= 0)
        {
            video = obj;
            if (i1 < r.size())
            {
                video = (Video)r.get(i1);
            }
        }
        hashmap.put("nextVideo", video);
        hashmap.put("uuid", uuid);
        a.emit("willChangeVideo", hashmap);
    }

    private void setCurrentlyPlaying(boolean flag)
    {
        o = flag;
        if (u != null)
        {
            u.g();
        }
    }

    protected abstract VideoDisplayComponent a(EventEmitter eventemitter);

    protected void a()
    {
        n = 0;
        h = 0;
        g = -1;
        setCurrentlyPlaying(false);
    }

    protected void a(Context context)
    {
        Log.i(m, "init");
        a();
        h = -1;
        setClickable(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        j = new ImageView(context);
        addView(j);
    }

    public void add(int i1, Video video)
    {
        r.add(i1, video);
        i();
        a(i1, 1);
    }

    public void add(Video video)
    {
        add(r.size(), video);
    }

    public void addAll(int i1, Collection collection)
    {
        r.addAll(i1, collection);
        i();
        a(i1, collection.size());
    }

    public void addAll(Collection collection)
    {
        addAll(r.size(), collection);
    }

    public void addListener(String s1, EventListener eventlistener)
    {
        k.put(s1, Integer.valueOf(a.on(s1, eventlistener)));
    }

    public void addSubtitleSource(Uri uri, BrightcoveCaptionFormat brightcovecaptionformat)
    {
        Video video = getCurrentVideo();
        uri = Pair.create(uri, brightcovecaptionformat);
        if (video != null)
        {
            a(video, uri);
            return;
        } else
        {
            a.once("willChangeVideo", new i(this, uri));
            return;
        }
    }

    public void addSubtitleSource(InputStream inputstream, MediaFormat mediaformat)
    {
    }

    protected DefaultSourceSelectionController b(EventEmitter eventemitter)
    {
        return new DefaultSourceSelectionController(eventemitter);
    }

    protected void b()
    {
        addListener("sourceNotPlayable", new a(this));
        addListener("videoDurationChanged", new j(this));
        OnProgressListener onprogresslistener = new OnProgressListener();
        addListener("progress", onprogresslistener);
        addListener("adProgress", onprogresslistener);
        addListener("didSetSource", new k(this));
        addListener("didSetVideo", new l(this));
        addListener("completed", new m(this));
        addListener("bufferedUpdate", new n(this));
        addListener("seekTo", new o(this));
        addListener("didSeekTo", new p(this));
        addListener("didPlay", new q(this));
        addListener("didStop", new b(this));
        addListener("didPause", new c(this));
        addListener("willInterruptContent", new d(this));
        addListener("didLoadClosedCaptions", new f(this));
    }

    protected void c()
    {
        if (i != null)
        {
            i.onPrepared(d.getMediaPlayer());
        }
        if (w != null)
        {
            d.getMediaPlayer().setOnInfoListener(w);
        }
    }

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
        if (r.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        r.clear();
        s.clear();
        setCurrentIndexPrivate(-1);
        if (flag)
        {
            i();
        }
    }

    public void clearOnCompletionListener()
    {
        v = null;
    }

    public void clearOnPreparedListener()
    {
        i = null;
    }

    protected void d()
    {
        if (u != null)
        {
            u.f();
        }
    }

    protected abstract boolean e();

    protected boolean f()
    {
        return d.getMediaPlayer() != null;
    }

    public Video get(int i1)
    {
        return (Video)r.get(i1);
    }

    public Analytics getAnalytics()
    {
        Analytics analytics = null;
        if (d != null)
        {
            analytics = d.getAnalytics();
        }
        return analytics;
    }

    public int getAudioSessionId()
    {
        return 0;
    }

    public BrightcoveMediaController getBrightcoveMediaController()
    {
        if (u != null)
        {
            return u.b();
        } else
        {
            return null;
        }
    }

    public int getBufferPercentage()
    {
        return n;
    }

    public BrightcoveClosedCaptioningController getClosedCaptioningController()
    {
        return l;
    }

    public BrightcoveClosedCaptioningView getClosedCaptioningView()
    {
        return x;
    }

    public int getCurrentIndex()
    {
        return t;
    }

    public int getCurrentPosition()
    {
        return h;
    }

    public Video getCurrentVideo()
    {
        Object obj = null;
        Video video = obj;
        if (t >= 0)
        {
            video = obj;
            if (t < r.size())
            {
                video = (Video)r.get(t);
            }
        }
        return video;
    }

    public int getDuration()
    {
        return g;
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
        return Collections.unmodifiableList(r);
    }

    public MediaController getMediaController()
    {
        if (u != null)
        {
            return u.a();
        } else
        {
            return null;
        }
    }

    public VideoPlaybackController getPlaybackController()
    {
        return b;
    }

    public abstract RenderView getRenderView();

    public DefaultSourceSelectionController getSourceController()
    {
        return c;
    }

    public VideoDisplayComponent getVideoDisplay()
    {
        return d;
    }

    public abstract int getVideoHeight();

    public VideoStillDisplayComponent getVideoStillDisplay()
    {
        return e;
    }

    public abstract int getVideoWidth();

    public boolean isFullScreen()
    {
        return z.isFullScreen();
    }

    public boolean isPlaying()
    {
        return o;
    }

    public void onControllerHide()
    {
        Log.i(m, "onControllerHide");
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (a == null)
        {
            setEventEmitter(new EventEmitterImpl());
        }
        y = new MediaControlsVisibilityManager(this);
        y.initListeners(a);
        z = new FullScreenController(this);
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        Log.v(m, (new StringBuilder()).append("onLayout: changed = ").append(flag).append(", left = ").append(i1).append(", top = ").append(j1).append(", right = ").append(k1).append(", bottom = ").append(l1).toString());
        super.onLayout(flag, i1, j1, k1, l1);
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1 = android.view.View.MeasureSpec.getSize(i1);
        int l1 = android.view.View.MeasureSpec.getMode(i1);
        int i2 = android.view.View.MeasureSpec.getSize(j1);
        int j2 = android.view.View.MeasureSpec.getMode(j1);
        Log.v(m, (new StringBuilder()).append("onMeasure: width = ").append(k1).append(", height = ").append(i2).append(", videoWidth = ").append(getVideoWidth()).append(", videoHeight = ").append(getVideoHeight()).append(", widthMode = ").append(LayoutUtil.getSpecMode(l1)).append(", heightMode = ").append(LayoutUtil.getSpecMode(j2)).toString());
        super.onMeasure(i1, j1);
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        Log.v(m, (new StringBuilder()).append("onSizeChanged: width = ").append(i1).append(", height = ").append(j1).append(", oldw = ").append(k1).append(", oldh = ").append(l1).toString());
        super.onSizeChanged(i1, j1, k1, l1);
    }

    public void pause()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("playheadPosition", Integer.valueOf(h));
        a.emit("pause", hashmap);
    }

    public void remove(int i1)
    {
        Video video = (Video)r.remove(i1);
        s.remove(video);
        if (t <= i1) goto _L2; else goto _L1
_L1:
        t = t - 1;
_L4:
        i();
        return;
_L2:
        if (r.isEmpty())
        {
            setCurrentIndexPrivate(-1);
        } else
        if (t == i1)
        {
            if (i1 == r.size())
            {
                setCurrentIndex(i1 - 1);
            } else
            if (i1 < r.size())
            {
                setCurrentIndexPrivate(i1);
            }
        } else
        if (t + 1 == i1 && o)
        {
            j();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void removeListener(String s1)
    {
        a.off(s1, ((Integer)k.get(s1)).intValue());
    }

    public void removeListeners()
    {
        String s1;
        for (Iterator iterator = k.keySet().iterator(); iterator.hasNext(); a.off(s1, ((Integer)k.get(s1)).intValue()))
        {
            s1 = (String)iterator.next();
        }

        k.clear();
    }

    public void seekTo(int i1)
    {
        Log.d(m, (new StringBuilder()).append("Seeking to ").append(i1).toString());
        HashMap hashmap = new HashMap();
        hashmap.put("seekPosition", Integer.valueOf(i1));
        h = i1;
        a.emit("seekTo", hashmap);
    }

    public void seekToLive()
    {
    }

    protected void setChildLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (j.getVisibility() == 0)
        {
            layoutparams = new android.widget.FrameLayout.LayoutParams(layoutparams.width, layoutparams.height);
            layoutparams.gravity = 17;
            j.setLayoutParams(layoutparams);
        }
    }

    public void setCurrentIndex(int i1)
    {
        if (i1 == t)
        {
            return;
        }
        if (i1 < 0 || i1 >= r.size())
        {
            throw new IndexOutOfBoundsException();
        } else
        {
            setCurrentIndexPrivate(i1);
            return;
        }
    }

    public void setEventEmitter(EventEmitter eventemitter)
    {
        a = RegisteringEventEmitter.build(eventemitter, getClass());
        b = new VideoPlaybackController(eventemitter);
        c = b(eventemitter);
        e = new VideoStillDisplayComponent(j, eventemitter);
        f = new BrightcovePluginManager(eventemitter);
        l = new BrightcoveClosedCaptioningController(this, getContext());
        d = a(eventemitter);
        b();
    }

    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        Log.v(m, (new StringBuilder()).append("setLayoutParams: ").append(layoutparams).toString());
        super.setLayoutParams(layoutparams);
        if (layoutparams != null)
        {
            setChildLayoutParams(layoutparams);
        }
    }

    public void setMediaController(MediaController mediacontroller)
    {
        if (mediacontroller != null)
        {
            mediacontroller = new s(this, mediacontroller);
        } else
        {
            mediacontroller = new u(this);
        }
        u = mediacontroller;
    }

    public void setMediaController(MediaController mediacontroller, View view, android.widget.MediaController.MediaPlayerControl mediaplayercontrol)
    {
        setMediaController(mediacontroller);
    }

    public void setMediaController(BrightcoveMediaController brightcovemediacontroller)
    {
        if (brightcovemediacontroller != null)
        {
            brightcovemediacontroller = new r(this, brightcovemediacontroller);
        } else
        {
            brightcovemediacontroller = new u(this);
        }
        u = brightcovemediacontroller;
    }

    public void setOnCompletionListener(android.media.MediaPlayer.OnCompletionListener oncompletionlistener)
    {
        v = oncompletionlistener;
    }

    public void setOnInfoListener(android.media.MediaPlayer.OnInfoListener oninfolistener)
    {
        w = oninfolistener;
    }

    public void setOnPreparedListener(android.media.MediaPlayer.OnPreparedListener onpreparedlistener)
    {
        i = onpreparedlistener;
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
            s1 = l.getLoadCaptionsService();
            if (s1 != null)
            {
                s1.loadCaptions((Uri)pair.first, ((BrightcoveCaptionFormat)pair.second).type());
            }
        }
    }

    public Video setVideoPath(String s1)
    {
        if (k())
        {
            a.emit("prebufferNextVideo");
        }
        r.clear();
        s.clear();
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
        if (k())
        {
            a.emit("prebufferNextVideo");
        }
        r.clear();
        s.clear();
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
        Log.v(m, "Setting up the Closed Captioning View.");
        if (x == null)
        {
            x = new BrightcoveClosedCaptioningView(getContext());
            x.initialize(a, this);
            return;
        } else
        {
            x.clear();
            x.prepareLayout();
            return;
        }
    }

    protected void setupClosedCaptioningRendering(Video video)
    {
label0:
        {
            Log.v(m, "setupClosedCaptioningRendering");
            if (l != null)
            {
                if (!l.checkIfCaptionsExist(video))
                {
                    break label0;
                }
                setupClosedCaptioningRendering();
            }
            return;
        }
        Log.v(m, "Captions do not exist! Not setting up the Closed Captioning View.");
    }

    public void start()
    {
        if (p)
        {
            q = false;
            HashMap hashmap = new HashMap();
            hashmap.put("playheadPosition", Integer.valueOf(h));
            a.emit("play", hashmap);
            return;
        }
        if (!r.isEmpty())
        {
            q = true;
            return;
        } else
        {
            Log.e(m, "No video to play.");
            return;
        }
    }

    public void stopPlayback()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("playheadPosition", Integer.valueOf(h));
        a.emit("stop", hashmap);
    }


    private class OnProgressListener
        implements EventListener
    {

        final BaseVideoView a;

        public void processEvent(Event event)
        {
            if (a.isPlaying())
            {
                int i1 = event.getIntegerProperty("duration");
                if (i1 > -1 && i1 != a.g)
                {
                    Log.v(BaseVideoView.g(), String.format("Changing duration to %d.", new Object[] {
                        Integer.valueOf(i1)
                    }));
                    a.g = i1;
                    if (BaseVideoView.a(a) instanceof s)
                    {
                        BaseVideoView.b(a);
                    }
                }
                i1 = event.getIntegerProperty("playheadPosition");
                if (i1 > -1 && i1 != a.h)
                {
                    Log.v(BaseVideoView.g(), String.format("Changing playheadPosition to %d.", new Object[] {
                        Integer.valueOf(i1)
                    }));
                    a.h = i1;
                }
            }
        }

        protected OnProgressListener()
        {
            a = BaseVideoView.this;
            super();
        }
    }

}
