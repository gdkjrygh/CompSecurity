// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.animation.Animator;
import android.view.View;

// Referenced classes of package com.skype.android.util:
//            PropertyAnimationUtil

final class a
    implements android.animation.r
{

    final View a;
    final PropertyAnimationUtil b;

    public final void onAnimationCancel(Animator animator)
    {
    }

    public final void onAnimationEnd(Animator animator)
    {
        a.requestLayout();
    }

    public final void onAnimationRepeat(Animator animator)
    {
    }

    public final void onAnimationStart(Animator animator)
    {
    }

    (PropertyAnimationUtil propertyanimationutil, View view)
    {
        b = propertyanimationutil;
        a = view;
        super();
    }
}
