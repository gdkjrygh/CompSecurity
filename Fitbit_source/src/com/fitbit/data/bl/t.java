// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.activity.ui.charts.ActivityType;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.ActivitySummaryItem;
import com.fitbit.data.domain.BodyFatGoal;
import com.fitbit.data.domain.CaloriesBurnedGoal;
import com.fitbit.data.domain.CaloriesEatenGoal;
import com.fitbit.data.domain.DietPlan;
import com.fitbit.data.domain.DistanceGoal;
import com.fitbit.data.domain.Entity;
import com.fitbit.data.domain.FloorsGoal;
import com.fitbit.data.domain.Goal;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.PendingPlan;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.SleepGoal;
import com.fitbit.data.domain.StepsGoal;
import com.fitbit.data.domain.TimeSeriesObject;
import com.fitbit.data.domain.UnitSystem;
import com.fitbit.data.domain.ValueGoal;
import com.fitbit.data.domain.VeryActiveMinutesGoal;
import com.fitbit.data.domain.WaterGoal;
import com.fitbit.data.domain.WeightGoal;
import com.fitbit.data.domain.WeightLogEntry;
import com.fitbit.data.domain.a.b;
import com.fitbit.data.domain.device.TrackerGoalType;
import com.fitbit.data.domain.r;
import com.fitbit.data.repo.al;
import com.fitbit.data.repo.ap;
import com.fitbit.data.repo.z;
import com.fitbit.e.a;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.util.o;
import com.fitbit.water.Water;
import com.fitbit.weight.Weight;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.UUID;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            aq, gd, fs, an

public class t
{
    private static class a
    {

        public static t a = new t();


        private a()
        {
        }
    }


    static final int a = 1440;
    private final z b;
    private final al c;
    private final PublicAPI d;

    private t()
    {
        d = new PublicAPI(ServerGateway.a());
        b = com.fitbit.data.bl.aq.a().k();
        c = com.fitbit.data.bl.aq.a().x();
    }


    public static t a()
    {
        return com.fitbit.data.bl.a.a;
    }

    public static com.fitbit.data.domain.Goal.GoalType a(ActivityType activitytype)
    {
        com.fitbit.data.domain.Goal.GoalType goaltype = null;
        if (activitytype == ActivityType.a)
        {
            goaltype = com.fitbit.data.domain.Goal.GoalType.STEPS_GOAL;
        } else
        {
            if (activitytype == ActivityType.b)
            {
                return com.fitbit.data.domain.Goal.GoalType.CALORIES_BURNED_GOAL;
            }
            if (activitytype == ActivityType.c)
            {
                return com.fitbit.data.domain.Goal.GoalType.DISTANCE_GOAL;
            }
            if (activitytype == ActivityType.d)
            {
                return com.fitbit.data.domain.Goal.GoalType.MINUTES_VERY_ACTIVE_GOAL;
            }
            if (activitytype == ActivityType.e)
            {
                return com.fitbit.data.domain.Goal.GoalType.FLOORS_GOAL;
            }
            if (activitytype == ActivityType.f)
            {
                return com.fitbit.data.domain.Goal.GoalType.WATER_GOAL;
            }
        }
        return goaltype;
    }

    private WeightGoal a(Weight weight)
        throws JSONException, ServerCommunicationException
    {
        WeightGoal weightgoal = a().b();
        if (weightgoal == null)
        {
            weightgoal = new WeightGoal();
        }
        if (weight != null)
        {
            weightgoal.b(weight);
        }
        weightgoal.setTimeUpdated(new Date());
        Object obj = weightgoal.m();
        weight = ((Weight) (obj));
        if (obj == null)
        {
            weight = o.d(new Date());
            weightgoal.a(weight);
        }
        Weight weight1 = (Weight)weightgoal.o();
        obj = weight1;
        if (weight1 == null)
        {
            obj = com.fitbit.data.bl.gd.a().b();
            weightgoal.c(obj);
        }
        obj = ((Weight) (obj)).a((com.fitbit.data.domain.WeightLogEntry.WeightUnits)((Weight)weightgoal.j()).a());
        d.a(weight, ((Weight) (obj)).b(), ((Weight)weightgoal.j()).b(), UnitSystem.getByWeightUnit(r.a()));
        return weightgoal;
    }

