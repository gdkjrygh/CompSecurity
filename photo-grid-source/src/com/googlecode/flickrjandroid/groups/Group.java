// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.groups;

import com.googlecode.flickrjandroid.Flickr;
import com.googlecode.flickrjandroid.util.BuddyIconable;
import com.googlecode.flickrjandroid.util.UrlUtilities;
import java.io.PrintStream;
import java.io.Serializable;

// Referenced classes of package com.googlecode.flickrjandroid.groups:
//            Throttle

public class Group
    implements BuddyIconable, Serializable
{

    public static final long serialVersionUID = 12L;
    private boolean admin;
    private String chatId;
    private String description;
    private boolean eighteenPlus;
    private int iconFarm;
    private int iconServer;
    private String id;
    private int inChat;
    private boolean invitationOnly;
    private String lang;
    private int members;
    private String name;
    private int online;
    private int photoCount;
    private boolean poolModerated;
    private String privacy;
    private String rules;
    private Throttle throttle;

    public Group()
    {
    }

    public String getBuddyIconUrl()
    {
        return UrlUtilities.createBuddyIconUrl(iconFarm, iconServer, id);
    }

    public String getChatId()
    {
        return chatId;
    }

    public String getDescription()
    {
        return description;
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

    public int getInChat()
    {
        return inChat;
    }

    public String getLang()
    {
        return lang;
    }

    public int getMembers()
    {
        return members;
    }

    public String getName()
    {
        return name;
    }

    public int getOnline()
    {
        return online;
    }

    public int getPhotoCount()
    {
        return photoCount;
    }

    public String getPrivacy()
    {
        return privacy;
    }

    public String getRules()
    {
        return rules;
    }

    public Throttle getThrottle()
    {
        return throttle;
    }

    public boolean isAdmin()
    {
        return admin;
    }

    public boolean isEighteenPlus()
    {
        return eighteenPlus;
    }

    public boolean isInvitationOnly()
    {
        return invitationOnly;
    }

    public boolean isPoolModerated()
    {
        return poolModerated;
    }

    public void setAdmin(boolean flag)
    {
        admin = flag;
    }

    public void setChatId(String s)
    {
        chatId = s;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setEighteenPlus(boolean flag)
    {
        eighteenPlus = flag;
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

    public void setInChat(int i)
    {
        inChat = i;
    }

    public void setInChat(String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        setInChat(Integer.parseInt(s));
_L1:
        return;
        s;
        setInChat(0);
        if (Flickr.tracing)
        {
            System.out.println("trace: Group.setInChat(String) encountered a number format exception.  InChat set to 0");
            return;
        }
          goto _L1
    }

    public void setInvitationOnly(boolean flag)
    {
        invitationOnly = flag;
    }

    public void setLang(String s)
    {
        lang = s;
    }

    public void setMembers(int i)
    {
        members = i;
    }

    public void setMembers(String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        setMembers(Integer.parseInt(s));
_L1:
        return;
        s;
        setMembers(0);
        if (Flickr.tracing)
        {
            System.out.println("trace: Group.setMembers(String) encountered a number format exception.  members set to 0");
            return;
        }
          goto _L1
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setOnline(int i)
    {
        online = i;
    }

    public void setOnline(String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        setOnline(Integer.parseInt(s));
_L1:
        return;
        s;
        setOnline(0);
        if (Flickr.tracing)
        {
            System.out.println("trace: Group.setOnline(String) encountered a number format exception.  online set to 0");
            return;
        }
          goto _L1
    }

    public void setPhotoCount(int i)
    {
        photoCount = i;
    }

    public void setPhotoCount(String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        setPhotoCount(Integer.parseInt(s));
_L1:
        return;
        s;
        setPhotoCount(0);
        if (Flickr.tracing)
        {
            System.out.println("trace: Group.setPhotoCount(String) encountered a number format exception.  PhotoCount set to 0");
            return;
        }
          goto _L1
    }

    public void setPoolModerated(boolean flag)
    {
        poolModerated = flag;
    }

    public void setPrivacy(String s)
    {
        privacy = s;
    }

    public void setRules(String s)
    {
        rules = s;
    }

    public void setThrottle(Throttle throttle1)
    {
        throttle = throttle1;
    }
}
