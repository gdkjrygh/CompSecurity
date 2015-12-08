// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.groups;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.Response;
import com.googlecode.flickrjandroid.Transport;
import com.googlecode.flickrjandroid.oauth.OAuthException;
import com.googlecode.flickrjandroid.oauth.OAuthUtils;
import com.googlecode.flickrjandroid.util.JSONUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.googlecode.flickrjandroid.groups:
//            Category, Subcategory, Group, Throttle, 
//            GroupList

public class GroupsInterface
{

    public static final String METHOD_BROWSE = "flickr.groups.browse";
    public static final String METHOD_GET_ACTIVE_LIST = "flickr.groups.getActiveList";
    public static final String METHOD_GET_INFO = "flickr.groups.getInfo";
    public static final String METHOD_JOIN = "flickr.groups.join";
    public static final String METHOD_JOIN_REQUEST = "flickr.groups.joinRequest";
    public static final String METHOD_LEAVE = "flickr.groups.leave";
    public static final String METHOD_SEARCH = "flickr.groups.search";
    private String apiKey;
    private String sharedSecret;
    private Transport transportAPI;

    public GroupsInterface(String s, String s1, Transport transport)
    {
        apiKey = s;
        sharedSecret = s1;
        transportAPI = transport;
    }

    public Category browse(String s)
    {
        ArrayList arraylist;
        ArrayList arraylist1;
        Object obj;
        JSONArray jsonarray;
        int i;
        boolean flag;
        flag = false;
        arraylist = new ArrayList();
        arraylist1 = new ArrayList();
        obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.groups.browse"));
        ((List) (obj)).add(new Parameter("oauth_consumer_key", apiKey));
        if (s != null)
        {
            ((List) (obj)).add(new Parameter("cat_id", s));
        }
        OAuthUtils.addOAuthToken(((List) (obj)));
        s = transportAPI.postJSON(sharedSecret, ((List) (obj)));
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        }
        obj = s.getData().getJSONObject("category");
        s = new Category();
        s.setName(((JSONObject) (obj)).getString("name"));
        s.setPath(((JSONObject) (obj)).getString("path"));
        s.setPathIds(((JSONObject) (obj)).getString("pathids"));
        jsonarray = ((JSONObject) (obj)).optJSONArray("subcat");
        i = 0;
_L3:
        if (jsonarray != null && i < jsonarray.length()) goto _L2; else goto _L1
_L1:
        obj = ((JSONObject) (obj)).optJSONArray("group");
        i = ((flag) ? 1 : 0);
_L4:
        if (obj == null || i >= ((JSONArray) (obj)).length())
        {
            s.setGroups(arraylist1);
            s.setSubcategories(arraylist);
            return s;
        }
        break MISSING_BLOCK_LABEL_331;
_L2:
        JSONObject jsonobject1 = jsonarray.getJSONObject(i);
        Subcategory subcategory = new Subcategory();
        subcategory.setId(jsonobject1.getInt("id"));
        subcategory.setName(jsonobject1.getString("name"));
        subcategory.setCount(jsonobject1.getInt("count"));
        arraylist.add(subcategory);
        i++;
          goto _L3
        JSONObject jsonobject = ((JSONArray) (obj)).getJSONObject(i);
        Group group = new Group();
        group.setId(jsonobject.getString("nsid"));
        group.setName(jsonobject.getString("name"));
        group.setMembers(jsonobject.getString("members"));
        arraylist1.add(group);
        i++;
          goto _L4
    }

    public Group getInfo(String s)
    {
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.groups.getInfo"));
        ((List) (obj)).add(new Parameter("group_id", s));
        boolean flag = OAuthUtils.hasSigned();
        if (flag)
        {
            ((List) (obj)).add(new Parameter("oauth_consumer_key", apiKey));
            OAuthUtils.addOAuthToken(((List) (obj)));
        } else
        {
            ((List) (obj)).add(new Parameter("api_key", apiKey));
        }
        if (flag)
        {
            s = transportAPI.postJSON(sharedSecret, ((List) (obj)));
        } else
        {
            s = transportAPI.get(transportAPI.getPath(), ((List) (obj)));
        }
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        }
        obj = s.getData().getJSONObject("group");
        s = new Group();
        s.setId(((JSONObject) (obj)).getString("id"));
        s.setIconFarm(((JSONObject) (obj)).getString("iconfarm"));
        s.setIconServer(((JSONObject) (obj)).getString("iconserver"));
        s.setLang(((JSONObject) (obj)).getString("lang"));
        s.setPoolModerated("1".equals(((JSONObject) (obj)).getString("ispoolmoderated")));
        s.setName(JSONUtils.getChildValue(((JSONObject) (obj)), "name"));
        s.setDescription(JSONUtils.getChildValue(((JSONObject) (obj)), "description"));
        s.setRules(JSONUtils.getChildValue(((JSONObject) (obj)), "rules"));
        s.setMembers(JSONUtils.getChildValue(((JSONObject) (obj)), "members"));
        s.setPrivacy(JSONUtils.getChildValue(((JSONObject) (obj)), "privacy"));
        obj = ((JSONObject) (obj)).optJSONObject("throttle");
        if (obj != null)
        {
            Throttle throttle = new Throttle();
            throttle.setMode(((JSONObject) (obj)).getString("mode"));
            throttle.setCount(((JSONObject) (obj)).optInt("count"));
            throttle.setRemaining(((JSONObject) (obj)).optInt("remaining"));
            s.setThrottle(throttle);
        }
        return s;
    }

    public void joinPrivateGroup(String s, String s1, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.groups.joinRequest"));
        if (!OAuthUtils.hasSigned())
        {
            throw new OAuthException("OAuth required");
        }
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        OAuthUtils.addOAuthToken(arraylist);
        arraylist.add(new Parameter("group_id", s));
        arraylist.add(new Parameter("message", s1));
        arraylist.add(new Parameter("accept_rules", Boolean.valueOf(flag)));
        s = transportAPI.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return;
        }
    }

    public void joinPublicGroup(String s)
    {
        joinPublicGroup(s, Boolean.TRUE);
    }

    public void joinPublicGroup(String s, Boolean boolean1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.groups.join"));
        if (!OAuthUtils.hasSigned())
        {
            throw new OAuthException("OAuth required");
        }
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        OAuthUtils.addOAuthToken(arraylist);
        arraylist.add(new Parameter("group_id", s));
        if (boolean1 != null)
        {
            arraylist.add(new Parameter("accept_rules", Boolean.valueOf(boolean1.booleanValue())));
        }
        s = transportAPI.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return;
        }
    }

    public void leave(String s)
    {
        leave(s, null);
    }

    public void leave(String s, Boolean boolean1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.groups.leave"));
        if (!OAuthUtils.hasSigned())
        {
            throw new OAuthException("OAuth required");
        }
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        OAuthUtils.addOAuthToken(arraylist);
        arraylist.add(new Parameter("group_id", s));
        if (boolean1 != null)
        {
            arraylist.add(new Parameter("delete_photos", Boolean.valueOf(boolean1.booleanValue())));
        }
        s = transportAPI.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return;
        }
    }

    public GroupList search(String s, int i, int j)
    {
        GroupList grouplist = new GroupList();
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.groups.search"));
        ((List) (obj)).add(new Parameter("api_key", apiKey));
        ((List) (obj)).add(new Parameter("text", s));
        if (i > 0)
        {
            ((List) (obj)).add(new Parameter("per_page", new Integer(i)));
        }
        if (j > 0)
        {
            ((List) (obj)).add(new Parameter("page", new Integer(j)));
        }
        s = transportAPI.get(transportAPI.getPath(), ((List) (obj)));
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        }
        obj = s.getData().getJSONObject("groups");
        s = ((JSONObject) (obj)).optJSONArray("group");
        grouplist.setPage(((JSONObject) (obj)).getInt("page"));
        grouplist.setPages(((JSONObject) (obj)).getInt("pages"));
        grouplist.setPerPage(((JSONObject) (obj)).getInt("perpage"));
        grouplist.setTotal(((JSONObject) (obj)).getInt("total"));
        i = 0;
        do
        {
            if (s == null || i >= s.length())
            {
                return grouplist;
            }
            JSONObject jsonobject = s.getJSONObject(i);
            Group group = new Group();
            group.setId(jsonobject.getString("nsid"));
            group.setName(jsonobject.getString("name"));
            group.setPhotoCount(jsonobject.getString("pool_count"));
            group.setMembers(jsonobject.getString("members"));
            grouplist.add(group);
            i++;
        } while (true);
    }
}
