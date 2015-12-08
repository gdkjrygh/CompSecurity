// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.photos;


// Referenced classes of package com.googlecode.flickrjandroid.photos:
//            Photo

public class PhotoContext
{

    public static final long serialVersionUID = 12L;
    private int count;
    private Photo nextPhoto;
    private Photo previousPhoto;

    public PhotoContext()
    {
    }

    public int getCount()
    {
        return count;
    }

    public Photo getNextPhoto()
    {
        return nextPhoto;
    }

    public Photo getPreviousPhoto()
    {
        return previousPhoto;
    }

    public void setCount(int i)
    {
        count = i;
    }

    public void setNextPhoto(Photo photo)
    {
        nextPhoto = photo;
    }

    public void setPreviousPhoto(Photo photo)
    {
        previousPhoto = photo;
    }
}
