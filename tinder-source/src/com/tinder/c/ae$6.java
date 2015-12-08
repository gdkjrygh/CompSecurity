// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.animation.Animator;
import android.view.View;

// Referenced classes of package com.tinder.c:
//            ae

final class init>
    implements android.animation.tor.AnimatorListener
{

    final ae a;

    public final void onAnimationCancel(Animator animator)
    {
    }

    public final void onAnimationEnd(Animator animator)
    {
        ae.e(a).setEnabled(true);
        ae.f(a).setEnabled(true);
    }

    public final void onAnimationRepeat(Animator animator)
    {
    }

    public final void onAnimationStart(Animator animator)
    {
    }

    Animator(ae ae1)
    {
        a = ae1;
        super();
    }
}
