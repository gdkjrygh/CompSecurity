// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import twitter4j.conf.Configuration;

// Referenced classes of package twitter4j:
//            TwitterResponseImpl, QueryResult, TwitterException, JSONException, 
//            HttpResponse, JSONObject, ParseUtil, JSONArray, 
//            TwitterObjectFactory, StatusJSONImpl, Query

final class QueryResultJSONImpl extends TwitterResponseImpl
    implements QueryResult, Serializable
{

    private static final long serialVersionUID = 0xb59efee7b30538ecL;
    private double completedIn;
    private int count;
    private long maxId;
    private String nextResults;
    private String query;
    private String refreshUrl;
    private long sinceId;
    private List tweets;

    QueryResultJSONImpl(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        JSONObject jsonobject;
        super(httpresponse);
        jsonobject = httpresponse.asJSONObject();
        JSONObject jsonobject1;
        jsonobject1 = jsonobject.getJSONObject("search_metadata");
        completedIn = ParseUtil.getDouble("completed_in", jsonobject1);
        count = ParseUtil.getInt("count", jsonobject1);
        maxId = ParseUtil.getLong("max_id", jsonobject1);
        if (!jsonobject1.has("next_results")) goto _L2; else goto _L1
_L1:
        httpresponse = jsonobject1.getString("next_results");
_L6:
        nextResults = httpresponse;
        query = ParseUtil.getURLDecodedString("query", jsonobject1);
        refreshUrl = ParseUtil.getUnescapedString("refresh_url", jsonobject1);
        sinceId = ParseUtil.getLong("since_id", jsonobject1);
        httpresponse = jsonobject.getJSONArray("statuses");
        tweets = new ArrayList(httpresponse.length());
        if (configuration.isJSONStoreEnabled())
        {
            TwitterObjectFactory.clearThreadLocalMap();
        }
        break MISSING_BLOCK_LABEL_235;
_L5:
        int i;
        if (i >= httpresponse.length()) goto _L4; else goto _L3
_L3:
        JSONObject jsonobject2 = httpresponse.getJSONObject(i);
        tweets.add(new StatusJSONImpl(jsonobject2, configuration));
        i++;
          goto _L5
_L2:
        httpresponse = null;
          goto _L6
        httpresponse;
        throw new TwitterException((new StringBuilder()).append(httpresponse.getMessage()).append(":").append(jsonobject.toString()).toString(), httpresponse);
_L4:
        return;
        i = 0;
          goto _L5
    }

    QueryResultJSONImpl(Query query1)
    {
        sinceId = query1.getSinceId();
        count = query1.getCount();
        tweets = new ArrayList(0);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (QueryResult)obj;
            if (Double.compare(((QueryResult) (obj)).getCompletedIn(), completedIn) != 0)
            {
                return false;
            }
            if (maxId != ((QueryResult) (obj)).getMaxId())
            {
                return false;
            }
            if (count != ((QueryResult) (obj)).getCount())
            {
                return false;
            }
            if (sinceId != ((QueryResult) (obj)).getSinceId())
            {
                return false;
            }
            if (!query.equals(((QueryResult) (obj)).getQuery()))
            {
                return false;
            }
            if (refreshUrl == null ? ((QueryResult) (obj)).getRefreshURL() != null : !refreshUrl.equals(((QueryResult) (obj)).getRefreshURL()))
            {
                return false;
            }
            if (tweets == null ? ((QueryResult) (obj)).getTweets() != null : !tweets.equals(((QueryResult) (obj)).getTweets()))
            {
                return false;
            }
        }
        return true;
    }

    public double getCompletedIn()
    {
        return completedIn;
    }

    public int getCount()
    {
        return count;
    }

    public long getMaxId()
    {
        return maxId;
    }

    public String getQuery()
    {
        return query;
    }

    public String getRefreshURL()
    {
        return refreshUrl;
    }

    public long getSinceId()
    {
        return sinceId;
    }

    public List getTweets()
    {
        return tweets;
    }

    public boolean hasNext()
    {
        return nextResults != null;
    }

    public int hashCode()
    {
        int j = 0;
        int k = (int)(sinceId ^ sinceId >>> 32);
        int l = (int)(maxId ^ maxId >>> 32);
        int i;
        int i1;
        int j1;
        int k1;
        long l1;
        if (refreshUrl != null)
        {
            i = refreshUrl.hashCode();
        } else
        {
            i = 0;
        }
        i1 = count;
        if (completedIn != 0.0D)
        {
            l1 = Double.doubleToLongBits(completedIn);
        } else
        {
            l1 = 0L;
        }
        j1 = (int)(l1 >>> 32 ^ l1);
        k1 = query.hashCode();
        if (tweets != null)
        {
            j = tweets.hashCode();
        }
        return (((((k * 31 + l) * 31 + i) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + j;
    }

    public Query nextQuery()
    {
        if (nextResults == null)
        {
            return null;
        } else
        {
            return Query.createWithNextPageQuery(nextResults);
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("QueryResultJSONImpl{sinceId=").append(sinceId).append(", maxId=").append(maxId).append(", refreshUrl='").append(refreshUrl).append('\'').append(", count=").append(count).append(", completedIn=").append(completedIn).append(", query='").append(query).append('\'').append(", tweets=").append(tweets).append('}').toString();
    }
}
