// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.tags;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.Response;
import com.googlecode.flickrjandroid.Transport;
import com.googlecode.flickrjandroid.oauth.OAuthUtils;
import com.googlecode.flickrjandroid.photos.Photo;
import com.googlecode.flickrjandroid.photos.PhotoList;
import com.googlecode.flickrjandroid.photos.PhotoUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.googlecode.flickrjandroid.tags:
//            ClusterList, Cluster, Tag, HotlistTag, 
//            TagRaw, RelatedTagsList

public class TagsInterface
{

    public static final String METHOD_GET_CLUSTERS = "flickr.tags.getClusters";
    public static final String METHOD_GET_CLUSTER_PHOTOS = "flickr.tags.getClusterPhotos";
    public static final String METHOD_GET_HOT_LIST = "flickr.tags.getHotList";
    public static final String METHOD_GET_LIST_PHOTO = "flickr.tags.getListPhoto";
    public static final String METHOD_GET_LIST_USER = "flickr.tags.getListUser";
    public static final String METHOD_GET_LIST_USER_POPULAR = "flickr.tags.getListUserPopular";
    public static final String METHOD_GET_LIST_USER_RAW = "flickr.tags.getListUserRaw";
    public static final String METHOD_GET_MOST_FREQUENTLY_USED = "flickr.tags.getMostFrequentlyUsed";
    public static final String METHOD_GET_RELATED = "flickr.tags.getRelated";
    public static final String PERIOD_DAY = "day";
    public static final String PERIOD_WEEK = "week";
    private String apiKey;
    private String sharedSecret;
    private Transport transportAPI;

    public TagsInterface(String s, String s1, Transport transport)
    {
        apiKey = s;
        sharedSecret = s1;
        transportAPI = transport;
    }

    public PhotoList getClusterPhotos(String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.tags.getClusterPhotos"));
        arraylist.add(new Parameter("api_key", apiKey));
        arraylist.add(new Parameter("tag", s));
        arraylist.add(new Parameter("cluster_id", s1));
        s = transportAPI.get(transportAPI.getPath(), arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return PhotoUtils.createPhotoList(s.getData());
        }
    }

    public ClusterList getClusters(String s)
    {
        Object obj;
        int i;
        obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.tags.getClusters"));
        ((List) (obj)).add(new Parameter("api_key", apiKey));
        ((List) (obj)).add(new Parameter("tag", s));
        obj = transportAPI.get(transportAPI.getPath(), ((List) (obj)));
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        }
        s = new ClusterList();
        obj = ((Response) (obj)).getData().getJSONObject("clusters").optJSONArray("cluster");
        i = 0;
_L2:
        if (obj == null || i >= ((JSONArray) (obj)).length())
        {
            return s;
        }
        Cluster cluster = new Cluster();
        JSONArray jsonarray = ((JSONArray) (obj)).getJSONObject(i).optJSONArray("tag");
        int j = 0;
        do
        {
label0:
            {
                if (jsonarray != null && j < jsonarray.length())
                {
                    break label0;
                }
                s.addCluster(cluster);
                i++;
            }
            if (true)
            {
                continue;
            }
            Tag tag = new Tag();
            tag.setValue(jsonarray.getJSONObject(j).getString("_content"));
            cluster.addTag(tag);
            j++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public Collection getHotList(String s, int i)
    {
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.tags.getHotList"));
        ((List) (obj)).add(new Parameter("api_key", apiKey));
        ((List) (obj)).add(new Parameter("period", s));
        ((List) (obj)).add(new Parameter("count", String.valueOf(i)));
        s = transportAPI.get(transportAPI.getPath(), ((List) (obj)));
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        }
        obj = s.getData().getJSONObject("hottags");
        s = new ArrayList();
        obj = ((JSONObject) (obj)).optJSONArray("tag");
        i = 0;
        do
        {
            if (obj == null || i >= ((JSONArray) (obj)).length())
            {
                return s;
            }
            JSONObject jsonobject = ((JSONArray) (obj)).getJSONObject(i);
            HotlistTag hotlisttag = new HotlistTag();
            hotlisttag.setScore(jsonobject.getString("score"));
            hotlisttag.setValue(jsonobject.getString("_content"));
            s.add(hotlisttag);
            i++;
        } while (true);
    }

    public Photo getListPhoto(String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.tags.getListPhoto"));
        arraylist.add(new Parameter("api_key", apiKey));
        arraylist.add(new Parameter("photo_id", s));
        s = transportAPI.get(transportAPI.getPath(), arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        }
        Object obj = s.getData().getJSONObject("photo");
        s = new Photo();
        s.setId(((JSONObject) (obj)).getString("id"));
        arraylist = new ArrayList();
        obj = ((JSONObject) (obj)).getJSONObject("tags").optJSONArray("tag");
        int i = 0;
        do
        {
            if (obj == null || i >= ((JSONArray) (obj)).length())
            {
                s.setTags(arraylist);
                return s;
            }
            JSONObject jsonobject = ((JSONArray) (obj)).getJSONObject(i);
            Tag tag = new Tag();
            tag.setId(jsonobject.getString("id"));
            tag.setAuthor(jsonobject.getString("author"));
            tag.setAuthorName(jsonobject.getString("authorname"));
            tag.setRaw(jsonobject.getString("raw"));
            tag.setValue(jsonobject.getString("_content"));
            arraylist.add(tag);
            i++;
        } while (true);
    }

