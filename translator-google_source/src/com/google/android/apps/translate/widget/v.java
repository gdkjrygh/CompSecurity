// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.google.android.apps.translate.widget:
//            HiddenSlideView

final class v extends Animation
{

    final HiddenSlideView a;
    private final boolean b;
    private final View c;

    v(HiddenSlideView hiddenslideview, boolean flag)
    {
        a = hiddenslideview;
        super();
        b = flag;
        c = hiddenslideview.getChildAt(0);
        c.setDrawingCacheEnabled(true);
        c.buildDrawingCache();
    }

    protected final void applyTransformation(float f, Transformation transformation)
    {
        float f1 = f;
        if (!b)
        {
            f1 = 1.0F - f;
        }
        transformation = a.getLayoutParams();
        transformation.height = (int)((float)c.getHeight() * f1);
        a.setLayoutParams(transformation);
    }
}
