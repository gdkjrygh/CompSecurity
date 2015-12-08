// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

// Referenced classes of package com.google.android.apps.translate.widget:
//            v

public class HiddenSlideView extends FrameLayout
{

    private boolean a;

    public HiddenSlideView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = false;
    }

    public final void a(boolean flag)
    {
        if (a == flag)
        {
            return;
        } else
        {
            a = flag;
            v v1 = new v(this, flag);
            v1.setDuration(100L);
            setDrawingCacheEnabled(true);
            buildDrawingCache();
            startAnimation(v1);
            return;
        }
    }

    protected void measureChild(View view, int i, int j)
    {
        view.measure(getChildMeasureSpec(i, 0, view.getLayoutParams().width), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    protected void measureChildWithMargins(View view, int i, int j, int k, int l)
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        i = getChildMeasureSpec(i, marginlayoutparams.leftMargin + marginlayoutparams.rightMargin + j, marginlayoutparams.width);
        j = marginlayoutparams.topMargin;
        view.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(marginlayoutparams.bottomMargin + j, 0));
    }
}
