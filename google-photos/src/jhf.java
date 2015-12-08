// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.TextureView;
import android.view.ViewGroup;

final class jhf
    implements android.view.TextureView.SurfaceTextureListener, jhg
{

    jhc a;
    private final ViewGroup b;
    private final noz c;
    private final jhd d;
    private final android.view.TextureView.SurfaceTextureListener e;
    private jfq f;

    jhf(Context context, ViewGroup viewgroup, android.view.TextureView.SurfaceTextureListener surfacetexturelistener)
    {
        b = viewgroup;
        e = surfacetexturelistener;
        c = noz.a(context, 2, "TextureViewStrategy", new String[0]);
        d = (jhd)olm.a(context, jhd);
    }

    public final void a()
    {
    }

    public final void a(jfq jfq1)
    {
        f = jfq1;
        if (!h()) goto _L2; else goto _L1
_L1:
        jhc jhc1;
        jhc1 = a;
        if (jhc1.a.a())
        {
            noy.a("VideoTextureView", jhc1);
            noy.a("mediaPlayer", jfq1);
        }
        jgw jgw1;
        boolean flag;
        if (jfq1 == null)
        {
            flag = false;
        } else
        if (jfq1 == jhc1.c)
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
        if (jfq1.d != null && jfq1.d.e)
        {
            flag = false;
        } else
        if (jhc1.b != null && jhc1.b.e)
        {
            flag = false;
        } else
        if (jhc1.b != null && jhc1.e)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (!flag) goto _L2; else goto _L3
_L3:
        jhc1.c = jfq1;
        if (android.os.Build.VERSION.SDK_INT < 16 || jfq1.d == null || jfq1.d == jhc1.b) goto _L5; else goto _L4
_L4:
        if (jhc1.isAvailable() && jhc1.a.a())
        {
            noy.a("getSurfaceTexture()", jhc1.getSurfaceTexture());
            noy.a("surfaceTexture", jhc1.b);
            noy.a("VideoTextureView", jhc1);
            noy.a("mediaPlayer", jfq1);
        }
        if (jhc1.b != null)
        {
            jhc1.b.a();
        }
        jhc1.e = true;
        jgw1 = jfq1.d;
        jhc1.setSurfaceTexture(jgw1.a);
        jhc1.b = jgw1;
_L7:
        if (jhc1.a.a())
        {
            noy.a("VideoTextureView", jhc1);
            noy.a("mediaPlayer", jfq1);
        }
        jhc1.requestLayout();
        jhc1.invalidate();
_L2:
        return;
_L5:
        if (jhc1.b != null && jfq1.d == null)
        {
            jhc1.e = true;
            jfq1.a(jhc1.b);
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void a(boolean flag)
    {
    }

    public final boolean a(Canvas canvas)
    {
        if (h() && a.getVisibility() == 0)
        {
            canvas.drawColor(0x3300ff00);
            return true;
        } else
        {
            return false;
        }
    }

    public final void b()
    {
        if (a == null)
        {
            a = d.a();
            a.d = this;
            b.addView(a, b.getLayoutParams());
            if (f != null && f.h)
            {
                a.setVisibility(4);
            } else
            {
                a.setVisibility(0);
            }
        }
        a(f);
    }

    public final void c()
    {
        if (a == null)
        {
            return;
        } else
        {
            b.removeView(a);
            a = null;
            return;
        }
    }

    public final void d()
    {
        if (!h())
        {
            return;
        }
        if (f.h)
        {
            a.setVisibility(4);
            return;
        } else
        {
            a.setVisibility(0);
            return;
        }
    }

    public final boolean e()
    {
        return h() && a.f;
    }

    public final void f()
    {
        if (!h())
        {
            return;
        } else
        {
            a.e = false;
            return;
        }
    }

    public final Bitmap g()
    {
        if (!h() || a.getWidth() <= 0 || a.getHeight() <= 0 || !a.f)
        {
            return null;
        } else
        {
            return a.getBitmap();
        }
    }

    final boolean h()
    {
        return a != null;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
    {
        if (e != null)
        {
            e.onSurfaceTextureAvailable(surfacetexture, i, j);
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        if (e != null)
        {
            return e.onSurfaceTextureDestroyed(surfacetexture);
        } else
        {
            return false;
        }
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
    {
        if (e != null)
        {
            e.onSurfaceTextureSizeChanged(surfacetexture, i, j);
        }
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
        if (e != null)
        {
            e.onSurfaceTextureUpdated(surfacetexture);
        }
    }

    public final void onVideoSizeChanged(MediaPlayer mediaplayer, int i, int j)
    {
        if (h())
        {
            a.onVideoSizeChanged(mediaplayer, i, j);
        }
    }

    public final String toString()
    {
        String s = String.valueOf(super.toString());
        String s1 = String.valueOf(f);
        String s2 = String.valueOf(a);
        return (new StringBuilder(String.valueOf(s).length() + 33 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append("{mediaPlayer=").append(s1).append(", videoTextureView=").append(s2).append("}").toString();
    }
}
