// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.captioning.preferences;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import com.brightcove.player.captioning.BrightcoveCaptionStyle;
import com.brightcove.player.captioning.BrightcoveClosedCaptioningTextView;

// Referenced classes of package com.brightcove.player.captioning.preferences:
//            ListDialogPreference

public class EdgeTypePreference extends ListDialogPreference
{

    public EdgeTypePreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.getResources();
        setValues(context.getIntArray(com.brightcove.player.R.array.captioning_edge_type_selector_values));
        setTitles(context.getStringArray(com.brightcove.player.R.array.captioning_edge_type_selector_titles));
        setDialogLayoutResource(com.brightcove.player.R.layout.grid_picker_dialog);
        setListItemLayoutResource(com.brightcove.player.R.layout.preset_picker_item);
    }

    protected final void a(View view, int i)
    {
        Object obj = (BrightcoveClosedCaptioningTextView)view.findViewById(com.brightcove.player.R.id.preview);
        ((BrightcoveClosedCaptioningTextView) (obj)).setStyle(BrightcoveCaptionStyle.updateStyleByPreferenceKey(BrightcoveCaptionStyle.updateStyleByPreferenceKey(BrightcoveCaptionStyle.updateStyleByPreferenceKey(BrightcoveCaptionStyle.createCaptionStyleFromPreset("1.0", 0), "captioning_background_color", Integer.valueOf(0)), "captioning_edge_color", Integer.valueOf(0xff000000)), "captioning_edge_type", Integer.valueOf(super.a[i])));
        ((BrightcoveClosedCaptioningTextView) (obj)).setTextSize(getContext().getResources().getDisplayMetrics().density * 32F);
        obj = a(i);
        if (obj != null)
        {
            ((TextView)view.findViewById(com.brightcove.player.R.id.summary)).setText(((CharSequence) (obj)));
        }
    }

    public boolean shouldDisableDependents()
    {
        return getValue() == 0 || super.shouldDisableDependents();
    }
}
