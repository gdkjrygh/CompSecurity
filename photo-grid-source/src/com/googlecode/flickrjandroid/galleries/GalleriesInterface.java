// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.galleries;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.Response;
import com.googlecode.flickrjandroid.Transport;
import com.googlecode.flickrjandroid.oauth.OAuthUtils;
import com.googlecode.flickrjandroid.photos.PhotoList;
import com.googlecode.flickrjandroid.photos.PhotoUtils;
import com.googlecode.flickrjandroid.util.JSONUtils;
import com.googlecode.flickrjandroid.util.StringUtilities;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.googlecode.flickrjandroid.galleries:
//            Gallery

public class GalleriesInterface
{

    private static final String KEY_API_KEY = "api_key";
    private static final String KEY_GALLERY_ID = "gallery_id";
    private static final String KEY_METHOD = "method";
    private static final String KEY_PAGE = "page";
    private static final String KEY_PER_PAGE = "per_page";
    private static final String KEY_PHOTO_ID = "photo_id";
    private static final String KEY_USER_ID = "user_id";
    private static final String METHOD_ADD_PHOTO = "flickr.galleries.addPhoto";
    private static final String METHOD_CREATE = "flickr.galleries.create";
    private static final String METHOD_EDIT_METADATA = "flickr.galleries.editMeta";
    private static final String METHOD_EDIT_PHOTO = "flickr.galleries.editPhoto";
    private static final String METHOD_EDIT_PHOTOS = "flickr.galleries.editPhotos";
    private static final String METHOD_GET_INFO = "flickr.galleries.getInfo";
    private static final String METHOD_GET_LIST = "flickr.galleries.getList";
    private static final String METHOD_GET_LIST_FOR_PHOTO = "flickr.galleries.getListForPhoto";
    private static final String METHOD_GET_PHOTOS = "flickr.galleries.getPhotos";
    private String mApiKey;
    private String mSharedSecret;
    private Transport mTransport;

    public GalleriesInterface(String s, String s1, Transport transport)
    {
        mApiKey = s;
        mTransport = transport;
        mSharedSecret = s1;
    }

    private Gallery createGallery(JSONObject jsonobject)
    {
        Gallery gallery = new Gallery();
        gallery.setDateCreate(jsonobject.optString("date_create"));
        gallery.setDateUpdate(jsonobject.optString("date_update"));
        gallery.setGalleryId(jsonobject.getString("id"));
        gallery.setGalleryUrl(jsonobject.getString("url"));
        gallery.setOwnerId(jsonobject.getString("owner"));
        gallery.setPrimaryPhotoId(jsonobject.getString("primary_photo_id"));
        gallery.setPhotoCount(jsonobject.optInt("count_photos"));
        gallery.setVideoCount(jsonobject.optInt("count_videos"));
        gallery.setViewsCount(jsonobject.optInt("count_views"));
        gallery.setCommentsCount(jsonobject.optInt("count_comments"));
        String s1 = JSONUtils.getChildValue(jsonobject, "title");
        String s = s1;
        if (s1 == null)
        {
            s = "";
        }
        gallery.setTitle(s);
        s = JSONUtils.getChildValue(jsonobject, "description");
        jsonobject = s;
        if (s == null)
        {
            jsonobject = "";
        }
        gallery.setDescription(jsonobject);
        return gallery;
    }

