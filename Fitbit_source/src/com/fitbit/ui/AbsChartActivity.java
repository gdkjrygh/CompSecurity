// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import com.fitbit.util.ar;
import com.fitbit.util.chart.a;
import com.fitbit.util.service.b;
import com.fitbit.weight.ui.AbsChartFragment;
import java.util.Date;
import java.util.UUID;

// Referenced classes of package com.fitbit.ui:
//            FitbitActivity, CustomTextView

public abstract class AbsChartActivity extends FitbitActivity
    implements com.fitbit.util.ar.a
{
    private static class a extends Handler
    {

        public static final int a = 999;
        private AbsChartActivity b;

        public void handleMessage(Message message)
        {
            if (message.what == 999)
            {
                b.a((com.fitbit.data.bl.SyncDataForLongPeriodOperation.Ranges)message.obj);
                return;
            } else
            {
                super.handleMessage(message);
                return;
            }
        }

        public a(AbsChartActivity abschartactivity)
        {
            b = abschartactivity;
        }
    }


    public static final String h = "com.fitbit.activity.ui.AbsChartActivity.EXTRA_REQUESTED_FRAGMENT";
    private Spinner a;
    private TextView b;
    private TextView c;
    private TextView d;
    private ar e;
    private int f;
    private com.fitbit.util.chart.Filter.Type g;
    protected a i;
    protected RadioGroup j;
    protected Date k;
    protected Date l;
    protected UUID m;
    private int n;
    private Runnable o;

    public AbsChartActivity()
    {
        o = new Runnable() {

            final AbsChartActivity a;

            public void run()
            {
                a.b();
            }

            
            {
                a = AbsChartActivity.this;
                super();
            }
        };
    }

    static int a(AbsChartActivity abschartactivity, int i1)
    {
        abschartactivity.n = i1;
        return i1;
    }

    static void a(AbsChartActivity abschartactivity, com.fitbit.data.bl.SyncDataForLongPeriodOperation.Ranges ranges)
    {
        abschartactivity.b(ranges);
    }

    static com.fitbit.data.bl.SyncDataForLongPeriodOperation.Ranges b(AbsChartActivity abschartactivity, int i1)
    {
        return abschartactivity.l(i1);
    }

    private void b(com.fitbit.data.bl.SyncDataForLongPeriodOperation.Ranges ranges)
    {
        i.removeMessages(999);
        i.sendMessageDelayed(i.obtainMessage(999, ranges), 1000L);
    }

    private com.fitbit.data.bl.SyncDataForLongPeriodOperation.Ranges l(int i1)
    {
        switch (i1)
        {
        default:
            return com.fitbit.data.bl.SyncDataForLongPeriodOperation.Ranges.a;

        case 2131820672: 
            return com.fitbit.data.bl.SyncDataForLongPeriodOperation.Ranges.b;

        case 2131820673: 
            return com.fitbit.data.bl.SyncDataForLongPeriodOperation.Ranges.d;
        }
    }

    protected abstract int a(int i1, com.fitbit.util.chart.Filter.Type type);

    protected abstract void a(ArrayAdapter arrayadapter);

    protected abstract void a(com.fitbit.data.bl.SyncDataForLongPeriodOperation.Ranges ranges);

    protected void a(Date date, Date date1, com.fitbit.util.chart.Filter.Type type)
    {
        k = date;
        l = date1;
        g = type;
        n();
    }

    public void a(UUID uuid)
    {
        m = uuid;
    }

    protected abstract int b(int i1, com.fitbit.util.chart.Filter.Type type);

    protected Date b(int i1)
    {
        return com.fitbit.util.chart.a.a(com.fitbit.util.chart.Filter.Type.q, new Date());
    }

    protected void b()
    {
        Object obj = getString(a(a.getSelectedItemPosition(), g));
        if (b != null)
        {
            b.setText(((CharSequence) (obj)));
        }
        int i1 = b(a.getSelectedItemPosition(), g);
        if (b != null)
        {
            b.setVisibility(i1);
        }
        if (c != null)
        {
            c.setVisibility(i1);
            if (i1 == 4)
            {
                c.setText("");
            }
        }
        obj = (RadioButton)findViewById(0x7f11007d);
        if (obj != null)
        {
            ((RadioButton) (obj)).setText(0x7f080132);
        }
        obj = (RadioButton)findViewById(0x7f11007e);
        if (obj != null)
        {
            ((RadioButton) (obj)).setText(0x7f0805a3);
        }
        obj = (RadioButton)findViewById(0x7f11007f);
        if (obj != null)
        {
            ((RadioButton) (obj)).setText(0x7f0803e9);
        }
        obj = (RadioButton)findViewById(0x7f110080);
        if (obj != null)
        {
            ((RadioButton) (obj)).setText(0x7f0803ea);
        }
        obj = (RadioButton)findViewById(0x7f110081);
        if (obj != null)
        {
            ((RadioButton) (obj)).setText(0x7f0805b4);
        }
        obj = (AbsChartFragment)getSupportFragmentManager().findFragmentById(0x7f110076);
        if (obj != null)
        {
            ((AbsChartFragment) (obj)).a(k, l, g);
        }
    }

    protected abstract String c(int i1);

    protected abstract void d();

    protected abstract void d(int i1);

    protected abstract int e();

    protected abstract void e(int i1);

    protected abstract int f();

    protected abstract com.fitbit.util.chart.Filter.Type f(int i1);

    protected int g()
    {
        return 0x7f040090;
    }

    protected abstract Class g(int i1);

    protected int h(int i1)
    {
        switch (i1)
        {
        case 1: // '\001'
        default:
            return 0x7f11007e;

        case 0: // '\0'
            return 0x7f11007d;

        case 2: // '\002'
            return 0x7f11007f;

        case 3: // '\003'
            return 0x7f110080;

        case 4: // '\004'
            return 0x7f110081;
        }
    }

    public Spinner h()
    {
        return a;
    }

    protected int i(int i1)
    {
        switch (i1)
        {
        case 2131820669: 
        default:
            return 0;

        case 2131820670: 
            return 1;

        case 2131820671: 
            return 2;

        case 2131820672: 
            return 3;

        case 2131820673: 
            return 4;
        }
    }

    public TextView i()
    {
        return d;
    }

    public void j()
    {
    }

    protected void j(int i1)
    {
        Object obj;
        String s;
        FragmentManager fragmentmanager;
        FragmentTransaction fragmenttransaction;
        f = i1;
        fragmentmanager = getSupportFragmentManager();
        fragmenttransaction = fragmentmanager.beginTransaction();
        obj = fragmentmanager.findFragmentById(0x7f110076);
        if (obj != null)
        {
            fragmenttransaction.detach(((Fragment) (obj)));
        }
        s = c(i1);
        obj = fragmentmanager.findFragmentByTag(s);
        if (obj != null) goto _L2; else goto _L1
_L1:
        Object obj1 = g(i1);
        obj1 = (Fragment)((Class) (obj1)).newInstance();
        fragmenttransaction.add(0x7f110076, ((Fragment) (obj1)), s);
        obj = obj1;
_L3:
        int j1 = b(i1, g);
        obj1 = getString(a(i1, g));
        if (b != null)
        {
            b.setText(((CharSequence) (obj1)));
            b.setVisibility(j1);
        }
        if (c != null)
        {
            c.setVisibility(j1);
            if (j1 == 4)
            {
                c.setText("");
            }
        }
        if (obj instanceof AbsChartFragment)
        {
            ((AbsChartFragment)obj).a(c);
            ((AbsChartFragment)obj).b(d);
        }
        fragmenttransaction.setTransition(4099);
        fragmenttransaction.commitAllowingStateLoss();
        fragmentmanager.executePendingTransactions();
        b(l(n));
        return;
        obj1;
_L5:
        ((InstantiationException) (obj1)).printStackTrace();
          goto _L3
        obj1;
_L4:
        ((IllegalAccessException) (obj1)).printStackTrace();
          goto _L3
_L2:
        fragmenttransaction.attach(((Fragment) (obj)));
          goto _L3
        Object obj2;
        obj2;
        obj = obj1;
        obj1 = obj2;
          goto _L4
        obj2;
        obj = obj1;
        obj1 = obj2;
          goto _L5
    }

    public TextView k()
    {
        return b;
    }

    public TextView l()
    {
        return c;
    }

    public void l_()
    {
        if (j != null)
        {
            b(l(j.getCheckedRadioButtonId()));
        }
    }

    public int m()
    {
        return f;
    }

    protected void n()
    {
        i.removeCallbacks(o);
        i.post(o);
    }

    public com.fitbit.util.chart.Filter.Type o()
    {
        return g;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        com.fitbit.weight.ui.a.e();
        e = new ar(this);
        int i1 = getIntent().getIntExtra("com.fitbit.activity.ui.AbsChartActivity.EXTRA_REQUESTED_FRAGMENT", 0x7fffffff);
        setContentView(g());
        ((ImageButton)findViewById(0x7f110082)).setOnClickListener(new android.view.View.OnClickListener() {

            final AbsChartActivity a;

            public void onClick(View view)
            {
                a.onBackPressed();
            }

            
            {
                a = AbsChartActivity.this;
                super();
            }
        });
        bundle = getWindow().getAttributes();
        bundle.width = -1;
        bundle.height = -1;
        getWindow().setAttributes(bundle);
        getWindow().findViewById(0x1020002).setPadding(0, 0, 0, 0);
        c = (TextView)findViewById(0x7f11007a);
        b = (TextView)findViewById(0x7f1100fb);
        d = (TextView)findViewById(0x7f11007b);
        if (d != null && d.getEllipsize() == android.text.TextUtils.TruncateAt.MARQUEE)
        {
            d.setSelected(true);
        }
        if (c != null && c.getEllipsize() == android.text.TextUtils.TruncateAt.MARQUEE)
        {
            c.setSelected(true);
        }
        a = (Spinner)findViewById(0x7f110079);
        bundle = new ArrayAdapter(this, 0x7f040130) {

            final AbsChartActivity a;

            public View getView(int k1, View view, ViewGroup viewgroup)
            {
                if (getCount() <= k1)
                {
                    return null;
                } else
                {
                    view = (CustomTextView)super.getView(k1, view, viewgroup);
                    view.a(0x7f0f018b);
                    return view;
                }
            }

            
            {
                a = AbsChartActivity.this;
                super(context, i1);
            }
        };
        bundle.setDropDownViewResource(0x1090009);
        a(bundle);
        a.setAdapter(bundle);
        a.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final AbsChartActivity a;

            public void onItemSelected(AdapterView adapterview, View view, int k1, long l1)
            {
                a.j(k1);
                a.n();
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                a = AbsChartActivity.this;
                super();
            }
        });
        j = (RadioGroup)findViewById(0x7f11007c);
        j.setOnCheckedChangeListener(new android.widget.RadioGroup.OnCheckedChangeListener() {

            final AbsChartActivity a;

            public void onCheckedChanged(RadioGroup radiogroup, int k1)
            {
                com.fitbit.ui.AbsChartActivity.a(a, k1);
                radiogroup = a.f(k1);
                a.a(a.b(k1), new Date(), radiogroup);
                com.fitbit.ui.AbsChartActivity.a(a, com.fitbit.ui.AbsChartActivity.b(a, k1));
            }

            
            {
                a = AbsChartActivity.this;
                super();
            }
        });
        Spinner spinner;
        int j1;
        if (i1 == 0x7fffffff)
        {
            j1 = f();
        } else
        {
            j1 = 0;
        }
        if (i1 == 0x7fffffff)
        {
            i1 = e();
        }
        i = new a(this);
        getIntent().putExtra("com.fitbit.activity.ui.AbsChartActivity.EXTRA_REQUESTED_FRAGMENT", 0x7fffffff);
        j.check(h(j1));
        spinner = a;
        if (i1 >= bundle.getCount())
        {
            i1 = 0;
        }
        spinner.setSelection(i1);
    }

    protected void onDestroy()
    {
        p();
        if (i != null)
        {
            i.removeCallbacks(o);
            i.removeMessages(999);
        }
        com.fitbit.weight.ui.a.e();
        super.onDestroy();
    }

    protected void onPause()
    {
        super.onPause();
        e.b(this);
        if (a == null || j == null)
        {
            return;
        } else
        {
            d(a.getSelectedItemPosition());
            e(i(j.getCheckedRadioButtonId()));
            return;
        }
    }

    protected void onResume()
    {
        super.onResume();
        e.a(this, true);
    }

    protected void p()
    {
        if (m != null)
        {
            startService(com.fitbit.util.service.b.a(this, m));
        }
    }
}
