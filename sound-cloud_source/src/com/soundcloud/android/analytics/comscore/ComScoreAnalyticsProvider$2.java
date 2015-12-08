// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics.comscore;

import com.comscore.analytics.comScore;
import com.soundcloud.android.events.ActivityLifeCycleEvent;

// Referenced classes of package com.soundcloud.android.analytics.comscore:
//            ComScoreAnalyticsProvider

class val.event
    implements Runnable
{

    final ComScoreAnalyticsProvider this$0;
    final ActivityLifeCycleEvent val$event;

    public void run()
    {
        if (val$event.getKind() == 0)
        {
            comScore.onEnterForeground();
        } else
        if (val$event.getKind() == 2)
        {
            comScore.onExitForeground();
            return;
        }
    }

    ()
    {
        this$0 = final_comscoreanalyticsprovider;
        val$event = ActivityLifeCycleEvent.this;
        super();
    }
}
