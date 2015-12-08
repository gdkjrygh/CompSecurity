// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.charts;


// Referenced classes of package com.fitbit.ui.charts:
//            ChartFragment, InteractiveChartView

public abstract class InteractiveChartFragment extends ChartFragment
{

    public InteractiveChartFragment()
    {
    }

    protected abstract InteractiveChartView j();

    public void onPause()
    {
        super.onPause();
        j().d();
    }

    protected void u_()
    {
        super.u_();
        j().a(this);
        j().a(this);
    }
}
