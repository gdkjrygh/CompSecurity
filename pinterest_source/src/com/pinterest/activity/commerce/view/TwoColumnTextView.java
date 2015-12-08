// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.pinterest.kit.utils.FontUtils;
import com.pinterest.ui.text.PTextView;

public class TwoColumnTextView extends FrameLayout
{

    PTextView descriptionTextView;
    private int originalValueTextColor;
    PTextView valueTextView;

    public TwoColumnTextView(Context context)
    {
        super(context);
        init(context, null);
    }

    public TwoColumnTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init(context, attributeset);
    }

    public TwoColumnTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init(context, attributeset);
    }

    private void init(Context context, AttributeSet attributeset)
    {
        inflate(context, 0x7f0301ab, this);
        ButterKnife.a(this);
        initAttrs(context, attributeset);
        originalValueTextColor = valueTextView.getCurrentTextColor();
    }

    private void initAttrs(Context context, AttributeSet attributeset)
    {
        int j;
        context = context.obtainStyledAttributes(attributeset, com.pinterest.R.styleable.TwoColumnTextView, 0, 0);
        if (context.hasValue(0))
        {
            int i = context.getResourceId(0, 0);
            if (i != 0)
            {
                descriptionTextView.setText(i);
            }
        }
        j = context.getDimensionPixelSize(2, 0);
        if (j != 0)
        {
            descriptionTextView.setTextSize(0, j);
        }
        j = context.getColor(1, 0);
        if (j != 0)
        {
            descriptionTextView.setTextColor(j);
        }
        attributeset = context.getDrawable(3);
        if (attributeset != null)
        {
            descriptionTextView.setCompoundDrawablesWithIntrinsicBounds(null, null, attributeset, null);
        }
        j = context.getDimensionPixelSize(4, -1);
        if (j != -1)
        {
            descriptionTextView.setCompoundDrawablePadding(j);
        }
        j = context.getInt(5, -1);
        if (j == -1) goto _L2; else goto _L1
_L1:
        j;
        JVM INSTR tableswitch 0 0: default 152
    //                   0 345;
           goto _L2 _L3
_L2:
        j = context.getInt(6, -1);
        if (j == -1) goto _L5; else goto _L4
_L4:
        j;
        JVM INSTR tableswitch 0 0: default 184
    //                   0 358;
           goto _L5 _L6
_L5:
        int k = context.getDimensionPixelSize(8, 0);
        if (k != 0)
        {
            valueTextView.setTextSize(0, k);
        }
        k = context.getColor(7, 0);
        if (k != 0)
        {
            valueTextView.setTextColor(k);
        }
        k = context.getInt(9, -1);
        if (k != -1)
        {
            switch (k)
            {
            case 0: // '\0'
                break MISSING_BLOCK_LABEL_376;
            }
        }
_L7:
        int l = context.getResourceId(10, -1);
        if (l != -1)
        {
            valueTextView.setBackgroundResource(l);
        }
        if (context.getBoolean(11, false))
        {
            ((android.widget.FrameLayout.LayoutParams)valueTextView.getLayoutParams()).gravity = 5;
            valueTextView.setGravity(5);
        }
        l = context.getDimensionPixelSize(12, -1);
        if (l != -1)
        {
            ((android.widget.FrameLayout.LayoutParams)valueTextView.getLayoutParams()).leftMargin = l;
        }
        context.recycle();
        return;
_L3:
        FontUtils.setFont(com.pinterest.kit.utils.FontUtils.TypefaceId.BOLD, descriptionTextView);
          goto _L2
_L6:
        ((android.widget.FrameLayout.LayoutParams)descriptionTextView.getLayoutParams()).gravity = 80;
          goto _L5
        FontUtils.setFont(com.pinterest.kit.utils.FontUtils.TypefaceId.BOLD, valueTextView);
          goto _L7
    }

    public void setValue(SpannableStringBuilder spannablestringbuilder)
    {
        valueTextView.setText(spannablestringbuilder);
        valueTextView.setTextColor(originalValueTextColor);
    }

    public void setValue(CharSequence charsequence)
    {
        valueTextView.setText(charsequence);
        valueTextView.setTextColor(originalValueTextColor);
    }

    public void setValue(String s)
    {
        valueTextView.setText(s);
        valueTextView.setTextColor(originalValueTextColor);
    }

    public void setValueAndColor(String s, int i)
    {
        valueTextView.setText(s);
        valueTextView.setTextColor(i);
    }
}
