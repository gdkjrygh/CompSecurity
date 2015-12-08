// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.netflix.mediaclient.Log;

public class MoveableLinearLayout extends LinearLayout
{

    private static final String TAG = "nf_widget";

    public MoveableLinearLayout(Context context)
    {
        super(context);
    }

    public MoveableLinearLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public MoveableLinearLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public boolean addViewInLayout(View view)
    {
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        Object obj = layoutparams;
        if (layoutparams == null)
        {
            android.widget.LinearLayout.LayoutParams layoutparams1 = generateDefaultLayoutParams();
            obj = layoutparams1;
            if (layoutparams1 == null)
            {
                throw new IllegalArgumentException("generateDefaultLayoutParams() cannot return null");
            }
        }
        return addViewInLayout(view, -1, ((android.view.ViewGroup.LayoutParams) (obj)));
    }

    public boolean addViewInLayout(View view, int i, android.widget.LinearLayout.LayoutParams layoutparams)
    {
        Log.d("nf_widget", "addViewInLayout");
        return super.addViewInLayout(view, i, layoutparams);
    }

    public boolean addViewInLayout(View view, android.widget.LinearLayout.LayoutParams layoutparams)
    {
        return addViewInLayout(view, -1, layoutparams);
    }
}
