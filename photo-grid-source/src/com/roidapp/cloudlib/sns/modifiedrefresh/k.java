// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.modifiedrefresh;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.roidapp.cloudlib.sns.modifiedrefresh:
//            SwipeRefreshLayout2, a, c

final class k extends Animation
{

    final SwipeRefreshLayout2 a;

    k(SwipeRefreshLayout2 swiperefreshlayout2)
    {
        a = swiperefreshlayout2;
        super();
    }

    public final void applyTransformation(float f, Transformation transformation)
    {
        int i;
        int j;
        int l;
        int i1;
        if (!SwipeRefreshLayout2.s(a))
        {
            i = -(int)(SwipeRefreshLayout2.t(a) - (float)Math.abs(a.d));
        } else
        {
            i = -(int)SwipeRefreshLayout2.t(a);
        }
        j = a.b;
        i = (int)((float)(i - a.b) * f);
        l = SwipeRefreshLayout2.o(a).getTop();
        i1 = a.getHeight();
        SwipeRefreshLayout2.b(a, (i + j) - (l - i1), false);
        SwipeRefreshLayout2.k(a).a(1.0F - f);
    }
}
