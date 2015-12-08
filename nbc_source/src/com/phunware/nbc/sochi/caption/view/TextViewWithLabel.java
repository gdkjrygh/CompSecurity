// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.caption.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TextViewWithLabel extends LinearLayout
{

    private final TextView mTextViewLabel;
    private final TextView mTextViewValue;

    public TextViewWithLabel(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setOrientation(0);
        mTextViewLabel = new TextView(context, attributeset);
        mTextViewValue = new TextView(context, attributeset);
        mTextViewValue.setTypeface(null, 0);
        Object obj = context.obtainStyledAttributes(attributeset, air.com.nbcuni.com.nbcsports.liveextra.R.styleable.TextViewWithLabel);
        context = ((TypedArray) (obj)).getText(0);
        attributeset = ((TypedArray) (obj)).getText(1);
        ((TypedArray) (obj)).recycle();
        obj = new android.widget.LinearLayout.LayoutParams(0, -2, 1.0F);
        mTextViewValue.setEllipsize(android.text.TextUtils.TruncateAt.END);
        mTextViewValue.setMaxLines(1);
        mTextViewValue.setGravity(5);
        addView(mTextViewLabel);
        addView(mTextViewValue, ((android.view.ViewGroup.LayoutParams) (obj)));
        setText(context);
        setValue(attributeset);
    }

    public String getText()
    {
        return mTextViewLabel.getText().toString();
    }

    public String getValue()
    {
        return mTextViewValue.getText().toString();
    }

    public void setText(int i)
    {
        setText(((CharSequence) (getContext().getString(i))));
    }

    public void setText(CharSequence charsequence)
    {
        mTextViewLabel.setText(charsequence);
    }

    public void setValue(int i)
    {
        setValue(((CharSequence) (getContext().getString(i))));
    }

    public void setValue(CharSequence charsequence)
    {
        mTextViewValue.setText(charsequence);
    }
}
