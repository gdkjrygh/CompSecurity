// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package com.google.android.apps.translate.e:
//            p

final class q extends AnimatorListenerAdapter
{

    final View a;
    final int b;
    final p c;

    q(p p1, View view, int i)
    {
        c = p1;
        a = view;
        b = i;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        p.a(c, a, b);
    }
}
