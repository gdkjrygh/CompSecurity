// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.api;


public final class JSONStoreInitOptions
{

    private boolean clear;
    private boolean enableAnalytics;
    private String password;
    private String secureRandom;
    private String username;

    public JSONStoreInitOptions()
    {
        clear = false;
        enableAnalytics = false;
        setUsername(null);
        setPassword("");
        setSecureRandom(null);
    }

    public JSONStoreInitOptions(String s)
    {
        clear = false;
        enableAnalytics = false;
        setUsername(s);
        setPassword("");
        setSecureRandom(null);
    }

    public String getPassword()
    {
        return password;
    }

    public String getSecureRandom()
    {
        return secureRandom;
    }

    public String getUsername()
    {
        return username;
    }

    public boolean isAnalyticsEnabled()
    {
        return enableAnalytics;
    }

    public boolean isClear()
    {
        return clear;
    }

    public void setAnalyticsEnabled(boolean flag)
    {
        enableAnalytics = flag;
    }

    public void setClear(boolean flag)
    {
        clear = flag;
    }

    public void setPassword(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        password = s1;
    }

    public void setSecureRandom(String s)
    {
        secureRandom = s;
    }

    public void setUsername(String s)
    {
        String s1;
label0:
        {
            if (s != null)
            {
                s1 = s;
                if (!s.isEmpty())
                {
                    break label0;
                }
            }
            s1 = "jsonstore";
        }
        username = s1;
    }
}
