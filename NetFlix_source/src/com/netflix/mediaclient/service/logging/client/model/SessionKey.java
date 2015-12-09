// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.client.model;

import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.logging.client.model:
//            DeviceUniqueId

public class SessionKey
{

    public static final String SESSION_CATEGORY = "category";
    public static final String SESSION_ID = "sessionId";
    public static final String SESSION_NAME = "sessionName";
    private String category;
    private DeviceUniqueId id;
    private String name;

    public SessionKey()
    {
    }

    public SessionKey(DeviceUniqueId deviceuniqueid, String s, String s1)
    {
        id = deviceuniqueid;
        category = s;
        name = s1;
    }

    public static SessionKey createInstance(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject == null)
        {
            return null;
        }
        SessionKey sessionkey = new SessionKey();
        long l = JsonUtils.getLong(jsonobject, "sessionId", -1L);
        if (l > 0L)
        {
            sessionkey.id = new DeviceUniqueId(l);
        }
        sessionkey.category = JsonUtils.getString(jsonobject, "category", null);
        sessionkey.name = JsonUtils.getString(jsonobject, "sessionName", null);
        return sessionkey;
    }

    public String getCategory()
    {
        return category;
    }

    public DeviceUniqueId getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public JSONArray toJSONArray()
        throws JSONException
    {
        JSONArray jsonarray = new JSONArray();
        if (id != null)
        {
            jsonarray.put((new StringBuilder()).append("").append(id.getValue()).toString());
        }
        if (category != null)
        {
            jsonarray.put(category);
        }
        if (name != null)
        {
            jsonarray.put(name);
        }
        return jsonarray;
    }

    public JSONObject toJSONObject()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        if (id != null)
        {
            jsonobject.put("sessionId", (new StringBuilder()).append("").append(id.getValue()).toString());
        }
        if (category != null)
        {
            jsonobject.put("category", category);
        }
        if (name != null)
        {
            jsonobject.put("sessionName", name);
        }
        return jsonobject;
    }

    public String toString()
    {
        return (new StringBuilder()).append("SessionKey [id=").append(id).append(", category=").append(category).append(", name=").append(name).append("]").toString();
    }
}
