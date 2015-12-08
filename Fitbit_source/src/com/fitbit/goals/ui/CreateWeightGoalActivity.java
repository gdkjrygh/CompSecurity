// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.goals.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.fitbit.b.b;
import com.fitbit.customui.WeightPicker;
import com.fitbit.data.bl.gd;
import com.fitbit.data.bl.t;
import com.fitbit.data.domain.PendingPlan;
import com.fitbit.data.domain.WeightGoal;
import com.fitbit.data.domain.r;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.ui.s;
import com.fitbit.util.bh;
import com.fitbit.util.format.e;
import com.fitbit.weight.Weight;

// Referenced classes of package com.fitbit.goals.ui:
//            SelectPlanIntensityActivity, FoodGoalActivity

public class CreateWeightGoalActivity extends FitbitActivity
{

    private static final double a = 10D;
    private static final double b = 1500D;
    private static final String c = "com.fitbit.goals.ui.CreateWeightGoalActivity";
    private com.fitbit.data.domain.WeightLogEntry.WeightUnits d;
    private WeightGoal e;
    private PendingPlan f;
    private WeightPicker g;
    private WeightPicker h;
    private boolean i;

    public CreateWeightGoalActivity()
    {
    }

    public static void a(Context context, boolean flag)
    {
        Intent intent = new Intent(context, com/fitbit/goals/ui/CreateWeightGoalActivity);
        intent.putExtra("com.fitbit.goals.ui.CreateWeightGoalActivity", flag);
        context.startActivity(intent);
    }

    public static void a(Fragment fragment, boolean flag)
    {
        Intent intent = new Intent(fragment.getActivity(), com/fitbit/goals/ui/CreateWeightGoalActivity);
        intent.putExtra("com.fitbit.goals.ui.CreateWeightGoalActivity", flag);
        fragment.startActivity(intent);
    }

    static boolean a(CreateWeightGoalActivity createweightgoalactivity)
    {
        return createweightgoalactivity.g();
    }

    static com.fitbit.data.domain.WeightLogEntry.WeightUnits b(CreateWeightGoalActivity createweightgoalactivity)
    {
        return createweightgoalactivity.d;
    }

    static PendingPlan c(CreateWeightGoalActivity createweightgoalactivity)
    {
        return createweightgoalactivity.f;
    }

    static WeightGoal d(CreateWeightGoalActivity createweightgoalactivity)
    {
        return createweightgoalactivity.e;
    }

    static boolean e(CreateWeightGoalActivity createweightgoalactivity)
    {
        return createweightgoalactivity.i;
    }

    private void f()
    {
        TextView textview = (TextView)findViewById(0x7f1100d5);
        TextView textview1;
        if (i)
        {
            setTitle(0x7f080116);
            textview.setText(getString(0x7f080117));
            textview.setVisibility(0);
        } else
        {
            setTitle(0x7f080170);
            Weight weight = ((Weight)e.o()).a(d);
            textview.setText(Html.fromHtml(bh.a(this, 0x7f0804ec, new String[] {
                (new StringBuilder()).append(com.fitbit.util.format.e.a(weight.b(), 1)).append(" ").append(((com.fitbit.data.domain.WeightLogEntry.WeightUnits)weight.a()).getShortDisplayName()).toString()
            })));
        }
        textview = (TextView)findViewById(0x7f1100d6);
        textview1 = (TextView)findViewById(0x7f1100d9);
        if (i)
        {
            textview.setText(0x7f0804eb);
            textview1.setText(0x7f080142);
        }
        ((TextView)findViewById(0x7f1100da)).setText(Html.fromHtml(getString(0x7f08025b)));
    }

