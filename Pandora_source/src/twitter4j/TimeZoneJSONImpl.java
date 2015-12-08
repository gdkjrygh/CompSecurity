// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;


// Referenced classes of package twitter4j:
//            TimeZone, TwitterException, JSONException, ParseUtil, 
//            JSONObject

public class TimeZoneJSONImpl
    implements TimeZone
{

    private static final long serialVersionUID = 0x1232d3faed98fb0L;
    private final String NAME;
    private final String TZINFO_NAME;
    private final int UTC_OFFSET;

    TimeZoneJSONImpl(JSONObject jsonobject)
        throws TwitterException
    {
        try
        {
            UTC_OFFSET = ParseUtil.getInt("utc_offset", jsonobject);
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
