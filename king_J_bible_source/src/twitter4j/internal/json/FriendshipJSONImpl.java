// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import twitter4j.Friendship;
import twitter4j.ResponseList;
import twitter4j.TwitterException;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.util.z_T4JInternalParseUtil;

// Referenced classes of package twitter4j.internal.json:
//            DataObjectFactoryUtil, ResponseListImpl

class FriendshipJSONImpl
    implements Friendship
{

    private static final long serialVersionUID = 0x6b329ebb34802aedL;
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
            id = z_T4JInternalParseUtil.getLong("id", jsonobject);
            name = jsonobject.getString("name");
            screenName = jsonobject.getString("screen_name");
            jsonarray = jsonobject.getJSONArray("connections");
        }
        catch (JSONException jsonexception)
        {
            throw new TwitterException(jsonexception.getMessage() + ":" + jsonobject.toString(), jsonexception);
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
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject = jsonarray.getJSONObject(i);
        friendshipjsonimpl = new FriendshipJSONImpl(jsonobject);
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.registerJSONObject(friendshipjsonimpl, jsonobject);
        }
        httpresponse.add(friendshipjsonimpl);
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_37;
_L1:
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.registerJSONObject(httpresponse, jsonarray);
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
        return "FriendshipJSONImpl{id=" + id + ", name='" + name + '\'' + ", screenName='" + screenName + '\'' + ", following=" + following + ", followedBy=" + followedBy + '}';
    }
}
