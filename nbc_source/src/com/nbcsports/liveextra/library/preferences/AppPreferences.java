// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.preferences;

import android.content.SharedPreferences;

public class AppPreferences
{

    private final SharedPreferences preferences;

    public AppPreferences(SharedPreferences sharedpreferences)
    {
        preferences = sharedpreferences;
    }

    public void enableClosedCaptions(boolean flag)
    {
        preferences.edit().putBoolean("ENABLE_CLOSED_CAPTIONS", flag).apply();
    }

    public boolean enableClosedCaptions()
    {
        return preferences.getBoolean("ENABLE_CLOSED_CAPTIONS", false);
    }

    public void showFullScreen(boolean flag)
    {
        preferences.edit().putBoolean("SHOW_FULL_SCREEN", flag).apply();
    }

    public boolean showFullScreen()
    {
        return preferences.getBoolean("SHOW_FULL_SCREEN", false);
    }

    public void showLiveTable(boolean flag)
    {
        preferences.edit().putBoolean("SHOW_LIVE_TABLE", flag).apply();
    }

    public boolean showLiveTable()
    {
        return preferences.getBoolean("SHOW_LIVE_TABLE", false);
    }

    public void showPLScores(boolean flag)
    {
        preferences.edit().putBoolean("ENABLE_PL_SCORES", flag).apply();
    }

    public boolean showPLScores()
    {
        return preferences.getBoolean("ENABLE_PL_SCORES", false);
    }
}
