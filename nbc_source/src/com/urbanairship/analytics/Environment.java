// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import java.util.ArrayList;
import java.util.Date;

public abstract class Environment
{

    public Environment()
    {
    }

    public abstract String getApid();

    public abstract String getCarrier();

    public abstract String getConnectionSubType();

    public abstract String getConnectionType();

    public abstract String getConversionPushId();

    public abstract String getLibVersion();

    public abstract ArrayList getNotificationTypes();

    public abstract String getOsVersion();

    public abstract String getPackageVersion();

    public abstract String getPushTransport();

    public abstract Date[] getQuietTimeInterval();

    public abstract String getSessionId();

    public abstract long getTimeMillis();

    public abstract long getTimezone();

    public abstract boolean isAppInForeground();

    public abstract boolean isDaylightSavingsTime();

    public abstract boolean isPushEnabled();

    public abstract boolean isQuietTimeEnabled();
}
