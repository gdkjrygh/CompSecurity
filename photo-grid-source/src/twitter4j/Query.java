// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import twitter4j.internal.http.HttpParameter;

// Referenced classes of package twitter4j:
//            GeoLocation

public final class Query
    implements Serializable
{

    public static final String KILOMETERS = "km";
    public static final String MILES = "mi";
    public static final String MIXED = "mixed";
    public static final String POPULAR = "popular";
    public static final String RECENT = "recent";
    private static HttpParameter WITH_TWITTER_USER_ID = new HttpParameter("with_twitter_user_id", "true");
    private static final long serialVersionUID = 0x8f7915acca2960c0L;
    private int count;
    private String geocode;
    private String lang;
    private String locale;
    private long maxId;
    private String nextPageQuery;
    private String query;
    private String resultType;
    private String since;
    private long sinceId;
    private String until;

    public Query()
    {
        query = null;
        lang = null;
        locale = null;
        maxId = -1L;
        count = -1;
        since = null;
        sinceId = -1L;
        geocode = null;
        until = null;
        resultType = null;
        nextPageQuery = null;
    }

    public Query(String s)
    {
        query = null;
        lang = null;
        locale = null;
        maxId = -1L;
        count = -1;
        since = null;
        sinceId = -1L;
        geocode = null;
        until = null;
        resultType = null;
        nextPageQuery = null;
        query = s;
    }

    private void appendParameter(String s, long l, List list)
    {
        if (0L <= l)
        {
            list.add(new HttpParameter(s, String.valueOf(l)));
        }
    }

    private void appendParameter(String s, String s1, List list)
    {
        if (s1 != null)
        {
            list.add(new HttpParameter(s, s1));
        }
    }

    private static Query createWithNextPageQuery(String s)
    {
        Query query1 = new Query();
        query1.nextPageQuery = s;
        return query1;
    }

    final HttpParameter[] asHttpParameterArray()
    {
        ArrayList arraylist = new ArrayList(12);
        appendParameter("q", query, arraylist);
        appendParameter("lang", lang, arraylist);
        appendParameter("locale", locale, arraylist);
        appendParameter("max_id", maxId, arraylist);
        appendParameter("count", count, arraylist);
        appendParameter("since", since, arraylist);
        appendParameter("since_id", sinceId, arraylist);
        appendParameter("geocode", geocode, arraylist);
        appendParameter("until", until, arraylist);
        appendParameter("result_type", resultType, arraylist);
        arraylist.add(WITH_TWITTER_USER_ID);
        return (HttpParameter[])arraylist.toArray(new HttpParameter[arraylist.size()]);
    }

    public final Query count(int i)
    {
        setCount(i);
        return this;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Query)obj;
            if (maxId != ((Query) (obj)).maxId)
            {
                return false;
            }
            if (count != ((Query) (obj)).count)
            {
                return false;
            }
            if (sinceId != ((Query) (obj)).sinceId)
            {
                return false;
            }
            if (geocode == null ? ((Query) (obj)).geocode != null : !geocode.equals(((Query) (obj)).geocode))
            {
                return false;
            }
            if (lang == null ? ((Query) (obj)).lang != null : !lang.equals(((Query) (obj)).lang))
            {
                return false;
            }
            if (locale == null ? ((Query) (obj)).locale != null : !locale.equals(((Query) (obj)).locale))
            {
                return false;
            }
            if (nextPageQuery == null ? ((Query) (obj)).nextPageQuery != null : !nextPageQuery.equals(((Query) (obj)).nextPageQuery))
            {
                return false;
            }
            if (query == null ? ((Query) (obj)).query != null : !query.equals(((Query) (obj)).query))
            {
                return false;
            }
            if (resultType == null ? ((Query) (obj)).resultType != null : !resultType.equals(((Query) (obj)).resultType))
            {
                return false;
            }
            if (since == null ? ((Query) (obj)).since != null : !since.equals(((Query) (obj)).since))
            {
                return false;
            }
            if (until == null ? ((Query) (obj)).until != null : !until.equals(((Query) (obj)).until))
            {
                return false;
            }
        }
        return true;
    }

    public final Query geoCode(GeoLocation geolocation, double d, String s)
    {
        setGeoCode(geolocation, d, s);
        return this;
    }

    public final int getCount()
    {
        return count;
    }

    public final String getGeocode()
    {
        return geocode;
    }

    public final String getLang()
    {
        return lang;
    }

    public final String getLocale()
    {
        return locale;
    }

    public final long getMaxId()
    {
        return maxId;
    }

    public final String getQuery()
    {
        return query;
    }

    public final String getResultType()
    {
        return resultType;
    }

    public final String getSince()
    {
        return since;
    }

    public final long getSinceId()
    {
        return sinceId;
    }

    public final String getUntil()
    {
        return until;
    }

    public final int hashCode()
    {
        int l1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int i2;
        int j2;
        int k2;
        if (query != null)
        {
            i = query.hashCode();
        } else
        {
            i = 0;
        }
        if (lang != null)
        {
            j = lang.hashCode();
        } else
        {
            j = 0;
        }
        if (locale != null)
        {
            k = locale.hashCode();
        } else
        {
            k = 0;
        }
        i2 = (int)(maxId ^ maxId >>> 32);
        j2 = count;
        if (since != null)
        {
            l = since.hashCode();
        } else
        {
            l = 0;
        }
        k2 = (int)(sinceId ^ sinceId >>> 32);
        if (geocode != null)
        {
            i1 = geocode.hashCode();
        } else
        {
            i1 = 0;
        }
        if (until != null)
        {
            j1 = until.hashCode();
        } else
        {
            j1 = 0;
        }
        if (resultType != null)
        {
            k1 = resultType.hashCode();
        } else
        {
            k1 = 0;
        }
        if (nextPageQuery != null)
        {
            l1 = nextPageQuery.hashCode();
        }
        return (k1 + (j1 + (i1 + ((l + (((k + (j + i * 31) * 31) * 31 + i2) * 31 + j2) * 31) * 31 + k2) * 31) * 31) * 31) * 31 + l1;
    }

    public final Query lang(String s)
    {
        setLang(s);
        return this;
    }

    public final Query locale(String s)
    {
        setLocale(s);
        return this;
    }

    public final Query maxId(long l)
    {
        setMaxId(l);
        return this;
    }

    final String nextPage()
    {
        return nextPageQuery;
    }

    public final Query query(String s)
    {
        setQuery(s);
        return this;
    }

    public final Query resultType(String s)
    {
        setResultType(s);
        return this;
    }

    public final void setCount(int i)
    {
        count = i;
    }

    public final void setGeoCode(GeoLocation geolocation, double d, String s)
    {
        geocode = (new StringBuilder()).append(geolocation.getLatitude()).append(",").append(geolocation.getLongitude()).append(",").append(d).append(s).toString();
    }

    public final void setLang(String s)
    {
        lang = s;
    }

    public final void setLocale(String s)
    {
        locale = s;
    }

    public final void setMaxId(long l)
    {
        maxId = l;
    }

    public final void setQuery(String s)
    {
        query = s;
    }

    public final void setResultType(String s)
    {
        resultType = s;
    }

    public final void setSince(String s)
    {
        since = s;
    }

    public final void setSinceId(long l)
    {
        sinceId = l;
    }

    public final void setUntil(String s)
    {
        until = s;
    }

    public final Query since(String s)
    {
        setSince(s);
        return this;
    }

    public final Query sinceId(long l)
    {
        setSinceId(l);
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("Query{query='")).append(query).append('\'').append(", lang='").append(lang).append('\'').append(", locale='").append(locale).append('\'').append(", maxId=").append(maxId).append(", count=").append(count).append(", since='").append(since).append('\'').append(", sinceId=").append(sinceId).append(", geocode='").append(geocode).append('\'').append(", until='").append(until).append('\'').append(", resultType='").append(resultType).append('\'').append(", nextPageQuery='").append(nextPageQuery).append('\'').append('}').toString();
    }

    public final Query until(String s)
    {
        setUntil(s);
        return this;
    }

}
