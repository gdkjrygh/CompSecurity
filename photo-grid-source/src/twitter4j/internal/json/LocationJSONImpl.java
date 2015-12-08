// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import twitter4j.Location;
import twitter4j.ResponseList;
import twitter4j.TwitterException;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.org.json.JSONArray;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

// Referenced classes of package twitter4j.internal.json:
//            z_T4JInternalParseUtil, DataObjectFactoryUtil, ResponseListImpl

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

    static ResponseList createLocationList(HttpResponse httpresponse, Configuration configuration)
    {
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.clearThreadLocalMap();
        }
        return createLocationList(httpresponse.asJSONArray(), configuration.isJSONStoreEnabled());
    }

    static ResponseList createLocationList(JSONArray jsonarray, boolean flag)
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

    public final boolean equals(Object obj)
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

    public final String getCountryCode()
    {
        return countryCode;
    }

    public final String getCountryName()
    {
        return countryName;
    }

    public final String getName()
    {
        return name;
    }

    public final int getPlaceCode()
    {
        return placeCode;
    }

    public final String getPlaceName()
    {
        return placeName;
    }

    public final String getURL()
    {
        return url;
    }

    public final int getWoeid()
    {
        return woeid;
    }

    public final int hashCode()
    {
        return woeid;
    }

    public final String toString()
    {
        return (new StringBuilder("LocationJSONImpl{woeid=")).append(woeid).append(", countryName='").append(countryName).append('\'').append(", countryCode='").append(countryCode).append('\'').append(", placeName='").append(placeName).append('\'').append(", placeCode='").append(placeCode).append('\'').append(", name='").append(name).append('\'').append(", url='").append(url).append('\'').append('}').toString();
    }
}