    private boolean g()
    {
        if (((Weight)g.g()).a(10D, 1500D, com.fitbit.data.domain.WeightLogEntry.WeightUnits.LBS) && ((Weight)h.g()).a(10D, 1500D, com.fitbit.data.domain.WeightLogEntry.WeightUnits.LBS))
        {
            return true;
        } else
        {
            Weight weight = new Weight(10D, com.fitbit.data.domain.WeightLogEntry.WeightUnits.LBS);
            Weight weight1 = new Weight(1500D, com.fitbit.data.domain.WeightLogEntry.WeightUnits.LBS);
            s.a(this, String.format(getString(0x7f080299), new Object[] {
                com.fitbit.b.b.a(weight, com.fitbit.data.domain.WeightLogEntry.WeightUnits.LBS).a(r.a()).toString(), com.fitbit.b.b.a(weight1, com.fitbit.data.domain.WeightLogEntry.WeightUnits.LBS).a(r.a()).toString()
            }), 1).i();
            return false;
        }
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        t.a().c();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040017);
        i = getIntent().getBooleanExtra("com.fitbit.goals.ui.CreateWeightGoalActivity", false);
        d = r.a();
        f = t.a().d();
        if (f == null)
        {
            f = new PendingPlan(d);
        }
        e = t.a().b();
        if (e == null)
        {
            e = new WeightGoal();
            e.b(new Weight(0.0D, com.fitbit.data.domain.WeightLogEntry.WeightUnits.GRAMS));
            e.a(new Weight(0.0D, com.fitbit.data.domain.WeightLogEntry.WeightUnits.GRAMS));
        }
        ((Button)findViewById(0x7f11008e)).setOnClickListener(new android.view.View.OnClickListener() {

            final CreateWeightGoalActivity a;

            public void onClick(View view)
            {
label0:
                {
                    if (CreateWeightGoalActivity.a(a))
                    {
                        view = gd.a().c().a(com.fitbit.goals.ui.CreateWeightGoalActivity.b(a)).c();
                        t.a().a(CreateWeightGoalActivity.c(a), view, CreateWeightGoalActivity.d(a));
                        if (!CreateWeightGoalActivity.c(a).f())
                        {
                            break label0;
                        }
                        SelectPlanIntensityActivity.a(a, com.fitbit.goals.ui.CreateWeightGoalActivity.e(a));
                    }
                    return;
                }
                FoodGoalActivity.a(a, com.fitbit.goals.ui.CreateWeightGoalActivity.e(a));
            }

            
            {
                a = CreateWeightGoalActivity.this;
                super();
            }
        });
        g = (WeightPicker)findViewById(0x7f1100d7);
        g.f();
        h = (WeightPicker)findViewById(0x7f1100d8);
        h.f();
        Weight weight = gd.a().c();
        bundle = weight;
        if (weight.b() < 0.001D)
        {
            bundle = gd.a().d();
        }
        bundle = bundle.a(d);
        g.a(bundle.c());
        weight = ((Weight)e.j()).a(d).c();
        h.a(weight);
        f.a(bundle, weight);
        if (i)
        {
            f.c(bundle.c());
        } else
        {
            f.c(((Weight)e.o()).a(d).c());
        }
        g.a(new com.fitbit.customui.MeasurablePicker.a() {

            final CreateWeightGoalActivity a;

            public void a(Weight weight1)
            {
                CreateWeightGoalActivity.c(a).a(weight1);
                if (com.fitbit.goals.ui.CreateWeightGoalActivity.e(a))
                {
                    CreateWeightGoalActivity.c(a).c(weight1);
                }
            }

            public volatile void a(Object obj)
            {
                a((Weight)obj);
            }

            
            {
                a = CreateWeightGoalActivity.this;
                super();
            }
        });
        h.a(new com.fitbit.customui.MeasurablePicker.a() {

            final CreateWeightGoalActivity a;

            public void a(Weight weight1)
            {
                CreateWeightGoalActivity.c(a).b(weight1);
            }

            public volatile void a(Object obj)
            {
                a((Weight)obj);
            }

            
            {
                a = CreateWeightGoalActivity.this;
                super();
            }
        });
        f();
    }
}
