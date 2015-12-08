// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.modifiedrefresh;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.roidapp.cloudlib.sns.modifiedrefresh:
//            SwipeRefreshLayout2, c

final class u extends Animation
{

    final int a;
    final int b;
    final SwipeRefreshLayout2 c;

    u(SwipeRefreshLayout2 swiperefreshlayout2, int i, int j)
    {
        c = swiperefreshlayout2;
        a = i;
        b = j;
        super();
    }

    public final void applyTransformation(float f, Transformation transformation)
    {
        SwipeRefreshLayout2.k(c).setAlpha((int)((float)a + (float)(b - a) * f));
    }
}
