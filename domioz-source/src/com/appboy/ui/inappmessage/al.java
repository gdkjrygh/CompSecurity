// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.animation.ValueAnimator;
import android.view.View;

// Referenced classes of package com.appboy.ui.inappmessage:
//            ai

final class al
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    final android.view.ViewGroup.LayoutParams a;
    final ai b;

    al(ai ai1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        b = ai1;
        a = layoutparams;
        super();
    }

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        a.height = ((Integer)valueanimator.getAnimatedValue()).intValue();
        ai.a(b).setLayoutParams(a);
    }
}
