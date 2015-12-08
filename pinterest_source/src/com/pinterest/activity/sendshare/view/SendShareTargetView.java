// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendshare.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;

public class SendShareTargetView extends LinearLayout
{

    ImageView _iconIv;
    TextView _textTv;

    public SendShareTargetView(Context context)
    {
        super(context);
        LayoutInflater.from(getContext()).inflate(0x7f0301fe, this, true);
        ButterKnife.a(this, this);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        ButterKnife.a(this);
    }
}
