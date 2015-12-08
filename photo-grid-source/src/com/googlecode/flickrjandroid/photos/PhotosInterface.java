// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.photos;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.REST;
import com.googlecode.flickrjandroid.RequestContext;
import com.googlecode.flickrjandroid.Response;
import com.googlecode.flickrjandroid.Transport;
import com.googlecode.flickrjandroid.oauth.OAuthUtils;
import com.googlecode.flickrjandroid.people.User;
import com.googlecode.flickrjandroid.photos.geo.GeoInterface;
import com.googlecode.flickrjandroid.util.JSONUtils;
import com.googlecode.flickrjandroid.util.StringUtilities;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.googlecode.flickrjandroid.photos:
//            b, PhotoPlace, PhotoUtils, Extras, 
//            Photocount, Exif, PhotoFavouriteUserList, Photo, 
//            Permissions, Size, SearchParameters, PhotoList, 
//            PhotoContext

public class PhotosInterface
{

    private static final ThreadLocal DATE_FORMATS = new b();
    public static final String METHOD_ADD_TAGS = "flickr.photos.addTags";
    public static final String METHOD_DELETE = "flickr.photos.delete";
    public static final String METHOD_GET_ALL_CONTEXTS = "flickr.photos.getAllContexts";
    public static final String METHOD_GET_CONTACTS_PHOTOS = "flickr.photos.getContactsPhotos";
    public static final String METHOD_GET_CONTACTS_PUBLIC_PHOTOS = "flickr.photos.getContactsPublicPhotos";
    public static final String METHOD_GET_CONTEXT = "flickr.photos.getContext";
    public static final String METHOD_GET_COUNTS = "flickr.photos.getCounts";
    public static final String METHOD_GET_EXIF = "flickr.photos.getExif";
    public static final String METHOD_GET_FAVORITES = "flickr.photos.getFavorites";
    public static final String METHOD_GET_INFO = "flickr.photos.getInfo";
    public static final String METHOD_GET_INTERESTINGNESS = "flickr.interestingness.getList";
    public static final String METHOD_GET_NOT_IN_SET = "flickr.photos.getNotInSet";
    public static final String METHOD_GET_PERMS = "flickr.photos.getPerms";
    public static final String METHOD_GET_RECENT = "flickr.photos.getRecent";
    public static final String METHOD_GET_SIZES = "flickr.photos.getSizes";
    public static final String METHOD_GET_UNTAGGED = "flickr.photos.getUntagged";
    public static final String METHOD_GET_WITHOUT_GEO_DATA = "flickr.photos.getWithoutGeoData";
    public static final String METHOD_GET_WITH_GEO_DATA = "flickr.photos.getWithGeoData";
    public static final String METHOD_RECENTLY_UPDATED = "flickr.photos.recentlyUpdated";
    public static final String METHOD_REMOVE_TAG = "flickr.photos.removeTag";
    public static final String METHOD_SEARCH = "flickr.photos.search";
    public static final String METHOD_SET_CONTENTTYPE = "flickr.photos.setContentType";
    public static final String METHOD_SET_DATES = "flickr.photos.setDates";
    public static final String METHOD_SET_META = "flickr.photos.setMeta";
    public static final String METHOD_SET_PERMS = "flickr.photos.setPerms";
    public static final String METHOD_SET_SAFETYLEVEL = "flickr.photos.setSafetyLevel";
    public static final String METHOD_SET_TAGS = "flickr.photos.setTags";
    public static final long serialVersionUID = 12L;
    private String apiKey;
    private GeoInterface geoInterface;
    private String sharedSecret;
    private Transport transport;

    public PhotosInterface(String s, String s1, Transport transport1)
    {
        geoInterface = null;
        apiKey = s;
        sharedSecret = s1;
        transport = transport1;
    }

    public void addTags(String s, String as[])
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.addTags"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("photo_id", s));
        arraylist.add(new Parameter("tags", StringUtilities.join(as, " ", true)));
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

