// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.util.Date;
import twitter4j.ResponseList;
import twitter4j.SavedSearch;
import twitter4j.TwitterException;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.org.json.JSONArray;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

// Referenced classes of package twitter4j.internal.json:
//            TwitterResponseImpl, DataObjectFactoryUtil, ResponseListImpl, z_T4JInternalParseUtil

final class SavedSearchJSONImpl extends TwitterResponseImpl
    implements SavedSearch
{

    private static final long serialVersionUID = 0x2acbedd301ef9884L;
    private Date createdAt;
    private int id;
    private String name;
    private int position;
    private String query;

    SavedSearchJSONImpl(HttpResponse httpresponse, Configuration configuration)
    {
        super(httpresponse);
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.clearThreadLocalMap();
        }
        httpresponse = httpresponse.asJSONObject();
        init(httpresponse);
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.registerJSONObject(this, httpresponse);
        }
    }

    SavedSearchJSONImpl(JSONObject jsonobject)
    {
        init(jsonobject);
    }

    static ResponseList createSavedSearchList(HttpResponse httpresponse, Configuration configuration)
    {
        int i;
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.clearThreadLocalMap();
        }
        JSONArray jsonarray = httpresponse.asJSONArray();
        ResponseListImpl responselistimpl;
        JSONObject jsonobject;
        SavedSearchJSONImpl savedsearchjsonimpl;
        try
        {
            responselistimpl = new ResponseListImpl(jsonarray.length(), httpresponse);
        }
        // Misplaced declaration of an exception variable
        catch (Configuration configuration)
        {
            throw new TwitterException((new StringBuilder()).append(configuration.getMessage()).append(":").append(httpresponse.asString()).toString(), configuration);
        }
        i = 0;
_L2:
        if (i < jsonarray.length())
        {
            jsonobject = jsonarray.getJSONObject(i);
            savedsearchjsonimpl = new SavedSearchJSONImpl(jsonobject);
            responselistimpl.add(savedsearchjsonimpl);
            if (configuration.isJSONStoreEnabled())
            {
                DataObjectFactoryUtil.registerJSONObject(savedsearchjsonimpl, jsonobject);
            }
            break MISSING_BLOCK_LABEL_146;
        }
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.registerJSONObject(responselistimpl, jsonarray);
        }
        return responselistimpl;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void init(JSONObject jsonobject)
    {
        createdAt = z_T4JInternalParseUtil.getDate("created_at", jsonobject, "EEE MMM dd HH:mm:ss z yyyy");
        query = z_T4JInternalParseUtil.getUnescapedString("query", jsonobject);
        position = z_T4JInternalParseUtil.getInt("position", jsonobject);
        name = z_T4JInternalParseUtil.getUnescapedString("name", jsonobject);
        id = z_T4JInternalParseUtil.getInt("id", jsonobject);
    }

    public final volatile int compareTo(Object obj)
    {
        return compareTo((SavedSearch)obj);
    }

    public final int compareTo(SavedSearch savedsearch)
    {
        return id - savedsearch.getId();
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof SavedSearch))
            {
                return false;
            }
            obj = (SavedSearch)obj;
            if (id != ((SavedSearch) (obj)).getId())
            {
                return false;
            }
        }
        return true;
    }

    public final Date getCreatedAt()
    {
        return createdAt;
    }

    public final int getId()
    {
        return id;
    }

    public final String getName()
    {
        return name;
    }

    public final int getPosition()
    {
        return position;
    }

    public final String getQuery()
    {
        return query;
    }

    public final int hashCode()
    {
        return (((createdAt.hashCode() * 31 + query.hashCode()) * 31 + position) * 31 + name.hashCode()) * 31 + id;
    }

    public final String toString()
    {
        return (new StringBuilder("SavedSearchJSONImpl{createdAt=")).append(createdAt).append(", query='").append(query).append('\'').append(", position=").append(position).append(", name='").append(name).append('\'').append(", id=").append(id).append('}').toString();
    }
}
