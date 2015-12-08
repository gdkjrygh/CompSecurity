// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.common;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;

// Referenced classes of package com.skype.android.app.common:
//            RecentConversationList

public static class <init>
    implements g
{

    private RecentConversationList recentConversationList;
    private final Status status;

    public RecentConversationList getRecentConversationList()
    {
        return recentConversationList;
    }

    public Status getStatus()
    {
        return status;
    }

    private (Status status1)
    {
        status = status1;
    }

    status(Status status1, status status2)
    {
        this(status1);
    }

    private <init>(RecentConversationList recentconversationlist)
    {
        recentConversationList = recentconversationlist;
        status = new Status(0);
    }

    status(RecentConversationList recentconversationlist, status status1)
    {
        this(recentconversationlist);
    }
}
