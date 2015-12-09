// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class bhm extends bhu
    implements android.media.AudioManager.OnAudioFocusChangeListener, android.media.MediaPlayer.OnBufferingUpdateListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnInfoListener, android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnVideoSizeChangedListener, android.view.TextureView.SurfaceTextureListener
{

    private static final Map a;
    private final bib b;
    private int c;
    private int d;
    private MediaPlayer e;
    private Uri f;
    private int g;
    private int h;
    private int i;
    private int j;
    private float k;
    private boolean l;
    private boolean m;
    private int n;
    private bht o;

    public bhm(Context context, bib bib1)
    {
        super(context);
        c = 0;
        d = 0;
        k = 1.0F;
        setSurfaceTextureListener(this);
        b = bib1;
        context = b;
        cbg.a(((bib) (context)).e, ((bib) (context)).d, new String[] {
            "vpc"
        });
        context.i = cbg.a(((bib) (context)).e);
        context.n = this;
    }

    static bht a(bhm bhm1)
    {
        return bhm1.o;
    }

    private void a(boolean flag)
    {
        bka.d("AdMediaPlayerView release");
        if (e != null)
        {
            e.reset();
            e.release();
            e = null;
            b(0);
            if (flag)
            {
                d = 0;
                d = 0;
            }
            m();
        }
    }

    private void b(float f1)
    {
        if (e != null)
        {
            try
            {
                e.setVolume(f1, f1);
                return;
            }
            catch (IllegalStateException illegalstateexception)
            {
                return;
            }
        } else
        {
            bka.e("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
            return;
        }
    }

    private void b(int i1)
    {
        if (i1 != 3) goto _L2; else goto _L1
_L1:
        bib bib1 = b;
        bib1.m = true;
        if (bib1.j != null && bib1.k == null)
        {
            cbg.a(bib1.e, bib1.j, new String[] {
                "vfp"
            });
            bib1.k = cbg.a(bib1.e);
        }
_L4:
        c = i1;
        return;
_L2:
        if (c == 3 && i1 != 3)
        {
            b.m = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void k()
    {
        SurfaceTexture surfacetexture;
        bka.d("AdMediaPlayerView init MediaPlayer");
        surfacetexture = getSurfaceTexture();
        if (f == null || surfacetexture == null)
        {
            return;
        }
        a(false);
        e = new MediaPlayer();
        e.setOnBufferingUpdateListener(this);
        e.setOnCompletionListener(this);
        e.setOnErrorListener(this);
        e.setOnInfoListener(this);
        e.setOnPreparedListener(this);
        e.setOnVideoSizeChangedListener(this);
        e.setDataSource(getContext(), f);
        e.setSurface(new Surface(surfacetexture));
        e.setAudioStreamType(3);
        e.setScreenOnWhilePlaying(true);
        e.prepareAsync();
        b(1);
        return;
        Object obj;
        obj;
_L2:
        bka.c((new StringBuilder("Failed to initialize MediaPlayer at ")).append(f).toString(), ((Throwable) (obj)));
        onError(e, 1, 0);
        return;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void l()
    {
        if (n() && e.getCurrentPosition() > 0 && d != 3)
        {
            bka.d("AdMediaPlayerView nudging MediaPlayer");
            b(0.0F);
            e.start();
            int i1 = e.getCurrentPosition();
            for (long l1 = bkv.i().a(); n() && e.getCurrentPosition() == i1 && bkv.i().a() - l1 <= 250L;) { }
            e.pause();
            p();
        }
    }

    private void m()
    {
label0:
        {
            bka.d("AdMediaPlayerView abandon audio focus");
            AudioManager audiomanager = q();
            if (audiomanager != null && m)
            {
                if (audiomanager.abandonAudioFocus(this) != 1)
                {
                    break label0;
                }
                m = false;
            }
            return;
        }
        bka.e("AdMediaPlayerView abandon audio focus failed");
    }

    private boolean n()
    {
        return e != null && c != -1 && c != 0 && c != 1;
    }

    private void o()
    {
        bka.d("AdMediaPlayerView audio focus gained");
        m = true;
        p();
    }

    private void p()
    {
        if (!l && m)
        {
            b(k);
            return;
        } else
        {
            b(0.0F);
            return;
        }
    }

    private AudioManager q()
    {
        return (AudioManager)getContext().getSystemService("audio");
    }

    public final String a()
    {
        return "MediaPlayer";
    }

    public final void a(float f1)
    {
        k = f1;
        p();
    }

    public final void a(int i1)
    {
        bka.d((new StringBuilder("AdMediaPlayerView seek ")).append(i1).toString());
        if (n())
        {
            e.seekTo(i1);
            n = 0;
            return;
        } else
        {
            n = i1;
            return;
        }
    }

    public final void a(bht bht)
    {
        o = bht;
    }

    public final void a(String s)
    {
        f = Uri.parse(s);
        n = 0;
        k();
        requestLayout();
        invalidate();
    }

    public final void b()
    {
        bka.d("AdMediaPlayerView stop");
        if (e != null)
        {
            e.stop();
            e.release();
            e = null;
            b(0);
            d = 0;
            m();
        }
        bib bib1 = b;
        cax cax = cbb.l;
        if (((Boolean)bkv.n().a(cax)).booleanValue() && !bib1.o)
        {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", bib1.b);
            bundle.putString("player", bib1.n.a());
            cjv cjv1;
            for (Iterator iterator = bib1.f.a().iterator(); iterator.hasNext(); bundle.putString((new StringBuilder("fps_p_")).append(cjv1.a).toString(), Double.toString(cjv1.b)))
            {
                cjv1 = (cjv)iterator.next();
                bundle.putString((new StringBuilder("fps_c_")).append(cjv1.a).toString(), Integer.toString(cjv1.c));
            }

            for (int i1 = 0; i1 < bib1.g.length; i1++)
            {
                String s = bib1.h[i1];
                if (s != null)
                {
                    bundle.putString((new StringBuilder("fh_")).append(Long.valueOf(bib1.g[i1])).toString(), s);
                }
            }

            bkv.e();
            cjj.a(bib1.a, bib1.c.b, "gmob-apps", bundle, true);
            bib1.o = true;
        }
    }

    public final void c()
    {
        bka.d("AdMediaPlayerView play");
        if (n())
        {
            e.start();
            b(3);
            cjj.a.post(new Runnable() {

                private bhm a;

                public final void run()
                {
                    if (bhm.a(a) != null)
                    {
                        bhm.a(a).b();
                    }
                }

            
            {
                a = bhm.this;
                super();
            }
            });
        }
        d = 3;
    }

    public final void d()
    {
        bka.d("AdMediaPlayerView pause");
        if (n() && e.isPlaying())
        {
            e.pause();
            b(4);
            cjj.a.post(new Runnable() {

                private bhm a;

                public final void run()
                {
                    if (bhm.a(a) != null)
                    {
                        bhm.a(a).c();
                    }
                }

            
            {
                a = bhm.this;
                super();
            }
            });
        }
        d = 4;
    }

    public final int e()
    {
        if (n())
        {
            return e.getDuration();
        } else
        {
            return -1;
        }
    }

    public final int f()
    {
        if (n())
        {
            return e.getCurrentPosition();
        } else
        {
            return 0;
        }
    }

    public final void g()
    {
        l = true;
        p();
    }

    public final void h()
    {
        l = false;
        p();
    }

    public final int i()
    {
        if (e != null)
        {
            return e.getVideoWidth();
        } else
        {
            return 0;
        }
    }

    public final int j()
    {
        if (e != null)
        {
            return e.getVideoHeight();
        } else
        {
            return 0;
        }
    }

    public final void onAudioFocusChange(int i1)
    {
        if (i1 > 0)
        {
            o();
        } else
        if (i1 < 0)
        {
            bka.d("AdMediaPlayerView audio focus lost");
            m = false;
            p();
            return;
        }
    }

    public final void onBufferingUpdate(MediaPlayer mediaplayer, int i1)
    {
    }

    public final void onCompletion(MediaPlayer mediaplayer)
    {
        bka.d("AdMediaPlayerView completion");
        b(5);
        d = 5;
        cjj.a.post(new Runnable() {

            private bhm a;

            public final void run()
            {
                if (bhm.a(a) != null)
                {
                    bhm.a(a).d();
                }
            }

            
            {
                a = bhm.this;
                super();
            }
        });
    }

    public final boolean onError(MediaPlayer mediaplayer, int i1, int j1)
    {
        mediaplayer = (String)a.get(Integer.valueOf(i1));
        String s = (String)a.get(Integer.valueOf(j1));
        bka.e((new StringBuilder("AdMediaPlayerView MediaPlayer error: ")).append(mediaplayer).append(":").append(s).toString());
        b(-1);
        d = -1;
        cjj.a.post(new Runnable(mediaplayer, s) {

            private String a;
            private String b;
            private bhm c;

            public final void run()
            {
                if (bhm.a(c) != null)
                {
                    bhm.a(c).a(a, b);
                }
            }

            
            {
                c = bhm.this;
                a = s;
                b = s1;
                super();
            }
        });
        return true;
    }

    public final boolean onInfo(MediaPlayer mediaplayer, int i1, int j1)
    {
        mediaplayer = (String)a.get(Integer.valueOf(i1));
        String s = (String)a.get(Integer.valueOf(j1));
        bka.d((new StringBuilder("AdMediaPlayerView MediaPlayer info: ")).append(mediaplayer).append(":").append(s).toString());
        return true;
    }

    protected final void onMeasure(int i1, int j1)
    {
        int k1;
        int l1;
        int i2;
        int k2;
        i2 = getDefaultSize(g, i1);
        k2 = getDefaultSize(h, j1);
        l1 = k2;
        k1 = i2;
        if (g <= 0) goto _L2; else goto _L1
_L1:
        l1 = k2;
        k1 = i2;
        if (h <= 0) goto _L2; else goto _L3
_L3:
        int l2;
        k2 = android.view.View.MeasureSpec.getMode(i1);
        i1 = android.view.View.MeasureSpec.getSize(i1);
        l2 = android.view.View.MeasureSpec.getMode(j1);
        j1 = android.view.View.MeasureSpec.getSize(j1);
        if (k2 != 0x40000000 || l2 != 0x40000000) goto _L5; else goto _L4
_L4:
        if (g * j1 < h * i1)
        {
            k1 = (g * j1) / h;
            l1 = j1;
        } else
        if (g * j1 > h * i1)
        {
            l1 = (h * i1) / g;
            k1 = i1;
        } else
        {
            l1 = j1;
            k1 = i1;
        }
_L2:
        setMeasuredDimension(k1, l1);
        if (android.os.Build.VERSION.SDK_INT == 16)
        {
            if (i > 0 && i != k1 || j > 0 && j != l1)
            {
                l();
            }
            i = k1;
            j = l1;
        }
        return;
_L5:
        if (k2 == 0x40000000)
        {
            l1 = (h * i1) / g;
            int j2;
            if (l2 == 0x80000000 && l1 > j1)
            {
                l1 = j1;
                k1 = i1;
            } else
            {
                k1 = i1;
            }
        } else
        if (l2 == 0x40000000)
        {
            j2 = (g * j1) / h;
            l1 = j1;
            k1 = j2;
            if (k2 == 0x80000000)
            {
                l1 = j1;
                k1 = j2;
                if (j2 > i1)
                {
                    l1 = j1;
                    k1 = i1;
                }
            }
        } else
        {
            j2 = g;
            k1 = h;
            if (l2 == 0x80000000 && k1 > j1)
            {
                j2 = (g * j1) / h;
            } else
            {
                j1 = k1;
            }
            l1 = j1;
            k1 = j2;
            if (k2 == 0x80000000)
            {
                l1 = j1;
                k1 = j2;
                if (j2 > i1)
                {
                    l1 = (h * i1) / g;
                    k1 = i1;
                }
            }
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        bka.d("AdMediaPlayerView prepared");
        b(2);
        bib bib1 = b;
        if (bib1.i != null && bib1.j == null)
        {
            cbg.a(bib1.e, bib1.i, new String[] {
                "vfr"
            });
            bib1.j = cbg.a(bib1.e);
        }
        cjj.a.post(new Runnable() {

            private bhm a;

            public final void run()
            {
                if (bhm.a(a) != null)
                {
                    bhm.a(a).a();
                }
            }

            
            {
                a = bhm.this;
                super();
            }
        });
        g = mediaplayer.getVideoWidth();
        h = mediaplayer.getVideoHeight();
        if (n != 0)
        {
            a(n);
        }
        l();
        bka.c((new StringBuilder("AdMediaPlayerView stream dimensions: ")).append(g).append(" x ").append(h).toString());
        if (d == 3)
        {
            c();
        }
        mediaplayer = q();
        if (mediaplayer != null && !m)
        {
            if (mediaplayer.requestAudioFocus(this, 3, 2) == 1)
            {
                o();
            } else
            {
                bka.e("AdMediaPlayerView audio focus request failed");
            }
        }
        p();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i1, int j1)
    {
        bka.d("AdMediaPlayerView surface created");
        k();
        cjj.a.post(new Runnable() {

            private bhm a;

            public final void run()
            {
                if (bhm.a(a) != null)
                {
                    bhm.a(a);
                }
            }

            
            {
                a = bhm.this;
                super();
            }
        });
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        bka.d("AdMediaPlayerView surface destroyed");
        if (e != null && n == 0)
        {
            n = e.getCurrentPosition();
        }
        cjj.a.post(new Runnable() {

            private bhm a;

            public final void run()
            {
                if (bhm.a(a) != null)
                {
                    bhm.a(a).c();
                    bhm.a(a).e();
                }
            }

            
            {
                a = bhm.this;
                super();
            }
        });
        a(true);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i1, int j1)
    {
        boolean flag1 = true;
        bka.d("AdMediaPlayerView surface changed");
        boolean flag;
        if (d == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (g == i1 && h == j1)
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        if (e != null && flag && i1 != 0)
        {
            if (n != 0)
            {
                a(n);
            }
            c();
        }
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
        surfacetexture = b;
        if (((bib) (surfacetexture)).k != null && ((bib) (surfacetexture)).l == null)
        {
            cbg.a(((bib) (surfacetexture)).e, ((bib) (surfacetexture)).k, new String[] {
                "vff"
            });
            cbg.a(((bib) (surfacetexture)).e, ((bib) (surfacetexture)).d, new String[] {
                "vtt"
            });
            surfacetexture.l = cbg.a(((bib) (surfacetexture)).e);
        }
        long l2 = bkv.i().c();
        if (((bib) (surfacetexture)).m && ((bib) (surfacetexture)).p && ((bib) (surfacetexture)).q != -1L)
        {
            double d1 = (double)TimeUnit.SECONDS.toNanos(1L) / (double)(l2 - ((bib) (surfacetexture)).q);
            cju cju1 = ((bib) (surfacetexture)).f;
            cju1.d = cju1.d + 1;
            int i1 = 0;
            do
            {
                if (i1 >= cju1.b.length)
                {
                    break;
                }
                if (cju1.b[i1] <= d1 && d1 < cju1.a[i1])
                {
                    int ai[] = cju1.c;
                    ai[i1] = ai[i1] + 1;
                }
                if (d1 < cju1.b[i1])
                {
                    break;
                }
                i1++;
            } while (true);
        }
        surfacetexture.p = ((bib) (surfacetexture)).m;
        surfacetexture.q = l2;
        cax cax = cbb.n;
        l2 = ((Long)bkv.n().a(cax)).longValue();
        long l3 = f();
        int j1 = 0;
        do
        {
label0:
            {
                if (j1 < ((bib) (surfacetexture)).h.length)
                {
                    if (((bib) (surfacetexture)).h[j1] != null || l2 <= Math.abs(l3 - ((bib) (surfacetexture)).g[j1]))
                    {
                        break label0;
                    }
                    surfacetexture = ((bib) (surfacetexture)).h;
                    Bitmap bitmap = getBitmap(8, 8);
                    l3 = 0L;
                    l2 = 63L;
                    for (int k1 = 0; k1 < 8;)
                    {
                        int l1 = 0;
                        long l4 = l2;
                        l2 = l3;
                        l3 = l4;
                        while (l1 < 8) 
                        {
                            int i2 = bitmap.getPixel(l1, k1);
                            int j2 = Color.blue(i2);
                            int k2 = Color.red(i2);
                            if (Color.green(i2) + (j2 + k2) > 128)
                            {
                                l4 = 1L;
                            } else
                            {
                                l4 = 0L;
                            }
                            l2 |= l4 << (int)l3;
                            l3--;
                            l1++;
                        }
                        k1++;
                        l4 = l2;
                        l2 = l3;
                        l3 = l4;
                    }

                    surfacetexture[j1] = String.format("%016X", new Object[] {
                        Long.valueOf(l3)
                    });
                }
                return;
            }
            j1++;
        } while (true);
    }

    public final void onVideoSizeChanged(MediaPlayer mediaplayer, int i1, int j1)
    {
        bka.d((new StringBuilder("AdMediaPlayerView size changed: ")).append(i1).append(" x ").append(j1).toString());
        g = mediaplayer.getVideoWidth();
        h = mediaplayer.getVideoHeight();
        if (g != 0 && h != 0)
        {
            requestLayout();
        }
    }

    public final String toString()
    {
        return (new StringBuilder()).append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).toString();
    }

    static 
    {
        HashMap hashmap = new HashMap();
        a = hashmap;
        hashmap.put(Integer.valueOf(-1004), "MEDIA_ERROR_IO");
        a.put(Integer.valueOf(-1007), "MEDIA_ERROR_MALFORMED");
        a.put(Integer.valueOf(-1010), "MEDIA_ERROR_UNSUPPORTED");
        a.put(Integer.valueOf(-110), "MEDIA_ERROR_TIMED_OUT");
        a.put(Integer.valueOf(100), "MEDIA_ERROR_SERVER_DIED");
        a.put(Integer.valueOf(1), "MEDIA_ERROR_UNKNOWN");
        a.put(Integer.valueOf(1), "MEDIA_INFO_UNKNOWN");
        a.put(Integer.valueOf(700), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        a.put(Integer.valueOf(3), "MEDIA_INFO_VIDEO_RENDERING_START");
        a.put(Integer.valueOf(701), "MEDIA_INFO_BUFFERING_START");
        a.put(Integer.valueOf(702), "MEDIA_INFO_BUFFERING_END");
        a.put(Integer.valueOf(800), "MEDIA_INFO_BAD_INTERLEAVING");
        a.put(Integer.valueOf(801), "MEDIA_INFO_NOT_SEEKABLE");
        a.put(Integer.valueOf(802), "MEDIA_INFO_METADATA_UPDATE");
        a.put(Integer.valueOf(901), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        a.put(Integer.valueOf(902), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }
}
