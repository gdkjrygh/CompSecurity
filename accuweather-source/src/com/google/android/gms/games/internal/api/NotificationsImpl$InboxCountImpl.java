// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            NotificationsImpl

private static abstract class _cls1.yG extends com.google.android.gms.games.boxCountImpl
{

    public com.google.android.gms.games.boxCountImpl N(Status status)
    {
        return new com.google.android.gms.games.Notifications.InboxCountResult(status) {

            final NotificationsImpl.InboxCountImpl PZ;
            final Status yG;

            public Status getStatus()
            {
                return yG;
            }

            
            {
                PZ = NotificationsImpl.InboxCountImpl.this;
                yG = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return N(status);
    }

    private _cls1.yG()
    {
    }
}
