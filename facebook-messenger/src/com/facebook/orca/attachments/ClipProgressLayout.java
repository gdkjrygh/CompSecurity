// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.attachments;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.widget.f;

public class ClipProgressLayout extends f
{

    private double a;

    public ClipProgressLayout(Context context)
    {
        this(context, null);
    }

    public ClipProgressLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ClipProgressLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = 1.0D;
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        i = getPaddingLeft() + getPaddingRight();
        setMeasuredDimension(i + (int)((double)(getMeasuredWidth() - i) * a), getMeasuredHeight());
    }

    public void setProgress(double d)
    {
        a = d;
        requestLayout();
    }
}
