// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import twitter4j.conf.Configuration;

// Referenced classes of package twitter4j:
//            Location, TwitterException, JSONException, ParseUtil, 
//            JSONObject, TwitterObjectFactory, HttpResponse, JSONArray, 
//            ResponseListImpl, ResponseList

final class LocationJSONImpl
    implements Location
{

    private static final long serialVersionUID = 0xedc82aba6f35c088L;
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
        woeid = ParseUtil.getInt("woeid", jsonobject);
        countryName = ParseUtil.getUnescapedString("country", jsonobject);
        countryCode = ParseUtil.getRawString("countryCode", jsonobject);
        if (jsonobject.isNull("placeType"))
        {
            break MISSING_BLOCK_LABEL_91;
        }
        JSONObject jsonobject1 = jsonobject.getJSONObject("placeType");
        placeName = ParseUtil.getUnescapedString("name", jsonobject1);
        placeCode = ParseUtil.getInt("code", jsonobject1);
_L1:
        name = ParseUtil.getUnescapedString("name", jsonobject);
        url = ParseUtil.getUnescapedString("url", jsonobject);
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
        throws TwitterException
    {
        if (configuration.isJSONStoreEnabled())
        {
            TwitterObjectFactory.clearThreadLocalMap();
        }
        return createLocationList(httpresponse.asJSONArray(), configuration.isJSONStoreEnabled());
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
            break MISSING_BLOCK_LABEL_89;
        }
        TwitterObjectFactory.registerJSONObject(locationjsonimpl, jsonobject);
        break MISSING_BLOCK_LABEL_89;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        TwitterObjectFactory.registerJSONObject(responselistimpl, jsonarray);
        return responselistimpl;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
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
        return (new StringBuilder()).append("LocationJSONImpl{woeid=").append(woeid).append(", countryName='").append(countryName).append('\'').append(", countryCode='").append(countryCode).append('\'').append(", placeName='").append(placeName).append('\'').append(", placeCode='").append(placeCode).append('\'').append(", name='").append(name).append('\'').append(", url='").append(url).append('\'').append('}').toString();
    }
}
