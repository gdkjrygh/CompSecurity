// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.collections;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.Response;
import com.googlecode.flickrjandroid.Transport;
import com.googlecode.flickrjandroid.oauth.OAuthUtils;
import com.googlecode.flickrjandroid.photosets.Photoset;
import com.googlecode.flickrjandroid.util.JSONUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.googlecode.flickrjandroid.collections:
//            Collection

public class CollectionsInterface
{

    private static final String METHOD_GET_INFO = "flickr.collections.getInfo";
    private static final String METHOD_GET_TREE = "flickr.collections.getTree";
    private String apiKey;
    private String sharedSecret;
    private Transport transportAPI;

    public CollectionsInterface(String s, String s1, Transport transport)
    {
        apiKey = s;
        sharedSecret = s1;
        transportAPI = transport;
    }

    private Collection createCollection(JSONObject jsonobject)
    {
        Collection collection;
        JSONArray jsonarray;
        int i;
        boolean flag;
        flag = false;
        collection = new Collection();
        collection.setId(jsonobject.getString("id"));
        collection.setTitle(jsonobject.getString("title"));
        collection.setDescription(jsonobject.getString("description"));
        jsonarray = jsonobject.optJSONArray("set");
        i = 0;
_L3:
        if (jsonarray != null && i < jsonarray.length()) goto _L2; else goto _L1
_L1:
        jsonobject = jsonobject.optJSONArray("collection");
        i = ((flag) ? 1 : 0);
_L4:
        if (jsonobject == null || i >= jsonobject.length())
        {
            return collection;
        }
        break MISSING_BLOCK_LABEL_164;
_L2:
        JSONObject jsonobject2 = jsonarray.getJSONObject(i);
        Photoset photoset = new Photoset();
        photoset.setId(jsonobject2.getString("id"));
        photoset.setTitle(jsonobject2.getString("title"));
        photoset.setDescription(jsonobject2.getString("description"));
        collection.getPhotoSets().add(photoset);
        i++;
          goto _L3
        JSONObject jsonobject1 = jsonobject.getJSONObject(i);
        collection.getCollections().add(createCollection(jsonobject1));
        i++;
          goto _L4
    }

    public Collection getInfo(String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.collections.getInfo"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("collection_id", s));
        OAuthUtils.addOAuthToken(arraylist);
        s = transportAPI.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            s = s.getData().getJSONObject("collection");
            Collection collection = new Collection();
            collection.setId(s.getString("id"));
            collection.setTitle(JSONUtils.getChildValue(s, "title"));
            collection.setDescription(JSONUtils.getChildValue(s, "description"));
            collection.setChildCount(s.optInt("child_count"));
            collection.setIconLarge(s.optString("iconlarge"));
            collection.setIconSmall(s.optString("iconsmall"));
            collection.setServer(s.optString("server"));
            collection.setSecret(s.optString("secret"));
            return collection;
        }
    }

    public List getTree(String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.collections.getTree"));
        boolean flag = OAuthUtils.hasSigned();
        if (flag)
        {
            arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        } else
        {
            arraylist.add(new Parameter("api_key", apiKey));
        }
        if (s != null)
        {
            arraylist.add(new Parameter("collection_id", s));
        }
        if (s1 != null)
        {
            arraylist.add(new Parameter("user_id", s1));
        }
        if (flag)
        {
            OAuthUtils.addOAuthToken(arraylist);
        }
        if (flag)
        {
            s = transportAPI.postJSON(sharedSecret, arraylist);
        } else
        {
            s = transportAPI.get(transportAPI.getPath(), arraylist);
        }
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        }
        s1 = new ArrayList();
        s = s.getData().getJSONObject("collections").optJSONArray("collection");
        int i = 0;
        do
        {
            if (s == null || i >= s.length())
            {
                return s1;
            }
            s1.add(createCollection(s.getJSONObject(i)));
            i++;
        } while (true);
    }
}
