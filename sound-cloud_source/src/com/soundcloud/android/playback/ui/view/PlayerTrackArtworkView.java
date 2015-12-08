// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

public class PlayerTrackArtworkView extends FrameLayout
{
    public static interface OnWidthChangedListener
    {

        public abstract void onArtworkSizeChanged();
    }


    private OnWidthChangedListener onWidthChangedListener;

    public PlayerTrackArtworkView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        LayoutInflater.from(context).inflate(0x7f030098, this);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        if (onWidthChangedListener != null)
        {
            onWidthChangedListener.onArtworkSizeChanged();
        }
    }

    public void setOnWidthChangedListener(OnWidthChangedListener onwidthchangedlistener)
    {
        onWidthChangedListener = onwidthchangedlistener;
    }
}
