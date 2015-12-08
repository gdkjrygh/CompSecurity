// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.entity;


public class BaiduMp3
{

    private String album;
    private String albumPath;
    private String artist;
    private String lrc;
    private String name;
    private String url;

    public BaiduMp3()
    {
    }

    public BaiduMp3(String s, String s1, String s2, String s3, String s4, String s5)
    {
        name = s;
        artist = s1;
        url = s2;
        lrc = s3;
        album = s4;
        albumPath = s5;
    }

    public String getAlbum()
    {
        return album;
    }

    public String getAlbumPath()
    {
        return albumPath;
    }

    public String getArtist()
    {
        return artist;
    }

    public String getLrc()
    {
        return lrc;
    }

    public String getName()
    {
        return name;
    }

    public String getUrl()
    {
        return url;
    }

    public void setAlbum(String s)
    {
        album = s;
    }

    public void setAlbumPath(String s)
    {
        albumPath = s;
    }

    public void setArtist(String s)
    {
        artist = s;
    }

    public void setLrc(String s)
    {
        lrc = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setUrl(String s)
    {
        url = s;
    }

    public String toString()
    {
        return (new StringBuilder("[name:")).append(name).append(",artist:").append(artist).append(",url:").append(url).append(",lrc:").append(lrc).append(",album:").append(album).append(",albumPath:").append(albumPath).append("]").toString();
    }
}
