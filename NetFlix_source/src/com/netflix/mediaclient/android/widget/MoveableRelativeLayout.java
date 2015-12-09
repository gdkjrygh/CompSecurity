// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.netflix.mediaclient.Log;

public class MoveableRelativeLayout extends RelativeLayout
{

    private static final String TAG = "nf_widget";

    public MoveableRelativeLayout(Context context)
    {
        super(context);
    }

    public MoveableRelativeLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public MoveableRelativeLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public boolean addViewInLayout(View view)
    {
        android.view.ViewGroup.LayoutParams layoutparams1 = view.getLayoutParams();
        android.view.ViewGroup.LayoutParams layoutparams = layoutparams1;
        if (layoutparams1 == null)
        {
            android.view.ViewGroup.LayoutParams layoutparams2 = generateDefaultLayoutParams();
            layoutparams = layoutparams2;
            if (layoutparams2 == null)
            {
                throw new IllegalArgumentException("generateDefaultLayoutParams() cannot return null");
            }
        }
        return addViewInLayout(view, -1, layoutparams);
    }

    public boolean addViewInLayout(View view, int i, android.widget.RelativeLayout.LayoutParams layoutparams)
    {
        Log.d("nf_widget", "addViewInLayout");
        return super.addViewInLayout(view, i, layoutparams);
    }

    public boolean addViewInLayout(View view, android.widget.RelativeLayout.LayoutParams layoutparams)
    {
        return addViewInLayout(view, -1, layoutparams);
    }
}
