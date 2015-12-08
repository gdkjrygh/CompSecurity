// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.stats;


public class Stats
{

    private int comments;
    private int favorites;
    private int views;

    public Stats()
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
            if (!(obj instanceof Stats))
            {
                return false;
            }
            obj = (Stats)obj;
            if (comments != ((Stats) (obj)).comments)
            {
                return false;
            }
            if (favorites != ((Stats) (obj)).favorites)
            {
                return false;
            }
            if (views != ((Stats) (obj)).views)
            {
                return false;
            }
        }
        return true;
    }

    public int getComments()
    {
        return comments;
    }

    public int getFavorites()
    {
        return favorites;
    }

    public int getViews()
    {
        return views;
    }

    public int hashCode()
    {
        return ((comments + 31) * 31 + favorites) * 31 + views;
    }

    public void setComments(int i)
    {
        comments = i;
    }

    public void setFavorites(int i)
    {
        favorites = i;
    }

    public void setViews(int i)
    {
        views = i;
    }

    public String toString()
    {
        return (new StringBuilder("Stats [comments=")).append(comments).append(", views=").append(views).append(", favorites=").append(favorites).append("]").toString();
    }
}
