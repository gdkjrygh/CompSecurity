// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import java.util.HashMap;
import java.util.Map;

public class WLPushOptions
{

    private boolean alert;
    private boolean badge;
    private Map parameters;
    private boolean sound;

    public WLPushOptions()
    {
        alert = true;
        sound = true;
        badge = true;
        parameters = new HashMap();
    }

    public void addSubscriptionParameter(String s, String s1)
    {
        parameters.put(s, s1);
    }

    public void addSubscriptionParameters(Map map)
    {
        parameters.putAll(map);
    }

    public String getSubscriptionParameter(String s)
    {
        if (parameters != null)
        {
            return (String)parameters.get(s);
        } else
        {
            return "";
        }
    }

    public Map getSubscriptionParameters()
    {
        return parameters;
    }
}
