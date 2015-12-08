// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import com.aviary.android.feather.common.utils.g;
import com.aviary.android.feather.library.graphics.RectD;
import it.sephiroth.android.library.easing.b;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            CropImageView

public class e
{
    static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/aviary/android/feather/sdk/widget/e$a, s1);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("None", 0);
            b = new a("Move", 1);
            c = new a("Grow", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private static Handler j = new Handler();
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private Rect H;
    private Path I;
    private Path J;
    private Path K;
    private RectD L;
    private Rect M;
    private RectF N;
    private RectF O;
    private RectF P;
    private Rect Q;
    private RectD R;
    private RectF S;
    final int a = 3;
    final int b = 3;
    final float c = 30F;
    protected volatile boolean d;
    protected int e;
    protected b f;
    private boolean g;
    private int h;
    private int i;
    private int k;
    private a l;
    private Rect m;
    private RectD n;
    private RectD o;
    private Matrix p;
    private boolean q;
    private double r;
    private Drawable s;
    private final Paint t = new Paint();
    private final Paint u = new Paint();
    private final Paint v = new Paint();
    private Paint w;
    private int x;
    private int y;
    private int z;

    public e(View view, int i1)
    {
        k = 20;
        m = new Rect();
        q = false;
        w = new Paint();
        H = new Rect();
        I = new Path();
        J = new Path();
        K = new Path();
        L = new RectD();
        M = new Rect();
        N = new RectF();
        O = new RectF();
        P = new RectF();
        Q = new Rect();
        R = new RectD();
        S = new RectF();
        d = false;
        e = 300;
        f = new it.sephiroth.android.library.easing.e();
        if (i1 > 0)
        {
            TypedArray typedarray = view.getContext().obtainStyledAttributes(i1, com.aviary.android.feather.sdk.R.styleable.AviaryCropHighlightView);
            B = typedarray.getDimensionPixelSize(7, 2);
            x = typedarray.getColor(6, -1);
            y = typedarray.getColor(8, -1);
            z = typedarray.getColor(4, 0x99000000);
            A = typedarray.getColor(5, 0x99000000);
            C = typedarray.getDimensionPixelSize(1, 1);
            D = typedarray.getColor(2, -1);
            E = typedarray.getColor(3, -1);
            s = typedarray.getDrawable(0);
            typedarray.recycle();
        } else
        {
            B = 2;
            C = 1;
            x = -1;
            y = -1;
            z = 0;
            A = 0;
            D = 0;
            E = 0;
            s = null;
        }
        if (s != null)
        {
            double d1 = s.getIntrinsicWidth();
            double d2 = s.getIntrinsicHeight();
            F = (int)Math.ceil(d1 / 2D);
            G = (int)Math.ceil(d2 / 2D);
        }
        view.getDrawingRect(H);
        h = view.getWidth();
        i = view.getHeight();
    }

    static Rect a(e e1)
    {
        return e1.m;
    }

    private RectD a(Matrix matrix, RectD rectd, RectD rectd1)
    {
        boolean flag = false;
        boolean flag1 = true;
        S.set((float)rectd.a, (float)rectd.b, (float)rectd.c, (float)rectd.d);
        matrix.mapRect(S);
        float af[] = new float[9];
        matrix.getValues(af);
        float f1 = af[0];
        if ((double)S.left < rectd1.a)
        {
            rectd.a((rectd1.a - (double)S.left) / (double)f1, 0.0D);
            flag = true;
        } else
        if ((double)S.right > rectd1.c)
        {
            rectd.a(-((double)S.right - rectd1.c) / (double)f1, 0.0D);
            flag = true;
        }
        if ((double)S.top < rectd1.b)
        {
            rectd.a(0.0D, (rectd1.b - (double)S.top) / (double)f1);
            flag = true;
        } else
        if ((double)S.bottom > rectd1.d)
        {
            rectd.a(0.0D, -((double)S.bottom - rectd1.d) / (double)f1);
            flag = true;
        }
        S.set((float)rectd.a, (float)rectd.b, (float)rectd.c, (float)rectd.d);
        matrix.mapRect(S);
        if ((double)S.width() > rectd1.a())
        {
            if ((double)S.left < rectd1.a)
            {
                rectd.a = rectd.a + (rectd1.a - (double)S.left) / (double)f1;
            }
            if ((double)S.right > rectd1.c)
            {
                rectd.c = rectd.c + -((double)S.right - rectd1.c) / (double)f1;
            }
            flag = true;
        }
        if ((double)S.height() > rectd1.b())
        {
            if ((double)S.top < rectd1.b)
            {
                rectd.b = rectd.b + (rectd1.b - (double)S.top) / (double)f1;
            }
            flag = flag1;
            if ((double)S.bottom > rectd1.d)
            {
                double d1 = rectd.d;
                rectd.d = -((double)S.bottom - rectd1.d) / (double)f1 + d1;
                flag = flag1;
            }
        }
        if (q && flag)
        {
            if (r >= 1.0D)
            {
                rectd.d = rectd.a() / r + rectd.b;
            } else
            {
                rectd.c = rectd.b() * r + rectd.a;
            }
        }
        rectd.c();
        return rectd;
    }

    private void a(RectD rectd)
    {
        double d1;
        double d2;
        if (rectd.a < n.a)
        {
            rectd.a(n.a - rectd.a, 0.0D);
        } else
        if (rectd.c > n.c)
        {
            rectd.a(-(rectd.c - n.c), 0.0D);
        }
        if (rectd.b < n.b)
        {
            rectd.a(0.0D, n.b - rectd.b);
        } else
        if (rectd.d > n.d)
        {
            rectd.a(0.0D, -(rectd.d - n.d));
        }
        if (rectd.a() <= n.a()) goto _L2; else goto _L1
_L1:
        if (rectd.a >= n.a) goto _L4; else goto _L3
_L3:
        d2 = n.a - rectd.a;
        rectd.a = rectd.a + d2;
        d1 = -1D;
_L7:
        if (q)
        {
            if (d1 != -1D)
            {
                rectd.b((d1 * r) / 2D, 0.0D);
            } else
            if (d2 != -1D)
            {
                rectd.b(0.0D, d2 / r / 2D);
            }
        }
        rectd.c();
        return;
_L4:
        if (rectd.c > n.c)
        {
            d2 = rectd.c - n.c;
            rectd.c = rectd.c + -d2;
            d1 = -1D;
            continue; /* Loop/switch isn't completed */
        }
          goto _L5
_L2:
        if (rectd.b() > n.b())
        {
            if (rectd.b < n.b)
            {
                d1 = n.b - rectd.b;
                rectd.b = rectd.b + d1;
                d2 = -1D;
                continue; /* Loop/switch isn't completed */
            }
            if (rectd.d > n.d)
            {
                d1 = rectd.d - n.d;
                rectd.d = rectd.d + -d1;
                d2 = -1D;
                continue; /* Loop/switch isn't completed */
            }
        }
_L5:
        d1 = -1D;
        d2 = -1D;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void a(boolean flag, Rect rect)
    {
        if (flag)
        {
            a(o);
            L.a(0.0D, 0.0D, h, i);
            o = a(p, o, L);
        }
        a(p, o, rect);
    }

    static boolean a(e e1, boolean flag)
    {
        e1.q = flag;
        return flag;
    }

    static Handler i()
    {
        return j;
    }

    double a(double d1, double d2)
    {
label0:
        {
            double d3;
label1:
            {
                if (d1 == 0.0D)
                {
                    break label0;
                }
                d3 = d1 / r;
                d1 = d3;
                if (d2 != 0.0D)
                {
                    if (d2 <= 0.0D)
                    {
                        break label1;
                    }
                    d1 = Math.abs(d3);
                }
                return d1;
            }
            return Math.abs(d3) * -1D;
        }
        return d2;
    }

    public int a(float f1, float f2)
    {
        int i1 = 0;
        Rect rect = new Rect();
        a(false, rect);
        int j1;
        boolean flag;
        boolean flag1;
        if (f2 >= (float)rect.top - 30F && f2 < (float)rect.bottom + 30F)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag = i1;
        if (f1 >= (float)rect.left - 30F)
        {
            flag = i1;
            if (f1 < (float)rect.right + 30F)
            {
                flag = true;
            }
        }
        if (Math.abs((float)rect.left - f1) < 30F && flag1)
        {
            j1 = 3;
        } else
        {
            j1 = 1;
        }
        i1 = j1;
        if (Math.abs((float)rect.right - f1) < 30F)
        {
            i1 = j1;
            if (flag1)
            {
                i1 = j1 | 4;
            }
        }
        j1 = i1;
        if (Math.abs((float)rect.top - f2) < 30F)
        {
            j1 = i1;
            if (flag)
            {
                j1 = i1 | 8;
            }
        }
        if (Math.abs((float)rect.bottom - f2) < 30F && flag)
        {
            i1 = j1 | 0x10;
        } else
        {
            i1 = j1;
        }
        j1 = i1;
        if (i1 == 1)
        {
            j1 = i1;
            if (rect.contains((int)f1, (int)f2))
            {
                j1 = 32;
            }
        }
        return j1;
    }

    public void a()
    {
    }

    public void a(int i1)
    {
        k = i1;
    }

    void a(int i1, double d1, double d2)
    {
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        flag1 = b(i1);
        flag2 = c(i1);
        flag3 = d(i1);
        flag4 = e(i1);
        double d3;
        RectD rectd;
        boolean flag;
        if (flag1 || flag2)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (flag3 || flag4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i1 == 0 || !flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d3 = (double)k / (double)c();
        R.a(o);
        if (!flag) goto _L2; else goto _L1
_L1:
        if (i1 == 0) goto _L4; else goto _L3
_L3:
        d2 = a(d1, 0.0D);
        if (flag1)
        {
            rectd = R;
            rectd.a = rectd.a + d1;
            R.b(0.0D, d2 / 2D);
        } else
        {
            RectD rectd1 = R;
            rectd1.c = rectd1.c + d1;
            R.b(0.0D, -d2 / 2D);
        }
_L6:
        if (R.a() >= d3 && R.b() >= d3 && n.b(R))
        {
            o.a(R);
        }
        a(true, m);
        return;
_L4:
        d1 = b(d2, 0.0D);
        if (flag3)
        {
            RectD rectd2 = R;
            rectd2.b = rectd2.b + d2;
            R.b(d1 / 2D, 0.0D);
        } else
        if (flag4)
        {
            RectD rectd3 = R;
            rectd3.d = rectd3.d + d2;
            R.b(-d1 / 2D, 0.0D);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        d2 = a(d1, 0.0D);
        if (flag1 && flag3)
        {
            RectD rectd4 = R;
            rectd4.a = rectd4.a + d1;
            rectd4 = R;
            rectd4.b = d2 + rectd4.b;
        } else
        if (flag1 && flag4)
        {
            RectD rectd5 = R;
            rectd5.a = rectd5.a + d1;
            rectd5 = R;
            rectd5.d = rectd5.d - d2;
        } else
        if (flag2 && flag3)
        {
            RectD rectd6 = R;
            rectd6.c = rectd6.c + d1;
            rectd6 = R;
            rectd6.b = rectd6.b - d2;
        } else
        if (flag2 && flag4)
        {
            RectD rectd7 = R;
            rectd7.c = rectd7.c + d1;
            rectd7 = R;
            rectd7.d = d2 + rectd7.d;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    void a(int i1, float f1, float f2)
    {
        if (!d)
        {
            a(false, M);
            if (i1 != 1)
            {
                if (i1 == 32)
                {
                    c((double)f1 * (o.a() / (double)M.width()), (double)f2 * (o.b() / (double)M.height()));
                    return;
                }
                if ((i1 & 6) == 0)
                {
                    f1 = 0.0F;
                }
                if ((i1 & 0x18) == 0)
                {
                    f2 = 0.0F;
                }
                double d1 = Math.round((double)f1 * (o.a() / (double)M.width()));
                double d2 = Math.round((double)f2 * (o.b() / (double)M.height()));
                if (q)
                {
                    a(i1, d1, d2);
                    return;
                } else
                {
                    b(i1, d1, d2);
                    return;
                }
            }
        }
    }

    protected void a(Canvas canvas)
    {
        int k1 = 1;
        if (!g)
        {
            I.reset();
            K.reset();
            J.reset();
            O.set(m);
            N.set(H);
            K.addRect(N, android.graphics.Path.Direction.CW);
            K.addRect(O, android.graphics.Path.Direction.CCW);
            O.set(m);
            I.addRect(O, android.graphics.Path.Direction.CW);
            N.set(m);
            J.addRect(N, android.graphics.Path.Direction.CW);
            float f1 = (float)m.height() / 3F;
            float f2 = (float)m.width() / 3F;
            int i1 = 1;
            int j1;
            do
            {
                j1 = k1;
                if (i1 >= 3)
                {
                    break;
                }
                J.moveTo(m.left, (int)((float)m.top + (float)i1 * f1));
                J.lineTo(m.right, (int)((float)m.top + (float)i1 * f1));
                i1++;
            } while (true);
            for (; j1 < 3; j1++)
            {
                J.moveTo((int)((float)m.left + (float)j1 * f2), m.top);
                J.lineTo((int)((float)m.left + (float)j1 * f2), m.bottom);
            }

            canvas.drawPath(K, v);
            canvas.drawPath(J, u);
            canvas.drawPath(I, t);
            i1 = m.left + 1;
            j1 = m.right + 1;
            k1 = m.top + 4;
            int l1 = m.bottom + 3;
            if (s != null)
            {
                s.setBounds(i1 - F, k1 - G, F + i1, G + k1);
                s.draw(canvas);
                s.setBounds(j1 - F, k1 - G, F + j1, k1 + G);
                s.draw(canvas);
                s.setBounds(i1 - F, l1 - G, i1 + F, G + l1);
                s.draw(canvas);
                s.setBounds(j1 - F, l1 - G, j1 + F, l1 + G);
                s.draw(canvas);
                return;
            }
        }
    }

    public void a(Matrix matrix, RectD rectd, Rect rect)
    {
        P.set((float)rectd.a, (float)rectd.b, (float)rectd.c, (float)rectd.d);
        matrix.mapRect(P);
        rect.set(Math.round(P.left), Math.round(P.top), Math.round(P.right), Math.round(P.bottom));
    }

    public void a(Matrix matrix, RectD rectd, RectD rectd1, boolean flag)
    {
        p = new Matrix(matrix);
        o = rectd1;
        n = new RectD(rectd);
        q = flag;
        r = o.a() / o.b();
        a(true, m);
        t.setStrokeWidth(B);
        t.setStyle(android.graphics.Paint.Style.STROKE);
        t.setAntiAlias(false);
        try
        {
            com.aviary.android.feather.common.utils.g.a(t, "setHinting", new Class[] {
                Integer.TYPE
            }, new Object[] {
                Integer.valueOf(0)
            });
        }
        // Misplaced declaration of an exception variable
        catch (Matrix matrix) { }
        u.setStrokeWidth(C);
        u.setStyle(android.graphics.Paint.Style.STROKE);
        u.setAntiAlias(false);
        u.setColor(D);
        try
        {
            com.aviary.android.feather.common.utils.g.a(u, "setHinting", new Class[] {
                Integer.TYPE
            }, new Object[] {
                Integer.valueOf(0)
            });
        }
        // Misplaced declaration of an exception variable
        catch (Matrix matrix) { }
        v.setColor(z);
        v.setStyle(android.graphics.Paint.Style.FILL);
        v.setAntiAlias(false);
        v.setDither(true);
        try
        {
            com.aviary.android.feather.common.utils.g.a(v, "setHinting", new Class[] {
                Integer.TYPE
            }, new Object[] {
                Integer.valueOf(0)
            });
        }
        // Misplaced declaration of an exception variable
        catch (Matrix matrix) { }
        w.setStrokeWidth(C);
        w.setAntiAlias(true);
        w.setColor(0xff000000);
        w.setStyle(android.graphics.Paint.Style.STROKE);
        w.setMaskFilter(new BlurMaskFilter(2.0F, android.graphics.BlurMaskFilter.Blur.NORMAL));
        a(a.a);
    }

    public void a(View view, Matrix matrix, RectD rectd, RectD rectd1, boolean flag)
    {
        if (!d)
        {
            d = true;
            a(a.a);
            view.postInvalidate();
            p = new Matrix(matrix);
            o = rectd1;
            n = new RectD(rectd);
            q = false;
            r = o.a() / o.b();
            matrix = m;
            rectd = new Rect();
            a(false, ((Rect) (rectd)));
            float f1 = ((Rect) (matrix)).left;
            float f2 = ((Rect) (matrix)).top;
            float f3 = ((Rect) (matrix)).right;
            float f4 = ((Rect) (matrix)).bottom;
            double d1 = ((Rect) (rectd)).left - ((Rect) (matrix)).left;
            double d2 = ((Rect) (rectd)).right - ((Rect) (matrix)).right;
            double d3 = ((Rect) (rectd)).top - ((Rect) (matrix)).top;
            double d4 = ((Rect) (rectd)).bottom - ((Rect) (matrix)).bottom;
            long l1 = System.currentTimeMillis();
            j.post(new HighlightView._cls1(l1, d1, d2, d3, d4, new float[] {
                f1, f2
            }, new float[] {
                f3, f4
            }, view, flag));
        }
    }

    public void a(CropImageView cropimageview, int i1, int j1, int k1, int l1)
    {
        cropimageview.getDrawingRect(H);
        h = i1;
        i = j1;
    }

    public void a(a a1)
    {
        if (a1 != l)
        {
            l = a1;
            a1 = t;
            int i1;
            if (l == a.a)
            {
                i1 = x;
            } else
            {
                i1 = y;
            }
            a1.setColor(i1);
            a1 = u;
            if (l == a.a)
            {
                i1 = D;
            } else
            {
                i1 = E;
            }
            a1.setColor(i1);
            a1 = w;
            if (l == a.a)
            {
                i1 = 102;
            } else
            {
                i1 = 0;
            }
            a1.setAlpha(i1);
            a1 = v;
            if (l == a.a)
            {
                i1 = z;
            } else
            {
                i1 = A;
            }
            a1.setColor(i1);
        }
    }

    double b(double d1, double d2)
    {
label0:
        {
            double d3;
label1:
            {
                if (d1 == 0.0D)
                {
                    break label0;
                }
                d3 = r * d1;
                d1 = d3;
                if (d2 != 0.0D)
                {
                    if (d2 <= 0.0D)
                    {
                        break label1;
                    }
                    d1 = Math.abs(d3);
                }
                return d1;
            }
            return Math.abs(d3) * -1D;
        }
        return d2;
    }

    public Rect b()
    {
        return Q;
    }

    void b(float f1, float f2)
    {
        Q.set(m);
        o.a(f1, f2);
        o.a(Math.max(0.0D, n.a - o.a), Math.max(0.0D, n.b - o.b));
        o.a(Math.min(0.0D, n.c - o.c), Math.min(0.0D, n.d - o.d));
        a(false, m);
        Q.union(m);
        Q.inset(-F * 2, -G * 2);
    }

    void b(int i1, double d1, double d2)
    {
        boolean flag1 = b(i1);
        boolean flag2 = c(i1);
        boolean flag3 = d(i1);
        boolean flag4 = e(i1);
        double d3;
        boolean flag;
        if (flag1 || flag2)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (flag3 || flag4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d3 = (double)k / (double)c();
        R.a(o);
        if (i1 != 0)
        {
            if (flag1)
            {
                RectD rectd = R;
                rectd.a = rectd.a + d1;
                if (!flag)
                {
                    R.b(0.0D, d2 / 2D);
                }
            } else
            if (flag2)
            {
                RectD rectd2 = R;
                rectd2.c = rectd2.c + d1;
                if (!flag)
                {
                    R.b(0.0D, -d2 / 2D);
                }
            }
        }
        if (flag)
        {
            if (flag3)
            {
                RectD rectd1 = R;
                rectd1.b = rectd1.b + d2;
                if (i1 == 0)
                {
                    R.b(d1 / 2D, 0.0D);
                }
            } else
            if (flag4)
            {
                RectD rectd3 = R;
                rectd3.d = rectd3.d + d2;
                if (i1 == 0)
                {
                    R.b(-d1 / 2D, 0.0D);
                }
            }
        }
        if (R.a() >= d3 && R.b() >= d3 && n.b(R))
        {
            o.a(R);
        }
        a(true, m);
    }

    boolean b(int i1)
    {
        return (i1 & 2) == 2;
    }

    protected float c()
    {
        float af[] = new float[9];
        p.getValues(af);
        return af[0];
    }

    void c(double d1, double d2)
    {
        b((float)d1, (float)d2);
    }

    boolean c(int i1)
    {
        return (i1 & 4) == 4;
    }

    public void d()
    {
        if (!d)
        {
            a(true, m);
        }
    }

    boolean d(int i1)
    {
        return (i1 & 8) == 8;
    }

    public boolean e()
    {
        return d;
    }

    boolean e(int i1)
    {
        return (i1 & 0x10) == 16;
    }

    public Matrix f()
    {
        return p;
    }

    public Rect g()
    {
        return m;
    }

    public RectD h()
    {
        return o;
    }


    // Unreferenced inner class com/aviary/android/feather/sdk/widget/HighlightView$1

/* anonymous class */
    class HighlightView._cls1
        implements Runnable
    {

        final long a;
        final double b;
        final double c;
        final double d;
        final double e;
        final float f[];
        final float g[];
        final View h;
        final boolean i;
        final e j;

        public void run()
        {
            long l1 = System.currentTimeMillis();
            double d1 = Math.min(j.e, l1 - a);
            double d2 = j.f.a(d1, 0.0D, b, j.e);
            double d3 = j.f.a(d1, 0.0D, c, j.e);
            double d4 = j.f.a(d1, 0.0D, d, j.e);
            double d5 = j.f.a(d1, 0.0D, e, j.e);
            e.a(j).left = (int)((double)f[0] + d2);
            e.a(j).right = (int)((double)g[0] + d3);
            e.a(j).top = (int)((double)f[1] + d4);
            e.a(j).bottom = (int)(d5 + (double)g[1]);
            if (d1 < (double)j.e)
            {
                if (h != null)
                {
                    h.invalidate();
                    e.i().post(this);
                }
            } else
            {
                e.a(j, i);
                j.d = false;
                j.d();
                if (h != null)
                {
                    h.postInvalidate();
                    return;
                }
            }
        }

            
            {
                j = e.this;
                a = l1;
                b = d1;
                c = d2;
                d = d3;
                e = d4;
                f = af;
                g = af1;
                h = view;
                i = flag;
                super();
            }
    }

}
