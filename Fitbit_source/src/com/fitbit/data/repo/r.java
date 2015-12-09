// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo;

import com.fitbit.runtrack.data.ExerciseSession;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo:
//            ao

public interface r
    extends ao
{

    public abstract List getSessions(com.fitbit.runtrack.data.ExerciseSession.Status status);

    public abstract boolean updateCueIndex(ExerciseSession exercisesession, int i);
}