    public void delete(String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.delete"));
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

    public List getAllContexts(String s)
    {
        ArrayList arraylist;
        Object obj;
        int i;
        arraylist = new ArrayList();
        obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.photos.getAllContexts"));
        boolean flag = OAuthUtils.hasSigned();
        ((List) (obj)).add(new Parameter("photo_id", s));
        if (flag)
        {
            ((List) (obj)).add(new Parameter("oauth_consumer_key", apiKey));
            OAuthUtils.addOAuthToken(((List) (obj)));
        } else
        {
            ((List) (obj)).add(new Parameter("api_key", apiKey));
        }
        if (flag)
        {
            s = transport.postJSON(sharedSecret, ((List) (obj)));
        } else
        {
            s = transport.get(transport.getPath(), ((List) (obj)));
        }
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        }
        obj = s.getData().optJSONArray("set");
        i = 0;
_L3:
        if (obj != null && i < ((JSONArray) (obj)).length()) goto _L2; else goto _L1
_L1:
        s = s.getData().optJSONArray("pool");
        i = 0;
_L4:
        if (s == null || i >= s.length())
        {
            return arraylist;
        }
        break MISSING_BLOCK_LABEL_278;
_L2:
        JSONObject jsonobject1 = ((JSONArray) (obj)).getJSONObject(i);
        arraylist.add(new PhotoPlace(1, jsonobject1.getString("id"), jsonobject1.getString("title")));
        i++;
          goto _L3
        JSONObject jsonobject = s.getJSONObject(i);
        arraylist.add(new PhotoPlace(2, jsonobject.getString("id"), jsonobject.getString("title")));
        i++;
          goto _L4
    }

