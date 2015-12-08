// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import pm;

// Referenced classes of package android.support.v4.widget:
//            SwipeRefreshLayout

final class b extends Animation
{

    private int a;
    private int b;
    private SwipeRefreshLayout c;

    public final void applyTransformation(float f, Transformation transformation)
    {
        SwipeRefreshLayout.b(c).setAlpha((int)((float)a + (float)(b - a) * f));
    }

    (SwipeRefreshLayout swiperefreshlayout, int i, int j)
    {
        c = swiperefreshlayout;
        a = i;
        b = j;
        super();
    }
}
