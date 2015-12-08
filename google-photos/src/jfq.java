// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.webkit.MimeTypeMap;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import org.apache.http.impl.DefaultConnectionReuseStrategy;
import org.apache.http.impl.DefaultHttpResponseFactory;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpRequestHandlerRegistry;
import org.apache.http.protocol.HttpService;
import org.apache.http.protocol.ResponseConnControl;
import org.apache.http.protocol.ResponseContent;

public final class jfq
    implements android.media.MediaPlayer.OnErrorListener, android.widget.MediaController.MediaPlayerControl
{

    final MediaPlayer a;
    public final Uri b;
    public final Uri c;
    public jgw d;
    public jfv e;
    public boolean f;
    public float g;
    public boolean h;
    public android.media.MediaPlayer.OnPreparedListener i;
    public android.media.MediaPlayer.OnCompletionListener j;
    public android.media.MediaPlayer.OnErrorListener k;
    public android.media.MediaPlayer.OnInfoListener l;
    private final olb m = null;
    private final noz n;
    private final noz o;
    private final noz p;
    private SurfaceHolder q;
    private jfv r;
    private int s;
    private int t;
    private float u;
    private float v;

    public jfq(Context context, Uri uri, boolean flag)
    {
        olb olb1;
        boolean flag1 = true;
        super();
        e = jfv.b;
        r = jfv.c;
        t = -1;
        g = -1F;
        u = -1F;
        v = 8F;
        double d1;
        BasicHttpProcessor basichttpprocessor;
        HttpRequestHandlerRegistry httprequesthandlerregistry;
        int i1;
        long l1;
        if (Uri.EMPTY.equals(uri))
        {
            flag1 = false;
        }
        p.a(flag1);
        n = noz.a(context, "MediaPlayerWrapper", new String[0]);
        o = noz.a(context, 2, "MediaPlayerWrapper", new String[0]);
        p = noz.a(context, 5, "MediaPlayerWrapper", new String[0]);
        b = uri;
        if (!flag && !"https".equalsIgnoreCase(uri.getScheme()))
        {
            break MISSING_BLOCK_LABEL_711;
        }
        m = olb.a(context, null, uri);
        olb1 = m;
        olb1.d = new ServerSocket();
        olb1.d.bind(new InetSocketAddress(olb.a, 0));
        l1 = System.currentTimeMillis();
        d1 = Math.random();
        context = (new StringBuilder(45)).append("/").append(l1).append(d1).toString();
        uri = MimeTypeMap.getFileExtensionFromUrl(olb1.b.toString());
        if (!TextUtils.isEmpty(uri))
        {
            context = String.valueOf(context);
            context = (new StringBuilder(String.valueOf(context).length() + 1 + String.valueOf(uri).length())).append(context).append(".").append(uri).toString();
        }
        olb1.f = (new BasicHttpParams()).setBooleanParameter("http.connection.stalecheck", false).setBooleanParameter("http.tcp.nodelay", true).setIntParameter("http.socket.buffer-size", 8192);
        basichttpprocessor = new BasicHttpProcessor();
        basichttpprocessor.addInterceptor(new ResponseContent());
        basichttpprocessor.addInterceptor(new ResponseConnControl());
        httprequesthandlerregistry = new HttpRequestHandlerRegistry();
        if (olb1.b == null) goto _L2; else goto _L1
_L1:
        uri = olb1.b.toString();
_L5:
        httprequesthandlerregistry.register(context, new olf(context, uri, olb1.c));
        olb1.g = new HttpService(basichttpprocessor, new DefaultConnectionReuseStrategy(), new DefaultHttpResponseFactory());
        olb1.g.setHandlerResolver(httprequesthandlerregistry);
        olb1.g.setParams(olb1.f);
        uri = new FutureTask(new olc(olb1));
        if (olb1.h != null) goto _L4; else goto _L3
_L3:
        olb1.e = Executors.newSingleThreadExecutor();
        olb1.e.execute(uri);
_L6:
        uri = String.valueOf(olb.a.getHostAddress());
        i1 = olb1.d.getLocalPort();
        uri = Uri.parse((new StringBuilder(String.valueOf(uri).length() + 19 + String.valueOf(context).length())).append("http://").append(uri).append(":").append(i1).append(context).toString());
_L7:
        c = uri;
        a = new MediaPlayer();
        a.setAudioStreamType(3);
        a.setOnPreparedListener(new jfr(this));
        a.setOnCompletionListener(new jfs(this));
        a.setOnErrorListener(this);
        a.setOnInfoListener(new jft(this));
        a.setOnBufferingUpdateListener(new jfu(this));
        return;
_L2:
        uri = null;
          goto _L5
_L4:
        if (olb1.i != null)
        {
            olb1.i.cancel(true);
        }
        olb1.i = uri;
        olb1.h.execute(uri);
          goto _L6
        context;
        uri = null;
          goto _L7
          goto _L7
    }

    static float a(jfq jfq1, float f1)
    {
        jfq1.u = f1;
        return f1;
    }

    static jfv a(jfq jfq1, jfv jfv1)
    {
        jfq1.e = jfv1;
        return jfv1;
    }

    static noz a(jfq jfq1)
    {
        return jfq1.o;
    }

    private void a(int i1)
    {
        if (a.getDuration() > 0)
        {
            a.seekTo(i1);
        }
    }

    static void a(jfq jfq1, int i1)
    {
        jfq1.a(i1);
    }

    static boolean a(jfq jfq1, boolean flag)
    {
        jfq1.f = flag;
        return flag;
    }

    static int b(jfq jfq1, int i1)
    {
        jfq1.t = -1;
        return -1;
    }

    static jfv b(jfq jfq1)
    {
        return jfq1.r;
    }

    static jfv b(jfq jfq1, jfv jfv1)
    {
        jfq1.r = jfv1;
        return jfv1;
    }

    static void b(jfq jfq1, float f1)
    {
        jfq1.a(f1);
    }

    private boolean b(Context context, Map map)
    {
        if (o.a())
        {
            noy.a("MediaPlayerWrapper", this);
        }
        map = new HashMap(map);
        a.setDataSource(context, c, map);
        return true;
        context;
_L2:
        return false;
        context;
        continue; /* Loop/switch isn't completed */
        context;
        continue; /* Loop/switch isn't completed */
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static float c(jfq jfq1, float f1)
    {
        jfq1.g = -1F;
        return -1F;
    }

    static int c(jfq jfq1)
    {
        return jfq1.t;
    }

    static String c(jfq jfq1, int i1)
    {
        switch (i1)
        {
        default:
            return Integer.toString(i1);

        case 800: 
            return "MEDIA_INFO_BAD_INTERLEAVING";

        case 702: 
            return "MEDIA_INFO_BUFFERING_END";

        case 701: 
            return "MEDIA_INFO_BUFFERING_START";

        case 802: 
            return "MEDIA_INFO_METADATA_UPDATE";

        case 801: 
            return "MEDIA_INFO_NOT_SEEKABLE";

        case 902: 
            return "MEDIA_INFO_SUBTITLE_TIMED_OUT";

        case 3: // '\003'
            return "MEDIA_INFO_VIDEO_RENDERING_START";

        case 700: 
            return "MEDIA_INFO_VIDEO_TRACK_LAGGING";

        case 901: 
            return "MEDIA_INFO_UNSUPPORTED_SUBTITLE";

        case 1: // '\001'
            return "MEDIA_INFO_UNKNOWN";
        }
    }

    static int d(jfq jfq1, int i1)
    {
        jfq1.s = i1;
        return i1;
    }

    static boolean d(jfq jfq1)
    {
        return l();
    }

    static float e(jfq jfq1)
    {
        return jfq1.g;
    }

    static android.media.MediaPlayer.OnPreparedListener f(jfq jfq1)
    {
        return jfq1.i;
    }

    static android.media.MediaPlayer.OnCompletionListener g(jfq jfq1)
    {
        return jfq1.j;
    }

    public static boolean g()
    {
        return android.os.Build.VERSION.SDK_INT >= 23;
    }

    static noz h(jfq jfq1)
    {
        return jfq1.p;
    }

    static android.media.MediaPlayer.OnInfoListener i(jfq jfq1)
    {
        return jfq1.l;
    }

    private void k()
    {
        boolean flag1 = true;
        if (o.a())
        {
            String s1;
            if (h)
            {
                s1 = "SurfaceHolder";
            } else
            {
                s1 = "SurfaceTexture";
            }
            s1 = String.valueOf(s1);
            if (s1.length() != 0)
            {
                "set surface to ".concat(s1);
            } else
            {
                new String("set surface to ");
            }
        }
        if (h)
        {
            p.a(q);
            p.a(q.getSurface().isValid());
            a.setSurface(q.getSurface());
            return;
        }
        p.a(d);
        MediaPlayer mediaplayer;
        jgw jgw1;
        boolean flag;
        if (!d.e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        mediaplayer = a;
        jgw1 = d;
        if (!jgw1.e)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.b(flag, "SurfaceTexture is released. Cannot get Surface anymore.");
        if (jgw1.d == null)
        {
            jgw1.d = new Surface(jgw1.a);
        }
        mediaplayer.setSurface(jgw1.d);
    }

    private static boolean l()
    {
        return android.os.Build.VERSION.SDK_INT >= 21;
    }

    private void m()
    {
        jgw jgw1 = d;
        if (jgw1.e)
        {
            if (jgw1.c.a())
            {
                noy.a("SurfaceTextureWrapper", jgw1);
            }
        } else
        {
            if (jgw1.b.a())
            {
                noy.a("surfaceTexture", jgw1.a);
            }
            jgw1.a.release();
            if (jgw1.d != null && jgw1.d.isValid())
            {
                jgw1.d.release();
                jgw1.d = null;
            }
            jgw1.a();
        }
        d = null;
    }

    public final jfq a(android.media.MediaPlayer.OnVideoSizeChangedListener onvideosizechangedlistener)
    {
        a.setOnVideoSizeChangedListener(onvideosizechangedlistener);
        return this;
    }

    public final void a()
    {
        r = jfv.d;
        a.prepareAsync();
        e = jfv.c;
    }

    public void a(float f1)
    {
        float f2;
        boolean flag;
        flag = false;
        f2 = Math.min(f1, v);
        f1 = f2;
        if (u != f2) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (o.a())
        {
            noy.a("playbackSpeed", Float.valueOf(f1));
            noy.a("mediaPlayer", this);
        }
        PlaybackParams playbackparams = (new PlaybackParams()).allowDefaults();
        playbackparams.setSpeed(f1);
        playbackparams.setPitch(f1);
        playbackparams.setAudioFallbackMode(0);
        a.setPlaybackParams(playbackparams);
        u = f1;
        flag = true;
        f2 = f1;
_L4:
        if (flag || f2 <= 1.0F) goto _L1; else goto _L3
_L3:
        f1 = f2;
        if (f2 == u)
        {
            return;
        }
          goto _L2
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        f2 = f1 / 2.0F;
        v = Math.max(f2, 1.0F);
          goto _L4
    }

    public final void a(SurfaceHolder surfaceholder)
    {
        p.a(surfaceholder);
        p.a(surfaceholder.getSurface().isValid());
        if (!surfaceholder.equals(q))
        {
            boolean flag;
            if (q == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.b(flag);
            q = surfaceholder;
            if (h)
            {
                k();
                return;
            }
        }
    }

    public final void a(jfw jfw1)
    {
        if (h() || i())
        {
            return;
        } else
        {
            a.setVolume(jfw.a(jfw1), jfw.a(jfw1));
            return;
        }
    }

    public final void a(jgw jgw1)
    {
        boolean flag2 = true;
        boolean flag;
        if (!i())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        p.a(jgw1);
        if (!jgw1.e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        if (!jgw1.equals(d))
        {
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                boolean flag1;
                if (d == null)
                {
                    flag1 = flag2;
                } else
                {
                    flag1 = false;
                }
                p.a(flag1);
            } else
            if (d != null)
            {
                m();
            }
            d = jgw1;
            if (!h)
            {
                k();
                return;
            }
        }
    }

    public final void a(boolean flag)
    {
        if (h != flag)
        {
            h = flag;
            if (h && q != null || !h && d != null)
            {
                k();
                return;
            }
        }
    }

    public final boolean a(Context context, Map map)
    {
        b.v();
        return b(context, map);
    }

    public final void b()
    {
        if (h && d != null)
        {
            a(false);
        }
        h = false;
        q = null;
    }

    public final void b(boolean flag)
    {
        if (o.a())
        {
            noy.a("MediaPlayerWrapper", this);
        }
        if (i() || e == jfv.a)
        {
            noy.a("MediaPlayerWrapper", this);
        } else
        {
            r = jfv.h;
            if (e != jfv.c)
            {
                a.stop();
                a.reset();
                if (d != null && android.os.Build.VERSION.SDK_INT < 16)
                {
                    m();
                }
                a.release();
                if (d != null && flag)
                {
                    m();
                }
                e = jfv.h;
                return;
            }
        }
    }

    public final int c()
    {
        if (i() || h())
        {
            return 0;
        } else
        {
            return a.getVideoWidth();
        }
    }

    public final boolean canPause()
    {
        return true;
    }

    public final boolean canSeekBackward()
    {
        return true;
    }

    public final boolean canSeekForward()
    {
        return true;
    }

    public final int d()
    {
        if (i() || h())
        {
            return 0;
        } else
        {
            return a.getVideoHeight();
        }
    }

    public final boolean e()
    {
        return e != jfv.b && e != jfv.c && e != jfv.a && e != jfv.h;
    }

    public final boolean f()
    {
        return e == jfv.f || e == jfv.e || e == jfv.g;
    }

    public final int getAudioSessionId()
    {
        return a.getAudioSessionId();
    }

    public final int getBufferPercentage()
    {
        return s;
    }

    public final int getCurrentPosition()
    {
        if (i() || h())
        {
            return 0;
        } else
        {
            return a.getCurrentPosition();
        }
    }

    public final int getDuration()
    {
        if (!e())
        {
            return 0;
        } else
        {
            return a.getDuration();
        }
    }

    public final boolean h()
    {
        return e == jfv.b;
    }

    public final boolean i()
    {
        return e == jfv.h;
    }

    public final boolean isPlaying()
    {
        return !i() && a.isPlaying();
    }

    public final void j()
    {
        if (m != null)
        {
            olb olb1 = m;
            if (olb1.e != null)
            {
                olb1.e.shutdownNow();
            }
            if (olb1.d != null)
            {
                try
                {
                    olb1.d.close();
                }
                catch (IOException ioexception)
                {
                    Log.e("VideoServer", "Error while closing the socket", ioexception);
                }
            }
            if (olb1.i != null)
            {
                olb1.i.cancel(true);
            }
            if (olb1.j != null)
            {
                olb1.j.cancel(true);
            }
            olb1.h = null;
        }
    }

    public final boolean onError(MediaPlayer mediaplayer, int i1, int j1)
    {
        e = jfv.a;
        r = jfv.a;
        if (!n.a()) goto _L2; else goto _L1
_L1:
        noy.a("MediaPlayerWrapper", toString());
        i1;
        JVM INSTR lookupswitch 2: default 60
    //                   1: 179
    //                   100: 172;
           goto _L3 _L4 _L5
_L3:
        mediaplayer = Integer.toString(i1);
_L13:
        noy.a("frameworkErr", mediaplayer);
        j1;
        JVM INSTR lookupswitch 6: default 132
    //                   -1010: 207
    //                   -1007: 214
    //                   -1004: 186
    //                   -110: 200
    //                   1: 221
    //                   200: 193;
           goto _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L11:
        break MISSING_BLOCK_LABEL_221;
_L6:
        mediaplayer = Integer.toString(j1);
_L14:
        noy.a("implErr", mediaplayer);
_L2:
        return k == null || k.onError(a, i1, j1);
_L5:
        mediaplayer = "MEDIA_ERROR_SERVER_DIED";
          goto _L13
_L4:
        mediaplayer = "MEDIA_ERROR_UNKNOWN";
          goto _L13
_L9:
        mediaplayer = "MEDIA_ERROR_IO";
          goto _L14
_L12:
        mediaplayer = "MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK";
          goto _L14
_L10:
        mediaplayer = "MEDIA_ERROR_TIMED_OUT";
          goto _L14
_L7:
        mediaplayer = "MEDIA_ERROR_UNSUPPORTED";
          goto _L14
_L8:
        mediaplayer = "MEDIA_ERROR_MALFORMED";
          goto _L14
        mediaplayer = "MEDIA_ERROR_UNKNOWN";
          goto _L14
    }

    public final void pause()
    {
        if (o.a())
        {
            noy.a("MediaPlayerWrapper", this);
        }
        r = jfv.f;
        if (e() && e != jfv.d)
        {
            a.pause();
            e = jfv.f;
        }
    }

    public final void seekTo(int i1)
    {
        if (o.a())
        {
            noy.a("MediaPlayerWrapper", this);
            noy.a("position", Integer.valueOf(i1));
        }
        if (i1 == getCurrentPosition())
        {
            return;
        }
        if (e() && (l() || e != jfv.d))
        {
            a(i1);
            return;
        } else
        {
            t = i1;
            return;
        }
    }

    public final void start()
    {
        if (o.a())
        {
            noy.a("MediaPlayerWrapper", this);
        }
        r = jfv.e;
        if (e())
        {
            a.start();
            e = jfv.e;
        }
    }

    public final String toString()
    {
        String s1 = String.valueOf(super.toString());
        String s2 = String.valueOf(a);
        String s3 = String.valueOf(b);
        String s4 = String.valueOf(e);
        String s5 = String.valueOf(r);
        String s6 = String.valueOf(d);
        String s7 = String.valueOf(q);
        boolean flag = h;
        return (new StringBuilder(String.valueOf(s1).length() + 121 + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length() + String.valueOf(s6).length() + String.valueOf(s7).length())).append(s1).append("{mediaPlayer=").append(s2).append(", uri=").append(s3).append(", currentState=").append(s4).append(", targetState=").append(s5).append(", surfaceTextureWrapper=").append(s6).append(", surfaceHolder=").append(s7).append(", isDrawingOnSurfaceHolder=").append(flag).append("}").toString();
    }
}
