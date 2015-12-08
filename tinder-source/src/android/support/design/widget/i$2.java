// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package android.support.design.widget:
//            i

final class Adapter extends AnimatorListenerAdapter
{

    final a a;
    final i b;

    public final void onAnimationCancel(Animator animator)
    {
        a.b();
    }

    public final void onAnimationEnd(Animator animator)
    {
        a.a();
    }

    public final void onAnimationStart(Animator animator)
    {
    }

    a(i j, a a1)
    {
        b = j;
        a = a1;
        super();
    }
}
