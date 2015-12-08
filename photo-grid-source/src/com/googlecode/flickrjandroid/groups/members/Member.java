// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.groups.members;


public class Member
{

    public static final String TYPE_ADMIN = "4";
    public static final String TYPE_MEMBER = "2";
    public static final String TYPE_MODERATOR = "3";
    public static final long serialVersionUID = 12L;
    private int iconFarm;
    private int iconServer;
    private String id;
    private String memberType;
    private String userName;

    public Member()
    {
        iconFarm = -1;
        iconServer = -1;
    }

    public int getIconFarm()
    {
        return iconFarm;
    }

    public int getIconServer()
    {
        return iconServer;
    }

    public String getId()
    {
        return id;
    }

    public String getMemberType()
    {
        return memberType;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setIconFarm(int i)
    {
        iconFarm = i;
    }

    public void setIconFarm(String s)
    {
        if (s != null)
        {
            setIconFarm(Integer.parseInt(s));
        }
    }

    public void setIconServer(int i)
    {
        iconServer = i;
    }

    public void setIconServer(String s)
    {
        if (s != null)
        {
            setIconServer(Integer.parseInt(s));
        }
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setMemberType(String s)
    {
        memberType = s;
    }

    public void setUserName(String s)
    {
        userName = s;
    }
}
