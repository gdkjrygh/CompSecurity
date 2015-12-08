// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Scroller;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartCollection;
import com.artfulbits.aiCharts.Base.ChartNamedCollection;
import com.artfulbits.aiCharts.Base.a;
import com.artfulbits.aiCharts.Base.e;
import com.artfulbits.aiCharts.Base.i;
import com.artfulbits.aiCharts.Base.n;
import com.artfulbits.aiCharts.Base.s;
import com.artfulbits.aiCharts.Base.v;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.artfulbits.aiCharts:
//            a

public class ChartView extends View
{
    final class a
        implements Runnable
    {

        private final Scroller a;
        private int b;
        private int c;
        private ChartAxisScale d;
        private ChartAxisScale e;
        private ChartView f;

        private static int a(float f1, ChartAxisScale chartaxisscale)
        {
            if (chartaxisscale != null && !Double.isNaN(chartaxisscale.p()))
            {
                return (int)(((double)f1 * chartaxisscale.e()) / chartaxisscale.p());
            } else
            {
                return 0;
            }
        }

        private static int a(ChartAxisScale chartaxisscale, int i1)
        {
            if (chartaxisscale != null && !Double.isNaN(chartaxisscale.p()))
            {
                double d1 = chartaxisscale.o();
                double d2 = chartaxisscale.c();
                double d3 = chartaxisscale.e();
                double d4 = chartaxisscale.p();
                return (int)(((d1 - d2) * (double)i1) / (d3 - d4));
            } else
            {
                return 0;
            }
        }

        private static void a(ChartAxisScale chartaxisscale, int i1, int j1)
        {
            if (chartaxisscale != null && !Double.isNaN(chartaxisscale.p()))
            {
                double d1 = chartaxisscale.d();
                double d2 = chartaxisscale.c();
                double d3 = chartaxisscale.p();
                double d4 = chartaxisscale.c();
                chartaxisscale.b(((d1 - d2 - d3) * (double)i1) / (double)j1 + d4);
            }
        }

        public final void a()
        {
            if (!a.isFinished())
            {
                a.abortAnimation();
            }
            d = null;
            e = null;
            b = 0;
            c = 0;
        }

        public final void a(ChartAxis chartaxis, ChartAxis chartaxis1, float f1, float f2)
        {
            int i1;
            int j1;
            if (chartaxis != null)
            {
                d = chartaxis.a();
                b = a(chartaxis.B().width(), d);
                i1 = a(d, b);
            } else
            {
                i1 = 0;
            }
            if (chartaxis1 != null)
            {
                e = chartaxis1.a();
                c = a(chartaxis1.B().height(), e);
                j1 = a(e, c);
            } else
            {
                j1 = 0;
            }
            a.fling(i1, j1, (int)f1, (int)f2, 0, b, 0, c);
            f.post(this);
        }

        public final void run()
        {
            if (a.computeScrollOffset())
            {
                if (d != null)
                {
                    a(d, a.getCurrX(), b);
                }
                if (e != null)
                {
                    a(e, a.getCurrY(), c);
                }
                f.post(this);
            }
        }

        public a(Context context)
        {
            f = ChartView.this;
            super();
            b = 0;
            c = 0;
            d = null;
            e = null;
            a = new Scroller(context);
        }
    }


    public static final int a = 0;
    public static final int b = 5;
    public static final int c = 6;
    public static final int d = 7;
    private GestureDetector e;
    private com.artfulbits.aiCharts.a f;
    private final Hashtable g;
    private e h;
    private final s i;

    public ChartView(Context context)
    {
        this(context, ((AttributeSet) (null)));
    }

    public ChartView(Context context, int i1)
    {
        this(context, null, -1, i1);
    }

