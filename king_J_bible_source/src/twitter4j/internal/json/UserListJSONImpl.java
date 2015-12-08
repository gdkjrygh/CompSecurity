// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import twitter4j.PagableResponseList;
import twitter4j.ResponseList;
import twitter4j.TwitterException;
import twitter4j.User;
import twitter4j.UserList;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.util.z_T4JInternalParseUtil;

// Referenced classes of package twitter4j.internal.json:
//            TwitterResponseImpl, DataObjectFactoryUtil, PagableResponseListImpl, ResponseListImpl, 
//            UserJSONImpl

class UserListJSONImpl extends TwitterResponseImpl
    implements UserList, Serializable
{

    private static final long serialVersionUID = 0xa7eedbb8d7ed08daL;
    private String description;
    private boolean following;
    private String fullName;
    private int id;
    private int memberCount;
    private boolean mode;
    private String name;
    private String slug;
    private int subscriberCount;
    private String uri;
    private User user;

    UserListJSONImpl(JSONObject jsonobject)
        throws TwitterException
    {
        init(jsonobject);
    }

    UserListJSONImpl(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        super(httpresponse);
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.clearThreadLocalMap();
        }
        httpresponse = httpresponse.asJSONObject();
        init(httpresponse);
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.registerJSONObject(this, httpresponse);
        }
    }

    static PagableResponseList createPagableUserListList(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        int i;
        JSONObject jsonobject;
        JSONArray jsonarray;
        JSONObject jsonobject1;
        UserListJSONImpl userlistjsonimpl;
        int j;
        try
        {
            if (configuration.isJSONStoreEnabled())
            {
                DataObjectFactoryUtil.clearThreadLocalMap();
            }
            jsonobject = httpresponse.asJSONObject();
            jsonarray = jsonobject.getJSONArray("lists");
            j = jsonarray.length();
            httpresponse = new PagableResponseListImpl(j, jsonobject, httpresponse);
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            throw new TwitterException(httpresponse);
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            throw httpresponse;
        }
        i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        jsonobject1 = jsonarray.getJSONObject(i);
        userlistjsonimpl = new UserListJSONImpl(jsonobject1);
        httpresponse.add(userlistjsonimpl);
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.registerJSONObject(userlistjsonimpl, jsonobject1);
        }
        break MISSING_BLOCK_LABEL_130;
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.registerJSONObject(httpresponse, jsonobject);
        }
        return httpresponse;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static ResponseList createUserListList(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        int i;
        JSONArray jsonarray;
        JSONObject jsonobject;
        UserListJSONImpl userlistjsonimpl;
        int j;
        try
        {
            if (configuration.isJSONStoreEnabled())
            {
                DataObjectFactoryUtil.clearThreadLocalMap();
            }
            jsonarray = httpresponse.asJSONArray();
            j = jsonarray.length();
            httpresponse = new ResponseListImpl(j, httpresponse);
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            throw new TwitterException(httpresponse);
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            throw httpresponse;
        }
        i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        jsonobject = jsonarray.getJSONObject(i);
        userlistjsonimpl = new UserListJSONImpl(jsonobject);
        httpresponse.add(userlistjsonimpl);
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.registerJSONObject(userlistjsonimpl, jsonobject);
        }
        break MISSING_BLOCK_LABEL_119;
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.registerJSONObject(httpresponse, jsonarray);
        }
        return httpresponse;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void init(JSONObject jsonobject)
        throws TwitterException
    {
        id = z_T4JInternalParseUtil.getInt("id", jsonobject);
        name = z_T4JInternalParseUtil.getRawString("name", jsonobject);
        fullName = z_T4JInternalParseUtil.getRawString("full_name", jsonobject);
        slug = z_T4JInternalParseUtil.getRawString("slug", jsonobject);
        description = z_T4JInternalParseUtil.getRawString("description", jsonobject);
        subscriberCount = z_T4JInternalParseUtil.getInt("subscriber_count", jsonobject);
        memberCount = z_T4JInternalParseUtil.getInt("member_count", jsonobject);
        uri = z_T4JInternalParseUtil.getRawString("uri", jsonobject);
        mode = "public".equals(z_T4JInternalParseUtil.getRawString("mode", jsonobject));
        following = z_T4JInternalParseUtil.getBoolean("following", jsonobject);
        try
        {
            if (!jsonobject.isNull("user"))
            {
                user = new UserJSONImpl(jsonobject.getJSONObject("user"));
            }
            return;
        }
        catch (JSONException jsonexception)
        {
            throw new TwitterException(jsonexception.getMessage() + ":" + jsonobject.toString(), jsonexception);
        }
    }

    public int compareTo(Object obj)
    {
        return compareTo((UserList)obj);
    }

    public int compareTo(UserList userlist)
    {
        return id - userlist.getId();
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = true;
        if (obj != null) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (this == obj) goto _L4; else goto _L3
_L3:
        if (!(obj instanceof UserList))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (((UserList)obj).getId() == id) goto _L4; else goto _L5
_L5:
        return false;
    }

    public String getDescription()
    {
        return description;
    }

    public String getFullName()
    {
        return fullName;
    }

    public int getId()
    {
        return id;
    }

    public int getMemberCount()
    {
        return memberCount;
    }

    public String getName()
    {
        return name;
    }

    public String getSlug()
    {
        return slug;
    }

    public int getSubscriberCount()
    {
        return subscriberCount;
    }

    public URI getURI()
    {
        URI uri1;
        try
        {
            uri1 = new URI(uri);
        }
        catch (URISyntaxException urisyntaxexception)
        {
            return null;
        }
        return uri1;
    }

    public User getUser()
    {
        return user;
    }

    public int hashCode()
    {
        return id;
    }

    public boolean isFollowing()
    {
        return following;
    }

    public boolean isPublic()
    {
        return mode;
    }

    public String toString()
    {
        return "UserListJSONImpl{id=" + id + ", name='" + name + '\'' + ", fullName='" + fullName + '\'' + ", slug='" + slug + '\'' + ", description='" + description + '\'' + ", subscriberCount=" + subscriberCount + ", memberCount=" + memberCount + ", uri='" + uri + '\'' + ", mode=" + mode + ", user=" + user + ", following=" + following + '}';
    }
}
