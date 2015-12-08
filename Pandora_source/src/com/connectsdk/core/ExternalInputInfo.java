// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.core;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.connectsdk.core:
//            JSONSerializable

public class ExternalInputInfo
    implements JSONSerializable
{

    boolean connected;
    String iconURL;
    String id;
    String name;
    JSONObject rawData;

    public ExternalInputInfo()
    {
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof ExternalInputInfo)
        {
            obj = (ExternalInputInfo)obj;
            flag = flag1;
            if (id.equals(((ExternalInputInfo) (obj)).id))
            {
                flag = flag1;
                if (name.equals(((ExternalInputInfo) (obj)).name))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public String getIconURL()
    {
        return iconURL;
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
        return rawData;
    }

    public boolean isConnected()
    {
        return connected;
    }

    public void setConnected(boolean flag)
    {
        connected = flag;
    }

    public void setIconURL(String s)
    {
        iconURL = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setRawData(JSONObject jsonobject)
    {
        rawData = jsonobject;
    }

    public JSONObject toJSONObject()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("id", id);
        jsonobject.put("name", name);
        jsonobject.put("connected", connected);
        jsonobject.put("icon", iconURL);
        jsonobject.put("rawData", rawData);
        return jsonobject;
    }
}
