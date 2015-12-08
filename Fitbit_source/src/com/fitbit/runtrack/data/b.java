// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.data;

import android.content.Context;
import android.location.Location;
import android.util.Pair;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.q;
import com.fitbit.data.domain.Length;
import com.fitbit.e.a;
import com.fitbit.runtrack.Duration;
import com.fitbit.runtrack.Split;
import com.fitbit.runtrack.f;
import com.fitbit.runtrack.i;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.fitbit.runtrack.data:
//            ExerciseSession, ExerciseSegment, ExerciseEvent, ExerciseStat

public class b
{

    private static final String a = "LocationBasedExerciseTracker";
    private static final String b = "session_path_%s.png";
    private final q c = q.a();

    public b()
    {
    }

    public static File a(Context context, ExerciseSession exercisesession)
    {
        return context.getFileStreamPath(String.format("session_path_%s.png", new Object[] {
            exercisesession.getUuid()
        }));
    }

    private void a(UUID uuid, i k, long l)
    {
        com.fitbit.e.a.a("LocationBasedExerciseTracker", String.format("Session[%s]: Calculating Splits from time %s onwards.", new Object[] {
            uuid, Long.valueOf(l)
        }), new Object[0]);
        Object obj = new LinkedList();
        uuid = c.d(uuid).iterator();
        do
        {
            if (!uuid.hasNext())
            {
                break;
            }
            ExerciseSegment exercisesegment = (ExerciseSegment)uuid.next();
            if (exercisesegment.a(l))
            {
                ((List) (obj)).add(exercisesegment);
            }
        } while (true);
        com.fitbit.e.a.a("LocationBasedExerciseTracker", String.format("Evaluating %s segments", new Object[] {
            Integer.valueOf(((List) (obj)).size())
        }), new Object[0]);
        List list;
        int i1;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); com.fitbit.e.a.a("LocationBasedExerciseTracker", String.format("Of %s events, only %s were relevant", new Object[] {
    Integer.valueOf(list.size()), Integer.valueOf(i1)
}), new Object[0]))
        {
            ExerciseSegment exercisesegment1 = (ExerciseSegment)((Iterator) (obj)).next();
            list = c.b(exercisesegment1);
            if (exercisesegment1.a())
            {
                uuid = "Completed";
            } else
            {
                uuid = "InComplete";
            }
            com.fitbit.e.a.a("LocationBasedExerciseTracker", String.format("Segment[%s] has %s events", new Object[] {
                uuid, Integer.valueOf(list.size())
            }), new Object[0]);
            k.a(exercisesegment1, (ExerciseEvent)list.get(0));
            uuid = list.iterator();
            int j1;
            for (i1 = 0; uuid.hasNext(); i1 = j1)
            {
                ExerciseEvent exerciseevent = (ExerciseEvent)uuid.next();
                j1 = i1;
                if (exerciseevent.location.getTime() > l)
                {
                    j1 = i1 + 1;
                    k.a(exerciseevent);
                }
            }

        }

    }

    private Pair j(ExerciseSession exercisesession)
    {
        Object obj2 = an.a().b();
        Object obj = c.e(exercisesession.getUuid());
        Object obj1 = c.f(exercisesession.getUuid());
        com.fitbit.e.a.d("LocationBasedExerciseTracker", String.format("Session[%s]: Initial Completed Splits %s and overall %s", new Object[] {
            exercisesession.getUuid(), Integer.valueOf(((List) (obj)).size()), obj1
        }), new Object[0]);
        if (obj1 != null && !((List) (obj)).isEmpty())
        {
            com.fitbit.e.a.d("LocationBasedExerciseTracker", String.format("Session[%s] was considered cached, returning", new Object[] {
                exercisesession.getUuid()
            }), new Object[0]);
            Split split;
            for (obj2 = ((List) (obj)).iterator(); ((Iterator) (obj2)).hasNext(); com.fitbit.e.a.a("LocationBasedExerciseTracker", String.format("Session[%s]-%s - Distance[%s]", new Object[] {
    exercisesession.getUuid(), split.b().a, split.b().a().a(com.fitbit.data.domain.Length.LengthUnits.MILES)
}), new Object[0]))
            {
                split = (Split)((Iterator) (obj2)).next();
            }

            com.fitbit.e.a.a("LocationBasedExerciseTracker", String.format("calculating Splits for Session: Session[%s]-Overall[%s] - Distance[%s] - Time[%s]", new Object[] {
                exercisesession.getUuid(), ((ExerciseStat) (obj1)).a, ((ExerciseStat) (obj1)).a().a(com.fitbit.data.domain.Length.LengthUnits.MILES), Long.valueOf(((ExerciseStat) (obj1)).c().a(TimeUnit.SECONDS))
            }), new Object[0]);
            return Pair.create(obj1, obj);
        }
        obj2 = new i(exercisesession, ((com.fitbit.data.domain.Profile) (obj2)), ((List) (obj)));
        long l = 0L;
        if (!((List) (obj)).isEmpty())
        {
            l = ((Split)((List) (obj)).get(((List) (obj)).size() - 1)).a().getTime();
        }
        a(exercisesession.getUuid(), ((i) (obj2)), l);
        obj1 = new LinkedList(((i) (obj2)).b());
        com.fitbit.e.a.a("LocationBasedExerciseTracker", String.format("Session[%s]: Calculated %s totally complete Splits to persist", new Object[] {
            exercisesession.getUuid(), Integer.valueOf(((List) (obj1)).size())
        }), new Object[0]);
        Split split1;
        for (obj = ((List) (obj1)).iterator(); ((Iterator) (obj)).hasNext(); c.a(split1))
        {
            split1 = (Split)((Iterator) (obj)).next();
        }

        if (exercisesession.a() == ExerciseSession.Status.c)
        {
            com.fitbit.e.a.d("LocationBasedExerciseTracker", String.format("Session[%s] is marked Ended, persisting Overall Stats and remainder data", new Object[] {
                exercisesession.getUuid()
            }), new Object[0]);
            obj = ((i) (obj2)).a(a(c.d(exercisesession.getUuid())));
            if (obj != null)
            {
                c.a(((Split) (obj)));
                ((List) (obj1)).add(obj);
            }
            obj = ((i) (obj2)).a();
            obj2 = ((i) (obj2)).c();
            c.a(new Split(((Location) (obj2)), ((ExerciseStat) (obj))));
        } else
        {
            obj = ((i) (obj2)).a();
        }
        com.fitbit.e.a.a("LocationBasedExerciseTracker", String.format("Full Calculated Splits for Session, Session[%s]-Overall[%s] - Distance[%s] - Time[%s]", new Object[] {
            exercisesession.getUuid(), ((ExerciseStat) (obj)).a, ((ExerciseStat) (obj)).a().a(com.fitbit.data.domain.Length.LengthUnits.MILES), Long.valueOf(((ExerciseStat) (obj)).c().a(TimeUnit.SECONDS))
        }), new Object[0]);
        return Pair.create(obj, obj1);
    }

    public long a(List list)
    {
        if (list.isEmpty())
        {
            return 0L;
        }
        Iterator iterator = list.iterator();
        long l = 0L;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ExerciseSegment exercisesegment = (ExerciseSegment)iterator.next();
            if (exercisesegment.a())
            {
                l = exercisesegment.b() + l;
            }
        } while (true);
        list = (ExerciseSegment)list.get(list.size() - 1);
        long l1 = l;
        if (!list.a())
        {
            l1 = l + ((new f()).a() - list.c().getTime());
        }
        return l1;
    }

    public ExerciseSession a(UUID uuid)
    {
        return c.a(uuid);
    }

    public List a(ExerciseSession.Status status)
    {
        return c.a(status);
    }

    public void a()
    {
        c.b();
    }

    public void a(ExerciseSegment exercisesegment)
    {
        if (exercisesegment.a())
        {
            return;
        } else
        {
            ExerciseEvent exerciseevent = c.a(exercisesegment);
            exerciseevent = c.a(exerciseevent.sessionId, com.fitbit.runtrack.data.ExerciseEvent.Type.a, exerciseevent.location);
            com.fitbit.e.a.d("LocationBasedExerciseTracker", String.format("Ending old Segment with %s[@Time %s]", new Object[] {
                exerciseevent.type, Long.valueOf(exerciseevent.location.getTime())
            }), new Object[0]);
            exercisesegment.a(exerciseevent.getEntityId().longValue(), new Date(exerciseevent.location.getTime()));
            c.c(exercisesegment);
            return;
        }
    }

    public void a(ExerciseSession exercisesession)
    {
        exercisesession.d();
        c.b(exercisesession);
        Object obj = exercisesession.getUuid();
        Object obj1 = new LinkedList(c.d(((UUID) (obj))));
        if (!((LinkedList) (obj1)).isEmpty())
        {
            obj1 = (ExerciseSegment)((LinkedList) (obj1)).getLast();
            if (!((ExerciseSegment) (obj1)).a())
            {
                ExerciseEvent exerciseevent = c.a(((ExerciseSegment) (obj1)));
                obj = c.a(((UUID) (obj)), com.fitbit.runtrack.data.ExerciseEvent.Type.a, exerciseevent.location);
                ((ExerciseSegment) (obj1)).a(((ExerciseEvent) (obj)).getEntityId().longValue(), new Date(((ExerciseEvent) (obj)).location.getTime()));
                c.c(((ExerciseSegment) (obj1)));
            }
            ArrayList arraylist = new ArrayList();
            obj1 = null;
            Iterator iterator1 = c.c(exercisesession).iterator();
            do
            {
                obj = obj1;
                if (!iterator1.hasNext())
                {
                    break;
                }
                obj = (ExerciseEvent)iterator1.next();
                if (((ExerciseEvent) (obj)).location != null && !Double.isNaN(((ExerciseEvent) (obj)).location.getLongitude()) && !Double.isNaN(((ExerciseEvent) (obj)).location.getLatitude()))
                {
                    break;
                }
                arraylist.add(obj);
            } while (true);
            if (obj != null && !arraylist.isEmpty())
            {
                ExerciseEvent exerciseevent1;
                long l;
                for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); exerciseevent1.location.setTime(l))
                {
                    exerciseevent1 = (ExerciseEvent)iterator.next();
                    l = exerciseevent1.location.getTime();
                    exerciseevent1.location.set(((ExerciseEvent) (obj)).location);
                }

                c.a(arraylist);
            }
        }
        j(exercisesession);
    }

    public void a(ExerciseSession exercisesession, long l)
    {
        ExerciseSession exercisesession1 = c.a(l);
        if (exercisesession1 != null && !exercisesession.getUuid().equals(exercisesession1.getUuid()))
        {
            h(exercisesession1);
        }
        c.a(exercisesession, l);
    }

    public void a(ExerciseSession exercisesession, Location location)
    {
        ExerciseEvent.Type type = ExerciseEvent.Type.b;
        Location location1 = location;
        if (location == null)
        {
            type = com.fitbit.runtrack.data.ExerciseEvent.Type.a;
            location1 = new Location(type.label);
            location1.setLatitude((0.0D / 0.0D));
            location1.setLongitude((0.0D / 0.0D));
            location1.setAccuracy((0.0F / 0.0F));
            location1.setAltitude((0.0D / 0.0D));
        }
        if (exercisesession.a() == com.fitbit.runtrack.data.ExerciseSession.Status.a)
        {
            exercisesession.b();
            c.b(exercisesession);
        }
        if (c.d(exercisesession.getUuid()).isEmpty())
        {
            location = c.a(exercisesession.getUuid(), type, location1);
            exercisesession = new ExerciseSegment(exercisesession.getUuid(), location.getEntityId().longValue(), new Date(location1.getTime()), 0L, null);
            c.c(exercisesession);
        }
    }

    public boolean a(int k, ExerciseSession exercisesession)
    {
        return c.a(k, exercisesession);
    }

    public boolean a(Date date, ExerciseSession exercisesession)
    {
        return c.b(exercisesession, date.getTime()) != null;
    }

    public ExerciseEvent b(ExerciseSession exercisesession, Location location)
    {
        exercisesession = c.a(exercisesession.getUuid(), ExerciseEvent.Type.b, location);
        com.fitbit.e.a.a("LocationBasedExerciseTracker", String.format("Recorded Event with %s[@Time%s]", new Object[] {
            ((ExerciseEvent) (exercisesession)).type, Long.valueOf(((ExerciseEvent) (exercisesession)).location.getTime())
        }), new Object[0]);
        return exercisesession;
    }

    public ExerciseSegment b(ExerciseSession exercisesession)
    {
        UUID uuid = exercisesession.getUuid();
        Object obj = (ExerciseSegment)(new LinkedList(c.d(uuid))).removeLast();
        ExerciseEvent exerciseevent;
        if (((ExerciseSegment) (obj)).a())
        {
            exerciseevent = c.c(uuid);
            com.fitbit.e.a.d("LocationBasedExerciseTracker", "Starting New Segment as expected with mostRecentLocation Recorded", new Object[0]);
        } else
        {
            exerciseevent = c.a(((ExerciseSegment) (obj)));
            exerciseevent = c.a(((ExerciseSegment) (obj)).sessionId, com.fitbit.runtrack.data.ExerciseEvent.Type.a, exerciseevent.location);
            ((ExerciseSegment) (obj)).a(exerciseevent.getEntityId().longValue(), new Date(exerciseevent.location.getTime()));
            c.c(((ExerciseSegment) (obj)));
            com.fitbit.e.a.d("LocationBasedExerciseTracker", "Ending current Segment with last location in segment", new Object[0]);
        }
        obj = exerciseevent;
        if (exerciseevent == null)
        {
            obj = c.c(uuid);
            com.fitbit.e.a.d("LocationBasedExerciseTracker", "Starting New Segment unexpectedly with mostRecentLocation Recorded", new Object[0]);
        }
        com.fitbit.e.a.d("LocationBasedExerciseTracker", String.format("Starting new Segment with %s[@Time %s]", new Object[] {
            ((ExerciseEvent) (obj)).type, Long.valueOf(((ExerciseEvent) (obj)).location.getTime())
        }), new Object[0]);
        exerciseevent = c.a(uuid, com.fitbit.runtrack.data.ExerciseEvent.Type.a, ((ExerciseEvent) (obj)).location);
        exercisesession = new ExerciseSegment(exercisesession.getUuid(), exerciseevent.getEntityId().longValue(), new Date(exerciseevent.location.getTime()), 0L, null);
        c.c(exercisesession);
        return exercisesession;
    }

    public List b(ExerciseSegment exercisesegment)
    {
        return c.b(exercisesegment);
    }

    public void b()
    {
        ExerciseSession.Status astatus[] = ExerciseSession.Status.values();
        int l = astatus.length;
        for (int k = 0; k < l; k++)
        {
            Object obj = astatus[k];
            ExerciseSession exercisesession;
            for (obj = c.a(((ExerciseSession.Status) (obj))).iterator(); ((Iterator) (obj)).hasNext(); c.a(exercisesession))
            {
                exercisesession = (ExerciseSession)((Iterator) (obj)).next();
            }

        }

    }

    public long c(ExerciseSession exercisesession)
    {
        return a(c.d(exercisesession));
    }

    public ExerciseEvent d(ExerciseSession exercisesession)
    {
        Object obj = null;
        List list = c.d(exercisesession);
        exercisesession = obj;
        if (!list.isEmpty())
        {
            exercisesession = c.a((ExerciseSegment)list.get(list.size() - 1));
        }
        return exercisesession;
    }

    public List e(ExerciseSession exercisesession)
    {
        List list = Collections.emptyList();
        Iterator iterator = c.d(exercisesession).iterator();
        exercisesession = list;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (ExerciseSegment)iterator.next();
            obj = c.b(((ExerciseSegment) (obj)));
            if (!((List) (obj)).isEmpty())
            {
                if (exercisesession.isEmpty())
                {
                    exercisesession = new LinkedList();
                }
                exercisesession.addAll(((java.util.Collection) (obj)));
            }
        } while (true);
        return exercisesession;
    }

    public List f(ExerciseSession exercisesession)
    {
        return c.c(exercisesession);
    }

    public Pair g(ExerciseSession exercisesession)
    {
        com.fitbit.e.a.a("LocationBasedExerciseTracker", String.format("getStats() beginning! Session status: %s", new Object[] {
            exercisesession.a()
        }), new Object[0]);
        exercisesession = j(exercisesession);
        com.fitbit.e.a.a("LocationBasedExerciseTracker", String.format("getStats() end! %s Splits after processing", new Object[] {
            Integer.valueOf(((List)((Pair) (exercisesession)).second).size())
        }), new Object[0]);
        return exercisesession;
    }

    public void h(ExerciseSession exercisesession)
    {
        q.a().a(exercisesession);
    }

    public List i(ExerciseSession exercisesession)
    {
        return c.d(exercisesession);
    }
}