    static void a(t t1, com.fitbit.data.domain.Goal.GoalType goaltype, Double double1, Double double2)
    {
        t1.a(goaltype, double1, double2);
    }

    private void a(com.fitbit.data.domain.Goal.GoalType goaltype, Double double1, Double double2)
    {
        if (double2 != null || double1 != null)
        {
            goaltype = b.getByType(goaltype);
            ValueGoal valuegoal;
            for (Iterator iterator = goaltype.iterator(); iterator.hasNext(); valuegoal.setTimeUpdated(new Date()))
            {
                valuegoal = (ValueGoal)(Goal)iterator.next();
                if (double1 != null)
                {
                    valuegoal.a(double1);
                }
                if (double2 != null)
                {
                    valuegoal.b(double2);
                }
            }

            b.saveAll(goaltype);
        }
    }

    private WeightGoal i(Date date)
    {
        WeightGoal weightgoal = new WeightGoal();
        Date date1 = new Date();
        WeightGoal weightgoal1 = (WeightGoal)b.getByTypeAndDate(com.fitbit.data.domain.Goal.GoalType.WEIGHT_GOAL, date);
        if (weightgoal1 != null)
        {
            weightgoal.setUuid(weightgoal1.getUuid());
            weightgoal.setTimeCreated(weightgoal1.getTimeCreated());
            weightgoal.setTimeUpdated(weightgoal1.getTimeUpdated());
        } else
        {
            weightgoal.setUuid(UUID.randomUUID());
            weightgoal.setTimeCreated(date1);
        }
        weightgoal.setTimeUpdated(date1);
        weightgoal.b(o.g(date));
        weightgoal.a(com.fitbit.data.domain.Goal.GoalFreq.MONTHLY_GOAL);
        return weightgoal;
    }

    public com.fitbit.customui.RoughGauge.State a(CaloriesEatenGoal calorieseatengoal, CaloriesBurnedGoal caloriesburnedgoal, DietPlan dietplan, Calendar calendar)
    {
        com.fitbit.customui.RoughGauge.State state = com.fitbit.customui.RoughGauge.State.a;
        double d1;
        Object obj;
        if (dietplan != null)
        {
            d1 = dietplan.c();
        } else
        {
            d1 = 0.0D;
        }
        obj = state;
        if (calorieseatengoal != null)
        {
            obj = state;
            if (caloriesburnedgoal != null)
            {
                double d2;
                double d3;
                double d4;
                double d5;
                double d6;
                int j;
                if (o.i(calendar.getTime()))
                {
                    obj = Calendar.getInstance(TimeZone.getDefault());
                    ((Calendar) (obj)).setTime(new Date());
                    j = ((Calendar) (obj)).get(12);
                    j = ((Calendar) (obj)).get(11) * 60 + j;
                } else
                {
                    j = 1440;
                }
                d2 = j;
                d5 = d1 / 1440D;
                d3 = caloriesburnedgoal.c().doubleValue();
                d4 = calorieseatengoal.c().doubleValue();
                d6 = calorieseatengoal.p().doubleValue();
                if (dietplan == null && d6 != 0.0D)
                {
                    d2 = ((double)j * d6) / 1440D - d4;
                } else
                {
                    d2 = d3 - (d4 - d2 * d5);
                }
                if (d2 < -50D)
                {
                    calorieseatengoal = com.fitbit.customui.RoughGauge.State.c;
                } else
                if (d2 > 50D)
                {
                    calorieseatengoal = com.fitbit.customui.RoughGauge.State.a;
                } else
                {
                    calorieseatengoal = com.fitbit.customui.RoughGauge.State.b;
                }
                com.fitbit.e.a.b("GoalBusinessLogic", (new StringBuilder()).append("getGaugeState for ").append(calendar.getTime().toString()).append("\ncaloriesBurned: ").append(d3).append("\ncaloriesEaten: ").append(d4).append("\nplan deficit: ").append(d1).append("\ncalculated net calories: ").append(d2).toString(), new Object[0]);
                obj = calorieseatengoal;
            }
        }
        return ((com.fitbit.customui.RoughGauge.State) (obj));
    }

