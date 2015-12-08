// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.animation.Animator;

// Referenced classes of package com.skype.android.widget:
//            ProgressCircleView

final class a
    implements android.animation.ener
{

    final ProgressCircleView a;

    public final void onAnimationCancel(Animator animator)
    {
    }

    public final void onAnimationEnd(Animator animator)
    {
        ProgressCircleView.a(a);
    }

    public final void onAnimationRepeat(Animator animator)
    {
    }

    public final void onAnimationStart(Animator animator)
    {
    }

    (ProgressCircleView progresscircleview)
    {
        a = progresscircleview;
        super();
    }
}
