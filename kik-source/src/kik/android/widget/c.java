// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.StateSet;
import kik.android.chat.KikApplication;

// Referenced classes of package kik.android.widget:
//            p, d

public final class c extends p
{
    public static final class a extends Enum
    {

        public static final int a;
        public static final int b;
        public static final int c;
        private static final int d[];

        public static int[] a()
        {
            return (int[])d.clone();
        }

        static 
        {
            a = 1;
            b = 2;
            c = 3;
            d = (new int[] {
                a, b, c
            });
        }
    }


    private static final int r = KikApplication.a(18);
    private static final int s = KikApplication.a(6);
    private static final int t = KikApplication.a(13);
    private Point c;
    private int d;
    private Point e;
    private Point f;
    private Point g;
    private Path h;
    private int i[] = {
        0x10100a1
    };
    private int j[] = {
        0x101009c
    };
    private int k[] = {
        0x10100a7
    };
    private final Matrix l = new Matrix();
    private int m;
    private int n;
    private int o;
    private final Paint p = new d(this);
    private ColorFilter q;
    private int u;

    public c(Bitmap bitmap, int i1)
    {
        super(bitmap);
        e = new Point();
        f = new Point();
        g = new Point();
        h = new Path();
        m = 0;
        q = new LightingColorFilter(0xffbbbbbb, 0);
        u = KikApplication.d(0x7f0d000a);
        d = i1;
    }

    public static int a()
    {
        return s - 1;
    }

    public final void a(int i1)
    {
        if (i1 != 0 && i1 != d)
        {
            d = i1;
            invalidateSelf();
        }
    }

    public final void a(int i1, int j1)
    {
        n = i1;
        o = j1;
        invalidateSelf();
    }

    public final void a(Bitmap bitmap, Bitmap bitmap1)
    {
        super.a(bitmap, bitmap1);
    }

    protected final void a(Canvas canvas)
    {
        a(canvas, p);
    }

    protected final void a(Canvas canvas, Paint paint)
    {
        Rect rect;
        RectF rectf;
        float f1 = 0.0F;
        rect = new Rect(getBounds());
        rectf = new RectF(rect);
        rect.set(rect.left + n, rect.top, rect.right - o, rect.bottom);
        if (rect.width() != getIntrinsicWidth() || rect.height() != getIntrinsicHeight())
        {
            int i1 = getIntrinsicWidth();
            int l1 = getIntrinsicHeight();
            Shader shader = paint.getShader();
            if (shader != null)
            {
                l.reset();
                static final class _cls1
                {

                    static final int a[];

                    static 
                    {
                        a = new int[a.a().length];
                        try
                        {
                            a[a.a - 1] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[a.b - 1] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                float f2;
                float f3;
                if (rect.height() * i1 > rect.width() * l1)
                {
                    f3 = (float)rect.height() / (float)l1;
                    f2 = ((float)rect.width() - (float)i1 * f3) * 0.5F;
                } else
                {
                    f3 = (float)rect.width() / (float)i1;
                    f1 = rect.height();
                    float f4 = l1;
                    f2 = 0.0F;
                    f1 = (f1 - f4 * f3) * 0.5F;
                }
                l.setScale(f3, f3);
                l.postTranslate((int)(f2 + 0.5F) + n, (int)(f1 + 0.5F));
                shader.setLocalMatrix(l);
            }
        }
        if (StateSet.stateSetMatches(i, getState()) || StateSet.stateSetMatches(j, getState()) || StateSet.stateSetMatches(k, getState()))
        {
            paint.setColorFilter(q);
        } else
        {
            paint.setColorFilter(null);
        }
        _cls1.a[d - 1];
        JVM INSTR tableswitch 1 2: default 292
    //                   1 487
    //                   2 580;
           goto _L1 _L2 _L3
_L1:
        if (d != a.c)
        {
            h.reset();
            h.setFillType(android.graphics.Path.FillType.EVEN_ODD);
            h.moveTo(e.x, e.y);
            h.lineTo(f.x, f.y);
            h.lineTo(g.x, g.y);
            h.close();
            canvas.drawPath(h, paint);
        }
        canvas.drawRoundRect(rectf, u, u, paint);
        if (m != 0)
        {
            canvas.drawColor(m);
        }
        return;
_L2:
        int j1 = rect.top + r;
        e.set(rect.left, j1);
        f.set(rect.left + s, t / 2 + j1);
        g.set(rect.left + s, j1 - t / 2);
        rectf.left = rectf.left + (float)(s - 1);
        continue; /* Loop/switch isn't completed */
_L3:
        int k1 = rect.bottom - r;
        e.set(rect.right, k1);
        f.set(rect.right - s, t / 2 + k1);
        g.set(rect.right - s, k1 - t / 2);
        rectf.right = rectf.right - (float)(s - 1);
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void a(Point point)
    {
        c = point;
    }

    public final void b()
    {
        u = 0;
        invalidateSelf();
    }

    public final void b(int i1)
    {
        m = i1;
    }

    protected final void b(Canvas canvas)
    {
        a(canvas, p);
    }

    public final int getIntrinsicHeight()
    {
        int j1 = super.getIntrinsicHeight();
        int i1 = j1;
        if (j1 == 0)
        {
            i1 = j1;
            if (c != null)
            {
                i1 = j1;
                if (c.y > 0)
                {
                    i1 = c.y;
                }
            }
        }
        return i1;
    }

    public final int getIntrinsicWidth()
    {
        int j1 = super.getIntrinsicWidth();
        int i1 = j1;
        if (j1 == 0)
        {
            i1 = j1;
            if (c != null)
            {
                i1 = j1;
                if (c.x > 0)
                {
                    i1 = c.x;
                }
            }
        }
        return i1;
    }

    public final boolean isStateful()
    {
        return true;
    }

    protected final boolean onStateChange(int ai[])
    {
        invalidateSelf();
        return super.onStateChange(ai);
    }

    public final boolean setState(int ai[])
    {
        return super.setState(ai);
    }

}
