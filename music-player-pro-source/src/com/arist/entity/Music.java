// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.entity;

import java.io.Serializable;

public class Music
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String album;
    private int albumId;
    private String artist;
    private String data;
    private int duration;
    private String folderPath;
    private int id;
    private long size;
    private String title;

    public Music()
    {
    }

    public Music(int i, String s, String s1, long l, int j, String s2, 
            int k, String s3, String s4)
    {
        id = i;
        title = s;
        data = s1;
        size = l;
        duration = j;
        album = s2;
        albumId = k;
        artist = s3;
        folderPath = s4;
    }

    public String getAlbum()
    {
        return album;
    }

    public int getAlbumId()
    {
        return albumId;
    }

    public String getArtist()
    {
        return artist;
    }

    public String getData()
    {
        return data;
    }

    public int getDuration()
    {
        return duration;
    }

    public String getFolderPath()
    {
        return folderPath;
    }

    public int getId()
    {
        return id;
    }

    public long getSize()
    {
        return size;
    }

    public String getTitle()
    {
        return title;
    }

    public void setAlbum(String s)
    {
        album = s;
    }

    public void setAlbumId(int i)
    {
        albumId = i;
    }

    public void setArtist(String s)
    {
        artist = s;
    }

    public void setData(String s)
    {
        data = s;
    }

    public void setDuration(int i)
    {
        duration = i;
    }

    public void setFolderPath(String s)
    {
        folderPath = s;
    }

    public void setId(int i)
    {
        id = i;
    }

    public void setSize(long l)
    {
        size = l;
    }

    public void setTitle(String s)
    {
        title = s;
    }

    public String toString()
    {
        return (new StringBuilder("Music [id=")).append(id).append(", title=").append(title).append(", data=").append(data).append(", size=").append(size).append(", duration=").append(duration).append(", album=").append(album).append(", albumId=").append(albumId).append(", artist=").append(artist).append(", folderPath=").append(folderPath).append("]").toString();
    }
}
