// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import com.fitbit.data.domain.ActivityLogEntry;

// Referenced classes of package com.fitbit.runtrack.ui:
//            i

public class b extends i
{

    private static final String a = "!HAS_LOCATIONS";
    private static final String b = "!ACTIVITY_NAME";

    public b()
    {
        super("Exercise: View Exercise Details");
    }

    public b a(ActivityLogEntry activitylogentry)
    {
        a("!HAS_LOCATIONS", Boolean.toString(activitylogentry.f()));
        a("!ACTIVITY_NAME", activitylogentry.z());
        return this;
    }
}
