// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.heartrate.details;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fitbit.heartrate.charts.views.IntradayHeartRateBabyChartView;
import java.util.Date;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.heartrate.details:
//            HeartRateDetailsHeaderFragment

public final class HeartRateDetailsHeaderFragment_ extends HeartRateDetailsHeaderFragment
    implements org.androidannotations.a.c.a, b
{
    public static class a
    {

        private Bundle a;

        public HeartRateDetailsHeaderFragment a()
        {
            HeartRateDetailsHeaderFragment_ heartratedetailsheaderfragment_ = new HeartRateDetailsHeaderFragment_();
            heartratedetailsheaderfragment_.setArguments(a);
            return heartratedetailsheaderfragment_;
        }

        public a a(Date date)
        {
            a.putSerializable("date", date);
            return this;
        }

        private a()
        {
            a = new Bundle();
        }

    }


    public static final String g = "date";
    private final c h = new c();
    private View i;

    public HeartRateDetailsHeaderFragment_()
    {
    }

    private void a(Bundle bundle)
    {
        c.a(this);
        e();
        setHasOptionsMenu(true);
    }

    public static a d()
    {
        return new a();
    }

    private void e()
    {
        Bundle bundle = getArguments();
        if (bundle != null && bundle.containsKey("date"))
        {
            a = (Date)bundle.getSerializable("date");
        }
    }

    public void a(org.androidannotations.a.c.a a1)
    {
        c = a1.findViewById(0x7f110235);
        b = a1.findViewById(0x7f11006c);
        f = (IntradayHeartRateBabyChartView)a1.findViewById(0x7f110239);
        e = (TextView)a1.findViewById(0x7f110238);
        d = a1.findViewById(0x7f11006b);
        a1 = a1.findViewById(0x7f11006c);
        if (a1 != null)
        {
            a1.setOnClickListener(new android.view.View.OnClickListener() {

                final HeartRateDetailsHeaderFragment_ a;

                public void onClick(View view)
                {
                    a.b();
                }

            
            {
                a = HeartRateDetailsHeaderFragment_.this;
                super();
            }
            });
        }
        a();
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
        c c1 = c.a(h);
        a(bundle);
        super.onCreate(bundle);
        c.a(c1);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f120006, menu);
        super.onCreateOptionsMenu(menu, menuinflater);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        i = super.onCreateView(layoutinflater, viewgroup, bundle);
        if (i == null)
        {
            i = layoutinflater.inflate(0x7f0400a5, viewgroup, false);
        }
        return i;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (super.onOptionsItemSelected(menuitem))
        {
            return true;
        }
        if (menuitem.getItemId() == 0x7f1104d8)
        {
            c();
            return true;
        } else
        {
            return false;
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        h.a(this);
    }
}
