// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration;

import com.soundcloud.android.configuration.experiments.Assignment;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.soundcloud.android.configuration:
//            DeviceManagement, UserPlan

class Configuration
{

    public final Assignment assignment;
    public final DeviceManagement deviceManagement;
    public final List features;
    public final UserPlan plan;

    public Configuration(List list, UserPlan userplan, List list1, DeviceManagement devicemanagement)
    {
        features = Collections.unmodifiableList(list);
        plan = userplan;
        if (list1 == null)
        {
            list = Assignment.empty();
        } else
        {
            list = new Assignment(list1);
        }
        assignment = list;
        deviceManagement = devicemanagement;
    }
}
