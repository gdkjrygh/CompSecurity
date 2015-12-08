// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.cast:
//            CastRemoteDisplayLocalService

final class l
    implements ResultCallback
{

    final CastRemoteDisplayLocalService a;

    l(CastRemoteDisplayLocalService castremotedisplaylocalservice)
    {
        a = castremotedisplaylocalservice;
        super();
    }

    public final void onResult(Result result)
    {
        if (!((h.c)result).getStatus().isSuccess())
        {
            CastRemoteDisplayLocalService.a(a, "Unable to stop the remote display, result unsuccessful");
        } else
        {
            CastRemoteDisplayLocalService.a(a, "remote display stopped");
        }
        CastRemoteDisplayLocalService.b(a);
    }
}
