// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import twitter4j.conf.Configuration;

// Referenced classes of package twitter4j:
//            TwitterResponseImpl, UserList, TwitterException, TwitterObjectFactory, 
//            HttpResponse, JSONException, JSONObject, JSONArray, 
//            PagableResponseListImpl, PagableResponseList, ResponseListImpl, ResponseList, 
//            ParseUtil, UserJSONImpl, User

class UserListJSONImpl extends TwitterResponseImpl
    implements Serializable, UserList
{

    private static final long serialVersionUID = 0x63ca82e65ce7090L;
    private Date createdAt;
    private String description;
    private boolean following;
    private String fullName;
    private long id;
    private int memberCount;
    private boolean mode;
    private String name;
    private String slug;
    private int subscriberCount;
    private String uri;
    private User user;

    UserListJSONImpl(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        super(httpresponse);
        if (configuration.isJSONStoreEnabled())
        {
            TwitterObjectFactory.clearThreadLocalMap();
        }
        httpresponse = httpresponse.asJSONObject();
        init(httpresponse);
        if (configuration.isJSONStoreEnabled())
        {
            TwitterObjectFactory.registerJSONObject(this, httpresponse);
        }
    }

    UserListJSONImpl(JSONObject jsonobject)
        throws TwitterException
    {
        init(jsonobject);
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
                TwitterObjectFactory.clearThreadLocalMap();
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
            TwitterObjectFactory.registerJSONObject(userlistjsonimpl, jsonobject1);
        }
        break MISSING_BLOCK_LABEL_127;
        if (configuration.isJSONStoreEnabled())
        {
            TwitterObjectFactory.registerJSONObject(httpresponse, jsonobject);
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
                TwitterObjectFactory.clearThreadLocalMap();
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
            TwitterObjectFactory.registerJSONObject(userlistjsonimpl, jsonobject);
        }
        break MISSING_BLOCK_LABEL_116;
        if (configuration.isJSONStoreEnabled())
        {
            TwitterObjectFactory.registerJSONObject(httpresponse, jsonarray);
        }
        return httpresponse;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void init(JSONObject jsonobject)
        throws TwitterException
    {
        id = ParseUtil.getLong("id", jsonobject);
        name = ParseUtil.getRawString("name", jsonobject);
        fullName = ParseUtil.getRawString("full_name", jsonobject);
        slug = ParseUtil.getRawString("slug", jsonobject);
        description = ParseUtil.getRawString("description", jsonobject);
        subscriberCount = ParseUtil.getInt("subscriber_count", jsonobject);
        memberCount = ParseUtil.getInt("member_count", jsonobject);
        uri = ParseUtil.getRawString("uri", jsonobject);
        mode = "public".equals(ParseUtil.getRawString("mode", jsonobject));
        following = ParseUtil.getBoolean("following", jsonobject);
        createdAt = ParseUtil.getDate("created_at", jsonobject);
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
        long l = id - userlist.getId();
        if (l < 0xffffffff80000000L)
        {
            return 0x80000000;
        }
        if (l > 0x7fffffffL)
        {
            return 0x7fffffff;
        } else
        {
            return (int)l;
        }
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

    public Date getCreatedAt()
    {
        return createdAt;
    }

    public String getDescription()
    {
        return description;
    }

    public String getFullName()
    {
        return fullName;
    }

    public long getId()
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
        return (int)id;
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
        return (new StringBuilder()).append("UserListJSONImpl{id=").append(id).append(", name='").append(name).append('\'').append(", fullName='").append(fullName).append('\'').append(", slug='").append(slug).append('\'').append(", description='").append(description).append('\'').append(", subscriberCount=").append(subscriberCount).append(", memberCount=").append(memberCount).append(", uri='").append(uri).append('\'').append(", mode=").append(mode).append(", user=").append(user).append(", following=").append(following).append('}').toString();
    }
}
