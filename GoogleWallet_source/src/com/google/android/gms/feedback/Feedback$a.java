// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.feedback;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.feedback:
//            Feedback

static abstract class Client extends com.google.android.gms.common.api.ntation.a
{

    private static final Status afR = new Status(13);

    private static Status f(Status status)
    {
        return status;
    }

    public final void N(boolean flag)
    {
        if (flag)
        {
            b(Status.Th);
            return;
        } else
        {
            b(afR);
            return;
        }
    }

    public final Result b(Status status)
    {
        return f(status);
    }


    public Client(GoogleApiClient googleapiclient)
    {
        super(Feedback.lk(), googleapiclient);
    }
}
