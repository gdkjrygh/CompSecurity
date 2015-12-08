// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fitbit.galileo.service.b;
import java.util.Calendar;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.home.ui:
//            DashboardFragment

public final class DashboardFragment_ extends DashboardFragment
    implements org.androidannotations.a.c.a
{
    public static class a
    {

        private Bundle a;

        public DashboardFragment a()
        {
            DashboardFragment_ dashboardfragment_ = new DashboardFragment_();
            dashboardfragment_.setArguments(a);
            return dashboardfragment_;
        }

        public a a(Calendar calendar)
        {
            a.putSerializable("date", calendar);
            return this;
        }

        private a()
        {
            a = new Bundle();
        }

    }


    public static final String c = "date";
    private final c e = new c();
    private View f;

    public DashboardFragment_()
    {
    }

    private void a(Bundle bundle)
    {
        v();
        a = b.b(getActivity());
    }

    public static a n()
    {
        return new a();
    }

    private void v()
    {
        Bundle bundle = getArguments();
        if (bundle != null && bundle.containsKey("date"))
        {
            d = (Calendar)bundle.getSerializable("date");
        }
    }

    public View findViewById(int i)
    {
        if (f == null)
        {
            return null;
        } else
        {
            return f.findViewById(i);
        }
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = org.androidannotations.a.c.c.a(e);
        a(bundle);
        super.onCreate(bundle);
        org.androidannotations.a.c.c.a(c1);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        f = super.onCreateView(layoutinflater, viewgroup, bundle);
        return f;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        e.a(this);
    }
}
