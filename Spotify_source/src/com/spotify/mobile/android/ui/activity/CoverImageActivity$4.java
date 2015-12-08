// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.spotify.mobile.android.ui.activity:
//            CoverImageActivity

final class a extends AnimatorListenerAdapter
{

    private Runnable a;

    public final void onAnimationEnd(Animator animator)
    {
        a.run();
    }

    A(Runnable runnable)
    {
        a = runnable;
        super();
    }
}
