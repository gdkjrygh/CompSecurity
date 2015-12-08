// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.service;

import Ei;
import android.os.SystemClock;
import com.snapchat.android.Timber;
import java.util.ArrayList;

// Referenced classes of package com.snapchat.android.service:
//            SnapchatService

final class a
    implements Runnable
{

    private SnapchatService a;

    public final void run()
    {
        Timber.c("SnapchatService", (new StringBuilder("mStopRunnable mFutureList.size()=")).append(SnapchatService.d(a).size()).append(" hasPendingIntents=").append(SnapchatService.c(a).d()).toString(), new Object[0]);
        if (SnapchatService.d(a).isEmpty() && !SnapchatService.c(a).d())
        {
            Timber.c("SnapchatService", "Stop service which lived for %d ms", new Object[] {
                Long.valueOf(SystemClock.elapsedRealtime() - SnapchatService.e(a))
            });
            a.stopSelf();
        }
    }

    (SnapchatService snapchatservice)
    {
        a = snapchatservice;
        super();
    }
}
