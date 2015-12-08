// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import twitter4j.conf.Configuration;

// Referenced classes of package twitter4j:
//            Friendship, TwitterException, JSONException, ParseUtil, 
//            JSONObject, JSONArray, TwitterObjectFactory, HttpResponse, 
//            ResponseListImpl, ResponseList

class FriendshipJSONImpl
    implements Friendship
{

    private static final long serialVersionUID = 0x5f0666af66c839c2L;
    private boolean followedBy;
    private boolean following;
    private final long id;
    private final String name;
    private final String screenName;

    FriendshipJSONImpl(JSONObject jsonobject)
        throws TwitterException
    {
        int i;
        following = false;
        followedBy = false;
        JSONArray jsonarray;
        String s;
        try
        {
            id = ParseUtil.getLong("id", jsonobject);
            name = jsonobject.getString("name");
            screenName = jsonobject.getString("screen_name");
            jsonarray = jsonobject.getJSONArray("connections");
        }
        catch (JSONException jsonexception)
        {
            throw new TwitterException((new StringBuilder()).append(jsonexception.getMessage()).append(":").append(jsonobject.toString()).toString(), jsonexception);
        }
        i = 0;
_L2:
        if (i >= jsonarray.length())
        {
            break MISSING_BLOCK_LABEL_143;
        }
        s = jsonarray.getString(i);
        if ("following".equals(s))
        {
            following = true;
            break MISSING_BLOCK_LABEL_144;
        }
        if ("followed_by".equals(s))
        {
            followedBy = true;
        }
        break MISSING_BLOCK_LABEL_144;
        return;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static ResponseList createFriendshipList(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        JSONArray jsonarray;
        JSONObject jsonobject;
        FriendshipJSONImpl friendshipjsonimpl;
        int i;
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
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject = jsonarray.getJSONObject(i);
        friendshipjsonimpl = new FriendshipJSONImpl(jsonobject);
        if (configuration.isJSONStoreEnabled())
        {
            TwitterObjectFactory.registerJSONObject(friendshipjsonimpl, jsonobject);
        }
        httpresponse.add(friendshipjsonimpl);
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_37;
_L1:
        if (configuration.isJSONStoreEnabled())
        {
            TwitterObjectFactory.registerJSONObject(httpresponse, jsonarray);
        }
        return httpresponse;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (FriendshipJSONImpl)obj;
            if (followedBy != ((FriendshipJSONImpl) (obj)).followedBy)
            {
                return false;
            }
            if (following != ((FriendshipJSONImpl) (obj)).following)
            {
                return false;
            }
            if (id != ((FriendshipJSONImpl) (obj)).id)
            {
                return false;
            }
            if (!name.equals(((FriendshipJSONImpl) (obj)).name))
            {
                return false;
            }
            if (!screenName.equals(((FriendshipJSONImpl) (obj)).screenName))
            {
                return false;
            }
        }
        return true;
    }

    public long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getScreenName()
    {
        return screenName;
    }

    public int hashCode()
    {
        int l = 1;
        int i1 = (int)(id ^ id >>> 32);
        int i;
        int j;
        int k;
        if (name != null)
        {
            i = name.hashCode();
        } else
        {
            i = 0;
        }
        if (screenName != null)
        {
            j = screenName.hashCode();
        } else
        {
            j = 0;
        }
        if (following)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (!followedBy)
        {
            l = 0;
        }
        return (((i1 * 31 + i) * 31 + j) * 31 + k) * 31 + l;
    }

    public boolean isFollowedBy()
    {
        return followedBy;
    }

    public boolean isFollowing()
    {
        return following;
    }

    public String toString()
    {
        return (new StringBuilder()).append("FriendshipJSONImpl{id=").append(id).append(", name='").append(name).append('\'').append(", screenName='").append(screenName).append('\'').append(", following=").append(following).append(", followedBy=").append(followedBy).append('}').toString();
    }
}
