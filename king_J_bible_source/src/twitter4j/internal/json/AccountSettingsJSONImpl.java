// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.io.Serializable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import twitter4j.AccountSettings;
import twitter4j.Location;
import twitter4j.TimeZone;
import twitter4j.TwitterException;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.util.z_T4JInternalParseUtil;

// Referenced classes of package twitter4j.internal.json:
//            TwitterResponseImpl, TimeZoneJSONImpl, LocationJSONImpl, DataObjectFactoryUtil

class AccountSettingsJSONImpl extends TwitterResponseImpl
    implements AccountSettings, Serializable
{

    private static final long serialVersionUID = 0x6eca9ae824b25838L;
    private final boolean ALWAYS_USE_HTTPS;
    private final boolean DISCOVERABLE_BY_EMAIL;
    private final boolean GEO_ENABLED;
    private final String LANGUAGE;
    private final String SLEEP_END_TIME;
    private final String SLEEP_START_TIME;
    private final boolean SLEEP_TIME_ENABLED;
    private final TimeZone TIMEZONE;
    private final Location TREND_LOCATION[];

    AccountSettingsJSONImpl(JSONObject jsonobject)
        throws TwitterException
    {
        this(null, jsonobject);
    }

    private AccountSettingsJSONImpl(HttpResponse httpresponse, JSONObject jsonobject)
        throws TwitterException
    {
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
        return;
_L2:
        int i;
        try
        {
            httpresponse = jsonobject.getJSONArray("trend_location");
            TREND_LOCATION = new Location[httpresponse.length()];
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            throw new TwitterException(httpresponse);
        }
        i = 0;
        if (i >= httpresponse.length())
        {
            continue; /* Loop/switch isn't completed */
        }
        TREND_LOCATION[i] = new LocationJSONImpl(httpresponse.getJSONObject(i));
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        break MISSING_BLOCK_LABEL_166;
_L4:
        break MISSING_BLOCK_LABEL_137;
        if (true) goto _L6; else goto _L5
_L5:
    }

    AccountSettingsJSONImpl(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        this(httpresponse, httpresponse.asJSONObject());
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.clearThreadLocalMap();
            DataObjectFactoryUtil.registerJSONObject(this, httpresponse.asJSONObject());
        }
    }

    public String getLanguage()
    {
        return LANGUAGE;
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
