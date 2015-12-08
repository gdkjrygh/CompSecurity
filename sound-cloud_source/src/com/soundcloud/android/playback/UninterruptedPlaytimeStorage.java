// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.content.SharedPreferences;
import com.soundcloud.android.events.PlayerType;

class UninterruptedPlaytimeStorage
{

    private static final String TIME_FOR_MEDIA_PLAYER = "uninterrupted_play_time_ms_media_player";
    private static final String TIME_FOR_SKIPPY = "uninterrupted_play_time_ms_skippy";
    private final SharedPreferences sharedPreferences;

    UninterruptedPlaytimeStorage(SharedPreferences sharedpreferences)
    {
        sharedPreferences = sharedpreferences;
    }

    private String getPlayerTypeKey(PlayerType playertype)
    {
        if (playertype.getValue().equals(PlayerType.MEDIA_PLAYER.getValue()))
        {
            return "uninterrupted_play_time_ms_media_player";
        } else
        {
            return "uninterrupted_play_time_ms_skippy";
        }
    }

    long getPlayTime(PlayerType playertype)
    {
        return sharedPreferences.getLong(getPlayerTypeKey(playertype), 0L);
    }

    void setPlaytime(long l, PlayerType playertype)
    {
        android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putLong(getPlayerTypeKey(playertype), l);
        editor.apply();
    }
}
