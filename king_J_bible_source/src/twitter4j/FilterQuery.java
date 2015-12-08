// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import twitter4j.internal.http.HttpParameter;
import twitter4j.internal.util.z_T4JInternalStringUtil;

public final class FilterQuery
    implements Serializable
{

    private static final long serialVersionUID = 0x5fb19dc48ce2331L;
    private int count;
    private long follow[];
    private boolean includeEntities;
    private double locations[][];
    private String track[];

    public FilterQuery()
    {
        count = 0;
        follow = null;
        track = null;
        locations = (double[][])null;
    }

    public FilterQuery(int i, long al[])
    {
        this();
        count = i;
        follow = al;
    }

    public FilterQuery(int i, long al[], String as[])
    {
        this();
        count = i;
        follow = al;
        track = as;
    }

    public FilterQuery(int i, long al[], String as[], double ad[][])
    {
        count = i;
        follow = al;
        track = as;
        locations = ad;
    }

    public FilterQuery(long al[])
    {
        this();
        count = 0;
        follow = al;
    }

    private String toLocationsString(double ad[][])
    {
        StringBuffer stringbuffer = new StringBuffer(ad.length * 20 * 2);
        int j = ad.length;
        for (int i = 0; i < j; i++)
        {
            double ad1[] = ad[i];
            if (stringbuffer.length() != 0)
            {
                stringbuffer.append(",");
            }
            stringbuffer.append(ad1[0]);
            stringbuffer.append(",");
            stringbuffer.append(ad1[1]);
        }

        return stringbuffer.toString();
    }

    HttpParameter[] asHttpParameterArray()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new HttpParameter("count", count));
        if (follow != null && follow.length > 0)
        {
            arraylist.add(new HttpParameter("follow", z_T4JInternalStringUtil.join(follow)));
        }
        if (track != null && track.length > 0)
        {
            arraylist.add(new HttpParameter("track", z_T4JInternalStringUtil.join(track)));
        }
        if (locations != null && locations.length > 0)
        {
            arraylist.add(new HttpParameter("locations", toLocationsString(locations)));
        }
        if (includeEntities)
        {
            arraylist.add(new HttpParameter("include_entities", true));
        }
        return (HttpParameter[])arraylist.toArray(new HttpParameter[arraylist.size()]);
    }

    public FilterQuery count(int i)
    {
        count = i;
        return this;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (FilterQuery)obj;
            if (count != ((FilterQuery) (obj)).count)
            {
                return false;
            }
            if (!Arrays.equals(follow, ((FilterQuery) (obj)).follow))
            {
                return false;
            }
            if (!Arrays.equals(track, ((FilterQuery) (obj)).track))
            {
                return false;
            }
        }
        return true;
    }

    public FilterQuery follow(long al[])
    {
        follow = al;
        return this;
    }

    public int hashCode()
    {
        int j = 0;
        int k = count;
        int i;
        if (follow != null)
        {
            i = Arrays.hashCode(follow);
        } else
        {
            i = 0;
        }
        if (track != null)
        {
            j = Arrays.hashCode(track);
        }
        return (k * 31 + i) * 31 + j;
    }

    public FilterQuery locations(double ad[][])
    {
        locations = ad;
        return this;
    }

    public FilterQuery setIncludeEntities(boolean flag)
    {
        includeEntities = flag;
        return this;
    }

    public String toString()
    {
        Object obj = null;
        StringBuffer stringbuffer = (new StringBuffer()).append("FilterQuery{count=").append(count).append(", follow=").append(Arrays.toString(follow)).append(", track=");
        java.util.List list;
        if (track == null)
        {
            list = null;
        } else
        {
            list = Arrays.asList(track);
        }
        stringbuffer = stringbuffer.append(list).append(", locations=");
        if (locations == null)
        {
            list = obj;
        } else
        {
            list = Arrays.asList(locations);
        }
        return stringbuffer.append(list).append(", includeEntities=").append(includeEntities).append('}').toString();
    }

    public FilterQuery track(String as[])
    {
        track = as;
        return this;
    }
}
