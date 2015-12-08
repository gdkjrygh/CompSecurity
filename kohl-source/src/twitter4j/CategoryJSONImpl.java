// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;
import twitter4j.conf.Configuration;

// Referenced classes of package twitter4j:
//            Category, JSONException, TwitterException, HttpResponse, 
//            TwitterObjectFactory, ResponseListImpl, JSONArray, ResponseList, 
//            JSONObject, ParseUtil

final class CategoryJSONImpl
    implements Category, Serializable
{

    private static final long serialVersionUID = 0x34e495cc033cddf4L;
    private String name;
    private int size;
    private String slug;

    CategoryJSONImpl(JSONObject jsonobject)
        throws JSONException
    {
        init(jsonobject);
    }

    static ResponseList createCategoriesList(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        return createCategoriesList(httpresponse.asJSONArray(), httpresponse, configuration);
    }

    static ResponseList createCategoriesList(JSONArray jsonarray, HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        int i;
        JSONObject jsonobject;
        CategoryJSONImpl categoryjsonimpl;
        try
        {
            if (configuration.isJSONStoreEnabled())
            {
                TwitterObjectFactory.clearThreadLocalMap();
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
                TwitterObjectFactory.registerJSONObject(categoryjsonimpl, jsonobject);
            }
            break MISSING_BLOCK_LABEL_109;
        }
        if (configuration.isJSONStoreEnabled())
        {
            TwitterObjectFactory.registerJSONObject(httpresponse, jsonarray);
        }
        return httpresponse;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean equals(Object obj)
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

    public String getName()
    {
        return name;
    }

    public int getSize()
    {
        return size;
    }

    public String getSlug()
    {
        return slug;
    }

    public int hashCode()
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

    void init(JSONObject jsonobject)
        throws JSONException
    {
        name = jsonobject.getString("name");
        slug = jsonobject.getString("slug");
        size = ParseUtil.getInt("size", jsonobject);
    }

    public String toString()
    {
        return (new StringBuilder()).append("CategoryJSONImpl{name='").append(name).append('\'').append(", slug='").append(slug).append('\'').append(", size=").append(size).append('}').toString();
    }
}
