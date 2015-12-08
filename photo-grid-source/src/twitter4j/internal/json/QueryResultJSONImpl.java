// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.TwitterException;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.org.json.JSONArray;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

// Referenced classes of package twitter4j.internal.json:
//            TwitterResponseImpl, z_T4JInternalParseUtil, DataObjectFactoryUtil, StatusJSONImpl

final class QueryResultJSONImpl extends TwitterResponseImpl
    implements Serializable, QueryResult
{

    static Method queryFactoryMethod;
    private static final long serialVersionUID = 0xa1e2b9412415d92aL;
    private double completedIn;
    private int count;
    private long maxId;
    private String nextResults;
    private String query;
    private String refreshUrl;
    private long sinceId;
    private List tweets;

    QueryResultJSONImpl(Query query1)
    {
        sinceId = query1.getSinceId();
        count = query1.getCount();
        tweets = new ArrayList(0);
    }

    QueryResultJSONImpl(HttpResponse httpresponse, Configuration configuration)
    {
        JSONObject jsonobject;
        super(httpresponse);
        jsonobject = httpresponse.asJSONObject();
        JSONObject jsonobject1;
        jsonobject1 = jsonobject.getJSONObject("search_metadata");
        completedIn = z_T4JInternalParseUtil.getDouble("completed_in", jsonobject1);
        count = z_T4JInternalParseUtil.getInt("count", jsonobject1);
        maxId = z_T4JInternalParseUtil.getLong("max_id", jsonobject1);
        if (!jsonobject1.has("next_results")) goto _L2; else goto _L1
_L1:
        httpresponse = jsonobject1.getString("next_results");
_L6:
        nextResults = httpresponse;
        query = z_T4JInternalParseUtil.getURLDecodedString("query", jsonobject1);
        refreshUrl = z_T4JInternalParseUtil.getUnescapedString("refresh_url", jsonobject1);
        sinceId = z_T4JInternalParseUtil.getLong("since_id", jsonobject1);
        httpresponse = jsonobject.getJSONArray("statuses");
        tweets = new ArrayList(httpresponse.length());
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.clearThreadLocalMap();
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

    public final boolean equals(Object obj)
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
            if (refreshUrl == null ? ((QueryResult) (obj)).getRefreshUrl() != null : !refreshUrl.equals(((QueryResult) (obj)).getRefreshUrl()))
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

    public final double getCompletedIn()
    {
        return completedIn;
    }

    public final int getCount()
    {
        return count;
    }

    public final long getMaxId()
    {
        return maxId;
    }

    public final String getQuery()
    {
        return query;
    }

    public final String getRefreshURL()
    {
        return refreshUrl;
    }

    public final String getRefreshUrl()
    {
        return getRefreshURL();
    }

    public final long getSinceId()
    {
        return sinceId;
    }

    public final List getTweets()
    {
        return tweets;
    }

    public final boolean hasNext()
    {
        return nextResults != null;
    }

    public final int hashCode()
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
        j1 = (int)(l1 ^ l1 >>> 32);
        k1 = query.hashCode();
        if (tweets != null)
        {
            j = tweets.hashCode();
        }
        return ((((i + (k * 31 + l) * 31) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + j;
    }

    public final Query nextQuery()
    {
        if (nextResults == null)
        {
            return null;
        }
        Query query1;
        try
        {
            query1 = (Query)queryFactoryMethod.invoke(null, new String[] {
                nextResults
            });
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new RuntimeException(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new RuntimeException(invocationtargetexception);
        }
        return query1;
    }

    public final String toString()
    {
        return (new StringBuilder("QueryResultJSONImpl{sinceId=")).append(sinceId).append(", maxId=").append(maxId).append(", refreshUrl='").append(refreshUrl).append('\'').append(", count=").append(count).append(", completedIn=").append(completedIn).append(", query='").append(query).append('\'').append(", tweets=").append(tweets).append('}').toString();
    }

    static 
    {
        Method amethod[] = twitter4j/Query.getDeclaredMethods();
        int j = amethod.length;
        int i = 0;
        do
        {
label0:
            {
                if (i < j)
                {
                    Method method = amethod[i];
                    if (!method.getName().equals("createWithNextPageQuery"))
                    {
                        break label0;
                    }
                    queryFactoryMethod = method;
                    method.setAccessible(true);
                }
                if (queryFactoryMethod == null)
                {
                    throw new ExceptionInInitializerError(new NoSuchMethodException("twitter4j.Query.createWithNextPageQuery(java.lang.String)"));
                }
            }
            i++;
        } while (true);
    }
}
