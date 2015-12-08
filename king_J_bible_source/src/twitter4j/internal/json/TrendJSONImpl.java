// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.io.Serializable;
import org.json.JSONObject;
import twitter4j.Trend;
import twitter4j.internal.util.z_T4JInternalParseUtil;

// Referenced classes of package twitter4j.internal.json:
//            DataObjectFactoryUtil

final class TrendJSONImpl
    implements Trend, Serializable
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
            if (url == null ? ((Trend) (obj)).getUrl() != null : !url.equals(((Trend) (obj)).getUrl()))
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

    public String getUrl()
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
        return (k * 31 + i) * 31 + j;
    }

    public String toString()
    {
        return "TrendJSONImpl{name='" + name + '\'' + ", url='" + url + '\'' + ", query='" + query + '\'' + '}';
    }
}
