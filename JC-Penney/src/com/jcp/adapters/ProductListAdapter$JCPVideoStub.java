// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import com.jcp.views.JcpBrightcoveVideoView;

public class 
{

    protected RelativeLayout loaderLayout;
    protected ProgressBar videoLoader;
    protected JcpBrightcoveVideoView videoView;

    (View view)
    {
        ButterKnife.inject(this, view);
    }
}
