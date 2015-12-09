// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack;

import android.location.Location;
import android.util.Pair;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.Profile;
import com.fitbit.runtrack.data.ExerciseEvent;
import com.fitbit.runtrack.data.ExerciseSegment;
import com.fitbit.runtrack.data.ExerciseSession;
import com.fitbit.runtrack.data.ExerciseStat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.fitbit.runtrack:
//            d, Split, Duration

public class i
{

    final d a;
    private final UUID b;
    private final List c;
    private final double d;
    private Pair e;
    private d f;

    public i(ExerciseSession exercisesession, Profile profile, List list)
    {
        b = exercisesession.getUuid();
        c = new ArrayList(list);
        a = new d(b);
        exercisesession = list.iterator();
        long l = 0L;
        for (; exercisesession.hasNext(); d().a((Location)e.first))
        {
            list = (Split)exercisesession.next();
            ExerciseStat exercisestat = list.b();
            ExerciseStat exercisestat1 = a.b();
            l += exercisestat.c().a(TimeUnit.MILLISECONDS);
            a.b(a(exercisestat1.d()) + a(exercisestat.d()));
            a.a(a(exercisestat1.a()) + a(exercisestat.a()));
            a.c(exercisestat1.b() + exercisestat.b());
            e = Pair.create(list.a(), exercisestat);
            a.a((Location)e.first);
        }

        a.a(new Duration(l));
        d = (new Length(1.0D, profile.t())).a(com.fitbit.data.domain.Length.LengthUnits.METERS).b();
    }

    private double a(double d1, double d2, double d3, double d4)
    {
        return ((d2 - d1) * d4) / d3;
    }

    private double a(Length length)
    {
        if (length == null || Double.isNaN(length.b()))
        {
            return 0.0D;
        } else
        {
            return length.a(com.fitbit.data.domain.Length.LengthUnits.METERS).b();
        }
    }

    private Location a(Location location, Location location1, double d1, double d2)
    {
        double d3 = a(location.getLongitude(), location1.getLongitude(), d1, d2);
        double d4 = a(location.getLatitude(), location1.getLatitude(), d1, d2);
        double d5 = a(location.getTime(), location1.getTime(), d1, d2);
        d1 = a(location.getAltitude(), location1.getAltitude(), d1, d2);
        location1 = new Location(location);
        location1.setLatitude(location.getLatitude() + d4);
        location1.setLongitude(location.getLongitude() + d3);
        location1.setTime((long)((double)location.getTime() + d5));
        location1.setAltitude(d1 + location.getAltitude());
        return location1;
    }

