// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter.activity.bugreport;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.i;
import com.facebook.widget.f.d;

public class ScreenShotSectionContainer extends RelativeLayout
{

    private View a;

    public ScreenShotSectionContainer(Context context)
    {
        super(context);
    }

    public ScreenShotSectionContainer(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ScreenShotSectionContainer(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
    }

    private void a()
    {
        setTouchDelegate(d.a(a, 8));
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = findViewById(i.screenshot_remove);
    }

    protected void onLayout(boolean flag, int j, int k, int l, int i1)
    {
        super.onLayout(flag, j, k, l, i1);
        if (flag)
        {
            a();
        }
    }
}
