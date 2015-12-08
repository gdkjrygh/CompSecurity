// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.runtrack.data.ExerciseSegment;
import java.util.UUID;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper

public class ExerciseSegmentMapper
    implements EntityMapper
{

    public ExerciseSegmentMapper()
    {
    }

    public ExerciseSegment fromDbEntity(com.fitbit.data.repo.greendao.exercise.ExerciseSegment exercisesegment)
    {
        if (exercisesegment == null)
        {
            return null;
        } else
        {
            ExerciseSegment exercisesegment1 = new ExerciseSegment(UUID.fromString(exercisesegment.getSessionId()), exercisesegment.getStartEventId().longValue(), exercisesegment.getStartTime(), exercisesegment.getEndEventId().longValue(), exercisesegment.getStopTime());
            exercisesegment1.setEntityId(exercisesegment.getId());
            return exercisesegment1;
        }
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((com.fitbit.data.repo.greendao.exercise.ExerciseSegment)obj);
    }

    public com.fitbit.data.repo.greendao.exercise.ExerciseSegment toDbEntity(ExerciseSegment exercisesegment)
    {
        return toDbEntity(exercisesegment, new com.fitbit.data.repo.greendao.exercise.ExerciseSegment());
    }

    public com.fitbit.data.repo.greendao.exercise.ExerciseSegment toDbEntity(ExerciseSegment exercisesegment, com.fitbit.data.repo.greendao.exercise.ExerciseSegment exercisesegment1)
    {
        if (exercisesegment == null)
        {
            return null;
        }
        com.fitbit.data.repo.greendao.exercise.ExerciseSegment exercisesegment2 = exercisesegment1;
        if (exercisesegment1 == null)
        {
            exercisesegment2 = new com.fitbit.data.repo.greendao.exercise.ExerciseSegment();
        }
        if (exercisesegment2.getId() == null)
        {
            exercisesegment2.setId(exercisesegment.getEntityId());
        }
        exercisesegment2.setSessionId(String.valueOf(exercisesegment.g()));
        exercisesegment2.setStartEventId(Long.valueOf(exercisesegment.e()));
        exercisesegment2.setStartTime(exercisesegment.c());
        exercisesegment2.setEndEventId(Long.valueOf(exercisesegment.f()));
        exercisesegment2.setStopTime(exercisesegment.d());
        return exercisesegment2;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((ExerciseSegment)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((ExerciseSegment)obj, (com.fitbit.data.repo.greendao.exercise.ExerciseSegment)obj1);
    }
}
