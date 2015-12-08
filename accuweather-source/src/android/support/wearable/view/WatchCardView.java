// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.wearable.view;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class WatchCardView extends RelativeLayout
{

    public static final String DESCRIPTION_ARGS_KEY = "description";
    public static final String HEADER_ARGS_KEY = "header";
    public static final String ICON_ARGS_KEY = "icon";
    private TextView mDescriptionView;
    private ImageView mIconView;
    private TextView mTitleView;
    private RelativeLayout mWrapperLayout;

    public WatchCardView(Context context)
    {
        super(context);
        init(context);
    }

    public WatchCardView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public WatchCardView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init(context);
    }

    private void init(Context context)
    {
        mWrapperLayout = new RelativeLayout(context);
        mWrapperLayout.setId(1);
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutparams.setMargins(25, 100, 25, 100);
        mWrapperLayout.setBackgroundColor(-1);
        addView(mWrapperLayout, layoutparams);
        setContent(context);
    }

    public void setContent(Context context)
    {
        mTitleView = new TextView(context);
        mTitleView.setId(1);
        mTitleView.setTypeface(Typeface.create("sans-serif-condensed", 1));
        mWrapperLayout.addView(mTitleView);
        mDescriptionView = new TextView(context);
        mDescriptionView.setId(mTitleView.getId() + 1);
        mTitleView.setTypeface(Typeface.create("sans-serif-condensed", 0));
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutparams.addRule(3, mTitleView.getId());
        mWrapperLayout.addView(mDescriptionView, layoutparams);
        mIconView = new ImageView(context);
        mIconView.setId(mWrapperLayout.getId() + 1);
        context = new android.widget.RelativeLayout.LayoutParams(50, 50);
        context.addRule(7, mWrapperLayout.getId());
        context.addRule(6, mWrapperLayout.getId());
        context.rightMargin = 10;
        mIconView.setTranslationY(-25F);
        addView(mIconView, context);
    }

    public void setDescription(String s)
    {
        mDescriptionView.setText(s);
    }

    public void setHeader(String s)
    {
        mTitleView.setText(s);
    }

    public void setIcon(Drawable drawable)
    {
        mIconView.setImageDrawable(drawable);
    }
}
