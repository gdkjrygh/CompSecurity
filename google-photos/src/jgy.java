// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.ViewGroup;
import com.google.android.apps.photos.videoplayer.view.VideoSurfaceView;

final class jgy
    implements android.view.SurfaceHolder.Callback, android.view.TextureView.SurfaceTextureListener, jhg
{

    private final VideoSurfaceView a;
    private final jhf b;
    private final noz c;
    private jfq d;
    private boolean e;

    jgy(Context context, ViewGroup viewgroup, VideoSurfaceView videosurfaceview)
    {
        p.a(videosurfaceview);
        b = new jhf(context, viewgroup, this);
        a = videosurfaceview;
        c = noz.a(context, 2, "MixedViewStrategy", new String[0]);
    }

    private void h()
    {
        if (e)
        {
            e = false;
            a(true);
        }
    }

    public final void a()
    {
        jhf jhf1 = b;
        a.d = this;
    }

    public final void a(jfq jfq1)
    {
        d = jfq1;
        VideoSurfaceView videosurfaceview = a;
        if (videosurfaceview.a.a())
        {
            noy.a("mediaPlayer", jfq1);
        }
        boolean flag;
        if (jfq1 == null)
        {
            flag = false;
        } else
        if (jfq1 == videosurfaceview.c)
        {
            flag = false;
        } else
        if (jfq1.e == jfv.a)
        {
            flag = false;
        } else
        if (jfq1.i())
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (flag)
        {
            videosurfaceview.c = jfq1;
            if (videosurfaceview.b != null && videosurfaceview.b.getSurface().isValid())
            {
                jfq1.a(videosurfaceview.b);
            }
            videosurfaceview.a(jfq1.c(), jfq1.d());
            if (videosurfaceview.a.a())
            {
                noy.a("mediaPlayer", jfq1);
            }
        }
        b.a(jfq1);
    }

    public final void a(boolean flag)
    {
        boolean flag2;
        boolean flag3 = true;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        jhf jhf1 = b;
        boolean flag1;
        if (jhf1.h() && jhf1.a.isAvailable())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1 || !a.getHolder().getSurface().isValid())
        {
            break MISSING_BLOCK_LABEL_118;
        }
        flag2 = true;
_L1:
        if (flag && !flag2)
        {
            flag = flag3;
        } else
        {
            flag = false;
        }
        e = flag;
        if (c.a())
        {
            (new StringBuilder(21)).append("useSurfaceView? ").append(flag2);
        }
        d.a(flag2);
        return;
        flag2 = false;
          goto _L1
    }

    public final boolean a(Canvas canvas)
    {
        if (d != null && d.h)
        {
            canvas.drawColor(0x33ff0000);
            return true;
        } else
        {
            return b.a(canvas);
        }
    }

    public final void b()
    {
        b.b();
    }

    public final void c()
    {
        b.c();
    }

    public final void d()
    {
        if (!b.h())
        {
            return;
        } else
        {
            a.setVisibility(0);
            b.d();
            return;
        }
    }

    public final boolean e()
    {
        return b.e();
    }

    public final void f()
    {
        b.f();
    }

    public final Bitmap g()
    {
        return b.g();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
    {
        h();
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        return false;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
    {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
    }

    public final void onVideoSizeChanged(MediaPlayer mediaplayer, int i, int j)
    {
        b.onVideoSizeChanged(mediaplayer, i, j);
        a.onVideoSizeChanged(mediaplayer, i, j);
    }

    public final void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        if (j > 0 && k > 0)
        {
            h();
        }
    }

    public final void surfaceCreated(SurfaceHolder surfaceholder)
    {
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
    }

    public final String toString()
    {
        String s = String.valueOf(super.toString());
        String s1 = String.valueOf(d);
        String s2 = String.valueOf(a);
        String s3 = String.valueOf(b);
        return (new StringBuilder(String.valueOf(s).length() + 60 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s).append("{mediaPlayer=").append(s1).append(", videoSurfaceView=").append(s2).append(", videoTextureViewStrategy=").append(s3).append("}").toString();
    }
}
