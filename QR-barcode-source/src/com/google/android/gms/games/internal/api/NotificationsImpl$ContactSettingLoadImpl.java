// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            NotificationsImpl

private static abstract class _cls1.CW extends com.google.android.gms.games.tingLoadImpl
{

    public com.google.android.gms.games.tingLoadImpl aa(Status status)
    {
        return new com.google.android.gms.games.Notifications.ContactSettingLoadResult(status) {

            final Status CW;
            final NotificationsImpl.ContactSettingLoadImpl Zc;

            public Status getStatus()
            {
                return CW;
            }

            
            {
                Zc = NotificationsImpl.ContactSettingLoadImpl.this;
                CW = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return aa(status);
    }

    private _cls1.CW()
    {
    }
}
