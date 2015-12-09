// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import ok;
import pm;

// Referenced classes of package android.support.v4.widget:
//            SwipeRefreshLayout

final class a extends Animation
{

    private SwipeRefreshLayout a;

    public final void applyTransformation(float f, Transformation transformation)
    {
        SwipeRefreshLayout.d();
        int j = (int)(SwipeRefreshLayout.i(a) - (float)Math.abs(a.b));
        int i = a.a;
        j = (int)((float)(j - a.a) * f);
        int k = SwipeRefreshLayout.e(a).getTop();
        SwipeRefreshLayout.a(a, (j + i) - k, false);
        SwipeRefreshLayout.b(a).a(1.0F - f);
    }

    (SwipeRefreshLayout swiperefreshlayout)
    {
        a = swiperefreshlayout;
        super();
    }
}
