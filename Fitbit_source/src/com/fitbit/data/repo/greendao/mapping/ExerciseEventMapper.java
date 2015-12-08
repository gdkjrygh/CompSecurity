// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import android.location.Location;
import com.fitbit.data.repo.greendao.exercise.ExerciseEvent;
import java.util.Date;
import java.util.UUID;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper

public class ExerciseEventMapper
    implements EntityMapper
{

    public ExerciseEventMapper()
    {
    }

    public com.fitbit.runtrack.data.ExerciseEvent fromDbEntity(ExerciseEvent exerciseevent)
    {
        if (exerciseevent == null)
        {
            return null;
        }
        long l = exerciseevent.getId().longValue();
        UUID uuid = UUID.fromString(exerciseevent.getSessionId());
        com.fitbit.runtrack.data.ExerciseEvent.Type type = com.fitbit.runtrack.data.ExerciseEvent.Type.a(exerciseevent.getLabel());
        Location location = new Location(exerciseevent.getLabel());
        location.setTime(exerciseevent.getTime().getTime());
        location.setLatitude((0.0D / 0.0D));
        if (exerciseevent.getLatitude() != null)
        {
            location.setLatitude(exerciseevent.getLatitude().doubleValue());
        }
        location.setLongitude((0.0D / 0.0D));
        if (exerciseevent.getLongitude() != null)
        {
            location.setLongitude(exerciseevent.getLongitude().doubleValue());
        }
        if (exerciseevent.getAccuracy() != null)
        {
            location.setAccuracy(exerciseevent.getAccuracy().floatValue());
        }
        if (exerciseevent.getAltitude() != null)
        {
            location.setAltitude(exerciseevent.getAltitude().doubleValue());
        }
        if (exerciseevent.getBearing() != null)
        {
            location.setBearing(exerciseevent.getBearing().floatValue());
        }
        if (exerciseevent.getSpeed() != null)
        {
            location.setSpeed(exerciseevent.getSpeed().floatValue());
        }
        return new com.fitbit.runtrack.data.ExerciseEvent(l, uuid, type, location);
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((ExerciseEvent)obj);
    }

    public ExerciseEvent toDbEntity(com.fitbit.runtrack.data.ExerciseEvent exerciseevent)
    {
        return toDbEntity(exerciseevent, new ExerciseEvent());
    }

    public ExerciseEvent toDbEntity(com.fitbit.runtrack.data.ExerciseEvent exerciseevent, ExerciseEvent exerciseevent1)
    {
        if (exerciseevent == null)
        {
            return null;
        }
        ExerciseEvent exerciseevent2 = exerciseevent1;
        if (exerciseevent1 == null)
        {
            exerciseevent2 = new ExerciseEvent();
        }
        if (exerciseevent2.getId() == null)
        {
            exerciseevent2.setId(exerciseevent.getEntityId());
        }
        exerciseevent1 = exerciseevent.location;
        exerciseevent2.setTime(new Date(exerciseevent1.getTime()));
        if (!Double.isNaN(exerciseevent1.getLatitude()))
        {
            exerciseevent2.setLatitude(Double.valueOf(exerciseevent1.getLatitude()));
        }
        if (!Double.isNaN(exerciseevent1.getLongitude()))
        {
            exerciseevent2.setLongitude(Double.valueOf(exerciseevent1.getLongitude()));
        }
        exerciseevent2.setAccuracy(Float.valueOf(exerciseevent1.getAccuracy()));
        exerciseevent2.setAltitude(Double.valueOf(exerciseevent1.getAltitude()));
        exerciseevent2.setBearing(Float.valueOf(exerciseevent1.getBearing()));
        exerciseevent2.setSpeed(Float.valueOf(exerciseevent1.getSpeed()));
        exerciseevent2.setLabel(exerciseevent.type.label);
        exerciseevent2.setSessionId(String.valueOf(exerciseevent.sessionId));
        return exerciseevent2;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((com.fitbit.runtrack.data.ExerciseEvent)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((com.fitbit.runtrack.data.ExerciseEvent)obj, (ExerciseEvent)obj1);
    }
}
