// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.alarm.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.alarm.ui:
//            AlarmFragment

public final class AlarmFragment_ extends AlarmFragment
    implements org.androidannotations.a.c.a, b
{
    public static class a
    {

        private Bundle a;

        public AlarmFragment a()
        {
            AlarmFragment_ alarmfragment_ = new AlarmFragment_();
            alarmfragment_.setArguments(a);
            return alarmfragment_;
        }

        public a a(String s)
        {
            a.putString("deviceAddress", s);
            return this;
        }

        private a()
        {
            a = new Bundle();
        }

    }


    public static final String p = "deviceAddress";
    private final c q = new c();
    private View r;

    public AlarmFragment_()
    {
    }

    private void a(Bundle bundle)
    {
        c.a(this);
        i();
        setHasOptionsMenu(true);
        d = com.fitbit.galileo.service.b.b(getActivity());
        e = com.fitbit.galileo.ui.sync.c.b(getActivity());
    }

    public static a h()
    {
        return new a();
    }

    private void i()
    {
        Bundle bundle = getArguments();
        if (bundle != null && bundle.containsKey("deviceAddress"))
        {
            f = bundle.getString("deviceAddress");
        }
    }

    public void a(org.androidannotations.a.c.a a1)
    {
        c = (Button)a1.findViewById(0x7f11023d);
        k = a1.findViewById(0x7f11023c);
        i = a1.findViewById(0x7f11006c);
        l = (TextView)a1.findViewById(0x7f11023f);
        h = a1.findViewById(0x1020004);
        j = a1.findViewById(0x7f11023b);
        o = a1.findViewById(0x7f110240);
        b = (Button)a1.findViewById(0x7f110446);
        n = a1.findViewById(0x7f11023e);
        g = (ListView)a1.findViewById(0x7f110086);
        View view = a1.findViewById(0x7f11023d);
        if (view != null)
        {
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final AlarmFragment_ a;

                public void onClick(View view1)
                {
                    a.e();
                }

            
            {
                a = AlarmFragment_.this;
                super();
            }
            });
        }
        view = a1.findViewById(0x7f110241);
        if (view != null)
        {
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final AlarmFragment_ a;

                public void onClick(View view1)
                {
                    a.f();
                }

            
            {
                a = AlarmFragment_.this;
                super();
            }
            });
        }
        a1 = a1.findViewById(0x7f110446);
        if (a1 != null)
        {
            a1.setOnClickListener(new android.view.View.OnClickListener() {

                final AlarmFragment_ a;

                public void onClick(View view1)
                {
                    a.g();
                }

            
            {
                a = AlarmFragment_.this;
                super();
            }
            });
        }
        a();
    }

    public View findViewById(int j)
    {
        if (r == null)
        {
            return null;
        } else
        {
            return r.findViewById(j);
        }
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = c.a(q);
        a(bundle);
        super.onCreate(bundle);
        c.a(c1);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f120002, menu);
        super.onCreateOptionsMenu(menu, menuinflater);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        r = super.onCreateView(layoutinflater, viewgroup, bundle);
        if (r == null)
        {
            r = layoutinflater.inflate(0x7f040082, viewgroup, false);
        }
        return r;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (super.onOptionsItemSelected(menuitem))
        {
            return true;
        }
        if (menuitem.getItemId() == 0x7f1104d3)
        {
            d();
            return true;
        } else
        {
            return false;
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        q.a(this);
    }
}
