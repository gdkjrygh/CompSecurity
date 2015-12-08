// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.animation;

import java.util.ArrayList;

// Referenced classes of package com.nineoldandroids.animation:
//            AnimatorListenerAdapter, AnimatorSet, Animator

class canceled extends AnimatorListenerAdapter
{

    boolean canceled;
    final AnimatorSet this$0;
    final ArrayList val$nodesToStart;

    public void onAnimationCancel(Animator animator)
    {
        canceled = true;
    }

    public void onAnimationEnd(Animator animator)
    {
        if (!canceled)
        {
            int j = val$nodesToStart.size();
            for (int i = 0; i < j; i++)
            {
                animator = (de)val$nodesToStart.get(i);
                ((de) (animator)).animation.start();
                AnimatorSet.access$000(AnimatorSet.this).add(((de) (animator)).animation);
            }

        }
    }

    de()
    {
        this$0 = final_animatorset;
        val$nodesToStart = ArrayList.this;
        super();
        canceled = false;
    }
}
