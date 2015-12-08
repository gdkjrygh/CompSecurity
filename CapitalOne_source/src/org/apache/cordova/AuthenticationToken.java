// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;


public class AuthenticationToken
{

    private String password;
    private String userName;

    public AuthenticationToken()
    {
    }

    public String getPassword()
    {
        return password;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setPassword(String s)
    {
        password = s;
    }

    public void setUserName(String s)
    {
        userName = s;
    }
}
