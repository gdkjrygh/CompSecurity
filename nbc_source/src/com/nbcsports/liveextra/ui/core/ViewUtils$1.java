// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package com.nbcsports.liveextra.ui.core:
//            ViewUtils

static final class nit> extends AnimatorListenerAdapter
{

    final View val$view;
    final int val$visibility;

    public void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        val$view.setVisibility(val$visibility);
    }

    (View view1, int i)
    {
        val$view = view1;
        val$visibility = i;
        super();
    }
}
