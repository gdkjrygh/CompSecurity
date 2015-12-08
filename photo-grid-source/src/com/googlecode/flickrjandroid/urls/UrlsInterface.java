// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.urls;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.Response;
import com.googlecode.flickrjandroid.Transport;
import com.googlecode.flickrjandroid.groups.Group;
import com.googlecode.flickrjandroid.people.User;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class UrlsInterface
{

    public static final String METHOD_GET_GROUP = "flickr.urls.getGroup";
    public static final String METHOD_GET_USER_PHOTOS = "flickr.urls.getUserPhotos";
    public static final String METHOD_GET_USER_PROFILE = "flickr.urls.getUserProfile";
    public static final String METHOD_LOOKUP_GROUP = "flickr.urls.lookupGroup";
    public static final String METHOD_LOOKUP_USER = "flickr.urls.lookupUser";
    private String apiKey;
    private String sharedSecret;
    private Transport transport;

    public UrlsInterface(String s, String s1, Transport transport1)
    {
        apiKey = s;
        sharedSecret = s1;
        transport = transport1;
    }

    public String getGroup(String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.urls.getGroup"));
        arraylist.add(new Parameter("api_key", apiKey));
        arraylist.add(new Parameter("group_id", s));
        s = transport.get(transport.getPath(), arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return s.getData().getJSONObject("group").getString("url");
        }
    }

    public String getUserPhotos(String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.urls.getUserPhotos"));
        arraylist.add(new Parameter("api_key", apiKey));
        arraylist.add(new Parameter("user_id", s));
        s = transport.get(transport.getPath(), arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return s.getData().getJSONObject("user").getString("url");
        }
    }

    public String getUserProfile(String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.urls.getUserProfile"));
        arraylist.add(new Parameter("api_key", apiKey));
        arraylist.add(new Parameter("user_id", s));
        s = transport.get(transport.getPath(), arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return s.getData().getJSONObject("user").getString("url");
        }
    }

    public Group lookupGroup(String s)
    {
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.urls.lookupGroup"));
        ((List) (obj)).add(new Parameter("api_key", apiKey));
        ((List) (obj)).add(new Parameter("url", s));
        obj = transport.get(transport.getPath(), ((List) (obj)));
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        } else
        {
            s = new Group();
            obj = ((Response) (obj)).getData().getJSONObject("group");
            JSONObject jsonobject = ((JSONObject) (obj)).getJSONObject("groupname");
            s.setId(((JSONObject) (obj)).getString("id"));
            s.setName(jsonobject.getString("_content"));
            return s;
        }
    }

    public User lookupUser(String s)
    {
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.urls.lookupUser"));
        ((List) (obj)).add(new Parameter("api_key", apiKey));
        ((List) (obj)).add(new Parameter("url", s));
        obj = transport.get(transport.getPath(), ((List) (obj)));
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        } else
        {
            s = new User();
            obj = ((Response) (obj)).getData().getJSONObject("user");
            JSONObject jsonobject = ((JSONObject) (obj)).getJSONObject("username");
            s.setId(((JSONObject) (obj)).getString("id"));
            s.setUsername(jsonobject.getString("_content"));
            return s;
        }
    }
}
