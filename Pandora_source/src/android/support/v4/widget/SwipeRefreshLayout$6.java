// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package android.support.v4.widget:
//            SwipeRefreshLayout, a, h

class a extends Animation
{

    final SwipeRefreshLayout a;

    public void applyTransformation(float f, Transformation transformation)
    {
        int i;
        int j;
        int k;
        if (!SwipeRefreshLayout.h(a))
        {
            i = (int)(SwipeRefreshLayout.i(a) - (float)Math.abs(a.b));
        } else
        {
            i = (int)SwipeRefreshLayout.i(a);
        }
        j = a.a;
        i = (int)((float)(i - a.a) * f);
        k = SwipeRefreshLayout.e(a).getTop();
        SwipeRefreshLayout.a(a, (i + j) - k, false);
        SwipeRefreshLayout.b(a).a(1.0F - f);
    }

    (SwipeRefreshLayout swiperefreshlayout)
    {
        a = swiperefreshlayout;
        super();
    }
}
