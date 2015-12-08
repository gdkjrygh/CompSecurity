// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import twitter4j.RateLimitStatus;
import twitter4j.TwitterException;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

// Referenced classes of package twitter4j.internal.json:
//            DataObjectFactoryUtil, z_T4JInternalParseUtil

final class RateLimitStatusJSONImpl
    implements Serializable, RateLimitStatus
{

    private static final long serialVersionUID = 0x168f2b593780b594L;
    private int limit;
    private int remaining;
    private int resetTimeInSeconds;
    private int secondsUntilReset;

    private RateLimitStatusJSONImpl(int i, int j, int k)
    {
        limit = i;
        remaining = j;
        resetTimeInSeconds = k;
        secondsUntilReset = (int)(((long)k * 1000L - System.currentTimeMillis()) / 1000L);
    }

    RateLimitStatusJSONImpl(JSONObject jsonobject)
    {
        init(jsonobject);
    }

    static RateLimitStatus createFromResponseHeader(HttpResponse httpresponse)
    {
        String s;
        if (httpresponse != null)
        {
            if ((s = httpresponse.getResponseHeader("X-Rate-Limit-Limit")) != null)
            {
                int i = Integer.parseInt(s);
                s = httpresponse.getResponseHeader("X-Rate-Limit-Remaining");
                if (s != null)
                {
                    int j = Integer.parseInt(s);
                    httpresponse = httpresponse.getResponseHeader("X-Rate-Limit-Reset");
                    if (httpresponse != null)
                    {
                        return new RateLimitStatusJSONImpl(i, j, (int)Long.parseLong(httpresponse));
                    }
                }
            }
        }
        return null;
    }

    static Map createRateLimitStatuses(HttpResponse httpresponse, Configuration configuration)
    {
        httpresponse = httpresponse.asJSONObject();
        Map map = createRateLimitStatuses(((JSONObject) (httpresponse)));
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.clearThreadLocalMap();
            DataObjectFactoryUtil.registerJSONObject(map, httpresponse);
        }
        return map;
    }

    static Map createRateLimitStatuses(JSONObject jsonobject)
    {
        HashMap hashmap;
        hashmap = new HashMap();
        try
        {
            jsonobject = jsonobject.getJSONObject("resources");
            for (Iterator iterator = jsonobject.keys(); iterator.hasNext();)
            {
                JSONObject jsonobject1 = jsonobject.getJSONObject((String)iterator.next());
                Iterator iterator1 = jsonobject1.keys();
                while (iterator1.hasNext()) 
                {
                    String s = (String)iterator1.next();
                    hashmap.put(s, new RateLimitStatusJSONImpl(jsonobject1.getJSONObject(s)));
                }
            }

        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new TwitterException(jsonobject);
        }
        jsonobject = Collections.unmodifiableMap(hashmap);
        return jsonobject;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (RateLimitStatusJSONImpl)obj;
            if (limit != ((RateLimitStatusJSONImpl) (obj)).limit)
            {
                return false;
            }
            if (remaining != ((RateLimitStatusJSONImpl) (obj)).remaining)
            {
                return false;
            }
            if (resetTimeInSeconds != ((RateLimitStatusJSONImpl) (obj)).resetTimeInSeconds)
            {
                return false;
            }
            if (secondsUntilReset != ((RateLimitStatusJSONImpl) (obj)).secondsUntilReset)
            {
                return false;
            }
        }
        return true;
    }

    public final int getLimit()
    {
        return limit;
    }

    public final int getRemaining()
    {
        return remaining;
    }

    public final int getRemainingHits()
    {
        return getRemaining();
    }

    public final int getResetTimeInSeconds()
    {
        return resetTimeInSeconds;
    }

    public final int getSecondsUntilReset()
    {
        return secondsUntilReset;
    }

    public final int hashCode()
    {
        return ((remaining * 31 + limit) * 31 + resetTimeInSeconds) * 31 + secondsUntilReset;
    }

    final void init(JSONObject jsonobject)
    {
        limit = z_T4JInternalParseUtil.getInt("limit", jsonobject);
        remaining = z_T4JInternalParseUtil.getInt("remaining", jsonobject);
        resetTimeInSeconds = z_T4JInternalParseUtil.getInt("reset", jsonobject);
        secondsUntilReset = (int)(((long)resetTimeInSeconds * 1000L - System.currentTimeMillis()) / 1000L);
    }

    public final String toString()
    {
        return (new StringBuilder("RateLimitStatusJSONImpl{remaining=")).append(remaining).append(", limit=").append(limit).append(", resetTimeInSeconds=").append(resetTimeInSeconds).append(", secondsUntilReset=").append(secondsUntilReset).append('}').toString();
    }
}
