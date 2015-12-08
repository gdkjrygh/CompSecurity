// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.water.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import com.fitbit.customui.WaterEditText;
import com.fitbit.customui.WaterQuickAddSelector;
import com.fitbit.data.bl.gb;
import com.fitbit.data.domain.WaterLogEntry;
import com.fitbit.data.domain.r;
import com.fitbit.e.a;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.ui.s;
import com.fitbit.util.bt;
import com.fitbit.util.f;
import com.fitbit.util.o;
import com.fitbit.water.Water;
import java.util.Date;

public class AddWaterActivity extends FitbitActivity
{

    public static final String a = "date";
    public static final String b = "wle";
    public static final String c = "bundle";
    private static final String g = com/fitbit/water/ui/AddWaterActivity.getName();
    private static final int h = 2;
    private static final int i = -1;
    long d;
    Menu e;
    protected Spinner f;
    private Date j;
    private WaterEditText k;
    private WaterQuickAddSelector l;
    private Water m;
    private com.fitbit.data.domain.WaterLogEntry.WaterUnits n;
    private boolean o;
    private Handler p;
    private Runnable q;

    public AddWaterActivity()
    {
        d = -1L;
        o = true;
        q = new Runnable() {

            final AddWaterActivity a;

            public void run()
            {
                AddWaterActivity.b(a).b(bt.a(com.fitbit.water.ui.AddWaterActivity.a(a).b(), 2));
                a.e.findItem(0x7f1104e9).setEnabled(true);
                a.f.setEnabled(true);
                AddWaterActivity.c(a).removeCallbacks(this);
            }

            
            {
                a = AddWaterActivity.this;
                super();
            }
        };
    }

    public static Intent a(Context context, WaterLogEntry waterlogentry)
    {
        context = new Intent(context, com/fitbit/water/ui/AddWaterActivity);
        Bundle bundle = new Bundle();
        bundle.putParcelable("wle", waterlogentry);
        context.putExtra("bundle", bundle);
        return context;
    }

    static com.fitbit.data.domain.WaterLogEntry.WaterUnits a(AddWaterActivity addwateractivity, com.fitbit.data.domain.WaterLogEntry.WaterUnits waterunits)
    {
        addwateractivity.n = waterunits;
        return waterunits;
    }

    static Water a(AddWaterActivity addwateractivity)
    {
        return addwateractivity.m;
    }

    static Water a(AddWaterActivity addwateractivity, Water water)
    {
        addwateractivity.m = water;
        return water;
    }

    static boolean a(AddWaterActivity addwateractivity, boolean flag)
    {
        addwateractivity.o = flag;
        return flag;
    }

    static WaterEditText b(AddWaterActivity addwateractivity)
    {
        return addwateractivity.k;
    }

    static Handler c(AddWaterActivity addwateractivity)
    {
        return addwateractivity.p;
    }

    static com.fitbit.data.domain.WaterLogEntry.WaterUnits d(AddWaterActivity addwateractivity)
    {
        return addwateractivity.n;
    }

    static Runnable e(AddWaterActivity addwateractivity)
    {
        return addwateractivity.q;
    }

    static boolean f(AddWaterActivity addwateractivity)
    {
        return addwateractivity.o;
    }

    static WaterQuickAddSelector g(AddWaterActivity addwateractivity)
    {
        return addwateractivity.l;
    }

    static String g()
    {
        return g;
    }

    public void a(double d1)
    {
        m.a(d1);
    }

    protected void f()
    {
        ArrayAdapter arrayadapter = new ArrayAdapter(this, 0x7f0401a4);
        arrayadapter.setDropDownViewResource(0x1090009);
        com.fitbit.data.domain.WaterLogEntry.WaterUnits awaterunits[] = com.fitbit.data.domain.WaterLogEntry.WaterUnits.values();
        int j1 = awaterunits.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            arrayadapter.add(awaterunits[i1].getDisplayName());
        }

        f.setAdapter(arrayadapter);
        f.setSelection(n.ordinal());
        f.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final AddWaterActivity a;

