// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package twitter4j:
//            HttpParameter, GeoLocation

public final class GeoQuery
    implements Serializable
{

    private static final long serialVersionUID = 0x4b6b3bfe5bd50d7aL;
    private String accuracy;
    private String granularity;
    private String ip;
    private GeoLocation location;
    private int maxResults;
    private String query;

    public GeoQuery(String s)
    {
        query = null;
        ip = null;
        accuracy = null;
        granularity = null;
        maxResults = -1;
        ip = s;
    }

    public GeoQuery(GeoLocation geolocation)
    {
        query = null;
        ip = null;
        accuracy = null;
        granularity = null;
        maxResults = -1;
        location = geolocation;
    }

    private void appendParameter(String s, double d, List list)
    {
        list.add(new HttpParameter(s, String.valueOf(d)));
    }

    private void appendParameter(String s, int i, List list)
    {
        if (i > 0)
        {
            list.add(new HttpParameter(s, String.valueOf(i)));
        }
    }

    private void appendParameter(String s, String s1, List list)
    {
        if (s1 != null)
        {
            list.add(new HttpParameter(s, s1));
        }
    }

    public GeoQuery accuracy(String s)
    {
        setAccuracy(s);
        return this;
    }

    HttpParameter[] asHttpParameterArray()
    {
        ArrayList arraylist = new ArrayList();
        if (location != null)
        {
            appendParameter("lat", location.getLatitude(), arraylist);
            appendParameter("long", location.getLongitude(), arraylist);
        }
        if (ip != null)
        {
            appendParameter("ip", ip, arraylist);
        }
        appendParameter("accuracy", accuracy, arraylist);
        appendParameter("query", query, arraylist);
        appendParameter("granularity", granularity, arraylist);
        appendParameter("max_results", maxResults, arraylist);
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
            obj = (GeoQuery)obj;
            if (maxResults != ((GeoQuery) (obj)).maxResults)
            {
                return false;
            }
            if (accuracy == null ? ((GeoQuery) (obj)).accuracy != null : !accuracy.equals(((GeoQuery) (obj)).accuracy))
            {
                return false;
            }
            if (granularity == null ? ((GeoQuery) (obj)).granularity != null : !granularity.equals(((GeoQuery) (obj)).granularity))
            {
                return false;
            }
            if (ip == null ? ((GeoQuery) (obj)).ip != null : !ip.equals(((GeoQuery) (obj)).ip))
            {
                return false;
            }
            if (location == null ? ((GeoQuery) (obj)).location != null : !location.equals(((GeoQuery) (obj)).location))
            {
                return false;
            }
        }
        return true;
    }

    public String getAccuracy()
    {
        return accuracy;
    }

    public String getGranularity()
    {
        return granularity;
    }

    public String getIp()
    {
        return ip;
    }

    public GeoLocation getLocation()
    {
        return location;
    }

    public int getMaxResults()
    {
        return maxResults;
    }

    public String getQuery()
    {
        return query;
    }

    public GeoQuery granularity(String s)
    {
        setGranularity(s);
        return this;
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (location != null)
        {
            i = location.hashCode();
        } else
        {
            i = 0;
        }
        if (ip != null)
        {
            j = ip.hashCode();
        } else
        {
            j = 0;
        }
        if (accuracy != null)
        {
            k = accuracy.hashCode();
        } else
        {
            k = 0;
        }
        if (granularity != null)
        {
            l = granularity.hashCode();
        }
        return ((k + (j + i * 31) * 31) * 31 + l) * 31 + maxResults;
    }

    public GeoQuery maxResults(int i)
    {
        setMaxResults(i);
        return this;
    }

    public void setAccuracy(String s)
    {
        accuracy = s;
    }

    public void setGranularity(String s)
    {
        granularity = s;
    }

    public void setMaxResults(int i)
    {
        maxResults = i;
    }

    public void setQuery(String s)
    {
        query = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("GeoQuery{location=").append(location).append(", query='").append(query).append('\'').append(", ip='").append(ip).append('\'').append(", accuracy='").append(accuracy).append('\'').append(", granularity='").append(granularity).append('\'').append(", maxResults=").append(maxResults).append('}').toString();
    }
}
