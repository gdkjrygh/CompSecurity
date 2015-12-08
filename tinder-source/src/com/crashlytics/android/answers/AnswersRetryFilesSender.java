// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.b.j;
import io.fabric.sdk.android.services.concurrency.a.a;
import io.fabric.sdk.android.services.concurrency.a.b;
import io.fabric.sdk.android.services.concurrency.a.c;
import io.fabric.sdk.android.services.concurrency.a.e;
import java.util.List;

// Referenced classes of package com.crashlytics.android.answers:
//            RetryManager, RandomBackoff, SessionAnalyticsFilesSender

class AnswersRetryFilesSender
    implements j
{

    private final SessionAnalyticsFilesSender a;
    private final RetryManager b;

    private AnswersRetryFilesSender(SessionAnalyticsFilesSender sessionanalyticsfilessender, RetryManager retrymanager)
    {
        a = sessionanalyticsfilessender;
        b = retrymanager;
    }

    public static AnswersRetryFilesSender a(SessionAnalyticsFilesSender sessionanalyticsfilessender)
    {
        return new AnswersRetryFilesSender(sessionanalyticsfilessender, new RetryManager(new e(new RandomBackoff(new c()), new b(5))));
    }

    public final boolean a(List list)
    {
        long l = System.nanoTime();
        RetryManager retrymanager = b;
        e e3 = retrymanager.b;
        long l1 = e3.b.a(e3.a);
        boolean flag;
        if (l - retrymanager.a >= 0xf4240L * l1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (a.a(list))
            {
                list = b;
                list.a = 0L;
                e e1 = ((RetryManager) (list)).b;
                list.b = new e(e1.b, e1.c);
                return true;
            } else
            {
                list = b;
                list.a = l;
                e e2 = ((RetryManager) (list)).b;
                list.b = new e(e2.a + 1, e2.b, e2.c);
                return false;
            }
        } else
        {
            return false;
        }
    }
}
