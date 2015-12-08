// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.contacts;

import com.googlecode.flickrjandroid.util.BuddyIconable;
import com.googlecode.flickrjandroid.util.UrlUtilities;

public class Contact
    implements BuddyIconable
{

    public static final long serialVersionUID = 12L;
    private boolean family;
    private boolean friend;
    private int iconFarm;
    private int iconServer;
    private String id;
    private boolean ignored;
    private String location;
    private String pathAlias;
    private String realName;
    private String username;

    public Contact()
    {
    }

    public String getBuddyIconUrl()
    {
        return UrlUtilities.createBuddyIconUrl(iconFarm, iconServer, id);
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

    public String getLocation()
    {
        return location;
    }

    public String getPathAlias()
    {
        return pathAlias;
    }

    public String getRealName()
    {
        return realName;
    }

    public String getUsername()
    {
        return username;
    }

    public boolean isFamily()
    {
        return family;
    }

    public boolean isFriend()
    {
        return friend;
    }

    public boolean isIgnored()
    {
        return ignored;
    }

    public void setFamily(boolean flag)
    {
        family = flag;
    }

    public void setFriend(boolean flag)
    {
        friend = flag;
    }

    public void setIconFarm(int i)
    {
        iconFarm = i;
    }

    public void setIconFarm(String s)
    {
        setIconFarm(Integer.parseInt(s));
    }

    public void setIconServer(int i)
    {
        iconServer = i;
    }

    public void setIconServer(String s)
    {
        setIconServer(Integer.parseInt(s));
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setIgnored(boolean flag)
    {
        ignored = flag;
    }

    public void setLocation(String s)
    {
        location = s;
    }

    public void setPathAlias(String s)
    {
        pathAlias = s;
    }

    public void setRealName(String s)
    {
        realName = s;
    }

    public void setUsername(String s)
    {
        username = s;
    }

    public String toString()
    {
        return (new StringBuilder("Contact [id=")).append(id).append(", username=").append(username).append(", realName=").append(realName).append("]").toString();
    }
}
