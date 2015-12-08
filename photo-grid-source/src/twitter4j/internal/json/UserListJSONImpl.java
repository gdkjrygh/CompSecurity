// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;
import twitter4j.PagableResponseList;
import twitter4j.ResponseList;
import twitter4j.TwitterException;
import twitter4j.User;
import twitter4j.UserList;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.org.json.JSONArray;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

// Referenced classes of package twitter4j.internal.json:
//            TwitterResponseImpl, DataObjectFactoryUtil, PagableResponseListImpl, ResponseListImpl, 
//            z_T4JInternalParseUtil, UserJSONImpl

class UserListJSONImpl extends TwitterResponseImpl
    implements Serializable, UserList
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

    UserListJSONImpl(HttpResponse httpresponse, Configuration configuration)
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

    UserListJSONImpl(JSONObject jsonobject)
    {
        init(jsonobject);
    }

    static PagableResponseList createPagableUserListList(HttpResponse httpresponse, Configuration configuration)
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
            throw new TwitterException((new StringBuilder()).append(jsonexception.getMessage()).append(":").append(jsonobject.toString()).toString(), jsonexception);
        }
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((UserList)obj);
    }

    public int compareTo(UserList userlist)
    {
        return id - userlist.getId();
    }

    public boolean equals(Object obj)
    {
        if (obj != null)
        {
            if (this == obj)
            {
                return true;
            }
            if ((obj instanceof UserList) && ((UserList)obj).getId() == id)
            {
                return true;
            }
        }
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
        return (new StringBuilder("UserListJSONImpl{id=")).append(id).append(", name='").append(name).append('\'').append(", fullName='").append(fullName).append('\'').append(", slug='").append(slug).append('\'').append(", description='").append(description).append('\'').append(", subscriberCount=").append(subscriberCount).append(", memberCount=").append(memberCount).append(", uri='").append(uri).append('\'').append(", mode=").append(mode).append(", user=").append(user).append(", following=").append(following).append('}').toString();
    }
}
