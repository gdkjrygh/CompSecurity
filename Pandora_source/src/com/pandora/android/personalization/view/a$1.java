// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.personalization.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package com.pandora.android.personalization.view:
//            a

static final class it> extends AnimatorListenerAdapter
{

    final View a;

    public void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        a.setVisibility(0);
    }

    public void onAnimationStart(Animator animator)
    {
        super.onAnimationStart(animator);
        a.setVisibility(4);
    }

    (View view)
    {
        a = view;
        super();
    }
}
