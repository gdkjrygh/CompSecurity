// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo;

import android.location.Location;
import com.fitbit.runtrack.data.ExerciseEvent;
import com.fitbit.runtrack.data.ExerciseSegment;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.fitbit.data.repo:
//            ao

public interface p
    extends ao
{

    public abstract List getAllEventsInSegment(ExerciseSegment exercisesegment);

    public abstract List getEventsInSegment(ExerciseSegment exercisesegment, long l);

    public abstract List getEventsInSession(UUID uuid);

    public abstract ExerciseEvent getLastEventInSegment(ExerciseSegment exercisesegment);

    public abstract ExerciseEvent getMostRecentEvent(UUID uuid);

    public abstract ExerciseEvent recordEvent(UUID uuid, com.fitbit.runtrack.data.ExerciseEvent.Type type, Location location);
}
