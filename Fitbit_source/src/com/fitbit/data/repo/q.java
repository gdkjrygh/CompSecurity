// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo;

import com.fitbit.runtrack.data.ExerciseSegment;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.fitbit.data.repo:
//            ao

public interface q
    extends ao
{

    public abstract ExerciseSegment getSegment(UUID uuid, long l);

    public abstract ExerciseSegment getSegmentForTime(UUID uuid, long l);

    public abstract List getSegmentsInSession(UUID uuid);
}
