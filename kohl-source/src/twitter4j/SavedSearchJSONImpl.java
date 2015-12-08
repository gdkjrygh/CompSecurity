// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.util.Date;
import twitter4j.conf.Configuration;

// Referenced classes of package twitter4j:
//            TwitterResponseImpl, SavedSearch, TwitterException, TwitterObjectFactory, 
//            HttpResponse, JSONException, ResponseListImpl, JSONArray, 
//            ResponseList, ParseUtil, JSONObject

final class SavedSearchJSONImpl extends TwitterResponseImpl
    implements SavedSearch
{

    private static final long serialVersionUID = 0xbbde721c5f0f36aL;
    private Date createdAt;
    private int id;
    private String name;
    private int position;
    private String query;

    SavedSearchJSONImpl(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        super(httpresponse);
        if (configuration.isJSONStoreEnabled())
        {
            TwitterObjectFactory.clearThreadLocalMap();
        }
        httpresponse = httpresponse.asJSONObject();
        init(httpresponse);
        if (configuration.isJSONStoreEnabled())
        {
            TwitterObjectFactory.registerJSONObject(this, httpresponse);
        }
    }

    SavedSearchJSONImpl(JSONObject jsonobject)
        throws TwitterException
    {
        init(jsonobject);
    }

    static ResponseList createSavedSearchList(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        int i;
        if (configuration.isJSONStoreEnabled())
        {
            TwitterObjectFactory.clearThreadLocalMap();
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
                TwitterObjectFactory.registerJSONObject(savedsearchjsonimpl, jsonobject);
            }
            break MISSING_BLOCK_LABEL_146;
        }
        if (configuration.isJSONStoreEnabled())
        {
            TwitterObjectFactory.registerJSONObject(responselistimpl, jsonarray);
        }
        return responselistimpl;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void init(JSONObject jsonobject)
        throws TwitterException
    {
        createdAt = ParseUtil.getDate("created_at", jsonobject, "EEE MMM dd HH:mm:ss z yyyy");
        query = ParseUtil.getUnescapedString("query", jsonobject);
        position = ParseUtil.getInt("position", jsonobject);
        name = ParseUtil.getUnescapedString("name", jsonobject);
        id = ParseUtil.getInt("id", jsonobject);
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((SavedSearch)obj);
    }

    public int compareTo(SavedSearch savedsearch)
    {
        return id - savedsearch.getId();
    }

    public boolean equals(Object obj)
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

    public Date getCreatedAt()
    {
        return createdAt;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getPosition()
    {
        return position;
    }

    public String getQuery()
    {
        return query;
    }

    public int hashCode()
    {
        return (((createdAt.hashCode() * 31 + query.hashCode()) * 31 + position) * 31 + name.hashCode()) * 31 + id;
    }

    public String toString()
    {
        return (new StringBuilder()).append("SavedSearchJSONImpl{createdAt=").append(createdAt).append(", query='").append(query).append('\'').append(", position=").append(position).append(", name='").append(name).append('\'').append(", id=").append(id).append('}').toString();
    }
}
