// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

// Referenced classes of package org.chromium.ui:
//            ColorSuggestion, ColorSuggestionListAdapter, OnColorChangedListener

public class ColorPickerSimple extends ListView
    implements ColorSuggestionListAdapter.OnColorSuggestionClickListener
{

    private static final int DEFAULT_COLORS[] = {
        0xffff0000, 0xff00ffff, 0xff0000ff, 0xff00ff00, -65281, -256, 0xff000000, -1
    };
    private static final int DEFAULT_COLOR_LABEL_IDS[];
    private OnColorChangedListener mOnColorChangedListener;

    public ColorPickerSimple(Context context)
    {
        super(context);
    }

    public ColorPickerSimple(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ColorPickerSimple(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void init(ColorSuggestion acolorsuggestion[], OnColorChangedListener oncolorchangedlistener)
    {
        mOnColorChangedListener = oncolorchangedlistener;
        oncolorchangedlistener = acolorsuggestion;
        if (acolorsuggestion == null)
        {
            acolorsuggestion = new ColorSuggestion[DEFAULT_COLORS.length];
            int i = 0;
            do
            {
                oncolorchangedlistener = acolorsuggestion;
                if (i >= acolorsuggestion.length)
                {
                    break;
                }
                acolorsuggestion[i] = new ColorSuggestion(DEFAULT_COLORS[i], getContext().getString(DEFAULT_COLOR_LABEL_IDS[i]));
                i++;
            } while (true);
        }
        acolorsuggestion = new ColorSuggestionListAdapter(getContext(), oncolorchangedlistener);
        acolorsuggestion.setOnColorSuggestionClickListener(this);
        setAdapter(acolorsuggestion);
    }

    public void onColorSuggestionClick(ColorSuggestion colorsuggestion)
    {
        mOnColorChangedListener.onColorChanged(colorsuggestion.mColor);
    }

    static 
    {
        DEFAULT_COLOR_LABEL_IDS = (new int[] {
            R.string.color_picker_button_red, R.string.color_picker_button_cyan, R.string.color_picker_button_blue, R.string.color_picker_button_green, R.string.color_picker_button_magenta, R.string.color_picker_button_yellow, R.string.color_picker_button_black, R.string.color_picker_button_white
        });
    }
}
