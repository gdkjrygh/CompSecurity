// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class AviaryWorkspaceIndicator extends LinearLayout
{

    int a;
    int b;
    int c;
    int d;

    public AviaryWorkspaceIndicator(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = -1;
        d = -1;
        a(context, attributeset, 0);
    }

    private void a(Context context, AttributeSet attributeset, int i)
    {
        context = context.getTheme().obtainStyledAttributes(attributeset, com.aviary.android.feather.sdk.R.styleable.AviaryWorkspaceIndicator, i, 0);
        setOrientation(0);
        a = context.getResourceId(0, 0);
        context.recycle();
        if (a > 0)
        {
            context = getContext().getResources().getDrawable(a);
            c = context.getIntrinsicWidth();
            d = context.getIntrinsicHeight();
        }
    }

    void a(int i)
    {
        removeAllViews();
        if (a != 0 && i > 0)
        {
            int j = getHeight();
            if (c > 0)
            {
                float f = (float)d / (float)j;
                if (d > j)
                {
                    d = j;
                    c = (int)((float)c / f);
                }
            } else
            {
                c = -2;
                d = -1;
            }
            for (j = 0; j < i; j++)
            {
                ImageView imageview = new ImageView(getContext());
                android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(c, d);
                imageview.setImageResource(a);
                imageview.setSelected(false);
                imageview.setPadding(2, 0, 2, 0);
                imageview.setLayoutParams(layoutparams);
                addView(imageview);
            }

        }
    }

    public void a(int i, int j)
    {
        if (getChildCount() != j)
        {
            a(j);
            b = 0;
        }
        if (i >= 0 && i < getChildCount())
        {
            getChildAt(b).setSelected(false);
            getChildAt(i).setSelected(true);
            b = i;
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
    }
}
