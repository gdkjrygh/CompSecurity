// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.stories;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.snapchat.android.fragments.stories:
//            StoriesFragment

final class a extends AnimatorListenerAdapter
{

    private StoriesFragment a;

    public final void onAnimationStart(Animator animator)
    {
        animator = a;
        boolean flag;
        if (!a.g)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        animator.g = flag;
    }

    (StoriesFragment storiesfragment)
    {
        a = storiesfragment;
        super();
    }
}
