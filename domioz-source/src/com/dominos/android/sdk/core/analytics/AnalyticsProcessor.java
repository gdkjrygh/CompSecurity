// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.analytics;


// Referenced classes of package com.dominos.android.sdk.core.analytics:
//            AnalyticsEvent

public abstract class AnalyticsProcessor
{

    public AnalyticsProcessor()
    {
    }

    protected abstract void processEvent(AnalyticsEvent analyticsevent);
}
