// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.mopub.common.Preconditions;
import com.mopub.common.util.Dips;

final class aw extends ViewGroup
{

    private final ProgressBar a;
    private int b;

    aw(Context context)
    {
        super(context);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -1);
        layoutparams.gravity = 17;
        setLayoutParams(layoutparams);
        setVisibility(8);
        setBackgroundColor(0xff000000);
        getBackground().setAlpha(180);
        a = new ProgressBar(context);
        b = Dips.asIntPixels(25F, getContext());
        a.setIndeterminate(true);
        addView(a);
    }

    final boolean a(View view)
    {
        Preconditions.checkNotNull(view);
        view = view.getRootView();
        if (view != null && (view instanceof ViewGroup))
        {
            ViewGroup viewgroup = (ViewGroup)view;
            setVisibility(0);
            setMeasuredDimension(view.getWidth(), view.getHeight());
            viewgroup.addView(this);
            forceLayout();
            return true;
        } else
        {
            return false;
        }
    }

    protected final void onLayout(boolean flag, int i, int j, int k, int l)
    {
        if (flag)
        {
            i = (i + k) / 2;
            j = (j + l) / 2;
            a.layout(i - b, j - b, i + b, j + b);
        }
    }
}