    public CaloriesBurnedGoal a(Date date)
    {
        return (CaloriesBurnedGoal)a(com.fitbit.data.domain.Goal.GoalType.CALORIES_BURNED_GOAL, date);
    }

    public ValueGoal a(com.fitbit.data.domain.Goal.GoalType goaltype, Date date)
    {
        ValueGoal valuegoal = (ValueGoal)b.getByTypeAndDate(goaltype, date);
        if (valuegoal != null) goto _L2; else goto _L1
_L1:
        static class _cls3
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[TrackerGoalType.values().length];
                try
                {
                    b[TrackerGoalType.ACTIVE_MINUTES.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    b[TrackerGoalType.CALORIES.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    b[TrackerGoalType.DISTANCE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    b[TrackerGoalType.FLOORS.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    b[TrackerGoalType.STEPS.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                a = new int[com.fitbit.data.domain.Goal.GoalType.values().length];
                try
                {
                    a[com.fitbit.data.domain.Goal.GoalType.CALORIES_BURNED_GOAL.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[com.fitbit.data.domain.Goal.GoalType.CALORIES_CONSUMED_GOAL.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[com.fitbit.data.domain.Goal.GoalType.DISTANCE_GOAL.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[com.fitbit.data.domain.Goal.GoalType.SLEEP_GOAL.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[com.fitbit.data.domain.Goal.GoalType.FLOORS_GOAL.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.fitbit.data.domain.Goal.GoalType.MINUTES_VERY_ACTIVE_GOAL.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.fitbit.data.domain.Goal.GoalType.STEPS_GOAL.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.fitbit.data.domain.Goal.GoalType.WATER_GOAL.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.fitbit.data.domain.Goal.GoalType.BODY_FAT_GOAL.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.fitbit.data.domain.Goal.GoalType.WEIGHT_GOAL.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.fitbit.data.bl._cls3.a[goaltype.ordinal()];
        JVM INSTR tableswitch 1 9: default 76
    //                   1 188
    //                   2 199
    //                   3 210
    //                   4 221
    //                   5 232
    //                   6 243
    //                   7 254
    //                   8 265
    //                   9 276;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L3:
        goaltype = valuegoal;
_L13:
        goaltype.setUuid(UUID.randomUUID());
        goaltype.setTimeCreated(new Date());
        goaltype.setTimeUpdated(new Date());
        goaltype.setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.SYNCED);
        goaltype.a(o.d(date));
        goaltype.b(o.f(date));
        valuegoal = (ValueGoal)b.getLastGoalByType(goaltype.b());
        if (valuegoal != null)
        {
            goaltype.b(valuegoal.p());
        }
        date = com.fitbit.data.bl.fs.a().a(goaltype.a(), date);
        if (date != null)
        {
            goaltype.a(Double.valueOf(date.b()));
        }
        return goaltype;
_L4:
        goaltype = new CaloriesBurnedGoal();
        continue; /* Loop/switch isn't completed */
_L5:
        goaltype = new CaloriesEatenGoal();
        continue; /* Loop/switch isn't completed */
_L6:
        goaltype = new DistanceGoal();
        continue; /* Loop/switch isn't completed */
_L7:
        goaltype = new SleepGoal();
        continue; /* Loop/switch isn't completed */
_L8:
        goaltype = new FloorsGoal();
        continue; /* Loop/switch isn't completed */
_L9:
        goaltype = new VeryActiveMinutesGoal();
        continue; /* Loop/switch isn't completed */
_L10:
        goaltype = new StepsGoal();
        continue; /* Loop/switch isn't completed */
_L11:
        goaltype = new WaterGoal();
        continue; /* Loop/switch isn't completed */
_L12:
        goaltype = new BodyFatGoal();
        if (true) goto _L13; else goto _L2
_L2:
        return valuegoal;
    }

    public ValueGoal a(TrackerGoalType trackergoaltype, Date date)
    {
        switch (com.fitbit.data.bl._cls3.b[trackergoaltype.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return a(com.fitbit.data.domain.Goal.GoalType.MINUTES_VERY_ACTIVE_GOAL, date);

        case 2: // '\002'
            return a(com.fitbit.data.domain.Goal.GoalType.CALORIES_BURNED_GOAL, date);

        case 3: // '\003'
            return a(com.fitbit.data.domain.Goal.GoalType.DISTANCE_GOAL, date);

        case 4: // '\004'
            return a(com.fitbit.data.domain.Goal.GoalType.FLOORS_GOAL, date);

        case 5: // '\005'
            return a(com.fitbit.data.domain.Goal.GoalType.STEPS_GOAL, date);
        }
    }

    public Double a(com.fitbit.data.domain.Goal.GoalType goaltype)
    {
        Object obj = null;
        List list = b.getByType(goaltype);
        goaltype = obj;
        if (list != null)
        {
            goaltype = obj;
            if (list.size() > 0)
            {
                goaltype = (Double)((Goal)list.get(0)).j();
            }
        }
        double d1;
        if (goaltype == null)
        {
            d1 = 0.0D;
        } else
        {
            d1 = goaltype.doubleValue();
        }
        return Double.valueOf(d1);
    }

    public void a(com.fitbit.data.domain.Goal.GoalType goaltype, double d1)
        throws ServerCommunicationException, JSONException
    {
        Date date = new Date();
        double d2 = d1;
        switch (com.fitbit.data.bl._cls3.a[goaltype.ordinal()])
        {
        default:
            return;

        case 3: // '\003'
            d2 = (new Length(d1, r.c())).a(com.fitbit.data.domain.Length.LengthUnits.KM).b();
            // fall through

        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            d.a(goaltype.getPublicApiKey(), d2);
            a(goaltype, ((Double) (null)), Double.valueOf(d2));
            return;

        case 1: // '\001'
            d.a(goaltype.getPublicApiKey(), d1);
            a(goaltype, ((Double) (null)), Double.valueOf(d1), date);
            return;

        case 8: // '\b'
            d1 = (new Water(d1, r.e())).a(com.fitbit.data.domain.WaterLogEntry.WaterUnits.ML).b();
            d.a(d1);
            a(goaltype, ((Double) (null)), Double.valueOf(d1));
            return;

        case 2: // '\002'
            d.a(Double.valueOf(d1), null, null);
            a(goaltype, ((Double) (null)), Double.valueOf(d1), date);
            return;

        case 10: // '\n'
            goaltype = a((new Weight(d1, com.fitbit.data.domain.WeightLogEntry.WeightUnits.KG)).a(r.a()));
            a().a(((Goal) (goaltype)));
            return;

        case 9: // '\t'
            d.b(d1);
            a(goaltype, ((Double) (null)), Double.valueOf(d1), date);
            return;

        case 4: // '\004'
            break;
        }
        if (d1 == 0.0D)
        {
            d.v();
        } else
        {
            d.c(d1);
        }
        a(goaltype, ((Double) (null)), Double.valueOf(d1), date);
    }

    public void a(com.fitbit.data.domain.Goal.GoalType goaltype, Double double1, Double double2, Date date)
    {
        if (double2 != null || double1 != null)
        {
            goaltype = a().a(goaltype, date);
            if (double1 != null)
            {
                goaltype.a(double1);
            }
            if (double2 != null)
            {
                goaltype.b(double2);
            }
            goaltype.setTimeUpdated(new Date());
            a().a(((Goal) (goaltype)));
        }
    }

    public void a(Goal goal)
    {
        if (goal == null)
        {
            return;
        }
        if (goal.b() == com.fitbit.data.domain.Goal.GoalType.WEIGHT_GOAL)
        {
            Object obj = b.getByType(goal.b());
            for (int j = 1; j < ((List) (obj)).size(); j++)
            {
                b.delete((Entity)((List) (obj)).get(j));
            }

            Goal goal1;
            if (((List) (obj)).size() > 0)
            {
                obj = (Goal)((List) (obj)).get(0);
            } else
            {
                obj = null;
            }
        } else
        {
            if (goal.getUuid() != null)
            {
                goal1 = (Goal)b.getByUUID(goal.getUuid());
            } else
            {
                goal1 = null;
            }
            obj = goal1;
            if (goal1 == null)
            {
                obj = b.getByTypeAndDate(goal.b(), goal.m(), goal.n());
            }
        }
        if (obj == null)
        {
            goal.setEntityId(null);
            b.add(goal);
            return;
        } else
        {
            goal.setEntityId(((Goal) (obj)).getEntityId());
            b.save(goal);
            return;
        }
    }

    public void a(PendingPlan pendingplan)
    {
        c.setPendingPlan(pendingplan);
    }

    public void a(PendingPlan pendingplan, Weight weight, WeightGoal weightgoal)
    {
        boolean flag1 = true;
        boolean flag;
        if (!pendingplan.o().equals(weight))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        pendingplan.a(flag);
        if (!pendingplan.p().equals(weightgoal.j()))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        pendingplan.b(flag);
        if (pendingplan.f())
        {
            weight = com.fitbit.data.bl.an.a().b();
            if (weight.a() == null)
            {
                weight = com.fitbit.data.domain.DietPlan.IntensityLevel.MAINTENANCE;
            } else
            {
                weight = weight.a().d();
            }
            pendingplan.a(pendingplan.b(weight));
        } else
        {
            pendingplan.a(pendingplan.b(com.fitbit.data.domain.DietPlan.IntensityLevel.MAINTENANCE));
        }
        a(pendingplan);
    }

    public void a(com.fitbit.data.domain.a.a a1, Date date)
    {
        if (a1 != null)
        {
            b.runInTransaction(new Runnable(a1, date) {

                final com.fitbit.data.domain.a.a a;
                final Date b;
                final t c;

                public void run()
                {
                    com.fitbit.data.bl.t.a(c, com.fitbit.data.domain.Goal.GoalType.DISTANCE_GOAL, null, a.b());
                    com.fitbit.data.bl.t.a(c, com.fitbit.data.domain.Goal.GoalType.FLOORS_GOAL, null, a.c());
                    com.fitbit.data.bl.t.a(c, com.fitbit.data.domain.Goal.GoalType.STEPS_GOAL, null, a.d());
                    com.fitbit.data.bl.t.a(c, com.fitbit.data.domain.Goal.GoalType.MINUTES_VERY_ACTIVE_GOAL, null, a.e());
                    c.a(com.fitbit.data.domain.Goal.GoalType.CALORIES_BURNED_GOAL, null, a.a(), b);
                }

            
            {
                c = t.this;
                a = a1;
                b = date;
                super();
            }
            });
        }
    }

    public void a(b b1, ActivitySummaryItem activitysummaryitem, Date date)
    {
        b.runInTransaction(new Runnable(activitysummaryitem, b1, date) {

            final ActivitySummaryItem a;
            final b b;
            final Date c;
            final t d;

            public void run()
            {
                Double double1;
                Double double2;
                if (a != null)
                {
                    double1 = a.b();
                } else
                {
                    double1 = null;
                }
                if (b != null)
                {
                    double2 = b.b();
                } else
                {
                    double2 = null;
                }
                d.a(com.fitbit.data.domain.Goal.GoalType.CALORIES_BURNED_GOAL, double1, double2, c);
                if (a != null)
                {
                    d.a(com.fitbit.data.domain.Goal.GoalType.STEPS_GOAL, a.f(), null, c);
                    d.a(com.fitbit.data.domain.Goal.GoalType.DISTANCE_GOAL, a.i(), null, c);
                    d.a(com.fitbit.data.domain.Goal.GoalType.FLOORS_GOAL, a.h(), null, c);
                    double1 = a.g();
                    Double double3 = a.c();
                    double2 = double1;
                    if (double3 != null)
                    {
                        double2 = double1;
                        if (double1 == null)
                        {
                            double2 = Double.valueOf(0.0D);
                        }
                        double d1 = double2.doubleValue();
                        double2 = Double.valueOf(double3.doubleValue() + d1);
                    }
                    d.a(com.fitbit.data.domain.Goal.GoalType.MINUTES_VERY_ACTIVE_GOAL, double2, null, c);
                }
            }

            
            {
                d = t.this;
                a = activitysummaryitem;
                b = b1;
                c = date;
                super();
            }
        });
    }

    public void a(ap ap)
    {
        b.addListener(ap);
    }

    public CaloriesEatenGoal b(Date date)
    {
        return (CaloriesEatenGoal)a(com.fitbit.data.domain.Goal.GoalType.CALORIES_CONSUMED_GOAL, date);
    }

    public WeightGoal b()
    {
        List list = b.getByType(com.fitbit.data.domain.Goal.GoalType.WEIGHT_GOAL);
        if (list != null && list.size() > 0)
        {
            return (WeightGoal)list.get(0);
        } else
        {
            return null;
        }
    }

    public WeightGoal b(PendingPlan pendingplan)
    {
        WeightGoal weightgoal = i(new Date());
        weightgoal.a(pendingplan.o());
        weightgoal.b(pendingplan.p());
        weightgoal.c(pendingplan.q());
        return weightgoal;
    }

    public void b(ap ap)
    {
        b.removeListener(ap);
    }

    public DistanceGoal c(Date date)
    {
        return (DistanceGoal)a(com.fitbit.data.domain.Goal.GoalType.DISTANCE_GOAL, date);
    }

    public WeightLogEntry c(PendingPlan pendingplan)
    {
        WeightLogEntry weightlogentry = new WeightLogEntry();
        weightlogentry.setLogDate(new Date());
        WeightLogEntry weightlogentry1 = com.fitbit.data.bl.gd.a().a(new Date());
        if (weightlogentry1 != null)
        {
            weightlogentry.setUuid(weightlogentry1.getUuid());
            if (weightlogentry.getUuid() == null)
            {
                weightlogentry.setUuid(UUID.randomUUID());
            }
            weightlogentry.setTimeCreated(weightlogentry1.getTimeCreated());
            weightlogentry.setTimeUpdated(weightlogentry1.getTimeUpdated());
        } else
        {
            weightlogentry.setUuid(UUID.randomUUID());
            weightlogentry.setTimeCreated(new Date());
        }
        weightlogentry.setTimeUpdated(new Date());
        weightlogentry.a(pendingplan.o());
        return weightlogentry;
    }

    public void c()
    {
        c.resetPendingPlan();
    }

    public PendingPlan d()
    {
        return c.getPendingPlan();
    }

    public VeryActiveMinutesGoal d(Date date)
    {
        return (VeryActiveMinutesGoal)a(com.fitbit.data.domain.Goal.GoalType.MINUTES_VERY_ACTIVE_GOAL, date);
    }

    public StepsGoal e(Date date)
    {
        return (StepsGoal)a(com.fitbit.data.domain.Goal.GoalType.STEPS_GOAL, date);
    }

    public String e()
    {
        return b.getName();
    }

    public FloorsGoal f(Date date)
    {
        return (FloorsGoal)a(com.fitbit.data.domain.Goal.GoalType.FLOORS_GOAL, date);
    }

    public WaterGoal g(Date date)
    {
        return (WaterGoal)a(com.fitbit.data.domain.Goal.GoalType.WATER_GOAL, date);
    }

    public SleepGoal h(Date date)
    {
        return (SleepGoal)a(com.fitbit.data.domain.Goal.GoalType.SLEEP_GOAL, date);
    }
}
