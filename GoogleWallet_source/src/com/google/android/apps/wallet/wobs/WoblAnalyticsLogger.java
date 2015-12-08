// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.wallet.wobl.renderer.android.AnalyticsLogger;
import java.net.URI;

public class WoblAnalyticsLogger
    implements AnalyticsLogger
{

    private final AnalyticsUtil analyticsUtil;

    public WoblAnalyticsLogger(AnalyticsUtil analyticsutil)
    {
        analyticsUtil = analyticsutil;
    }

    public void logTapUri(URI uri)
    {
        analyticsUtil.sendEventFromUri(uri.toString());
    }
}
