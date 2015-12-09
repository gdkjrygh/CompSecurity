// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.weight.Weight;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.fitbit.data.domain:
//            Entity, c, DietPlan

public class PendingPlan extends Entity
    implements c
{

    private static final double a = 0.5D;
    private static final double b = 1D;
    private static final double c = 1.5D;
    private static final double d = 2D;
    private Weight current;
    boolean currentWeightChanged;
    private Weight desired;
    private DietPlan dietPlan;
    private Long entityId;
    boolean goalChanged;
    private Lock lockSetDietPlan;
    private Weight startingWeight;
    private WeightLogEntry.WeightUnits units;

    public PendingPlan()
    {
        lockSetDietPlan = new ReentrantLock();
    }

    public PendingPlan(WeightLogEntry.WeightUnits weightunits)
    {
        lockSetDietPlan = new ReentrantLock();
        units = weightunits;
    }

    private int a(double d1)
    {
        if (Math.abs(d1 - 0.5D) < 0.0001D)
        {
            return -250;
        }
        if (Math.abs(d1 - 1.0D) < 0.0001D)
        {
            return -500;
        }
        if (Math.abs(d1 - 1.5D) < 0.0001D)
        {
            return -750;
        }
        if (Math.abs(d1 - 2D) < 0.0001D)
        {
            return -1000;
        }
        if (d1 == 0.0D)
        {
            return 0;
        } else
        {
            throw new IllegalArgumentException();
        }
    }

    private DietPlan a(double d1, DietPlan.IntensityLevel intensitylevel)
    {
        DietPlan dietplan = new DietPlan();
        dietplan.a((new Weight(d1, WeightLogEntry.WeightUnits.LBS)).a(units));
        dietplan.a(a(d1));
        dietplan.a(intensitylevel);
        dietplan.a(a(d1, current.a(WeightLogEntry.WeightUnits.LBS).b() - desired.a(WeightLogEntry.WeightUnits.LBS).b()));
        return dietplan;
    }

    static DietPlan a(DietPlan.IntensityLevel intensitylevel)
    {
        Weight weight = new Weight();
        PendingPlan pendingplan = new PendingPlan(WeightLogEntry.WeightUnits.LBS);
        pendingplan.a(weight, weight);
        return pendingplan.b(intensitylevel);
    }

    private Date a(double d1, double d2)
    {
        return a(b(d1, d2));
    }

    private Date a(int i1)
    {
        GregorianCalendar gregoriancalendar = new GregorianCalendar();
        gregoriancalendar.add(6, i1);
        return gregoriancalendar.getTime();
    }

    private int b(double d1, double d2)
    {
        return Math.abs((int)Math.round((7D * d2) / d1));
    }

    private double c(DietPlan.IntensityLevel intensitylevel)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[DietPlan.IntensityLevel.values().length];
                try
                {
                    a[DietPlan.IntensityLevel.MAINTENANCE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[DietPlan.IntensityLevel.EASIER.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[DietPlan.IntensityLevel.MEDIUM.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[DietPlan.IntensityLevel.KINDA_HARD.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[DietPlan.IntensityLevel.HARDER.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[intensitylevel.ordinal()])
        {
        default:
            throw new IllegalArgumentException();

        case 1: // '\001'
            return 0.0D;

        case 2: // '\002'
            return 0.5D;

        case 3: // '\003'
            return 1.0D;

        case 4: // '\004'
            return 1.5D;

        case 5: // '\005'
            return 2D;
        }
    }

    private DietPlan r()
    {
        return a(0.0D, DietPlan.IntensityLevel.MAINTENANCE);
    }

    public DietPlan a()
    {
        return dietPlan;
    }

    public void a(DietPlan dietplan)
    {
        b().lock();
        dietPlan = dietplan;
        b().unlock();
        return;
        dietplan;
        b().unlock();
        throw dietplan;
    }

    public void a(WeightLogEntry.WeightUnits weightunits)
    {
        units = weightunits;
    }

    public void a(Weight weight)
    {
        current = weight;
    }

    public void a(Weight weight, Weight weight1)
    {
        current = weight;
        desired = weight1;
    }

    public void a(boolean flag)
    {
        currentWeightChanged = flag;
    }

    public DietPlan b(DietPlan.IntensityLevel intensitylevel)
    {
        switch (_cls1.a[intensitylevel.ordinal()])
        {
        default:
            throw new IllegalArgumentException();

        case 1: // '\001'
            return r();

        case 2: // '\002'
            return i();

        case 3: // '\003'
            return j();

        case 4: // '\004'
            return k();

        case 5: // '\005'
            return l();
        }
    }

    public Lock b()
    {
        return lockSetDietPlan;
    }

    public void b(Weight weight)
    {
        desired = weight;
    }

    public void b(boolean flag)
    {
        goalChanged = flag;
    }

    public WeightLogEntry.WeightUnits c()
    {
        return units;
    }

    public void c(Weight weight)
    {
        startingWeight = weight;
    }

    public boolean d()
    {
        return currentWeightChanged;
    }

    public boolean e()
    {
        return goalChanged;
    }

    public boolean f()
    {
        return g() && desired.b() < current.b();
    }

    public boolean g()
    {
        return Math.abs(h()) > 0.050000000000000003D;
    }

    public Long getEntityId()
    {
        return entityId;
    }

    public double h()
    {
        return (double)Math.round(current.a(WeightLogEntry.WeightUnits.KG).b() * 100D) / 100D - (double)Math.round(desired.a(WeightLogEntry.WeightUnits.KG).b() * 100D) / 100D;
    }

    public DietPlan i()
    {
        return a(0.5D, DietPlan.IntensityLevel.EASIER);
    }

    public DietPlan j()
    {
        return a(1.0D, DietPlan.IntensityLevel.MEDIUM);
    }

    public DietPlan k()
    {
        return a(1.5D, DietPlan.IntensityLevel.KINDA_HARD);
    }

    public DietPlan l()
    {
        return a(2D, DietPlan.IntensityLevel.HARDER);
    }

    public int m()
    {
        if (dietPlan == null || current == null || desired == null)
        {
            return -1;
        } else
        {
            return b(c(dietPlan.d()), current.a(WeightLogEntry.WeightUnits.LBS).b() - desired.a(WeightLogEntry.WeightUnits.LBS).b());
        }
    }

    public DietPlan.WeightObjective n()
    {
        if (g())
        {
            if (desired.b() < current.b())
            {
                return DietPlan.WeightObjective.LOSE;
            } else
            {
                return DietPlan.WeightObjective.GAIN;
            }
        } else
        {
            return DietPlan.WeightObjective.MAINTAIN;
        }
    }

    public Weight o()
    {
        return current;
    }

    public Weight p()
    {
        return desired;
    }

    public Weight q()
    {
        return startingWeight;
    }

    public void setEntityId(Long long1)
    {
        entityId = long1;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(" currentWeight: ").append(o());
        stringbuilder.append(" desiredWeight: ").append(p());
        stringbuilder.append(" startingWeight: ").append(q());
        return stringbuilder.toString();
    }
}
