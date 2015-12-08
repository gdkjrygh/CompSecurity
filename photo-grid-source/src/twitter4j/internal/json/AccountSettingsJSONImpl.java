// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.io.Serializable;
import twitter4j.AccountSettings;
import twitter4j.Location;
import twitter4j.TimeZone;
import twitter4j.TwitterException;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.org.json.JSONArray;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

// Referenced classes of package twitter4j.internal.json:
//            TwitterResponseImpl, DataObjectFactoryUtil, z_T4JInternalParseUtil, TimeZoneJSONImpl, 
//            LocationJSONImpl

class AccountSettingsJSONImpl extends TwitterResponseImpl
    implements Serializable, AccountSettings
{

    private static final long serialVersionUID = 0x6eca9ae824b25838L;
    private final boolean ALWAYS_USE_HTTPS;
    private final boolean DISCOVERABLE_BY_EMAIL;
    private final boolean GEO_ENABLED;
    private final String LANGUAGE;
    private final String SCREEN_NAME;
    private final String SLEEP_END_TIME;
    private final String SLEEP_START_TIME;
    private final boolean SLEEP_TIME_ENABLED;
    private final TimeZone TIMEZONE;
    private final Location TREND_LOCATION[];

    AccountSettingsJSONImpl(HttpResponse httpresponse, Configuration configuration)
    {
        this(httpresponse, httpresponse.asJSONObject());
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.clearThreadLocalMap();
            DataObjectFactoryUtil.registerJSONObject(this, httpresponse.asJSONObject());
        }
    }

    private AccountSettingsJSONImpl(HttpResponse httpresponse, JSONObject jsonobject)
    {
        int i;
        i = 0;
        super(httpresponse);
        httpresponse = jsonobject.getJSONObject("sleep_time");
        SLEEP_TIME_ENABLED = z_T4JInternalParseUtil.getBoolean("enabled", httpresponse);
        SLEEP_START_TIME = httpresponse.getString("start_time");
        SLEEP_END_TIME = httpresponse.getString("end_time");
        if (!jsonobject.isNull("trend_location")) goto _L2; else goto _L1
_L1:
        TREND_LOCATION = new Location[0];
_L6:
        GEO_ENABLED = z_T4JInternalParseUtil.getBoolean("geo_enabled", jsonobject);
        LANGUAGE = jsonobject.getString("language");
        ALWAYS_USE_HTTPS = z_T4JInternalParseUtil.getBoolean("always_use_https", jsonobject);
        DISCOVERABLE_BY_EMAIL = z_T4JInternalParseUtil.getBoolean("discoverable_by_email", jsonobject);
        TIMEZONE = new TimeZoneJSONImpl(jsonobject.getJSONObject("time_zone"));
        SCREEN_NAME = jsonobject.getString("screen_name");
        return;
_L2:
        httpresponse = jsonobject.getJSONArray("trend_location");
        TREND_LOCATION = new Location[httpresponse.length()];
_L4:
        if (i >= httpresponse.length())
        {
            break; /* Loop/switch isn't completed */
        }
        TREND_LOCATION[i] = new LocationJSONImpl(httpresponse.getJSONObject(i));
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
        httpresponse;
        throw new TwitterException(httpresponse);
    }

    AccountSettingsJSONImpl(JSONObject jsonobject)
    {
        this(null, jsonobject);
    }

    public String getLanguage()
    {
        return LANGUAGE;
    }

    public String getScreenName()
    {
        return SCREEN_NAME;
    }

    public String getSleepEndTime()
    {
        return SLEEP_END_TIME;
    }

    public String getSleepStartTime()
    {
        return SLEEP_START_TIME;
    }

    public TimeZone getTimeZone()
    {
        return TIMEZONE;
    }

    public Location[] getTrendLocations()
    {
        return TREND_LOCATION;
    }

    public boolean isAlwaysUseHttps()
    {
        return ALWAYS_USE_HTTPS;
    }

    public boolean isDiscoverableByEmail()
    {
        return DISCOVERABLE_BY_EMAIL;
    }

    public boolean isGeoEnabled()
    {
        return GEO_ENABLED;
    }

    public boolean isSleepTimeEnabled()
    {
        return SLEEP_TIME_ENABLED;
    }
}
