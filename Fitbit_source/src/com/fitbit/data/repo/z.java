// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo;

import com.fitbit.data.domain.Goal;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo:
//            m

public interface z
    extends m
{

    public abstract List getByType(com.fitbit.data.domain.Goal.GoalType goaltype);

    public abstract Goal getByTypeAndDate(com.fitbit.data.domain.Goal.GoalType goaltype, Date date);

    public abstract Goal getByTypeAndDate(com.fitbit.data.domain.Goal.GoalType goaltype, Date date, Date date1);

    public abstract Goal getLastGoalByType(com.fitbit.data.domain.Goal.GoalType goaltype);
}
