// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.video.preview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b;
import jie;
import jif;
import jih;
import oub;
import oud;
import ovg;
import ovi;
import p;

public class VideoWithPreviewView extends FrameLayout
    implements android.view.TextureView.SurfaceTextureListener, jih
{

    public final TextureView a;
    public View b;
    public android.view.TextureView.SurfaceTextureListener c;
    private final ImageView d;
    private final View e;
    private final Runnable f = new oub(this);
    private boolean g;
    private float h;
    private int i;
    private int j;
    private jif k;
    private int l;
    private ovg m;
    private int n;
    private long o;
    private long p;

    public VideoWithPreviewView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        g = false;
        h = 1.777778F;
        i = 0x7fffffff;
        j = 0;
        l = 0;
        n = 0;
        p = -1L;
        LayoutInflater.from(context).inflate(b.IQ, this, true);
        a = (TextureView)findViewById(b.II);
        a.setSurfaceTextureListener(this);
        d = (ImageView)findViewById(b.IG);
        e = findViewById(b.IH);
    }

    public static jif a(VideoWithPreviewView videowithpreviewview)
    {
        return videowithpreviewview.k;
    }

    public static void a(VideoWithPreviewView videowithpreviewview, int i1)
    {
        videowithpreviewview.c(i1);
    }

    private void c(int i1)
    {
        boolean flag;
        if (i1 == 2 || i1 == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        c();
    }

    private void d()
    {
        float f1 = getWidth();
        float f2 = getHeight();
        if (f1 != 0.0F && f2 != 0.0F)
        {
            Matrix matrix = new Matrix();
            matrix.setRotate(j, f1 / 2.0F, f2 / 2.0F);
            RectF rectf = new RectF(0.0F, 0.0F, f1, f2);
            matrix.mapRect(rectf);
            matrix.postScale(f1 / rectf.width(), f2 / rectf.height(), f1 / 2.0F, f2 / 2.0F);
            a.setTransform(matrix);
        }
    }

    public final void a(float f1)
    {
        if (h != f1)
        {
            h = f1;
            requestLayout();
        }
    }

    public final void a(int i1)
    {
        if (i != i1)
        {
            i = i1;
            requestLayout();
        }
    }

    public final void a(jie jie)
    {
    }

    public final void a(jif jif1, int i1)
    {
        l = 0;
        if (k == jif1)
        {
            return;
        }
        if (k != null)
        {
            k.b(this);
        }
        k = jif1;
        if (k != null)
        {
            c(k.a());
            k.a(this);
            return;
        } else
        {
            c(5);
            return;
        }
    }

    public final void a(ovg ovg1, boolean flag)
    {
        if (m != null)
        {
            m.e();
        }
        if (ovg1 != null)
        {
            ovg1 = ovg1.d();
        } else
        {
            ovg1 = null;
        }
        m = ovg1;
        if (flag)
        {
            o = -1L;
        } else
        {
            o = System.currentTimeMillis() + 50L;
            postDelayed(f, 50L);
        }
        if (m != null)
        {
            if (m.a() == ovi.b)
            {
                d.setImageBitmap(m.c());
                d.setVisibility(0);
            }
        } else
        {
            d.setImageBitmap(null);
            d.setVisibility(8);
        }
        c();
    }

    public final void a(boolean flag, int i1)
    {
        post(new oud(this, i1));
    }

    public final void b()
    {
        e.setVisibility(0);
    }

    public final void b(int i1)
    {
        if (j != i1)
        {
            j = i1;
            d();
        }
    }

    public final void c()
    {
        boolean flag1 = false;
        if (b == null)
        {
            return;
        }
        long l1 = System.currentTimeMillis();
        int i1;
        boolean flag;
        if (m == null || m.a() != ovi.b)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (o != -1L && o < l1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (g && (i1 != 0 || flag))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            if (p == -1L)
            {
                p = l1;
            }
            l1 -= p;
            View view;
            if (l1 > 15L)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            flag = i1;
            if (i1 == 0)
            {
                postDelayed(f, (15L - l1) + 1L);
                flag = i1;
            }
        } else
        {
            p = -1L;
            flag = false;
        }
        view = b;
        if (flag)
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        view.setVisibility(i1);
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        if (flag)
        {
            d();
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1;
        boolean flag;
        if (android.view.View.MeasureSpec.getMode(i1) == 0x40000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        j1 = android.view.View.MeasureSpec.getSize(i1);
        k1 = (int)((float)j1 / h + 0.5F);
        i1 = k1;
        if (k1 > i)
        {
            i1 = i;
            j1 = (int)((float)i1 * h + 0.5F);
        }
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000));
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i1, int j1)
    {
        if (c != null)
        {
            c.onSurfaceTextureAvailable(surfacetexture, i1, j1);
        }
        d();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        if (c != null)
        {
            return c.onSurfaceTextureDestroyed(surfacetexture);
        } else
        {
            return true;
        }
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i1, int j1)
    {
        if (c != null)
        {
            c.onSurfaceTextureSizeChanged(surfacetexture, i1, j1);
        }
        d();
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
        if (c != null)
        {
            c.onSurfaceTextureUpdated(surfacetexture);
        }
        if (m != null)
        {
            a(((ovg) (null)), false);
            n = 30;
        }
    }

    public final void z_()
    {
    }
}
