// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            NotificationsImpl

private static abstract class _cls1.yJ extends com.google.android.gms.games.tingLoadImpl
{

    public com.google.android.gms.games.tingLoadImpl M(Status status)
    {
        return new com.google.android.gms.games.Notifications.ContactSettingLoadResult(status) {

            final NotificationsImpl.ContactSettingLoadImpl Qb;
            final Status yJ;

            public Status getStatus()
            {
                return yJ;
            }

            
            {
                Qb = NotificationsImpl.ContactSettingLoadImpl.this;
                yJ = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return M(status);
    }

    private _cls1.yJ()
    {
    }
}
