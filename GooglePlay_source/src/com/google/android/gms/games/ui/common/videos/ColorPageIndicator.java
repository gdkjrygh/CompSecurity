// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.videos;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ColorPageIndicator extends LinearLayout
{

    int mSelectedColorResId;
    int mSelectedPage;
    int mUnselectedColorResId;

    public ColorPageIndicator(Context context)
    {
        this(context, null, 0);
    }

    public ColorPageIndicator(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mSelectedPage = -1;
        mSelectedColorResId = 0x7f0b027a;
        mUnselectedColorResId = 0x7f0b027b;
        setGravity(16);
    }

    public ColorPageIndicator(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mSelectedPage = -1;
        mSelectedColorResId = 0x7f0b027a;
        mUnselectedColorResId = 0x7f0b027b;
        setGravity(16);
    }

    final ImageView setDotState(ImageView imageview, boolean flag)
    {
        GradientDrawable gradientdrawable = (GradientDrawable)imageview.getDrawable();
        int i;
        if (flag)
        {
            i = mSelectedColorResId;
        } else
        {
            i = mUnselectedColorResId;
        }
        gradientdrawable.setColor(getResources().getColor(i));
        return imageview;
    }

    public final void setSelectedPage(int i)
    {
        if (mSelectedPage != i)
        {
            int k = getChildCount();
            int j = 0;
            while (j < k) 
            {
                ImageView imageview = (ImageView)getChildAt(j);
                boolean flag;
                if (j == i)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                setDotState(imageview, flag);
                j++;
            }
            mSelectedPage = i;
            updateContentDescription();
        }
    }

    final void updateContentDescription()
    {
        setContentDescription(getResources().getString(0x7f10033a, new Object[] {
            Integer.valueOf(mSelectedPage + 1), Integer.valueOf(getChildCount())
        }));
    }
}
