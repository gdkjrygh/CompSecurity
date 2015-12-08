// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import twitter4j.Location;
import twitter4j.ResponseList;
import twitter4j.Trend;
import twitter4j.Trends;
import twitter4j.TwitterException;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.org.json.JSONArray;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

// Referenced classes of package twitter4j.internal.json:
//            TwitterResponseImpl, DataObjectFactoryUtil, z_T4JInternalParseUtil, ResponseListImpl, 
//            LocationJSONImpl, TrendJSONImpl

final class TrendsJSONImpl extends TwitterResponseImpl
    implements Serializable, Trends
{

    private static final long serialVersionUID = 0x9cc0d79bdc9acd4bL;
    private Date asOf;
    private Location location;
    private Date trendAt;
    private Trend trends[];

    TrendsJSONImpl(String s)
    {
        this(s, false);
    }

    TrendsJSONImpl(String s, boolean flag)
    {
        init(s, flag);
    }

    TrendsJSONImpl(Date date, Location location1, Date date1, Trend atrend[])
    {
        asOf = date;
        location = location1;
        trendAt = date1;
        trends = atrend;
    }

    TrendsJSONImpl(HttpResponse httpresponse, Configuration configuration)
    {
        super(httpresponse);
        init(httpresponse.asString(), configuration.isJSONStoreEnabled());
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.clearThreadLocalMap();
            DataObjectFactoryUtil.registerJSONObject(this, httpresponse.asString());
        }
    }

    static ResponseList createTrendsList(HttpResponse httpresponse, boolean flag)
    {
        Object obj1 = httpresponse.asJSONObject();
        Object obj;
        JSONObject jsonobject;
        ResponseListImpl responselistimpl;
        Iterator iterator;
        obj = z_T4JInternalParseUtil.parseTrendsDate(((JSONObject) (obj1)).getString("as_of"));
        jsonobject = ((JSONObject) (obj1)).getJSONObject("trends");
        obj1 = extractLocation(((JSONObject) (obj1)), flag);
        responselistimpl = new ResponseListImpl(jsonobject.length(), httpresponse);
        iterator = jsonobject.keys();
_L3:
        String s;
        Trend atrend[];
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_246;
        }
        s = (String)iterator.next();
        atrend = jsonArrayToTrendArray(jsonobject.getJSONArray(s), flag);
        if (s.length() != 19) goto _L2; else goto _L1
_L1:
        responselistimpl.add(new TrendsJSONImpl(((Date) (obj)), ((Location) (obj1)), z_T4JInternalParseUtil.getDate(s, "yyyy-MM-dd HH:mm:ss"), atrend));
          goto _L3
_L2:
        if (s.length() != 16) goto _L5; else goto _L4
_L4:
        responselistimpl.add(new TrendsJSONImpl(((Date) (obj)), ((Location) (obj1)), z_T4JInternalParseUtil.getDate(s, "yyyy-MM-dd HH:mm"), atrend));
          goto _L3
_L5:
        if (s.length() != 10) goto _L3; else goto _L6
_L6:
        responselistimpl.add(new TrendsJSONImpl(((Date) (obj)), ((Location) (obj1)), z_T4JInternalParseUtil.getDate(s, "yyyy-MM-dd"), atrend));
          goto _L3
        try
        {
            Collections.sort(responselistimpl);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new TwitterException((new StringBuilder()).append(((JSONException) (obj)).getMessage()).append(":").append(httpresponse.asString()).toString(), ((Throwable) (obj)));
        }
        return responselistimpl;
    }

    private static Location extractLocation(JSONObject jsonobject, boolean flag)
    {
        if (!jsonobject.isNull("locations"))
        {
            try
            {
                jsonobject = LocationJSONImpl.createLocationList(jsonobject.getJSONArray("locations"), flag);
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                throw new AssertionError("locations can't be null");
            }
            if (jsonobject.size() != 0)
            {
                return (Location)jsonobject.get(0);
            }
        }
        return null;
    }

    private static Trend[] jsonArrayToTrendArray(JSONArray jsonarray, boolean flag)
    {
        Trend atrend[] = new Trend[jsonarray.length()];
        for (int i = 0; i < jsonarray.length(); i++)
        {
            atrend[i] = new TrendJSONImpl(jsonarray.getJSONObject(i), flag);
        }

        return atrend;
    }

    public final volatile int compareTo(Object obj)
    {
        return compareTo((Trends)obj);
    }

    public final int compareTo(Trends trends1)
    {
        return trendAt.compareTo(trends1.getTrendAt());
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof Trends))
            {
                return false;
            }
            obj = (Trends)obj;
            if (asOf == null ? ((Trends) (obj)).getAsOf() != null : !asOf.equals(((Trends) (obj)).getAsOf()))
            {
                return false;
            }
            if (trendAt == null ? ((Trends) (obj)).getTrendAt() != null : !trendAt.equals(((Trends) (obj)).getTrendAt()))
            {
                return false;
            }
            if (!Arrays.equals(trends, ((Trends) (obj)).getTrends()))
            {
                return false;
            }
        }
        return true;
    }

    public final Date getAsOf()
    {
        return asOf;
    }

    public final Location getLocation()
    {
        return location;
    }

    public final Date getTrendAt()
    {
        return trendAt;
    }

    public final Trend[] getTrends()
    {
        return trends;
    }

    public final int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (asOf != null)
        {
            i = asOf.hashCode();
        } else
        {
            i = 0;
        }
        if (trendAt != null)
        {
            j = trendAt.hashCode();
        } else
        {
            j = 0;
        }
        if (trends != null)
        {
            k = Arrays.hashCode(trends);
        }
        return (j + i * 31) * 31 + k;
    }

    final void init(String s, boolean flag)
    {
        if (!s.startsWith("["))
        {
            break MISSING_BLOCK_LABEL_103;
        }
        s = new JSONArray(s);
        if (s.length() <= 0) goto _L2; else goto _L1
_L1:
        s = s.getJSONObject(0);
_L3:
        asOf = z_T4JInternalParseUtil.parseTrendsDate(s.getString("as_of"));
        location = extractLocation(s, flag);
        s = s.getJSONArray("trends");
        trendAt = asOf;
        trends = jsonArrayToTrendArray(s, flag);
        return;
_L2:
        try
        {
            throw new TwitterException("No trends found on the specified woeid");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new TwitterException(s.getMessage(), s);
        }
        s = new JSONObject(s);
          goto _L3
    }

    public final String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("TrendsJSONImpl{asOf=")).append(asOf).append(", trendAt=").append(trendAt).append(", trends=");
        java.util.List list;
        if (trends == null)
        {
            list = null;
        } else
        {
            list = Arrays.asList(trends);
        }
        return stringbuilder.append(list).append('}').toString();
    }
}
