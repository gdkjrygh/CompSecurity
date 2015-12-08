// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.runtrack.data.ExerciseSession;
import java.util.UUID;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper

public class ExerciseSessionMapper
    implements EntityMapper
{

    public ExerciseSessionMapper()
    {
    }

    public ExerciseSession fromDbEntity(com.fitbit.data.repo.greendao.exercise.ExerciseSession exercisesession)
    {
        if (exercisesession == null)
        {
            return null;
        } else
        {
            ExerciseSession exercisesession1 = new ExerciseSession(UUID.fromString(exercisesession.getUuid()), com.fitbit.runtrack.data.ExerciseSession.Status.a(exercisesession.getStatus()), exercisesession.getStartTime(), exercisesession.getStopTime(), exercisesession.getCueIndex().intValue(), exercisesession.getActivityType(), exercisesession.getWireId());
            exercisesession1.setEntityId(exercisesession.getId());
            return exercisesession1;
        }
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((com.fitbit.data.repo.greendao.exercise.ExerciseSession)obj);
    }

    public com.fitbit.data.repo.greendao.exercise.ExerciseSession toDbEntity(ExerciseSession exercisesession)
    {
        return toDbEntity(exercisesession, new com.fitbit.data.repo.greendao.exercise.ExerciseSession());
    }

    public com.fitbit.data.repo.greendao.exercise.ExerciseSession toDbEntity(ExerciseSession exercisesession, com.fitbit.data.repo.greendao.exercise.ExerciseSession exercisesession1)
    {
        if (exercisesession == null)
        {
            return null;
        }
        com.fitbit.data.repo.greendao.exercise.ExerciseSession exercisesession2 = exercisesession1;
        if (exercisesession1 == null)
        {
            exercisesession2 = new com.fitbit.data.repo.greendao.exercise.ExerciseSession();
        }
        if (exercisesession2.getId() == null)
        {
            exercisesession2.setId(exercisesession.getEntityId());
        }
        exercisesession2.setUuid(String.valueOf(exercisesession.getUuid()));
        exercisesession2.setStatus(exercisesession.a().statusLabel);
        exercisesession2.setStartTime(exercisesession.c());
        exercisesession2.setStopTime(exercisesession.e());
        exercisesession2.setCueIndex(Integer.valueOf(exercisesession.f()));
        exercisesession2.setActivityType(exercisesession.h());
        exercisesession2.setWireId(exercisesession.g());
        return exercisesession2;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((ExerciseSession)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((ExerciseSession)obj, (com.fitbit.data.repo.greendao.exercise.ExerciseSession)obj1);
    }
}
