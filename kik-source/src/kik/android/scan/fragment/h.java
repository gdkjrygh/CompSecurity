// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan.fragment;

import android.animation.Animator;
import android.view.View;
import com.kik.m.c;

// Referenced classes of package kik.android.scan.fragment:
//            g, ScanFragment, i

final class h extends c
{

    final g a;

    h(g g1)
    {
        a = g1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        ScanFragment.h(a.b);
        a.b._animationContainer.postDelayed(new i(this), 200L);
    }
}
