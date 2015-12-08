// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.personalization.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.LevelListDrawable;

// Referenced classes of package com.pandora.android.personalization.view:
//            c

class it> extends AnimatorListenerAdapter
{

    final c a;

    public void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        c.a(a).setLevel(2);
    }

    (c c1)
    {
        a = c1;
        super();
    }
}
