// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.partner;

import android.content.ComponentName;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.partner:
//            BaseResponse

public class SsoSuccess extends BaseResponse
{

    protected JSONObject token;
    protected String userId;

    public SsoSuccess(String s, String s1, String s2, JSONObject jsonobject, ComponentName componentname)
    {
        super(s, s1, componentname);
        token = jsonobject;
        userId = s2;
    }

    public JSONObject getToken()
    {
        return token;
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
        jsonobject.put("userid", noNull(userId));
        jsonobject.put("token", token);
        return jsonobject;
    }

    public String toString()
    {
        return (new StringBuilder()).append("SsoSuccess [service=").append(service).append(", userId=").append(userId).append(", token=").append(token).append(", idx").append(id).append("]").toString();
    }
}
