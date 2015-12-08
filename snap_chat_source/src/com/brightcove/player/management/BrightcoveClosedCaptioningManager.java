// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.management;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.brightcove.player.captioning.BrightcoveCaptionStyle;

public class BrightcoveClosedCaptioningManager
{

    public static final String TAG = com/brightcove/player/management/BrightcoveClosedCaptioningManager.getSimpleName();
    private static BrightcoveClosedCaptioningManager a = null;
    private final Context b;

    private BrightcoveClosedCaptioningManager(Context context)
    {
        b = context.getApplicationContext();
    }

    public static BrightcoveClosedCaptioningManager getInstance(Context context)
    {
        if (a == null)
        {
            a = new BrightcoveClosedCaptioningManager(context);
        }
        return a;
    }

    public BrightcoveCaptionStyle getStyle()
    {
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(b);
        int i = sharedpreferences.getInt("captioning_preset", 0);
        String s = sharedpreferences.getString("captioning_font_size", "1.0");
        if (i != -1)
        {
            return BrightcoveCaptionStyle.createCaptionStyleFromPreset(s, i);
        } else
        {
            return BrightcoveCaptionStyle.builder().preset(sharedpreferences.getInt("captioning_preset", -1)).fontSize(sharedpreferences.getString("captioning_font_size", "1.0")).typeface(sharedpreferences.getString("captioning_typeface", "sans-serif")).foregroundColor(sharedpreferences.getInt("captioning_foreground_color", -1)).foregroundOpacity(sharedpreferences.getInt("captioning_foreground_opacity", -1)).edgeType(sharedpreferences.getInt("captioning_edge_type", 0)).edgeColor(sharedpreferences.getInt("captioning_edge_color", 0xff000000)).backgroundColor(sharedpreferences.getInt("captioning_background_color", 0xff000000)).backgroundOpacity(sharedpreferences.getInt("captioning_background_opacity", -1)).windowColor(sharedpreferences.getInt("captioning_window_color", 0)).windowOpacity(sharedpreferences.getInt("captioning_window_opacity", 0)).build();
        }
    }

    public void setStyle(BrightcoveCaptionStyle brightcovecaptionstyle)
    {
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(b);
        if (brightcovecaptionstyle.preset() != -1)
        {
            sharedpreferences.edit().putInt("captioning_preset", brightcovecaptionstyle.preset()).apply();
            return;
        } else
        {
            sharedpreferences.edit().putString("captioning_font_size", brightcovecaptionstyle.fontSize()).putString("captioning_typeface", brightcovecaptionstyle.typeface()).putInt("captioning_foreground_color", brightcovecaptionstyle.foregroundColor()).putInt("captioning_foreground_opacity", brightcovecaptionstyle.foregroundOpacity()).putInt("captioning_edge_type", brightcovecaptionstyle.edgeType()).putInt("captioning_edge_color", brightcovecaptionstyle.edgeColor()).putInt("captioning_background_color", brightcovecaptionstyle.backgroundColor()).putInt("captioning_background_opacity", brightcovecaptionstyle.backgroundOpacity()).putInt("captioning_window_color", brightcovecaptionstyle.windowColor()).putInt("captioning_window_opacity", brightcovecaptionstyle.windowOpacity()).apply();
            return;
        }
    }

}
