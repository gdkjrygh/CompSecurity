// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import twitter4j.GeoLocation;
import twitter4j.Place;
import twitter4j.ResponseList;
import twitter4j.TwitterException;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.util.z_T4JInternalParseUtil;

// Referenced classes of package twitter4j.internal.json:
//            TwitterResponseImpl, DataObjectFactoryUtil, ResponseListImpl, z_T4JInternalJSONImplFactory

final class PlaceJSONImpl extends TwitterResponseImpl
    implements Place, Serializable
{

    private static final long serialVersionUID = 0xd81fc25aec2157acL;
    private GeoLocation boundingBoxCoordinates[][];
    private String boundingBoxType;
    private Place containedWithIn[];
    private String country;
    private String countryCode;
    private String fullName;
    private GeoLocation geometryCoordinates[][];
    private String geometryType;
    private String id;
    private String name;
    private String placeType;
    private String streetAddress;
    private String url;

    PlaceJSONImpl(JSONObject jsonobject)
        throws TwitterException
    {
        init(jsonobject);
    }

    PlaceJSONImpl(JSONObject jsonobject, HttpResponse httpresponse)
        throws TwitterException
    {
        super(httpresponse);
        init(jsonobject);
    }

    PlaceJSONImpl(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        super(httpresponse);
        httpresponse = httpresponse.asJSONObject();
        init(httpresponse);
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.clearThreadLocalMap();
            DataObjectFactoryUtil.registerJSONObject(this, httpresponse);
        }
    }

    static ResponseList createPlaceList(JSONArray jsonarray, HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        int i;
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.clearThreadLocalMap();
        }
        JSONObject jsonobject;
        PlaceJSONImpl placejsonimpl;
        int j;
        try
        {
            j = jsonarray.length();
            httpresponse = new ResponseListImpl(j, httpresponse);
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
            break MISSING_BLOCK_LABEL_84;
        }
        jsonobject = jsonarray.getJSONObject(i);
        placejsonimpl = new PlaceJSONImpl(jsonobject);
        httpresponse.add(placejsonimpl);
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.registerJSONObject(placejsonimpl, jsonobject);
        }
        break MISSING_BLOCK_LABEL_114;
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.registerJSONObject(httpresponse, jsonarray);
        }
        return httpresponse;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static ResponseList createPlaceList(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        JSONObject jsonobject = null;
        JSONObject jsonobject1;
        try
        {
            jsonobject1 = httpresponse.asJSONObject();
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            throw new TwitterException(httpresponse.getMessage() + ":" + jsonobject.toString(), httpresponse);
        }
        jsonobject = jsonobject1;
        httpresponse = createPlaceList(jsonobject1.getJSONObject("result").getJSONArray("places"), httpresponse, configuration);
        return httpresponse;
    }

    private void init(JSONObject jsonobject)
        throws TwitterException
    {
        name = z_T4JInternalParseUtil.getUnescapedString("name", jsonobject);
        streetAddress = z_T4JInternalParseUtil.getUnescapedString("street_address", jsonobject);
        countryCode = z_T4JInternalParseUtil.getRawString("country_code", jsonobject);
        id = z_T4JInternalParseUtil.getRawString("id", jsonobject);
        country = z_T4JInternalParseUtil.getRawString("country", jsonobject);
        if (jsonobject.isNull("place_type")) goto _L2; else goto _L1
_L1:
        placeType = z_T4JInternalParseUtil.getRawString("place_type", jsonobject);
_L15:
        url = z_T4JInternalParseUtil.getRawString("url", jsonobject);
        fullName = z_T4JInternalParseUtil.getRawString("full_name", jsonobject);
        if (jsonobject.isNull("bounding_box")) goto _L4; else goto _L3
_L3:
        JSONObject jsonobject1 = jsonobject.getJSONObject("bounding_box");
        boundingBoxType = z_T4JInternalParseUtil.getRawString("type", jsonobject1);
        boundingBoxCoordinates = z_T4JInternalJSONImplFactory.coordinatesAsGeoLocationArray(jsonobject1.getJSONArray("coordinates"));
_L12:
        if (jsonobject.isNull("geometry")) goto _L6; else goto _L5
_L5:
        Object obj;
        obj = jsonobject.getJSONObject("geometry");
        geometryType = z_T4JInternalParseUtil.getRawString("type", ((JSONObject) (obj)));
        obj = ((JSONObject) (obj)).getJSONArray("coordinates");
        if (!geometryType.equals("Point")) goto _L8; else goto _L7
_L7:
        geometryCoordinates = (GeoLocation[][])Array.newInstance(twitter4j/GeoLocation, new int[] {
            1, 1
        });
        geometryCoordinates[0][0] = new GeoLocation(((JSONArray) (obj)).getDouble(0), ((JSONArray) (obj)).getDouble(1));
_L13:
        if (jsonobject.isNull("contained_within")) goto _L10; else goto _L9
_L9:
        obj = jsonobject.getJSONArray("contained_within");
        containedWithIn = new Place[((JSONArray) (obj)).length()];
        int i = 0;
        do
        {
            try
            {
                if (i >= ((JSONArray) (obj)).length())
                {
                    break;
                }
                containedWithIn[i] = new PlaceJSONImpl(((JSONArray) (obj)).getJSONObject(i));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new TwitterException(((JSONException) (obj)).getMessage() + ":" + jsonobject.toString(), ((Throwable) (obj)));
            }
            i++;
        } while (true);
          goto _L11
_L2:
        placeType = z_T4JInternalParseUtil.getRawString("type", jsonobject);
        continue; /* Loop/switch isn't completed */
_L4:
        boundingBoxType = null;
        boundingBoxCoordinates = (GeoLocation[][])null;
          goto _L12
_L8:
label0:
        {
            if (!geometryType.equals("Polygon"))
            {
                break label0;
            }
            geometryCoordinates = z_T4JInternalJSONImplFactory.coordinatesAsGeoLocationArray(((JSONArray) (obj)));
        }
          goto _L13
        geometryType = null;
        geometryCoordinates = (GeoLocation[][])null;
          goto _L13
_L6:
        geometryType = null;
        geometryCoordinates = (GeoLocation[][])null;
          goto _L13
_L10:
        containedWithIn = null;
_L11:
        return;
        if (true) goto _L15; else goto _L14
_L14:
    }

    public int compareTo(Object obj)
    {
        return compareTo((Place)obj);
    }

    public int compareTo(Place place)
    {
        return id.compareTo(place.getId());
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = true;
        if (obj != null) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (this == obj) goto _L4; else goto _L3
_L3:
        if (!(obj instanceof Place))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (((Place)obj).getId().equals(id)) goto _L4; else goto _L5
_L5:
        return false;
    }

    public GeoLocation[][] getBoundingBoxCoordinates()
    {
        return boundingBoxCoordinates;
    }

    public String getBoundingBoxType()
    {
        return boundingBoxType;
    }

    public Place[] getContainedWithIn()
    {
        return containedWithIn;
    }

    public String getCountry()
    {
        return country;
    }

    public String getCountryCode()
    {
        return countryCode;
    }

    public String getFullName()
    {
        return fullName;
    }

    public GeoLocation[][] getGeometryCoordinates()
    {
        return geometryCoordinates;
    }

    public String getGeometryType()
    {
        return geometryType;
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getPlaceType()
    {
        return placeType;
    }

    public String getStreetAddress()
    {
        return streetAddress;
    }

    public String getURL()
    {
        return url;
    }

    public int hashCode()
    {
        return id.hashCode();
    }

    public String toString()
    {
        Object obj = null;
        StringBuffer stringbuffer = (new StringBuffer()).append("PlaceJSONImpl{name='").append(name).append('\'').append(", streetAddress='").append(streetAddress).append('\'').append(", countryCode='").append(countryCode).append('\'').append(", id='").append(id).append('\'').append(", country='").append(country).append('\'').append(", placeType='").append(placeType).append('\'').append(", url='").append(url).append('\'').append(", fullName='").append(fullName).append('\'').append(", boundingBoxType='").append(boundingBoxType).append('\'').append(", boundingBoxCoordinates=");
        java.util.List list;
        if (boundingBoxCoordinates == null)
        {
            list = null;
        } else
        {
            list = Arrays.asList(boundingBoxCoordinates);
        }
        stringbuffer = stringbuffer.append(list).append(", geometryType='").append(geometryType).append('\'').append(", geometryCoordinates=");
        if (geometryCoordinates == null)
        {
            list = null;
        } else
        {
            list = Arrays.asList(geometryCoordinates);
        }
        stringbuffer = stringbuffer.append(list).append(", containedWithIn=");
        if (containedWithIn == null)
        {
            list = obj;
        } else
        {
            list = Arrays.asList(containedWithIn);
        }
        return stringbuffer.append(list).append('}').toString();
    }
}
