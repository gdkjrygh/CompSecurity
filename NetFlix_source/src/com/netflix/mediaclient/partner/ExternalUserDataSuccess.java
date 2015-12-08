// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.partner;

import android.content.ComponentName;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.partner:
//            BaseResponse

public class ExternalUserDataSuccess extends BaseResponse
{

    protected static final String RESULT_data = "data";
    protected JSONObject data;
    protected String userId;

    public ExternalUserDataSuccess(String s, String s1, String s2, JSONObject jsonobject, ComponentName componentname)
    {
        super(s, s1, componentname);
        userId = s2;
        data = jsonobject;
    }

    public JSONObject getData()
    {
        return data;
    }

    public String getUserId()
    {
        return userId;
    }

    public JSONObject toJson()
        throws JSONException
    {
        JSONObject jsonobject = getJson();
        jsonobject.put("status", 0);
        jsonobject.put("data", data);
        jsonobject.put("userid", userId);
        return jsonobject;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ExternalUserDataSuccess [userId=").append(userId).append(", data=").append(data).append(", service=").append(service).append(", id=").append(id).append("]").toString();
    }
}
