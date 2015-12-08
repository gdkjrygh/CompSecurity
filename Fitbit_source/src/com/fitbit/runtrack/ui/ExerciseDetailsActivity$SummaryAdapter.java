// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.runtrack.SupportedActivity;
import com.fitbit.runtrack.data.ExerciseSession;
import com.fitbit.runtrack.data.ExerciseStat;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.fitbit.runtrack.ui:
//            ExerciseDetailsActivity, MapSummaryFragment, SplitsSummary, SpeedSummary, 
//            HeartRateSummary, CalorieSummary, ImpactSummary, RecentSummary

static final class m extends FragmentStatePagerAdapter
{
    static final class Type extends Enum
    {

        public static final Type a;
        public static final Type b;
        public static final Type c;
        public static final Type d;
        public static final Type e;
        public static final Type f;
        public static final Type g;
        private static final Type h[];

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/fitbit/runtrack/ui/ExerciseDetailsActivity$SummaryAdapter$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])h.clone();
        }

        static 
        {
            a = new Type("Map", 0);
            b = new Type("Splits", 1);
            c = new Type("Speed", 2);
            d = new Type("HeartRate", 3);
            e = new Type("Calories", 4);
            f = new Type("Impact", 5);
            g = new Type("Recent", 6);
            h = (new Type[] {
                a, b, c, d, e, f, g
            });
        }

        private Type(String s, int i1)
        {
            super(s, i1);
        }
    }


    private final ActivityLogEntry a;
    private final ExerciseSession b;
    private final ExerciseStat c;
    private final List d;
    private final List e;
    private Fragment f;
    private Fragment g;
    private Fragment h;
    private Fragment i;
    private Fragment j;
    private Fragment k;
    private Fragment l;
    private final List m;

    private Fragment a()
    {
        if (f == null)
        {
            MapSummaryFragment mapsummaryfragment = MapSummaryFragment.a(a, b, e, d, c);
            f = mapsummaryfragment;
            return mapsummaryfragment;
        } else
        {
            return f;
        }
    }

    private Fragment b()
    {
        if (g == null)
        {
            Fragment fragment = SplitsSummary.a(b, c, d);
            g = fragment;
            return fragment;
        } else
        {
            return g;
        }
    }

    private Fragment c()
    {
        if (h == null)
        {
            Fragment fragment = SpeedSummary.a(e, c);
            h = fragment;
            return fragment;
        } else
        {
            return h;
        }
    }

    private Fragment d()
    {
        if (i == null)
        {
            Fragment fragment = HeartRateSummary.a(a, b, c);
            i = fragment;
            return fragment;
        } else
        {
            return i;
        }
    }

    private Fragment e()
    {
        if (j == null)
        {
            Fragment fragment = CalorieSummary.a(a, b, c);
            j = fragment;
            return fragment;
        } else
        {
            return j;
        }
    }

    private Fragment f()
    {
        if (k == null)
        {
            Fragment fragment;
            if (b == null)
            {
                fragment = ImpactSummary.a(a);
            } else
            {
                fragment = ImpactSummary.a(b, c, a);
            }
            k = fragment;
        }
        return k;
    }

    private Fragment g()
    {
        if (l == null)
        {
            Fragment fragment = RecentSummary.a(b, c);
            l = fragment;
            return fragment;
        } else
        {
            return l;
        }
    }

    public int getCount()
    {
        return m.size();
    }

    public Fragment getItem(int i1)
    {
        switch (m[((Type)m.get(i1)).ordinal()])
        {
        default:
            return g();

        case 1: // '\001'
            return a();

        case 2: // '\002'
            return b();

        case 3: // '\003'
            return c();

        case 4: // '\004'
            return d();

        case 5: // '\005'
            return e();

        case 6: // '\006'
            return f();
        }
    }

    public Type(FragmentManager fragmentmanager, ActivityLogEntry activitylogentry, ExerciseSession exercisesession, Type type, List list, boolean flag)
    {
        Object obj = null;
        super(fragmentmanager);
        b = exercisesession;
        e = list;
        if (type != null)
        {
            fragmentmanager = type.e;
        } else
        {
            fragmentmanager = null;
        }
        c = fragmentmanager;
        fragmentmanager = obj;
        if (type != null)
        {
            fragmentmanager = type.c;
        }
        d = fragmentmanager;
        a = activitylogentry;
        fragmentmanager = EnumSet.allOf(com/fitbit/runtrack/ui/ExerciseDetailsActivity$SummaryAdapter$Type);
        if (!flag)
        {
            fragmentmanager.remove(Type.a);
        }
        if (exercisesession == null)
        {
            fragmentmanager.remove(Type.b);
            fragmentmanager.remove(Type.c);
            fragmentmanager.remove(Type.a);
            fragmentmanager.remove(Type.g);
        } else
        if (SupportedActivity.a(exercisesession) == SupportedActivity.d)
        {
            fragmentmanager.remove(Type.b);
        } else
        {
            fragmentmanager.remove(Type.c);
        }
        if (activitylogentry.q() == null)
        {
            fragmentmanager.remove(Type.d);
        }
        if (activitylogentry.r() == null)
        {
            fragmentmanager.remove(Type.e);
        }
        m = new LinkedList(fragmentmanager);
    }
}
