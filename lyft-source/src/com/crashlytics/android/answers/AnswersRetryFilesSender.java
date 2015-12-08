// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.concurrency.internal.DefaultRetryPolicy;
import io.fabric.sdk.android.services.concurrency.internal.ExponentialBackoff;
import io.fabric.sdk.android.services.concurrency.internal.RetryState;
import io.fabric.sdk.android.services.events.FilesSender;
import java.util.List;

// Referenced classes of package com.crashlytics.android.answers:
//            RetryManager, RandomBackoff, SessionAnalyticsFilesSender

class AnswersRetryFilesSender
    implements FilesSender
{

    private final SessionAnalyticsFilesSender a;
    private final RetryManager b;

    AnswersRetryFilesSender(SessionAnalyticsFilesSender sessionanalyticsfilessender, RetryManager retrymanager)
    {
        a = sessionanalyticsfilessender;
        b = retrymanager;
    }

    public static AnswersRetryFilesSender a(SessionAnalyticsFilesSender sessionanalyticsfilessender)
    {
        return new AnswersRetryFilesSender(sessionanalyticsfilessender, new RetryManager(new RetryState(new RandomBackoff(new ExponentialBackoff(1000L, 8), 0.10000000000000001D), new DefaultRetryPolicy(5))));
    }

    public boolean a(List list)
    {
        long l;
label0:
        {
            boolean flag = false;
            l = System.nanoTime();
            if (b.a(l))
            {
                if (!a.a(list))
                {
                    break label0;
                }
                b.a();
                flag = true;
            }
            return flag;
        }
        b.b(l);
        return false;
    }
}
