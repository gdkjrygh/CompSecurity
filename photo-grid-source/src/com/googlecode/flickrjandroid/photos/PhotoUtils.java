// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.photos;

import com.googlecode.flickrjandroid.people.User;
import com.googlecode.flickrjandroid.tags.Tag;
import com.googlecode.flickrjandroid.util.JSONUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.googlecode.flickrjandroid.photos:
//            Size, Photo, GeoData, Note, 
//            PhotoContext, PhotoList

public final class PhotoUtils
{

    private static final String PHOTO_SUFFIX_LARGE = "_l";
    private static final String PHOTO_SUFFIX_LARGE_1600 = "_h";
    private static final String PHOTO_SUFFIX_LARGE_2048 = "_k";
    private static final String PHOTO_SUFFIX_LARGE_SQUARE = "_q";
    private static final String PHOTO_SUFFIX_MEDIUM = "_m";
    private static final String PHOTO_SUFFIX_MEDIUM_640 = "_z";
    private static final String PHOTO_SUFFIX_MEDIUM_800 = "_c";
    private static final String PHOTO_SUFFIX_ORIGINAL = "_o";
    private static final String PHOTO_SUFFIX_SMALL = "_s";
    private static final String PHOTO_SUFFIX_SMALL_320 = "_n";
    private static final String PHOTO_SUFFIX_SQUARE = "_sq";
    private static final String PHOTO_SUFFIX_THUMB = "_t";
    public static final long serialVersionUID = 12L;

    private PhotoUtils()
    {
    }

    private static void addSize(List list, JSONObject jsonobject, String s, int i)
    {
        String s1 = jsonobject.optString((new StringBuilder("url")).append(s).toString());
        if (s1.startsWith("http"))
        {
            Size size = new Size();
            size.setLabel(i);
            size.setSource(s1);
            if (jsonobject.has((new StringBuilder("width")).append(s).toString()))
            {
                size.setWidth(jsonobject.optInt((new StringBuilder("width")).append(s).toString(), 0));
            }
            if (jsonobject.has((new StringBuilder("height")).append(s).toString()))
            {
                size.setHeight(jsonobject.optInt((new StringBuilder("height")).append(s).toString(), 0));
            }
            list.add(size);
        }
    }

