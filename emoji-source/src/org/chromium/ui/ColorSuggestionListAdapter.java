// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import org.chromium.base.ApiCompatibilityUtils;

// Referenced classes of package org.chromium.ui:
//            ColorSuggestion

public class ColorSuggestionListAdapter extends BaseAdapter
    implements android.view.View.OnClickListener
{
    public static interface OnColorSuggestionClickListener
    {

        public abstract void onColorSuggestionClick(ColorSuggestion colorsuggestion);
    }


    private static final int COLORS_PER_ROW = 4;
    private Context mContext;
    private OnColorSuggestionClickListener mListener;
    private ColorSuggestion mSuggestions[];

    ColorSuggestionListAdapter(Context context, ColorSuggestion acolorsuggestion[])
    {
        mContext = context;
        mSuggestions = acolorsuggestion;
    }

    private void setUpColorButton(View view, int i)
    {
        if (i >= mSuggestions.length)
        {
            view.setTag(null);
            view.setContentDescription(null);
            view.setVisibility(4);
            return;
        }
        view.setTag(mSuggestions[i]);
        view.setVisibility(0);
        ColorSuggestion colorsuggestion = mSuggestions[i];
        ((GradientDrawable)((LayerDrawable)view.getBackground()).findDrawableByLayerId(R.id.color_button_swatch)).setColor(colorsuggestion.mColor);
        String s1 = colorsuggestion.mLabel;
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = String.format("#%06X", new Object[] {
                Integer.valueOf(0xffffff & colorsuggestion.mColor)
            });
        }
        view.setContentDescription(s);
        view.setOnClickListener(this);
    }

    public int getCount()
    {
        return ((mSuggestions.length + 4) - 1) / 4;
    }

    public Object getItem(int i)
    {
        return null;
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null || !(view instanceof LinearLayout)) goto _L2; else goto _L1
_L1:
        view = (LinearLayout)view;
_L4:
        for (int j = 0; j < 4; j++)
        {
            setUpColorButton(view.getChildAt(j), i * 4 + j);
        }

        break MISSING_BLOCK_LABEL_182;
_L2:
        viewgroup = new LinearLayout(mContext);
        viewgroup.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
        viewgroup.setOrientation(0);
        viewgroup.setBackgroundColor(-1);
        int l = mContext.getResources().getDimensionPixelOffset(R.dimen.color_button_height);
        int k = 0;
        do
        {
            view = viewgroup;
            if (k >= 4)
            {
                break;
            }
            view = new View(mContext);
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(0, l, 1.0F);
            ApiCompatibilityUtils.setMarginStart(layoutparams, -1);
            if (k == 3)
            {
                ApiCompatibilityUtils.setMarginEnd(layoutparams, -1);
            }
            view.setLayoutParams(layoutparams);
            view.setBackgroundResource(R.drawable.color_button_background);
            viewgroup.addView(view);
            k++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return view;
    }

    public void onClick(View view)
    {
        if (mListener != null)
        {
            if ((view = (ColorSuggestion)view.getTag()) != null)
            {
                mListener.onColorSuggestionClick(view);
                return;
            }
        }
    }

    public void setOnColorSuggestionClickListener(OnColorSuggestionClickListener oncolorsuggestionclicklistener)
    {
        mListener = oncolorsuggestionclicklistener;
    }
}
