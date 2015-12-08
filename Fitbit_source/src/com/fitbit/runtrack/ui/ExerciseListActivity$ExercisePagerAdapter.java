// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.util.p;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.fitbit.runtrack.ui:
//            ExerciseListActivity, CalendarFragment_, ExerciseGraphFragment, HeartRateGraphFragment, 
//            CalendarFragment

private static class f extends FragmentPagerAdapter
{

    private CalendarFragment a;
    private HeartRateGraphFragment b;
    private ExerciseGraphFragment c;
    private ExerciseGraphFragment d;
    private ExerciseGraphFragment e;
    private final List f;

    static List a(f f1)
    {
        return f1.f;
    }

    public boolean a()
    {
        return p.a(DeviceFeature.HEART_RATE);
    }

    public CalendarFragment b()
    {
        if (a == null)
        {
            CalendarFragment_ calendarfragment_ = new CalendarFragment_();
            a = calendarfragment_;
            return calendarfragment_;
        } else
        {
            return a;
        }
    }

    public ExerciseGraphFragment c()
    {
        if (c == null)
        {
            ExerciseGraphFragment exercisegraphfragment = ExerciseGraphFragment.a(c);
            c = exercisegraphfragment;
            return exercisegraphfragment;
        } else
        {
            return c;
        }
    }

    public ExerciseGraphFragment d()
    {
        if (e == null)
        {
            ExerciseGraphFragment exercisegraphfragment = ExerciseGraphFragment.a(e);
            e = exercisegraphfragment;
            return exercisegraphfragment;
        } else
        {
            return e;
        }
    }

    public HeartRateGraphFragment e()
    {
        if (b == null)
        {
            HeartRateGraphFragment heartrategraphfragment = new HeartRateGraphFragment();
            b = heartrategraphfragment;
            return heartrategraphfragment;
        } else
        {
            return b;
        }
    }

    public ExerciseGraphFragment f()
    {
        if (d == null)
        {
            ExerciseGraphFragment exercisegraphfragment = ExerciseGraphFragment.a(d);
            d = exercisegraphfragment;
            return exercisegraphfragment;
        } else
        {
            return d;
        }
    }

    public int getCount()
    {
        return f.size();
    }

    public Fragment getItem(int i)
    {
        switch (f[((Type)f.get(i)).ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return b();

        case 2: // '\002'
            return c();

        case 3: // '\003'
            return d();

        case 4: // '\004'
            return e();

        case 5: // '\005'
            return f();
        }
    }

    public Type(FragmentManager fragmentmanager)
    {
        super(fragmentmanager);
        fragmentmanager = EnumSet.allOf(com/fitbit/runtrack/ui/ExerciseListActivity$ExercisePagerAdapter$Type);
    /* block-local class not found */
    class Type {}

        if (!a())
        {
            fragmentmanager.remove(Type.d);
        }
        f = new LinkedList(fragmentmanager);
    }
}