    public static final Photo createPhoto(JSONObject jsonobject)
    {
        Photo photo;
        Object obj;
        Object obj1;
        int i;
        boolean flag = false;
        photo = new Photo();
        photo.setId(jsonobject.getString("id"));
        photo.setPlaceId(jsonobject.optString("place_id", null));
        photo.setSecret(jsonobject.getString("secret"));
        photo.setServer(jsonobject.getString("server"));
        photo.setFarm(jsonobject.getString("farm"));
        photo.setRotation(jsonobject.optString("rotation", null));
        photo.setFavorite("1".equals(jsonobject.optString("isfavorite")));
        photo.setPrimary(jsonobject.optString("isprimary", null));
        photo.setLicense(jsonobject.optString("license"));
        photo.setOriginalFormat(jsonobject.optString("originalformat"));
        photo.setOriginalSecret(jsonobject.optString("originalsecret"));
        photo.setIconServer(jsonobject.optString("iconserver", null));
        photo.setIconFarm(jsonobject.optString("iconfarm", null));
        photo.setDateTaken(jsonobject.optString("datetaken"));
        photo.setDatePosted(jsonobject.optString("dateupload"));
        photo.setLastUpdate(jsonobject.optString("lastupdate"));
        photo.setDateAdded(jsonobject.optString("dateadded"));
        photo.setOriginalWidth(jsonobject.optString("o_width"));
        photo.setOriginalHeight(jsonobject.optString("o_height"));
        photo.setMedia(jsonobject.optString("media"));
        photo.setMediaStatus(jsonobject.optString("media_status"));
        photo.setPathAlias(jsonobject.optString("pathalias"));
        obj = jsonobject.optJSONObject("dates");
        if (obj != null)
        {
            photo.setDateTaken(((JSONObject) (obj)).optString("taken"));
            photo.setDatePosted(((JSONObject) (obj)).optString("posted"));
            photo.setLastUpdate(((JSONObject) (obj)).optString("lastupdate"));
        }
        obj = new ArrayList();
        addSize(((List) (obj)), jsonobject, "_sq", 1);
        addSize(((List) (obj)), jsonobject, "_q", 6);
        addSize(((List) (obj)), jsonobject, "_t", 0);
        addSize(((List) (obj)), jsonobject, "_s", 2);
        addSize(((List) (obj)), jsonobject, "_n", 10);
        addSize(((List) (obj)), jsonobject, "_m", 3);
        addSize(((List) (obj)), jsonobject, "_z", 11);
        addSize(((List) (obj)), jsonobject, "_c", 12);
        addSize(((List) (obj)), jsonobject, "_l", 4);
        addSize(((List) (obj)), jsonobject, "_h", 13);
        addSize(((List) (obj)), jsonobject, "_k", 14);
        addSize(((List) (obj)), jsonobject, "_o", 5);
        if (((List) (obj)).size() > 0)
        {
            photo.setSizes(((java.util.Collection) (obj)));
        }
        if (photo.getOriginalFormat() == null || photo.getOriginalFormat().equals(""))
        {
            photo.setOriginalFormat("jpg");
        }
        obj = new User();
        if (jsonobject.has("owner"))
        {
            obj1 = jsonobject.get("owner");
            String s;
            if (obj1 instanceof JSONObject)
            {
                obj1 = (JSONObject)obj1;
                ((User) (obj)).setId(((JSONObject) (obj1)).getString("nsid"));
                ((User) (obj)).setUsername(((JSONObject) (obj1)).optString("username", null));
                ((User) (obj)).setRealName(((JSONObject) (obj1)).optString("realname", null));
                ((User) (obj)).setLocation(((JSONObject) (obj1)).optString("location", null));
                photo.setOwner(((User) (obj)));
            } else
            {
                ((User) (obj)).setId(jsonobject.getString("owner"));
                ((User) (obj)).setUsername(jsonobject.optString("ownername", null));
                photo.setOwner(((User) (obj)));
            }
            photo.setUrl((new StringBuilder("https://flickr.com/photos/")).append(((User) (obj)).getId()).append("/").append(photo.getId()).toString());
        }
        obj = jsonobject.optJSONObject("title");
        if (obj != null)
        {
            photo.setTitle(((JSONObject) (obj)).getString("_content"));
        } else
        {
            photo.setTitle(jsonobject.getString("title"));
        }
        photo.setDescription(JSONUtils.getChildValue(jsonobject, "description"));
        photo.setPublicFlag("1".equals(jsonobject.optString("ispublic")));
        photo.setFriendFlag("1".equals(jsonobject.optString("isfriend")));
        photo.setFamilyFlag("1".equals(jsonobject.optString("isfamily")));
        if (jsonobject.has("comments"))
        {
            photo.setComments(JSONUtils.getChildValue(jsonobject, "comments"));
        }
        obj1 = jsonobject.optJSONObject("notes");
        obj = new ArrayList();
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        obj1 = ((JSONObject) (obj1)).optJSONArray("note");
        i = 0;
_L9:
        if (obj1 != null && i < ((JSONArray) (obj1)).length()) goto _L3; else goto _L2
_L2:
        photo.setNotes(((java.util.Collection) (obj)));
        obj = new ArrayList();
        obj1 = jsonobject.opt("tags");
        if (!(obj1 instanceof JSONObject)) goto _L5; else goto _L4
_L4:
        obj1 = ((JSONObject)obj1).optJSONArray("tag");
        i = ((flag) ? 1 : 0);
_L10:
        if (obj1 == null) goto _L7; else goto _L6
_L6:
        if (i < ((JSONArray) (obj1)).length()) goto _L8; else goto _L7
_L7:
        photo.setTags(((java.util.Collection) (obj)));
_L14:
        obj = jsonobject.optString("longitude", null);
        obj1 = jsonobject.optString("latitude", null);
        s = jsonobject.optString("accuracy", null);
        jsonobject.optString("woeid", null);
        if (obj != null && obj1 != null && ((String) (obj)).length() > 0 && ((String) (obj1)).length() > 0 && (!"0".equals(obj) || !"0".equals(obj1)))
        {
            photo.setGeoData(new GeoData(((String) (obj)), ((String) (obj1)), s));
        }
        obj = jsonobject.optJSONObject("stats");
        NullPointerException nullpointerexception;
        String as[];
        Object obj2;
        Object obj3;
        if (obj != null)
        {
            photo.setViews(((JSONObject) (obj)).optInt("views", -1));
            photo.setComments(((JSONObject) (obj)).optInt("comments", -1));
            photo.setFavorites(((JSONObject) (obj)).optInt("favorites", -1));
            return photo;
        } else
        {
            photo.setViews(jsonobject.optInt("views", -1));
            return photo;
        }
_L3:
        obj2 = ((JSONArray) (obj1)).getJSONObject(i);
        obj3 = new Note();
        ((Note) (obj3)).setId(((JSONObject) (obj2)).getString("id"));
        ((Note) (obj3)).setAuthor(((JSONObject) (obj2)).getString("author"));
        ((Note) (obj3)).setAuthorName(((JSONObject) (obj2)).getString("authorname"));
        ((Note) (obj3)).setBounds(((JSONObject) (obj2)).getString("x"), ((JSONObject) (obj2)).getString("y"), ((JSONObject) (obj2)).getString("w"), ((JSONObject) (obj2)).getString("h"));
        ((Note) (obj3)).setText(((JSONObject) (obj2)).getString("_content"));
        ((List) (obj)).add(obj3);
        i++;
          goto _L9
_L8:
        obj2 = ((JSONArray) (obj1)).getJSONObject(i);
        obj3 = new Tag();
        ((Tag) (obj3)).setId(((JSONObject) (obj2)).getString("id"));
        ((Tag) (obj3)).setAuthor(((JSONObject) (obj2)).getString("author"));
        ((Tag) (obj3)).setRaw(((JSONObject) (obj2)).getString("raw"));
        ((Tag) (obj3)).setValue(((JSONObject) (obj2)).optString("_content"));
        ((List) (obj)).add(obj3);
        i++;
          goto _L10
_L5:
        if (!(obj1 instanceof String)) goto _L7; else goto _L11
_L11:
        as = obj1.toString().split(" ");
        i = 0;
_L13:
        if (i >= as.length) goto _L7; else goto _L12
_L12:
        obj2 = new Tag();
        ((Tag) (obj2)).setValue(as[i]);
        ((List) (obj)).add(obj2);
        i++;
          goto _L13
          goto _L7
        nullpointerexception;
        photo.setTags(new ArrayList());
          goto _L14
    }

