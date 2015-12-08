// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.goals.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.fitbit.FitBitApplication;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.as;
import com.fitbit.data.bl.gd;
import com.fitbit.data.bl.t;
import com.fitbit.data.domain.DietPlan;
import com.fitbit.data.domain.PendingPlan;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.WeightGoal;
import com.fitbit.data.domain.r;
import com.fitbit.home.ui.HomeActivity;
import com.fitbit.home.ui.Text4View;
import com.fitbit.home.ui.b;
import com.fitbit.home.ui.g;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.util.bh;
import com.fitbit.util.bq;
import com.fitbit.util.format.e;
import com.fitbit.util.format.f;
import com.fitbit.weight.Weight;

// Referenced classes of package com.fitbit.goals.ui:
//            CreateWeightGoalActivity

public class PlanSummaryActivity extends FitbitActivity
    implements android.view.View.OnClickListener
{

    private static final String a = "com.fitbit.goals.ui.PlanSummaryActivity.EXTRA_SETUP";
    private PendingPlan b;
    private g c;
    private boolean d;

    public PlanSummaryActivity()
    {
    }

    public static void a(Context context, boolean flag)
    {
        Intent intent = new Intent(context, com/fitbit/goals/ui/PlanSummaryActivity);
        intent.putExtra("com.fitbit.goals.ui.PlanSummaryActivity.EXTRA_SETUP", flag);
        context.startActivity(intent);
    }

    private void f()
    {
        Text4View text4view;
        Object obj;
        Object obj1;
        View view;
        Object obj2;
        View view1;
        int i;
        int j;
        int k;
        text4view = (Text4View)findViewById(0x7f110197);
        obj1 = r.a();
        obj = b.o().a(((com.fitbit.data.domain.WeightLogEntry.WeightUnits) (obj1)));
        text4view.b(com.fitbit.util.format.f.a(FitBitApplication.a(), ((Weight) (obj))));
        obj = b.p().a(((com.fitbit.data.domain.WeightLogEntry.WeightUnits) (obj1)));
        text4view.d(com.fitbit.util.format.f.a(FitBitApplication.a(), ((Weight) (obj))));
        view = findViewById(0x7f110198);
        obj2 = findViewById(0x7f11019e);
        view1 = findViewById(0x7f11019d);
        obj = (TextView)findViewById(0x7f110196);
        DietPlan dietplan = b.a();
        if (dietplan.d() == com.fitbit.data.domain.DietPlan.IntensityLevel.MAINTENANCE)
        {
            break MISSING_BLOCK_LABEL_483;
        }
        view.setVisibility(0);
        ((View) (obj2)).setVisibility(8);
        view1.setVisibility(8);
        obj2 = (Text4View)findViewById(0x7f11019a);
        ((Text4View) (obj2)).b(dietplan.d().toString());
        ((Text4View) (obj2)).d(com.fitbit.util.format.f.a(FitBitApplication.a(), dietplan.a().a(((com.fitbit.data.domain.WeightLogEntry.WeightUnits) (obj1)))));
        obj1 = (Text4View)findViewById(0x7f11019c);
        long l = b.m() / 7;
        static class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[com.fitbit.data.domain.DietPlan.IntensityLevel.values().length];
                try
                {
                    a[com.fitbit.data.domain.DietPlan.IntensityLevel.EASIER.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.fitbit.data.domain.DietPlan.IntensityLevel.MEDIUM.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.fitbit.data.domain.DietPlan.IntensityLevel.KINDA_HARD.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.fitbit.data.domain.DietPlan.IntensityLevel.HARDER.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        if (l == 1L)
        {
            i = 0x7f08058d;
        } else
        {
            i = 0x7f080228;
        }
        ((Text4View) (obj1)).b(i, new Object[] {
            Long.valueOf(l)
        });
        ((Text4View) (obj1)).d(e.e(dietplan.c()));
        k = -1;
        j = -1;
        i = -1;
        obj1 = getResources();
        _cls3.a[dietplan.d().ordinal()];
        JVM INSTR tableswitch 1 4: default 300
    //                   1 385
    //                   2 408
    //                   3 431
    //                   4 454;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_454;
_L6:
        if (j != -1)
        {
            ((Text4View) (obj2)).a(j);
            ((Text4View) (obj2)).c(j);
            ((Text4View) (obj2)).b(i);
            ((Text4View) (obj2)).d(i);
        }
        obj1 = view.findViewById(0x7f110199);
        if (k != -1)
        {
            bq.a(((View) (obj1)), k);
        }
        if (d)
        {
            text4view.a(0x7f0804eb, new Object[0]);
            ((TextView) (obj)).setVisibility(8);
            return;
        } else
        {
            a(((TextView) (obj)));
            return;
        }
_L2:
        k = 0x7f02031e;
        j = ((Resources) (obj1)).getColor(0x7f0f0088);
        i = ((Resources) (obj1)).getColor(0x7f0f0087);
          goto _L6
_L3:
        k = 0x7f020322;
        j = ((Resources) (obj1)).getColor(0x7f0f00f7);
        i = ((Resources) (obj1)).getColor(0x7f0f00f6);
          goto _L6
_L4:
        k = 0x7f020321;
        j = ((Resources) (obj1)).getColor(0x7f0f00e5);
        i = ((Resources) (obj1)).getColor(0x7f0f00e4);
          goto _L6
        k = 0x7f02031f;
        j = ((Resources) (obj1)).getColor(0x7f0f00c0);
        i = ((Resources) (obj1)).getColor(0x7f0f00bf);
          goto _L6
        byte byte0;
        if (d)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        ((TextView) (obj)).setVisibility(byte0);
        if (d)
        {
            text4view.a(0x7f0804eb, new Object[0]);
        }
        view.setVisibility(8);
        ((View) (obj2)).setVisibility(0);
        view1.setVisibility(0);
        a(((TextView) (obj)));
        return;
    }

    protected void a(TextView textview)
    {
        Object obj = r.a();
        obj = b.q().a(((com.fitbit.data.domain.WeightLogEntry.WeightUnits) (obj)));
        textview.setText(Html.fromHtml(bh.a(this, 0x7f0804ec, new String[] {
            com.fitbit.util.format.f.a(FitBitApplication.a(), ((Weight) (obj)))
        })));
    }

    protected void c()
    {
        if (!c.l())
        {
            c.a(as.a(this));
        }
    }

    public void onClick(View view)
    {
        if (d)
        {
            c();
            return;
        } else
        {
            CreateWeightGoalActivity.a(this, true);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f04003e);
        d = getIntent().getBooleanExtra("com.fitbit.goals.ui.PlanSummaryActivity.EXTRA_SETUP", d);
        bundle = (Button)findViewById(0x7f11019f);
        bundle.setOnClickListener(this);
        com.fitbit.data.domain.WeightLogEntry.WeightUnits weightunits;
        int i;
        if (d)
        {
            i = 0x7f0800a0;
        } else
        {
            i = 0x7f080173;
        }
        bundle.setText(i);
        weightunits = r.a();
        b = t.a().d();
        if (b == null || !d)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (b == null)
        {
            b = new PendingPlan(weightunits);
        }
        if (i != 0)
        {
            WeightGoal weightgoal = t.a().b();
            Weight weight = gd.a().c();
            bundle = weight;
            if (weight.b() < 0.001D)
            {
                bundle = gd.a().d().a(weightunits);
            }
            b.a(bundle);
            b.c(((Weight)weightgoal.o()).a(weightunits).c());
            b.b(((Weight)weightgoal.j()).a(weightunits).c());
            bundle = an.a().b();
            if (bundle.a() == null)
            {
                bundle = com.fitbit.data.domain.DietPlan.IntensityLevel.MAINTENANCE;
            } else
            {
                bundle = bundle.a().d();
            }
            b.a(b.b(bundle));
        }
        f();
        c = new g(this, 46) {

            final PlanSummaryActivity a;

            public void a()
            {
                super.a();
                com.fitbit.mixpanel.f.c("FoodGoal: Created");
                HomeActivity.c(a);
            }

            
            {
                a = PlanSummaryActivity.this;
                super(fragmentactivity, i);
            }
        };
        c.a(new b(this, new com.fitbit.home.ui.b.a() {

            final PlanSummaryActivity a;

            public void a(b b1)
            {
                a.c();
            }

            
            {
                a = PlanSummaryActivity.this;
                super();
            }
        }));
    }
}