    public ChartView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, -1);
    }

    public ChartView(Context context, AttributeSet attributeset, int i1)
    {
        this(context, attributeset, i1, -1);
    }

    private ChartView(Context context, AttributeSet attributeset, int i1, int j1)
    {
        super(context, attributeset, i1);
        g = new Hashtable();
        h = null;
        i = new s() {

            private ChartView a;

            public final void a()
            {
                a.invalidate();
            }

            
            {
                a = ChartView.this;
                super();
            }
        };
        i1 = j1;
        if (attributeset != null)
        {
            i1 = attributeset.getAttributeResourceValue(null, "chart", j1);
        }
        if (i1 != -1)
        {
            b(i1);
            return;
        } else
        {
            a(new e());
            return;
        }
    }

    private static void a(ChartAxis chartaxis, float f1)
    {
        chartaxis = chartaxis.a();
        double d1 = chartaxis.p();
        if (!Double.isNaN(d1))
        {
            chartaxis.b(v.a((double)(-f1) * d1 + chartaxis.o(), chartaxis.c(), chartaxis.d() - d1));
        }
    }

    public GestureDetector a()
    {
        return e;
    }

    public List a(int i1, int j1)
    {
        if (h != null)
        {
            return h.b(i1, j1);
        } else
        {
            return null;
        }
    }

    public void a(int i1)
    {
        if (e == null)
        {
            f = new com.artfulbits.aiCharts.a(this);
            e = new GestureDetector(getContext(), f);
        }
        f.a(i1);
    }

    public void a(int i1, int j1, List list)
    {
        if (h != null)
        {
            h.a(i1, j1, list);
        }
    }

    public void a(android.view.GestureDetector.OnGestureListener ongesturelistener)
    {
        e = new GestureDetector(getContext(), ongesturelistener);
    }

    public void a(GestureDetector gesturedetector)
    {
        e = gesturedetector;
    }

    public void a(com.artfulbits.aiCharts.Base.a a1)
    {
        a a2 = (a)g.get(a1);
        if (a2 != null)
        {
            a2.a();
            g.remove(a1);
        }
    }

    public void a(com.artfulbits.aiCharts.Base.a a1, float f1, float f2)
    {
        a(a1, a1.d(), a1.e(), f1, f2);
    }

    public void a(com.artfulbits.aiCharts.Base.a a1, ChartAxis chartaxis, ChartAxis chartaxis1, float f1, float f2)
    {
        a(a1);
        if (f1 != 0.0F)
        {
            a(chartaxis, -f1 / (float)a1.g().width());
        }
        if (f2 != 0.0F)
        {
            a(chartaxis1, f2 / (float)a1.g().height());
        }
    }

    public void a(e e1)
    {
        if (e1 == null)
        {
            throw new NullPointerException("chart");
        }
        if (h != e1)
        {
            if (h != null)
            {
                h.b(i);
            }
            h = e1;
            if (h != null)
            {
                h.a(i);
            }
            requestLayout();
        }
    }

    public void a(i i1)
    {
        if (h != null)
        {
            h.a(i1);
        }
    }

    public void a(n n)
    {
        h.a(n);
    }

    public void a(boolean flag)
    {
        if (h != null)
        {
            h.b(flag);
        }
    }

    public e b()
    {
        return h;
    }

    public void b(int i1)
    {
        Resources resources = getResources();
        a(new e(resources, resources.getXml(i1)));
    }

    public void b(com.artfulbits.aiCharts.Base.a a1, float f1, float f2)
    {
        if (a1 == null)
        {
            throw new NullPointerException("area");
        } else
        {
            b(a1, a1.d(), a1.e(), f1, f2);
            return;
        }
    }

    public void b(com.artfulbits.aiCharts.Base.a a1, ChartAxis chartaxis, ChartAxis chartaxis1, float f1, float f2)
    {
        if (a1 == null)
        {
            throw new NullPointerException("area");
        }
        a a3 = (a)g.get(a1);
        a a2 = a3;
        if (a3 == null)
        {
            a2 = new a(getContext());
            g.put(a1, a2);
        }
        a2.a(chartaxis, chartaxis1, -f1, f2);
    }

    public i c()
    {
        if (h != null)
        {
            return h.j();
        } else
        {
            return null;
        }
    }

    public boolean d()
    {
        if (h != null)
        {
            return h.h();
        } else
        {
            return false;
        }
    }

    public n e()
    {
        return h.i();
    }

    public com.artfulbits.aiCharts.Base.a f()
    {
        com.artfulbits.aiCharts.Base.a a1 = null;
        if (h != null)
        {
            a1 = new com.artfulbits.aiCharts.Base.a();
            h.b().add(a1);
        }
        return a1;
    }

    public ChartNamedCollection g()
    {
        if (h != null)
        {
            return h.b();
        } else
        {
            return null;
        }
    }

    public ChartNamedCollection h()
    {
        if (h != null)
        {
            return h.c();
        } else
        {
            return null;
        }
    }

    public ChartNamedCollection i()
    {
        if (h != null)
        {
            return h.d();
        } else
        {
            return null;
        }
    }

    public ChartCollection j()
    {
        if (h != null)
        {
            return h.e();
        } else
        {
            return null;
        }
    }

    public ChartCollection k()
    {
        if (h != null)
        {
            return h.f();
        } else
        {
            return null;
        }
    }

    public void l()
    {
        for (Iterator iterator = g.values().iterator(); iterator.hasNext(); ((a)iterator.next()).a()) { }
        g.clear();
    }

    protected void onDraw(Canvas canvas)
    {
        if (h != null)
        {
            h.a(canvas);
        }
        super.onDraw(canvas);
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        if (h != null)
        {
            int i2 = getPaddingLeft();
            int j2 = getPaddingTop();
            int k2 = getPaddingRight();
            int l2 = getPaddingBottom();
            h.a(i2, j2, k1 - i1 - k2, l1 - j1 - l2);
        }
        super.onLayout(flag, i1, j1, k1, l1);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (e != null)
        {
            return e.onTouchEvent(motionevent);
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }
}
