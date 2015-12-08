// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.charts;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartNamedCollection;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.a;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.ChartView;
import com.fitbit.util.ap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.ui.charts:
//            b

public abstract class InteractiveChartView extends FrameLayout
{
    public static interface c
    {

        public abstract void g();
    }

    public static interface d
    {

        public abstract void f();
    }


    private static final String b = "InteractiveChartView";
    protected ChartView a;
    private a.a c;
    private b d;
    private d e;
    private c f;
    private boolean g;
    private Scroller h;
    private Object i;

    public InteractiveChartView(Context context)
    {
        super(context);
        g = false;
        i = new Object();
        b();
    }

    public InteractiveChartView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        g = false;
        i = new Object();
        b();
    }

    public InteractiveChartView(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        g = false;
        i = new Object();
        b();
    }

    static boolean a(InteractiveChartView interactivechartview)
    {
        return interactivechartview.g;
    }

    static boolean a(InteractiveChartView interactivechartview, boolean flag)
    {
        interactivechartview.g = flag;
        return flag;
    }

    static c b(InteractiveChartView interactivechartview)
    {
        return interactivechartview.f;
    }

    static b c(InteractiveChartView interactivechartview)
    {
        return interactivechartview.d;
    }

    static d d(InteractiveChartView interactivechartview)
    {
        return interactivechartview.e;
    }

    static boolean e(InteractiveChartView interactivechartview)
    {
        return interactivechartview.h();
    }

    static int f(InteractiveChartView interactivechartview)
    {
        return interactivechartview.i();
    }

    private boolean h()
    {
        long l = (long)((a)a.g().get(0)).d().a().c();
        if ((long)((a)a.g().get(0)).d().a().o() == l)
        {
            h.abortAnimation();
        }
        return h.isFinished();
    }

    private int i()
    {
        return h.getDuration();
    }

    protected abstract int a();

    protected abstract View a(j j1);

    protected j a(MotionEvent motionevent)
    {
        Object obj;
        obj = (ChartSeries)a.h().a("MAIN_SERIES");
        if (obj == null)
        {
            return null;
        }
        double d1 = com.fitbit.util.chart.a.b(motionevent.getX(), a);
        double d2 = com.fitbit.util.chart.a.a(motionevent.getY(), a);
        double d3 = com.fitbit.util.chart.a.c(ap.a(getContext(), 30F), a);
        double d4 = com.fitbit.util.chart.a.d(ap.a(getContext(), 30F), a);
        obj = com.fitbit.util.chart.a.a(d1, d2, (float)d3, (float)d4, ((ChartSeries) (obj)).I(), false);
        if (obj != null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist = new ArrayList();
        a.a(Math.round(motionevent.getX()), Math.round(motionevent.getY()), arraylist);
        motionevent = arraylist.iterator();
_L5:
        if (!motionevent.hasNext()) goto _L2; else goto _L3
_L3:
        Object obj1 = motionevent.next();
        if (!(obj1 instanceof j)) goto _L5; else goto _L4
_L4:
        motionevent = (j)obj1;
_L7:
        obj = motionevent;
        if (!com.fitbit.util.chart.a.a(g(), motionevent))
        {
            obj = null;
        }
        return ((j) (obj));
_L2:
        motionevent = ((MotionEvent) (obj));
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected void a(long l)
    {
    }

    public void a(c c1)
    {
        f = c1;
    }

    public void a(d d1)
    {
        e = d1;
    }

    public void a(Runnable runnable)
    {
        if (runnable == null)
        {
            return;
        } else
        {
    /* block-local class not found */
    class a {}

            (new a(runnable, i)).run();
            return;
        }
    }

    protected void b()
    {
        inflate(getContext(), a(), this);
        a = (ChartView)findViewById(0x7f110239);
        d = c();
        d.setOnDismissListener(new _cls1());
        h = new Scroller(getContext());
    /* block-local class not found */
    class b {}

        c = new b(getContext(), a, h);
        a.a(true);
        a.a(c);
        a.setLayerType(1, null);
    }

    protected b c()
    {
        return com.fitbit.ui.charts.b.a(getContext(), true);
    }

    public void d()
    {
        d.dismiss();
        a(-1L);
    }

    public d e()
    {
        return e;
    }

    public c f()
    {
        return f;
    }

    public ChartView g()
    {
        return a;
    }

    /* member class not found */
    class _cls1 {}

}
