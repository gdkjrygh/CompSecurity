// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.nineoldandroids.animation;

import java.util.ArrayList;

// Referenced classes of package com.actionbarsherlock.internal.nineoldandroids.animation:
//            AnimatorListenerAdapter, AnimatorSet, Animator

class canceled extends AnimatorListenerAdapter
{

    boolean canceled;
    final AnimatorSet this$0;
    private final ArrayList val$nodesToStart;

    public void onAnimationCancel(Animator animator)
    {
        canceled = true;
    }

    public void onAnimationEnd(Animator animator)
    {
        if (canceled) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = val$nodesToStart.size();
        i = 0;
_L5:
        if (i < j) goto _L3; else goto _L2
_L2:
        return;
_L3:
        animator = (de)val$nodesToStart.get(i);
        ((de) (animator)).animation.start();
        AnimatorSet.access$2(AnimatorSet.this).add(((de) (animator)).animation);
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    de()
    {
        this$0 = final_animatorset;
        val$nodesToStart = ArrayList.this;
        super();
        canceled = false;
    }
}
