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

public final class GeoQuery
    implements Serializable
{

    public static final String CITY = "city";
    public static final String NEIGHBORHOOD = "neighborhood";
    private static final long serialVersionUID = 0xcdda7bca2db6d4aL;
    private String accuracy;
    private String granularity;
    private String ip;
    private GeoLocation location;
    private int maxResults;

    public GeoQuery(String s)
    {
        ip = s;
        location = null;
    }

    public GeoQuery(GeoLocation geolocation)
    {
        location = geolocation;
        ip = null;
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
        return (((i * 31 + j) * 31 + k) * 31 + l) * 31 + maxResults;
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

    public String toString()
    {
        return "GeoQuery{location=" + location + ", ip='" + ip + '\'' + ", accuracy='" + accuracy + '\'' + ", granularity='" + granularity + '\'' + ", maxResults=" + maxResults + '}';
    }
}
