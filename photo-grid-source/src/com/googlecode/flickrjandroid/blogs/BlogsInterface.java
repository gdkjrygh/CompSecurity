// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.blogs;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.Response;
import com.googlecode.flickrjandroid.Transport;
import com.googlecode.flickrjandroid.oauth.OAuthUtils;
import com.googlecode.flickrjandroid.photos.Photo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.googlecode.flickrjandroid.blogs:
//            Blog, Service

public class BlogsInterface
{

    private static final String METHOD_GET_LIST = "flickr.blogs.getList";
    private static final String METHOD_GET_SERVICES = "flickr.blogs.getServices";
    private static final String METHOD_POST_PHOTO = "flickr.blogs.postPhoto";
    private String apiKey;
    private String sharedSecret;
    private Transport transportAPI;

    public BlogsInterface(String s, String s1, Transport transport)
    {
        apiKey = s;
        sharedSecret = s1;
        transportAPI = transport;
    }

    public Collection getList()
    {
        ArrayList arraylist = new ArrayList();
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.blogs.getList"));
        ((List) (obj)).add(new Parameter("oauth_consumer_key", apiKey));
        OAuthUtils.addOAuthToken(((List) (obj)));
        obj = transportAPI.postJSON(sharedSecret, ((List) (obj)));
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        }
        obj = ((Response) (obj)).getData().getJSONObject("blogs").getJSONArray("blog");
        int i = 0;
        do
        {
            if (i >= ((JSONArray) (obj)).length())
            {
                return arraylist;
            }
            JSONObject jsonobject = ((JSONArray) (obj)).getJSONObject(i);
            Blog blog = new Blog();
            blog.setId(jsonobject.getString("id"));
            blog.setName(jsonobject.getString("name"));
            blog.setNeedPassword("1".equals(jsonobject.getString("needspassword")));
            blog.setUrl(jsonobject.getString("url"));
            arraylist.add(blog);
            i++;
        } while (true);
    }

    public Collection getServices()
    {
        ArrayList arraylist = new ArrayList();
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.blogs.getServices"));
        ((List) (obj)).add(new Parameter("api_key", apiKey));
        obj = transportAPI.get(transportAPI.getPath(), ((List) (obj)));
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        }
        obj = ((Response) (obj)).getData().getJSONObject("services").getJSONArray("service");
        int i = 0;
        do
        {
            if (i >= ((JSONArray) (obj)).length())
            {
                return arraylist;
            }
            JSONObject jsonobject = ((JSONArray) (obj)).getJSONObject(i);
            Service service = new Service();
            service.setId(jsonobject.getString("id"));
            service.setName(jsonobject.getString("_content"));
            arraylist.add(service);
            i++;
        } while (true);
    }

    public void postPhoto(Photo photo, String s)
    {
        postPhoto(photo, s, null);
    }

    public void postPhoto(Photo photo, String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.blogs.postPhoto"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("blog_id", s));
        arraylist.add(new Parameter("photo_id", photo.getId()));
        arraylist.add(new Parameter("title", photo.getTitle()));
        arraylist.add(new Parameter("description", photo.getDescription()));
        if (s1 != null)
        {
            arraylist.add(new Parameter("blog_password", s1));
        }
        OAuthUtils.addOAuthToken(arraylist);
        photo = transportAPI.postJSON(sharedSecret, arraylist);
        if (photo.isError())
        {
            throw new FlickrException(photo.getErrorCode(), photo.getErrorMessage());
        } else
        {
            return;
        }
    }
}
