// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class StoryReplyFitWidthImageView extends ImageView
{

    private static int a;
    private static int b;
    private View c;

    public StoryReplyFitWidthImageView(Context context)
    {
        super(context);
        a();
    }

    public StoryReplyFitWidthImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public StoryReplyFitWidthImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
    }

    private void a()
    {
        if (getResources() != null)
        {
            a = (int)getResources().getDimension(0x7f0a0065);
            b = (int)getResources().getDimension(0x7f0a0136);
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        ViewGroup viewgroup = (ViewGroup)getParent();
        if (viewgroup == null)
        {
            return;
        } else
        {
            c = viewgroup.findViewById(0x7f0d017f);
            return;
        }
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i), (b + c.getHeight()) - a);
    }
}
