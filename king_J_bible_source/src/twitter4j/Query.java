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
    private String geocode;
    private String lang;
    private String locale;
    private long maxId;
    private int page;
    private String query;
    private String resultType;
    private int rpp;
    private String since;
    private long sinceId;
    private String until;

    public Query()
    {
        query = null;
        lang = null;
        locale = null;
        maxId = -1L;
        rpp = -1;
        page = -1;
        since = null;
        sinceId = -1L;
        geocode = null;
        until = null;
        resultType = null;
    }

    public Query(String s)
    {
        query = null;
        lang = null;
        locale = null;
        maxId = -1L;
        rpp = -1;
        page = -1;
        since = null;
        sinceId = -1L;
        geocode = null;
        until = null;
        resultType = null;
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

    HttpParameter[] asHttpParameterArray(HttpParameter httpparameter)
    {
        ArrayList arraylist = new ArrayList();
        appendParameter("q", query, arraylist);
        appendParameter("lang", lang, arraylist);
        appendParameter("locale", locale, arraylist);
        appendParameter("max_id", maxId, arraylist);
        appendParameter("rpp", rpp, arraylist);
        appendParameter("page", page, arraylist);
        appendParameter("since", since, arraylist);
        appendParameter("since_id", sinceId, arraylist);
        appendParameter("geocode", geocode, arraylist);
        appendParameter("until", until, arraylist);
        appendParameter("result_type", resultType, arraylist);
        arraylist.add(WITH_TWITTER_USER_ID);
        arraylist.add(httpparameter);
        return (HttpParameter[])arraylist.toArray(new HttpParameter[arraylist.size()]);
    }

    public boolean equals(Object obj)
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
            if (page != ((Query) (obj)).page)
            {
                return false;
            }
            if (rpp != ((Query) (obj)).rpp)
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
            if (query == null ? ((Query) (obj)).query != null : !query.equals(((Query) (obj)).query))
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
            if (resultType == null ? ((Query) (obj)).resultType != null : !resultType.equals(((Query) (obj)).resultType))
            {
                return false;
            }
        }
        return true;
    }

    public Query geoCode(GeoLocation geolocation, double d, String s)
    {
        setGeoCode(geolocation, d, s);
        return this;
    }

    public String getGeocode()
    {
        return geocode;
    }

    public String getLang()
    {
        return lang;
    }

    public String getLocale()
    {
        return locale;
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

    public String getResultType()
    {
        return resultType;
    }

    public int getRpp()
    {
        return rpp;
    }

    public String getSince()
    {
        return since;
    }

    public long getSinceId()
    {
        return sinceId;
    }

    public String getUntil()
    {
        return until;
    }

    public int hashCode()
    {
        int k1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int l1;
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
        l1 = (int)(maxId ^ maxId >>> 32);
        i2 = rpp;
        j2 = page;
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
        }
        return (((((((((i * 31 + j) * 31 + k) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + l) * 31 + k2) * 31 + i1) * 31 + j1) * 31 + k1;
    }

    public Query lang(String s)
    {
        setLang(s);
        return this;
    }

    public Query locale(String s)
    {
        setLocale(s);
        return this;
    }

    public Query maxId(long l)
    {
        setMaxId(l);
        return this;
    }

    public Query page(int i)
    {
        setPage(i);
        return this;
    }

    public Query query(String s)
    {
        setQuery(s);
        return this;
    }

    public Query resultType(String s)
    {
        setResultType(s);
        return this;
    }

    public Query rpp(int i)
    {
        setRpp(i);
        return this;
    }

    public void setGeoCode(GeoLocation geolocation, double d, String s)
    {
        geocode = geolocation.getLatitude() + "," + geolocation.getLongitude() + "," + d + s;
    }

    public void setLang(String s)
    {
        lang = s;
    }

    public void setLocale(String s)
    {
        locale = s;
    }

    public void setMaxId(long l)
    {
        maxId = l;
    }

    public void setPage(int i)
    {
        page = i;
    }

    public void setQuery(String s)
    {
        query = s;
    }

    public void setResultType(String s)
    {
        resultType = s;
    }

    public void setRpp(int i)
    {
        rpp = i;
    }

    public void setSince(String s)
    {
        since = s;
    }

    public void setSinceId(long l)
    {
        sinceId = l;
    }

    public void setUntil(String s)
    {
        until = s;
    }

    public Query since(String s)
    {
        setSince(s);
        return this;
    }

    public Query sinceId(long l)
    {
        setSinceId(l);
        return this;
    }

    public String toString()
    {
        return "Query{query='" + query + '\'' + ", lang='" + lang + '\'' + ", locale='" + locale + '\'' + ", maxId=" + maxId + ", rpp=" + rpp + ", page=" + page + ", since='" + since + '\'' + ", sinceId=" + sinceId + ", geocode='" + geocode + '\'' + ", until='" + until + '\'' + ", resultType='" + resultType + '\'' + '}';
    }

    public Query until(String s)
    {
        setUntil(s);
        return this;
    }

}
