// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.common.po;


public class TokenRegisrationPO
{

    private String email;
    private String fname;
    private String grant_type;
    private String lname;
    private String refresh_token;
    private String uid;
    private String walletId;

    public TokenRegisrationPO()
    {
    }

    public String getEmail()
    {
        return email;
    }

    public String getFname()
    {
        return fname;
    }

    public String getGrant_type()
    {
        return grant_type;
    }

    public String getLname()
    {
        return lname;
    }

    public String getRefresh_token()
    {
        return refresh_token;
    }

    public String getUid()
    {
        return uid;
    }

    public String getWalletId()
    {
        return walletId;
    }

    public void setEmail(String s)
    {
        email = s;
    }

    public void setFname(String s)
    {
        fname = s;
    }

    public void setGrant_type(String s)
    {
        grant_type = s;
    }

    public void setLname(String s)
    {
        lname = s;
    }

    public void setRefresh_token(String s)
    {
        refresh_token = s;
    }

    public void setUid(String s)
    {
        uid = s;
    }

    public void setWalletId(String s)
    {
        walletId = s;
    }
}
