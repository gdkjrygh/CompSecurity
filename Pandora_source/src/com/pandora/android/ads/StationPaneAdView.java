// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.pandora.android.ads:
//            AdView

public class StationPaneAdView extends AdView
{

    public StationPaneAdView(Context context)
    {
        super(context);
    }

    private void a(View view, int i, int j)
    {
        findViewById(0x7f1000a3).setVisibility(0);
        float f = getContext().getResources().getDimensionPixelSize(0x7f090087);
        if ((float)i > f)
        {
            f /= i;
            int k = Math.round((float)j * f);
            view.setPivotX((float)i / 2.0F);
            view.setPivotY(0.0F);
            view.setScaleX(f);
            view.setScaleY(f);
            ((android.view.ViewGroup.MarginLayoutParams)getLayoutParams()).setMargins(0, 0, 0, (j - k) * -1);
            b.setBackgroundColor(0xff000000);
            return;
        } else
        {
            view.setScaleX(1.0F);
            view.setScaleY(1.0F);
            view = (android.widget.LinearLayout.LayoutParams)getLayoutParams();
            view.setMargins(0, 0, 0, 0);
            setLayoutParams(view);
            return;
        }
    }

    private void b(View view)
    {
        view.setScaleX(1.0F);
        view.setScaleY(1.0F);
    }

    protected void a(View view)
    {
        b(view);
    }

    protected void a(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        a(view, layoutparams.width, layoutparams.height);
    }

    protected void a(boolean flag)
    {
        super.a(flag);
        android.view.ViewGroup.LayoutParams layoutparams;
        for (layoutparams = getLayoutParams(); layoutparams == null || !flag;)
        {
            return;
        }

        View view = findViewById(0x7f1000a3);
        if (view.getVisibility() == 0)
        {
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            int i = layoutparams.height;
            layoutparams.height = view.getMeasuredHeight() + i;
        }
        setLayoutParams(layoutparams);
    }
}
