// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.widget.Button;

public class LikeButton extends Button
{

    private boolean isLiked;

    public LikeButton(Context context, boolean flag)
    {
        super(context);
        isLiked = flag;
        initialize();
    }

    private void initialize()
    {
        setGravity(16);
        setTextColor(getResources().getColor(com.facebook.android.R.color.com_facebook_likebutton_text_color));
        setTextSize(0, getResources().getDimension(com.facebook.android.R.dimen.com_facebook_likebutton_text_size));
        setTypeface(Typeface.DEFAULT_BOLD);
        setCompoundDrawablePadding(getResources().getDimensionPixelSize(com.facebook.android.R.dimen.com_facebook_likebutton_compound_drawable_padding));
        setPadding(getResources().getDimensionPixelSize(com.facebook.android.R.dimen.com_facebook_likebutton_padding_left), getResources().getDimensionPixelSize(com.facebook.android.R.dimen.com_facebook_likebutton_padding_top), getResources().getDimensionPixelSize(com.facebook.android.R.dimen.com_facebook_likebutton_padding_right), getResources().getDimensionPixelSize(com.facebook.android.R.dimen.com_facebook_likebutton_padding_bottom));
        updateForLikeStatus();
    }

    private void updateForLikeStatus()
    {
        if (isLiked)
        {
            setBackgroundResource(com.facebook.android.R.drawable.com_facebook_button_like_selected);
            setCompoundDrawablesWithIntrinsicBounds(com.facebook.android.R.drawable.com_facebook_button_like_icon_selected, 0, 0, 0);
            setText(getResources().getString(com.facebook.android.R.string.com_facebook_like_button_liked));
            return;
        } else
        {
            setBackgroundResource(com.facebook.android.R.drawable.com_facebook_button_like);
            setCompoundDrawablesWithIntrinsicBounds(com.facebook.android.R.drawable.com_facebook_button_like_icon, 0, 0, 0);
            setText(getResources().getString(com.facebook.android.R.string.com_facebook_like_button_not_liked));
            return;
        }
    }

    public void setLikeState(boolean flag)
    {
        if (flag != isLiked)
        {
            isLiked = flag;
            updateForLikeStatus();
        }
    }
}