    private void a(Pair pair)
    {
        Object obj = e;
        double d1;
        for (d1 = ((ExerciseStat)pair.second).a().b(); d1 >= d; d1 -= d)
        {
            double d2 = ((ExerciseStat)((Pair) (obj)).second).a().b();
            if (Double.isNaN(d2))
            {
                d2 = 0.0D;
            }
            double d4 = d1 - d2;
            double d5 = d4 / (double)TimeUnit.SECONDS.convert(((Location)pair.first).getTime() - ((Location)((Pair) (obj)).first).getTime(), TimeUnit.MILLISECONDS);
            d2 = d - d2;
            long l = TimeUnit.MILLISECONDS.convert((long)Math.rint(d2 / d5), TimeUnit.SECONDS);
            ExerciseStat exercisestat = (ExerciseStat)pair.second;
            Length length = new Length(a(((ExerciseStat)((Pair) (obj)).second).d().b(), exercisestat.d().b(), d1, d2), com.fitbit.data.domain.Length.LengthUnits.METERS);
            Object obj1 = new Duration(((ExerciseStat)((Pair) (obj)).second).c().a(TimeUnit.MILLISECONDS) + l);
            d5 = ((ExerciseStat)((Pair) (obj)).second).b();
            d5 = a(((ExerciseStat)((Pair) (obj)).second).b(), exercisestat.b(), d1, d2) + d5;
            obj = a((Location)((Pair) (obj)).first, (Location)pair.first, d4, d2);
            l = c.size();
            obj1 = new Split(((Location) (obj)), new ExerciseStat(exercisestat.b, Long.valueOf(l), new Length(d, com.fitbit.data.domain.Length.LengthUnits.METERS), length, ((Duration) (obj1)), d5));
            c.add(obj1);
            obj = Pair.create(obj, new ExerciseStat(exercisestat.b, null, new Length(0.0D, com.fitbit.data.domain.Length.LengthUnits.METERS), length, new Duration(0L), d5));
        }

        f = new d(b);
        f.a(d1);
        Duration duration = new Duration(((Location)pair.first).getTime() - ((Location)((Pair) (obj)).first).getTime());
        f.a(duration);
        f.a((Location)pair.first);
        f.b(((Location)pair.first).getAltitude() - ((Location)((Pair) (obj)).first).getAltitude());
        Length length1 = new Length(((ExerciseStat)pair.second).d().b() - ((ExerciseStat)((Pair) (obj)).second).d().b(), com.fitbit.data.domain.Length.LengthUnits.METERS);
        double d3 = ((ExerciseStat)pair.second).b() - ((ExerciseStat)((Pair) (obj)).second).b();
        f.c(d3);
        obj = new ExerciseStat(((ExerciseStat)pair.second).b, ((ExerciseStat)pair.second).a, new Length(d1, com.fitbit.data.domain.Length.LengthUnits.METERS), length1, duration, d3);
        e = Pair.create(pair.first, obj);
    }

    private d d()
    {
        if (f == null)
        {
            f = new d(b);
        }
        return f;
    }

    public Split a(long l)
    {
        long l1 = a.c().a(TimeUnit.MILLISECONDS);
        a.a(new Duration(l));
        Object obj = d().c().a(Long.valueOf(l - l1));
        d().a(((Duration) (obj)));
        obj = d().a(Long.valueOf(c.size()));
        if (e != null && ((ExerciseStat) (obj)).a() != null && ((ExerciseStat) (obj)).a().a(com.fitbit.data.domain.Length.LengthUnits.METERS).b() > 0.0D)
        {
            return new Split((Location)e.first, ((ExerciseStat) (obj)));
        } else
        {
            return null;
        }
    }

    public ExerciseStat a()
    {
        return a.b();
    }

    public void a(ExerciseEvent exerciseevent)
    {
        if (e != null && ((Location)e.first).getTime() == exerciseevent.location.getTime())
        {
            return;
        }
        a.a(exerciseevent);
        Object obj = d();
        ((d) (obj)).a(exerciseevent);
        obj = ((d) (obj)).a(exerciseevent.getEntityId());
        if (((ExerciseStat) (obj)).a().a(com.fitbit.data.domain.Length.LengthUnits.METERS).b() >= d)
        {
            a(Pair.create(exerciseevent.location, obj));
            return;
        } else
        {
            e = Pair.create(exerciseevent.location, obj);
            return;
        }
    }

    public void a(ExerciseSegment exercisesegment, ExerciseEvent exerciseevent)
    {
        long l = exercisesegment.c().getTime();
        a.a(l);
        if (!c.isEmpty() && ((Split)c.get(c.size() - 1)).a().getTime() > exerciseevent.location.getTime())
        {
            exercisesegment = (Split)c.get(c.size() - 1);
            e = Pair.create(exercisesegment.a(), exercisesegment.b());
        } else
        {
            e = Pair.create(exerciseevent.location, d().a(exerciseevent.getEntityId()));
        }
        d().a((Location)e.first);
        a.a((Location)e.first);
        if (d().a() <= l)
        {
            d().a(l);
        }
    }

    public List b()
    {
        return Collections.unmodifiableList(c);
    }

    public Location c()
    {
        return (Location)e.first;
    }
}
