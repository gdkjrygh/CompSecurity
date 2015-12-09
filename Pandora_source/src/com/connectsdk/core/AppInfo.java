// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.core;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.connectsdk.core:
//            JSONSerializable

public class AppInfo
    implements JSONSerializable
{

    String id;
    String name;
    JSONObject raw;

    public AppInfo()
    {
    }

    public AppInfo(String s)
    {
        id = s;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof AppInfo)
        {
            obj = (AppInfo)obj;
            return id.equals(((AppInfo) (obj)).id);
        } else
        {
            return super.equals(obj);
        }
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public JSONObject getRawData()
    {
        return raw;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setName(String s)
    {
        name = s.trim();
    }

    public void setRawData(JSONObject jsonobject)
    {
        raw = jsonobject;
    }

    public JSONObject toJSONObject()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("name", name);
        jsonobject.put("id", id);
        return jsonobject;
    }
}
