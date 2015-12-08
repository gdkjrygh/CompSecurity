// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.modifiedrefresh;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.roidapp.cloudlib.sns.modifiedrefresh:
//            SwipeRefreshLayout2, a, c

final class j extends Animation
{

    final SwipeRefreshLayout2 a;

    j(SwipeRefreshLayout2 swiperefreshlayout2)
    {
        a = swiperefreshlayout2;
        super();
    }

    public final void applyTransformation(float f, Transformation transformation)
    {
        int i;
        int k;
        int l;
        if (!SwipeRefreshLayout2.s(a))
        {
            i = (int)(SwipeRefreshLayout2.t(a) - (float)Math.abs(a.c));
        } else
        {
            i = (int)SwipeRefreshLayout2.t(a);
        }
        k = a.a;
        i = (int)((float)(i - a.a) * f);
        l = SwipeRefreshLayout2.f(a).getTop();
        SwipeRefreshLayout2.a(a, (i + k) - l, false);
        SwipeRefreshLayout2.b(a).a(1.0F - f);
    }
}
