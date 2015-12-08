// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.util;

import android.content.Context;
import android.content.SharedPreferences;

public class MainGridPreference
{

    SharedPreferences sharedPreferences;

    public MainGridPreference(Context context)
    {
        sharedPreferences = context.getSharedPreferences("main_activity_pref", 0);
    }

    public int getAdd()
    {
        return sharedPreferences.getInt("num_of_add", 0);
    }

    public int getAlbum()
    {
        return sharedPreferences.getInt("num_of_album", 0);
    }

    public int getAllMusic()
    {
        return sharedPreferences.getInt("num_of_all_music", 0);
    }

    public int getArtist()
    {
        return sharedPreferences.getInt("num_of_artist", 0);
    }

    public int getDownload()
    {
        return sharedPreferences.getInt("num_of_download", 0);
    }

    public int getFav()
    {
        return sharedPreferences.getInt("num_of_favorite", 0);
    }

    public int getFolder()
    {
        return sharedPreferences.getInt("num_of_all_folder", 0);
    }

    public void saveAdd(int i)
    {
        sharedPreferences.edit().putInt("num_of_add", i).commit();
    }

    public void saveAlbum(int i)
    {
        sharedPreferences.edit().putInt("num_of_album", i).commit();
    }

    public void saveAllMusic(int i)
    {
        sharedPreferences.edit().putInt("num_of_all_music", i).commit();
    }

    public void saveArtist(int i)
    {
        sharedPreferences.edit().putInt("num_of_artist", i).commit();
    }

    public void saveDownload(int i)
    {
        sharedPreferences.edit().putInt("num_of_download", i).commit();
    }

    public void saveFav(int i)
    {
        sharedPreferences.edit().putInt("num_of_favorite", i).commit();
    }

    public void saveFolder(int i)
    {
        sharedPreferences.edit().putInt("num_of_all_folder", i).commit();
    }
}
