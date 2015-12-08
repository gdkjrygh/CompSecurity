// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.landing;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fitbit.activity.ui.charts.ActivityType;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.activity.ui.landing:
//            BabyChartFragment

public final class BabyChartFragment_ extends BabyChartFragment
    implements org.androidannotations.a.c.a, b
{
    public static class a
    {

        private Bundle a;

        public BabyChartFragment a()
        {
            BabyChartFragment_ babychartfragment_ = new BabyChartFragment_();
            babychartfragment_.setArguments(a);
            return babychartfragment_;
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


    public static final String f = "activityType";
    private final c g = new c();
    private View h;

    public BabyChartFragment_()
    {
    }

    private void a(Bundle bundle)
    {
        c.a(this);
        i();
    }

    public static a h()
    {
        return new a();
    }

    private void i()
    {
        Bundle bundle = getArguments();
        if (bundle != null && bundle.containsKey("activityType"))
        {
            a = (ActivityType)bundle.getSerializable("activityType");
        }
    }

    public void a(org.androidannotations.a.c.a a1)
    {
        c = a1.findViewById(0x7f110235);
        d = a1.findViewById(0x7f11006b);
        a1 = a1.findViewById(0x7f110232);
        if (a1 != null)
        {
            a1.setOnClickListener(new android.view.View.OnClickListener() {

                final BabyChartFragment_ a;

                public void onClick(View view)
                {
                    a.f();
                }

            
            {
                a = BabyChartFragment_.this;
                super();
            }
            });
        }
    }

    public View findViewById(int j)
    {
        if (h == null)
        {
            return null;
        } else
        {
            return h.findViewById(j);
        }
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = c.a(g);
        a(bundle);
        super.onCreate(bundle);
        c.a(c1);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        h = super.onCreateView(layoutinflater, viewgroup, bundle);
        if (h == null)
        {
            h = layoutinflater.inflate(0x7f04007f, viewgroup, false);
        }
        return h;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        g.a(this);
    }
}
