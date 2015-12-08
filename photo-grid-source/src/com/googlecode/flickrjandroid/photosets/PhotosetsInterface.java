// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.photosets;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.Response;
import com.googlecode.flickrjandroid.Transport;
import com.googlecode.flickrjandroid.oauth.OAuthUtils;
import com.googlecode.flickrjandroid.people.User;
import com.googlecode.flickrjandroid.photos.Extras;
import com.googlecode.flickrjandroid.photos.Photo;
import com.googlecode.flickrjandroid.photos.PhotoContext;
import com.googlecode.flickrjandroid.photos.PhotoList;
import com.googlecode.flickrjandroid.photos.PhotoUtils;
import com.googlecode.flickrjandroid.util.JSONUtils;
import com.googlecode.flickrjandroid.util.StringUtilities;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.googlecode.flickrjandroid.photosets:
//            Photoset, Photosets

public class PhotosetsInterface
{

    public static final String METHOD_ADD_PHOTO = "flickr.photosets.addPhoto";
    public static final String METHOD_CREATE = "flickr.photosets.create";
    public static final String METHOD_DELETE = "flickr.photosets.delete";
    public static final String METHOD_EDIT_META = "flickr.photosets.editMeta";
    public static final String METHOD_EDIT_PHOTOS = "flickr.photosets.editPhotos";
    public static final String METHOD_GET_CONTEXT = "flickr.photosets.getContext";
    public static final String METHOD_GET_INFO = "flickr.photosets.getInfo";
    public static final String METHOD_GET_LIST = "flickr.photosets.getList";
    public static final String METHOD_GET_PHOTOS = "flickr.photosets.getPhotos";
    public static final String METHOD_ORDER_SETS = "flickr.photosets.orderSets";
    public static final String METHOD_REMOVE_PHOTO = "flickr.photosets.removePhoto";
    private String apiKey;
    private String sharedSecret;
    private Transport transportAPI;

    public PhotosetsInterface(String s, String s1, Transport transport)
    {
        apiKey = s;
        sharedSecret = s1;
        transportAPI = transport;
    }

    private Photoset parsePhotoset(JSONObject jsonobject)
    {
        Photoset photoset = new Photoset();
        photoset.setId(jsonobject.getString("id"));
        if (jsonobject.has("owner"))
        {
            User user = new User();
            user.setId(jsonobject.getString("owner"));
            user.setUsername(jsonobject.optString("ownername", null));
            photoset.setOwner(user);
        }
        Photo photo = new Photo();
        photo.setId(jsonobject.getString("primary"));
        photo.setSecret(jsonobject.optString("secret", null));
        photo.setServer(jsonobject.optString("server", null));
        photo.setFarm(jsonobject.optString("farm", null));
        photoset.setPrimaryPhoto(photo);
        photoset.setSecret(jsonobject.optString("secret", null));
        photoset.setServer(jsonobject.optString("server", null));
        photoset.setFarm(jsonobject.optString("farm", null));
        photoset.setPhotoCount(jsonobject.optString("photos", null));
        if (jsonobject.has("title"))
        {
            Object obj = jsonobject.get("title");
            if (obj instanceof String)
            {
                photoset.setTitle((String)obj);
            } else
            {
                photoset.setTitle(JSONUtils.getChildValue(jsonobject, "title"));
            }
        }
        photoset.setDescription(JSONUtils.getChildValue(jsonobject, "description"));
        photoset.setPrimaryPhoto(photo);
        return photoset;
    }

