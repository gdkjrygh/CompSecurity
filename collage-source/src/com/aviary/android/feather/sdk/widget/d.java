// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.MotionEvent;
import com.aviary.android.feather.library.graphics.a;
import com.aviary.android.feather.library.graphics.a.c;
import com.aviary.android.feather.sdk.utils.e;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;

public class d
    implements com.aviary.android.feather.library.graphics.a.c.a
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/aviary/android/feather/sdk/widget/d$a, s1);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("Top", 0);
            b = new a("Bottom", 1);
            c = new a("Center", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static interface b
    {

        public abstract void a();
    }


    private static final int I[] = new int[0];
    private static final int J[] = {
        0x10100a1
    };
    private static final int K[] = {
        0x10100a1, 0x10100a7
    };
    private static final int L[] = {
        0x101009c
    };
    private float A;
    private float B;
    private Matrix C;
    private final float D[] = {
        0.0F, 0.0F
    };
    private int E;
    private boolean F;
    private a G;
    private ImageViewTouch H;
    RectF a;
    Rect b;
    private int c;
    private int d;
    private int e;
    private b f;
    private boolean g;
    private int h;
    private int i;
    private RectF j;
    private final RectF k = new RectF();
    private RectF l;
    private Matrix m;
    private com.aviary.android.feather.library.graphics.a.d n;
    private c o;
    private Drawable p;
    private Drawable q;
    private Drawable r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private boolean x;
    private boolean y;
    private boolean z;

    public d(ImageViewTouch imageviewtouch, int i1, com.aviary.android.feather.library.graphics.a.d d1)
    {
        c = 1;
        d = 2;
        e = 4;
        i = c;
        A = 0.0F;
        B = 1.0F;
        C = new Matrix();
        E = 0;
        F = true;
        G = com.aviary.android.feather.sdk.widget.a.c;
        a = new RectF();
        b = new Rect();
        n = d1;
        H = imageviewtouch;
        float f1;
        if (d1 instanceof c)
        {
            o = (c)d1;
            o.a(this);
        } else
        {
            o = null;
        }
        f1 = -1F;
        Log.i("drawable-view", (new StringBuilder()).append("DrawableHighlightView. styleId: ").append(i1).toString());
        if (i1 > 0)
        {
            imageviewtouch = imageviewtouch.getContext().obtainStyledAttributes(i1, com.aviary.android.feather.sdk.R.styleable.AviaryDrawableHighlightView);
            p = imageviewtouch.getDrawable(3);
            q = imageviewtouch.getDrawable(4);
            r = imageviewtouch.getDrawable(0);
            E = imageviewtouch.getDimensionPixelSize(1, 10);
            w = imageviewtouch.getInteger(2, 0);
            Log.i("drawable-view", (new StringBuilder()).append("Edge Mode: ").append(w).toString());
            z = imageviewtouch.getBoolean(6, true);
            x = imageviewtouch.getBoolean(7, true);
            y = imageviewtouch.getBoolean(8, true);
            f1 = imageviewtouch.getDimension(5, 20F);
            imageviewtouch.recycle();
        }
        if (p != null)
        {
            s = p.getIntrinsicWidth() / 2;
            t = p.getIntrinsicHeight() / 2;
        }
        if (q != null)
        {
            v = q.getIntrinsicWidth() / 2;
            u = q.getIntrinsicHeight() / 2;
        }
        p();
        if (f1 > 0.0F)
        {
            b(f1);
        }
    }

    private void p()
    {
        B = n.k() / n.j();
    }

    public int a(float f1, float f2)
    {
label0:
        {
            RectF rectf = new RectF(j);
            rectf.inset(-E, -E);
            float af[] = new float[2];
            af[0] = f1;
            af[1] = f2;
            Matrix matrix = new Matrix();
            matrix.postTranslate(-rectf.centerX(), -rectf.centerY());
            matrix.postRotate(-A);
            matrix.postTranslate(rectf.centerX(), rectf.centerY());
            matrix.mapPoints(af);
            f1 = af[0];
            f2 = af[1];
            int i1;
            int j1;
            boolean flag;
            boolean flag1;
            if (f2 >= rectf.top - 40F && f2 < rectf.bottom + 40F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (f1 >= rectf.left - 40F && f1 < rectf.right + 40F)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag && flag1)
            {
                j1 = 64;
            } else
            {
                j1 = 1;
            }
            i1 = j1;
            if (y)
            {
                Log.d("drawable-view", "scale enabled");
                i1 = j1;
                if (Math.abs(rectf.left - f1) < 40F)
                {
                    i1 = j1;
                    if (flag)
                    {
                        i1 = j1;
                        if (com.aviary.android.feather.sdk.utils.e.a(w, 2))
                        {
                            Log.d("drawable-view", "left");
                            i1 = j1 | 2;
                        }
                    }
                }
                j1 = i1;
                if (Math.abs(rectf.right - f1) < 40F)
                {
                    j1 = i1;
                    if (flag)
                    {
                        j1 = i1;
                        if (com.aviary.android.feather.sdk.utils.e.a(w, 4))
                        {
                            Log.d("drawable-view", "right");
                            j1 = i1 | 4;
                        }
                    }
                }
                int k1 = j1;
                if (Math.abs(rectf.top - f2) < 40F)
                {
                    k1 = j1;
                    if (flag1)
                    {
                        k1 = j1;
                        if (com.aviary.android.feather.sdk.utils.e.a(w, 8))
                        {
                            Log.d("drawable-view", "top");
                            k1 = j1 | 8;
                        }
                    }
                }
                i1 = k1;
                if (Math.abs(rectf.bottom - f2) < 40F)
                {
                    i1 = k1;
                    if (flag1)
                    {
                        i1 = k1;
                        if (com.aviary.android.feather.sdk.utils.e.a(w, 16))
                        {
                            Log.d("drawable-view", "bottom");
                            i1 = k1 | 0x10;
                        }
                    }
                }
            }
            if (!x)
            {
                j1 = i1;
                if (!y)
                {
                    break label0;
                }
            }
            j1 = i1;
            if (Math.abs(rectf.right - f1) < 40F)
            {
                j1 = i1;
                if (Math.abs(rectf.bottom - f2) < 40F)
                {
                    j1 = i1;
                    if (flag)
                    {
                        j1 = i1;
                        if (flag1)
                        {
                            j1 = 32;
                        }
                    }
                }
            }
        }
        i1 = j1;
        if (z)
        {
            i1 = j1;
            if (j1 == 1)
            {
                i1 = j1;
                if (rectf.contains((int)f1, (int)f2))
                {
                    i1 = 64;
                }
            }
        }
        Log.d("drawable-view", (new StringBuilder()).append("retValue: ").append(i1).toString());
        return i1;
    }

    protected RectF a()
    {
        return a(m, l);
    }

    public RectF a(Matrix matrix, RectF rectf)
    {
        rectf = new RectF(rectf);
        matrix.mapRect(rectf);
        return rectf;
    }

    protected void a(float f1)
    {
        a(f1, f1 / B, true);
    }

    void a(float f1, float f2, float f3, float f4)
    {
        if (x || y)
        {
            float af[] = new float[2];
            af[0] = j.centerX();
            af[1] = j.centerY();
            float af1[] = new float[2];
            af1[0] = j.right;
            af1[1] = j.bottom;
            double d1 = com.aviary.android.feather.library.graphics.a.a(af1, af);
            double d3 = com.aviary.android.feather.library.graphics.a.a(new float[] {
                f1, f2
            }, af);
            if (x)
            {
                A = -(float)(d3 - d1);
            }
            if (y)
            {
                Matrix matrix = new Matrix();
                matrix.postRotate(-A);
                float af2[] = new float[2];
                af2[0] = f3;
                af2[1] = f4;
                matrix.mapPoints(af2);
                f1 = af2[0];
                f2 = af2[1];
                f3 = l.width() / j.width();
                f4 = l.height() / j.height();
                float f5 = j.right;
                float f6 = j.bottom;
                double d2 = com.aviary.android.feather.library.graphics.a.b(af, af1);
                a((float)(com.aviary.android.feather.library.graphics.a.b(af, new float[] {
                    f1 * f3 + f5, f6 + f2 * f4
                }) - d2));
                return;
            }
        }
    }

    protected void a(float f1, float f2, boolean flag)
    {
        if (y)
        {
            RectF rectf = new RectF(l);
            RectF rectf1;
            if (G == com.aviary.android.feather.sdk.widget.a.c)
            {
                rectf.inset(-f1, -f2);
            } else
            if (G == com.aviary.android.feather.sdk.widget.a.a)
            {
                rectf.inset(-f1, 0.0F);
                rectf.bottom = rectf.bottom + f2 * 2.0F;
            } else
            {
                rectf.inset(-f1, 0.0F);
                rectf.top = rectf.top - f2 * 2.0F;
            }
            rectf1 = a(m, rectf);
            if (n.a(rectf1) || !flag)
            {
                l.set(rectf);
                j();
                return;
            }
        }
    }

    public void a(int i1)
    {
        Log.i("drawable-view", (new StringBuilder()).append("setMode: ").append(i1).toString());
        if (i1 != h)
        {
            h = i1;
            k();
        }
    }

    public void a(int i1, MotionEvent motionevent, float f1, float f2)
    {
        float f3 = 0.0F;
        if (i1 == 1)
        {
            return;
        }
        D[0] = f1;
        D[1] = f2;
        if (i1 == 64)
        {
            c((l.width() / j.width()) * f1, (l.height() / j.height()) * f2);
            return;
        }
        if (i1 == 32)
        {
            f1 = D[0];
            f2 = D[1];
            f3 = l.width() / j.width();
            f3 = l.height() / j.height();
            a(motionevent.getX(), motionevent.getY(), f1, f2);
            j();
            return;
        }
        motionevent = new Matrix();
        motionevent.postRotate(-A);
        motionevent.mapPoints(D);
        f1 = D[0];
        f2 = D[1];
        if ((i1 & 6) == 0)
        {
            f1 = 0.0F;
        }
        if ((i1 & 0x18) == 0)
        {
            f2 = f3;
        }
        f3 = (l.width() / j.width()) * f1;
        f2 = (l.height() / j.height()) * f2;
        boolean flag = com.aviary.android.feather.sdk.utils.e.a(i1, 2);
        boolean flag1 = com.aviary.android.feather.sdk.utils.e.a(i1, 8);
        if (Math.abs(f3) >= Math.abs(f2))
        {
            if (flag)
            {
                f1 = f3 * -1F;
            } else
            {
                f1 = f3;
            }
        } else
        if (flag1)
        {
            f1 = f2 * -1F;
        } else
        {
            f1 = f2;
        }
        Log.d("drawable-view", (new StringBuilder()).append("x: ").append(f3).append(", y: ").append(f2).append(", final: ").append(f1).toString());
        a(f1);
        j();
    }

    public void a(Context context, Matrix matrix, Rect rect, RectF rectf, boolean flag)
    {
        m = new Matrix(matrix);
        A = 0.0F;
        C = new Matrix();
        l = rectf;
        a(1);
        j();
    }

    public void a(Canvas canvas)
    {
        if (g)
        {
            return;
        }
        a(k);
        int i1 = canvas.save();
        canvas.concat(C);
        if (r != null)
        {
            r.setBounds((int)k.left, (int)k.top, (int)k.right, (int)k.bottom);
            r.draw(canvas);
        }
        boolean flag = l();
        boolean flag1 = m();
        if (o != null)
        {
            o.a(j.left, j.top, j.right, j.bottom);
        } else
        {
            n.setBounds((int)j.left, (int)j.top, (int)j.right, (int)j.bottom);
        }
        n.draw(canvas);
        if ((flag || flag1) && F)
        {
            int j1 = (int)k.left;
            int k1 = (int)k.right;
            int l1 = (int)k.top;
            int i2 = (int)k.bottom;
            if (p != null)
            {
                p.setBounds(k1 - s, i2 - t, k1 + s, i2 + t);
                p.draw(canvas);
            }
            if (q != null)
            {
                q.setBounds(j1 - v, l1 - u, j1 + v, l1 + u);
                q.draw(canvas);
            }
        }
        canvas.restoreToCount(i1);
    }

    public void a(RectF rectf)
    {
        rectf.set(j);
        rectf.inset(-E, -E);
    }

    public void a(c c1, float f1, float f2, float f3, float f4)
    {
label0:
        {
            Log.i("drawable-view", (new StringBuilder()).append("onSizeChanged: ").append(f1).append(", ").append(f2).append(", ").append(f3).append(", ").append(f4).toString());
            if (c1.equals(o) && H != null && (j.left != f1 || j.top != f2 || j.right != f3 || j.bottom != f4))
            {
                if (!o())
                {
                    break label0;
                }
                H.invalidate(f());
            }
            return;
        }
        H.postInvalidate();
    }

    public void a(a a1)
    {
        G = a1;
    }

    public void a(b b1)
    {
        f = b1;
    }

    public void a(boolean flag)
    {
        g = flag;
    }

    public void b()
    {
        f = null;
        H = null;
        n = null;
        o = null;
    }

    public void b(float f1)
    {
        if (B >= 1.0F)
        {
            n.b(f1, f1 / B);
            return;
        } else
        {
            n.b(B * f1, f1);
            return;
        }
    }

    public void b(float f1, float f2)
    {
        boolean flag1 = true;
        RectF rectf = new RectF(j);
        rectf.inset(-E, -E);
        float af[] = new float[2];
        af[0] = f1;
        af[1] = f2;
        Matrix matrix = new Matrix();
        matrix.postTranslate(-rectf.centerX(), -rectf.centerY());
        matrix.postRotate(-A);
        matrix.postTranslate(rectf.centerX(), rectf.centerY());
        matrix.mapPoints(af);
        f1 = af[0];
        f2 = af[1];
        boolean flag;
        if (f2 >= rectf.top - 40F && f2 < rectf.bottom + 40F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (f1 < rectf.left - 40F || f1 >= rectf.right + 40F)
        {
            flag1 = false;
        }
        if (q != null && Math.abs(rectf.left - f1) < 40F && Math.abs(rectf.top - f2) < 40F && flag && flag1 && f != null)
        {
            f.a();
        }
    }

    public void b(boolean flag)
    {
        Log.d("drawable-view", (new StringBuilder()).append("setSelected: ").append(flag).toString());
        if (l() != flag)
        {
            i = i ^ d;
            k();
        }
    }

    public RectF c()
    {
        return l;
    }

    void c(float f1, float f2)
    {
        if (z)
        {
            l.offset(f1, f2);
            j();
        }
    }

    public void c(boolean flag)
    {
        Log.i("drawable-view", (new StringBuilder()).append("setFocused: ").append(flag).toString());
        if (m() != flag)
        {
            i = i ^ e;
            if (o != null)
            {
                if (flag)
                {
                    o.h();
                } else
                {
                    o.i();
                }
            }
            k();
        }
    }

    public Matrix d()
    {
        Matrix matrix = new Matrix();
        matrix.postTranslate(-l.centerX(), -l.centerY());
        matrix.postRotate(A);
        matrix.postTranslate(l.centerX(), l.centerY());
        return matrix;
    }

    public RectF e()
    {
        return j;
    }

    public Rect f()
    {
        a.set(j);
        a.inset(-E, -E);
        C.mapRect(a);
        b.set((int)a.left, (int)a.top, (int)a.right, (int)a.bottom);
        int i1 = Math.max(s, v);
        int j1 = Math.max(t, u);
        b.inset(-i1 * 2, -j1 * 2);
        return b;
    }

    public Matrix g()
    {
        return m;
    }

    public int h()
    {
        return h;
    }

    public float i()
    {
        return A;
    }

    public void j()
    {
        j = a();
        Log.d("drawable-view", (new StringBuilder()).append("computeLayout: ").append(j).toString());
        C.reset();
        C.postTranslate(-j.centerX(), -j.centerY());
        C.postRotate(A);
        C.postTranslate(j.centerX(), j.centerY());
    }

    protected void k()
    {
        if (r == null)
        {
            return;
        }
        boolean flag = l();
        boolean flag1 = m();
        if (flag)
        {
            if (h == 1)
            {
                if (flag1)
                {
                    r.setState(L);
                    return;
                } else
                {
                    r.setState(J);
                    return;
                }
            } else
            {
                r.setState(K);
                return;
            }
        } else
        {
            r.setState(I);
            return;
        }
    }

    public boolean l()
    {
        return (i & d) == d;
    }

    public boolean m()
    {
        return (i & e) == e;
    }

    public com.aviary.android.feather.library.graphics.a.d n()
    {
        return n;
    }

    public boolean o()
    {
        Log.i("drawable-view", "forceUpdate");
        RectF rectf = c();
        RectF rectf1 = e();
        if (o != null)
        {
            float f1 = n.k();
            float f2 = n.j();
            p();
            RectF rectf2 = new RectF(rectf);
            g().mapRect(rectf2);
            float f3 = rectf2.width();
            float f4 = rectf2.height();
            float af[] = new float[2];
            af[0] = f1 - f3;
            af[1] = f2 - f4;
            (new Matrix()).postRotate(-A);
            f2 = af[0];
            f1 = af[1];
            f2 *= rectf.width() / rectf1.width();
            f1 = (rectf.height() / rectf1.height()) * f1;
            if (f2 != 0.0F || f1 != 0.0F)
            {
                a(f2 / 2.0F, f1 / 2.0F, false);
            }
            j();
            return true;
        } else
        {
            return false;
        }
    }

}
