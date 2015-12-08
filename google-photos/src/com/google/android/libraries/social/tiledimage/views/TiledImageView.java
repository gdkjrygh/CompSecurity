// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.tiledimage.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.widget.FrameLayout;
import ohq;
import ohr;
import ohs;
import ohv;
import ohx;
import oid;
import oih;
import oii;
import oij;
import oik;
import oil;
import oni;

public final class TiledImageView extends FrameLayout
{

    public static final boolean a;
    private static final boolean f;
    private static final oni g = new oni("debug.tiledimage.draw_overlay");
    public ohq b;
    public float c[];
    public oik d;
    public RectF e;
    private boolean h;
    private android.view.Choreographer.FrameCallback i;
    private boolean j;
    private boolean k;
    private final Object l;

    public TiledImageView(Context context)
    {
        this(context, null);
    }

    public TiledImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        h = false;
        k = true;
        c = new float[9];
        l = new Object();
        e = new RectF();
        if (!a)
        {
            return;
        }
        d = new oik();
        d.g = new oid(this);
        b = new ohq(context);
        context = b;
        context.b();
        context.h = 2;
        context = b;
        attributeset = new oil(this);
        context.b();
        if (((ohq) (context)).e == null)
        {
            context.e = new ohr(context, 8, 8, 8, 0, 16, 0);
        }
        if (((ohq) (context)).f == null)
        {
            context.f = new ohs(context);
        }
        if (((ohq) (context)).g == null)
        {
            context.g = new ohv();
        }
        context.d = attributeset;
        context.c = new ohx(((ohq) (context)).b);
        ((ohq) (context)).c.start();
        b.c.a(0);
        b.setSurfaceTextureListener(new oii(this));
        addView(b, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    public static ohq a(TiledImageView tiledimageview)
    {
        return tiledimageview.b;
    }

    private void a(int i1)
    {
        if (a)
        {
            b.setVisibility(i1);
        }
    }

    private void a(oik oik1)
    {
        if (oik1 == null || oik1.e == null || oik1.a > 0.0F || getWidth() == 0)
        {
            return;
        } else
        {
            oik1.a = Math.min((float)getWidth() / (float)oik1.e.b(), (float)getHeight() / (float)oik1.e.c());
            return;
        }
    }

    public static boolean a()
    {
        return a;
    }

    public static boolean a(TiledImageView tiledimageview, boolean flag)
    {
        tiledimageview.j = true;
        return true;
    }

    public static boolean b(TiledImageView tiledimageview)
    {
        return tiledimageview.k;
    }

    public static boolean b(TiledImageView tiledimageview, boolean flag)
    {
        tiledimageview.h = false;
        return false;
    }

    public static oik c(TiledImageView tiledimageview)
    {
        return tiledimageview.d;
    }

    public static Object d(TiledImageView tiledimageview)
    {
        return tiledimageview.l;
    }

    public final void a(oih oih1, Runnable runnable)
    {
        boolean flag;
        flag = false;
        if (!a)
        {
            return;
        }
        Object obj = l;
        obj;
        JVM INSTR monitorenter ;
        d.e = oih1;
        d.f = runnable;
        runnable = d;
        if (oih1 == null) goto _L2; else goto _L1
_L1:
        int i1 = oih1.b() / 2;
_L5:
        runnable.b = i1;
        runnable = d;
        if (oih1 == null) goto _L4; else goto _L3
_L3:
        i1 = oih1.c() / 2;
_L6:
        runnable.c = i1;
        runnable = d;
        i1 = ((flag) ? 1 : 0);
        if (oih1 == null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        i1 = oih1.e();
        runnable.d = i1;
        d.a = 0.0F;
        a(d);
        obj;
        JVM INSTR monitorexit ;
        invalidate();
        return;
_L2:
        i1 = 0;
          goto _L5
_L4:
        i1 = 0;
          goto _L6
        oih1;
        obj;
        JVM INSTR monitorexit ;
        throw oih1;
          goto _L5
    }

    public final void b()
    {
        k = false;
        if (j)
        {
            a(4);
        }
    }

    public final void c()
    {
        k = true;
        a(0);
    }

    protected final void dispatchDraw(Canvas canvas)
    {
        if (!a)
        {
            return;
        } else
        {
            super.dispatchDraw(canvas);
            return;
        }
    }

    public final void invalidate()
    {
        if (a)
        {
            if (f)
            {
                if (!h)
                {
                    h = true;
                    if (i == null)
                    {
                        i = new oij(this);
                    }
                    Choreographer.getInstance().postFrameCallback(i);
                    return;
                }
            } else
            {
                b.a();
                return;
            }
        }
    }

    protected final void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        if (!a)
        {
            return;
        }
        synchronized (l)
        {
            a(d);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void setTranslationX(float f1)
    {
        if (!a)
        {
            return;
        } else
        {
            super.setTranslationX(f1);
            return;
        }
    }

    static 
    {
        boolean flag1 = true;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        f = flag;
    }
}