    public void addPhoto(String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photosets.addPhoto"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("photoset_id", s));
        arraylist.add(new Parameter("photo_id", s1));
        OAuthUtils.addOAuthToken(arraylist);
        s = transportAPI.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return;
        }
    }

    public Photoset create(String s, String s1, String s2)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photosets.create"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("title", s));
        arraylist.add(new Parameter("description", s1));
        arraylist.add(new Parameter("primary_photo_id", s2));
        OAuthUtils.addOAuthToken(arraylist);
        s = transportAPI.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            s = s.getData().getJSONObject("photoset");
            s1 = new Photoset();
            s1.setId(s.getString("id"));
            s1.setUrl(s.getString("url"));
            return s1;
        }
    }

    public void delete(String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photosets.delete"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("photoset_id", s));
        OAuthUtils.addOAuthToken(arraylist);
        s = transportAPI.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return;
        }
    }

    public void editMeta(String s, String s1, String s2)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photosets.editMeta"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("photoset_id", s));
        arraylist.add(new Parameter("title", s1));
        if (s2 != null)
        {
            arraylist.add(new Parameter("description", s2));
        }
        OAuthUtils.addOAuthToken(arraylist);
        s = transportAPI.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return;
        }
    }

    public void editPhotos(String s, String s1, String as[])
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photosets.editPhotos"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("photoset_id", s));
        arraylist.add(new Parameter("primary_photo_id", s1));
        arraylist.add(new Parameter("photo_ids", StringUtilities.join(as, ",")));
        OAuthUtils.addOAuthToken(arraylist);
        s = transportAPI.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return;
        }
    }

    public PhotoContext getContext(String s, String s1)
    {
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.photosets.getContext"));
        ((List) (obj)).add(new Parameter("api_key", apiKey));
        ((List) (obj)).add(new Parameter("photo_id", s));
        ((List) (obj)).add(new Parameter("photoset_id", s1));
        OAuthUtils.addOAuthToken(((List) (obj)));
        s = transportAPI.get(transportAPI.getPath(), ((List) (obj)));
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        }
        s = s.getData();
        s1 = s.keys();
        obj = new PhotoContext();
        do
        {
            if (!s1.hasNext())
            {
                return ((PhotoContext) (obj));
            }
            String s2 = String.valueOf(s1.next());
            JSONObject jsonobject = s.optJSONObject(s2);
            if (s2.equals("prevphoto"))
            {
                s2 = jsonobject.getString("id");
                if (!"0".equals(s2))
                {
                    Photo photo = new Photo();
                    photo.setId(s2);
                    photo.setTitle(jsonobject.optString("title"));
                    photo.setUrl(jsonobject.optString("url"));
                    ((PhotoContext) (obj)).setPreviousPhoto(photo);
                }
            } else
            if (s2.equals("nextphoto"))
            {
                s2 = jsonobject.getString("id");
                if (!"0".equals(s2))
                {
                    Photo photo1 = new Photo();
                    photo1.setId(s2);
                    photo1.setTitle(jsonobject.optString("title"));
                    photo1.setUrl(jsonobject.optString("url"));
                    ((PhotoContext) (obj)).setNextPhoto(photo1);
                }
            } else
            if (!s2.equals("count"))
            {
                System.err.println((new StringBuilder("unsupported element name: ")).append(s2).toString());
            }
        } while (true);
    }

    public Photoset getInfo(String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photosets.getInfo"));
        boolean flag = OAuthUtils.hasSigned();
        if (flag)
        {
            arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        } else
        {
            arraylist.add(new Parameter("api_key", apiKey));
        }
        arraylist.add(new Parameter("photoset_id", s));
        if (flag)
        {
            OAuthUtils.addOAuthToken(arraylist);
        }
        s = transportAPI.get(transportAPI.getPath(), arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return parsePhotoset(s.getData().getJSONObject("photoset"));
        }
    }

    public Photosets getList(String s)
    {
        return getList(s, -1, -1);
    }

    public Photosets getList(String s, int i, int j)
    {
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.photosets.getList"));
        boolean flag = OAuthUtils.hasSigned();
        if (flag)
        {
            ((List) (obj)).add(new Parameter("oauth_consumer_key", apiKey));
        } else
        {
            ((List) (obj)).add(new Parameter("api_key", apiKey));
        }
        if (s != null)
        {
            ((List) (obj)).add(new Parameter("user_id", s));
        }
        if (i > 0)
        {
            ((List) (obj)).add(new Parameter("per_page", new Integer(i)));
        }
        if (j > 0)
        {
            ((List) (obj)).add(new Parameter("page", new Integer(j)));
        }
        if (flag)
        {
            OAuthUtils.addOAuthToken(((List) (obj)));
        }
        if (flag)
        {
            s = transportAPI.postJSON(sharedSecret, ((List) (obj)));
        } else
        {
            s = transportAPI.get(transportAPI.getPath(), ((List) (obj)));
        }
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        }
        obj = new Photosets();
        Object obj1 = s.getData().getJSONObject("photosets");
        s = new ArrayList();
        obj1 = ((JSONObject) (obj1)).optJSONArray("photoset");
        i = 0;
        do
        {
            if (obj1 == null || i >= ((JSONArray) (obj1)).length())
            {
                ((Photosets) (obj)).setPhotosets(s);
                return ((Photosets) (obj));
            }
            s.add(parsePhotoset(((JSONArray) (obj1)).getJSONObject(i)));
            i++;
        } while (true);
    }

    public Photoset getPhotos(String s, int i, int j)
    {
        return getPhotos(s, Extras.MIN_EXTRAS, 0, i, j);
    }

    public Photoset getPhotos(String s, Set set, int i, int j, int k)
    {
        PhotoList photolist = new PhotoList();
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.photosets.getPhotos"));
        boolean flag = OAuthUtils.hasSigned();
        if (flag)
        {
            ((List) (obj)).add(new Parameter("oauth_consumer_key", apiKey));
        } else
        {
            ((List) (obj)).add(new Parameter("api_key", apiKey));
        }
        ((List) (obj)).add(new Parameter("photoset_id", s));
        if (j > 0)
        {
            ((List) (obj)).add(new Parameter("per_page", new Integer(j)));
        }
        if (k > 0)
        {
            ((List) (obj)).add(new Parameter("page", new Integer(k)));
        }
        if (i > 0)
        {
            ((List) (obj)).add(new Parameter("privacy_filter", String.valueOf(i)));
        }
        if (set != null && !set.isEmpty())
        {
            ((List) (obj)).add(new Parameter("extras", StringUtilities.join(set, ",")));
        }
        if (flag)
        {
            OAuthUtils.addOAuthToken(((List) (obj)));
        }
        if (flag)
        {
            s = transportAPI.postJSON(sharedSecret, ((List) (obj)));
        } else
        {
            s = transportAPI.get(transportAPI.getPath(), ((List) (obj)));
        }
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        }
        obj = s.getData().getJSONObject("photoset");
        s = parsePhotoset(((JSONObject) (obj)));
        s.setPhotoList(photolist);
        set = ((JSONObject) (obj)).optJSONArray("photo");
        photolist.setPage(((JSONObject) (obj)).getString("page"));
        photolist.setPages(((JSONObject) (obj)).getString("pages"));
        photolist.setPerPage(((JSONObject) (obj)).getString("per_page"));
        photolist.setTotal(((JSONObject) (obj)).getString("total"));
        i = 0;
        do
        {
            if (set == null || i >= set.length())
            {
                s.setPhotoCount(photolist.getTotal());
                return s;
            }
            Photo photo = PhotoUtils.createPhoto(set.getJSONObject(i));
            if (photo.isPrimary())
            {
                s.setPrimaryPhoto(photo);
            }
            photolist.add(photo);
            i++;
        } while (true);
    }

    public void orderSets(String as[])
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photosets.orderSets"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("photoset_ids", StringUtilities.join(as, ",")));
        OAuthUtils.addOAuthToken(arraylist);
        as = transportAPI.postJSON(sharedSecret, arraylist);
        if (as.isError())
        {
            throw new FlickrException(as.getErrorCode(), as.getErrorMessage());
        } else
        {
            return;
        }
    }

    public void removePhoto(String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photosets.removePhoto"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("photoset_id", s));
        arraylist.add(new Parameter("photo_id", s1));
        OAuthUtils.addOAuthToken(arraylist);
        s = transportAPI.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return;
        }
    }
}
