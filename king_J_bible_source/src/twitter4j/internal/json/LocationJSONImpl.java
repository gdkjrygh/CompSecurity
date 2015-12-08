// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import twitter4j.Location;
import twitter4j.ResponseList;
import twitter4j.TwitterException;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.util.z_T4JInternalParseUtil;

// Referenced classes of package twitter4j.internal.json:
//            ResponseListImpl, DataObjectFactoryUtil

final class LocationJSONImpl
    implements Location
{

    private static final long serialVersionUID = 0x6276d4e89ed29546L;
    private final String countryCode;
    private final String countryName;
    private final String name;
    private final int placeCode;
    private final String placeName;
    private final String url;
    private final int woeid;

    LocationJSONImpl(JSONObject jsonobject)
        throws TwitterException
    {
        woeid = z_T4JInternalParseUtil.getInt("woeid", jsonobject);
        countryName = z_T4JInternalParseUtil.getUnescapedString("country", jsonobject);
        countryCode = z_T4JInternalParseUtil.getRawString("countryCode", jsonobject);
        if (jsonobject.isNull("placeType"))
        {
            break MISSING_BLOCK_LABEL_91;
        }
        JSONObject jsonobject1 = jsonobject.getJSONObject("placeType");
        placeName = z_T4JInternalParseUtil.getUnescapedString("name", jsonobject1);
        placeCode = z_T4JInternalParseUtil.getInt("code", jsonobject1);
_L1:
        name = z_T4JInternalParseUtil.getUnescapedString("name", jsonobject);
        url = z_T4JInternalParseUtil.getUnescapedString("url", jsonobject);
        return;
        try
        {
            placeName = null;
            placeCode = -1;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new TwitterException(jsonobject);
        }
          goto _L1
    }

    static ResponseList createLocationList(JSONArray jsonarray, boolean flag)
        throws TwitterException
    {
        int i;
        ResponseListImpl responselistimpl;
        JSONObject jsonobject;
        LocationJSONImpl locationjsonimpl;
        int j;
        try
        {
            j = jsonarray.length();
            responselistimpl = new ResponseListImpl(j, null);
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            throw new TwitterException(jsonarray);
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            throw jsonarray;
        }
        i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        jsonobject = jsonarray.getJSONObject(i);
        locationjsonimpl = new LocationJSONImpl(jsonobject);
        responselistimpl.add(locationjsonimpl);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        DataObjectFactoryUtil.registerJSONObject(locationjsonimpl, jsonobject);
        break MISSING_BLOCK_LABEL_92;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        DataObjectFactoryUtil.registerJSONObject(responselistimpl, jsonarray);
        return responselistimpl;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static ResponseList createLocationList(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.clearThreadLocalMap();
        }
        return createLocationList(httpresponse.asJSONArray(), configuration.isJSONStoreEnabled());
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof LocationJSONImpl))
            {
                return false;
            }
            obj = (LocationJSONImpl)obj;
            if (woeid != ((LocationJSONImpl) (obj)).woeid)
            {
                return false;
            }
        }
        return true;
    }

    public String getCountryCode()
    {
        return countryCode;
    }

    public String getCountryName()
    {
        return countryName;
    }

    public String getName()
    {
        return name;
    }

    public int getPlaceCode()
    {
        return placeCode;
    }

    public String getPlaceName()
    {
        return placeName;
    }

    public String getURL()
    {
        return url;
    }

    public int getWoeid()
    {
        return woeid;
    }

    public int hashCode()
    {
        return woeid;
    }

    public String toString()
    {
        return "LocationJSONImpl{woeid=" + woeid + ", countryName='" + countryName + '\'' + ", countryCode='" + countryCode + '\'' + ", placeName='" + placeName + '\'' + ", placeCode='" + placeCode + '\'' + ", name='" + name + '\'' + ", url='" + url + '\'' + '}';
    }
}
