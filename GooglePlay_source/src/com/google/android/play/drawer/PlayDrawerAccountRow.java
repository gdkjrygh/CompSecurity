// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.drawer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.play.image.FifeImageView;

class PlayDrawerAccountRow extends RelativeLayout
{

    private TextView mAccountName;
    private FifeImageView mAvatar;

    public PlayDrawerAccountRow(Context context)
    {
        super(context);
    }

    public PlayDrawerAccountRow(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        mAvatar = (FifeImageView)findViewById(0x7f0d0069);
        mAccountName = (TextView)findViewById(0x7f0d00ee);
    }
}
