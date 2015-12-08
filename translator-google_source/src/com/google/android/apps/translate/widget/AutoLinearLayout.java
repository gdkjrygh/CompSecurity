// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class AutoLinearLayout extends LinearLayout
{

    public AutoLinearLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setOrientation(a(context.getResources().getConfiguration()));
    }

    private static int a(Configuration configuration)
    {
        return configuration.orientation != 2 ? 1 : 0;
    }

    private static void a(View view, int i)
    {
label0:
        {
            view = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
            if (((android.widget.LinearLayout.LayoutParams) (view)).weight == 1.0F || ((android.widget.LinearLayout.LayoutParams) (view)).width == -1)
            {
                view.height = -2;
                if (i != 0)
                {
                    break label0;
                }
                view.width = 0;
                view.weight = 1.0F;
            }
            return;
        }
        view.width = -1;
        view.weight = 0.0F;
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.addView(view, i, layoutparams);
        a(view, getOrientation());
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        int j = a(configuration);
        if (j != getOrientation())
        {
            requestLayout();
            setOrientation(j);
            for (int i = getChildCount() - 1; i >= 0; i--)
            {
                a(getChildAt(i), j);
            }

        }
    }
}
