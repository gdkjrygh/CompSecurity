// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.drawer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;

class PlayDrawerMiniAccountRow extends FrameLayout
{

    private TextView mAccountName;

    public PlayDrawerMiniAccountRow(Context context)
    {
        super(context);
    }

    public PlayDrawerMiniAccountRow(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        mAccountName = (TextView)findViewById(0x7f0d0307);
    }
}
