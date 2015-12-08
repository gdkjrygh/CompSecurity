// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo;

import com.fitbit.activity.ActivityLogInfo;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo:
//            ao

public interface ah
    extends ao
{

    public transient abstract void deleteAll(com.fitbit.activity.ActivityLogInfo.Group agroup[]);

    public abstract ActivityLogInfo getByServerId(List list, com.fitbit.activity.ActivityLogInfo.Group group);

    public abstract List getOftenActivities(int i);

    public abstract List getRecentActivities(int i);
}
