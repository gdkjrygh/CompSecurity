// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package android.support.v4.widget:
//            SwipeRefreshLayout, i

class a extends Animation
{

    final SwipeRefreshLayout a;

    public void applyTransformation(float f, Transformation transformation)
    {
        float f1 = SwipeRefreshLayout.d(a);
        float f2 = SwipeRefreshLayout.d(a);
        SwipeRefreshLayout.e(a).a(f1 + (0.0F - f2) * f);
    }

    (SwipeRefreshLayout swiperefreshlayout)
    {
        a = swiperefreshlayout;
        super();
    }
}
