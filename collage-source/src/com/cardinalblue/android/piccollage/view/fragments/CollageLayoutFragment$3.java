// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.animation.Animator;
import android.view.View;
import com.cardinalblue.android.piccollage.a.f;
import net.a.a.a;
import net.a.a.c;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            CollageLayoutFragment

class a
    implements android.animation.r
{

    final CollageLayoutFragment a;

    public void onAnimationCancel(Animator animator)
    {
    }

    public void onAnimationEnd(Animator animator)
    {
        if (!CollageLayoutFragment.g(a))
        {
            break MISSING_BLOCK_LABEL_73;
        }
        animator = new c(a.getActivity(), CollageLayoutFragment.h(a), false);
        animator.a(new a(0, a.getString(0x7f070295), null), 0x7f030020);
        animator.b(CollageLayoutFragment.h(a).findViewById(0x7f1001cc));
        return;
        animator;
        f.a(animator);
        return;
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
    }

    (CollageLayoutFragment collagelayoutfragment)
    {
        a = collagelayoutfragment;
        super();
    }
}
