// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yong.jamendo.api;

import java.io.Serializable;

public class JamendoMusic
    implements Serializable
{

    private static final long serialVersionUID = 0x7634b694e274167dL;
    private String album_image;
    private String album_name;
    private String artistName;
    private String audio_link;
    private int duration;
    private int id_music;
    private String music_name;
    private double rating;

    public JamendoMusic()
    {
        id_music = 0;
        music_name = "";
        album_name = "";
        artistName = "";
        rating = 0.0D;
        album_image = "";
        audio_link = "";
        duration = 0;
    }

    public String getAlbum_image()
    {
        return album_image;
    }

    public String getAlbum_name()
    {
        return album_name;
    }

    public String getArtistName()
    {
        return artistName;
    }

    public String getAudio_link()
    {
        return audio_link;
    }

    public int getDuration()
    {
        return duration;
    }

    public int getId_music()
    {
        return id_music;
    }

    public String getMusic_name()
    {
        return music_name;
    }

    public double getRating()
    {
        return rating;
    }

    public void setAlbum_image(String s)
    {
        album_image = s;
    }

    public void setAlbum_name(String s)
    {
        album_name = s;
    }

    public void setArtistName(String s)
    {
        artistName = s;
    }

    public void setAudio_link(String s)
    {
        audio_link = s;
    }

    public void setDuration(int i)
    {
        duration = i;
    }

    public void setId_music(int i)
    {
        id_music = i;
    }

    public void setMusic_name(String s)
    {
        music_name = s;
    }

    public void setRating(double d)
    {
        rating = d;
    }
}
