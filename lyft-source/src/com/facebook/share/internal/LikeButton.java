// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.facebook.FacebookButtonBase;

public class LikeButton extends FacebookButtonBase
{

    public LikeButton(Context context, boolean flag)
    {
        super(context, null, 0, 0, "fb_like_button_create", "fb_like_button_did_tap");
        setSelected(flag);
    }

    private void updateForLikeStatus()
    {
        if (isSelected())
        {
            setCompoundDrawablesWithIntrinsicBounds(com.facebook.R.drawable.com_facebook_button_like_icon_selected, 0, 0, 0);
            setText(getResources().getString(com.facebook.R.string.com_facebook_like_button_liked));
            return;
        } else
        {
            setCompoundDrawablesWithIntrinsicBounds(com.facebook.R.drawable.com_facebook_button_icon, 0, 0, 0);
            setText(getResources().getString(com.facebook.R.string.com_facebook_like_button_not_liked));
            return;
        }
    }

    protected void configureButton(Context context, AttributeSet attributeset, int i, int j)
    {
        super.configureButton(context, attributeset, i, j);
        updateForLikeStatus();
    }

    protected int getDefaultRequestCode()
    {
        return 0;
    }

    protected int getDefaultStyleResource()
    {
        return com.facebook.R.style.com_facebook_button_like;
    }

    public void setSelected(boolean flag)
    {
        super.setSelected(flag);
        updateForLikeStatus();
    }
}
