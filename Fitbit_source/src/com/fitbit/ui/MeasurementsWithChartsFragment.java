// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.artfulbits.aiCharts.ChartView;
import com.fitbit.customui.viewpager.FitBitCircledViewPager;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.fitbit.ui:
//            BaseMeasurementsFragment

public abstract class MeasurementsWithChartsFragment extends BaseMeasurementsFragment
{
    public static interface a
    {

        public abstract boolean a();

        public abstract int b();
    }


    protected SparseArray a;
    protected SparseArray b;
    protected ProgressBar c;
    protected ListView d;
    protected View e;
    protected FitBitCircledViewPager f;
    protected TextView g;
    protected View h;
    protected View i;
    private String j;
    private Handler k;
    private Runnable l;
    private Map m;
    private SparseBooleanArray n;

    public MeasurementsWithChartsFragment()
    {
        a = new SparseArray();
        b = new SparseArray();
        k = new Handler();
        l = new _cls1();
        m = new HashMap();
        n = new SparseBooleanArray(p().length);
    }

    static Map a(MeasurementsWithChartsFragment measurementswithchartsfragment)
    {
        return measurementswithchartsfragment.m;
    }

    static SparseBooleanArray b(MeasurementsWithChartsFragment measurementswithchartsfragment)
    {
        return measurementswithchartsfragment.n;
    }

    static String c(MeasurementsWithChartsFragment measurementswithchartsfragment)
    {
        return measurementswithchartsfragment.j;
    }

    protected abstract String a(int i1);

    protected abstract void a(ChartView chartview, int i1);

    protected void a(String s)
    {
        j = s;
        l();
    }

    protected void a(String s, int i1)
    {
        String s1 = (String)a.get(i1);
        if (s1 == s || s1 != null && s1.equals(s))
        {
            return;
        } else
        {
            a.put(i1, s);
            l();
            return;
        }
    }

    protected void a(boolean flag)
    {
        if (c != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        c.setVisibility(0);
        if (f != null)
        {
            f.setVisibility(4);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        c.setVisibility(4);
        if (f != null)
        {
            f.setVisibility(0);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    protected void a(boolean flag, a a1)
    {
        if (!a1.a())
        {
            return;
        } else
        {
            m.put(Integer.valueOf(a1.b()), Boolean.valueOf(flag));
            l();
            return;
        }
    }

    protected abstract void b(ChartView chartview, int i1);

    protected void b(String s, int i1)
    {
        String s1 = (String)b.get(i1);
        if (s1 == s || s1 != null && s1.equals(s))
        {
            return;
        } else
        {
            b.put(i1, s);
            l();
            return;
        }
    }

    protected void b(boolean flag, a a1)
    {
        if (a1.a())
        {
            int i1 = a1.b();
            a1 = Boolean.valueOf(n.get(i1));
            if ((flag || a1 != null && a1.booleanValue()) && (!flag || a1 == null || !a1.booleanValue()))
            {
                n.put(i1, flag);
                l();
                return;
            }
        }
    }

    protected int c()
    {
        return 0x7f0400b6;
    }

    protected void j()
    {
        i = View.inflate(getActivity(), 0x7f04018b, null);
        h = View.inflate(getActivity(), m(), null);
        d.addHeaderView(i, null, false);
        d.addFooterView(h, null, false);
        f = (FitBitCircledViewPager)h.findViewById(0x7f1102af);
        c = (ProgressBar)h.findViewById(0x102000d);
    /* block-local class not found */
    class b {}

        if (f != null)
        {
            f.a(new b(getActivity()));
        }
    }

    public boolean k()
    {
        return false;
    }

    public void l()
    {
        k.removeCallbacks(l);
        k.post(l);
    }

    protected int m()
    {
        return 0x7f04018a;
    }

    protected void n()
    {
        Intent intent = new Intent(getActivity(), o());
        intent.addFlags(0x20010000);
        getActivity().startActivity(intent);
        getActivity().overridePendingTransition(0, 0);
    }

    protected abstract Class o();

    protected abstract a[] p();

    /* member class not found */
    class _cls1 {}

}