    public static final PhotoContext createPhotoContext(JSONObject jsonobject)
    {
        Object obj = JSONUtils.getChildValue(jsonobject, "count");
        PhotoContext photocontext = new PhotoContext();
        photocontext.setCount(Integer.parseInt(((String) (obj))));
        obj = jsonobject.keys();
        do
        {
            JSONObject jsonobject1;
            Object obj1;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    return photocontext;
                }
                obj1 = String.valueOf(((Iterator) (obj)).next());
                jsonobject1 = jsonobject.optJSONObject(((String) (obj1)));
            } while (jsonobject1 == null);
            if (((String) (obj1)).equals("prevphoto"))
            {
                obj1 = new Photo();
                ((Photo) (obj1)).setId(jsonobject1.getString("id"));
                ((Photo) (obj1)).setSecret(jsonobject1.getString("secret"));
                ((Photo) (obj1)).setTitle(jsonobject1.getString("title"));
                ((Photo) (obj1)).setFarm(jsonobject1.getString("farm"));
                ((Photo) (obj1)).setUrl(jsonobject1.getString("url"));
                photocontext.setPreviousPhoto(((Photo) (obj1)));
            } else
            if (((String) (obj1)).equals("nextphoto"))
            {
                Photo photo = new Photo();
                photo.setId(jsonobject1.getString("id"));
                photo.setSecret(jsonobject1.getString("secret"));
                photo.setTitle(jsonobject1.getString("title"));
                photo.setFarm(jsonobject1.getString("farm"));
                photo.setUrl(jsonobject1.getString("url"));
                photocontext.setNextPhoto(photo);
            }
        } while (true);
    }

    public static final PhotoList createPhotoList(JSONObject jsonobject)
    {
        Object obj = jsonobject.getJSONObject("photos");
        jsonobject = new PhotoList();
        jsonobject.setPage(((JSONObject) (obj)).optInt("page"));
        jsonobject.setPages(((JSONObject) (obj)).optInt("pages"));
        jsonobject.setPerPage(((JSONObject) (obj)).optInt("perpage"));
        jsonobject.setTotal(((JSONObject) (obj)).optInt("total"));
        obj = ((JSONObject) (obj)).optJSONArray("photo");
        int i = 0;
        do
        {
            if (obj == null || i >= ((JSONArray) (obj)).length())
            {
                return jsonobject;
            }
            jsonobject.add(createPhoto(((JSONArray) (obj)).getJSONObject(i)));
            i++;
        } while (true);
    }
}
