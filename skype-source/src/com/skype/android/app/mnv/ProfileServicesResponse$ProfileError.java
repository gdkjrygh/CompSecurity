// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.skype.android.app.mnv:
//            e, ProfileServicesResponse

public static class <init> extends JSONObject
    implements e
{

    public String getCode()
    {
        return optString("Code");
    }

    public int getHttpResult()
    {
        return optInt("HttpResult");
    }

    public String getSubCode()
    {
        return optString("SubCode");
    }

    public boolean isQosAlert()
    {
        return false;
    }

    public boolean isSuccess()
    {
        return false;
    }

    public void setQosAlert(boolean flag)
    {
    }

    public (JSONObject jsonobject)
        throws JSONException
    {
        this(jsonobject, ProfileServicesResponse.access$000());
    }

    public <init>(JSONObject jsonobject, String as[])
        throws JSONException
    {
        super(jsonobject, as);
    }
}
