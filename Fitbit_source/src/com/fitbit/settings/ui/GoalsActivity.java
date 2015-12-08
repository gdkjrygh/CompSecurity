// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.Toast;
import com.fitbit.analytics.core.a;
import com.fitbit.data.bl.SaveGoals;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.bl.t;
import com.fitbit.data.domain.BodyFatGoal;
import com.fitbit.data.domain.CaloriesBurnedGoal;
import com.fitbit.data.domain.DistanceGoal;
import com.fitbit.data.domain.FloorsGoal;
import com.fitbit.data.domain.Gender;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.SleepGoal;
import com.fitbit.data.domain.StepsGoal;
import com.fitbit.data.domain.ValueGoal;
import com.fitbit.data.domain.VeryActiveMinutesGoal;
import com.fitbit.data.domain.WaterGoal;
import com.fitbit.data.domain.WeightGoal;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.data.domain.device.DeviceType;
import com.fitbit.data.domain.r;
import com.fitbit.goals.ui.CreateWeightGoalActivity;
import com.fitbit.goals.ui.PlanSummaryActivity;
import com.fitbit.home.ui.g;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.ui.DecimalEditText;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.util.bf;
import com.fitbit.util.format.e;
import com.fitbit.util.p;
import com.fitbit.water.Water;
import com.fitbit.weight.Weight;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class GoalsActivity extends FitbitActivity
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.view.View.OnClickListener, android.view.View.OnFocusChangeListener
{
    public static class a
    {

        private StepsGoal a;
        private DistanceGoal b;
        private SleepGoal c;
        private CaloriesBurnedGoal d;
        private VeryActiveMinutesGoal e;
        private FloorsGoal f;
        private WaterGoal g;
        private WeightGoal h;
        private BodyFatGoal i;

        static BodyFatGoal a(a a1, BodyFatGoal bodyfatgoal)
        {
            a1.i = bodyfatgoal;
            return bodyfatgoal;
        }

        static CaloriesBurnedGoal a(a a1, CaloriesBurnedGoal caloriesburnedgoal)
        {
            a1.d = caloriesburnedgoal;
            return caloriesburnedgoal;
        }

        static DistanceGoal a(a a1, DistanceGoal distancegoal)
        {
            a1.b = distancegoal;
            return distancegoal;
        }

        static FloorsGoal a(a a1, FloorsGoal floorsgoal)
        {
            a1.f = floorsgoal;
            return floorsgoal;
        }

        static SleepGoal a(a a1, SleepGoal sleepgoal)
        {
            a1.c = sleepgoal;
            return sleepgoal;
        }

        static StepsGoal a(a a1)
        {
            return a1.a;
        }

        static StepsGoal a(a a1, StepsGoal stepsgoal)
        {
            a1.a = stepsgoal;
            return stepsgoal;
        }

        static VeryActiveMinutesGoal a(a a1, VeryActiveMinutesGoal veryactiveminutesgoal)
        {
            a1.e = veryactiveminutesgoal;
            return veryactiveminutesgoal;
        }

        static WaterGoal a(a a1, WaterGoal watergoal)
        {
            a1.g = watergoal;
            return watergoal;
        }

        static WeightGoal a(a a1, WeightGoal weightgoal)
        {
            a1.h = weightgoal;
            return weightgoal;
        }

        static CaloriesBurnedGoal b(a a1)
        {
            return a1.d;
        }

        static VeryActiveMinutesGoal c(a a1)
        {
            return a1.e;
        }

        static FloorsGoal d(a a1)
        {
            return a1.f;
        }

        static WaterGoal e(a a1)
        {
            return a1.g;
        }

        static DistanceGoal f(a a1)
        {
            return a1.b;
        }

        static WeightGoal g(a a1)
        {
            return a1.h;
        }

        static BodyFatGoal h(a a1)
        {
            return a1.i;
        }

        static SleepGoal i(a a1)
        {
            return a1.c;
        }

        public a()
        {
        }
    }

    private static class b extends bf
    {

        private final boolean a;
        private final boolean b;
        private final boolean c;
        private final boolean d;

        protected a a()
        {
            a a1 = new a();
            Date date = new Date();
            if (a)
            {
                com.fitbit.settings.ui.a.a(a1, (StepsGoal)com.fitbit.data.bl.t.a().a(com.fitbit.data.domain.Goal.GoalType.STEPS_GOAL, date));
            } else
            {
                com.fitbit.settings.ui.a.a(a1, null);
            }
            if (c)
            {
                com.fitbit.settings.ui.a.a(a1, (FloorsGoal)com.fitbit.data.bl.t.a().a(com.fitbit.data.domain.Goal.GoalType.FLOORS_GOAL, date));
            } else
            {
                com.fitbit.settings.ui.a.a(a1, null);
            }
            if (b)
            {
                com.fitbit.settings.ui.a.a(a1, (DistanceGoal)com.fitbit.data.bl.t.a().a(com.fitbit.data.domain.Goal.GoalType.DISTANCE_GOAL, date));
            } else
            {
                com.fitbit.settings.ui.a.a(a1, null);
            }
            if (d)
            {
                com.fitbit.settings.ui.a.a(a1, (VeryActiveMinutesGoal)com.fitbit.data.bl.t.a().a(com.fitbit.data.domain.Goal.GoalType.MINUTES_VERY_ACTIVE_GOAL, date));
            } else
            {
                com.fitbit.settings.ui.a.a(a1, null);
            }
            com.fitbit.settings.ui.a.a(a1, (CaloriesBurnedGoal)com.fitbit.data.bl.t.a().a(com.fitbit.data.domain.Goal.GoalType.CALORIES_BURNED_GOAL, date));
            com.fitbit.settings.ui.a.a(a1, com.fitbit.data.bl.t.a().g(date));
            com.fitbit.settings.ui.a.a(a1, (BodyFatGoal)com.fitbit.data.bl.t.a().a(com.fitbit.data.domain.Goal.GoalType.BODY_FAT_GOAL, date));
            com.fitbit.settings.ui.a.a(a1, com.fitbit.data.bl.t.a().b());
            com.fitbit.settings.ui.a.a(a1, com.fitbit.data.bl.t.a().h(date));
            return a1;
        }

        protected Object f_()
        {
            return a();
        }

        public b(Context context, boolean flag, boolean flag1, boolean flag2, boolean flag3)
        {
            super(context);
            a = flag;
            b = flag1;
            c = flag2;
            d = flag3;
        }
    }


    private static final String m = "GoalsActivity";
    private static final String n = "steps";
    private static final String o = "distance";
    private static final String p = "floors";
    private static final String q = "active_minutes";
    private static final double r = 5D;
    private static final double s = 75D;
    private static final double t = 0.0050000000000000001D;
    private static final double u = 0.050000000000000003D;
    private static final int v = 60;
    private boolean A;
    private TextView B;
    private TextView C;
    private TextView D;
    private TextView E;
    private TextView F;
    private TextView J;
    private TextView K;
    private TextView L;
    private TextView M;
    private TextView N;
    private View O;
    private View P;
    private g Q;
    private a R;
    boolean a;
    DecimalEditText b;
    DecimalEditText c;
    DecimalEditText d;
    Dialog e;
    com.fitbit.data.domain.Goal.GoalType f;
    ValueGoal g;
    boolean h;
    View i;
    double j;
    double k;
    double l;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public GoalsActivity()
    {
    }

    static View a(GoalsActivity goalsactivity)
    {
        return goalsactivity.O;
    }

    static View b(GoalsActivity goalsactivity)
    {
        return goalsactivity.P;
    }

    private void b(int i1)
    {
        double d1;
        StringBuilder stringbuilder;
        android.app.AlertDialog.Builder builder;
        byte byte0;
        byte0 = 8;
        stringbuilder = null;
        d1 = 0.0D;
        l = 0.0D;
        k = 0.0D;
        j = 0.0D;
        h = false;
        builder = new android.app.AlertDialog.Builder(this);
        i = getLayoutInflater().inflate(0x7f040079, null);
        d = (DecimalEditText)i.findViewById(0x7f110219);
        b = (DecimalEditText)i.findViewById(0x7f11021c);
        c = (DecimalEditText)i.findViewById(0x7f11021e);
        builder.setView(i);
        d.addTextChangedListener(new TextWatcher() {

            final GoalsActivity a;

            public void afterTextChanged(Editable editable)
            {
            }

            public void beforeTextChanged(CharSequence charsequence, int j1, int k1, int i2)
            {
            }

            public void onTextChanged(CharSequence charsequence, int j1, int k1, int i2)
            {
                try
                {
                    a.j = com.fitbit.util.format.e.a(charsequence.toString().trim());
                }
                // Misplaced declaration of an exception variable
                catch (CharSequence charsequence)
                {
                    a.j = 0.0D;
                }
                GoalsActivity.c(a);
            }

            
            {
                a = GoalsActivity.this;
                super();
            }
        });
        b.addTextChangedListener(new TextWatcher() {

            final GoalsActivity a;

            public void afterTextChanged(Editable editable)
            {
            }

            public void beforeTextChanged(CharSequence charsequence, int j1, int k1, int i2)
            {
            }

            public void onTextChanged(CharSequence charsequence, int j1, int k1, int i2)
            {
                try
                {
                    a.k = com.fitbit.util.format.e.a(charsequence.toString().trim());
                }
                // Misplaced declaration of an exception variable
                catch (CharSequence charsequence)
                {
                    a.k = 0.0D;
                }
                GoalsActivity.c(a);
            }

            
            {
                a = GoalsActivity.this;
                super();
            }
        });
        c.addTextChangedListener(new TextWatcher() {

            final GoalsActivity a;

            public void afterTextChanged(Editable editable)
            {
            }

            public void beforeTextChanged(CharSequence charsequence, int j1, int k1, int i2)
            {
            }

            public void onTextChanged(CharSequence charsequence, int j1, int k1, int i2)
            {
                try
                {
                    a.l = com.fitbit.util.format.e.a(charsequence.toString().trim());
                }
                // Misplaced declaration of an exception variable
                catch (CharSequence charsequence)
                {
                    a.l = 0.0D;
                }
                GoalsActivity.c(a);
            }

            
            {
                a = GoalsActivity.this;
                super();
            }
        });
        i1;
        JVM INSTR tableswitch 2131820804 2131820824: default 256
    //                   2131820804 459
    //                   2131820805 256
    //                   2131820806 522
    //                   2131820807 256
    //                   2131820808 603
    //                   2131820809 256
    //                   2131820810 667
    //                   2131820811 256
    //                   2131820812 731
    //                   2131820813 256
    //                   2131820814 256
    //                   2131820815 256
    //                   2131820816 256
    //                   2131820817 795
    //                   2131820818 256
    //                   2131820819 877
    //                   2131820820 256
    //                   2131820821 1193
    //                   2131820822 256
    //                   2131820823 256
    //                   2131820824 1321;
           goto _L1 _L2 _L1 _L3 _L1 _L4 _L1 _L5 _L1 _L6 _L1 _L1 _L1 _L1 _L7 _L1 _L8 _L1 _L9 _L1 _L1 _L10
_L10:
        break MISSING_BLOCK_LABEL_1321;
_L1:
        Object obj;
        Object obj1;
        obj = "";
        i1 = 0;
        obj1 = stringbuilder;
_L11:
        ((TextView)i.findViewById(0x7f11011f)).setText(((CharSequence) (obj)));
        double d2;
        Object obj2;
        long l1;
        if (obj1 == null)
        {
            i.findViewById(0x7f1100c1).setVisibility(8);
        } else
        {
            ((TextView)i.findViewById(0x7f1100c1)).setText(((CharSequence) (obj1)));
        }
        i.findViewById(0x7f1101db).setOnClickListener(this);
        i.findViewById(0x7f110222).setOnClickListener(this);
        i.findViewById(0x7f110221).setOnClickListener(this);
        b.setOnFocusChangeListener(this);
        c.setOnFocusChangeListener(this);
        if (i1 != 0)
        {
            i.findViewById(0x7f110221).setVisibility(0);
        } else
        {
            i.findViewById(0x7f110221).setVisibility(4);
        }
        obj = i.findViewById(0x7f11021b);
        if (h)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        ((View) (obj)).setVisibility(i1);
        obj = i.findViewById(0x7f110218);
        if (h)
        {
            i1 = byte0;
        } else
        {
            i1 = 0;
        }
        ((View) (obj)).setVisibility(i1);
        e = builder.show();
        (new Handler()).postDelayed(new Runnable() {

            final GoalsActivity a;

            public void run()
            {
                InputMethodManager inputmethodmanager = (InputMethodManager)a.getSystemService("input_method");
                if (a.h)
                {
                    inputmethodmanager.showSoftInput(a.b, 1);
                    a.b.requestFocus();
                    return;
                } else
                {
                    inputmethodmanager.showSoftInput(a.d, 1);
                    a.d.requestFocus();
                    return;
                }
            }

            
            {
                a = GoalsActivity.this;
                super();
            }
        }, 50L);
        return;
_L2:
        f = com.fitbit.data.domain.Goal.GoalType.STEPS_GOAL;
        g = com.fitbit.settings.ui.a.a(R);
        obj = getString(0x7f0804f1);
        d.b(0);
        d.setText(Integer.toString(g.p().intValue()));
        i1 = 0;
        obj1 = stringbuilder;
          goto _L11
_L3:
        f = com.fitbit.data.domain.Goal.GoalType.DISTANCE_GOAL;
        g = a.f(R);
        obj = getString(0x7f080163);
        obj1 = new Length(a.f(R).p().doubleValue(), com.fitbit.data.domain.Length.LengthUnits.KM);
        d.setText(com.fitbit.util.format.e.b(((Length) (obj1)).a(com.fitbit.data.domain.r.b()).b()));
        i1 = 0;
        obj1 = stringbuilder;
          goto _L11
_L4:
        f = com.fitbit.data.domain.Goal.GoalType.CALORIES_BURNED_GOAL;
        g = a.b(R);
        obj = getString(0x7f0800af);
        d.b(0);
        d.setText(Integer.toString(g.p().intValue()));
        i1 = 0;
        obj1 = stringbuilder;
          goto _L11
_L5:
        f = com.fitbit.data.domain.Goal.GoalType.MINUTES_VERY_ACTIVE_GOAL;
        g = a.c(R);
        obj = getString(0x7f080033);
        d.b(0);
        d.setText(Integer.toString(g.p().intValue()));
        i1 = 0;
        obj1 = stringbuilder;
          goto _L11
_L6:
        f = com.fitbit.data.domain.Goal.GoalType.FLOORS_GOAL;
        g = a.d(R);
        obj = getString(0x7f0801c8);
        d.b(0);
        d.setText(Integer.toString(g.p().intValue()));
        i1 = 0;
        obj1 = stringbuilder;
          goto _L11
_L7:
        f = com.fitbit.data.domain.Goal.GoalType.WATER_GOAL;
        g = com.fitbit.settings.ui.a.e(R);
        obj = getString(0x7f080583);
        obj1 = new Water(com.fitbit.settings.ui.a.e(R).p().doubleValue(), com.fitbit.data.domain.WaterLogEntry.WaterUnits.ML);
        d.setText(com.fitbit.util.format.e.b(((Water) (obj1)).a(com.fitbit.data.domain.r.e()).b()));
        i1 = 0;
        obj1 = stringbuilder;
          goto _L11
_L8:
        f = com.fitbit.data.domain.Goal.GoalType.WEIGHT_GOAL;
        g = null;
        obj1 = getString(0x7f080591);
        if (com.fitbit.settings.ui.a.g(R) != null)
        {
            obj = (Weight)com.fitbit.settings.ui.a.g(R).j();
        } else
        {
            obj = null;
        }
        if (com.fitbit.data.domain.r.a().hasChild())
        {
            h = true;
            b.b(0);
            c.b(0);
            i1 = com.fitbit.data.domain.r.a().getChildrenCount();
            c.d(i1 - 1);
            obj2 = com.fitbit.data.domain.r.a().getChild();
            if (obj != null)
            {
                l1 = Math.round(((Weight) (obj)).a(((com.fitbit.data.domain.WeightLogEntry.WeightUnits) (obj2))).b()) / (long)i1;
                d1 = ((Weight) (obj)).a(((com.fitbit.data.domain.WeightLogEntry.WeightUnits) (obj2))).b() - (double)((long)i1 * l1);
            } else
            {
                l1 = 0L;
            }
            ((TextView)i.findViewById(0x7f11021d)).setText(com.fitbit.data.domain.r.a().getShortDisplayName());
            ((TextView)i.findViewById(0x7f11021f)).setText(((com.fitbit.data.domain.WeightLogEntry.WeightUnits) (obj2)).getShortDisplayName());
            b.setText(String.valueOf(l1));
            c.setText(com.fitbit.util.format.e.e(d1));
            obj = obj1;
            i1 = 0;
            obj1 = stringbuilder;
        } else
        {
            if (obj != null)
            {
                obj2 = obj;
                if (!com.fitbit.data.domain.r.a().equals(((Weight) (obj)).a()))
                {
                    obj2 = ((Weight) (obj)).a(com.fitbit.data.domain.r.a());
                }
                d.setText(com.fitbit.util.format.e.a(((Weight) (obj2)).b()));
            } else
            {
                d.setText("0");
            }
            d.b(1);
            obj = obj1;
            i1 = 0;
            obj1 = stringbuilder;
        }
          goto _L11
_L9:
        f = com.fitbit.data.domain.Goal.GoalType.BODY_FAT_GOAL;
        g = a.h(R);
        obj = getString(0x7f080098);
        if (an.a().b().J() == Gender.MALE)
        {
            obj1 = getString(0x7f08009a);
        } else
        {
            obj1 = getString(0x7f080099);
        }
        d.d(100D);
        d.b(0);
        ((TextView)i.findViewById(0x7f11021a)).setText(" %");
        d.setText(com.fitbit.util.format.e.b(a.h(R).p().doubleValue()));
        i1 = 0;
          goto _L11
        f = com.fitbit.data.domain.Goal.GoalType.SLEEP_GOAL;
        g = a.i(R);
        obj = getString(0x7f080524);
        obj1 = getString(0x7f0804c5);
        h = true;
        b.d(23D);
        c.d(59D);
        b.b(0);
        c.b(0);
        ((TextView)i.findViewById(0x7f11021d)).setText(getString(0x7f080266));
        ((TextView)i.findViewById(0x7f11021f)).setText(getString(0x7f0803d6));
        obj2 = b;
        stringbuilder = new StringBuilder();
        if (a.i(R).p().doubleValue() == 0.0D)
        {
            d2 = 0.0D;
        } else
        {
            d2 = a.i(R).p().doubleValue() / 60D;
        }
        ((DecimalEditText) (obj2)).setText(stringbuilder.append((int)d2).append("").toString());
        obj2 = c;
        stringbuilder = new StringBuilder();
        if (a.i(R).p().doubleValue() != 0.0D)
        {
            d1 = a.i(R).p().doubleValue() % 60D;
        }
        ((DecimalEditText) (obj2)).setText(stringbuilder.append((int)d1).append("").toString());
        i1 = 1;
          goto _L11
    }

    static void c(GoalsActivity goalsactivity)
    {
        goalsactivity.i();
    }

    private void f()
    {
        if (an.a().b() != null)
        {
            boolean flag = com.fitbit.util.p.a(DeviceType.TRACKER);
            w = flag;
            x = flag;
            A = com.fitbit.util.p.a(DeviceFeature.SLEEP);
            z = com.fitbit.util.p.a(DeviceFeature.FLOORS);
            boolean flag1 = com.fitbit.util.p.n();
            if (flag && !flag1)
            {
                y = true;
            }
        }
    }

    private void g()
    {
        Object obj;
        String s1;
        Object obj2;
        if (com.fitbit.settings.ui.a.a(R) != null)
        {
            B.setText(Integer.toString(com.fitbit.settings.ui.a.a(R).p().intValue()));
            B.setText(NumberFormat.getIntegerInstance().format(com.fitbit.settings.ui.a.a(R).p().intValue()));
        }
        if (a.b(R) != null)
        {
            C.setText(Integer.toString(a.b(R).p().intValue()));
        }
        if (a.c(R) != null)
        {
            D.setText(Integer.toString(a.c(R).p().intValue()));
        }
        if (a.d(R) != null)
        {
            E.setText(Integer.toString(a.d(R).p().intValue()));
        }
        if (com.fitbit.settings.ui.a.e(R) != null)
        {
            Water water = new Water(com.fitbit.settings.ui.a.e(R).p().doubleValue(), com.fitbit.data.domain.WaterLogEntry.WaterUnits.ML);
            F.setText((new StringBuilder()).append(com.fitbit.util.format.e.b(water.a(com.fitbit.data.domain.r.e()).b())).append(" ").append(com.fitbit.data.domain.r.e().getFitbitName()).toString());
        }
        if (a.f(R) != null)
        {
            Length length = new Length(a.f(R).p().doubleValue(), com.fitbit.data.domain.Length.LengthUnits.KM);
            J.setText((new StringBuilder()).append(com.fitbit.util.format.e.b(length.a(com.fitbit.data.domain.r.b()).b())).append(" ").append(com.fitbit.data.domain.r.b().getDisplayName()).toString());
        }
        Object obj3;
        com.fitbit.data.domain.WeightLogEntry.WeightUnits weightunits;
        int i1;
        long l1;
        if (e())
        {
            i1 = 0x7f080170;
        } else
        {
            i1 = 0x7f080116;
        }
        K.setText(i1);
        obj3 = null;
        obj = "";
        obj2 = "";
        if (com.fitbit.settings.ui.a.g(R) != null)
        {
            Object obj1 = (Weight)com.fitbit.settings.ui.a.g(R).j();
            obj = obj1;
            if (!com.fitbit.data.domain.r.a().equals(((Weight) (obj1)).a()))
            {
                obj = ((Weight) (obj1)).a(com.fitbit.data.domain.r.a());
            }
            obj1 = com.fitbit.util.format.e.a(((Weight) (obj)).b());
            obj3 = obj;
            obj = obj1;
        }
        s1 = ((String) (obj2));
        if (!com.fitbit.data.domain.r.a().hasChild()) goto _L2; else goto _L1
_L1:
        weightunits = com.fitbit.data.domain.r.a().getChild();
        obj2 = weightunits.getShortDisplayName();
        i1 = com.fitbit.data.domain.r.a().getChildrenCount();
        s1 = ((String) (obj2));
        if (obj3 == null) goto _L2; else goto _L3
_L3:
        l1 = Math.round(((Weight) (obj3)).a(weightunits).b()) / (long)i1;
        s1 = com.fitbit.util.format.e.e(((Weight) (obj3)).a(weightunits).b() - (double)((long)i1 * l1));
        obj3 = String.valueOf(l1);
        obj = obj2;
        obj2 = obj3;
_L5:
label0:
        {
            obj3 = com.fitbit.data.domain.r.a().getShortDisplayName();
            obj = (new StringBuilder()).append(((String) (obj2))).append(" ").append(((String) (obj3))).append(" ").append(s1).append(" ").append(((String) (obj))).toString();
            if (com.fitbit.settings.ui.a.g(R) != null)
            {
                M.setText(((CharSequence) (obj)));
            } else
            {
                M.setText(getString(0x7f08023b));
            }
            if (a.h(R) != null && a.h(R).s() != null)
            {
                L.setText((new StringBuilder()).append(com.fitbit.util.format.e.b(a.h(R).p().doubleValue())).append(" %").toString());
            } else
            {
                L.setText(getString(0x7f08023b));
            }
            if (a.i(R) != null)
            {
                if (a.i(R).p().doubleValue() != 0.0D)
                {
                    break label0;
                }
                N.setText(getString(0x7f08023b));
            }
            return;
        }
        N.setText((new StringBuilder()).append((int)(a.i(R).p().doubleValue() / 60D)).append(" ").append(getString(0x7f080266)).append(" ").append((int)(a.i(R).p().doubleValue() % 60D)).append(" ").append(getString(0x7f0803d6)).toString());
        return;
_L2:
        String s2 = "";
        obj2 = obj;
        obj = s1;
        s1 = s2;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void h()
    {
        double d1;
        double d2;
        ArrayList arraylist;
        d1 = 0.0D;
        if (!ServerGateway.a().d())
        {
            Toast.makeText(this, getString(0x7f08018a), 0).show();
            finish();
        }
        d2 = j;
        arraylist = new ArrayList();
        if (f != com.fitbit.data.domain.Goal.GoalType.WEIGHT_GOAL) goto _L2; else goto _L1
_L1:
        if (j != 0.0D)
        {
            k = j;
        }
        com.fitbit.data.domain.WeightLogEntry.WeightUnits weightunits = com.fitbit.data.domain.r.a();
        if (weightunits.hasChild())
        {
            weightunits = weightunits.getChild();
        }
        d1 = (new Weight(k, com.fitbit.data.domain.r.a())).a(weightunits).b();
        l = (new Weight(l, weightunits)).b();
        d2 = d1 + l;
        Weight weight = new Weight(d2, weightunits);
        if (com.fitbit.data.domain.r.a().hasChild())
        {
            d1 = 0.5D;
        } else
        {
            d1 = 0.050000000000000003D;
        }
        if (com.fitbit.settings.ui.a.g(R) == null || !com.fitbit.util.an.a(((Weight)com.fitbit.settings.ui.a.g(R).j()).a(weightunits).b(), d2, d1))
        {
            arraylist.add(new com.fitbit.data.bl.SaveGoals.Goal(com.fitbit.data.domain.Goal.GoalType.WEIGHT_GOAL, weight.a(com.fitbit.data.domain.WeightLogEntry.WeightUnits.KG).b()));
            if (com.fitbit.settings.ui.a.g(R) == null)
            {
                com.fitbit.settings.ui.a.a(R, new WeightGoal());
            }
            com.fitbit.settings.ui.a.g(R).b(weight);
        }
_L4:
        Q.a(SaveGoals.a(this, (com.fitbit.data.bl.SaveGoals.Goal[])Arrays.copyOf(arraylist.toArray(), arraylist.size(), [Lcom/fitbit/data/bl/SaveGoals$Goal;)));
        g();
        e.dismiss();
        return;
_L2:
        if (f == com.fitbit.data.domain.Goal.GoalType.DISTANCE_GOAL)
        {
            Length length = (new Length(a.f(R).p().doubleValue(), com.fitbit.data.domain.Length.LengthUnits.KM)).a(com.fitbit.data.domain.r.c());
            Length length1 = new Length(d2, com.fitbit.data.domain.r.c());
            if (!com.fitbit.util.an.a(length.b(), length1.b(), 0.0050000000000000001D))
            {
                arraylist.add(new com.fitbit.data.bl.SaveGoals.Goal(f, d2));
                g.b(Double.valueOf(length1.a(com.fitbit.data.domain.Length.LengthUnits.KM).b()));
            }
        } else
        if (f == com.fitbit.data.domain.Goal.GoalType.WATER_GOAL)
        {
            Water water = (new Water(com.fitbit.settings.ui.a.e(R).p().doubleValue(), com.fitbit.data.domain.WaterLogEntry.WaterUnits.ML)).a(com.fitbit.data.domain.r.e());
            Water water1 = new Water(d2, com.fitbit.data.domain.r.e());
            if (!com.fitbit.util.an.a(water.b(), water1.b(), 0.0050000000000000001D))
            {
                arraylist.add(new com.fitbit.data.bl.SaveGoals.Goal(f, d2));
                g.b(Double.valueOf(water1.a(com.fitbit.data.domain.WaterLogEntry.WaterUnits.ML).b()));
            }
        } else
        if (f == com.fitbit.data.domain.Goal.GoalType.SLEEP_GOAL)
        {
            if (a)
            {
                a = false;
            } else
            {
                d1 = k * 60D + l;
            }
            arraylist.add(new com.fitbit.data.bl.SaveGoals.Goal(f, d1));
            g.b(Double.valueOf(d1));
        } else
        if (g.p().doubleValue() != d2)
        {
            arraylist.add(new com.fitbit.data.bl.SaveGoals.Goal(f, d2));
            g.b(Double.valueOf(d2));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void i()
    {
        TextView textview = (TextView)i.findViewById(0x7f110220);
        TextView textview1 = (TextView)i.findViewById(0x7f110222);
        if (j + k + l == 0.0D || f == com.fitbit.data.domain.Goal.GoalType.BODY_FAT_GOAL && (j < 5D || j > 75D))
        {
            d.getBackground().setColorFilter(getResources().getColor(0x7f0f0089), android.graphics.PorterDuff.Mode.SRC_IN);
            b.getBackground().setColorFilter(getResources().getColor(0x7f0f0089), android.graphics.PorterDuff.Mode.SRC_IN);
            c.getBackground().setColorFilter(getResources().getColor(0x7f0f0089), android.graphics.PorterDuff.Mode.SRC_IN);
            if (f == com.fitbit.data.domain.Goal.GoalType.BODY_FAT_GOAL)
            {
                textview.setText(String.format(getString(0x7f080184), new Object[] {
                    com.fitbit.util.format.e.e(5D), com.fitbit.util.format.e.e(75D)
                }));
            } else
            {
                textview.setText(getString(0x7f0805b6));
            }
            textview1.setTextColor(getResources().getColor(0x7f0f00e6));
            textview1.setOnClickListener(null);
            return;
        }
        d.getBackground().setColorFilter(getResources().getColor(0x7f0f015c), android.graphics.PorterDuff.Mode.SRC_IN);
        Drawable drawable = b.getBackground();
        Resources resources = getResources();
        int i1;
        if (b.isFocused())
        {
            i1 = 0x7f0f015c;
        } else
        {
            i1 = 0x7f0f00e6;
        }
        drawable.setColorFilter(resources.getColor(i1), android.graphics.PorterDuff.Mode.SRC_IN);
        drawable = c.getBackground();
        resources = getResources();
        if (c.isFocused())
        {
            i1 = 0x7f0f015c;
        } else
        {
            i1 = 0x7f0f00e6;
        }
        drawable.setColorFilter(resources.getColor(i1), android.graphics.PorterDuff.Mode.SRC_IN);
        textview.setText("");
        textview1.setTextColor(getResources().getColor(0x7f0f015c));
        textview1.setOnClickListener(this);
    }

    public void a(Loader loader, a a1)
    {
        R = a1;
        O.setVisibility(0);
        P.setVisibility(8);
        g();
    }

    protected boolean e()
    {
        return an.a().b().a() != null;
    }

    public void onClick(View view)
    {
        boolean flag = true;
        switch (view.getId())
        {
        default:
            b(view.getId());
            return;

        case 2131820815: 
            if (e())
            {
                PlanSummaryActivity.a(this, false);
                return;
            }
            if (e())
            {
                flag = false;
            }
            CreateWeightGoalActivity.a(this, flag);
            return;

        case 2131821019: 
            e.dismiss();
            return;

        case 2131821090: 
            h();
            return;

        case 2131821089: 
            break;
        }
        if (f == com.fitbit.data.domain.Goal.GoalType.SLEEP_GOAL)
        {
            a = true;
            h();
        }
        e.dismiss();
    }

    public void onCreate(Bundle bundle)
    {
        boolean flag = false;
        super.onCreate(bundle);
        setContentView(0x7f040025);
        f();
        bundle = getIntent().getExtras().getString("GOALS_GROUP");
        int i1;
        if (bundle.equals("activity"))
        {
            findViewById(0x7f110103).setVisibility(0);
            setTitle(0x7f08003b);
        } else
        if (bundle.equals("nutrition_and_body"))
        {
            findViewById(0x7f11010e).setVisibility(0);
            setTitle(0x7f08042d);
        } else
        if (bundle.equals("sleep"))
        {
            findViewById(0x7f110117).setVisibility(0);
            setTitle(0x7f0804c6);
        }
        O = findViewById(0x7f11006c);
        P = findViewById(0x7f110102);
        B = (TextView)findViewById(0x7f110105);
        J = (TextView)findViewById(0x7f110107);
        C = (TextView)findViewById(0x7f110109);
        D = (TextView)findViewById(0x7f11010b);
        E = (TextView)findViewById(0x7f11010d);
        F = (TextView)findViewById(0x7f110112);
        K = (TextView)findViewById(0x7f110110);
        M = (TextView)findViewById(0x7f110114);
        L = (TextView)findViewById(0x7f110116);
        N = (TextView)findViewById(0x7f110119);
        bundle = findViewById(0x7f110104);
        if (w)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        bundle.setVisibility(i1);
        bundle = findViewById(0x7f110106);
        if (x)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        bundle.setVisibility(i1);
        bundle = findViewById(0x7f11010c);
        if (z)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        bundle.setVisibility(i1);
        bundle = findViewById(0x7f11010a);
        if (y)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        bundle.setVisibility(i1);
        findViewById(0x7f110104).setOnClickListener(this);
        findViewById(0x7f110106).setOnClickListener(this);
        findViewById(0x7f110108).setOnClickListener(this);
        findViewById(0x7f11010a).setOnClickListener(this);
        findViewById(0x7f11010c).setOnClickListener(this);
        findViewById(0x7f11010f).setOnClickListener(this);
        findViewById(0x7f110111).setOnClickListener(this);
        findViewById(0x7f110113).setOnClickListener(this);
        findViewById(0x7f110115).setOnClickListener(this);
        findViewById(0x7f110118).setOnClickListener(this);
        Q = new g(this, 43) {

            final GoalsActivity a;

            public void a()
            {
                super.a();
            }

            
            {
                a = GoalsActivity.this;
                super(fragmentactivity, i1);
            }
        };
        Q.a(new com.fitbit.home.ui.b(this, null) {

            final GoalsActivity a;

            public void a(Exception exception)
            {
                g();
                com.fitbit.settings.ui.GoalsActivity.a(a).setVisibility(0);
                GoalsActivity.b(a).setVisibility(8);
                if ((exception instanceof ServerCommunicationException) && ((ServerCommunicationException)exception).f() == com.fitbit.data.bl.exceptions.ServerCommunicationException.ServerErrorType.a)
                {
                    Toast.makeText(a, exception.getMessage(), 1).show();
                    return;
                } else
                {
                    Toast.makeText(a, 0x7f08018e, 1).show();
                    return;
                }
            }

            
            {
                a = GoalsActivity.this;
                super(fragmentactivity, a1);
            }
        });
        bundle = new Bundle();
        bundle.putBoolean("steps", w);
        bundle.putBoolean("distance", x);
        bundle.putBoolean("floors", z);
        bundle.putBoolean("active_minutes", y);
        getSupportLoaderManager().restartLoader(0x7f110011, bundle, this);
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        return new b(this, bundle.getBoolean("steps"), bundle.getBoolean("distance"), bundle.getBoolean("floors"), bundle.getBoolean("active_minutes"));
    }

    public void onFocusChange(View view, boolean flag)
    {
        i();
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (a)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    protected void onResume()
    {
        super.onResume();
        com.fitbit.analytics.core.a.a(com.fitbit.analytics.core.Interaction.DEFAULTS.j);
    }
}
