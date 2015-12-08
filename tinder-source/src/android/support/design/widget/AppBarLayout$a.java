// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.design.widget:
//            AppBarLayout

public static final class a extends android.widget.youtParams
{

    int a;
    Interpolator b;

    public ()
    {
        super(-1, -2);
        a = 1;
    }

    public a(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 1;
        attributeset = context.obtainStyledAttributes(attributeset, android.support.design.t_LayoutParams);
        a = attributeset.getInt(android.support.design.t_LayoutParams_layout_scrollFlags, 0);
        if (attributeset.hasValue(android.support.design.t_LayoutParams_layout_scrollInterpolator))
        {
            b = AnimationUtils.loadInterpolator(context, attributeset.getResourceId(android.support.design.t_LayoutParams_layout_scrollInterpolator, 0));
        }
        attributeset.recycle();
    }

    public scrollInterpolator(android.view.tParams tparams)
    {
        super(tparams);
        a = 1;
    }

    public a(android.view.nLayoutParams nlayoutparams)
    {
        super(nlayoutparams);
        a = 1;
    }

    public a(android.widget.youtParams youtparams)
    {
        super(youtparams);
        a = 1;
    }
}
