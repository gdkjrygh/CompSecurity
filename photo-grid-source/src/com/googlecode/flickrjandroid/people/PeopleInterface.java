// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.people;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.Response;
import com.googlecode.flickrjandroid.Transport;
import com.googlecode.flickrjandroid.groups.Group;
import com.googlecode.flickrjandroid.oauth.OAuthUtils;
import com.googlecode.flickrjandroid.photos.Extras;
import com.googlecode.flickrjandroid.photos.PhotoList;
import com.googlecode.flickrjandroid.photos.PhotoUtils;
import com.googlecode.flickrjandroid.util.JSONUtils;
import com.googlecode.flickrjandroid.util.StringUtilities;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.googlecode.flickrjandroid.people:
//            User, Bandwidth

public class PeopleInterface
{

    public static final String METHOD_FIND_BY_EMAIL = "flickr.people.findByEmail";
    public static final String METHOD_FIND_BY_USERNAME = "flickr.people.findByUsername";
    public static final String METHOD_GET_INFO = "flickr.people.getInfo";
    public static final String METHOD_GET_ONLINE_LIST = "flickr.people.getOnlineList";
    public static final String METHOD_GET_PHOTOS = "flickr.people.getPhotos";
    public static final String METHOD_GET_PUBLIC_GROUPS = "flickr.people.getPublicGroups";
    public static final String METHOD_GET_PUBLIC_PHOTOS = "flickr.people.getPublicPhotos";
    public static final String METHOD_GET_UPLOAD_STATUS = "flickr.people.getUploadStatus";
    private String apiKey;
    private String sharedSecret;
    private Transport transportAPI;

    public PeopleInterface(String s, String s1, Transport transport)
    {
        apiKey = s;
        sharedSecret = s1;
        transportAPI = transport;
    }

    private User createUser(JSONObject jsonobject)
    {
        jsonobject = jsonobject.getJSONObject("user");
        User user = new User();
        user.setId(jsonobject.getString("nsid"));
        user.setUsername(JSONUtils.getChildValue(jsonobject, "username"));
        return user;
    }

    public User findByEmail(String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.people.findByEmail"));
        arraylist.add(new Parameter("api_key", apiKey));
        arraylist.add(new Parameter("find_email", s));
        s = transportAPI.get(transportAPI.getPath(), arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return createUser(s.getData());
        }
    }

    public User findByUsername(String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.people.findByUsername"));
        arraylist.add(new Parameter("api_key", apiKey));
        arraylist.add(new Parameter("username", s));
        s = transportAPI.get(transportAPI.getPath(), arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return createUser(s.getData());
        }
    }

    public User getInfo(String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.people.getInfo"));
        arraylist.add(new Parameter("user_id", s));
        arraylist.add(new Parameter("api_key", apiKey));
        s = transportAPI.get(transportAPI.getPath(), arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            JSONObject jsonobject = s.getData().getJSONObject("person");
            s = new User();
            s.setId(jsonobject.getString("nsid"));
            s.setPro("1".equals(jsonobject.getString("ispro")));
            s.setIconFarm(jsonobject.getString("iconfarm"));
            s.setIconServer(jsonobject.getString("iconserver"));
            s.setUsername(JSONUtils.getChildValue(jsonobject, "username"));
            s.setRealName(JSONUtils.getChildValue(jsonobject, "realname"));
            s.setLocation(JSONUtils.getChildValue(jsonobject, "location"));
            s.setPathAlias(jsonobject.getString("path_alias"));
            s.setMbox_sha1sum(JSONUtils.getChildValue(jsonobject, "mbox_sha1sum"));
            s.setPhotosurl(JSONUtils.getChildValue(jsonobject, "photosurl"));
            s.setProfileurl(JSONUtils.getChildValue(jsonobject, "profileurl"));
            s.setMobileurl(JSONUtils.getChildValue(jsonobject, "mobileurl"));
            jsonobject = jsonobject.getJSONObject("photos");
            s.setPhotosFirstDate(JSONUtils.getChildValue(jsonobject, "firstdate"));
            s.setPhotosFirstDateTaken(JSONUtils.getChildValue(jsonobject, "firstdatetaken"));
            s.setPhotosCount(JSONUtils.getChildValue(jsonobject, "count"));
            return s;
        }
    }

