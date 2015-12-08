// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.fragment;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

public class LoadingView extends FrameLayout
{

    public LoadingView(Context context)
    {
        super(context);
        init();
    }

    public LoadingView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public LoadingView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        ((Activity)getContext()).getLayoutInflater().inflate(0x7f030047, this);
    }
}