    public void addPhoto(String s, String s1, String s2)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.galleries.addPhoto"));
        arraylist.add(new Parameter("oauth_consumer_key", mApiKey));
        arraylist.add(new Parameter("gallery_id", s));
        arraylist.add(new Parameter("photo_id", s1));
        if (s2 != null)
        {
            arraylist.add(new Parameter("comment", s2));
        }
        OAuthUtils.addOAuthToken(arraylist);
        s = mTransport.postJSON(mSharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return;
        }
    }

    public String create(String s, String s1, String s2)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.galleries.create"));
        arraylist.add(new Parameter("oauth_consumer_key", mApiKey));
        arraylist.add(new Parameter("title", s));
        if (s1 != null)
        {
            s = s1;
        }
        arraylist.add(new Parameter("description", s));
        if (s2 != null)
        {
            arraylist.add(new Parameter("primary_photo_id", s2));
        }
        OAuthUtils.addOAuthToken(arraylist);
        s = mTransport.postJSON(mSharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return s.getData().getJSONObject("gallery").getString("id");
        }
    }

    public void editMetadata(String s, String s1, String s2)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.galleries.editMeta"));
        arraylist.add(new Parameter("oauth_consumer_key", mApiKey));
        arraylist.add(new Parameter("gallery_id", s));
        arraylist.add(new Parameter("title", s1));
        if (s2 != null)
        {
            arraylist.add(new Parameter("description", s2));
        }
        OAuthUtils.addOAuthToken(arraylist);
        s = mTransport.postJSON(mSharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return;
        }
    }

    public void editPhoto(String s, String s1, String s2)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.galleries.editPhoto"));
        arraylist.add(new Parameter("oauth_consumer_key", mApiKey));
        arraylist.add(new Parameter("gallery_id", s));
        arraylist.add(new Parameter("photo_id", s1));
        arraylist.add(new Parameter("comment", s2));
        OAuthUtils.addOAuthToken(arraylist);
        s = mTransport.postJSON(mSharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return;
        }
    }

    public void editPhotos(String s, String s1, List list)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.galleries.editPhotos"));
        arraylist.add(new Parameter("oauth_consumer_key", mApiKey));
        arraylist.add(new Parameter("gallery_id", s));
        arraylist.add(new Parameter("primary_photo_id", s1));
        if (!list.contains(s1))
        {
            list.add(s1);
        }
        arraylist.add(new Parameter("photo_ids", StringUtilities.join(list, ",")));
        OAuthUtils.addOAuthToken(arraylist);
        s = mTransport.postJSON(mSharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return;
        }
    }

    public Gallery getInfo(String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.galleries.getInfo"));
        arraylist.add(new Parameter("api_key", mApiKey));
        arraylist.add(new Parameter("gallery_id", s));
        s = mTransport.get(mTransport.getPath(), arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return createGallery(s.getData().getJSONObject("gallery"));
        }
    }

    public List getList(String s, int i, int j)
    {
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.galleries.getList"));
        ((List) (obj)).add(new Parameter("api_key", mApiKey));
        ((List) (obj)).add(new Parameter("user_id", s));
        if (i > 0)
        {
            ((List) (obj)).add(new Parameter("per_page", String.valueOf(i)));
        }
        if (j > 0)
        {
            ((List) (obj)).add(new Parameter("page", String.valueOf(j)));
        }
        s = new ArrayList();
        obj = mTransport.get(mTransport.getPath(), ((List) (obj)));
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        }
        obj = ((Response) (obj)).getData().getJSONObject("galleries").optJSONArray("gallery");
        i = 0;
        do
        {
            if (obj == null || i >= ((JSONArray) (obj)).length())
            {
                return s;
            }
            s.add(createGallery(((JSONArray) (obj)).getJSONObject(i)));
            i++;
        } while (true);
    }

    public List getListForPhoto(String s, int i, int j)
    {
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.galleries.getListForPhoto"));
        ((List) (obj)).add(new Parameter("api_key", mApiKey));
        ((List) (obj)).add(new Parameter("photo_id", s));
        if (i > 0)
        {
            ((List) (obj)).add(new Parameter("per_page", String.valueOf(i)));
        }
        if (j > 0)
        {
            ((List) (obj)).add(new Parameter("page", String.valueOf(j)));
        }
        s = new ArrayList();
        obj = mTransport.get(mTransport.getPath(), ((List) (obj)));
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        }
        obj = ((Response) (obj)).getData().getJSONObject("galleries").optJSONArray("gallery");
        i = 0;
        do
        {
            if (obj == null || i >= ((JSONArray) (obj)).length())
            {
                return s;
            }
            s.add(createGallery(((JSONArray) (obj)).getJSONObject(i)));
            i++;
        } while (true);
    }

    public PhotoList getPhotos(String s, Set set, int i, int j)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.galleries.getPhotos"));
        arraylist.add(new Parameter("api_key", mApiKey));
        arraylist.add(new Parameter("gallery_id", s));
        if (i > 0)
        {
            arraylist.add(new Parameter("per_page", String.valueOf(i)));
        }
        if (j > 0)
        {
            arraylist.add(new Parameter("page", String.valueOf(j)));
        }
        if (set != null && !set.isEmpty())
        {
            arraylist.add(new Parameter("extras", StringUtilities.join(set, ",")));
        }
        s = mTransport.get(mTransport.getPath(), arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return PhotoUtils.createPhotoList(s.getData());
        }
    }
}
