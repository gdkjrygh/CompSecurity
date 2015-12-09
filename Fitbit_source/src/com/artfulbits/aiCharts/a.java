// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts;

import android.graphics.Rect;
import android.view.MotionEvent;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartNamedCollection;
import com.artfulbits.aiCharts.Base.v;
import com.artfulbits.aiCharts.Enums.CoordinateSystem;
import java.util.Iterator;

// Referenced classes of package com.artfulbits.aiCharts:
//            ChartView

public class a
    implements android.view.GestureDetector.OnGestureListener
{

    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 4;
    protected int e;
    protected final ChartView f;

    public a(ChartView chartview)
    {
        this(chartview, 0);
    }

    public a(ChartView chartview, int i)
    {
        e = 7;
        if (chartview == null)
        {
            throw new NullPointerException("chartView");
        } else
        {
            f = chartview;
            return;
        }
    }

    protected static com.artfulbits.aiCharts.Base.a a(ChartView chartview, int i, int j, CoordinateSystem coordinatesystem)
    {
        for (chartview = chartview.g().iterator(); chartview.hasNext();)
        {
            com.artfulbits.aiCharts.Base.a a1 = (com.artfulbits.aiCharts.Base.a)chartview.next();
            if (a1.f().contains(i, j) && (coordinatesystem == null || coordinatesystem == a1.i()))
            {
                return a1;
            }
        }

        return null;
    }

    protected static void a(ChartAxis chartaxis, float f1)
    {
        chartaxis = chartaxis.a();
        double d1 = chartaxis.p();
        if (!Double.isNaN(d1))
        {
            chartaxis.b(v.a((double)(-f1) * d1 + chartaxis.o(), chartaxis.c(), chartaxis.d() - d1));
        }
    }

    public int a()
    {
        return e;
    }

    public void a(int i)
    {
        e = i;
    }

    public boolean onDown(MotionEvent motionevent)
    {
        return e != 0;
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        if ((e & 4) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((e & 2) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if ((e & 1) != 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag && (flag1 || flag2))
        {
            com.artfulbits.aiCharts.Base.a a1 = a(f, (int)motionevent.getX(), (int)motionevent.getY(), CoordinateSystem.a);
            if (a1 != null)
            {
                if (flag1)
                {
                    motionevent = a1.d();
                } else
                {
                    motionevent = null;
                }
                if (flag2)
                {
                    motionevent1 = a1.e();
                } else
                {
                    motionevent1 = null;
                }
                f.b(a1, motionevent, motionevent1, f1, f2);
                return true;
            }
        }
        return false;
    }

    public void onLongPress(MotionEvent motionevent)
    {
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        boolean flag;
        boolean flag1;
        if ((e & 2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((e & 1) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        f.l();
        if (flag || flag1)
        {
            motionevent = a(f, (int)motionevent.getX(), (int)motionevent.getY(), CoordinateSystem.a);
            if (motionevent != null)
            {
                motionevent1 = motionevent.g();
                if (flag)
                {
                    a(motionevent.d(), -f1 / (float)motionevent1.width());
                }
                if (flag1)
                {
                    a(motionevent.e(), f2 / (float)motionevent1.height());
                }
                return true;
            }
        }
        return false;
    }

    public void onShowPress(MotionEvent motionevent)
    {
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        return false;
    }
}
