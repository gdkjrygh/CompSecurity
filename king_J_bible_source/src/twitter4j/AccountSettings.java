// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;

// Referenced classes of package twitter4j:
//            TwitterResponse, TimeZone, Location

public interface AccountSettings
    extends TwitterResponse, Serializable
{

    public abstract String getLanguage();

    public abstract String getSleepEndTime();

    public abstract String getSleepStartTime();

    public abstract TimeZone getTimeZone();

    public abstract Location[] getTrendLocations();

    public abstract boolean isAlwaysUseHttps();

    public abstract boolean isDiscoverableByEmail();

    public abstract boolean isGeoEnabled();

    public abstract boolean isSleepTimeEnabled();
}
