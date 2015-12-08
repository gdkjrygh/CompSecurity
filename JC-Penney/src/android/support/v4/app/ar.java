// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package android.support.v4.app:
//            as, Fragment, am

class ar extends as
{

    final Fragment a;
    final am b;

    ar(am am1, View view, Animation animation, Fragment fragment)
    {
        b = am1;
        a = fragment;
        super(view, animation);
    }

    public void onAnimationEnd(Animation animation)
    {
        super.onAnimationEnd(animation);
        if (a.l != null)
        {
            a.l = null;
            b.a(a, a.m, 0, 0, false);
        }
    }
}
