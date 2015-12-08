// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


public class FriendProfile
{

    private String firstName;
    private String id;
    private String imageUrl;
    private String lastName;

    public FriendProfile()
    {
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getFullName()
    {
        return (new StringBuilder()).append(getFirstName()).append(" ").append(getLastName()).toString().trim();
    }

    public String getId()
    {
        return id;
    }

    public String getImageUrl()
    {
        return imageUrl;
    }

    public String getLastName()
    {
        return lastName;
    }
}