    public PhotoList getPhotos(String s, Set set, int i, int j)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.people.getPhotos"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("user_id", s));
        if (i > 0)
        {
            arraylist.add(new Parameter("per_page", String.valueOf(i)));
        }
        if (j > 0)
        {
            arraylist.add(new Parameter("page", String.valueOf(j)));
        }
        if (set != null)
        {
            arraylist.add(new Parameter("extras", StringUtilities.join(set, ",")));
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

    public Collection getPublicGroups(String s)
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        arraylist1.add(new Parameter("method", "flickr.people.getPublicGroups"));
        arraylist1.add(new Parameter("api_key", apiKey));
        arraylist1.add(new Parameter("user_id", s));
        s = transportAPI.get(transportAPI.getPath(), arraylist1);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        }
        s = s.getData().getJSONObject("groups").getJSONArray("group");
        int i = 0;
        do
        {
            if (i >= s.length())
            {
                return arraylist;
            }
            JSONObject jsonobject = s.getJSONObject(i);
            Group group = new Group();
            group.setId(jsonobject.getString("nsid"));
            group.setName(jsonobject.getString("name"));
            group.setAdmin("1".equals(jsonobject.getString("admin")));
            group.setEighteenPlus("1".equals(jsonobject.getString("eighteenplus")));
            group.setInvitationOnly("1".equals(jsonobject.getString("invitation_only")));
            arraylist.add(group);
            i++;
        } while (true);
    }

    public PhotoList getPublicPhotos(String s, int i, int j)
    {
        return getPublicPhotos(s, Extras.MIN_EXTRAS, i, j);
    }

    public PhotoList getPublicPhotos(String s, Set set, int i, int j)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.people.getPublicPhotos"));
        arraylist.add(new Parameter("api_key", apiKey));
        arraylist.add(new Parameter("user_id", s));
        if (i > 0)
        {
            arraylist.add(new Parameter("per_page", String.valueOf(i)));
        }
        if (j > 0)
        {
            arraylist.add(new Parameter("page", String.valueOf(j)));
        }
        if (set != null)
        {
            arraylist.add(new Parameter("extras", StringUtilities.join(set, ",")));
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

    public User getUploadStatus()
    {
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.people.getUploadStatus"));
        ((List) (obj)).add(new Parameter("oauth_consumer_key", apiKey));
        OAuthUtils.addOAuthToken(((List) (obj)));
        obj = transportAPI.postJSON(sharedSecret, ((List) (obj)));
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        } else
        {
            obj = ((Response) (obj)).getData().getJSONObject("user");
            User user = new User();
            user.setId(((JSONObject) (obj)).getString("id"));
            user.setPro("1".equals(((JSONObject) (obj)).getString("ispro")));
            user.setUsername(JSONUtils.getChildValue(((JSONObject) (obj)), "username"));
            JSONObject jsonobject = ((JSONObject) (obj)).getJSONObject("bandwidth");
            Bandwidth bandwidth = new Bandwidth();
            bandwidth.setMax(jsonobject.getLong("max"));
            bandwidth.setUsed(jsonobject.getLong("used"));
            bandwidth.setUsed(jsonobject.getLong("used"));
            bandwidth.setMaxBytes(jsonobject.getLong("maxbytes"));
            bandwidth.setUsedBytes(jsonobject.getLong("usedbytes"));
            bandwidth.setRemainingBytes(jsonobject.getLong("remainingbytes"));
            bandwidth.setMaxKb(jsonobject.getLong("maxkb"));
            bandwidth.setUsedKb(jsonobject.getLong("usedkb"));
            bandwidth.setRemainingKb(jsonobject.getLong("remainingkb"));
            bandwidth.setUnlimited("1".equals(jsonobject.getString("unlimited")));
            user.setBandwidth(bandwidth);
            user.setFilesizeMax(((JSONObject) (obj)).getJSONObject("filesize").getString("max"));
            return user;
        }
    }
}
