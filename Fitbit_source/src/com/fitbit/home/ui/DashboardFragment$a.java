// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.support.v4.util.LongSparseArray;
import android.util.Pair;
import com.fitbit.data.bl.ActivityBusinessLogic;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.ay;
import com.fitbit.data.bl.f;
import com.fitbit.data.bl.gb;
import com.fitbit.data.bl.gd;
import com.fitbit.data.bl.t;
import com.fitbit.data.bl.u;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.Type;
import com.fitbit.data.domain.WaterLogEntry;
import com.fitbit.data.domain.b;
import com.fitbit.e.a;
import com.fitbit.home.ui.tiles.e;
import com.fitbit.runtrack.data.ExerciseStat;
import com.fitbit.util.bg;
import com.fitbit.water.Water;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.Callable;

// Referenced classes of package com.fitbit.home.ui:
//            DashboardFragment

public static class d
    implements Callable
{

    private final Calendar a;
    private final Date b;
    private final boolean c;
    private final boolean d;

    private com.fitbit.home.ui.tiles.ts a(Date date, Profile profile)
    {
        profile = new com.fitbit.home.ui.tiles.ts();
        gd gd1 = gd.a();
        f f1 = f.a();
        Object obj = new GregorianCalendar();
        ((Calendar) (obj)).setTime(date);
        ((Calendar) (obj)).add(5, -1);
        obj = ((Calendar) (obj)).getTime();
        profile.ts = t.a().b();
        profile.ts = gd1.e(date);
        profile.ts = gd1.e(((Date) (obj)));
        profile.ts = f1.d(date);
        return profile;
    }

    private void a(e e1)
    {
        Iterator iterator = gb.a().a(b).iterator();
        double d1;
        for (d1 = 0.0D; iterator.hasNext(); d1 = ((WaterLogEntry)iterator.next()).e().a(com.fitbit.data.domain.nits.ML).b() + d1) { }
        e1.o = new Water(d1, com.fitbit.data.domain.nits.ML);
    }

    public e a()
        throws Exception
    {
        bg bg1 = new bg("DashboardFragment", true);
        e e1 = new e();
        e1.b = a;
        e1.c = an.a().b();
        e1.d = d;
        e1.a = c;
        e1.g = t.a().e(b);
        e1.h = t.a().f(b);
        e1.e = t.a().c(b);
        e1.f = t.a().a(b);
        e1.i = t.a().d(b);
        e1.m = t.a().b(b);
        e1.j = t.a().g(b);
        e1.k = t.a().h(b);
        e1.n = a(b, e1.c);
        e1.p = ay.a().b(b);
        e1.q = ActivityBusinessLogic.a().a(b);
        e1.r.clear();
        Iterator iterator = e1.q.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ActivityLogEntry activitylogentry = (ActivityLogEntry)iterator.next();
            if (activitylogentry.f())
            {
                Object obj = activitylogentry.p();
                if (obj != null)
                {
                    Type type = ((b) (obj)).b();
                    switch (com.fitbit.home.ui.b[type.ordinal()])
                    {
                    case 1: // '\001'
                        Object obj1 = new com.fitbit.runtrack.data.b();
                        obj = ((com.fitbit.runtrack.data.b) (obj1)).a(UUID.fromString(((b) (obj)).a()));
                        if (obj != null)
                        {
                            obj1 = (ExerciseStat)((com.fitbit.runtrack.data.b) (obj1)).g(((com.fitbit.runtrack.data.ExerciseSession) (obj))).first;
                            e1.r.put(activitylogentry.getEntityId().longValue(), new com.fitbit.home.ui.tiles.tityId(((com.fitbit.runtrack.data.ExerciseSession) (obj)), ((ExerciseStat) (obj1))));
                        }
                        break;
                    }
                }
            }
        } while (true);
        boolean flag;
        if (com.fitbit.data.bl.b.a().c() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e1.t = flag;
        e1.s = u.a().a(b);
        a(e1);
        com.fitbit.e.a.a("DashboardFragment", "Current device timezone: %s", new Object[] {
            TimeZone.getDefault().getDisplayName()
        });
        if (e1.c != null && e1.c.L() != null)
        {
            com.fitbit.e.a.a("DashboardFragment", "Current profile timezone: %s", new Object[] {
                e1.c.L().c()
            });
        }
        bg1.a("dashboard data", com.fitbit.util.format.e.a(a));
        return e1;
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    public (Calendar calendar, boolean flag, boolean flag1)
    {
        a = calendar;
        b = calendar.getTime();
        c = flag;
        d = flag1;
    }
}
