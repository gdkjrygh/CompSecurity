// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package android.support.v4.app:
//            v, Fragment, s

final class u extends v
{

    final Fragment a;
    final s b;

    u(s s1, View view, Animation animation, Fragment fragment)
    {
        b = s1;
        a = fragment;
        super(view, animation);
    }

    public final void onAnimationEnd(Animation animation)
    {
        super.onAnimationEnd(animation);
        if (a.c != null)
        {
            a.c = null;
            b.a(a, a.d, 0, 0, false);
        }
    }
}
