// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo;

import com.fitbit.runtrack.Split;
import com.fitbit.runtrack.data.ExerciseStat;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.fitbit.data.repo:
//            ao

public interface ar
    extends ao
{

    public abstract List getCompletedSplits(UUID uuid);

    public abstract ExerciseStat getOverallStat(UUID uuid);

    public abstract Split getSplit(UUID uuid, Long long1);
}
