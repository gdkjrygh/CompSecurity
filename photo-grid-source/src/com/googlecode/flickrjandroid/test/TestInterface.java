// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.test;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.Response;
import com.googlecode.flickrjandroid.Transport;
import com.googlecode.flickrjandroid.oauth.OAuthUtils;
import com.googlecode.flickrjandroid.people.User;
import com.googlecode.flickrjandroid.util.JSONUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

public class TestInterface
{

    public static final String METHOD_ECHO = "flickr.test.echo";
    public static final String METHOD_LOGIN = "flickr.test.login";
    public static final String METHOD_NULL = "flickr.test.null";
    private String apiKey;
    private String sharedSecret;
    private Transport transport;

    public TestInterface(String s, String s1, Transport transport1)
    {
        apiKey = s;
        sharedSecret = s1;
        transport = transport1;
    }

    public JSONObject echo(Collection collection)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.test.echo"));
        arraylist.add(new Parameter("api_key", apiKey));
        arraylist.addAll(collection);
        collection = transport.get(transport.getPath(), arraylist);
        if (collection.isError())
        {
            throw new FlickrException(collection.getErrorCode(), collection.getErrorMessage());
        } else
        {
            return collection.getData();
        }
    }

    public User login()
    {
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.test.login"));
        ((List) (obj)).add(new Parameter("oauth_consumer_key", apiKey));
        OAuthUtils.addOAuthToken(((List) (obj)));
        obj = transport.postJSON(sharedSecret, ((List) (obj)));
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        } else
        {
            obj = ((Response) (obj)).getData().getJSONObject("user");
            User user = new User();
            user.setId(((JSONObject) (obj)).getString("id"));
            user.setUsername(JSONUtils.getChildValue(((JSONObject) (obj)), "username"));
            return user;
        }
    }

    public void null_()
    {
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.test.null"));
        ((List) (obj)).add(new Parameter("oauth_consumer_key", apiKey));
        OAuthUtils.addOAuthToken(((List) (obj)));
        obj = transport.postJSON(sharedSecret, ((List) (obj)));
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        } else
        {
            return;
        }
    }
}
