// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import android.location.Location;
import com.fitbit.data.domain.Length;
import com.fitbit.data.repo.greendao.exercise.Split;
import com.fitbit.runtrack.Duration;
import com.fitbit.runtrack.data.ExerciseStat;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper

public class SplitMapper
    implements EntityMapper
{

    public SplitMapper()
    {
    }

    public com.fitbit.runtrack.Split fromDbEntity(Split split)
    {
        Object obj2 = null;
        if (split == null)
        {
            return null;
        }
        Long long1 = split.getStartEventId();
        UUID uuid = UUID.fromString(split.getSessionId());
        Object obj;
        Object obj1;
        Duration duration;
        if (split.getDistance() != null)
        {
            obj = new Length(split.getDistance().doubleValue(), com.fitbit.data.domain.Length.LengthUnits.METERS);
        } else
        {
            obj = null;
        }
        if (split.getAltitude() != null)
        {
            obj1 = new Length(split.getAltitude().doubleValue(), com.fitbit.data.domain.Length.LengthUnits.METERS);
        } else
        {
            obj1 = null;
        }
        if (split.getTimeRange() != null)
        {
            duration = new Duration(split.getTimeRange().longValue());
        } else
        {
            duration = null;
        }
        obj1 = new ExerciseStat(uuid, long1, ((Length) (obj)), ((Length) (obj1)), duration, split.getMets().doubleValue());
        obj = obj2;
        if (split.getLatitude() != null)
        {
            obj = obj2;
            if (split.getLongitude() != null)
            {
                obj = obj2;
                if (split.getTime() != null)
                {
                    obj = new Location("fitbit");
                    ((Location) (obj)).setLatitude(split.getLatitude().doubleValue());
                    ((Location) (obj)).setLongitude(split.getLongitude().doubleValue());
                    ((Location) (obj)).setTime(split.getTime().longValue());
                }
            }
        }
        obj = new com.fitbit.runtrack.Split(((Location) (obj)), ((ExerciseStat) (obj1)));
        ((com.fitbit.runtrack.Split) (obj)).setEntityId(split.getId());
        return ((com.fitbit.runtrack.Split) (obj));
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((Split)obj);
    }

    public Split toDbEntity(com.fitbit.runtrack.Split split)
    {
        return toDbEntity(split, new Split());
    }

    public Split toDbEntity(com.fitbit.runtrack.Split split, Split split1)
    {
        if (split == null)
        {
            split = null;
        } else
        {
            Split split2 = split1;
            if (split1 == null)
            {
                split2 = new Split();
            }
            if (split2.getId() == null)
            {
                split2.setId(split.getEntityId());
            }
            split1 = split.b();
            Location location = split.a();
            split2.setSessionId(String.valueOf(split1.e()));
            split2.setStartEventId(split1.f());
            if (split1.a() != null)
            {
                split2.setDistance(Double.valueOf(split1.a().a(com.fitbit.data.domain.Length.LengthUnits.METERS).b()));
            }
            if (split1.d() != null)
            {
                split2.setAltitude(Double.valueOf(split1.d().a(com.fitbit.data.domain.Length.LengthUnits.METERS).b()));
            }
            if (split1.c() != null)
            {
                split2.setTimeRange(Long.valueOf(split1.c().a(TimeUnit.MILLISECONDS)));
            }
            split2.setMets(Double.valueOf(split1.b()));
            split = split2;
            if (location != null)
            {
                split2.setLatitude(Double.valueOf(location.getLatitude()));
                split2.setLongitude(Double.valueOf(location.getLongitude()));
                split2.setTime(Long.valueOf(location.getTime()));
                return split2;
            }
        }
        return split;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((com.fitbit.runtrack.Split)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((com.fitbit.runtrack.Split)obj, (Split)obj1);
    }
}
