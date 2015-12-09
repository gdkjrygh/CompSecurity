// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.data.domain.Alarm;
import com.fitbit.data.domain.BodyFatLogEntry;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.data.domain.FoodLogEntry;
import com.fitbit.data.domain.FoodRelation;
import com.fitbit.data.domain.Friendship;
import com.fitbit.data.domain.Notification;
import com.fitbit.data.domain.PedometerMinuteData;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.RankedUser;
import com.fitbit.data.domain.SleepLogEntry;
import com.fitbit.data.domain.TimeSeriesObject;
import com.fitbit.data.domain.WaterLogEntry;
import com.fitbit.data.domain.WeightLogEntry;
import com.fitbit.data.repo.aa;
import com.fitbit.data.repo.ab;
import com.fitbit.data.repo.ac;
import com.fitbit.data.repo.ad;
import com.fitbit.data.repo.ae;
import com.fitbit.data.repo.af;
import com.fitbit.data.repo.ah;
import com.fitbit.data.repo.ai;
import com.fitbit.data.repo.aj;
import com.fitbit.data.repo.ak;
import com.fitbit.data.repo.al;
import com.fitbit.data.repo.am;
import com.fitbit.data.repo.an;
import com.fitbit.data.repo.ao;
import com.fitbit.data.repo.ar;
import com.fitbit.data.repo.as;
import com.fitbit.data.repo.at;
import com.fitbit.data.repo.au;
import com.fitbit.data.repo.av;
import com.fitbit.data.repo.aw;
import com.fitbit.data.repo.ax;
import com.fitbit.data.repo.d;
import com.fitbit.data.repo.g;
import com.fitbit.data.repo.greendao.AlarmGreenDaoRepository;
import com.fitbit.data.repo.greendao.DaoFactory;
import com.fitbit.data.repo.greendao.DeviceGreenDaoRepository;
import com.fitbit.data.repo.greendao.GoalGreenDaoRepository;
import com.fitbit.data.repo.greendao.LocaleInfoGreenDaoRepository;
import com.fitbit.data.repo.greendao.NotificationGreenDaoRepository;
import com.fitbit.data.repo.greendao.OperationsQueueGreenDaoRepository;
import com.fitbit.data.repo.greendao.PendingPlanGreenDaoRepository;
import com.fitbit.data.repo.greendao.ProfileGreenDaoRepository;
import com.fitbit.data.repo.greendao.TimeSeriesGreenDaoRepository;
import com.fitbit.data.repo.greendao.TimeZoneGreenDaoRepository;
import com.fitbit.data.repo.greendao.TrackerSettingsGreenDaoRepository;
import com.fitbit.data.repo.greendao.activity.ActivityItemGreenDaoRepository;
import com.fitbit.data.repo.greendao.activity.ActivityLevelGreenDaoRepository;
import com.fitbit.data.repo.greendao.activity.ActivityLogEntryGreenDaoRepository;
import com.fitbit.data.repo.greendao.activity.MostRecentActivitiesGreenDaoRepository;
import com.fitbit.data.repo.greendao.exercise.ExerciseEventGreenDaoRepository;
import com.fitbit.data.repo.greendao.exercise.ExerciseSegmentGreenDaoRepository;
import com.fitbit.data.repo.greendao.exercise.ExerciseSessionGreenDaoRepository;
import com.fitbit.data.repo.greendao.exercise.SplitGreenDaoRepository;
import com.fitbit.data.repo.greendao.food.FavoriteFoodGreenDaoRepository;
import com.fitbit.data.repo.greendao.food.FoodItemGreenDaoRepository;
import com.fitbit.data.repo.greendao.food.FoodLocaleGreenDaoRepository;
import com.fitbit.data.repo.greendao.food.FoodLogEntryGreenDaoRepository;
import com.fitbit.data.repo.greendao.food.FoodMeasurementUnitGreenDaoRepository;
import com.fitbit.data.repo.greendao.food.FoodRelationGreenDaoRepository;
import com.fitbit.data.repo.greendao.food.MealGreenDaoRepository;
import com.fitbit.data.repo.greendao.food.MealItemGreenDaoRepository;
import com.fitbit.data.repo.greendao.heartrate.HeartRateDailySummaryGreenDaoRepository;
import com.fitbit.data.repo.greendao.heartrate.HeartRateZoneGreenDaoRepository;
import com.fitbit.data.repo.greendao.logging.BodyFatGreenDaoRepository;
import com.fitbit.data.repo.greendao.logging.SleepLogEntryGreenDaoRepository;
import com.fitbit.data.repo.greendao.logging.WaterLogEntryGreenDaoRepository;
import com.fitbit.data.repo.greendao.logging.WeightLogEntryGreenDaoRepository;
import com.fitbit.data.repo.greendao.mobiletrack.PedometerMinuteDataGreenDaoRepository;
import com.fitbit.data.repo.greendao.social.BadgeGreenDaoRepository;
import com.fitbit.data.repo.greendao.social.CheerBadgeRelationGreenDaoRepository;
import com.fitbit.data.repo.greendao.social.FriendshipGreenDaoRepository;
import com.fitbit.data.repo.greendao.social.RankedUserGreenDaoRepository;
import com.fitbit.data.repo.greendao.swap.HeartRateExerciseSummaryGreenDaoRepository;
import com.fitbit.data.repo.greendao.swap.SwapTimeSeriesGreenDaoRepository;
import com.fitbit.data.repo.h;
import com.fitbit.data.repo.i;
import com.fitbit.data.repo.k;
import com.fitbit.data.repo.mem.DataCache;
import com.fitbit.data.repo.mem.b;
import com.fitbit.data.repo.mem.c;
import com.fitbit.data.repo.mem.e;
import com.fitbit.data.repo.n;
import com.fitbit.data.repo.p;
import com.fitbit.data.repo.q;
import com.fitbit.data.repo.r;
import com.fitbit.data.repo.s;
import com.fitbit.data.repo.t;
import com.fitbit.data.repo.u;
import com.fitbit.data.repo.v;
import com.fitbit.data.repo.w;
import com.fitbit.data.repo.x;
import com.fitbit.data.repo.y;
import com.fitbit.data.repo.z;
import com.fitbit.runtrack.Split;
import com.fitbit.runtrack.data.ExerciseEvent;
import com.fitbit.runtrack.data.ExerciseSegment;
import com.fitbit.runtrack.data.ExerciseSession;

