// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import com.soundcloud.android.events.CurrentUserChangedEvent;

// Referenced classes of package com.soundcloud.android.analytics:
//            AnalyticsEngine, AnalyticsProvider

private final class <init> extends <init>
{

    final AnalyticsEngine this$0;

    protected final void handleEvent(AnalyticsProvider analyticsprovider, CurrentUserChangedEvent currentuserchangedevent)
    {
        analyticsprovider.handleCurrentUserChangedEvent(currentuserchangedevent);
    }

    protected final volatile void handleEvent(AnalyticsProvider analyticsprovider, Object obj)
    {
        handleEvent(analyticsprovider, (CurrentUserChangedEvent)obj);
    }

    private ()
    {
        this$0 = AnalyticsEngine.this;
        super(AnalyticsEngine.this, null);
    }

    t>(t> t>)
    {
        this();
    }
}
