// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.photos.geo;

import java.io.Serializable;

public class GeoPermissions
    implements Serializable
{

    private static final long serialVersionUID = 12L;
    private boolean contact;
    private boolean family;
    private boolean friend;
    private boolean pub;

    public GeoPermissions()
    {
    }

    public boolean isContact()
    {
        return contact;
    }

    public boolean isFamily()
    {
        return family;
    }

    public boolean isFriend()
    {
        return friend;
    }

    public boolean isPublic()
    {
        return pub;
    }

    public void setContact(boolean flag)
    {
        contact = flag;
    }

    public void setFamily(boolean flag)
    {
        family = flag;
    }

    public void setFriend(boolean flag)
    {
        friend = flag;
    }

    public void setPublic(boolean flag)
    {
        pub = flag;
    }
}
