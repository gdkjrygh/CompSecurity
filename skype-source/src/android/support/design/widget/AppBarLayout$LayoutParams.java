// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.lang.annotation.Annotation;

// Referenced classes of package android.support.design.widget:
//            AppBarLayout

public static final class a extends android.widget.t.LayoutParams
{
    public static interface ScrollFlags
        extends Annotation
    {
    }


    int a;
    Interpolator b;

    public final void a(int i)
    {
        a = i;
    }

    public ScrollFlags()
    {
        super(-1, -2);
        a = 1;
    }

    public a(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 1;
        attributeset = context.obtainStyledAttributes(attributeset, android.support.design.ams);
        a = attributeset.getInt(android.support.design.ams_layout_scrollFlags, 0);
        if (attributeset.hasValue(android.support.design.ams_layout_scrollInterpolator))
        {
            b = AnimationUtils.loadInterpolator(context, attributeset.getResourceId(android.support.design.ams_layout_scrollInterpolator, 0));
        }
        attributeset.recycle();
    }

    public out_scrollInterpolator(android.view.out.LayoutParams layoutparams)
    {
        super(layoutparams);
        a = 1;
    }

    public a(android.view.ms ms)
    {
        super(ms);
        a = 1;
    }

    public a(android.widget.t.LayoutParams layoutparams)
    {
        super(layoutparams);
        a = 1;
    }
}
