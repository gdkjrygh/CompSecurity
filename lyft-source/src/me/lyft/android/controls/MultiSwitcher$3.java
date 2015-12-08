// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.animation.Animator;
import me.lyft.android.common.Unit;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.controls:
//            SimpleAnimationListener, MultiSwitcher

class istener extends SimpleAnimationListener
{

    final MultiSwitcher this$0;

    public void onAnimationCancel(Animator animator)
    {
        super.onAnimationCancel(animator);
        MultiSwitcher.access$1202(MultiSwitcher.this, false);
        MultiSwitcher.access$1300(MultiSwitcher.this).onNext(Unit.create());
    }

    public void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        MultiSwitcher.access$1202(MultiSwitcher.this, false);
        MultiSwitcher.access$1300(MultiSwitcher.this).onNext(Unit.create());
        updateThumb();
    }

    istener()
    {
        this$0 = MultiSwitcher.this;
        super();
    }
}
