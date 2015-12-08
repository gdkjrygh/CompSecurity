// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.TwitterException;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.util.z_T4JInternalParseUtil;

// Referenced classes of package twitter4j.internal.json:
//            DataObjectFactoryUtil, TweetJSONImpl

final class QueryResultJSONImpl
    implements QueryResult, Serializable
{

    private static final long serialVersionUID = 0x82477b4a917043daL;
    private double completedIn;
    private long maxId;
    private int page;
    private String query;
    private String refreshUrl;
    private int resultsPerPage;
    private long sinceId;
    private List tweets;
    private String warning;

    QueryResultJSONImpl(Query query1)
    {
        sinceId = query1.getSinceId();
        resultsPerPage = query1.getRpp();
        page = query1.getPage();
        tweets = new ArrayList(0);
    }

    QueryResultJSONImpl(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
_L2:
        if (i >= jsonarray.length())
        {
            break MISSING_BLOCK_LABEL_211;
        }
        JSONObject jsonobject = jsonarray.getJSONObject(i);
        tweets.add(new TweetJSONImpl(jsonobject, configuration));
        i++;
        continue; /* Loop/switch isn't completed */
        return;
        super();
        httpresponse = httpresponse.asJSONObject();
        JSONArray jsonarray;
        int i;
        try
        {
            sinceId = z_T4JInternalParseUtil.getLong("since_id", httpresponse);
            maxId = z_T4JInternalParseUtil.getLong("max_id", httpresponse);
            refreshUrl = z_T4JInternalParseUtil.getUnescapedString("refresh_url", httpresponse);
            resultsPerPage = z_T4JInternalParseUtil.getInt("results_per_page", httpresponse);
            warning = z_T4JInternalParseUtil.getRawString("warning", httpresponse);
            completedIn = z_T4JInternalParseUtil.getDouble("completed_in", httpresponse);
            page = z_T4JInternalParseUtil.getInt("page", httpresponse);
            query = z_T4JInternalParseUtil.getURLDecodedString("query", httpresponse);
            jsonarray = httpresponse.getJSONArray("results");
            tweets = new ArrayList(jsonarray.length());
            if (configuration.isJSONStoreEnabled())
            {
                DataObjectFactoryUtil.clearThreadLocalMap();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Configuration configuration)
        {
            throw new TwitterException(configuration.getMessage() + ":" + httpresponse.toString(), configuration);
        }
        i = 0;
        if (true) goto _L2; else goto _L1
_L1:
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
            if (page != ((QueryResult) (obj)).getPage())
            {
                return false;
            }
            if (resultsPerPage != ((QueryResult) (obj)).getResultsPerPage())
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
            if (warning == null ? ((QueryResult) (obj)).getWarning() != null : !warning.equals(((QueryResult) (obj)).getWarning()))
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

    public long getMaxId()
    {
        return maxId;
    }

    public int getPage()
    {
        return page;
    }

    public String getQuery()
    {
        return query;
    }

    public String getRefreshUrl()
    {
        return refreshUrl;
    }

    public int getResultsPerPage()
    {
        return resultsPerPage;
    }

    public long getSinceId()
    {
        return sinceId;
    }

    public List getTweets()
    {
        return tweets;
    }

    public String getWarning()
    {
        return warning;
    }

    public int hashCode()
    {
        int k = 0;
        int l = (int)(sinceId ^ sinceId >>> 32);
        int i1 = (int)(maxId ^ maxId >>> 32);
        int i;
        int j;
        int j1;
        int k1;
        int l1;
        int i2;
        long l2;
        if (refreshUrl != null)
        {
            i = refreshUrl.hashCode();
        } else
        {
            i = 0;
        }
        j1 = resultsPerPage;
        if (warning != null)
        {
            j = warning.hashCode();
        } else
        {
            j = 0;
        }
        if (completedIn != 0.0D)
        {
            l2 = Double.doubleToLongBits(completedIn);
        } else
        {
            l2 = 0L;
        }
        k1 = (int)(l2 >>> 32 ^ l2);
        l1 = page;
        i2 = query.hashCode();
        if (tweets != null)
        {
            k = tweets.hashCode();
        }
        return (((((((l * 31 + i1) * 31 + i) * 31 + j1) * 31 + j) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + k;
    }

    public String toString()
    {
        return "QueryResultJSONImpl{sinceId=" + sinceId + ", maxId=" + maxId + ", refreshUrl='" + refreshUrl + '\'' + ", resultsPerPage=" + resultsPerPage + ", warning='" + warning + '\'' + ", completedIn=" + completedIn + ", page=" + page + ", query='" + query + '\'' + ", tweets=" + tweets + '}';
    }
}
