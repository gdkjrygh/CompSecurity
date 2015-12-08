// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            q

class a
    implements android.view.animation.ation.AnimationListener
{

    final q a;

    public void onAnimationEnd(Animation animation)
    {
        if (animation == q.d(a))
        {
            q.b(a).setVisibility(8);
        }
        q.a(a, false);
        q.a(a, 0.0F);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        q.a(a, true);
        if (animation == q.c(a))
        {
            q.b(a).setVisibility(0);
        }
    }

    (q q1)
    {
        a = q1;
        super();
    }
}
