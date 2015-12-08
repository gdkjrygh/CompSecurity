// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.modifiedrefresh;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.roidapp.cloudlib.sns.modifiedrefresh:
//            SwipeRefreshLayout2

final class o extends Animation
{

    final SwipeRefreshLayout2 a;

    o(SwipeRefreshLayout2 swiperefreshlayout2)
    {
        a = swiperefreshlayout2;
        super();
    }

    public final void applyTransformation(float f, Transformation transformation)
    {
        float f1 = SwipeRefreshLayout2.u(a);
        float f2 = -SwipeRefreshLayout2.u(a);
        SwipeRefreshLayout2.b(a, f1 + f2 * f);
        SwipeRefreshLayout2.d(a, f);
    }
}
