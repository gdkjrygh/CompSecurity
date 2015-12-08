// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.places;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.Response;
import com.googlecode.flickrjandroid.Transport;
import com.googlecode.flickrjandroid.oauth.OAuthUtils;
import com.googlecode.flickrjandroid.photos.SearchParameters;
import com.googlecode.flickrjandroid.tags.Tag;
import com.googlecode.flickrjandroid.util.StringUtilities;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.googlecode.flickrjandroid.places:
//            Location, Place, PlacesList, PlaceType

public class PlacesInterface
{

    private static final String METHOD_FIND = "flickr.places.find";
    private static final String METHOD_FIND_BY_LATLON = "flickr.places.findByLatLon";
    private static final String METHOD_GET_CHILDREN_WITH_PHOTOS_PUBLIC = "flickr.places.getChildrenWithPhotosPublic";
    private static final String METHOD_GET_INFO = "flickr.places.getInfo";
    private static final String METHOD_GET_INFO_BY_URL = "flickr.places.getInfoByUrl";
    private static final String METHOD_GET_PLACETYPES = "flickr.places.getPlaceTypes";
    private static final String METHOD_GET_SHAPEHISTORY = "flickr.places.getShapeHistory";
    private static final String METHOD_GET_TOP_PLACES_LIST = "flickr.places.getTopPlacesList";
    private static final String METHOD_PLACES_FOR_BOUNDINGBOX = "flickr.places.placesForBoundingBox";
    private static final String METHOD_PLACES_FOR_CONTACTS = "flickr.places.placesForContacts";
    private static final String METHOD_PLACES_FOR_TAGS = "flickr.places.placesForTags";
    private static final String METHOD_PLACES_FOR_USER = "flickr.places.placesForUser";
    private static final String METHOD_RESOLVE_PLACE_ID = "flickr.places.resolvePlaceId";
    private static final String METHOD_RESOLVE_PLACE_URL = "flickr.places.resolvePlaceURL";
    private static final String METHOD_TAGS_FOR_PLACE = "flickr.places.tagsForPlace";
    private String apiKey;
    private String sharedSecret;
    private Transport transportAPI;

    public PlacesInterface(String s, String s1, Transport transport)
    {
        apiKey = s;
        sharedSecret = s1;
        transportAPI = transport;
    }

    private Location parseLocation(JSONObject jsonobject)
    {
        Location location = new Location();
        JSONObject jsonobject1 = jsonobject.getJSONObject("locality");
        JSONObject jsonobject2 = jsonobject.getJSONObject("county");
        JSONObject jsonobject3 = jsonobject.getJSONObject("region");
        JSONObject jsonobject4 = jsonobject.getJSONObject("country");
        location.setPlaceId(jsonobject.getString("place_id"));
        location.setPlaceUrl(jsonobject.getString("place_url"));
        location.setWoeId(jsonobject.getString("woeid"));
        location.setLatitude(jsonobject.getString("latitude"));
        location.setLongitude(jsonobject.getString("longitude"));
        location.setPlaceType(stringPlaceTypeToInt(jsonobject.getString("place_type")));
        location.setLocality(parseLocationPlace(jsonobject1, 7));
        location.setCounty(parseLocationPlace(jsonobject2, 9));
        location.setRegion(parseLocationPlace(jsonobject3, 8));
        location.setCountry(parseLocationPlace(jsonobject4, 12));
        return location;
    }

    private Place parseLocationPlace(JSONObject jsonobject, int i)
    {
        Place place = new Place();
        if (jsonobject.has("name"))
        {
            place.setName(jsonobject.getString("name"));
        } else
        {
            place.setName(jsonobject.getString("_content"));
        }
        place.setPlaceId(jsonobject.getString("place_id"));
        place.setPlaceUrl(jsonobject.getString("place_url"));
        place.setWoeId(jsonobject.getString("woeid"));
        place.setLatitude(jsonobject.getString("latitude"));
        place.setLongitude(jsonobject.getString("longitude"));
        place.setPlaceType(i);
        return place;
    }

