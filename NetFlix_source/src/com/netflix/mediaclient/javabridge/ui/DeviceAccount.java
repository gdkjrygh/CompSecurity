// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui;

import com.netflix.mediaclient.util.JsonUtils;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class DeviceAccount
{

    private String accountKey;
    private String languages[];
    private long lastAccessTime;
    private String netflixId;
    private boolean registered;
    private String secureId;

    public DeviceAccount(JSONObject jsonobject)
        throws JSONException
    {
        accountKey = JsonUtils.getString(jsonobject, "accountKey", null);
        registered = JsonUtils.getBoolean(jsonobject, "registered", false);
        lastAccessTime = JsonUtils.getLong(jsonobject, "lastAccessTime", 0L);
        if (jsonobject.has("tokens"))
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject("tokens");
            if (jsonobject1 != null)
            {
                netflixId = JsonUtils.getString(jsonobject1, "NetflixId", "");
                secureId = JsonUtils.getString(jsonobject1, "SecureNetflixId", "");
            }
        }
        if (jsonobject.has("UILanguages"))
        {
            jsonobject = jsonobject.getJSONArray("UILanguages");
            if (jsonobject != null)
            {
                languages = new String[jsonobject.length()];
                for (int i = 0; i < jsonobject.length(); i++)
                {
                    languages[i] = jsonobject.getString(i);
                }

            }
        }
    }

    public String getAccountKey()
    {
        return accountKey;
    }

    public String[] getLanguages()
    {
        return languages;
    }

    public long getLastAccessTime()
    {
        return lastAccessTime;
    }

    public String getNetflixId()
    {
        return netflixId;
    }

    public String getSecureId()
    {
        return secureId;
    }

    public boolean isRegistered()
    {
        return registered;
    }

    public void setLanguages(String as[])
    {
        languages = as;
    }

    public void setLastAccessTime(long l)
    {
        lastAccessTime = l;
    }

    public void setNetflixId(String s)
    {
        netflixId = s;
    }

    public void setRegistered(boolean flag)
    {
        registered = flag;
    }

    public void setSecureId(String s)
    {
        secureId = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("DeviceAccount [accountKey=").append(accountKey).append(", netflixId=").append(netflixId).append(", secureId=").append(secureId).append(", lastAccessTime=").append(lastAccessTime).append(", languages=").append(Arrays.toString(languages)).append(", registered=").append(registered).append("]").toString();
    }
}
