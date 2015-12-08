// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.animation.ValueAnimator;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            ei

final class ef
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    final ei a;
    final View b;

    ef(ei ei1, View view)
    {
        a = ei1;
        b = view;
        super();
    }

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        a.a();
    }
}
