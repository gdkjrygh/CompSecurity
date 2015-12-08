// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.VideoView;
import com.comscore.utils.CSLog;
import java.util.HashMap;
import java.util.Timer;

// Referenced classes of package com.comscore.streaming:
//            o, m, StreamSenseEventType, StreamSense, 
//            n

public class StreamSenseVideoView extends VideoView
{

    private final String a;
    private final boolean b;
    private final int c;
    private final int d;
    private long e;
    private StreamSense f;
    private String g;
    private long h;
    private long i;
    private String j;
    private boolean k;
    private Timer l;
    private Timer m;
    private android.media.MediaPlayer.OnCompletionListener n;
    private final android.media.MediaPlayer.OnCompletionListener o;

    public StreamSenseVideoView(Context context)
    {
        super(context);
        a = "StreamSenseVideoView";
        b = true;
        c = 500;
        d = 500;
        e = -1L;
        f = null;
        g = "0x0";
        h = 0L;
        i = -1L;
        k = false;
        l = null;
        m = null;
        n = null;
        o = new o(this);
        h();
    }

    public StreamSenseVideoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = "StreamSenseVideoView";
        b = true;
        c = 500;
        d = 500;
        e = -1L;
        f = null;
        g = "0x0";
        h = 0L;
        i = -1L;
        k = false;
        l = null;
        m = null;
        n = null;
        o = new o(this);
        h();
    }

    public StreamSenseVideoView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a = "StreamSenseVideoView";
        b = true;
        c = 500;
        d = 500;
        e = -1L;
        f = null;
        g = "0x0";
        h = 0L;
        i = -1L;
        k = false;
        l = null;
        m = null;
        n = null;
        o = new o(this);
        h();
    }

    static long a(StreamSenseVideoView streamsensevideoview)
    {
        return streamsensevideoview.getCurrentPlayerSafePosition();
    }

    static long a(StreamSenseVideoView streamsensevideoview, long l1)
    {
        l1 = streamsensevideoview.h + l1;
        streamsensevideoview.h = l1;
        return l1;
    }

    private void a(MediaPlayer mediaplayer)
    {
        CSLog.d("StreamSenseVideoView", "onPlaybackCompleted");
        c(i(), getCurrentPlayerSafePosition());
    }

    static void a(StreamSenseVideoView streamsensevideoview, MediaPlayer mediaplayer)
    {
        streamsensevideoview.a(mediaplayer);
    }

    static void a(StreamSenseVideoView streamsensevideoview, HashMap hashmap)
    {
        streamsensevideoview.a(hashmap);
    }

    static void a(StreamSenseVideoView streamsensevideoview, HashMap hashmap, long l1)
    {
        streamsensevideoview.b(hashmap, l1);
    }

    private void a(HashMap hashmap)
    {
        this;
        JVM INSTR monitorenter ;
        f();
        if (l == null)
        {
            long l1 = getCurrentPlayerSafePosition();
            CSLog.d("StreamSenseVideoView", (new StringBuilder()).append("startStartTimer:").append(l1).toString());
            l = new Timer();
            l.schedule(new m(this, l1, hashmap), 500L);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        hashmap;
        throw hashmap;
    }

    private void a(HashMap hashmap, long l1)
    {
        f();
        d();
        if (f != null)
        {
            f.notify(StreamSenseEventType.END, hashmap, l1);
        }
    }

    private boolean a()
    {
        boolean flag;
        try
        {
            flag = isPlaying();
        }
        catch (IllegalStateException illegalstateexception)
        {
            return false;
        }
        return flag;
    }

    static long b(StreamSenseVideoView streamsensevideoview)
    {
        return streamsensevideoview.h;
    }

    private void b(HashMap hashmap, long l1)
    {
        k = false;
        d();
        if (f != null)
        {
            f.notify(StreamSenseEventType.PLAY, hashmap, l1);
        }
    }

    private boolean b()
    {
        return k;
    }

    private void c()
    {
        CSLog.d("StreamSenseVideoView", "onPauseForBuffering");
        k = true;
        i = System.currentTimeMillis();
        if (a())
        {
            c(i(), getCurrentPlayerSafePosition());
            e();
        }
    }

    private void c(HashMap hashmap, long l1)
    {
        if (!d() && f != null)
        {
            f.notify(StreamSenseEventType.PAUSE, hashmap, l1);
        }
    }

    static boolean c(StreamSenseVideoView streamsensevideoview)
    {
        return streamsensevideoview.d();
    }

    static void d(StreamSenseVideoView streamsensevideoview)
    {
        streamsensevideoview.g();
    }

    private boolean d()
    {
        this;
        JVM INSTR monitorenter ;
        if (l == null) goto _L2; else goto _L1
_L1:
        CSLog.d("StreamSenseVideoView", "cancelStartTimer");
        l.cancel();
        l = null;
        boolean flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    static Timer e(StreamSenseVideoView streamsensevideoview)
    {
        return streamsensevideoview.m;
    }

    private void e()
    {
        a(i());
    }

    private boolean f()
    {
        this;
        JVM INSTR monitorenter ;
        CSLog.d("StreamSenseVideoView", "cancelPlayingPollTimer()");
        if (m == null) goto _L2; else goto _L1
_L1:
        m.cancel();
        m = null;
        boolean flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    static boolean f(StreamSenseVideoView streamsensevideoview)
    {
        return streamsensevideoview.a();
    }

    private void g()
    {
        this;
        JVM INSTR monitorenter ;
        if (m == null)
        {
            CSLog.d("StreamSenseVideoView", "startPlayingPollTimer");
            long l1 = getCurrentPlayerSafePosition();
            m = new Timer();
            m.schedule(new n(this, l1), 250L);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static boolean g(StreamSenseVideoView streamsensevideoview)
    {
        return streamsensevideoview.b();
    }

    private long getCurrentPlayerSafePosition()
    {
        int i1;
        try
        {
            i1 = getCurrentPosition();
        }
        catch (IllegalStateException illegalstateexception)
        {
            CSLog.e("StreamSenseVideoView", "getCurrentSafePlayerPosition");
            return 0L;
        }
        return (long)i1;
    }

    private HashMap getPlayerMetadata()
    {
        HashMap hashmap = new HashMap();
        if (e <= 0L)
        {
            e = getDuration();
        }
        hashmap.put("ns_st_cl", String.valueOf(e));
        if (g == null || g.equals("0x0"))
        {
            g = (new StringBuilder()).append(getWidth()).append("x").append(getHeight()).toString();
        }
        hashmap.put("ns_st_cs", g);
        hashmap.put("ns_st_cu", j);
        hashmap.put("ns_st_mp", com/comscore/streaming/StreamSenseVideoView.getSimpleName());
        hashmap.put("ns_st_mv", Integer.toString(android.os.Build.VERSION.SDK_INT));
        return hashmap;
    }

    private void h()
    {
        super.setOnCompletionListener(o);
    }

    static boolean h(StreamSenseVideoView streamsensevideoview)
    {
        return streamsensevideoview.f();
    }

    private HashMap i()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("ns_ts", String.valueOf(System.currentTimeMillis()));
        hashmap.putAll(getPlayerMetadata());
        return hashmap;
    }

    static void i(StreamSenseVideoView streamsensevideoview)
    {
        streamsensevideoview.c();
    }

    static android.media.MediaPlayer.OnCompletionListener j(StreamSenseVideoView streamsensevideoview)
    {
        return streamsensevideoview.n;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        CSLog.d("StreamSenseVideoView", "onDetachedFromWindow");
        a(i(), getCurrentPlayerSafePosition());
    }

    public void pause()
    {
        super.pause();
        CSLog.d("StreamSenseVideoView", "pause");
        f();
        if (k)
        {
            h = h + (System.currentTimeMillis() - i);
        }
        k = false;
        i = -1L;
        c(i(), getCurrentPlayerSafePosition());
    }

    public void resume()
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.resume();
        }
        CSLog.d("StreamSenseVideoView", "resume");
        b(i(), getCurrentPlayerSafePosition());
    }

    public void seekTo(int i1)
    {
        super.seekTo(i1);
        CSLog.d("StreamSenseVideoView", (new StringBuilder()).append("seekTo:").append(i1).toString());
        if (a())
        {
            f();
            d();
            c(i(), -1L);
            e();
        }
    }

    public void setOnCompletionListener(android.media.MediaPlayer.OnCompletionListener oncompletionlistener)
    {
        super.setOnCompletionListener(o);
        n = oncompletionlistener;
    }

    public void setStreamSense(StreamSense streamsense)
    {
        f = streamsense;
        f.setLabel("ns_st_pv", "4.1307.02");
    }

    public void setVideoPath(String s)
    {
        super.setVideoPath(s);
        j = s;
    }

    public void setVideoURI(Uri uri)
    {
        super.setVideoURI(uri);
        j = uri.toString();
    }

    public void start()
    {
        super.start();
        if (l == null)
        {
            CSLog.d("StreamSenseVideoView", "start");
            e();
        }
    }

    public void stopPlayback()
    {
        super.stopPlayback();
        CSLog.d("StreamSenseVideoView", "stopPlayback");
        a(i(), getCurrentPlayerSafePosition());
    }
}