class aq
{

    private static aq a = null;
    private ai A;
    private y B;
    private TrackerSettingsGreenDaoRepository C;
    private ad D;
    private ak E;
    private aa F;
    private ab G;
    private ac H;
    private u I;
    private c J;
    private x K;
    private at L;
    private h M;
    private k N;
    private p O;
    private q P;
    private r Q;
    private ar R;
    private com.fitbit.data.repo.b b;
    private com.fitbit.data.repo.c c;
    private d d;
    private v e;
    private t f;
    private aw g;
    private am h;
    private z i;
    private ax j;
    private s k;
    private w l;
    private af m;
    private ae n;
    private com.fitbit.data.repo.e o;
    private as p;
    private as q;
    private n r;
    private av s;
    private ah t;
    private aj u;
    private al v;
    private com.fitbit.data.repo.aq w;
    private i x;
    private an y;
    private g z;

    private aq()
    {
    }

    public static aq a()
    {
        com/fitbit/data/bl/aq;
        JVM INSTR monitorenter ;
        aq aq1;
        if (a == null)
        {
            a = new aq();
        }
        aq1 = a;
        com/fitbit/data/bl/aq;
        JVM INSTR monitorexit ;
        return aq1;
        Exception exception;
        exception;
        throw exception;
    }

    public y A()
    {
        this;
        JVM INSTR monitorenter ;
        y y1;
        if (B == null)
        {
            B = new FriendshipGreenDaoRepository();
        }
        y1 = B;
        this;
        JVM INSTR monitorexit ;
        return y1;
        Exception exception;
        exception;
        throw exception;
    }

    public ai B()
    {
        this;
        JVM INSTR monitorenter ;
        ai ai;
        if (A == null)
        {
            A = new NotificationGreenDaoRepository();
        }
        ai = A;
        this;
        JVM INSTR monitorexit ;
        return ai;
        Exception exception;
        exception;
        throw exception;
    }