            public void onItemSelected(AdapterView adapterview, View view, int k1, long l1)
            {
                if (!com.fitbit.water.ui.AddWaterActivity.f(a))
                {
                    if (!TextUtils.equals(AddWaterActivity.b(a).getText().toString(), ""))
                    {
                        com.fitbit.water.ui.AddWaterActivity.a(a, new Water(bt.a(AddWaterActivity.b(a).getText().toString()), AddWaterActivity.d(a)));
                        com.fitbit.water.ui.AddWaterActivity.a(a, com.fitbit.data.domain.WaterLogEntry.WaterUnits.values()[k1]);
                        com.fitbit.water.ui.AddWaterActivity.a(a, com.fitbit.water.ui.AddWaterActivity.a(a).a(AddWaterActivity.d(a)));
                        AddWaterActivity.b(a).b(bt.a(com.fitbit.water.ui.AddWaterActivity.a(a).b(), 2));
                        AddWaterActivity.g(a).a((com.fitbit.data.domain.WaterLogEntry.WaterUnits)com.fitbit.water.ui.AddWaterActivity.a(a).a());
                        return;
                    } else
                    {
                        com.fitbit.water.ui.AddWaterActivity.a(a, com.fitbit.data.domain.WaterLogEntry.WaterUnits.values()[k1]);
                        AddWaterActivity.g(a).a(AddWaterActivity.d(a));
                        return;
                    }
                } else
                {
                    com.fitbit.water.ui.AddWaterActivity.a(a, false);
                    return;
                }
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                a = AddWaterActivity.this;
                super();
            }
        });
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040006);
        p = new Handler();
        k = (WaterEditText)findViewById(0x7f110087);
        k.a(new com.fitbit.customui.WaterEditText.a() {

            final AddWaterActivity a;

            public void a()
            {
                String s1 = AddWaterActivity.b(a).getText().toString();
                if (s1.contains("+"))
                {
                    return;
                }
                try
                {
                    a.a(bt.a(s1));
                    return;
                }
                catch (NumberFormatException numberformatexception)
                {
                    com.fitbit.e.a.f(AddWaterActivity.g(), "Error converting double from String.", numberformatexception, new Object[0]);
                }
                a.a(0.0D);
            }

            
            {
                a = AddWaterActivity.this;
                super();
            }
        });
        n = r.e();
        m = new Water(0.0D, n);
        bundle = getIntent();
        if (bundle.getParcelableExtra("bundle") == null) goto _L2; else goto _L1
_L1:
        setTitle(getResources().getString(0x7f08004f));
        bundle = (WaterLogEntry)bundle.getBundleExtra("bundle").getParcelable("wle");
        m = bundle.e();
        j = bundle.getLogDate();
        d = bundle.getEntityId().longValue();
        k.b(bt.a(m.b(), 2));
_L4:
        f = (Spinner)findViewById(0x7f110088);
        f();
        l = (WaterQuickAddSelector)findViewById(0x7f11008a);
        l.a(n);
        l.a(new com.fitbit.customui.WaterQuickAddSelector.a() {

            final AddWaterActivity a;

            public void a(Water water)
            {
                if (com.fitbit.water.ui.AddWaterActivity.a(a).b() == 0.0D || AddWaterActivity.b(a).getText().toString().isEmpty())
                {
                    com.fitbit.water.ui.AddWaterActivity.a(a, water.a(AddWaterActivity.d(a)));
                    AddWaterActivity.b(a).b(bt.a(com.fitbit.water.ui.AddWaterActivity.a(a).b(), 2));
                    return;
                } else
                {
                    double d1 = water.a(AddWaterActivity.d(a)).b();
                    com.fitbit.water.ui.AddWaterActivity.a(a).a(com.fitbit.water.ui.AddWaterActivity.a(a).b() + d1);
                    AddWaterActivity.b(a).a(bt.a(d1, 2));
                    a.e.findItem(0x7f1104e9).setEnabled(false);
                    a.f.setEnabled(false);
                    AddWaterActivity.c(a).postDelayed(AddWaterActivity.e(a), 1000L);
                    return;
                }
            }

            
            {
                a = AddWaterActivity.this;
                super();
            }
        });
        return;
_L2:
        long l1 = bundle.getLongExtra("date", 1L);
        j = new Date(l1);
        if (l1 == 1L)
        {
            j = com.fitbit.util.o.b();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f120014, menu);
        e = menu;
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 2131821801: 
            break;
        }
        if (m.b() == 0.0D)
        {
            s.a(this, 0x7f0803e5, 0).i();
            return true;
        }
        m = new Water(bt.a(k.getText().toString()), n);
        menuitem = new WaterLogEntry();
        menuitem.a(m);
        menuitem.setLogDate(j);
        if (d != -1L)
        {
            menuitem.setEntityId(Long.valueOf(d));
        }
        com.fitbit.util.f.a(new com.fitbit.util.f.a(this, menuitem) {

            final WaterLogEntry a;
            final AddWaterActivity b;

            public void a(Activity activity)
            {
                gb.a().a(a, activity);
                r.a((com.fitbit.data.domain.WaterLogEntry.WaterUnits)com.fitbit.water.ui.AddWaterActivity.a(b).a());
            }

            public void a(Object obj)
            {
                b((Activity)obj);
            }

            public void b(Activity activity)
            {
                b.finish();
            }

            public void b(Object obj)
            {
                a((Activity)obj);
            }

            
            {
                b = AddWaterActivity.this;
                a = waterlogentry;
                super(activity);
            }
        });
        return true;
    }

}
