// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.photos.geo;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.Response;
import com.googlecode.flickrjandroid.Transport;
import com.googlecode.flickrjandroid.oauth.OAuthUtils;
import com.googlecode.flickrjandroid.photos.GeoData;
import com.googlecode.flickrjandroid.photos.PhotoList;
import com.googlecode.flickrjandroid.photos.PhotoUtils;
import com.googlecode.flickrjandroid.util.StringUtilities;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

// Referenced classes of package com.googlecode.flickrjandroid.photos.geo:
//            GeoPermissions

public class GeoInterface
{

    public static final String METHOD_BATCH_CORRECT_LOCATION = "flickr.photos.geo.batchCorrectLocation";
    public static final String METHOD_CORRECT_LOCATION = "flickr.photos.geo.correctLocation";
    public static final String METHOD_GET_LOCATION = "flickr.photos.geo.getLocation";
    public static final String METHOD_GET_PERMS = "flickr.photos.geo.getPerms";
    public static final String METHOD_PHOTOS_FOR_LOCATION = "flickr.photos.geo.photosForLocation";
    public static final String METHOD_REMOVE_LOCATION = "flickr.photos.geo.removeLocation";
    public static final String METHOD_SET_CONTEXT = "flickr.photos.geo.setContext";
    public static final String METHOD_SET_LOCATION = "flickr.photos.geo.setLocation";
    public static final String METHOD_SET_PERMS = "flickr.photos.geo.setPerms";
    private String apiKey;
    private String sharedSecret;
    private Transport transport;

    public GeoInterface(String s, String s1, Transport transport1)
    {
        apiKey = s;
        sharedSecret = s1;
        transport = transport1;
    }

    public void batchCorrectLocation(GeoData geodata, String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.geo.batchCorrectLocation"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        if (s != null)
        {
            arraylist.add(new Parameter("place_id", s));
        }
        if (s1 != null)
        {
            arraylist.add(new Parameter("woe_id", s1));
        }
        arraylist.add(new Parameter("lat", Float.valueOf(geodata.getLatitude())));
        arraylist.add(new Parameter("lon", Float.valueOf(geodata.getLongitude())));
        arraylist.add(new Parameter("accuracy", geodata.getAccuracy()));
        OAuthUtils.addOAuthToken(arraylist);
        geodata = transport.postJSON(sharedSecret, arraylist);
        if (geodata.isError())
        {
            throw new FlickrException(geodata.getErrorCode(), geodata.getErrorMessage());
        } else
        {
            return;
        }
    }

    public void correctLocation(String s, String s1, String s2)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.geo.correctLocation"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("photo_id", s));
        if (s1 != null)
        {
            arraylist.add(new Parameter("place_id", s1));
        }
        if (s2 != null)
        {
            arraylist.add(new Parameter("woe_id", s2));
        }
        OAuthUtils.addOAuthToken(arraylist);
        s = transport.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return;
        }
    }

    public GeoData getLocation(String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.geo.getLocation"));
        arraylist.add(new Parameter("api_key", apiKey));
        arraylist.add(new Parameter("photo_id", s));
        s = transport.get(transport.getPath(), arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            s = s.getData().getJSONObject("photo").getJSONObject("location");
            String s1 = s.getString("latitude");
            return new GeoData(s.getString("longitude"), s1, s.getString("accuracy"));
        }
    }

    public GeoPermissions getPerms(String s)
    {
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.photos.geo.getPerms"));
        ((List) (obj)).add(new Parameter("oauth_consumer_key", apiKey));
        ((List) (obj)).add(new Parameter("photo_id", s));
        OAuthUtils.addOAuthToken(((List) (obj)));
        obj = transport.postJSON(sharedSecret, ((List) (obj)));
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        } else
        {
            s = new GeoPermissions();
            obj = ((Response) (obj)).getData().getJSONObject("perms");
            s.setPublic("1".equals(((JSONObject) (obj)).getString("ispublic")));
            s.setContact("1".equals(((JSONObject) (obj)).getString("iscontact")));
            s.setFriend("1".equals(((JSONObject) (obj)).getString("isfriend")));
            s.setFamily("1".equals(((JSONObject) (obj)).getString("isfamily")));
            return s;
        }
    }

    public PhotoList photosForLocation(GeoData geodata, Set set, int i, int j)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.geo.photosForLocation"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        if (set.size() > 0)
        {
            arraylist.add(new Parameter("extras", StringUtilities.join(set, ",")));
        }
        if (i > 0)
        {
            arraylist.add(new Parameter("per_page", i));
        }
        if (j > 0)
        {
            arraylist.add(new Parameter("page", j));
        }
        arraylist.add(new Parameter("lat", Float.valueOf(geodata.getLatitude())));
        arraylist.add(new Parameter("lon", Float.valueOf(geodata.getLongitude())));
        arraylist.add(new Parameter("accuracy", geodata.getAccuracy()));
        OAuthUtils.addOAuthToken(arraylist);
        geodata = transport.postJSON(sharedSecret, arraylist);
        if (geodata.isError())
        {
            throw new FlickrException(geodata.getErrorCode(), geodata.getErrorMessage());
        } else
        {
            return PhotoUtils.createPhotoList(geodata.getData());
        }
    }

    public void removeLocation(String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.geo.removeLocation"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("photo_id", s));
        OAuthUtils.addOAuthToken(arraylist);
        s = transport.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return;
        }
    }

    public void setContext(String s, int i)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.geo.setContext"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("photo_id", s));
        arraylist.add(new Parameter("context", String.valueOf(i)));
        OAuthUtils.addOAuthToken(arraylist);
        s = transport.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return;
        }
    }

    public void setLocation(String s, GeoData geodata)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.geo.setLocation"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("photo_id", s));
        arraylist.add(new Parameter("lat", String.valueOf(geodata.getLatitude())));
        arraylist.add(new Parameter("lon", String.valueOf(geodata.getLongitude())));
        if (geodata.getAccuracy() > 0)
        {
            arraylist.add(new Parameter("accuracy", String.valueOf(geodata.getAccuracy())));
        }
        OAuthUtils.addOAuthToken(arraylist);
        s = transport.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return;
        }
    }

    public void setPerms(String s, GeoPermissions geopermissions)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.geo.setPerms"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("photo_id", s));
        if (geopermissions.isPublic())
        {
            s = "1";
        } else
        {
            s = "0";
        }
        arraylist.add(new Parameter("is_public", s));
        if (geopermissions.isContact())
        {
            s = "1";
        } else
        {
            s = "0";
        }
        arraylist.add(new Parameter("is_contact", s));
        if (geopermissions.isFriend())
        {
            s = "1";
        } else
        {
            s = "0";
        }
        arraylist.add(new Parameter("is_friend", s));
        if (geopermissions.isFamily())
        {
            s = "1";
        } else
        {
            s = "0";
        }
        arraylist.add(new Parameter("is_family", s));
        OAuthUtils.addOAuthToken(arraylist);
        s = transport.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return;
        }
    }
}
