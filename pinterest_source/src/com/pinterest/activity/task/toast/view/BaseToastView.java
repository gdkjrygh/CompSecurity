// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.toast.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.ui.imageview.WebImageView;

public class BaseToastView extends FrameLayout
{

    public Button actionBt;
    public ImageView arrow;
    public View divider;
    public LinearLayout extendedView;
    public LinearLayout lowerView;
    public WebImageView messageIc;
    public TextView subtitleTv;
    public TextView titleTv;
    public TextView topTv;

    public BaseToastView(Context context)
    {
        this(context, null);
    }

    public BaseToastView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private void init()
    {
        inflate(getContext(), 0x7f0301f8, this);
        ButterKnife.a(this);
        messageIc.setOval(true);
    }
}
