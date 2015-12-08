// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import java.io.FileDescriptor;
import java.util.HashMap;
import java.util.Timer;

// Referenced classes of package com.comscore.streaming:
//            g, h, i, j, 
//            k, StreamSenseEventType, StreamSense, l

public class StreamSenseMediaPlayer extends MediaPlayer
{

    Timer a;
    Timer b;
    private final String c;
    private final int d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final int i;
    private StreamSense j;
    private String k;
    private String l;
    private boolean m;
    private boolean n;
    private String o;
    private android.media.MediaPlayer.OnCompletionListener p;
    private final android.media.MediaPlayer.OnCompletionListener q;
    private android.media.MediaPlayer.OnInfoListener r;
    private final android.media.MediaPlayer.OnInfoListener s;
    private android.media.MediaPlayer.OnSeekCompleteListener t;
    private final android.media.MediaPlayer.OnSeekCompleteListener u;
    private android.media.MediaPlayer.OnPreparedListener v;
    private final android.media.MediaPlayer.OnPreparedListener w;
    private Timer x;
    private Timer y;

    public StreamSenseMediaPlayer()
    {
        c = "local_file";
        d = 500;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT < 9)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
        f = false;
        g = false;
        h = true;
        i = 500;
        j = null;
        k = "0";
        l = "0x0";
        m = false;
        n = false;
        p = null;
        q = new g(this);
        r = null;
        s = new h(this);
        t = null;
        u = new i(this);
        v = null;
        w = new j(this);
        x = null;
        a = null;
        b = null;
        y = null;
        c();
    }

    public StreamSenseMediaPlayer(boolean flag)
    {
        c = "local_file";
        d = 500;
        if (android.os.Build.VERSION.SDK_INT < 9)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
        f = false;
        g = false;
        h = true;
        i = 500;
        j = null;
        k = "0";
        l = "0x0";
        m = false;
        n = false;
        p = null;
        q = new g(this);
        r = null;
        s = new h(this);
        t = null;
        u = new i(this);
        v = null;
        w = new j(this);
        x = null;
        a = null;
        b = null;
        y = null;
        c();
    }

    static android.media.MediaPlayer.OnCompletionListener a(StreamSenseMediaPlayer streamsensemediaplayer)
    {
        return streamsensemediaplayer.p;
    }

    static String a(StreamSenseMediaPlayer streamsensemediaplayer, String s1)
    {
        streamsensemediaplayer.k = s1;
        return s1;
    }

    private void a()
    {
        m = true;
        if (n() && !isPlayerPausedForSeeking())
        {
            k();
        }
    }

    private void a(MediaPlayer mediaplayer)
    {
        l();
    }

    static void a(StreamSenseMediaPlayer streamsensemediaplayer, MediaPlayer mediaplayer)
    {
        streamsensemediaplayer.a(mediaplayer);
    }

    static void a(StreamSenseMediaPlayer streamsensemediaplayer, HashMap hashmap)
    {
        streamsensemediaplayer.f(hashmap);
    }

    private void a(HashMap hashmap)
    {
        this;
        JVM INSTR monitorenter ;
        long l1;
        boolean flag;
        l1 = m();
        f();
        flag = g();
        if (x != null || flag)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        x = new Timer();
        x.schedule(new k(this, l1, hashmap), 500L);
        this;
        JVM INSTR monitorexit ;
        return;
        hashmap;
        throw hashmap;
    }

    private void a(HashMap hashmap, long l1)
    {
        boolean flag = d();
        boolean flag1 = f();
        g();
        if (!flag && !flag1 && j != null)
        {
            j.notify(StreamSenseEventType.PAUSE, hashmap, l1);
        }
    }

    private void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1;
        if (a != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        d();
        flag = g();
        if (flag1 || flag)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        f(o());
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static boolean a(StreamSenseMediaPlayer streamsensemediaplayer, boolean flag)
    {
        streamsensemediaplayer.n = flag;
        return flag;
    }

    private void b()
    {
        m = false;
        if (n() && !isPlayerPausedForSeeking())
        {
            a(true);
        }
    }

    private void b(MediaPlayer mediaplayer)
    {
        if (n())
        {
            a(true);
        }
    }

    static void b(StreamSenseMediaPlayer streamsensemediaplayer, MediaPlayer mediaplayer)
    {
        streamsensemediaplayer.b(mediaplayer);
    }

    static void b(StreamSenseMediaPlayer streamsensemediaplayer, HashMap hashmap)
    {
        streamsensemediaplayer.a(hashmap);
    }

    private void b(HashMap hashmap)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1;
        boolean flag2;
        flag1 = d();
        flag2 = f();
        boolean flag;
        if (b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag || flag1 || flag2)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        d(hashmap);
        d(hashmap);
        this;
        JVM INSTR monitorexit ;
        return;
        hashmap;
        throw hashmap;
    }

    static boolean b(StreamSenseMediaPlayer streamsensemediaplayer)
    {
        return streamsensemediaplayer.n;
    }

    private void c()
    {
        super.setOnCompletionListener(q);
        super.setOnInfoListener(s);
        super.setOnSeekCompleteListener(u);
        super.setOnPreparedListener(w);
    }

    private void c(HashMap hashmap)
    {
        d();
        f();
        g();
        if (j != null)
        {
            j.notify(StreamSenseEventType.BUFFER, hashmap, m());
        }
    }

    static boolean c(StreamSenseMediaPlayer streamsensemediaplayer)
    {
        return streamsensemediaplayer.m;
    }

    static void d(StreamSenseMediaPlayer streamsensemediaplayer)
    {
        streamsensemediaplayer.a();
    }

    private void d(HashMap hashmap)
    {
        a(hashmap, m());
    }

    private boolean d()
    {
        this;
        JVM INSTR monitorenter ;
        if (x == null) goto _L2; else goto _L1
_L1:
        x.cancel();
        x = null;
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

    private void e()
    {
        a(o());
    }

    static void e(StreamSenseMediaPlayer streamsensemediaplayer)
    {
        streamsensemediaplayer.b();
    }

    private void e(HashMap hashmap)
    {
        f();
        d();
        g();
        i();
        if (j != null)
        {
            j.notify(StreamSenseEventType.END, hashmap, m());
        }
    }

    static android.media.MediaPlayer.OnInfoListener f(StreamSenseMediaPlayer streamsensemediaplayer)
    {
        return streamsensemediaplayer.r;
    }

    private void f(HashMap hashmap)
    {
        d();
        if (!g() && j != null)
        {
            j.notify(StreamSenseEventType.PLAY, hashmap, m());
        }
    }

    private boolean f()
    {
        this;
        JVM INSTR monitorenter ;
        if (a == null) goto _L2; else goto _L1
_L1:
        a.cancel();
        a = null;
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

    static android.media.MediaPlayer.OnSeekCompleteListener g(StreamSenseMediaPlayer streamsensemediaplayer)
    {
        return streamsensemediaplayer.t;
    }

    private boolean g()
    {
        this;
        JVM INSTR monitorenter ;
        if (b == null) goto _L2; else goto _L1
_L1:
        b.cancel();
        b = null;
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

    static android.media.MediaPlayer.OnPreparedListener h(StreamSenseMediaPlayer streamsensemediaplayer)
    {
        return streamsensemediaplayer.v;
    }

    private void h()
    {
        b(o());
    }

    static long i(StreamSenseMediaPlayer streamsensemediaplayer)
    {
        return streamsensemediaplayer.m();
    }

    private boolean i()
    {
        this;
        JVM INSTR monitorenter ;
        if (y == null) goto _L2; else goto _L1
_L1:
        y.cancel();
        y = null;
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

    private void j()
    {
        this;
        JVM INSTR monitorenter ;
        if (e && y == null)
        {
            long l1 = m();
            y = new Timer();
            y.schedule(new l(this, l1), 250L);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static boolean j(StreamSenseMediaPlayer streamsensemediaplayer)
    {
        return streamsensemediaplayer.d();
    }

    private void k()
    {
        c(o());
    }

    static void k(StreamSenseMediaPlayer streamsensemediaplayer)
    {
        streamsensemediaplayer.j();
    }

    static Timer l(StreamSenseMediaPlayer streamsensemediaplayer)
    {
        return streamsensemediaplayer.y;
    }

    private void l()
    {
        e(o());
    }

    private long m()
    {
        int i1;
        try
        {
            i1 = getCurrentPosition();
        }
        catch (IllegalStateException illegalstateexception)
        {
            return 0L;
        }
        return (long)i1;
    }

    static boolean m(StreamSenseMediaPlayer streamsensemediaplayer)
    {
        return streamsensemediaplayer.n();
    }

    private boolean n()
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

    static boolean n(StreamSenseMediaPlayer streamsensemediaplayer)
    {
        return streamsensemediaplayer.i();
    }

    private HashMap o()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("ns_ts", String.valueOf(System.currentTimeMillis()));
        hashmap.putAll(p());
        return hashmap;
    }

    private HashMap p()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("ns_st_cl", k);
        hashmap.put("ns_st_cs", l);
        hashmap.put("ns_st_cu", o);
        hashmap.put("ns_st_mp", com/comscore/streaming/StreamSenseMediaPlayer.getSimpleName());
        hashmap.put("ns_st_mv", Integer.toString(android.os.Build.VERSION.SDK_INT));
        return hashmap;
    }

    public boolean isPlayerPausedForBuffering()
    {
        return m;
    }

    public boolean isPlayerPausedForSeeking()
    {
        return n;
    }

    public void pause()
    {
        super.pause();
        i();
        m = false;
        n = false;
        h();
    }

    public void prepare()
    {
        super.prepare();
        l = (new StringBuilder()).append(getVideoWidth()).append("x").append(getVideoHeight()).toString();
    }

    public void prepareAsync()
    {
        super.prepareAsync();
        l = (new StringBuilder()).append(getVideoWidth()).append("x").append(getVideoHeight()).toString();
    }

    public void release()
    {
        super.release();
        l();
    }

    public void seekTo(int i1)
    {
        super.seekTo(i1);
        n = true;
        if (n())
        {
            a(o(), m());
        }
    }

    public void setDataSource(Context context, Uri uri)
    {
        super.setDataSource(context, uri);
        o = uri.toString();
    }

    public void setDataSource(FileDescriptor filedescriptor)
    {
        super.setDataSource(filedescriptor);
        o = "local_file";
    }

    public void setDataSource(FileDescriptor filedescriptor, long l1, long l2)
    {
        super.setDataSource(filedescriptor, l1, l2);
        o = "local_file";
    }

    public void setDataSource(String s1)
    {
        super.setDataSource(s1);
        o = s1;
    }

    public void setOnCompletionListener(android.media.MediaPlayer.OnCompletionListener oncompletionlistener)
    {
        super.setOnCompletionListener(q);
        p = oncompletionlistener;
    }

    public void setOnInfoListener(android.media.MediaPlayer.OnInfoListener oninfolistener)
    {
        super.setOnInfoListener(s);
        r = oninfolistener;
    }

    public void setOnPreparedListener(android.media.MediaPlayer.OnPreparedListener onpreparedlistener)
    {
        super.setOnPreparedListener(w);
        v = onpreparedlistener;
    }

    public void setOnSeekCompleteListener(android.media.MediaPlayer.OnSeekCompleteListener onseekcompletelistener)
    {
        super.setOnSeekCompleteListener(u);
        t = onseekcompletelistener;
    }

    public void setStreamSense(StreamSense streamsense)
    {
        j = streamsense;
        j.setLabel("ns_st_pv", "4.1307.02");
    }

    public void start()
    {
        super.start();
        e();
    }

    public void stop()
    {
        super.stop();
        l();
    }
}
