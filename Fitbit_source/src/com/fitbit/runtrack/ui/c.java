// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import com.fitbit.data.domain.ActivityLogEntry;

// Referenced classes of package com.fitbit.runtrack.ui:
//            i

public class c extends i
{

    private static final String a = "Activity LogId";

    public c()
    {
        super("Exercise: Sharing");
    }

    public c a(ActivityLogEntry activitylogentry)
    {
        a("Activity LogId", Long.toString(activitylogentry.getServerId()));
        return this;
    }
}
