// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.common;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;

// Referenced classes of package com.skype.android.app.common:
//            WearConversationHistory

public static class <init>
    implements g
{

    private WearConversationHistory conversationHistory;
    private final Status status;

    public WearConversationHistory geConversationHistory()
    {
        return conversationHistory;
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

    private <init>(WearConversationHistory wearconversationhistory)
    {
        conversationHistory = wearconversationhistory;
        status = new Status(0);
    }

    status(WearConversationHistory wearconversationhistory, status status1)
    {
        this(wearconversationhistory);
    }
}
