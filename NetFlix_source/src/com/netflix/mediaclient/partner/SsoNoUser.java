// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.partner;

import android.content.ComponentName;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.partner:
//            BaseResponse

public class SsoNoUser extends BaseResponse
{

    public SsoNoUser(String s, String s1, ComponentName componentname)
    {
        super(s, s1, componentname);
    }

    public JSONObject toJson()
        throws JSONException
    {
        JSONObject jsonobject = getJson();
        jsonobject.put("status", 2);
        return jsonobject;
    }

    public String toString()
    {
        return (new StringBuilder()).append("SsoNoUser [service=").append(service).append(", id=").append(id).append("]").toString();
    }
}
