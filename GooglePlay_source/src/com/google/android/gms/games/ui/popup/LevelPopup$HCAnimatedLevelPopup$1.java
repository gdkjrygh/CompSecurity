// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.popup;

import android.animation.ValueAnimator;

// Referenced classes of package com.google.android.gms.games.ui.popup:
//            LevelPopup

final class val.animator
    implements Runnable
{

    final val.animator this$0;
    final ValueAnimator val$animator;

    public final void run()
    {
        val$animator.start();
    }

    ()
    {
        this$0 = final_;
        val$animator = ValueAnimator.this;
        super();
    }
}
