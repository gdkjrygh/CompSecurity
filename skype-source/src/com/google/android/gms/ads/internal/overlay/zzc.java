// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.gm;
import com.google.android.gms.internal.io;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzi, l, g

public class zzc extends zzi
    implements android.media.AudioManager.OnAudioFocusChangeListener, android.media.MediaPlayer.OnBufferingUpdateListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnInfoListener, android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnVideoSizeChangedListener, android.view.TextureView.SurfaceTextureListener
{

    private static final Map a;
    private final l b;
    private int c;
    private int d;
    private MediaPlayer e;
    private Uri f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private float l;
    private boolean m;
    private boolean n;
    private int o;
    private g p;

    public zzc(Context context, l l1)
    {
        super(context);
        c = 0;
        d = 0;
        l = 1.0F;
        setSurfaceTextureListener(this);
        b = l1;
        b.a(this);
    }

    static g a(zzc zzc1)
    {
        return zzc1.p;
    }

    private void a(boolean flag)
    {
        com.google.android.gms.ads.internal.util.client.b.a(2);
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
            com.google.android.gms.ads.internal.util.client.b.c("AdVideoView setMediaPlayerVolume() called before onPrepared().");
            return;
        }
    }

    private void b(int i1)
    {
        if (i1 != 3) goto _L2; else goto _L1
_L1:
        b.c();
_L4:
        c = i1;
        return;
_L2:
        if (c == 3 && i1 != 3)
        {
            b.d();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void k()
    {
        SurfaceTexture surfacetexture;
        com.google.android.gms.ads.internal.util.client.b.a(2);
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
        i = 0;
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
        com.google.android.gms.ads.internal.util.client.b.b((new StringBuilder("Failed to initialize MediaPlayer at ")).append(f).toString(), ((Throwable) (obj)));
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
            com.google.android.gms.ads.internal.util.client.b.a(2);
            b(0.0F);
            e.start();
            int i1 = e.getCurrentPosition();
            for (long l1 = com.google.android.gms.ads.internal.p.i().a(); n() && e.getCurrentPosition() == i1 && com.google.android.gms.ads.internal.p.i().a() - l1 <= 250L;) { }
            e.pause();
            p();
        }
    }

    private void m()
    {
label0:
        {
            com.google.android.gms.ads.internal.util.client.b.a(2);
            AudioManager audiomanager = q();
            if (audiomanager != null && n)
            {
                if (audiomanager.abandonAudioFocus(this) != 1)
                {
                    break label0;
                }
                n = false;
            }
            return;
        }
        com.google.android.gms.ads.internal.util.client.b.c("AdVideoView abandon audio focus failed");
    }

    private boolean n()
    {
        return e != null && c != -1 && c != 0 && c != 1;
    }

    private void o()
    {
        com.google.android.gms.ads.internal.util.client.b.a(2);
        n = true;
        p();
    }

    private void p()
    {
        if (!m && n)
        {
            b(l);
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
        l = f1;
        p();
    }

    public final void a(int i1)
    {
        com.google.android.gms.ads.internal.util.client.b.a(2);
        if (n())
        {
            e.seekTo(i1);
            o = 0;
            return;
        } else
        {
            o = i1;
            return;
        }
    }

    public final void a(g g1)
    {
        p = g1;
    }

    public final void b()
    {
        com.google.android.gms.ads.internal.util.client.b.a(2);
        if (e != null)
        {
            e.stop();
            e.release();
            e = null;
            b(0);
            d = 0;
            m();
        }
        b.b();
    }

    public final void c()
    {
        com.google.android.gms.ads.internal.util.client.b.a(2);
        if (n())
        {
            e.start();
            b(3);
            gm.a.post(new Runnable() {

                final zzc a;

                public final void run()
                {
                    if (zzc.a(a) != null)
                    {
                        zzc.a(a).b();
                    }
                }

            
            {
                a = zzc.this;
                super();
            }
            });
        }
        d = 3;
    }

    public final void d()
    {
        com.google.android.gms.ads.internal.util.client.b.a(2);
        if (n() && e.isPlaying())
        {
            e.pause();
            b(4);
            gm.a.post(new Runnable() {

                final zzc a;

                public final void run()
                {
                    if (zzc.a(a) != null)
                    {
                        zzc.a(a).c();
                    }
                }

            
            {
                a = zzc.this;
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
        m = true;
        p();
    }

    public final void h()
    {
        m = false;
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

    public void onAudioFocusChange(int i1)
    {
        if (i1 > 0)
        {
            o();
        } else
        if (i1 < 0)
        {
            com.google.android.gms.ads.internal.util.client.b.a(2);
            n = false;
            p();
            return;
        }
    }

    public void onBufferingUpdate(MediaPlayer mediaplayer, int i1)
    {
        i = i1;
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        com.google.android.gms.ads.internal.util.client.b.a(2);
        b(5);
        d = 5;
        gm.a.post(new Runnable() {

            final zzc a;

            public final void run()
            {
                if (zzc.a(a) != null)
                {
                    zzc.a(a).d();
                }
            }

            
            {
                a = zzc.this;
                super();
            }
        });
    }

    public boolean onError(MediaPlayer mediaplayer, int i1, int j1)
    {
        mediaplayer = (String)a.get(Integer.valueOf(i1));
        String s = (String)a.get(Integer.valueOf(j1));
        com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("AdVideoView MediaPlayer error: ")).append(mediaplayer).append(":").append(s).toString());
        b(-1);
        d = -1;
        gm.a.post(new Runnable(mediaplayer, s) {

            final String a;
            final String b;
            final zzc c;

            public final void run()
            {
                if (zzc.a(c) != null)
                {
                    zzc.a(c).a(a, b);
                }
            }

            
            {
                c = zzc.this;
                a = s;
                b = s1;
                super();
            }
        });
        return true;
    }

    public boolean onInfo(MediaPlayer mediaplayer, int i1, int j1)
    {
        mediaplayer = (String)a.get(Integer.valueOf(i1));
        String s = (String)a.get(Integer.valueOf(j1));
        (new StringBuilder("AdVideoView MediaPlayer info: ")).append(mediaplayer).append(":").append(s);
        com.google.android.gms.ads.internal.util.client.b.a(2);
        return true;
    }

    protected void onMeasure(int i1, int j1)
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
            if (j > 0 && j != k1 || k > 0 && k != l1)
            {
                l();
            }
            j = k1;
            k = l1;
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

    public void onPrepared(MediaPlayer mediaplayer)
    {
        com.google.android.gms.ads.internal.util.client.b.a(2);
        b(2);
        b.a();
        gm.a.post(new Runnable() {

            final zzc a;

            public final void run()
            {
                if (zzc.a(a) != null)
                {
                    zzc.a(a).a();
                }
            }

            
            {
                a = zzc.this;
                super();
            }
        });
        g = mediaplayer.getVideoWidth();
        h = mediaplayer.getVideoHeight();
        if (o != 0)
        {
            a(o);
        }
        l();
        com.google.android.gms.ads.internal.util.client.b.b((new StringBuilder("AdVideoView stream dimensions: ")).append(g).append(" x ").append(h).toString());
        if (d == 3)
        {
            c();
        }
        mediaplayer = q();
        if (mediaplayer != null && !n)
        {
            if (mediaplayer.requestAudioFocus(this, 3, 2) == 1)
            {
                o();
            } else
            {
                com.google.android.gms.ads.internal.util.client.b.c("AdVideoView audio focus request failed");
            }
        }
        p();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i1, int j1)
    {
        com.google.android.gms.ads.internal.util.client.b.a(2);
        k();
        gm.a.post(new Runnable() {

            final zzc a;

            public final void run()
            {
                if (zzc.a(a) != null)
                {
                    zzc.a(a);
                }
            }

            
            {
                a = zzc.this;
                super();
            }
        });
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        com.google.android.gms.ads.internal.util.client.b.a(2);
        if (e != null && o == 0)
        {
            o = e.getCurrentPosition();
        }
        gm.a.post(new Runnable() {

            final zzc a;

            public final void run()
            {
                if (zzc.a(a) != null)
                {
                    zzc.a(a).c();
                    zzc.a(a).e();
                }
            }

            
            {
                a = zzc.this;
                super();
            }
        });
        a(true);
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i1, int j1)
    {
        boolean flag1 = true;
        com.google.android.gms.ads.internal.util.client.b.a(2);
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
            if (o != 0)
            {
                a(o);
            }
            c();
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
        b.b(this);
    }

    public void onVideoSizeChanged(MediaPlayer mediaplayer, int i1, int j1)
    {
        (new StringBuilder("AdVideoView size changed: ")).append(i1).append(" x ").append(j1);
        com.google.android.gms.ads.internal.util.client.b.a(2);
        g = mediaplayer.getVideoWidth();
        h = mediaplayer.getVideoHeight();
        if (g != 0 && h != 0)
        {
            requestLayout();
        }
    }

    public void setMimeType(String s)
    {
    }

    public void setVideoPath(String s)
    {
        setVideoURI(Uri.parse(s));
    }

    public void setVideoURI(Uri uri)
    {
        f = uri;
        o = 0;
        k();
        requestLayout();
        invalidate();
    }

    public String toString()
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
