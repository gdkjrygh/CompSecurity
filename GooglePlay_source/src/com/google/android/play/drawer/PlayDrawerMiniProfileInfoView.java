// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.drawer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

class PlayDrawerMiniProfileInfoView extends RelativeLayout
{

    private TextView mDisplayName;
    private ImageView mToggleAccountListButton;

    public PlayDrawerMiniProfileInfoView(Context context)
    {
        this(context, null);
    }

    public PlayDrawerMiniProfileInfoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        mDisplayName = (TextView)findViewById(0x7f0d0308);
        mToggleAccountListButton = (ImageView)findViewById(0x7f0d0309);
    }
}
