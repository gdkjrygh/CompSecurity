// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.favorites;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.Response;
import com.googlecode.flickrjandroid.Transport;
import com.googlecode.flickrjandroid.oauth.OAuthUtils;
import com.googlecode.flickrjandroid.photos.PhotoContext;
import com.googlecode.flickrjandroid.photos.PhotoList;
import com.googlecode.flickrjandroid.photos.PhotoUtils;
import com.googlecode.flickrjandroid.util.StringUtilities;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class FavoritesInterface
{

    public static final String METHOD_ADD = "flickr.favorites.add";
    public static final String METHOD_GET_CONTEXT = "flickr.favorites.getContext";
    public static final String METHOD_GET_LIST = "flickr.favorites.getList";
    public static final String METHOD_GET_PUBLIC_LIST = "flickr.favorites.getPublicList";
    public static final String METHOD_REMOVE = "flickr.favorites.remove";
    private String apiKey;
    private String sharedSecret;
    private Transport transportAPI;

    public FavoritesInterface(String s, String s1, Transport transport)
    {
        apiKey = s;
        sharedSecret = s1;
        transportAPI = transport;
    }

    public void add(String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.favorites.add"));
        arraylist.add(new Parameter("photo_id", s));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
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
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.favorites.getContext"));
        boolean flag = OAuthUtils.hasSigned();
        if (flag)
        {
            arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        } else
        {
            arraylist.add(new Parameter("api_key", apiKey));
        }
        arraylist.add(new Parameter("photo_id", s));
        arraylist.add(new Parameter("user_id", s1));
        if (flag)
        {
            OAuthUtils.addOAuthToken(arraylist);
        }
        s = transportAPI.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return PhotoUtils.createPhotoContext(s.getData());
        }
    }

    public PhotoList getList(String s, Date date, Date date1, int i, int j, Set set)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.favorites.getList"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        if (s != null)
        {
            arraylist.add(new Parameter("user_id", s));
        }
        if (date != null)
        {
            arraylist.add(new Parameter("min_fave_date", String.valueOf(date.getTime() / 1000L)));
        }
        if (date1 != null)
        {
            arraylist.add(new Parameter("max_fave_date", String.valueOf(date1.getTime() / 1000L)));
        }
        if (set != null)
        {
            arraylist.add(new Parameter("extras", StringUtilities.join(set, ",")));
        }
        if (i > 0)
        {
            arraylist.add(new Parameter("per_page", new Integer(i)));
        }
        if (j > 0)
        {
            arraylist.add(new Parameter("page", new Integer(j)));
        }
        OAuthUtils.addOAuthToken(arraylist);
        s = transportAPI.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return PhotoUtils.createPhotoList(s.getData());
        }
    }

    public PhotoList getPublicList(String s, Date date, Date date1, int i, int j, Set set)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.favorites.getPublicList"));
        arraylist.add(new Parameter("api_key", apiKey));
        arraylist.add(new Parameter("user_id", s));
        if (date != null)
        {
            arraylist.add(new Parameter("min_fave_date", String.valueOf(date.getTime() / 1000L)));
        }
        if (date1 != null)
        {
            arraylist.add(new Parameter("max_fave_date", String.valueOf(date1.getTime() / 1000L)));
        }
        if (set != null)
        {
            arraylist.add(new Parameter("extras", StringUtilities.join(set, ",")));
        }
        if (i > 0)
        {
            arraylist.add(new Parameter("per_page", new Integer(i)));
        }
        if (j > 0)
        {
            arraylist.add(new Parameter("page", new Integer(j)));
        }
        s = transportAPI.get(transportAPI.getPath(), arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return PhotoUtils.createPhotoList(s.getData());
        }
    }

    public void remove(String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.favorites.remove"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("photo_id", s));
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
