// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo.views;

import android.widget.ProgressBar;

public final class ProgressBarWrapper
{

    private final ProgressBar mDeterminate;
    private final ProgressBar mIndeterminate;
    private boolean mIsIndeterminate;

    public ProgressBarWrapper(ProgressBar progressbar, ProgressBar progressbar1, boolean flag)
    {
        mDeterminate = progressbar;
        mIndeterminate = progressbar1;
        setIndeterminate(flag);
    }

    private void setIndeterminate(boolean flag)
    {
        mIsIndeterminate = flag;
        setVisibility(mIsIndeterminate);
    }

    private void setVisibility(boolean flag)
    {
        byte byte0 = 8;
        ProgressBar progressbar = mIndeterminate;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        progressbar.setVisibility(i);
        progressbar = mDeterminate;
        if (flag)
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        progressbar.setVisibility(i);
    }

    public final void setVisibility(int i)
    {
        if (i == 4 || i == 8)
        {
            mIndeterminate.setVisibility(i);
            mDeterminate.setVisibility(i);
            return;
        } else
        {
            setVisibility(mIsIndeterminate);
            return;
        }
    }
}
