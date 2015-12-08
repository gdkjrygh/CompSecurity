// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.partner;

import android.content.ComponentName;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.partner:
//            BaseResponse

public class ExternalUserConfirmationSuccess extends BaseResponse
{

    protected static final String RESULT_confirmed = "confirmed";
    protected boolean confirmed;
    protected JSONObject token;
    protected String userId;

    public ExternalUserConfirmationSuccess(String s, String s1, String s2, boolean flag, JSONObject jsonobject, ComponentName componentname)
    {
        super(s, s1, componentname);
        userId = s2;
        confirmed = flag;
        token = jsonobject;
    }

    public JSONObject getToken()
    {
        return token;
    }

    public String getUserId()
    {
        return userId;
    }

    public boolean isConfirmed()
    {
        return confirmed;
    }

    public JSONObject toJson()
        throws JSONException
    {
        JSONObject jsonobject = getJson();
        jsonobject.put("status", 0);
        jsonobject.put("confirmed", confirmed);
        jsonobject.put("userid", userId);
        jsonobject.put("token", token);
        return jsonobject;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ExternalUserConfirmationSuccess [userId=").append(userId).append(", confirmed=").append(confirmed).append(", token=").append(token).append(", service=").append(service).append(", id=").append(id).append("]").toString();
    }
}
