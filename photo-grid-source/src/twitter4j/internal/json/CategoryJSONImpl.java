// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.io.Serializable;
import twitter4j.Category;
import twitter4j.ResponseList;
import twitter4j.TwitterException;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.org.json.JSONArray;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

// Referenced classes of package twitter4j.internal.json:
//            DataObjectFactoryUtil, ResponseListImpl, z_T4JInternalParseUtil

final class CategoryJSONImpl
    implements Serializable, Category
{

    private static final long serialVersionUID = 0xa2f7f72df154090aL;
    private String name;
    private int size;
    private String slug;

    CategoryJSONImpl(JSONObject jsonobject)
    {
        init(jsonobject);
    }

    static ResponseList createCategoriesList(HttpResponse httpresponse, Configuration configuration)
    {
        return createCategoriesList(httpresponse.asJSONArray(), httpresponse, configuration);
    }

    static ResponseList createCategoriesList(JSONArray jsonarray, HttpResponse httpresponse, Configuration configuration)
    {
        int i;
        JSONObject jsonobject;
        CategoryJSONImpl categoryjsonimpl;
        try
        {
            if (configuration.isJSONStoreEnabled())
            {
                DataObjectFactoryUtil.clearThreadLocalMap();
            }
            httpresponse = new ResponseListImpl(jsonarray.length(), httpresponse);
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            throw new TwitterException(jsonarray);
        }
        i = 0;
_L2:
        if (i < jsonarray.length())
        {
            jsonobject = jsonarray.getJSONObject(i);
            categoryjsonimpl = new CategoryJSONImpl(jsonobject);
            httpresponse.add(categoryjsonimpl);
            if (configuration.isJSONStoreEnabled())
            {
                DataObjectFactoryUtil.registerJSONObject(categoryjsonimpl, jsonobject);
            }
            break MISSING_BLOCK_LABEL_109;
        }
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.registerJSONObject(httpresponse, jsonarray);
        }
        return httpresponse;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (CategoryJSONImpl)obj;
            if (size != ((CategoryJSONImpl) (obj)).size)
            {
                return false;
            }
            if (name == null ? ((CategoryJSONImpl) (obj)).name != null : !name.equals(((CategoryJSONImpl) (obj)).name))
            {
                return false;
            }
            if (slug == null ? ((CategoryJSONImpl) (obj)).slug != null : !slug.equals(((CategoryJSONImpl) (obj)).slug))
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

    public final int getSize()
    {
        return size;
    }

    public final String getSlug()
    {
        return slug;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (name != null)
        {
            i = name.hashCode();
        } else
        {
            i = 0;
        }
        if (slug != null)
        {
            j = slug.hashCode();
        }
        return (i * 31 + j) * 31 + size;
    }

    final void init(JSONObject jsonobject)
    {
        name = jsonobject.getString("name");
        slug = jsonobject.getString("slug");
        size = z_T4JInternalParseUtil.getInt("size", jsonobject);
    }

    public final String toString()
    {
        return (new StringBuilder("CategoryJSONImpl{name='")).append(name).append('\'').append(", slug='").append(slug).append('\'').append(", size=").append(size).append('}').toString();
    }
}
