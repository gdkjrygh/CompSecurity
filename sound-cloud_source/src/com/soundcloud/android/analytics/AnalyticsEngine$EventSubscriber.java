// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import com.soundcloud.android.events.OnboardingEvent;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.utils.ErrorUtils;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.soundcloud.android.analytics:
//            AnalyticsEngine, AnalyticsProvider

private abstract class <init> extends DefaultSubscriber
{

    final AnalyticsEngine this$0;

    protected abstract void handleEvent(AnalyticsProvider analyticsprovider, Object obj);

    public void onNext(Object obj)
    {
        (new StringBuilder("Track event ")).append(obj);
        if (obj instanceof OnboardingEvent)
        {
            ErrorUtils.log(4, "ScOnboarding", (new StringBuilder("onboarding event published: ")).append(obj).toString());
        }
        for (Iterator iterator = AnalyticsEngine.access$000(AnalyticsEngine.this).iterator(); iterator.hasNext();)
        {
            AnalyticsProvider analyticsprovider = (AnalyticsProvider)iterator.next();
            try
            {
                handleEvent(analyticsprovider, obj);
            }
            catch (Throwable throwable)
            {
                AnalyticsEngine.access$900(AnalyticsEngine.this, throwable, analyticsprovider, getClass().getSimpleName());
            }
        }

        AnalyticsEngine.access$1000(AnalyticsEngine.this);
    }

    private ()
    {
        this$0 = AnalyticsEngine.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
