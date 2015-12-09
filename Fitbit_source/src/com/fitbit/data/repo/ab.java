// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo;

import com.fitbit.data.domain.heartrate.HeartRateExerciseSummary;
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo:
//            ao

public interface ab
    extends ao
{

    public abstract HeartRateExerciseSummary getForStartTime(Date date);
}
