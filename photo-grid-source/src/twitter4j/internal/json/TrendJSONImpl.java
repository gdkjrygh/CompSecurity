// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.io.Serializable;
import twitter4j.Trend;
import twitter4j.internal.org.json.JSONObject;

// Referenced classes of package twitter4j.internal.json:
//            z_T4JInternalParseUtil, DataObjectFactoryUtil

final class TrendJSONImpl
    implements Serializable, Trend
{

    private static final long serialVersionUID = 0x1aba5f6b262a250aL;
    private String name;
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
        name = z_T4JInternalParseUtil.getRawString("name", jsonobject);
        url = z_T4JInternalParseUtil.getRawString("url", jsonobject);
        query = z_T4JInternalParseUtil.getRawString("query", jsonobject);
        if (flag)
        {
            DataObjectFactoryUtil.registerJSONObject(this, jsonobject);
        }
    }

    public final boolean equals(Object obj)
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

    public final String getName()
    {
        return name;
    }

    public final String getQuery()
    {
        return query;
    }

    public final String getURL()
    {
        return url;
    }

    public final String getUrl()
    {
        return getURL();
    }

    public final int hashCode()
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

    public final String toString()
    {
        return (new StringBuilder("TrendJSONImpl{name='")).append(name).append('\'').append(", url='").append(url).append('\'').append(", query='").append(query).append('\'').append('}').toString();
    }
}
