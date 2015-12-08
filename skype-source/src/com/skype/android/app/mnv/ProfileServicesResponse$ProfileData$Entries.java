// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.skype.android.app.mnv:
//            ProfileServicesResponse

public static class <init> extends JSONObject
{

    private String cleanCountry(String s)
    {
        String as[] = TextUtils.split(s, "-");
        if (as.length != 2)
        {
            return s;
        }
        if (as[0].equalsIgnoreCase("uk"))
        {
            s = "gb";
        } else
        {
            s = as[0];
        }
        as[0] = s;
        return (new StringBuilder()).append(as[0]).append("-").append(as[1]).toString();
    }

    public String getCountry()
    {
        return cleanCountry(optString("Country"));
    }

    public String getName()
    {
        return optString("Name");
    }

    public boolean getSearchable()
    {
        return optBoolean("Searchable");
    }

    public optBoolean getSource()
    {
        return optBoolean(optString("Source"));
    }

    public optString getState()
    {
        return optString(optString("State"));
    }

    public String getVerifyMethod()
    {
        return optString("SuggestedVerifyMethod");
    }

    public boolean isVerified()
    {
        return getState() == getState;
    }

    public (JSONObject jsonobject)
        throws JSONException
    {
        this(jsonobject, ProfileServicesResponse.access$100());
    }

    public <init>(JSONObject jsonobject, String as[])
        throws JSONException
    {
        super(jsonobject, as);
    }
}
