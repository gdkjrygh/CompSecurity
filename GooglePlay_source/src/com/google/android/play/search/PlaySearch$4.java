// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.google.android.play.search:
//            PlaySearch

final class nit> extends AnimatorListenerAdapter
{

    final PlaySearch this$0;

    public final void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        switchToMode(3);
    }

    ()
    {
        this$0 = PlaySearch.this;
        super();
    }
}
