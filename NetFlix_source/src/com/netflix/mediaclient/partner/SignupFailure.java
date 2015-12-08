// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.partner;

import android.content.ComponentName;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.partner:
//            BaseResponse

public class SignupFailure extends BaseResponse
{

    protected String errcode;
    protected String msg;
    protected String userId;

    public SignupFailure(String s, String s1, String s2, String s3, String s4, ComponentName componentname)
    {
        super(s, s1, componentname);
        errcode = s3;
        msg = s4;
        userId = s2;
    }

    public String getErrcode()
    {
        return errcode;
    }

    public String getMsg()
    {
        return msg;
    }

    public String getUserId()
    {
        return userId;
    }

    public JSONObject toJson()
        throws JSONException
    {
        JSONObject jsonobject = getJson();
        jsonobject.put("status", 1);
        jsonobject.put("userid", userId);
        jsonobject.put("errcode", errcode);
        jsonobject.put("msg", msg);
        return jsonobject;
    }

    public String toString()
    {
        return (new StringBuilder()).append("SignupFailure [userId=").append(userId).append(", errcode=").append(errcode).append(", msg=").append(msg).append(", service=").append(service).append(", id=").append(id).append("]").toString();
    }
}
