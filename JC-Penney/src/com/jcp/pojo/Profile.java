// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.pojo;


public class Profile
{

    private String password;
    private String username;

    public Profile(String s, String s1)
    {
        username = s;
        password = s1;
    }

    public String getPassword()
    {
        return password;
    }

    public String getUsername()
    {
        return username;
    }

    public void setPassword(String s)
    {
        password = s;
    }

    public void setUsername(String s)
    {
        username = s;
    }
}
