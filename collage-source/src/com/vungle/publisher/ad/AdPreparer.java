// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.ad;

import com.vungle.log.Logger;
import com.vungle.publisher.ab;
import com.vungle.publisher.ad.prepare.PrepareAdRunnable;
import com.vungle.publisher.async.ScheduledPriorityExecutor;
import com.vungle.publisher.by;
import com.vungle.publisher.n;
import dagger.Lazy;
import javax.inject.Provider;

public class AdPreparer
{
    static class ViewablePreparationListener extends by
    {

        ScheduledPriorityExecutor a;
        com.vungle.publisher.ad.prepare.PrepareViewableRunnable.Factory b;
        Lazy c;

        public void onEvent(ab ab1)
        {
            ((AdPreparer)c.get()).a(ab1.a);
        }

        public void onEvent(n n1)
        {
            a.a(b.a(n1.a, n1.b), com.vungle.publisher.async.ScheduledPriorityExecutor.b.h);
        }

        ViewablePreparationListener()
        {
        }
    }


    com.vungle.publisher.ad.prepare.PrepareAdRunnable.Factory a;
    ViewablePreparationListener b;
    ScheduledPriorityExecutor c;

    AdPreparer()
    {
    }

    public final void a(String s)
    {
        Logger.d("VunglePrepare", (new StringBuilder("prepare ad request: ")).append(s).toString());
        b.registerOnce();
        ScheduledPriorityExecutor scheduledpriorityexecutor = c;
        PrepareAdRunnable prepareadrunnable = (PrepareAdRunnable)a.a.get();
        PrepareAdRunnable.a(prepareadrunnable, s);
        scheduledpriorityexecutor.a(prepareadrunnable, com.vungle.publisher.async.ScheduledPriorityExecutor.b.g);
    }
}
