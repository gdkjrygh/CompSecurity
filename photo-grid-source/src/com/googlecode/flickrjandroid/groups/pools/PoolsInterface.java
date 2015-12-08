// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.groups.pools;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.Response;
import com.googlecode.flickrjandroid.Transport;
import com.googlecode.flickrjandroid.groups.Group;
import com.googlecode.flickrjandroid.oauth.OAuthUtils;
import com.googlecode.flickrjandroid.photos.Extras;
import com.googlecode.flickrjandroid.photos.PhotoContext;
import com.googlecode.flickrjandroid.photos.PhotoList;
import com.googlecode.flickrjandroid.photos.PhotoUtils;
import com.googlecode.flickrjandroid.util.StringUtilities;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class PoolsInterface
{

    public static final String METHOD_ADD = "flickr.groups.pools.add";
    public static final String METHOD_GET_CONTEXT = "flickr.groups.pools.getContext";
    public static final String METHOD_GET_GROUPS = "flickr.groups.pools.getGroups";
    public static final String METHOD_GET_PHOTOS = "flickr.groups.pools.getPhotos";
    public static final String METHOD_REMOVE = "flickr.groups.pools.remove";
    private String apiKey;
    private String sharedSecret;
    private Transport transport;

    public PoolsInterface(String s, String s1, Transport transport1)
    {
        apiKey = s;
        sharedSecret = s1;
        transport = transport1;
    }

    public void add(String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.groups.pools.add"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("photo_id", s));
        arraylist.add(new Parameter("group_id", s1));
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

    public PhotoContext getContext(String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.groups.pools.getGroups"));
        arraylist.add(new Parameter("api_key", apiKey));
        arraylist.add(new Parameter("photo_id", s));
        arraylist.add(new Parameter("group_id", s1));
        s = transport.get(transport.getPath(), arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return new PhotoContext();
        }
    }

    public Collection getGroups()
    {
        return getGroups(-1, -1);
    }

    public Collection getGroups(int i, int j)
    {
        ArrayList arraylist = new ArrayList();
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.groups.pools.getGroups"));
        ((List) (obj)).add(new Parameter("oauth_consumer_key", apiKey));
        if (i > 0)
        {
            ((List) (obj)).add(new Parameter("per_page", new Integer(i)));
        }
        if (j > 0)
        {
            ((List) (obj)).add(new Parameter("page", new Integer(j)));
        }
        OAuthUtils.addOAuthToken(((List) (obj)));
        obj = transport.postJSON(sharedSecret, ((List) (obj)));
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        }
        obj = ((Response) (obj)).getData().getJSONObject("groups").optJSONArray("group");
        i = 0;
        do
        {
            if (obj == null || i >= ((JSONArray) (obj)).length())
            {
                return arraylist;
            }
            JSONObject jsonobject = ((JSONArray) (obj)).getJSONObject(i);
            Group group = new Group();
            group.setId(jsonobject.getString("id"));
            group.setName(jsonobject.getString("name"));
            group.setAdmin("1".equals(jsonobject.getString("admin")));
            group.setPrivacy(jsonobject.getString("privacy"));
            group.setPhotoCount(jsonobject.getString("photos"));
            group.setIconServer(jsonobject.getString("iconserver"));
            group.setIconFarm(jsonobject.getString("iconfarm"));
            arraylist.add(group);
            i++;
        } while (true);
    }

    public PhotoList getPhotos(String s, String as[], int i, int j)
    {
        return getPhotos(s, as, Extras.MIN_EXTRAS, i, j);
    }

    public PhotoList getPhotos(String s, String as[], Set set, int i, int j)
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.groups.pools.getPhotos"));
        arraylist.add(new Parameter("group_id", s));
        if (as != null)
        {
            arraylist.add(new Parameter("tags", StringUtilities.join(as, " ")));
        }
        if (i > 0)
        {
            arraylist.add(new Parameter("per_page", new Integer(i)));
        }
        if (j > 0)
        {
            arraylist.add(new Parameter("page", new Integer(j)));
        }
        if (set == null) goto _L2; else goto _L1
_L1:
        s = new StringBuffer();
        as = set.iterator();
        i = 0;
_L6:
        if (as.hasNext()) goto _L4; else goto _L3
_L3:
        arraylist.add(new Parameter("extras", s.toString()));
_L2:
        boolean flag = OAuthUtils.hasSigned();
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
            return PhotoUtils.createPhotoList(s.getData());
        }
_L4:
        if (i > 0)
        {
            s.append(",");
        }
        s.append((String)as.next());
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void remove(String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.groups.pools.remove"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("photo_id", s));
        arraylist.add(new Parameter("group_id", s1));
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