    private Place parsePlace(JSONObject jsonobject)
    {
        Place place = new Place();
        place.setPlaceId(jsonobject.getString("place_id"));
        place.setPlaceUrl(jsonobject.getString("place_url"));
        place.setWoeId(jsonobject.getString("woeid"));
        place.setLatitude(jsonobject.getString("latitude"));
        place.setLongitude(jsonobject.getString("longitude"));
        place.setPhotoCount(jsonobject.optString("photo_count"));
        if (jsonobject.has("place_type"))
        {
            place.setPlaceType(jsonobject.getString("place_type"));
        } else
        {
            String s = jsonobject.optString("place_type_id");
            try
            {
                place.setPlaceType(intPlaceTypeToString(Integer.parseInt(s)));
            }
            catch (Exception exception) { }
        }
        if (jsonobject.has("name"))
        {
            place.setName(jsonobject.getString("name"));
            return place;
        } else
        {
            place.setName(jsonobject.getString("_content"));
            return place;
        }
    }

    private PlacesList parsePlacesList(JSONObject jsonobject)
    {
        boolean flag = false;
        PlacesList placeslist = new PlacesList();
        jsonobject = jsonobject.getJSONObject("places");
        JSONArray jsonarray = jsonobject.optJSONArray("place");
        placeslist.setPage("1");
        placeslist.setPages("1");
        placeslist.setLatitude(jsonobject.optDouble("latitude", -999D));
        placeslist.setLongitude(jsonobject.optDouble("longitude", -999D));
        int i;
        if (jsonarray != null)
        {
            i = jsonarray.length();
        } else
        {
            i = 0;
        }
        placeslist.setPerPage(i);
        placeslist.setTotal(placeslist.getPerPage());
        i = ((flag) ? 1 : 0);
        do
        {
            if (jsonarray == null || i >= jsonarray.length())
            {
                return placeslist;
            }
            placeslist.add(parsePlace(jsonarray.getJSONObject(i)));
            i++;
        } while (true);
    }

    private int stringPlaceTypeToInt(String s)
    {
        byte byte0 = 0;
        if (s.equals("locality"))
        {
            byte0 = 7;
        } else
        {
            if (s.equals("county"))
            {
                return 9;
            }
            if (s.equals("region"))
            {
                return 8;
            }
            if (s.equals("country"))
            {
                return 12;
            }
            if (s.equals("continent"))
            {
                return 29;
            }
            if (s.equals("neighbourhood"))
            {
                return 22;
            }
        }
        return byte0;
    }

    public PlacesList find(String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.places.find"));
        arraylist.add(new Parameter("api_key", apiKey));
        arraylist.add(new Parameter("query", s));
        s = transportAPI.get(transportAPI.getPath(), arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return parsePlacesList(s.getData());
        }
    }

