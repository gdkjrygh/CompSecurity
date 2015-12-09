// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.matches;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.util.PlatformVersion;

public final class InboxNearbyPlayersView extends CardView
{

    private ImageView mIconView;
    private TextView mSubtitleView;

    public InboxNearbyPlayersView(Context context)
    {
        super(context);
    }

    public InboxNearbyPlayersView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public InboxNearbyPlayersView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected final void onFinishInflate()
    {
        super.onFinishInflate();
        mIconView = (ImageView)findViewById(0x7f0d006b);
        mSubtitleView = (TextView)findViewById(0x7f0d0074);
    }

    public final void populateViews(boolean flag, int i)
    {
        Object obj = getContext();
        if (flag)
        {
            AnimationDrawable animationdrawable = (AnimationDrawable)getResources().getDrawable(0x7f0200d0);
            if (PlatformVersion.checkVersion(16))
            {
                mIconView.setBackground(animationdrawable);
            } else
            {
                mIconView.setBackgroundDrawable(animationdrawable);
            }
            animationdrawable.start();
            if (i >= 0)
            {
                obj = ((Context) (obj)).getResources().getQuantityString(0x7f0f0006, i, new Object[] {
                    Integer.valueOf(i)
                });
            } else
            {
                obj = ((Context) (obj)).getString(0x7f100191);
            }
        } else
        {
            mIconView.setBackgroundResource(0x7f0200d2);
            obj = ((Context) (obj)).getString(0x7f100190);
        }
        mSubtitleView.setText(((CharSequence) (obj)));
    }
}
