// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package com.appboy.ui.inappmessage:
//            ai, am

final class ak extends AnimatorListenerAdapter
{

    final android.view.ViewGroup.LayoutParams a;
    final int b;
    final ai c;

    ak(ai ai1, android.view.ViewGroup.LayoutParams layoutparams, int i)
    {
        c = ai1;
        a = layoutparams;
        b = i;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        ai.b(c).a();
        ai.a(c).setAlpha(1.0F);
        ai.a(c).setTranslationX(0.0F);
        a.height = b;
        ai.a(c).setLayoutParams(a);
    }
}