    public ad C()
    {
        this;
        JVM INSTR monitorenter ;
        ad ad;
        if (D == null)
        {
            D = new LocaleInfoGreenDaoRepository();
        }
        ad = D;
        this;
        JVM INSTR monitorexit ;
        return ad;
        Exception exception;
        exception;
        throw exception;
    }

    public ak D()
    {
        this;
        JVM INSTR monitorenter ;
        ak ak;
        if (E == null)
        {
            E = new PedometerMinuteDataGreenDaoRepository();
        }
        ak = E;
        this;
        JVM INSTR monitorexit ;
        return ak;
        Exception exception;
        exception;
        throw exception;
    }

    public aa E()
    {
        this;
        JVM INSTR monitorenter ;
        aa aa;
        if (F == null)
        {
            F = new HeartRateDailySummaryGreenDaoRepository();
        }
        aa = F;
        this;
        JVM INSTR monitorexit ;
        return aa;
        Exception exception;
        exception;
        throw exception;
    }

    public ab F()
    {
        this;
        JVM INSTR monitorenter ;
        ab ab;
        if (G == null)
        {
            G = new HeartRateExerciseSummaryGreenDaoRepository();
        }
        ab = G;
        this;
        JVM INSTR monitorexit ;
        return ab;
        Exception exception;
        exception;
        throw exception;
    }

    public ac G()
    {
        this;
        JVM INSTR monitorenter ;
        ac ac;
        if (H == null)
        {
            H = new HeartRateZoneGreenDaoRepository();
        }
        ac = H;
        this;
        JVM INSTR monitorexit ;
        return ac;
        Exception exception;
        exception;
        throw exception;
    }

    public u H()
    {
        this;
        JVM INSTR monitorenter ;
        u u1;
        if (I == null)
        {
            I = new FoodLocaleGreenDaoRepository();
        }
        u1 = I;
        this;
        JVM INSTR monitorexit ;
        return u1;
        Exception exception;
        exception;
        throw exception;
    }

    public av I()
    {
        this;
        JVM INSTR monitorenter ;
        av av;
        if (s == null)
        {
            s = new e();
        }
        av = s;
        this;
        JVM INSTR monitorexit ;
        return av;
        Exception exception;
        exception;
        throw exception;
    }

    public c J()
    {
        this;
        JVM INSTR monitorenter ;
        c c1;
        if (J == null)
        {
            J = new c();
        }
        c1 = J;
        this;
        JVM INSTR monitorexit ;
        return c1;
        Exception exception;
        exception;
        throw exception;
    }

    public x K()
    {
        if (K == null)
        {
            K = new FoodRelationGreenDaoRepository();
        }
        return K;
    }

    public at L()
    {
        this;
        JVM INSTR monitorenter ;
        at at;
        if (L == null)
        {
            L = new TimeZoneGreenDaoRepository();
        }
        at = L;
        this;
        JVM INSTR monitorexit ;
        return at;
        Exception exception;
        exception;
        throw exception;
    }

    public h M()
    {
        this;
        JVM INSTR monitorenter ;
        h h1;
        if (M == null)
        {
            M = new BadgeGreenDaoRepository();
        }
        h1 = M;
        this;
        JVM INSTR monitorexit ;
        return h1;
        Exception exception;
        exception;
        throw exception;
    }

    public k N()
    {
        this;
        JVM INSTR monitorenter ;
        k k1;
        if (N == null)
        {
            N = new CheerBadgeRelationGreenDaoRepository();
        }
        k1 = N;
        this;
        JVM INSTR monitorexit ;
        return k1;
        Exception exception;
        exception;
        throw exception;
    }

    public p O()
    {
        this;
        JVM INSTR monitorenter ;
        p p1;
        if (O == null)
        {
            O = new ExerciseEventGreenDaoRepository();
        }
        p1 = O;
        this;
        JVM INSTR monitorexit ;
        return p1;
        Exception exception;
        exception;
        throw exception;
    }

