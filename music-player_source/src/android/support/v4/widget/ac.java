// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package android.support.v4.widget:
//            SwipeRefreshLayout, aa

final class ac extends Animation
{

    final SwipeRefreshLayout a;

    ac(SwipeRefreshLayout swiperefreshlayout)
    {
        a = swiperefreshlayout;
        super();
    }

    public final void applyTransformation(float f, Transformation transformation)
    {
        float f1 = SwipeRefreshLayout.d(a);
        float f2 = SwipeRefreshLayout.d(a);
        SwipeRefreshLayout.e(a).a(f1 + (0.0F - f2) * f);
    }
}
