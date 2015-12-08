// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package com.appboy.ui.inappmessage.a:
//            f

final class h extends AnimatorListenerAdapter
{

    final android.view.ViewGroup.LayoutParams a;
    final int b;
    final f c;

    h(f f1, android.view.ViewGroup.LayoutParams layoutparams, int i)
    {
        c = f1;
        a = layoutparams;
        b = i;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        f.b(c).a();
        f.a(c).setAlpha(1.0F);
        f.a(c).setTranslationX(0.0F);
        a.height = b;
        f.a(c).setLayoutParams(a);
    }
}
