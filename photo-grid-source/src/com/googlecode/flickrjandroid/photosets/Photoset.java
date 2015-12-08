// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.photosets;

import com.googlecode.flickrjandroid.people.User;
import com.googlecode.flickrjandroid.photos.Photo;
import com.googlecode.flickrjandroid.photos.PhotoList;
import java.io.Serializable;

public class Photoset
    implements Serializable
{

    private static final long serialVersionUID = 12L;
    private String description;
    private String farm;
    private String id;
    private User owner;
    private int photoCount;
    private PhotoList photoList;
    private Photo primaryPhoto;
    private String secret;
    private String server;
    private String title;
    private String url;

    public Photoset()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (Photoset)obj;
        if (id != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((Photoset) (obj)).id == null) goto _L1; else goto _L3
_L3:
        return false;
        if (id.equals(((Photoset) (obj)).id)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public String getDescription()
    {
        return description;
    }

    public String getFarm()
    {
        return farm;
    }

    public String getId()
    {
        return id;
    }

    public User getOwner()
    {
        return owner;
    }

    public int getPhotoCount()
    {
        return photoCount;
    }

    public PhotoList getPhotoList()
    {
        return photoList;
    }

    public Photo getPrimaryPhoto()
    {
        return primaryPhoto;
    }

    public String getSecret()
    {
        return secret;
    }

    public String getServer()
    {
        return server;
    }

    public String getTitle()
    {
        return title;
    }

    public String getUrl()
    {
        if (url == null)
        {
            StringBuffer stringbuffer = new StringBuffer();
            stringbuffer.append("https://www.flickr.com/photos/");
            stringbuffer.append(getOwner().getId());
            stringbuffer.append("/sets/");
            stringbuffer.append(getId());
            stringbuffer.append("/");
            return stringbuffer.toString();
        } else
        {
            return url;
        }
    }

    public int hashCode()
    {
        int i;
        if (id == null)
        {
            i = 0;
        } else
        {
            i = id.hashCode();
        }
        return i + 31;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setFarm(String s)
    {
        farm = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setOwner(User user)
    {
        owner = user;
    }

    public void setPhotoCount(int i)
    {
        photoCount = i;
    }

    public void setPhotoCount(String s)
    {
        if (s != null)
        {
            setPhotoCount(Integer.parseInt(s));
        }
    }

    public void setPhotoList(PhotoList photolist)
    {
        photoList = photolist;
    }

    public void setPrimaryPhoto(Photo photo)
    {
        primaryPhoto = photo;
    }

    public void setSecret(String s)
    {
        secret = s;
    }

    public void setServer(String s)
    {
        server = s;
    }

    public void setTitle(String s)
    {
        title = s;
    }

    public void setUrl(String s)
    {
        url = s;
    }
}
