// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.animation.ValueAnimator;

// Referenced classes of package com.google.android.apps.translate.widget:
//            ButteryProgressBar

final class a
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    final ButteryProgressBar a;

    a(ButteryProgressBar butteryprogressbar)
    {
        a = butteryprogressbar;
        super();
    }

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        a.invalidate();
    }
}
