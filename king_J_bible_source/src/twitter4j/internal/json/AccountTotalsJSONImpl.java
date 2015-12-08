// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.io.Serializable;
import org.json.JSONObject;
import twitter4j.AccountTotals;
import twitter4j.TwitterException;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.util.z_T4JInternalParseUtil;

// Referenced classes of package twitter4j.internal.json:
//            TwitterResponseImpl, DataObjectFactoryUtil

class AccountTotalsJSONImpl extends TwitterResponseImpl
    implements AccountTotals, Serializable
{

    private static final long serialVersionUID = 0xe0333e3ed238aa0dL;
    private final int favorites;
    private final int followers;
    private final int friends;
    private final int updates;

    AccountTotalsJSONImpl(JSONObject jsonobject)
        throws TwitterException
    {
        this(null, jsonobject);
    }

    private AccountTotalsJSONImpl(HttpResponse httpresponse, JSONObject jsonobject)
    {
        super(httpresponse);
        updates = z_T4JInternalParseUtil.getInt("updates", jsonobject);
        followers = z_T4JInternalParseUtil.getInt("followers", jsonobject);
        favorites = z_T4JInternalParseUtil.getInt("favorites", jsonobject);
        friends = z_T4JInternalParseUtil.getInt("friends", jsonobject);
    }

    AccountTotalsJSONImpl(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        this(httpresponse, httpresponse.asJSONObject());
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.clearThreadLocalMap();
            DataObjectFactoryUtil.registerJSONObject(this, httpresponse.asJSONObject());
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (AccountTotalsJSONImpl)obj;
            if (favorites != ((AccountTotalsJSONImpl) (obj)).favorites)
            {
                return false;
            }
            if (followers != ((AccountTotalsJSONImpl) (obj)).followers)
            {
                return false;
            }
            if (friends != ((AccountTotalsJSONImpl) (obj)).friends)
            {
                return false;
            }
            if (updates != ((AccountTotalsJSONImpl) (obj)).updates)
            {
                return false;
            }
        }
        return true;
    }

    public int getFavorites()
    {
        return favorites;
    }

    public int getFollowers()
    {
        return followers;
    }

    public int getFriends()
    {
        return friends;
    }

    public int getUpdates()
    {
        return updates;
    }

    public int hashCode()
    {
        return ((updates * 31 + followers) * 31 + favorites) * 31 + friends;
    }

    public String toString()
    {
        return "AccountTotalsJSONImpl{updates=" + updates + ", followers=" + followers + ", favorites=" + favorites + ", friends=" + friends + '}';
    }
}
