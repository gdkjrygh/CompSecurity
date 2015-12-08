// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.animation.Animator;
import android.view.View;

// Referenced classes of package com.skype.android.util:
//            PropertyAnimationUtil

final class b
    implements android.animation.r
{

    final View a;
    final int b;
    final PropertyAnimationUtil c;

    public final void onAnimationCancel(Animator animator)
    {
    }

    public final void onAnimationEnd(Animator animator)
    {
        a.setVisibility(b);
    }

    public final void onAnimationRepeat(Animator animator)
    {
    }

    public final void onAnimationStart(Animator animator)
    {
    }

    (PropertyAnimationUtil propertyanimationutil, View view, int i)
    {
        c = propertyanimationutil;
        a = view;
        b = i;
        super();
    }
}
