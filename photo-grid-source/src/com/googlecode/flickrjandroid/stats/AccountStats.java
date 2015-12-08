// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.stats;


public class AccountStats
{

    private int collectionsViews;
    private int galleriesViews;
    private int photosViews;
    private int photostreamViews;
    private int setsViews;
    private int totalViews;

    public AccountStats()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (!(obj instanceof AccountStats))
            {
                return false;
            }
            obj = (AccountStats)obj;
            if (collectionsViews != ((AccountStats) (obj)).collectionsViews)
            {
                return false;
            }
            if (galleriesViews != ((AccountStats) (obj)).galleriesViews)
            {
                return false;
            }
            if (photosViews != ((AccountStats) (obj)).photosViews)
            {
                return false;
            }
            if (photostreamViews != ((AccountStats) (obj)).photostreamViews)
            {
                return false;
            }
            if (setsViews != ((AccountStats) (obj)).setsViews)
            {
                return false;
            }
            if (totalViews != ((AccountStats) (obj)).totalViews)
            {
                return false;
            }
        }
        return true;
    }

    public int getCollectionsViews()
    {
        return collectionsViews;
    }

    public int getGalleriesViews()
    {
        return galleriesViews;
    }

    public int getPhotosViews()
    {
        return photosViews;
    }

    public int getPhotostreamViews()
    {
        return photostreamViews;
    }

    public int getSetsViews()
    {
        return setsViews;
    }

    public int getTotalViews()
    {
        return totalViews;
    }

    public int hashCode()
    {
        return (((((collectionsViews + 31) * 31 + galleriesViews) * 31 + photosViews) * 31 + photostreamViews) * 31 + setsViews) * 31 + totalViews;
    }

    public void setCollectionsViews(int i)
    {
        collectionsViews = i;
    }

    public void setGalleriesViews(int i)
    {
        galleriesViews = i;
    }

    public void setPhotosViews(int i)
    {
        photosViews = i;
    }

    public void setPhotostreamViews(int i)
    {
        photostreamViews = i;
    }

    public void setSetsViews(int i)
    {
        setsViews = i;
    }

    public void setTotalViews(int i)
    {
        totalViews = i;
    }

    public String toString()
    {
        return (new StringBuilder("AccountStats [totalViews=")).append(totalViews).append(", photosViews=").append(photosViews).append(", photostreamViews=").append(photostreamViews).append(", setsViews=").append(setsViews).append(", collectionsViews=").append(collectionsViews).append(", galleriesViews=").append(galleriesViews).append("]").toString();
    }
}
