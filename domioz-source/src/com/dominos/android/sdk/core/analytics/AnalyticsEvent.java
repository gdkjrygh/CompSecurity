// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.analytics;

import java.util.Map;

public class AnalyticsEvent
{

    public final Map eventData;
    public final AnalyticsConstants.EVENT_TYPE eventType;

    public AnalyticsEvent(AnalyticsConstants.EVENT_TYPE event_type, Map map)
    {
        eventType = event_type;
        eventData = map;
    }
}
