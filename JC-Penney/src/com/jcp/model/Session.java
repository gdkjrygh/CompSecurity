// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model;


public class Session
{

    private boolean guest;
    private String loginStatus;
    private boolean registered;
    private boolean rewardsEligible;
    private String userToken;

    public Session()
    {
    }

    public String getLoginStatus()
    {
        return loginStatus;
    }

    public String getUserToken()
    {
        return userToken;
    }

    public boolean isGuest()
    {
        return guest;
    }

    public boolean isRegistered()
    {
        return registered;
    }

    public boolean isRewardsEligible()
    {
        return rewardsEligible;
    }

    public void setGuest(boolean flag)
    {
        guest = flag;
    }

    public void setLoginStatus(String s)
    {
        loginStatus = s;
    }

    public void setRegistered(boolean flag)
    {
        registered = flag;
    }

    public void setRewardsEligible(boolean flag)
    {
        rewardsEligible = flag;
    }

    public void setUserToken(String s)
    {
        userToken = s;
    }
}
