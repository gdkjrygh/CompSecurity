// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins.Components;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class QuickButton extends LinearLayout
{

    public static final int BOLD = 1;
    public static final int BOLD_ITALIC = 3;
    public static final int ITALIC = 2;
    public static final int NORMAL = 0;
    public static final String TAG = "QuickButton";
    private ImageView mImageView;
    private int mSrc;
    private String mText;
    private int mTextColor;
    private float mTextSize;
    private int mTextStyle;
    private TextView mTextView;

    public QuickButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        attributeset = context.getTheme().obtainStyledAttributes(attributeset, com.konylabs.capitalone.R.styleable.C1Attrs, 0, 0);
        Resources resources = getResources();
        mSrc = attributeset.getResourceId(0, 0x7f0200be);
        mText = attributeset.getString(4);
        if (mText == null)
        {
            mText = "";
        }
        mTextSize = attributeset.getDimension(1, resources.getDimension(0x7f0a0005));
        mTextStyle = attributeset.getInt(2, 1);
        mTextColor = attributeset.getColor(3, resources.getColor(0x106000b));
        attributeset.recycle();
        View.inflate(context, 0x7f03001a, this);
        return;
        context;
        attributeset.recycle();
        throw context;
    }

    public int getSrc()
    {
        return mSrc;
    }

    public String getText()
    {
        return mText;
    }

    public int getTextColor()
    {
        return mTextColor;
    }

    public float getTextSize()
    {
        return mTextSize;
    }

    public int getTextStyle()
    {
        return mTextStyle;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        mTextView = (TextView)findViewById(0x7f080084);
        setText(mText);
        setTextSize(mTextSize);
        setTextColor(mTextColor);
        setTextStyle(mTextStyle);
        mImageView = (ImageView)findViewById(0x7f080083);
        setSrc(mSrc);
    }

    public void setSrc(int i)
    {
        mSrc = i;
        mImageView.setImageResource(mSrc);
    }

    public void setText(String s)
    {
        mText = s;
        mTextView.setText(Html.fromHtml(mText));
    }

    public void setTextColor(int i)
    {
        mTextColor = i;
        mTextView.setTextColor(mTextColor);
    }

    public void setTextSize(float f)
    {
        mTextSize = f;
        mTextView.setTextSize(0, mTextSize);
    }

    public void setTextStyle(int i)
    {
        mTextStyle = i;
        mTextView.setTypeface(mTextView.getTypeface(), i);
    }
}