    public Collection getListUser(String s)
    {
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.tags.getListUser"));
        ((List) (obj)).add(new Parameter("api_key", apiKey));
        ((List) (obj)).add(new Parameter("user_id", s));
        s = transportAPI.get(transportAPI.getPath(), ((List) (obj)));
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        }
        obj = s.getData().getJSONObject("who");
        s = new ArrayList();
        obj = ((JSONObject) (obj)).getJSONObject("tags").optJSONArray("tag");
        int i = 0;
        do
        {
            if (obj == null || i >= ((JSONArray) (obj)).length())
            {
                return s;
            }
            JSONObject jsonobject = ((JSONArray) (obj)).getJSONObject(i);
            Tag tag = new Tag();
            tag.setCount(jsonobject.optInt("count"));
            tag.setValue(jsonobject.getString("_content"));
            s.add(tag);
            i++;
        } while (true);
    }

    public Collection getListUserPopular(String s)
    {
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.tags.getListUserPopular"));
        ((List) (obj)).add(new Parameter("api_key", apiKey));
        ((List) (obj)).add(new Parameter("user_id", s));
        s = transportAPI.get(transportAPI.getPath(), ((List) (obj)));
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        }
        obj = s.getData().getJSONObject("who");
        s = new ArrayList();
        obj = ((JSONObject) (obj)).getJSONObject("tags").optJSONArray("tag");
        int i = 0;
        do
        {
            if (obj == null || i >= ((JSONArray) (obj)).length())
            {
                return s;
            }
            JSONObject jsonobject = ((JSONArray) (obj)).getJSONObject(i);
            Tag tag = new Tag();
            tag.setCount(jsonobject.getString("count"));
            tag.setValue(jsonobject.getString("_content"));
            s.add(tag);
            i++;
        } while (true);
    }

    public Collection getListUserRaw(String s)
    {
        Object obj;
        int i;
        obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.tags.getListUserRaw"));
        ((List) (obj)).add(new Parameter("oauth_consumer_key", apiKey));
        if (s != null)
        {
            ((List) (obj)).add(new Parameter("tag", s));
        }
        OAuthUtils.addOAuthToken(((List) (obj)));
        s = transportAPI.postJSON(sharedSecret, ((List) (obj)));
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        }
        obj = s.getData().getJSONObject("who");
        s = new ArrayList();
        obj = ((JSONObject) (obj)).getJSONObject("tags").optJSONArray("tag");
        i = 0;
_L2:
        if (obj == null || i >= ((JSONArray) (obj)).length())
        {
            return s;
        }
        Object obj1 = ((JSONArray) (obj)).getJSONObject(i);
        TagRaw tagraw = new TagRaw();
        tagraw.setClean(((JSONObject) (obj1)).getString("clean"));
        obj1 = ((JSONObject) (obj1)).optJSONArray("raw");
        int j = 0;
        do
        {
label0:
            {
                if (obj1 != null && j < ((JSONArray) (obj1)).length())
                {
                    break label0;
                }
                s.add(tagraw);
                i++;
            }
            if (true)
            {
                continue;
            }
            tagraw.addRaw(((JSONArray) (obj1)).getJSONObject(j).getString("_content"));
            j++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public Collection getMostFrequentlyUsed()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.tags.getMostFrequentlyUsed"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        OAuthUtils.addOAuthToken(arraylist);
        Object obj = transportAPI.postJSON(sharedSecret, arraylist);
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        }
        arraylist = new ArrayList();
        obj = ((Response) (obj)).getData().getJSONObject("who").getJSONObject("tags").optJSONArray("tag");
        int i = 0;
        do
        {
            if (obj == null || i >= ((JSONArray) (obj)).length())
            {
                return arraylist;
            }
            JSONObject jsonobject = ((JSONArray) (obj)).getJSONObject(i);
            Tag tag = new Tag();
            tag.setCount(jsonobject.getString("count"));
            tag.setValue(jsonobject.getString("_content"));
            arraylist.add(tag);
            i++;
        } while (true);
    }

    public RelatedTagsList getRelated(String s)
    {
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.tags.getRelated"));
        ((List) (obj)).add(new Parameter("api_key", apiKey));
        ((List) (obj)).add(new Parameter("tag", s));
        s = transportAPI.get(transportAPI.getPath(), ((List) (obj)));
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        }
        obj = s.getData().getJSONObject("tags");
        s = new RelatedTagsList();
        s.setSource(((JSONObject) (obj)).getString("source"));
        obj = ((JSONObject) (obj)).optJSONArray("tag");
        int i = 0;
        do
        {
            if (obj == null || i >= ((JSONArray) (obj)).length())
            {
                return s;
            }
            JSONObject jsonobject = ((JSONArray) (obj)).getJSONObject(i);
            Tag tag = new Tag();
            tag.setValue(jsonobject.getString("_content"));
            s.add(tag);
            i++;
        } while (true);
    }
}
