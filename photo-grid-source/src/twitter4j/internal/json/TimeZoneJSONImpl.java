// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import twitter4j.TimeZone;
import twitter4j.TwitterException;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

// Referenced classes of package twitter4j.internal.json:
//            z_T4JInternalParseUtil

public class TimeZoneJSONImpl
    implements TimeZone
{

    private final String NAME;
    private final String TZINFO_NAME;
    private final int UTC_OFFSET;

    TimeZoneJSONImpl(JSONObject jsonobject)
    {
        try
        {
            UTC_OFFSET = z_T4JInternalParseUtil.getInt("utc_offset", jsonobject);
            NAME = jsonobject.getString("name");
            TZINFO_NAME = jsonobject.getString("tzinfo_name");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new TwitterException(jsonobject);
        }
    }

    public String getName()
    {
        return NAME;
    }

    public String tzinfoName()
    {
        return TZINFO_NAME;
    }

    public int utcOffset()
    {
        return UTC_OFFSET;
    }
}
