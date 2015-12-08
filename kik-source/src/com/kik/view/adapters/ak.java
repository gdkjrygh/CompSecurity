// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;
import android.view.TextureView;
import com.kik.g.p;
import com.kik.l.ab;
import kik.a.d.a.a;
import kik.a.e.s;

// Referenced classes of package com.kik.view.adapters:
//            al

public final class ak
    implements android.view.TextureView.SurfaceTextureListener
{

    private TextureView a;
    private a b;
    private MediaPlayer c;
    private Surface d;
    private ab e;
    private com.kik.android.a f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private android.media.MediaPlayer.OnCompletionListener l;
    private android.media.MediaPlayer.OnPreparedListener m;
    private android.media.MediaPlayer.OnErrorListener n;
    private s o;
    private byte p[];

    public ak(a a1, byte abyte0[], ab ab1, com.kik.android.a a2)
    {
        g = false;
        h = false;
        i = false;
        j = true;
        k = false;
        b = a1;
        p = abyte0;
        e = ab1;
        f = a2;
    }

    static MediaPlayer a(ak ak1, MediaPlayer mediaplayer)
    {
        ak1.c = mediaplayer;
        return mediaplayer;
    }

    static void a(ak ak1, int i1, int j1)
    {
label0:
        {
            int k1;
            int l1;
            int i2;
            int j2;
label1:
            {
                if (ak1.a == null)
                {
                    break label0;
                }
                i2 = ak1.a.getWidth();
                j2 = ak1.a.getHeight();
                if (i2 <= j2 || i1 >= j1)
                {
                    l1 = i1;
                    k1 = j1;
                    if (i2 >= j2)
                    {
                        break label1;
                    }
                    l1 = i1;
                    k1 = j1;
                    if (i1 <= j1)
                    {
                        break label1;
                    }
                }
                k1 = i1;
                l1 = j1;
            }
            Matrix matrix;
            if (k1 < l1)
            {
                i1 = (int)(((double)l1 / (double)k1) * (double)j2);
                j1 = j2;
            } else
            {
                j1 = (int)(((double)k1 / (double)l1) * (double)i2);
                i1 = i2;
            }
            k1 = (i2 - i1) / 2;
            l1 = (j2 - j1) / 2;
            matrix = new Matrix();
            ak1.a.getTransform(matrix);
            matrix.setScale((float)i1 / (float)i2, (float)j1 / (float)j2);
            matrix.postTranslate(k1, l1);
            ak1.a.setTransform(matrix);
        }
    }

    private void a(boolean flag, android.media.MediaPlayer.OnPreparedListener onpreparedlistener, android.media.MediaPlayer.OnCompletionListener oncompletionlistener, android.media.MediaPlayer.OnErrorListener onerrorlistener, s s)
    {
        if (b == null || a == null || a.getSurfaceTexture() == null)
        {
            onerrorlistener.onError(null, 0, 0);
            return;
        }
        Surface surface = new Surface(a.getSurfaceTexture());
        if (flag)
        {
            s = e.b(b, p, s, f);
        } else
        {
            s = e.a(b, p, s, f);
        }
        s.a(new al(this, onerrorlistener, surface, onpreparedlistener, oncompletionlistener));
    }

    static boolean a(ak ak1)
    {
        return ak1.h;
    }

    static TextureView b(ak ak1)
    {
        return ak1.a;
    }

    static MediaPlayer c(ak ak1)
    {
        return ak1.c;
    }

    static boolean d(ak ak1)
    {
        return ak1.i;
    }

    static boolean e(ak ak1)
    {
        return ak1.j;
    }

    static boolean f(ak ak1)
    {
        ak1.j = false;
        return false;
    }

    static a g(ak ak1)
    {
        return ak1.b;
    }

    static ab h(ak ak1)
    {
        return ak1.e;
    }

    public final void a(boolean flag)
    {
        h = flag;
    }

    public final void a(boolean flag, TextureView textureview, android.media.MediaPlayer.OnPreparedListener onpreparedlistener, android.media.MediaPlayer.OnCompletionListener oncompletionlistener, android.media.MediaPlayer.OnErrorListener onerrorlistener, s s)
    {
        h = true;
        a = textureview;
        a.setSurfaceTextureListener(this);
        l = oncompletionlistener;
        m = onpreparedlistener;
        n = onerrorlistener;
        o = s;
        k = flag;
        if (!a.isAvailable())
        {
            g = true;
            return;
        } else
        {
            a(flag, m, l, n, o);
            return;
        }
    }

    public final boolean a()
    {
        if (c == null)
        {
            return false;
        } else
        {
            c.setVolume(1.0F, 1.0F);
            return true;
        }
    }

    public final void b()
    {
        if (c != null && c.isPlaying())
        {
            c.seekTo(0);
        }
    }

    public final void b(boolean flag)
    {
        i = flag;
    }

    public final void c()
    {
        if (c != null)
        {
            if (c.isPlaying())
            {
                c.stop();
            }
            c.release();
            c = null;
        }
        if (d != null)
        {
            d.release();
            d = null;
        }
        j = true;
    }

    public final boolean d()
    {
        return c != null && c.isPlaying();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i1, int j1)
    {
        if (g)
        {
            g = false;
            a(k, m, l, n, o);
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        c();
        if (a != null && a.getSurfaceTexture() != null)
        {
            a.getSurfaceTexture().release();
        }
        a = null;
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i1, int j1)
    {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
    }
}
