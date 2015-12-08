// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import com.arist.MusicPlayer.MyApplication;

public class MusicPreference
{

    SharedPreferences sharedPreferences;

    public MusicPreference(Context context)
    {
        sharedPreferences = context.getSharedPreferences("music_preference", 0);
    }

    public String getData()
    {
        return sharedPreferences.getString("data", "");
    }

    public int getHighLightColor()
    {
        return sharedPreferences.getInt("lrc_high_light_color", Color.rgb(255, 0, 0));
    }

    public int getLrcColor()
    {
        return sharedPreferences.getInt("lrc_color", Color.rgb(255, 0, 0));
    }

    public int getLrcSize()
    {
        return sharedPreferences.getInt("lrc_size", Integer.valueOf(MyApplication.context.getString(0x7f080030)).intValue());
    }

    public int getPlayMode()
    {
        return sharedPreferences.getInt("playmode", 1);
    }

    public int getPosition()
    {
        return sharedPreferences.getInt("position", 0);
    }

    public int getProgress()
    {
        return sharedPreferences.getInt("progress", 0);
    }

    public int getTagCount()
    {
        return sharedPreferences.getInt("tab_count", 10);
    }

    public int getTagPos(String as[], Context context)
    {
        int i = 0;
        do
        {
            if (i >= as.length)
            {
                return 0;
            }
            if (String.valueOf(getTagCount()).equals(as[i]))
            {
                return i;
            }
            i++;
        } while (true);
    }

    public void saveData(String s)
    {
        sharedPreferences.edit().putString("data", s).commit();
    }

    public void saveHightLightColor(int i)
    {
        sharedPreferences.edit().putInt("lrc_high_light_color", i).commit();
    }

    public void saveLrcColor(int i)
    {
        sharedPreferences.edit().putInt("lrc_color", i).commit();
    }

    public void saveLrcSize(int i)
    {
        sharedPreferences.edit().putInt("lrc_size", i).commit();
    }

    public void savePlayMode(int i)
    {
        sharedPreferences.edit().putInt("playmode", i).commit();
    }

    public void savePosition(int i)
    {
        sharedPreferences.edit().putInt("position", i).commit();
    }

    public void saveProgress(int i)
    {
        sharedPreferences.edit().putInt("progress", i).commit();
    }

    public void saveTagCount(int i)
    {
        sharedPreferences.edit().putInt("tab_count", i).commit();
    }
}
