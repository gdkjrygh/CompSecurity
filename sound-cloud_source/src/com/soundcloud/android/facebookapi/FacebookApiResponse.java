// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.facebookapi;

import com.facebook.D;
import org.json.JSONObject;

class FacebookApiResponse
{

    private boolean isError;
    private JSONObject jsonObject;

    FacebookApiResponse(D d)
    {
        boolean flag;
        if (d.b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isError = flag;
        jsonObject = d.a;
    }

    FacebookApiResponse(JSONObject jsonobject)
    {
        jsonObject = jsonobject;
    }

    FacebookApiResponse(boolean flag)
    {
        isError = flag;
    }

    JSONObject getJSONObject()
    {
        return jsonObject;
    }

    boolean isSuccess()
    {
        return !isError;
    }
}
