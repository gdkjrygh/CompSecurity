// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.pinterest.api.model.User;
import com.pinterest.ui.imageview.WebImageView;

public class RoundProfileImageCell extends WebImageView
{

    public RoundProfileImageCell(Context context)
    {
        this(context, null);
    }

    public RoundProfileImageCell(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public RoundProfileImageCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    public static RoundProfileImageCell from(View view, Context context)
    {
        if (view instanceof RoundProfileImageCell)
        {
            return (RoundProfileImageCell)view;
        } else
        {
            return new RoundProfileImageCell(context);
        }
    }

    private void init()
    {
        setOval(true);
        setBackgroundResource(0x7f020248);
    }

    public void setUser(User user)
    {
        loadUrl(user.getImageMediumUrl(), true);
    }
}
