// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.landing;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fitbit.activity.ui.charts.ActivityType;
import com.fitbit.ui.endless.EndlessStickyHeadersListView;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.activity.ui.landing:
//            ActivityDaysListFragment

public final class ActivityDaysListFragment_ extends ActivityDaysListFragment
    implements org.androidannotations.a.c.a, b
{
    public static class a
    {

        private Bundle a;

        public ActivityDaysListFragment a()
        {
            ActivityDaysListFragment_ activitydayslistfragment_ = new ActivityDaysListFragment_();
            activitydayslistfragment_.setArguments(a);
            return activitydayslistfragment_;
        }

        public a a(ActivityType activitytype)
        {
            a.putSerializable("activityType", activitytype);
            return this;
        }

        private a()
        {
            a = new Bundle();
        }

    }


    public static final String c = "activityType";
    private final c h = new c();
    private View i;

    public ActivityDaysListFragment_()
    {
    }

    private void a(Bundle bundle)
    {
        org.androidannotations.a.c.c.a(this);
        d();
    }

    public static a c()
    {
        return new a();
    }

    private void d()
    {
        Bundle bundle = getArguments();
        if (bundle != null && bundle.containsKey("activityType"))
        {
            b = (ActivityType)bundle.getSerializable("activityType");
        }
    }

    public void a(org.androidannotations.a.c.a a1)
    {
        d = a1.findViewById(0x7f11006b);
        e = a1.findViewById(0x7f1100ea);
        f = (EndlessStickyHeadersListView)a1.findViewById(0x7f1101e2);
        l();
    }

    public View findViewById(int j)
    {
        if (i == null)
        {
            return null;
        } else
        {
            return i.findViewById(j);
        }
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = org.androidannotations.a.c.c.a(h);
        a(bundle);
        super.onCreate(bundle);
        org.androidannotations.a.c.c.a(c1);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        i = super.onCreateView(layoutinflater, viewgroup, bundle);
        if (i == null)
        {
            i = layoutinflater.inflate(0x7f0400a4, viewgroup, false);
        }
        return i;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        h.a(this);
    }
}
