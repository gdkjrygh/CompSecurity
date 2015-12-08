// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class EducationPulseGraphic extends FrameLayout
{

    private ImageView _inner;
    private ImageView _outer;

    public EducationPulseGraphic(Context context)
    {
        this(context, null);
    }

    public EducationPulseGraphic(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public EducationPulseGraphic(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        _inner = new ImageView(getContext());
        _inner.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        _inner.setImageResource(0x7f020262);
        _outer = new ImageView(getContext());
        _outer.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        _outer.setImageResource(0x7f020263);
        addView(_inner);
        addView(_outer);
    }

    public ImageView getInner()
    {
        return _inner;
    }

    public ImageView getOuter()
    {
        return _outer;
    }
}
