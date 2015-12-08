// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment.view;

import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;

public class CreateBoardListHeaderRepin extends FrameLayout
{

    private TextView _duplicate_tv;

    public CreateBoardListHeaderRepin(Context context)
    {
        this(context, null);
    }

    public CreateBoardListHeaderRepin(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private void init()
    {
        inflate(getContext(), 0x7f03014c, this);
        _duplicate_tv = (TextView)findViewById(0x7f0f034d);
        _duplicate_tv.setText(Html.fromHtml(getContext().getString(0x7f07020b)));
    }
}
