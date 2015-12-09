// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.home.ui:
//            DashboardPagerFragment

public final class DashboardPagerFragment_ extends DashboardPagerFragment
    implements org.androidannotations.a.c.a
{
    public static class a
    {

        private Bundle a;

        public DashboardPagerFragment a()
        {
            DashboardPagerFragment_ dashboardpagerfragment_ = new DashboardPagerFragment_();
            dashboardpagerfragment_.setArguments(a);
            return dashboardpagerfragment_;
        }

        private a()
        {
            a = new Bundle();
        }

    }


    private final c f = new c();
    private View g;

    public DashboardPagerFragment_()
    {
    }

    private void a(Bundle bundle)
    {
    }

    public static a g()
    {
        return new a();
    }

    public View findViewById(int i)
    {
        if (g == null)
        {
            return null;
        } else
        {
            return g.findViewById(i);
        }
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = c.a(f);
        a(bundle);
        super.onCreate(bundle);
        c.a(c1);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        g = super.onCreateView(layoutinflater, viewgroup, bundle);
        return g;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        f.a(this);
    }
}
