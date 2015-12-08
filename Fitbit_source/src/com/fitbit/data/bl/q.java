// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.location.Location;
import com.fitbit.data.domain.Entity;
import com.fitbit.data.repo.ao;
import com.fitbit.data.repo.ar;
import com.fitbit.data.repo.greendao.DaoFactory;
import com.fitbit.data.repo.greendao.exercise.DaoSession;
import com.fitbit.data.repo.p;
import com.fitbit.data.repo.r;
import com.fitbit.runtrack.Split;
import com.fitbit.runtrack.data.ExerciseEvent;
import com.fitbit.runtrack.data.ExerciseSegment;
import com.fitbit.runtrack.data.ExerciseSession;
import com.fitbit.runtrack.data.ExerciseStat;
import com.fitbit.runtrack.f;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.fitbit.data.bl:
//            aq

public class q
{

    private static q a = null;
    private final ar b = aq.a().R();
    private final p c = aq.a().O();
    private final r d = aq.a().P();
    private final com.fitbit.data.repo.q e = aq.a().Q();
    private final f f = new f();

    public q()
    {
    }

    public static q a()
    {
        if (a == null)
        {
            a = new q();
        }
        return a;
    }

    static ar a(q q1)
    {
        return q1.b;
    }

    private void a(Entity entity)
    {
        ao ao1 = aq.a().a(entity.getClass());
        if (entity.isNew())
        {
            ao1.add(entity);
            return;
        } else
        {
            ao1.save(entity);
            return;
        }
    }

    static com.fitbit.data.repo.q b(q q1)
    {
        return q1.e;
    }

    static p c(q q1)
    {
        return q1.c;
    }

    static r d(q q1)
    {
        return q1.d;
    }

    public ExerciseEvent a(ExerciseSegment exercisesegment)
    {
        return c.getLastEventInSegment(exercisesegment);
    }

    public ExerciseEvent a(UUID uuid, com.fitbit.runtrack.data.ExerciseEvent.Type type, Location location)
    {
        if (type == com.fitbit.runtrack.data.ExerciseEvent.Type.a)
        {
            location.setTime(f.a());
        }
        return c.recordEvent(uuid, type, location);
    }

    public ExerciseSession a(long l)
    {
        return (ExerciseSession)d.getByServerId(l);
    }

    public ExerciseSession a(UUID uuid)
    {
        return (ExerciseSession)d.getByUUID(uuid);
    }

    public List a(com.fitbit.runtrack.data.ExerciseSession.Status status)
    {
        return d.getSessions(status);
    }

    public void a(Split split)
    {
        Split split1 = b.getSplit(split.b().e(), split.b().f());
        if (split1 != null)
        {
            split.setEntityId(split1.getEntityId());
            if (split1.b().f() == null)
            {
                ExerciseStat exercisestat = split1.b();
                if (exercisestat.a() != null)
                {
                    split.b().a(exercisestat.a());
                }
                if (exercisestat.c() != null)
                {
                    split.b().a(exercisestat.c());
                }
                split.setEntityId(split1.getEntityId());
            }
        }
        a(((Entity) (split)));
    }

    public void a(ExerciseSession exercisesession)
    {
        DaoFactory.getInstance().getExerciseSession().runInTx(new Runnable(exercisesession) {

            final ExerciseSession a;
            final q b;

            public void run()
            {
                Split split;
                for (Iterator iterator = q.a(b).getCompletedSplits(a.getUuid()).iterator(); iterator.hasNext(); q.a(b).delete(split))
                {
                    split = (Split)iterator.next();
                }

                ExerciseSegment exercisesegment;
                for (Iterator iterator1 = q.b(b).getSegmentsInSession(a.getUuid()).iterator(); iterator1.hasNext(); q.b(b).delete(exercisesegment))
                {
                    exercisesegment = (ExerciseSegment)iterator1.next();
                }

                ExerciseEvent exerciseevent;
                for (Iterator iterator2 = q.c(b).getEventsInSession(a.getUuid()).iterator(); iterator2.hasNext(); q.c(b).delete(exerciseevent))
                {
                    exerciseevent = (ExerciseEvent)iterator2.next();
                }

                q.d(b).delete(a);
            }

            
            {
                b = q.this;
                a = exercisesession;
                super();
            }
        });
    }

    public void a(ExerciseSession exercisesession, long l)
    {
        exercisesession.setServerId(l);
        a(((Entity) (exercisesession)));
    }

    public void a(List list)
    {
        for (list = list.iterator(); list.hasNext(); a(((Entity) ((ExerciseEvent)list.next())))) { }
    }

    public boolean a(int i, ExerciseSession exercisesession)
    {
        return d.updateCueIndex(exercisesession, i);
    }

    public ExerciseSegment b(ExerciseSession exercisesession, long l)
    {
        return e.getSegmentForTime(exercisesession.getUuid(), l);
    }

    public List b(ExerciseSegment exercisesegment)
    {
        return c.getAllEventsInSegment(exercisesegment);
    }

    public List b(UUID uuid)
    {
        return c.getEventsInSession(uuid);
    }

    public void b()
    {
        b.clear(false);
    }

    public void b(ExerciseSession exercisesession)
    {
        ExerciseSession exercisesession1 = (ExerciseSession)d.getByUUID(exercisesession.getUuid());
        if (exercisesession1 != null)
        {
            exercisesession.setEntityId(exercisesession1.getEntityId());
        }
        a(exercisesession);
    }

    public ExerciseEvent c(UUID uuid)
    {
        return c.getMostRecentEvent(uuid);
    }

    public List c(ExerciseSession exercisesession)
    {
        return b(exercisesession.getUuid());
    }

    public void c(ExerciseSegment exercisesegment)
    {
        ExerciseSegment exercisesegment1 = e.getSegment(exercisesegment.g(), exercisesegment.e());
        if (exercisesegment1 != null)
        {
            exercisesegment.setEntityId(exercisesegment1.getEntityId());
        }
        a(exercisesegment);
    }

    public List d(ExerciseSession exercisesession)
    {
        return d(exercisesession.getUuid());
    }

    public List d(UUID uuid)
    {
        return e.getSegmentsInSession(uuid);
    }

    public List e(UUID uuid)
    {
        return b.getCompletedSplits(uuid);
    }

    public ExerciseStat f(UUID uuid)
    {
        return b.getOverallStat(uuid);
    }

}