    public PhotoList getContactsPhotos(int i, Set set, boolean flag, boolean flag1, boolean flag2, int j, int k)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.getContactsPhotos"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        if (k > 0)
        {
            arraylist.add(new Parameter("per_page", new Integer(k)));
        }
        if (j > 0)
        {
            arraylist.add(new Parameter("page", new Integer(j)));
        }
        if (i > 0)
        {
            arraylist.add(new Parameter("count", i));
        }
        if (flag)
        {
            arraylist.add(new Parameter("just_friends", "1"));
        }
        if (flag1)
        {
            arraylist.add(new Parameter("single_photo", "1"));
        }
        if (flag2)
        {
            arraylist.add(new Parameter("include_self", "1"));
        }
        if (set != null)
        {
            arraylist.add(new Parameter("extras", StringUtilities.join(set, ",")));
        }
        OAuthUtils.addOAuthToken(arraylist);
        set = transport.postJSON(sharedSecret, arraylist);
        if (set.isError())
        {
            throw new FlickrException(set.getErrorCode(), set.getErrorMessage());
        } else
        {
            return PhotoUtils.createPhotoList(set.getData());
        }
    }

    public PhotoList getContactsPhotos(int i, boolean flag, boolean flag1, boolean flag2)
    {
        return getContactsPhotos(i, Extras.MIN_EXTRAS, flag, flag1, flag2, 0, 0);
    }

    public PhotoList getContactsPublicPhotos(String s, int i, boolean flag, boolean flag1, boolean flag2)
    {
        return getContactsPublicPhotos(s, Extras.MIN_EXTRAS, i, flag, flag1, flag2);
    }

    public PhotoList getContactsPublicPhotos(String s, Set set, int i, boolean flag, boolean flag1, boolean flag2)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.getContactsPublicPhotos"));
        arraylist.add(new Parameter("api_key", apiKey));
        arraylist.add(new Parameter("user_id", s));
        if (i > 0)
        {
            arraylist.add(new Parameter("count", i));
        }
        if (flag)
        {
            arraylist.add(new Parameter("just_friends", "1"));
        }
        if (flag1)
        {
            arraylist.add(new Parameter("single_photo", "1"));
        }
        if (flag2)
        {
            arraylist.add(new Parameter("include_self", "1"));
        }
        if (set != null)
        {
            arraylist.add(new Parameter("extras", StringUtilities.join(set, ",")));
        }
        s = transport.get(transport.getPath(), arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return PhotoUtils.createPhotoList(s.getData());
        }
    }

    public PhotoContext getContext(String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.getContext"));
        arraylist.add(new Parameter("api_key", apiKey));
        arraylist.add(new Parameter("photo_id", s));
        s = transport.get(transport.getPath(), arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return PhotoUtils.createPhotoContext(s.getData());
        }
    }

    public Collection getCounts(Date adate[], Date adate1[])
    {
        ArrayList arraylist;
        ArrayList arraylist1;
        boolean flag;
        flag = false;
        arraylist = new ArrayList();
        arraylist1 = new ArrayList();
        arraylist1.add(new Parameter("method", "flickr.photos.getCounts"));
        arraylist1.add(new Parameter("oauth_consumer_key", apiKey));
        if (adate == null && adate1 == null)
        {
            throw new IllegalArgumentException("You must provide a value for either dates or takenDates");
        }
        if (adate == null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist2;
        int i;
        arraylist2 = new ArrayList();
        i = 0;
_L12:
        if (i < adate.length) goto _L4; else goto _L3
_L3:
        arraylist1.add(new Parameter("dates", StringUtilities.join(arraylist2, ",")));
_L2:
        if (adate1 == null) goto _L6; else goto _L5
_L5:
        adate = new ArrayList();
        i = 0;
_L10:
        if (i < adate1.length) goto _L8; else goto _L7
_L7:
        arraylist1.add(new Parameter("taken_dates", StringUtilities.join(adate, ",")));
_L6:
        OAuthUtils.addOAuthToken(arraylist1);
        adate = transport.postJSON(sharedSecret, arraylist1);
        if (adate.isError())
        {
            throw new FlickrException(adate.getErrorCode(), adate.getErrorMessage());
        }
        break; /* Loop/switch isn't completed */
_L4:
        arraylist2.add(String.valueOf(adate[i].getTime() / 1000L));
        i++;
        continue; /* Loop/switch isn't completed */
_L8:
        adate.add(String.valueOf(adate1[i].getTime() / 1000L));
        i++;
        if (true) goto _L10; else goto _L9
_L9:
        adate = adate.getData().getJSONObject("photocounts").optJSONArray("photocount");
        int j = ((flag) ? 1 : 0);
        do
        {
            if (adate == null || j >= adate.length())
            {
                return arraylist;
            }
            adate1 = adate.getJSONObject(j);
            Photocount photocount = new Photocount();
            photocount.setCount(adate1.getInt("count"));
            photocount.setFromDate(adate1.getString("fromdate"));
            photocount.setToDate(adate1.getString("todate"));
            arraylist.add(photocount);
            j++;
        } while (true);
        if (true) goto _L12; else goto _L11
_L11:
    }

    public Collection getExif(String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.getExif"));
        arraylist.add(new Parameter("api_key", apiKey));
        arraylist.add(new Parameter("photo_id", s));
        if (s1 != null)
        {
            arraylist.add(new Parameter("secret", s1));
        }
        s1 = transport.get(transport.getPath(), arraylist);
        if (s1.isError())
        {
            throw new FlickrException(s1.getErrorCode(), s1.getErrorMessage());
        }
        s = new ArrayList();
        s1 = s1.getData().getJSONObject("photo").optJSONArray("exif");
        int i = 0;
        do
        {
            if (s1 == null || i >= s1.length())
            {
                return s;
            }
            JSONObject jsonobject = s1.getJSONObject(i);
            Exif exif = new Exif();
            exif.setTagspace(jsonobject.getString("tagspace"));
            exif.setTagspaceId(jsonobject.getString("tagspaceid"));
            exif.setTag(jsonobject.getString("tag"));
            exif.setLabel(jsonobject.getString("label"));
            exif.setRaw(JSONUtils.getChildValue(jsonobject, "raw"));
            exif.setClean(JSONUtils.getChildValue(jsonobject, "clean"));
            s.add(exif);
            i++;
        } while (true);
    }

    public PhotoFavouriteUserList getFavorites(String s, int i, int j)
    {
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.photos.getFavorites"));
        ((List) (obj)).add(new Parameter("api_key", apiKey));
        ((List) (obj)).add(new Parameter("photo_id", s));
        if (i > 0)
        {
            ((List) (obj)).add(new Parameter("per_page", i));
        }
        if (j > 0)
        {
            ((List) (obj)).add(new Parameter("page", j));
        }
        obj = transport.get(transport.getPath(), ((List) (obj)));
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        }
        s = new PhotoFavouriteUserList();
        obj = ((Response) (obj)).getData().getJSONObject("photo");
        s.setPage(((JSONObject) (obj)).getInt("page"));
        s.setPerPage(((JSONObject) (obj)).getInt("perpage"));
        s.setPages(((JSONObject) (obj)).getInt("pages"));
        s.setTotal(((JSONObject) (obj)).getInt("total"));
        s.setSecret(((JSONObject) (obj)).optString("secret"));
        s.setServer(((JSONObject) (obj)).optString("server"));
        s.setFarm(((JSONObject) (obj)).optInt("farm"));
        obj = ((JSONObject) (obj)).optJSONArray("person");
        i = 0;
        do
        {
            if (obj == null || i >= ((JSONArray) (obj)).length())
            {
                return s;
            }
            JSONObject jsonobject = ((JSONArray) (obj)).getJSONObject(i);
            User user = new User();
            user.setId(jsonobject.getString("nsid"));
            user.setUsername(jsonobject.getString("username"));
            user.setFaveDate(jsonobject.getString("favedate"));
            s.add(user);
            i++;
        } while (true);
    }

    public GeoInterface getGeoInterface()
    {
        this;
        JVM INSTR monitorenter ;
        GeoInterface geointerface;
        if (geoInterface == null)
        {
            geoInterface = new GeoInterface(apiKey, sharedSecret, transport);
        }
        geointerface = geoInterface;
        this;
        JVM INSTR monitorexit ;
        return geointerface;
        Exception exception;
        exception;
        throw exception;
    }

    public InputStream getImageAsStream(Photo photo, int i)
    {
        if (i == 1)
        {
            photo.getSmallSquareUrl();
        }
        if (i != 6) goto _L2; else goto _L1
_L1:
        photo.getLargeSquareUrl();
_L8:
        if (i != 10) goto _L4; else goto _L3
_L3:
        photo = photo.getSmall320Url();
_L6:
        photo = (HttpURLConnection)(new URL(photo)).openConnection();
        if ((transport instanceof REST) && ((REST)transport).isProxyAuth())
        {
            photo.setRequestProperty("Proxy-Authorization", (new StringBuilder("Basic ")).append(((REST)transport).getProxyCredentials()).toString());
        }
        photo.connect();
        return photo.getInputStream();
_L2:
        if (i == 0)
        {
            photo.getThumbnailUrl();
        } else
        if (i == 2)
        {
            photo.getSmallUrl();
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (i == 3)
        {
            photo = photo.getMediumUrl();
            continue; /* Loop/switch isn't completed */
        }
        if (i == 11)
        {
            photo = photo.getMedium640Url();
            continue; /* Loop/switch isn't completed */
        }
        if (i == 12)
        {
            photo = photo.getMedium800Url();
            continue; /* Loop/switch isn't completed */
        }
        if (i == 4)
        {
            photo = photo.getLargeUrl();
            continue; /* Loop/switch isn't completed */
        }
        if (i == 13)
        {
            photo = photo.getLarge1600Url();
            continue; /* Loop/switch isn't completed */
        }
        if (i == 14)
        {
            photo = photo.getLarge2048Url();
            continue; /* Loop/switch isn't completed */
        }
        if (i != 5)
        {
            break; /* Loop/switch isn't completed */
        }
        photo = photo.getOriginalUrl();
        if (true) goto _L6; else goto _L5
_L5:
        throw new FlickrException("0", "Unknown Photo-size");
        if (true) goto _L8; else goto _L7
_L7:
    }

    public Photo getInfo(String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.getInfo"));
        boolean flag = OAuthUtils.hasSigned();
        arraylist.add(new Parameter("photo_id", s));
        if (s1 != null)
        {
            arraylist.add(new Parameter("secret", s1));
        }
        if (flag)
        {
            arraylist.add(new Parameter("oauth_consumer_key", apiKey));
            OAuthUtils.addOAuthToken(arraylist);
        } else
        {
            arraylist.add(new Parameter("api_key", apiKey));
        }
        if (flag)
        {
            s = transport.postJSON(sharedSecret, arraylist);
        } else
        {
            s = transport.get(transport.getPath(), arraylist);
        }
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return PhotoUtils.createPhoto(s.getData().getJSONObject("photo"));
        }
    }

    public PhotoList getNotInSet(int i, int j)
    {
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.photos.getNotInSet"));
        ((List) (obj)).add(new Parameter("oauth_consumer_key", apiKey));
        List list = RequestContext.getRequestContext().getExtras();
        if (list.size() > 0)
        {
            ((List) (obj)).add(new Parameter("extras", StringUtilities.join(list, ",")));
        }
        if (i > 0)
        {
            ((List) (obj)).add(new Parameter("per_page", i));
        }
        if (j > 0)
        {
            ((List) (obj)).add(new Parameter("page", j));
        }
        OAuthUtils.addOAuthToken(((List) (obj)));
        obj = transport.postJSON(sharedSecret, ((List) (obj)));
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        } else
        {
            return PhotoUtils.createPhotoList(((Response) (obj)).getData());
        }
    }

    public Permissions getPerms(String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.getPerms"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("photo_id", s));
        OAuthUtils.addOAuthToken(arraylist);
        s = transport.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            s = s.getData().getJSONObject("perms");
            Permissions permissions = new Permissions();
            permissions.setId(s.getString("id"));
            permissions.setPublicFlag("1".equals(s.getString("ispublic")));
            permissions.setFriendFlag("1".equals(s.getString("isfriend")));
            permissions.setFamilyFlag("1".equals(s.getString("isfamily")));
            permissions.setComment(s.getString("permcomment"));
            permissions.setAddmeta(s.getString("permaddmeta"));
            return permissions;
        }
    }

    public Photo getPhoto(String s)
    {
        return getPhoto(s, null);
    }

    public Photo getPhoto(String s, String s1)
    {
        return getInfo(s, s1);
    }

    public PhotoList getRecent(Set set, int i, int j)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.getRecent"));
        arraylist.add(new Parameter("api_key", apiKey));
        if (set != null && !set.isEmpty())
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
        set = transport.get(transport.getPath(), arraylist);
        if (set.isError())
        {
            throw new FlickrException(set.getErrorCode(), set.getErrorMessage());
        } else
        {
            return PhotoUtils.createPhotoList(set.getData());
        }
    }

    public Collection getSizes(String s)
    {
        return getSizes(s, false);
    }

    public Collection getSizes(String s, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        arraylist1.add(new Parameter("method", "flickr.photos.getSizes"));
        arraylist1.add(new Parameter("photo_id", s));
        if (flag)
        {
            OAuthUtils.addOAuthToken(arraylist1);
        } else
        {
            arraylist1.add(new Parameter("api_key", apiKey));
        }
        if (flag)
        {
            s = transport.postJSON(sharedSecret, arraylist1);
        } else
        {
            s = transport.get(transport.getPath(), arraylist1);
        }
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        }
        s = s.getData().getJSONObject("sizes").optJSONArray("size");
        int i = 0;
        do
        {
            if (s == null || i >= s.length())
            {
                return arraylist;
            }
            JSONObject jsonobject = s.getJSONObject(i);
            Size size = new Size();
            size.setLabel(jsonobject.getString("label"));
            size.setWidth(jsonobject.getString("width"));
            size.setHeight(jsonobject.getString("height"));
            size.setSource(jsonobject.getString("source"));
            size.setUrl(jsonobject.getString("url"));
            arraylist.add(size);
            i++;
        } while (true);
    }

    public PhotoList getUntagged(int i, int j)
    {
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.photos.getUntagged"));
        ((List) (obj)).add(new Parameter("oauth_consumer_key", apiKey));
        if (i > 0)
        {
            ((List) (obj)).add(new Parameter("per_page", i));
        }
        if (j > 0)
        {
            ((List) (obj)).add(new Parameter("page", j));
        }
        OAuthUtils.addOAuthToken(((List) (obj)));
        obj = transport.postJSON(sharedSecret, ((List) (obj)));
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        } else
        {
            return PhotoUtils.createPhotoList(((Response) (obj)).getData());
        }
    }

    public PhotoList getWithGeoData(Date date, Date date1, Date date2, Date date3, int i, String s, Set set, 
            int j, int k)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.getWithGeoData"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        if (date != null)
        {
            arraylist.add(new Parameter("min_upload_date", date.getTime() / 1000L));
        }
        if (date1 != null)
        {
            arraylist.add(new Parameter("max_upload_date", date1.getTime() / 1000L));
        }
        if (date2 != null)
        {
            arraylist.add(new Parameter("min_taken_date", date2.getTime() / 1000L));
        }
        if (date3 != null)
        {
            arraylist.add(new Parameter("max_taken_date", date3.getTime() / 1000L));
        }
        if (i > 0)
        {
            arraylist.add(new Parameter("privacy_filter", i));
        }
        if (s != null)
        {
            arraylist.add(new Parameter("sort", s));
        }
        if (set != null && !set.isEmpty())
        {
            arraylist.add(new Parameter("extras", StringUtilities.join(set, ",")));
        }
        if (j > 0)
        {
            arraylist.add(new Parameter("per_page", j));
        }
        if (k > 0)
        {
            arraylist.add(new Parameter("page", k));
        }
        OAuthUtils.addOAuthToken(arraylist);
        date = transport.postJSON(sharedSecret, arraylist);
        if (date.isError())
        {
            throw new FlickrException(date.getErrorCode(), date.getErrorMessage());
        } else
        {
            return PhotoUtils.createPhotoList(date.getData());
        }
    }

    public PhotoList getWithoutGeoData(Date date, Date date1, Date date2, Date date3, int i, String s, Set set, 
            int j, int k)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.getWithoutGeoData"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        if (date != null)
        {
            arraylist.add(new Parameter("min_upload_date", date.getTime() / 1000L));
        }
        if (date1 != null)
        {
            arraylist.add(new Parameter("max_upload_date", date1.getTime() / 1000L));
        }
        if (date2 != null)
        {
            arraylist.add(new Parameter("min_taken_date", date2.getTime() / 1000L));
        }
        if (date3 != null)
        {
            arraylist.add(new Parameter("max_taken_date", date3.getTime() / 1000L));
        }
        if (i > 0)
        {
            arraylist.add(new Parameter("privacy_filter", i));
        }
        if (s != null)
        {
            arraylist.add(new Parameter("sort", s));
        }
        if (set != null && !set.isEmpty())
        {
            arraylist.add(new Parameter("extras", StringUtilities.join(set, ",")));
        }
        if (j > 0)
        {
            arraylist.add(new Parameter("per_page", j));
        }
        if (k > 0)
        {
            arraylist.add(new Parameter("page", k));
        }
        OAuthUtils.addOAuthToken(arraylist);
        date = transport.postJSON(sharedSecret, arraylist);
        if (date.isError())
        {
            throw new FlickrException(date.getErrorCode(), date.getErrorMessage());
        } else
        {
            return PhotoUtils.createPhotoList(date.getData());
        }
    }

    public PhotoList recentlyUpdated(Date date, Set set, int i, int j)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.recentlyUpdated"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("min_date", date.getTime() / 1000L));
        if (set != null && !set.isEmpty())
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
        OAuthUtils.addOAuthToken(arraylist);
        date = transport.postJSON(sharedSecret, arraylist);
        if (date.isError())
        {
            throw new FlickrException(date.getErrorCode(), date.getErrorMessage());
        } else
        {
            return PhotoUtils.createPhotoList(date.getData());
        }
    }

    public void removeTag(String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.removeTag"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("tag_id", s));
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

    public PhotoList search(SearchParameters searchparameters, int i, int j)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.search"));
        boolean flag = OAuthUtils.hasSigned();
        if (flag)
        {
            arraylist.add(new Parameter("oauth_consumer_key", apiKey));
            OAuthUtils.addOAuthToken(arraylist);
        } else
        {
            arraylist.add(new Parameter("api_key", apiKey));
        }
        arraylist.addAll(searchparameters.getAsParameters());
        if (i > 0)
        {
            arraylist.add(new Parameter("per_page", String.valueOf(i)));
        }
        if (j > 0)
        {
            arraylist.add(new Parameter("page", String.valueOf(j)));
        }
        if (flag)
        {
            searchparameters = transport.postJSON(sharedSecret, arraylist);
        } else
        {
            searchparameters = transport.get(transport.getPath(), arraylist);
        }
        if (searchparameters.isError())
        {
            throw new FlickrException(searchparameters.getErrorCode(), searchparameters.getErrorMessage());
        } else
        {
            return PhotoUtils.createPhotoList(searchparameters.getData());
        }
    }

    public PhotoList searchInterestingness(SearchParameters searchparameters, int i, int j)
    {
        PhotoList photolist = new PhotoList();
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.interestingness.getList"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.addAll(searchparameters.getAsParameters());
        if (i > 0)
        {
            arraylist.add(new Parameter("per_page", i));
        }
        if (j > 0)
        {
            arraylist.add(new Parameter("page", j));
        }
        OAuthUtils.addOAuthToken(arraylist);
        searchparameters = transport.postJSON(sharedSecret, arraylist);
        if (searchparameters.isError())
        {
            throw new FlickrException(searchparameters.getErrorCode(), searchparameters.getErrorMessage());
        }
        searchparameters = searchparameters.getData().getJSONObject("photos");
        photolist.setPage(searchparameters.getInt("page"));
        photolist.setPages(searchparameters.getInt("pages"));
        photolist.setPerPage(searchparameters.getInt("perpage"));
        photolist.setTotal(searchparameters.getInt("total"));
        searchparameters = searchparameters.optJSONArray("photo");
        i = 0;
        do
        {
            if (searchparameters == null || i >= searchparameters.length())
            {
                return photolist;
            }
            JSONObject jsonobject = searchparameters.getJSONObject(i);
            Photo photo = new Photo();
            photo.setId(jsonobject.getString("id"));
            User user = new User();
            user.setId(jsonobject.getString("owner"));
            photo.setOwner(user);
            photo.setSecret(jsonobject.getString("secret"));
            photo.setServer(jsonobject.getString("server"));
            photo.setFarm(jsonobject.getString("farm"));
            photo.setTitle(jsonobject.getString("title"));
            photo.setPublicFlag("1".equals(jsonobject.getString("ispublic")));
            photo.setFriendFlag("1".equals(jsonobject.getString("isfriend")));
            photo.setFamilyFlag("1".equals(jsonobject.getString("isfamily")));
            photolist.add(photo);
            i++;
        } while (true);
    }

    public void setContentType(String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.setContentType"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("photo_id", s));
        arraylist.add(new Parameter("content_type", s1));
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

    public void setDates(String s, Date date, Date date1, String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.setDates"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("photo_id", s));
        if (date != null)
        {
            arraylist.add(new Parameter("date_posted", new Long(date.getTime() / 1000L)));
        }
        if (date1 != null)
        {
            arraylist.add(new Parameter("date_taken", ((DateFormat)DATE_FORMATS.get()).format(date1)));
        }
        if (s1 != null)
        {
            arraylist.add(new Parameter("date_taken_granularity", s1));
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

    public void setMeta(String s, String s1, String s2)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.setMeta"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("photo_id", s));
        arraylist.add(new Parameter("title", s1));
        arraylist.add(new Parameter("description", s2));
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

    public void setPerms(String s, Permissions permissions)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.setPerms"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("photo_id", s));
        if (permissions.isPublicFlag())
        {
            s = "1";
        } else
        {
            s = "0";
        }
        arraylist.add(new Parameter("is_public", s));
        if (permissions.isFriendFlag())
        {
            s = "1";
        } else
        {
            s = "0";
        }
        arraylist.add(new Parameter("is_friend", s));
        if (permissions.isFamilyFlag())
        {
            s = "1";
        } else
        {
            s = "0";
        }
        arraylist.add(new Parameter("is_family", s));
        arraylist.add(new Parameter("perm_comment", permissions.getComment()));
        arraylist.add(new Parameter("perm_addmeta", permissions.getAddmeta()));
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

    public void setSafetyLevel(String s, String s1, Boolean boolean1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.setSafetyLevel"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("photo_id", s));
        if (s1 != null)
        {
            arraylist.add(new Parameter("safety_level", s1));
        }
        if (boolean1 != null)
        {
            if (boolean1.booleanValue())
            {
                s = "1";
            } else
            {
                s = "0";
            }
            arraylist.add(new Parameter("hidden", s));
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

    public void setTags(String s, String as[])
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.setTags"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("photo_id", s));
        arraylist.add(new Parameter("tags", StringUtilities.join(as, " ", true)));
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
