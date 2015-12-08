// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.view.animation.Animation;

// Referenced classes of package com.taplytics:
//            cz, cv

final class da
    implements android.view.animation.Animation.AnimationListener
{

    final cz a;

    da(cz cz1)
    {
        a = cz1;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        cv.o(a.a);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }
}