    public PlacesList findByLatLon(double d, double d1, int i)
    {
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.places.findByLatLon"));
        ((List) (obj)).add(new Parameter("api_key", apiKey));
        ((List) (obj)).add(new Parameter("lat", String.valueOf(d)));
        ((List) (obj)).add(new Parameter("lon", String.valueOf(d1)));
        ((List) (obj)).add(new Parameter("accuracy", String.valueOf(i)));
        obj = transportAPI.get(transportAPI.getPath(), ((List) (obj)));
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        } else
        {
            return parsePlacesList(((Response) (obj)).getData());
        }
    }

    public PlacesList getChildrenWithPhotosPublic(String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.places.getChildrenWithPhotosPublic"));
        arraylist.add(new Parameter("api_key", apiKey));
        if (s != null)
        {
            arraylist.add(new Parameter("place_id", s));
        }
        if (s1 != null)
        {
            arraylist.add(new Parameter("woe_id", s1));
        }
        s = transportAPI.get(transportAPI.getPath(), arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return parsePlacesList(s.getData());
        }
    }

    public Location getInfo(String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        new Location();
        arraylist.add(new Parameter("method", "flickr.places.getInfo"));
        arraylist.add(new Parameter("api_key", apiKey));
        if (s != null)
        {
            arraylist.add(new Parameter("place_id", s));
        }
        if (s1 != null)
        {
            arraylist.add(new Parameter("woe_id", s1));
        }
        s = transportAPI.get(transportAPI.getPath(), arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return parseLocation(s.getData().getJSONObject("place"));
        }
    }

    public Location getInfoByUrl(String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.places.getInfoByUrl"));
        arraylist.add(new Parameter("api_key", apiKey));
        arraylist.add(new Parameter("url", s));
        s = transportAPI.get(transportAPI.getPath(), arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return parseLocation(s.getData().getJSONObject("place"));
        }
    }

    public List getPlaceTypes()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.places.getPlaceTypes"));
        arraylist.add(new Parameter("api_key", apiKey));
        Object obj = transportAPI.get(transportAPI.getPath(), arraylist);
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        }
        arraylist = new ArrayList();
        obj = ((Response) (obj)).getData().getJSONObject("place_types").optJSONArray("place_type");
        int i = 0;
        do
        {
            if (obj == null || i >= ((JSONArray) (obj)).length())
            {
                return arraylist;
            }
            JSONObject jsonobject = ((JSONArray) (obj)).getJSONObject(i);
            PlaceType placetype = new PlaceType();
            placetype.setPlaceTypeId(jsonobject.getString("id"));
            placetype.setPlaceTypeName(jsonobject.getString("_content"));
            arraylist.add(placetype);
            i++;
        } while (true);
    }

    public List getShapeHistory(String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        new Location();
        arraylist1.add(new Parameter("method", "flickr.places.getShapeHistory"));
        arraylist1.add(new Parameter("api_key", apiKey));
        if (s != null)
        {
            arraylist1.add(new Parameter("place_id", s));
        }
        if (s1 != null)
        {
            arraylist1.add(new Parameter("woe_id", s1));
        }
        s = transportAPI.get(transportAPI.getPath(), arraylist1);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            s.getData();
            return arraylist;
        }
    }

    public PlacesList getTopPlacesList(int i, Date date, String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.places.getTopPlacesList"));
        arraylist.add(new Parameter("api_key", apiKey));
        arraylist.add(new Parameter("place_type", intPlaceTypeToString(i)));
        if (s != null)
        {
            arraylist.add(new Parameter("place_id", s));
        }
        if (s1 != null)
        {
            arraylist.add(new Parameter("woe_id", s1));
        }
        if (date != null)
        {
            arraylist.add(new Parameter("date", ((DateFormat)SearchParameters.DATE_FORMATS.get()).format(date)));
        }
        date = transportAPI.get(transportAPI.getPath(), arraylist);
        if (date.isError())
        {
            throw new FlickrException(date.getErrorCode(), date.getErrorMessage());
        } else
        {
            return parsePlacesList(date.getData());
        }
    }

    public String intPlaceTypeToString(int i)
    {
        if (i == 12)
        {
            return "country";
        }
        if (i == 8)
        {
            return "region";
        }
        if (i == 7)
        {
            return "locality";
        }
        if (i == 29)
        {
            return "continent";
        }
        if (i == 22)
        {
            return "neighbourhood";
        } else
        {
            throw new FlickrException("33", "Not a valid place type");
        }
    }

    public PlacesList placesForBoundingBox(int i, String s)
    {
        ArrayList arraylist = new ArrayList();
        new PlacesList();
        arraylist.add(new Parameter("method", "flickr.places.placesForBoundingBox"));
        arraylist.add(new Parameter("api_key", apiKey));
        arraylist.add(new Parameter("place_type", intPlaceTypeToString(i)));
        arraylist.add(new Parameter("bbox", s));
        s = transportAPI.get(transportAPI.getPath(), arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return parsePlacesList(s.getData());
        }
    }

    public PlacesList placesForContacts(int i, String s, String s1, String s2, String s3)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.places.placesForContacts"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("place_type", intPlaceTypeToString(i)));
        if (s != null)
        {
            arraylist.add(new Parameter("place_id", s));
        }
        if (s1 != null)
        {
            arraylist.add(new Parameter("woe_id", s1));
        }
        if (s2 != null)
        {
            arraylist.add(new Parameter("threshold", s2));
        }
        if (s3 != null)
        {
            arraylist.add(new Parameter("contacts", s3));
        }
        OAuthUtils.addOAuthToken(arraylist);
        s = transportAPI.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return parsePlacesList(s.getData());
        }
    }

    public PlacesList placesForTags(int i, String s, String s1, String s2, String as[], String s3, String s4, 
            String s5, Date date, Date date1, Date date2, Date date3)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.places.placesForTags"));
        arraylist.add(new Parameter("api_key", apiKey));
        arraylist.add(new Parameter("place_type_id", i));
        if (s != null)
        {
            arraylist.add(new Parameter("woe_id", s));
        }
        if (s1 != null)
        {
            arraylist.add(new Parameter("place_id", s1));
        }
        if (s2 != null)
        {
            arraylist.add(new Parameter("threshold", s2));
        }
        if (as != null)
        {
            arraylist.add(new Parameter("tags", StringUtilities.join(as, ",")));
        }
        if (s3 != null)
        {
            arraylist.add(new Parameter("tag_mode", s3));
        }
        if (s4 != null)
        {
            arraylist.add(new Parameter("machine_tags", s4));
        }
        if (s5 != null)
        {
            arraylist.add(new Parameter("machine_tag_mode", s5));
        }
        if (date != null)
        {
            arraylist.add(new Parameter("min_upload_date", new Long(date.getTime() / 1000L)));
        }
        if (date1 != null)
        {
            arraylist.add(new Parameter("max_upload_date", new Long(date1.getTime() / 1000L)));
        }
        if (date2 != null)
        {
            arraylist.add(new Parameter("min_taken_date", ((DateFormat)SearchParameters.MYSQL_DATE_FORMATS.get()).format(date2)));
        }
        if (date3 != null)
        {
            arraylist.add(new Parameter("max_taken_date", ((DateFormat)SearchParameters.MYSQL_DATE_FORMATS.get()).format(date3)));
        }
        s = transportAPI.get(transportAPI.getPath(), arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return parsePlacesList(s.getData());
        }
    }

    public PlacesList placesForUser(int i, String s, String s1, String s2, Date date, Date date1, Date date2, 
            Date date3)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.places.placesForUser"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("place_type", intPlaceTypeToString(i)));
        if (s1 != null)
        {
            arraylist.add(new Parameter("place_id", s1));
        }
        if (s != null)
        {
            arraylist.add(new Parameter("woe_id", s));
        }
        if (s2 != null)
        {
            arraylist.add(new Parameter("threshold", s2));
        }
        if (date != null)
        {
            arraylist.add(new Parameter("min_upload_date", new Long(date.getTime() / 1000L)));
        }
        if (date1 != null)
        {
            arraylist.add(new Parameter("max_upload_date", new Long(date1.getTime() / 1000L)));
        }
        if (date2 != null)
        {
            arraylist.add(new Parameter("min_taken_date", ((DateFormat)SearchParameters.MYSQL_DATE_FORMATS.get()).format(date2)));
        }
        if (date3 != null)
        {
            arraylist.add(new Parameter("max_taken_date", ((DateFormat)SearchParameters.MYSQL_DATE_FORMATS.get()).format(date3)));
        }
        OAuthUtils.addOAuthToken(arraylist);
        s = transportAPI.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return parsePlacesList(s.getData());
        }
    }

    public List tagsForPlace(String s, String s1, Date date, Date date1, Date date2, Date date3)
    {
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist = new ArrayList();
        arraylist1.add(new Parameter("method", "flickr.places.tagsForPlace"));
        arraylist1.add(new Parameter("api_key", apiKey));
        if (s != null)
        {
            arraylist1.add(new Parameter("woe_id", s));
        }
        if (s1 != null)
        {
            arraylist1.add(new Parameter("place_id", s1));
        }
        if (date != null)
        {
            arraylist1.add(new Parameter("min_upload_date", new Long(date.getTime() / 1000L)));
        }
        if (date1 != null)
        {
            arraylist1.add(new Parameter("max_upload_date", new Long(date1.getTime() / 1000L)));
        }
        if (date2 != null)
        {
            arraylist1.add(new Parameter("min_taken_date", ((DateFormat)SearchParameters.MYSQL_DATE_FORMATS.get()).format(date2)));
        }
        if (date3 != null)
        {
            arraylist1.add(new Parameter("max_taken_date", ((DateFormat)SearchParameters.MYSQL_DATE_FORMATS.get()).format(date3)));
        }
        s = transportAPI.get(transportAPI.getPath(), arraylist1);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        }
        s = s.getData().getJSONObject("tags").optJSONArray("tag");
        int i = 0;
        do
        {
            if (s == null || i >= s.length())
            {
                return arraylist;
            }
            s1 = s.getJSONObject(i);
            date = new Tag();
            date.setCount(s1.getString("count"));
            date.setValue(s1.getString("_content"));
            arraylist.add(date);
            i++;
        } while (true);
    }
}
