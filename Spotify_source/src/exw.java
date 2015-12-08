// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import com.spotify.mobile.android.spotlets.openaccess.model.Track;
import com.spotify.mobile.android.spotlets.openaccess.util.TrackState;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class exw
    implements dmx, dvc
{

    private final dvb a;
    private MediaPlayer b;
    private MediaPlayer c;
    private LinkedList d;
    private exy e;
    private exx f;
    private boolean g;
    private boolean h;
    private Map i;
    private float j;
    private boolean k;
    private boolean l;
    private boolean m;
    private final geq n;
    private final Runnable o;
    private android.media.MediaPlayer.OnErrorListener p = new android.media.MediaPlayer.OnErrorListener() {

        private exw a;

        public final boolean onError(MediaPlayer mediaplayer2, int i1, int j1)
        {
            if (i1 == 100)
            {
                Track track = (Track)exw.b(a).remove(mediaplayer2);
                MediaPlayer mediaplayer3 = new MediaPlayer();
                exw.b(a).put(mediaplayer3, track);
                mediaplayer2.release();
                exw.a(a, mediaplayer2, mediaplayer3);
                exw.a(a, mediaplayer3);
            } else
            {
                Locale locale = Locale.US;
                if (mediaplayer2 == exw.a(a))
                {
                    mediaplayer2 = "CurrentPlayer";
                } else
                {
                    mediaplayer2 = "NextPlayer";
                }
                mediaplayer2 = String.format(locale, "Preview Player error! MediaPlayer: %s  What: %d  Extra: %d", new Object[] {
                    mediaplayer2, Integer.valueOf(i1), Integer.valueOf(j1)
                });
                Logger.c(mediaplayer2, new Object[0]);
                Assertion.c(mediaplayer2);
            }
            exw.d(a);
            return true;
        }

            
            {
                a = exw.this;
                super();
            }
    };
    private android.media.MediaPlayer.OnCompletionListener q = new android.media.MediaPlayer.OnCompletionListener() {

        private exw a;

        public final void onCompletion(MediaPlayer mediaplayer2)
        {
            boolean flag;
            if (mediaplayer2 == exw.a(a))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Assertion.a(flag, "Play should only be called on mCurrentPlayer");
            mediaplayer2.reset();
            exw.e(a);
            exw.g(a).b(exw.f(a));
            exw.a(a, exw.a(a), TrackState.a);
            exw.b(a).remove(mediaplayer2);
            if (exw.h(a))
            {
                exw.i(a);
                exw.j(a);
                return;
            } else
            {
                exw.a(a, exw.k(a), TrackState.d);
                exw.a(a, true);
                return;
            }
        }

            
            {
                a = exw.this;
                super();
            }
    };
    private android.media.MediaPlayer.OnPreparedListener r = new android.media.MediaPlayer.OnPreparedListener() {

        private exw a;

        public final void onPrepared(MediaPlayer mediaplayer2)
        {
            boolean flag;
            if (mediaplayer2 == exw.k(a))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Assertion.a(flag, "Prepare should only be called on mNextPlayer");
            exw.l(a);
            exw.a(a, false);
            if (exw.m(a))
            {
                exw.i(a);
                exw.j(a);
            }
        }

            
            {
                a = exw.this;
                super();
            }
    };

    public exw(Context context)
    {
        this(context, new MediaPlayer(), new MediaPlayer());
    }

    private exw(Context context, MediaPlayer mediaplayer, MediaPlayer mediaplayer1)
    {
        d = new LinkedList();
        g = true;
        i = new HashMap();
        j = 1.0F;
        n = new geq();
        o = new Runnable() {

            private exw a;

            public final void run()
            {
                float f1 = (float)exw.a(a).getCurrentPosition() / 30000F;
                exw.c(a).a((Track)exw.b(a).get(exw.a(a)), f1);
            }

            
            {
                a = exw.this;
                super();
            }
        };
        a = new dvb(context);
        a.a(this);
        b = mediaplayer;
        c = mediaplayer1;
        a(b);
        a(c);
    }

    static MediaPlayer a(exw exw1)
    {
        return exw1.b;
    }

    private void a(MediaPlayer mediaplayer)
    {
        mediaplayer.setOnErrorListener(p);
        mediaplayer.setOnCompletionListener(q);
        mediaplayer.setOnPreparedListener(r);
        mediaplayer.setAudioStreamType(3);
    }

    private void a(MediaPlayer mediaplayer, TrackState trackstate)
    {
        mediaplayer = (Track)i.get(mediaplayer);
        if (mediaplayer != null)
        {
            e.a(mediaplayer, trackstate);
        }
    }

    static void a(exw exw1, MediaPlayer mediaplayer)
    {
        exw1.a(mediaplayer);
    }

    static void a(exw exw1, MediaPlayer mediaplayer, MediaPlayer mediaplayer1)
    {
        if (mediaplayer == exw1.b)
        {
            exw1.b = mediaplayer1;
            return;
        } else
        {
            exw1.c = mediaplayer1;
            return;
        }
    }

    static void a(exw exw1, MediaPlayer mediaplayer, TrackState trackstate)
    {
        exw1.a(mediaplayer, trackstate);
    }

    static boolean a(exw exw1, boolean flag)
    {
        exw1.l = flag;
        return flag;
    }

    static Map b(exw exw1)
    {
        return exw1.i;
    }

    static exx c(exw exw1)
    {
        return exw1.f;
    }

    static void d(exw exw1)
    {
        exw1.i();
    }

    static boolean e(exw exw1)
    {
        exw1.g = true;
        return true;
    }

    static Runnable f(exw exw1)
    {
        return exw1.o;
    }

    private void f()
    {
        h();
        l = true;
        m = false;
    }

    static geq g(exw exw1)
    {
        return exw1.n;
    }

    private void g()
    {
        j = 0.3F;
        b.setVolume(j, j);
        b.start();
        Handler handler = new Handler();
        handler.post(new eya(handler, b, j));
        j = 1.0F;
        n.a(o);
        a(b, TrackState.b);
    }

    private void h()
    {
        Assertion.a(d, "The preview queue must be set before calling prepareNextTrack");
        Track track;
        do
        {
            track = (Track)d.poll();
        } while (track != null && track.getPreviewUrl() == null);
        if (track == null)
        {
            return;
        }
        try
        {
            c.setDataSource(track.getPreviewUrl());
            i.put(c, track);
        }
        catch (IOException ioexception)
        {
            Logger.b("cannot prepare track %s", new Object[] {
                ioexception.getMessage()
            });
            return;
        }
        c.prepareAsync();
    }

    static boolean h(exw exw1)
    {
        return exw1.h;
    }

    private void i()
    {
        a(b, TrackState.a);
        a(c, TrackState.a);
        n.b(o);
        b.reset();
        c.reset();
        g = true;
        h = false;
        if (d != null)
        {
            d.clear();
        }
    }

    static void i(exw exw1)
    {
        Assertion.a(exw1.h, "Can not start next player. Not ready");
        MediaPlayer mediaplayer = exw1.b;
        exw1.b = exw1.c;
        exw1.c = mediaplayer;
        exw1.h = false;
        exw1.g = false;
        if (!exw1.m)
        {
            exw1.b.setVolume(exw1.j, exw1.j);
            exw1.b.start();
            exw1.n.a(exw1.o);
            exw1.a(exw1.b, TrackState.b);
        }
        exw1.m = false;
    }

    private void j()
    {
        if (m)
        {
            m = false;
            a(c, TrackState.d);
            return;
        } else
        {
            m = true;
            a(c, TrackState.c);
            return;
        }
    }

    static void j(exw exw1)
    {
        exw1.h();
    }

    static MediaPlayer k(exw exw1)
    {
        return exw1.c;
    }

    private void k()
    {
        if (b.isPlaying())
        {
            b.pause();
            n.b(o);
            a(b, TrackState.c);
        }
    }

    static boolean l(exw exw1)
    {
        exw1.h = true;
        return true;
    }

    static boolean m(exw exw1)
    {
        return exw1.g;
    }

    public final void a()
    {
    }

    public final void a(List list, exy exy1, exx exx)
    {
        ctz.a(exy1);
        ctz.a(exx);
        geh.a(list, "The list of preview URLs must not be empty");
        i();
        d = new LinkedList(list);
        e = exy1;
        f = exx;
        e.a((Track)d.peek(), TrackState.d);
        if (a.d)
        {
            f();
            return;
        } else
        {
            a.a();
            return;
        }
    }

    public final void a(boolean flag, boolean flag1)
    {
        if (flag1)
        {
            k = true;
            j = 0.3F;
            b.setVolume(j, j);
            return;
        } else
        {
            k();
            return;
        }
    }

    public final void b()
    {
    }

    public final void c()
    {
        boolean flag = false;
        if (k)
        {
            k = false;
            Handler handler = new Handler();
            handler.post(new eya(handler, b, j));
            j = 1.0F;
            return;
        }
        if (!g)
        {
            flag = true;
        }
        if (flag)
        {
            g();
            return;
        } else
        {
            f();
            return;
        }
    }

    public final void d()
    {
        if (b == null) goto _L2; else goto _L1
_L1:
        if (!b.isPlaying()) goto _L4; else goto _L3
_L3:
        k();
_L6:
        return;
_L4:
        if (l)
        {
            j();
            return;
        }
        if (a.d)
        {
            g();
            return;
        } else
        {
            a.a();
            return;
        }
_L2:
        if (l)
        {
            j();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void e()
    {
        i();
        a.b();
    }
}
