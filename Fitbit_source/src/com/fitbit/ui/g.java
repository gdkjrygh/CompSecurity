// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.view.ViewCompat;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.FloatMath;
import android.view.animation.AnimationUtils;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartNamedCollection;
import com.artfulbits.aiCharts.Base.e;
import com.artfulbits.aiCharts.ChartView;
import com.artfulbits.aiCharts.a.a;
import com.fitbit.util.ap;

public class g extends a
{

    private static final int c = 500;
    private Handler d;
    private StaticLayout e;
    private StaticLayout f;
    private int g;
    private int h;
    private Drawable i;
    private Drawable j;
    private Rect k;
    private int l;
    private int m;
    private boolean n;
    private Drawable o;
    private TextPaint p;
    private Paint q;
    private Paint r;
    private boolean s;
    private double t;
    private ChartView u;
    private long v;
    private boolean w;
    private Runnable x;

    public g(Context context)
    {
        d = new Handler(Looper.getMainLooper());
        e = null;
        f = null;
        k = new Rect();
        n = false;
        p = new TextPaint();
        p.setColor(0xff000000);
        p.setAntiAlias(true);
        r = new Paint();
        r.setColor(0xff000000);
        r.setPathEffect(new DashPathEffect(new float[] {
            10F, 5F
        }, 1.0F));
        s = false;
        v = 0L;
        w = false;
        x = new Runnable() {

            final g a;

            public void run()
            {
                com.fitbit.ui.g.a(a, AnimationUtils.currentAnimationTimeMillis());
                ViewCompat.postInvalidateOnAnimation(com.fitbit.ui.g.a(a));
            }

            
            {
                a = g.this;
                super();
            }
        };
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "fonts/ProximaNova/ProximaNova-Reg.otf");
        p.setColor(context.getResources().getColor(0x7f0f005c));
        p.setTypeface(Typeface.create(typeface, 0));
        p.setTextSize(ap.a(context, 14F));
        g = ap.a(context, 4F);
        l = ap.a(context, 8F);
        m = ap.a(context, 4F);
    }

    static long a(g g1, long l1)
    {
        g1.v = l1;
        return l1;
    }

    private Path a(float f1)
    {
        Path path = new Path();
        path.reset();
        path.addCircle(0.0F, 0.0F, f1, android.graphics.Path.Direction.CW);
        path.close();
        return path;
    }

    static ChartView a(g g1)
    {
        return g1.u;
    }

    private void a(float f1, float f2, float f3, int i1)
    {
        q = new Paint();
        q.setAntiAlias(true);
        q.setColor(i1);
        q.setPathEffect(new PathDashPathEffect(a(f3), f1, f2, android.graphics.PathDashPathEffect.Style.MORPH));
    }

    private static void a(Canvas canvas, RectF rectf, float f1, Paint paint, Paint paint1, Drawable drawable)
    {
        if (drawable != null)
        {
            if (paint1 != null)
            {
                canvas.drawLine(rectf.left, f1, rectf.right, f1, e(-1));
                canvas.drawLine(rectf.left, f1, rectf.right, f1, paint);
                canvas.drawLine(rectf.left, f1, rectf.right, f1, paint1);
                return;
            } else
            {
                canvas.drawLine(rectf.left, f1, rectf.right, f1, e(-1));
                return;
            }
        }
        if (paint1 != null)
        {
            canvas.drawLine(rectf.left, f1, rectf.right, f1, d(-1));
            canvas.drawLine(rectf.left, f1, rectf.right, f1, paint);
            canvas.drawLine(rectf.left, f1, rectf.right, f1, paint1);
            return;
        } else
        {
            canvas.drawLine(rectf.left, f1, rectf.right, f1, paint);
            return;
        }
    }

    private static int[] a(Drawable drawable, Rect rect, int i1)
    {
        int j1;
        int k1;
        int l1;
        if (drawable != null)
        {
            int i2;
            if (drawable.getIntrinsicHeight() != -1)
            {
                j1 = drawable.getIntrinsicHeight();
            } else
            {
                j1 = rect.height();
            }
            k1 = drawable.getIntrinsicWidth();
            i2 = rect.height();
            rect.right = Math.round(ap.b(19F)) + k1;
            l1 = rect.centerY() - j1 / 2;
            drawable.setBounds(rect.left, l1, rect.left + k1, l1 + j1);
            l1 = j1;
            j1 = i2;
        } else
        {
            j1 = rect.height();
            l1 = rect.height();
            rect.right = rect.right + (0 + i1);
            k1 = 0;
        }
        rect.bottom = Math.max(l1 + rect.top, rect.bottom);
        return (new int[] {
            k1 + i1 + 0, (rect.height() - j1) / 2 + 0
        });
    }

    private static Paint d(int i1)
    {
        Paint paint = new Paint();
        paint.setColor(i1);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(ap.b(2.0F));
        paint.setAntiAlias(true);
        return paint;
    }

    private static Paint e(int i1)
    {
        Paint paint = new Paint();
        paint.setColor(i1);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(ap.b(1.0F));
        paint.setAntiAlias(true);
        return paint;
    }

    public int a(CharSequence charsequence)
    {
        return (int)FloatMath.ceil(StaticLayout.getDesiredWidth(charsequence, p));
    }

    public void a(double d1)
    {
        t = d1;
    }

    public void a(float f1, float f2, int i1)
    {
        r.setColor(-1);
        r.setAntiAlias(true);
        r.setPathEffect(new PathDashPathEffect(a(f2), f1, f2, android.graphics.PathDashPathEffect.Style.MORPH));
        a(f1, f2, f2 / 2.0F, i1);
    }

    public void a(Canvas canvas, e e1)
    {
        boolean flag1;
        if (o != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 && j == null)
        {
            j = o;
        }
        if (!s)
        {
            e1 = (com.artfulbits.aiCharts.Base.a)e1.b().get(0);
            Object obj = e1.d();
            e1 = e1.e();
            RectF rectf = ((ChartAxis) (obj)).B();
            obj = e1.B();
            double d1 = e1.a().h(t);
            float f1 = (float)((double)((RectF) (obj)).bottom - d1 * (double)((RectF) (obj)).height());
            if (((RectF) (obj)).top <= f1 && f1 <= ((RectF) (obj)).bottom)
            {
                a(canvas, rectf, f1, r, q, o);
                if (e != null && !w)
                {
                    e.getLineBounds(0, k);
                    int i1;
                    int j1;
                    boolean flag;
                    boolean flag2;
                    int l1;
                    int i2;
                    int j2;
                    int k2;
                    if (f != null)
                    {
                        f.getLineBounds(0, k);
                        k.offset(8, 0);
                    } else
                    if (flag1)
                    {
                        k.offset(Math.round(rectf.left + (float)h) - Math.round(ap.b(3F)), 0);
                    } else
                    {
                        k.offset(Math.round(rectf.left) + h, 0);
                    }
                    if (flag1 && j == null)
                    {
                        j = o;
                    } else
                    {
                        o = j;
                    }
                    j1 = 0;
                    i1 = 0;
                    if (flag1 && o.getIntrinsicWidth() != -1)
                    {
                        flag2 = true;
                    } else
                    {
                        flag2 = false;
                    }
                    if (flag2)
                    {
                        e1 = a(o, k, m);
                        j1 = e1[0];
                        i1 = e1[1];
                    }
                    i2 = i1;
                    l1 = j1;
                    if (i != null)
                    {
                        k.inset(-l, -l);
                        l1 = j1 + l;
                        i2 = i1 + l;
                    }
                    j2 = Math.round(f1) - g - k.height();
                    k2 = Math.round(f1) + g;
                    if ((float)(k.top + j2) > ((RectF) (obj)).top)
                    {
                        i1 = 1;
                    } else
                    {
                        i1 = 0;
                    }
                    if ((float)(k.bottom + k2) < ((RectF) (obj)).bottom)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (n && i1 != 0 || !n && !flag)
                    {
                        i1 = 1;
                    } else
                    {
                        i1 = 0;
                    }
                    if (!flag1)
                    {
                        if (f == null)
                        {
                            e1 = k;
                            if (i1 != 0)
                            {
                                i1 = j2;
                            } else
                            {
                                i1 = k2;
                            }
                            e1.offset(0, i1);
                        } else
                        {
                            k.offset(0, k2);
                        }
                    } else
                    {
                        k.offset(0, Math.round(f1) - k.height() / 2);
                    }
                    if (v != 0L)
                    {
                        long l2 = AnimationUtils.currentAnimationTimeMillis();
                        boolean flag3;
                        if (l2 - v >= 500L)
                        {
                            flag3 = true;
                        } else
                        {
                            flag3 = false;
                        }
                        w = flag3;
                        if (w)
                        {
                            v = 0L;
                            u = null;
                            return;
                        }
                        int k1 = Math.round(255F * (1.0F - (float)(l2 - v) / 500F));
                        i1 = canvas.saveLayerAlpha(k.left, k.top, k.right, k.bottom, k1, 4);
                        p.setAlpha(k1);
                        p.setAntiAlias(true);
                        ViewCompat.postInvalidateOnAnimation(u);
                    } else
                    {
                        p.setAlpha(255);
                        p.setAntiAlias(true);
                        i1 = canvas.save(0);
                    }
                    if (i != null)
                    {
                        i.setBounds(k);
                        i.draw(canvas);
                    }
                    if (flag2)
                    {
                        o.getBounds().offsetTo(k.left, Math.round(f1) - (o.getBounds().centerY() + Math.round(ap.b(1.0F))));
                        if ((float)o.getBounds().width() > ap.b(25F))
                        {
                            e1 = o.getBounds();
                            e1.right = (int)((float)((Rect) (e1)).right - ap.b(8F));
                        }
                        o.getBounds().left = (int)ap.b(4F);
                        e1 = new Rect(k);
                        if (e != null)
                        {
                            e1.right = e.getEllipsizedWidth() - Math.round(ap.b(8F));
                        }
                        e1.left = (int)ap.b(4F);
                        o.getBounds().union(e1);
                        o.draw(canvas);
                    }
                    if (f != null)
                    {
                        if (flag1)
                        {
                            canvas.translate(Math.round(ap.b(8F)), i2 + k.top);
                        } else
                        {
                            canvas.translate(l1 + k.left, i2 + k.top);
                        }
                        e.draw(canvas);
                        canvas.translate(0.0F, e.getHeight() - 8);
                        f.draw(canvas);
                    } else
                    {
                        if (flag1)
                        {
                            canvas.translate(Math.round(ap.b(8F)), i2 + k.top);
                        } else
                        {
                            canvas.translate(l1 + k.left, i2 + k.top);
                        }
                        e.draw(canvas);
                    }
                    canvas.restoreToCount(i1);
                    return;
                }
            }
        }
    }

    public void a(Drawable drawable)
    {
        o = drawable;
    }

    public void a(ChartView chartview, long l1)
    {
        if (!w && !s)
        {
            if (chartview == null)
            {
                throw new NullPointerException("chart view is null");
            }
            u = chartview;
            d.removeCallbacks(x);
            d.postDelayed(x, l1);
        }
    }

    public void a(boolean flag)
    {
        s = flag;
        if (flag)
        {
            d.removeCallbacks(x);
        }
    }

    public void b(int i1)
    {
        g = i1;
    }

    public void b(Drawable drawable)
    {
        i = drawable;
    }

    public void b(CharSequence charsequence)
    {
        int i1 = a(charsequence);
        e = new StaticLayout(charsequence, p, i1, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
    }

    public void b(boolean flag)
    {
        w = flag;
    }

    public void c(int i1)
    {
        h = i1;
    }

    public void c(Drawable drawable)
    {
        j = drawable;
    }

    public void c(CharSequence charsequence)
    {
        int i1 = a(charsequence);
        f = new StaticLayout(charsequence, p, i1, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
    }

    public void c(boolean flag)
    {
        n = flag;
    }

    public double d()
    {
        return t;
    }

    public Paint e()
    {
        return r;
    }

    public TextPaint f()
    {
        return p;
    }

    public Drawable g()
    {
        return o;
    }

    public boolean h()
    {
        return s;
    }

    public boolean i()
    {
        return w;
    }

    public boolean j()
    {
        return u != null;
    }

    public void k()
    {
        d.removeCallbacks(x);
        v = 0L;
        w = false;
        u = null;
    }

    public Drawable l()
    {
        return i;
    }

    public int m()
    {
        return g;
    }

    public int n()
    {
        return h;
    }

    public Drawable o()
    {
        return j;
    }
}
