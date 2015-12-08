// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import butterknife.ButterKnife;

public class 
{

    protected ProgressBar mMainProgressBar;
    protected ImageView mPlayIcon;
    protected ImageView mThumbnailImageView;

    public (View view)
    {
        ButterKnife.inject(this, view);
    }
}
