// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import android.content.res.Resources;
import com.soundcloud.java.objects.MoreObjects;

public class AnalyticsProperties
{

    private final boolean analyticsAvailable;

    public AnalyticsProperties(Resources resources)
    {
        analyticsAvailable = resources.getBoolean(0x7f0d000a);
    }

    public boolean isAnalyticsAvailable()
    {
        return analyticsAvailable;
    }

    public String toString()
    {
        return MoreObjects.toStringHelper(this).add("analyticsEnabled", analyticsAvailable).toString();
    }
}
