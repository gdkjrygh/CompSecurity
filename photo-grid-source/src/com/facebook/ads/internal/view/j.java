// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view;

import android.content.Context;
import android.widget.RelativeLayout;

public class j extends RelativeLayout
{

    private int a;
    private int b;

    public j(Context context)
    {
        super(context);
        a = 0;
        b = 0;
    }

    protected void onMeasure(int i, int k)
    {
        super.onMeasure(i, k);
        if (b > 0 && getMeasuredWidth() > b)
        {
            setMeasuredDimension(b, getMeasuredHeight());
        } else
        if (getMeasuredWidth() < a)
        {
            setMeasuredDimension(a, getMeasuredHeight());
            return;
        }
    }

    protected void setMaxWidth(int i)
    {
        b = i;
    }

    public void setMinWidth(int i)
    {
        a = i;
    }
}
