// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.e;

import android.animation.ValueAnimator;
import android.view.View;

// Referenced classes of package com.google.android.apps.translate.e:
//            p

final class s
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    final android.view.ViewGroup.LayoutParams a;
    final View b;
    final p c;

    s(p p, android.view.ViewGroup.LayoutParams layoutparams, View view)
    {
        c = p;
        a = layoutparams;
        b = view;
        super();
    }

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        a.height = ((Integer)valueanimator.getAnimatedValue()).intValue();
        b.setLayoutParams(a);
    }
}
