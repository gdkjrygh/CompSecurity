// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;

// Referenced classes of package twitter4j:
//            Trend, ParseUtil, TwitterObjectFactory, JSONObject

final class TrendJSONImpl
    implements Serializable, Trend
{

    private static final long serialVersionUID = 0xc3958569a0f0ca14L;
    private final String name;
    private String query;
    private String url;

    TrendJSONImpl(JSONObject jsonobject)
    {
        this(jsonobject, false);
    }

    TrendJSONImpl(JSONObject jsonobject, boolean flag)
    {
        url = null;
        query = null;
        name = ParseUtil.getRawString("name", jsonobject);
        url = ParseUtil.getRawString("url", jsonobject);
        query = ParseUtil.getRawString("query", jsonobject);
        if (flag)
        {
            TwitterObjectFactory.registerJSONObject(this, jsonobject);
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof Trend))
            {
                return false;
            }
            obj = (Trend)obj;
            if (!name.equals(((Trend) (obj)).getName()))
            {
                return false;
            }
            if (query == null ? ((Trend) (obj)).getQuery() != null : !query.equals(((Trend) (obj)).getQuery()))
            {
                return false;
            }
            if (url == null ? ((Trend) (obj)).getURL() != null : !url.equals(((Trend) (obj)).getURL()))
            {
                return false;
            }
        }
        return true;
    }

    public String getName()
    {
        return name;
    }

    public String getQuery()
    {
        return query;
    }

    public String getURL()
    {
        return url;
    }

    public int hashCode()
    {
        int j = 0;
        int k = name.hashCode();
        int i;
        if (url != null)
        {
            i = url.hashCode();
        } else
        {
            i = 0;
        }
        if (query != null)
        {
            j = query.hashCode();
        }
        return (i + k * 31) * 31 + j;
    }

    public String toString()
    {
        return (new StringBuilder()).append("TrendJSONImpl{name='").append(name).append('\'').append(", url='").append(url).append('\'').append(", query='").append(query).append('\'').append('}').toString();
    }
}
