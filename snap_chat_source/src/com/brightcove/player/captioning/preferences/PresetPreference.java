// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.captioning.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import com.brightcove.player.captioning.BrightcoveCaptionStyle;
import com.brightcove.player.captioning.BrightcoveClosedCaptioningTextView;

// Referenced classes of package com.brightcove.player.captioning.preferences:
//            ListDialogPreference

public class PresetPreference extends ListDialogPreference
{

    public static final float PRESET_CUSTOM = -1F;

    public PresetPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setDialogLayoutResource(com.brightcove.player.R.layout.grid_picker_dialog);
        setListItemLayoutResource(com.brightcove.player.R.layout.preset_picker_item);
    }

    protected final void a(View view, int i)
    {
        Object obj = (BrightcoveClosedCaptioningTextView)view.findViewById(com.brightcove.player.R.id.preview);
        ((BrightcoveClosedCaptioningTextView) (obj)).setStyle(getStyleForPreset(super.a[i]));
        ((BrightcoveClosedCaptioningTextView) (obj)).setTextSize(getContext().getResources().getDisplayMetrics().density * 32F);
        obj = a(i);
        if (obj != null)
        {
            ((TextView)view.findViewById(com.brightcove.player.R.id.summary)).setText(((CharSequence) (obj)));
        }
    }

    public BrightcoveCaptionStyle getStyleForPreset(int i)
    {
        if (i != -1)
        {
            return BrightcoveCaptionStyle.createCaptionStyleFromPreset(PreferenceManager.getDefaultSharedPreferences(getContext()).getString("captioning_font_size", "1.0"), i);
        } else
        {
            SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(getContext());
            return BrightcoveCaptionStyle.builder().preset(sharedpreferences.getInt("captioning_preset", -1)).fontSize(sharedpreferences.getString("captioning_font_size", "1.0")).typeface(sharedpreferences.getString("captioning_typeface", "sans-serif")).foregroundColor(sharedpreferences.getInt("captioning_foreground_color", -1)).foregroundOpacity(sharedpreferences.getInt("captioning_foreground_opacity", -1)).edgeType(sharedpreferences.getInt("captioning_edge_type", 0)).edgeColor(sharedpreferences.getInt("captioning_edge_color", 0xff000000)).backgroundColor(sharedpreferences.getInt("captioning_background_color", 0xff000000)).backgroundOpacity(sharedpreferences.getInt("captioning_background_opacity", -1)).windowColor(sharedpreferences.getInt("captioning_window_color", 0)).windowOpacity(sharedpreferences.getInt("captioning_window_opacity", 0)).build();
        }
    }

    public boolean shouldDisableDependents()
    {
        return (float)getValue() != -1F || super.shouldDisableDependents();
    }
}