    public r P()
    {
        this;
        JVM INSTR monitorenter ;
        r r1;
        if (Q == null)
        {
            Q = new ExerciseSessionGreenDaoRepository();
        }
        r1 = Q;
        this;
        JVM INSTR monitorexit ;
        return r1;
        Exception exception;
        exception;
        throw exception;
    }

    public q Q()
    {
        this;
        JVM INSTR monitorenter ;
        q q1;
        if (P == null)
        {
            P = new ExerciseSegmentGreenDaoRepository();
        }
        q1 = P;
        this;
        JVM INSTR monitorexit ;
        return q1;
        Exception exception;
        exception;
        throw exception;
    }

    public ar R()
    {
        this;
        JVM INSTR monitorenter ;
        ar ar;
        if (R == null)
        {
            R = new SplitGreenDaoRepository();
        }
        ar = R;
        this;
        JVM INSTR monitorexit ;
        return ar;
        Exception exception;
        exception;
        throw exception;
    }

    public void S()
    {
        DataCache.a().f();
        DaoFactory.getInstance().cleanUpStore();
    }

    public ao a(Class class1)
    {
        Object obj = null;
        if (com/fitbit/data/domain/TimeSeriesObject.isAssignableFrom(class1))
        {
            obj = r();
        } else
        if (com/fitbit/data/domain/WeightLogEntry.isAssignableFrom(class1))
        {
            obj = l();
        } else
        if (com/fitbit/data/domain/WaterLogEntry.isAssignableFrom(class1))
        {
            obj = h();
        } else
        if (com/fitbit/data/domain/ActivityLogEntry.isAssignableFrom(class1))
        {
            obj = d();
        } else
        if (com/fitbit/data/domain/FoodLogEntry.isAssignableFrom(class1))
        {
            obj = e();
        } else
        if (com/fitbit/data/domain/FoodItem.isAssignableFrom(class1))
        {
            obj = f();
        } else
        if (com/fitbit/data/domain/Profile.isAssignableFrom(class1))
        {
            obj = i();
        } else
        if (com/fitbit/data/domain/BodyFatLogEntry.isAssignableFrom(class1))
        {
            obj = n();
        } else
        if (com/fitbit/data/domain/SleepLogEntry.isAssignableFrom(class1))
        {
            obj = y();
        } else
        if (com/fitbit/data/domain/Alarm.isAssignableFrom(class1))
        {
            obj = j();
        } else
        if (com/fitbit/data/domain/RankedUser.isAssignableFrom(class1))
        {
            obj = z();
        } else
        if (com/fitbit/data/domain/Notification.isAssignableFrom(class1))
        {
            obj = B();
        } else
        if (com/fitbit/data/domain/Friendship.isAssignableFrom(class1))
        {
            obj = A();
        } else
        if (com/fitbit/data/domain/PedometerMinuteData.isAssignableFrom(class1))
        {
            obj = D();
        } else
        if (com/fitbit/data/domain/FoodRelation.isAssignableFrom(class1))
        {
            obj = K();
        } else
        if (com/fitbit/runtrack/data/ExerciseSession.isAssignableFrom(class1))
        {
            obj = P();
        } else
        if (com/fitbit/runtrack/data/ExerciseSegment.isAssignableFrom(class1))
        {
            obj = Q();
        } else
        if (com/fitbit/runtrack/data/ExerciseEvent.isAssignableFrom(class1))
        {
            obj = O();
        } else
        if (com/fitbit/runtrack/Split.isAssignableFrom(class1))
        {
            obj = R();
        }
        if (obj != null)
        {
            return ((ao) (obj));
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("add your Repository for class ").append(class1).toString());
        }
    }

    public com.fitbit.data.repo.b b()
    {
        this;
        JVM INSTR monitorenter ;
        com.fitbit.data.repo.b b1;
        if (b == null)
        {
            b = new ActivityItemGreenDaoRepository();
        }
        b1 = b;
        this;
        JVM INSTR monitorexit ;
        return b1;
        Exception exception;
        exception;
        throw exception;
    }

    public com.fitbit.data.repo.c c()
    {
        this;
        JVM INSTR monitorenter ;
        com.fitbit.data.repo.c c1;
        if (c == null)
        {
            c = new ActivityLevelGreenDaoRepository();
        }
        c1 = c;
        this;
        JVM INSTR monitorexit ;
        return c1;
        Exception exception;
        exception;
        throw exception;
    }

    public d d()
    {
        this;
        JVM INSTR monitorenter ;
        d d1;
        if (d == null)
        {
            d = new ActivityLogEntryGreenDaoRepository();
        }
        d1 = d;
        this;
        JVM INSTR monitorexit ;
        return d1;
        Exception exception;
        exception;
        throw exception;
    }

    public v e()
    {
        this;
        JVM INSTR monitorenter ;
        v v1;
        if (e == null)
        {
            e = new FoodLogEntryGreenDaoRepository();
        }
        v1 = e;
        this;
        JVM INSTR monitorexit ;
        return v1;
        Exception exception;
        exception;
        throw exception;
    }

    public t f()
    {
        this;
        JVM INSTR monitorenter ;
        t t1;
        if (f == null)
        {
            f = new FoodItemGreenDaoRepository();
        }
        t1 = f;
        this;
        JVM INSTR monitorexit ;
        return t1;
        Exception exception;
        exception;
        throw exception;
    }

    public w g()
    {
        this;
        JVM INSTR monitorenter ;
        w w1;
        if (l == null)
        {
            l = new FoodMeasurementUnitGreenDaoRepository();
        }
        w1 = l;
        this;
        JVM INSTR monitorexit ;
        return w1;
        Exception exception;
        exception;
        throw exception;
    }

    public aw h()
    {
        if (g == null)
        {
            g = new WaterLogEntryGreenDaoRepository();
        }
        return g;
    }

    public am i()
    {
        if (h == null)
        {
            h = new ProfileGreenDaoRepository();
        }
        return h;
    }

    public g j()
    {
        if (z == null)
        {
            z = new AlarmGreenDaoRepository();
        }
        return z;
    }

    public z k()
    {
        if (i == null)
        {
            i = new GoalGreenDaoRepository();
        }
        return i;
    }

    public ax l()
    {
        if (j == null)
        {
            j = new WeightLogEntryGreenDaoRepository();
        }
        return j;
    }

    public com.fitbit.data.repo.e m()
    {
        if (o == null)
        {
            o = new b();
        }
        return o;
    }

    public i n()
    {
        if (x == null)
        {
            x = new BodyFatGreenDaoRepository();
        }
        return x;
    }

    public af o()
    {
        if (m == null)
        {
            m = new MealGreenDaoRepository();
        }
        return m;
    }

    public ae p()
    {
        if (n == null)
        {
            n = new MealItemGreenDaoRepository();
        }
        return n;
    }

    public s q()
    {
        if (k == null)
        {
            k = new FavoriteFoodGreenDaoRepository();
        }
        return k;
    }

    public as r()
    {
        if (p == null)
        {
            p = new TimeSeriesGreenDaoRepository();
        }
        return p;
    }

    public as s()
    {
        if (q == null)
        {
            q = new SwapTimeSeriesGreenDaoRepository();
        }
        return q;
    }

    public n t()
    {
        if (r == null)
        {
            r = new DeviceGreenDaoRepository();
        }
        return r;
    }

    public au u()
    {
        if (C == null)
        {
            C = new TrackerSettingsGreenDaoRepository();
        }
        return C;
    }

    public ah v()
    {
        if (t == null)
        {
            t = new MostRecentActivitiesGreenDaoRepository();
        }
        return t;
    }

    public aj w()
    {
        if (u == null)
        {
            u = new OperationsQueueGreenDaoRepository();
        }
        return u;
    }

    public al x()
    {
        if (v == null)
        {
            v = new PendingPlanGreenDaoRepository();
        }
        return v;
    }

    public com.fitbit.data.repo.aq y()
    {
        if (w == null)
        {
            w = new SleepLogEntryGreenDaoRepository();
        }
        return w;
    }

    public an z()
    {
        this;
        JVM INSTR monitorenter ;
        an an;
        if (y == null)
        {
            y = new RankedUserGreenDaoRepository();
        }
        an = y;
        this;
        JVM INSTR monitorexit ;
        return an;
        Exception exception;
        exception;
        throw exception;
    }

}
